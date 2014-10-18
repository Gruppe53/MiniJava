package compiler.IR;

import java.util.LinkedList;
import java.util.List;

import org.antlr.v4.runtime.Token;
import org.antlr.v4.runtime.tree.AbstractParseTreeVisitor;

import compiler.Frontend.*;
import compiler.Frontend.MiniJavaParser.ArraytypeContext;
import compiler.Frontend.MiniJavaParser.BasictypeContext;
import compiler.Frontend.MiniJavaParser.ExpressionContext;
import compiler.Frontend.MiniJavaParser.ExpressionIdentifierArrayContext;
import compiler.Frontend.MiniJavaParser.ExpressionIdentifierContext;
import compiler.Frontend.MiniJavaParser.ExpressionMethodCallContext;
import compiler.Frontend.MiniJavaParser.ExpressionNegateContext;
import compiler.Frontend.MiniJavaParser.ExpressionNewIntArrayContext;
import compiler.Frontend.MiniJavaParser.ExpressionNewObjectContext;
import compiler.Frontend.MiniJavaParser.StatementArrayAsgContext;
import compiler.Frontend.MiniJavaParser.StatementBlockContext;
import compiler.Frontend.MiniJavaParser.StatementIfThenElseContext;
import compiler.Frontend.MiniJavaParser.StatementMethodCallContext;
import compiler.Frontend.MiniJavaParser.StatementMethodCallPntContext;
import compiler.Frontend.MiniJavaParser.StatementWhileContext;

public class IRbuilder extends AbstractParseTreeVisitor<IR> implements MiniJavaVisitor<IR> {
	
//	program
//	  : mainClass ( classDeclaration )*
//	  ;

	 
	public MJProgram visitProgram(MiniJavaParser.ProgramContext ctx) {
		
		LinkedList<MJClass> classDeclarations = new LinkedList<MJClass>();

		classDeclarations.add(visitMainClass(ctx.mainClass()));
		
		for (MiniJavaParser.ClassDeclarationContext c : ctx.classDeclaration()) {
			classDeclarations.add(visitClassDeclaration(c));
		}
		
		return new MJProgram(classDeclarations);
	}

//	classDeclaration
//	  : 'class' className=IDENT ( 'extends' superClassName=IDENT )? 
//	    '{' ( varDeclaration 
//	        )* 
//	        ( methodDeclaration 
//	        )*
//	    '}'
//	  ;
	
	public MJClass visitClassDeclaration(MiniJavaParser.ClassDeclarationContext ctx) {
		
		String className = ctx.className.getText();
		String superClassName="Object";
		
		if (ctx.superClassName!=null) {
			superClassName = ctx.superClassName.getText();
		}
		
		LinkedList<MJVariable> variableDeclarations = new LinkedList<MJVariable>();
		for (MiniJavaParser.VarDeclarationContext c : ctx.varDeclaration()) {
			variableDeclarations.add(visitVarDeclaration(c));
		}
		
		LinkedList<MJMethod> statements = new LinkedList<MJMethod>();
		for (MiniJavaParser.MethodDeclarationContext c : ctx.methodDeclaration()) {
			statements.add(visitMethodDeclaration(c));
		}
		
		return new MJClass(className, superClassName, variableDeclarations, statements);
	}
	
//	mainClass
//	  : 'class' className=IDENT 
//	    '{' 
//	      'public' 'static' 'void' 'main' '(' 'String' '[' ']' parameterName=IDENT ')' 
//	      block
//	    '}'
//	  ;
	  
	public MJClass visitMainClass(MiniJavaParser.MainClassContext ctx) {
		
		String className = ctx.className.getText();

		boolean isPublic = true;
		boolean isStatic = true;
		
		MJType returnType = MJType.getVoidType();
		String methodName = "main";
		
		MJType parameterType = MJType.getArrayType("String");
		String parameterName = ctx.parameterName.getText();
		MJVariable parameter = new MJVariable(parameterType, parameterName);
		LinkedList<MJVariable> parameterList = new LinkedList<MJVariable>();
		parameterList.add(parameter);

		MJBlock body = visitBlock(ctx.block());
		
		MJMethod method = new MJMethod(returnType, methodName, parameterList, body, isPublic, isStatic);
				
		return new MJClass(className, method);
	}

//	block
//	  : '{' ( varDeclaration )* 
//	        ( statement )*
//	    '}'
//	  ;
	    
	public MJBlock visitBlock(MiniJavaParser.BlockContext ctx) {
		
		LinkedList<MJVariable> variableDeclarations = new LinkedList<MJVariable>();
		for (MiniJavaParser.VarDeclarationContext c : ctx.varDeclaration()) {
			variableDeclarations.add(visitVarDeclaration(c));
		}
		
		LinkedList<MJStatement> statements = new LinkedList<MJStatement>();
		for (MiniJavaParser.StatementContext c : ctx.statement()) {
			statements.add(visitStatement(c));
		}
		
		return new MJBlock(variableDeclarations, statements);
	}
	
//	varDeclaration
//	  : variable  ';'
//	  ;

	public MJVariable visitVarDeclaration(MiniJavaParser.VarDeclarationContext ctx) { return (MJVariable)visitChildren(ctx); }

//	variable : type variableName=IDENT
//			  ;

	public MJVariable visitVariable(MiniJavaParser.VariableContext ctx){
		
		MJType variableType = visitType(ctx.type());
		String variableName = ctx.IDENT().getText();
		
		return new MJVariable(variableType, variableName);
	}

//	type
//	  : typeBoolean
//	  | typeInt
//	  | typeClass
//	  ;
//
//	typeBoolean : 'boolean' ;
//	typeInt     : 'int' ;
//	typeClass   : className=IDENT;

	public MJType visitType(MiniJavaParser.TypeContext ctx) { return (MJType)visitChildren(ctx); }
	
	public MJType visitTypeBoolean(MiniJavaParser.TypeBooleanContext ctx) {
		return MJType.getBooleanType();
	}	
	
	public MJType visitTypeInt(MiniJavaParser.TypeIntContext ctx) {
		return MJType.getIntType();
	}
	
	public MJType visitTypeClass(MiniJavaParser.TypeClassContext ctx) {
		return MJType.getClassType(ctx.className.getText());
	}
	
	public MJType visitVoidType(MiniJavaParser.TypeVoidContext ctx) {
		return MJType.getVoidType();
	}


//	methodDeclaration
//	  : ( isPublic='public'  )?
//	    ( isStatic='static'  )? 
//	    procType methodName=IDENT 
//	    '(' 
//	      ( variable ( ',' variable )* )? 
//	    ')' 
//	    '{' ( varDeclaration )* 
//	        ( statement )*
//	        statementReturn
//	    '}'
//	  ;
	  
	public MJMethod visitMethodDeclaration(MiniJavaParser.MethodDeclarationContext ctx) {
		
		boolean isPublic = (ctx.isPublic != null);
		boolean isStatic = (ctx.isStatic != null);
		
		MJType returnType = visitProcType(ctx.procType());
		
		String methodName = ctx.methodName.getText();
		
		LinkedList<MJVariable> parameterList = new LinkedList<MJVariable>();
		for (MiniJavaParser.VariableContext c : ctx.variable()) {
			parameterList.add(visitVariable(c));
		}
		
		LinkedList<MJVariable> variableDeclarations = new LinkedList<MJVariable>();
		for (MiniJavaParser.VarDeclarationContext c : ctx.varDeclaration()) {
			variableDeclarations.add(visitVarDeclaration(c));
		}
		
		LinkedList<MJStatement> statements = new LinkedList<MJStatement>();
		for (MiniJavaParser.StatementContext c : ctx.statement()) {
			statements.add(visitStatement(c));
		}
		
		statements.add(visitStatementReturn(ctx.statementReturn()));
		
		MJBlock body = new MJBlock(variableDeclarations, statements);
		
		MJMethod method = new MJMethod(returnType, methodName, parameterList, body, isPublic, isStatic);
		
		return method;
	}
	
//	procType
//	  : type  
//	  | voidtype 
//	  ;
//
//	voidtype: 'void' ;
	  
	public MJType visitProcType(MiniJavaParser.ProcTypeContext ctx) { 
		List<org.antlr.v4.runtime.tree.ParseTree>x = ctx.children;
		
		return (MJType)visitChildren(ctx); 
	}
	
	public MJType visitTypeVoid(MiniJavaParser.TypeVoidContext ctx) {
		return MJType.getVoidType();
	}

	@Override
	public IR visitBasictype(BasictypeContext ctx) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public IR visitArraytype(ArraytypeContext ctx) {
		// TODO Auto-generated method stub
		return null;
	}

//	statement
//	  : statementAssign
//	  | statementPrintln
//	  ;
//	  
//	statementAssign        : lhs=id '=' rhs=expression ';' ;
//	statementPrintln       : 'System.out.println' '(' argument=expression ')' ';' ;
//	statementReturn        : 'return' ('(' argument=expression ')' )? ';' ;
//	statementBlock         : blockStatement=block;
//	statementIfThenElse    : 'if' '(' argument=expression ')' ifStatement=statement ('else' elseStatement=statement)?;
//	statementWhile         : 'while' '(' argument=expression ')' whileStatement=statement;
//	statementArrayAsg      : name=id '[' lhs=expression ']' '=' rhs=expression ';';
//	statementMethodCallPnt : 'System.out.print' '(' argument=expression ')' ';' ;
//	statementMethodCall    : (name=id '.')? methodName=IDENT '(' (headArguments+=expression(',' tailArguments+=expression)*)? ')' ';' ;
	
	public MJStatement visitStatement(MiniJavaParser.StatementContext ctx) { return (MJStatement)visitChildren(ctx); }	
	
	public MJStatement visitStatementAssign(MiniJavaParser.StatementAssignContext ctx) {
		
		MJIdentifier leftHandSide = (MJIdentifier)visitId(ctx.lhs);
		MJExpression rightHandSide = (MJExpression)visitExpression(ctx.rhs);
		
		return new MJAssign(leftHandSide, rightHandSide);
	}
	
	public MJStatement visitStatementPrintln(MiniJavaParser.StatementPrintlnContext ctx) {
		
		MJExpression argument = (MJExpression)visitExpression(ctx.argument);
		
		return new MJPrintln(argument);
	}
	
	public MJStatement visitStatementReturn(MiniJavaParser.StatementReturnContext ctx) {
		
		MJExpression argument = new MJNoExpression();
		
		if (ctx.argument!=null) {
			argument = visitExpression(ctx.argument);
		}
		
		return new MJPrintln(argument);
	}
	@Override
	public MJStatement visitStatementBlock(StatementBlockContext ctx) {
		
		
		return null;
	}

	@Override
	public MJStatement visitStatementMethodCallPnt(StatementMethodCallPntContext ctx) {
		MJExpression argument = (MJExpression) visitExpression(ctx.argument);
		return new MJPrint(argument);
	}

	@Override
	public MJStatement visitStatementMethodCall(StatementMethodCallContext ctx) {
		String name = ctx.name.getText();
		String methodName = ctx.methodName.getText();
		LinkedList<MJExpression> arguments = new LinkedList<MJExpression>();
		
		for(MiniJavaParser.ExpressionContext c : ctx.tailArguments) {
			arguments.add(visitExpression(c));
		}
		
		return new MJMethodCallStmt(name, methodName, arguments);
	}

	@Override
	public MJExpression visitStatementArrayAsg(StatementArrayAsgContext ctx) {
		MJIdentifier name = (MJIdentifier) visitId(ctx.name);
		MJExpression lhs = (MJExpression) visitExpression(ctx.lhs);
		MJExpression rhs = (MJExpression) visitExpression(ctx.rhs);
		
		return new MJArray(name, lhs, rhs);
	}

	@Override
	public MJStatement visitStatementIfThenElse(StatementIfThenElseContext ctx) {
		MJExpression argument = (MJExpression) visitExpression(ctx.argument);
		MJStatement ifStmt = (MJStatement) visitStatement(ctx.ifStatement);
		MJStatement elseStmt = (MJStatement) visitStatement(ctx.elseStatement);
		
		if(elseStmt.equals(null))
			return new MJIf(argument, ifStmt);
		
		return new MJIfElse(argument, ifStmt, elseStmt);
	}

	@Override
	public MJStatement visitStatementWhile(StatementWhileContext ctx) {
		MJExpression argument = (MJExpression) visitExpression(ctx.argument);
		MJStatement whileStmt = (MJStatement) visitStatement(ctx.whileStatement);
		
		return new MJWhile(argument, whileStmt);
	}

//	expression
//	  : head=level1 ( '&&' tail+=level1 )*
//	  ;
	
	public MJExpression visitExpression(MiniJavaParser.ExpressionContext ctx) {
		
		MJExpression root = visitLevel1(ctx.head);
		
		for (MiniJavaParser.Level1Context c : ctx.tail) {
			MJExpression newRoot = new MJAnd(root, visitLevel1(c));
			root = newRoot;
		}
		
		return root;
	}
	
//	level1
//	  : head=level2 ( '==' tail+=level2 )*
//	  ;

	public MJExpression visitLevel1(MiniJavaParser.Level1Context ctx) {
		
		MJExpression root = visitLevel2(ctx.head);
		
		for (MiniJavaParser.Level2Context c : ctx.tail) {
			MJExpression newRoot = new MJEqual(root, visitLevel2(c));
			root = newRoot;
		}
		
		return root;
	}

//	level2
//	  : head=level3 
//	  ;

	public MJExpression visitLevel2(MiniJavaParser.Level2Context ctx) {
		
		MJExpression root = visitLevel3(ctx.head);
		
		return root;
	}

//	level3
//	  : head=level4 ( '+' tail+=level4 )*
//	  ;

	public MJExpression visitLevel3(MiniJavaParser.Level3Context ctx) {
		
		MJExpression root = visitLevel4(ctx.head);
		
		for (MiniJavaParser.Level4Context c : ctx.tail) {
			MJExpression newRoot = new MJPlus(root, visitLevel4(c));
			root = newRoot;
		}
		
		return root;
	}

//	level4
//	  : head=level5
//	  ;

	public MJExpression visitLevel4(MiniJavaParser.Level4Context ctx) {
		
		MJExpression root = visitLevel5(ctx.head);
		
		return root;
	}

//	level5
//	  : expressionUnaryMinus
//	  | expressionIdentifier
//	  | expressionParentheses
//	  | expressionConstantTrue
//	  | expressionConstantFalse
//	  | expressionConstantInteger
//	  | expressionConstantString
//	  ;
//	  
//	expressionUnaryMinus      : '-' argument=level5;
//	expressionIdentifier      : name=id;
//	expressionParentheses     : '(' argument=expression ')';
//	expressionConstantTrue    : 'true';
//	expressionConstantFalse   : 'false';
//	expressionConstantInteger : value=INT;
//	expressionConstantString  : value=STRING;
//	expressionNegate          : '!' arguement=level5;
//	expressionNewIntArray     : 'new' 'int' '[' argument=expression ']';
//	expressionNewObject       : 'new' name=IDENT '('  ')'; // Optional task: expand with expressions
//	expressionIdentifierArray : name=id '[' argument=expression ']';
//	expressionMethodCall      : (name=id '.')? methodName=IDENT '(' (headArgument+=expression(',' tailArgument+=expression)*)? ')';

	public MJExpression visitLevel5(MiniJavaParser.Level5Context ctx) { return (MJExpression)visitChildren(ctx); }

	public MJExpression visitExpressionUnaryMinus(MiniJavaParser.ExpressionUnaryMinusContext ctx) { return new MJUnaryMinus(visitLevel5(ctx.argument));	}

	public MJExpression visitExpressionParentheses(MiniJavaParser.ExpressionParenthesesContext ctx) { return new MJUnaryMinus(visitExpression(ctx.argument)); }

	public MJExpression visitExpressionConstantTrue(MiniJavaParser.ExpressionConstantTrueContext ctx) { return MJBoolean.True; }

	public MJExpression visitExpressionConstantFalse(MiniJavaParser.ExpressionConstantFalseContext ctx) { return MJBoolean.False; }
	
	public MJExpression visitExpressionConstantInteger(MiniJavaParser.ExpressionConstantIntegerContext ctx) { return new MJInteger(ctx.value.getText()); }
	
	public MJExpression visitExpressionConstantString(MiniJavaParser.ExpressionConstantStringContext ctx) { return new MJString(ctx.value.getText()); }

	public MJExpression visitExpressionIdentifier(ExpressionIdentifierContext ctx) { return new MJIdentifier(ctx.name.getText()); }

	public MJExpression visitExpressionNewObject(ExpressionNewObjectContext ctx) {
		// TODO Auto-generated method stub
		return null;
	}

	public MJExpression visitExpressionNegate(ExpressionNegateContext ctx) {
		// TODO Auto-generated method stub
		return null;
	}

	public MJExpression visitExpressionIdentifierArray(
			ExpressionIdentifierArrayContext ctx) {
		// TODO Auto-generated method stub
		return null;
	}

	public MJExpression visitExpressionNewIntArray(ExpressionNewIntArrayContext ctx) {
		// TODO Auto-generated method stub
		return null;
	}

	public MJExpression visitExpressionMethodCall(ExpressionMethodCallContext ctx) {
		// TODO Auto-generated method stub
		return null;
	}
	
//	identifier
//	  : id ( '.' selectors+=IDENT )*
//	  ;
//
//	id
//	  : idThis
//	  | idIDENT
//	  ;
//
//	idThis  : 'this' ;
//	idIDENT : name=IDENT ;

	public MJIdentifier visitIdentifier(MiniJavaParser.IdentifierContext ctx) { 
		MJIdentifier id = visitId(ctx.id()); 
		
		for (Token t : ctx.selectors) {
			MJIdentifier selector = new MJIdentifier(t.getText());
			MJSelector s = new MJSelector(id, selector);
			id = s;
		}
		
		return id;
	}
	
	public MJIdentifier visitId(MiniJavaParser.IdContext ctx) { return (MJIdentifier)visitChildren(ctx); }
	
	public MJIdentifier visitIdThis(MiniJavaParser.IdThisContext ctx) { return new MJIdentifier("this"); }
	
	public MJIdentifier visitIdIDENT(MiniJavaParser.IdIDENTContext ctx) { return new MJIdentifier(ctx.name.getText()); }


}
