// Generated from D:\Dropbox\DTU\Programmering\3. Semester\02332 Compilerteknik\Projekt\MiniJava.g4 by ANTLR 4.1
package compiler.Frontend;
import org.antlr.v4.runtime.misc.NotNull;
import org.antlr.v4.runtime.tree.ParseTreeListener;

/**
 * This interface defines a complete listener for a parse tree produced by
 * {@link MiniJavaParser}.
 */
public interface MiniJavaListener extends ParseTreeListener {
	/**
	 * Enter a parse tree produced by {@link MiniJavaParser#methodDeclaration}.
	 * @param ctx the parse tree
	 */
	void enterMethodDeclaration(@NotNull MiniJavaParser.MethodDeclarationContext ctx);
	/**
	 * Exit a parse tree produced by {@link MiniJavaParser#methodDeclaration}.
	 * @param ctx the parse tree
	 */
	void exitMethodDeclaration(@NotNull MiniJavaParser.MethodDeclarationContext ctx);

	/**
	 * Enter a parse tree produced by {@link MiniJavaParser#statementAssign}.
	 * @param ctx the parse tree
	 */
	void enterStatementAssign(@NotNull MiniJavaParser.StatementAssignContext ctx);
	/**
	 * Exit a parse tree produced by {@link MiniJavaParser#statementAssign}.
	 * @param ctx the parse tree
	 */
	void exitStatementAssign(@NotNull MiniJavaParser.StatementAssignContext ctx);

	/**
	 * Enter a parse tree produced by {@link MiniJavaParser#mainClass}.
	 * @param ctx the parse tree
	 */
	void enterMainClass(@NotNull MiniJavaParser.MainClassContext ctx);
	/**
	 * Exit a parse tree produced by {@link MiniJavaParser#mainClass}.
	 * @param ctx the parse tree
	 */
	void exitMainClass(@NotNull MiniJavaParser.MainClassContext ctx);

	/**
	 * Enter a parse tree produced by {@link MiniJavaParser#statementReturn}.
	 * @param ctx the parse tree
	 */
	void enterStatementReturn(@NotNull MiniJavaParser.StatementReturnContext ctx);
	/**
	 * Exit a parse tree produced by {@link MiniJavaParser#statementReturn}.
	 * @param ctx the parse tree
	 */
	void exitStatementReturn(@NotNull MiniJavaParser.StatementReturnContext ctx);

	/**
	 * Enter a parse tree produced by {@link MiniJavaParser#expressionConstantFalse}.
	 * @param ctx the parse tree
	 */
	void enterExpressionConstantFalse(@NotNull MiniJavaParser.ExpressionConstantFalseContext ctx);
	/**
	 * Exit a parse tree produced by {@link MiniJavaParser#expressionConstantFalse}.
	 * @param ctx the parse tree
	 */
	void exitExpressionConstantFalse(@NotNull MiniJavaParser.ExpressionConstantFalseContext ctx);

	/**
	 * Enter a parse tree produced by {@link MiniJavaParser#expressionConstantString}.
	 * @param ctx the parse tree
	 */
	void enterExpressionConstantString(@NotNull MiniJavaParser.ExpressionConstantStringContext ctx);
	/**
	 * Exit a parse tree produced by {@link MiniJavaParser#expressionConstantString}.
	 * @param ctx the parse tree
	 */
	void exitExpressionConstantString(@NotNull MiniJavaParser.ExpressionConstantStringContext ctx);

	/**
	 * Enter a parse tree produced by {@link MiniJavaParser#statementBlock}.
	 * @param ctx the parse tree
	 */
	void enterStatementBlock(@NotNull MiniJavaParser.StatementBlockContext ctx);
	/**
	 * Exit a parse tree produced by {@link MiniJavaParser#statementBlock}.
	 * @param ctx the parse tree
	 */
	void exitStatementBlock(@NotNull MiniJavaParser.StatementBlockContext ctx);

	/**
	 * Enter a parse tree produced by {@link MiniJavaParser#statementMethodCallPnt}.
	 * @param ctx the parse tree
	 */
	void enterStatementMethodCallPnt(@NotNull MiniJavaParser.StatementMethodCallPntContext ctx);
	/**
	 * Exit a parse tree produced by {@link MiniJavaParser#statementMethodCallPnt}.
	 * @param ctx the parse tree
	 */
	void exitStatementMethodCallPnt(@NotNull MiniJavaParser.StatementMethodCallPntContext ctx);

	/**
	 * Enter a parse tree produced by {@link MiniJavaParser#program}.
	 * @param ctx the parse tree
	 */
	void enterProgram(@NotNull MiniJavaParser.ProgramContext ctx);
	/**
	 * Exit a parse tree produced by {@link MiniJavaParser#program}.
	 * @param ctx the parse tree
	 */
	void exitProgram(@NotNull MiniJavaParser.ProgramContext ctx);

	/**
	 * Enter a parse tree produced by {@link MiniJavaParser#type}.
	 * @param ctx the parse tree
	 */
	void enterType(@NotNull MiniJavaParser.TypeContext ctx);
	/**
	 * Exit a parse tree produced by {@link MiniJavaParser#type}.
	 * @param ctx the parse tree
	 */
	void exitType(@NotNull MiniJavaParser.TypeContext ctx);

	/**
	 * Enter a parse tree produced by {@link MiniJavaParser#expressionConstantInteger}.
	 * @param ctx the parse tree
	 */
	void enterExpressionConstantInteger(@NotNull MiniJavaParser.ExpressionConstantIntegerContext ctx);
	/**
	 * Exit a parse tree produced by {@link MiniJavaParser#expressionConstantInteger}.
	 * @param ctx the parse tree
	 */
	void exitExpressionConstantInteger(@NotNull MiniJavaParser.ExpressionConstantIntegerContext ctx);

	/**
	 * Enter a parse tree produced by {@link MiniJavaParser#idThis}.
	 * @param ctx the parse tree
	 */
	void enterIdThis(@NotNull MiniJavaParser.IdThisContext ctx);
	/**
	 * Exit a parse tree produced by {@link MiniJavaParser#idThis}.
	 * @param ctx the parse tree
	 */
	void exitIdThis(@NotNull MiniJavaParser.IdThisContext ctx);

	/**
	 * Enter a parse tree produced by {@link MiniJavaParser#classDeclaration}.
	 * @param ctx the parse tree
	 */
	void enterClassDeclaration(@NotNull MiniJavaParser.ClassDeclarationContext ctx);
	/**
	 * Exit a parse tree produced by {@link MiniJavaParser#classDeclaration}.
	 * @param ctx the parse tree
	 */
	void exitClassDeclaration(@NotNull MiniJavaParser.ClassDeclarationContext ctx);

	/**
	 * Enter a parse tree produced by {@link MiniJavaParser#statement}.
	 * @param ctx the parse tree
	 */
	void enterStatement(@NotNull MiniJavaParser.StatementContext ctx);
	/**
	 * Exit a parse tree produced by {@link MiniJavaParser#statement}.
	 * @param ctx the parse tree
	 */
	void exitStatement(@NotNull MiniJavaParser.StatementContext ctx);

	/**
	 * Enter a parse tree produced by {@link MiniJavaParser#expressionNewObject}.
	 * @param ctx the parse tree
	 */
	void enterExpressionNewObject(@NotNull MiniJavaParser.ExpressionNewObjectContext ctx);
	/**
	 * Exit a parse tree produced by {@link MiniJavaParser#expressionNewObject}.
	 * @param ctx the parse tree
	 */
	void exitExpressionNewObject(@NotNull MiniJavaParser.ExpressionNewObjectContext ctx);

	/**
	 * Enter a parse tree produced by {@link MiniJavaParser#block}.
	 * @param ctx the parse tree
	 */
	void enterBlock(@NotNull MiniJavaParser.BlockContext ctx);
	/**
	 * Exit a parse tree produced by {@link MiniJavaParser#block}.
	 * @param ctx the parse tree
	 */
	void exitBlock(@NotNull MiniJavaParser.BlockContext ctx);

	/**
	 * Enter a parse tree produced by {@link MiniJavaParser#id}.
	 * @param ctx the parse tree
	 */
	void enterId(@NotNull MiniJavaParser.IdContext ctx);
	/**
	 * Exit a parse tree produced by {@link MiniJavaParser#id}.
	 * @param ctx the parse tree
	 */
	void exitId(@NotNull MiniJavaParser.IdContext ctx);

	/**
	 * Enter a parse tree produced by {@link MiniJavaParser#statementMethodCall}.
	 * @param ctx the parse tree
	 */
	void enterStatementMethodCall(@NotNull MiniJavaParser.StatementMethodCallContext ctx);
	/**
	 * Exit a parse tree produced by {@link MiniJavaParser#statementMethodCall}.
	 * @param ctx the parse tree
	 */
	void exitStatementMethodCall(@NotNull MiniJavaParser.StatementMethodCallContext ctx);

	/**
	 * Enter a parse tree produced by {@link MiniJavaParser#typeVoid}.
	 * @param ctx the parse tree
	 */
	void enterTypeVoid(@NotNull MiniJavaParser.TypeVoidContext ctx);
	/**
	 * Exit a parse tree produced by {@link MiniJavaParser#typeVoid}.
	 * @param ctx the parse tree
	 */
	void exitTypeVoid(@NotNull MiniJavaParser.TypeVoidContext ctx);

	/**
	 * Enter a parse tree produced by {@link MiniJavaParser#statementArrayAsg}.
	 * @param ctx the parse tree
	 */
	void enterStatementArrayAsg(@NotNull MiniJavaParser.StatementArrayAsgContext ctx);
	/**
	 * Exit a parse tree produced by {@link MiniJavaParser#statementArrayAsg}.
	 * @param ctx the parse tree
	 */
	void exitStatementArrayAsg(@NotNull MiniJavaParser.StatementArrayAsgContext ctx);

	/**
	 * Enter a parse tree produced by {@link MiniJavaParser#level5}.
	 * @param ctx the parse tree
	 */
	void enterLevel5(@NotNull MiniJavaParser.Level5Context ctx);
	/**
	 * Exit a parse tree produced by {@link MiniJavaParser#level5}.
	 * @param ctx the parse tree
	 */
	void exitLevel5(@NotNull MiniJavaParser.Level5Context ctx);

	/**
	 * Enter a parse tree produced by {@link MiniJavaParser#level4}.
	 * @param ctx the parse tree
	 */
	void enterLevel4(@NotNull MiniJavaParser.Level4Context ctx);
	/**
	 * Exit a parse tree produced by {@link MiniJavaParser#level4}.
	 * @param ctx the parse tree
	 */
	void exitLevel4(@NotNull MiniJavaParser.Level4Context ctx);

	/**
	 * Enter a parse tree produced by {@link MiniJavaParser#identifier}.
	 * @param ctx the parse tree
	 */
	void enterIdentifier(@NotNull MiniJavaParser.IdentifierContext ctx);
	/**
	 * Exit a parse tree produced by {@link MiniJavaParser#identifier}.
	 * @param ctx the parse tree
	 */
	void exitIdentifier(@NotNull MiniJavaParser.IdentifierContext ctx);

	/**
	 * Enter a parse tree produced by {@link MiniJavaParser#idIDENT}.
	 * @param ctx the parse tree
	 */
	void enterIdIDENT(@NotNull MiniJavaParser.IdIDENTContext ctx);
	/**
	 * Exit a parse tree produced by {@link MiniJavaParser#idIDENT}.
	 * @param ctx the parse tree
	 */
	void exitIdIDENT(@NotNull MiniJavaParser.IdIDENTContext ctx);

	/**
	 * Enter a parse tree produced by {@link MiniJavaParser#expression}.
	 * @param ctx the parse tree
	 */
	void enterExpression(@NotNull MiniJavaParser.ExpressionContext ctx);
	/**
	 * Exit a parse tree produced by {@link MiniJavaParser#expression}.
	 * @param ctx the parse tree
	 */
	void exitExpression(@NotNull MiniJavaParser.ExpressionContext ctx);

	/**
	 * Enter a parse tree produced by {@link MiniJavaParser#statementIfThenElse}.
	 * @param ctx the parse tree
	 */
	void enterStatementIfThenElse(@NotNull MiniJavaParser.StatementIfThenElseContext ctx);
	/**
	 * Exit a parse tree produced by {@link MiniJavaParser#statementIfThenElse}.
	 * @param ctx the parse tree
	 */
	void exitStatementIfThenElse(@NotNull MiniJavaParser.StatementIfThenElseContext ctx);

	/**
	 * Enter a parse tree produced by {@link MiniJavaParser#expressionNegate}.
	 * @param ctx the parse tree
	 */
	void enterExpressionNegate(@NotNull MiniJavaParser.ExpressionNegateContext ctx);
	/**
	 * Exit a parse tree produced by {@link MiniJavaParser#expressionNegate}.
	 * @param ctx the parse tree
	 */
	void exitExpressionNegate(@NotNull MiniJavaParser.ExpressionNegateContext ctx);

	/**
	 * Enter a parse tree produced by {@link MiniJavaParser#varDeclaration}.
	 * @param ctx the parse tree
	 */
	void enterVarDeclaration(@NotNull MiniJavaParser.VarDeclarationContext ctx);
	/**
	 * Exit a parse tree produced by {@link MiniJavaParser#varDeclaration}.
	 * @param ctx the parse tree
	 */
	void exitVarDeclaration(@NotNull MiniJavaParser.VarDeclarationContext ctx);

	/**
	 * Enter a parse tree produced by {@link MiniJavaParser#basictype}.
	 * @param ctx the parse tree
	 */
	void enterBasictype(@NotNull MiniJavaParser.BasictypeContext ctx);
	/**
	 * Exit a parse tree produced by {@link MiniJavaParser#basictype}.
	 * @param ctx the parse tree
	 */
	void exitBasictype(@NotNull MiniJavaParser.BasictypeContext ctx);

	/**
	 * Enter a parse tree produced by {@link MiniJavaParser#expressionIdentifier}.
	 * @param ctx the parse tree
	 */
	void enterExpressionIdentifier(@NotNull MiniJavaParser.ExpressionIdentifierContext ctx);
	/**
	 * Exit a parse tree produced by {@link MiniJavaParser#expressionIdentifier}.
	 * @param ctx the parse tree
	 */
	void exitExpressionIdentifier(@NotNull MiniJavaParser.ExpressionIdentifierContext ctx);

	/**
	 * Enter a parse tree produced by {@link MiniJavaParser#statementPrintln}.
	 * @param ctx the parse tree
	 */
	void enterStatementPrintln(@NotNull MiniJavaParser.StatementPrintlnContext ctx);
	/**
	 * Exit a parse tree produced by {@link MiniJavaParser#statementPrintln}.
	 * @param ctx the parse tree
	 */
	void exitStatementPrintln(@NotNull MiniJavaParser.StatementPrintlnContext ctx);

	/**
	 * Enter a parse tree produced by {@link MiniJavaParser#arraytype}.
	 * @param ctx the parse tree
	 */
	void enterArraytype(@NotNull MiniJavaParser.ArraytypeContext ctx);
	/**
	 * Exit a parse tree produced by {@link MiniJavaParser#arraytype}.
	 * @param ctx the parse tree
	 */
	void exitArraytype(@NotNull MiniJavaParser.ArraytypeContext ctx);

	/**
	 * Enter a parse tree produced by {@link MiniJavaParser#typeInt}.
	 * @param ctx the parse tree
	 */
	void enterTypeInt(@NotNull MiniJavaParser.TypeIntContext ctx);
	/**
	 * Exit a parse tree produced by {@link MiniJavaParser#typeInt}.
	 * @param ctx the parse tree
	 */
	void exitTypeInt(@NotNull MiniJavaParser.TypeIntContext ctx);

	/**
	 * Enter a parse tree produced by {@link MiniJavaParser#expressionIdentifierArray}.
	 * @param ctx the parse tree
	 */
	void enterExpressionIdentifierArray(@NotNull MiniJavaParser.ExpressionIdentifierArrayContext ctx);
	/**
	 * Exit a parse tree produced by {@link MiniJavaParser#expressionIdentifierArray}.
	 * @param ctx the parse tree
	 */
	void exitExpressionIdentifierArray(@NotNull MiniJavaParser.ExpressionIdentifierArrayContext ctx);

	/**
	 * Enter a parse tree produced by {@link MiniJavaParser#expressionParentheses}.
	 * @param ctx the parse tree
	 */
	void enterExpressionParentheses(@NotNull MiniJavaParser.ExpressionParenthesesContext ctx);
	/**
	 * Exit a parse tree produced by {@link MiniJavaParser#expressionParentheses}.
	 * @param ctx the parse tree
	 */
	void exitExpressionParentheses(@NotNull MiniJavaParser.ExpressionParenthesesContext ctx);

	/**
	 * Enter a parse tree produced by {@link MiniJavaParser#expressionNewIntArray}.
	 * @param ctx the parse tree
	 */
	void enterExpressionNewIntArray(@NotNull MiniJavaParser.ExpressionNewIntArrayContext ctx);
	/**
	 * Exit a parse tree produced by {@link MiniJavaParser#expressionNewIntArray}.
	 * @param ctx the parse tree
	 */
	void exitExpressionNewIntArray(@NotNull MiniJavaParser.ExpressionNewIntArrayContext ctx);

	/**
	 * Enter a parse tree produced by {@link MiniJavaParser#variable}.
	 * @param ctx the parse tree
	 */
	void enterVariable(@NotNull MiniJavaParser.VariableContext ctx);
	/**
	 * Exit a parse tree produced by {@link MiniJavaParser#variable}.
	 * @param ctx the parse tree
	 */
	void exitVariable(@NotNull MiniJavaParser.VariableContext ctx);

	/**
	 * Enter a parse tree produced by {@link MiniJavaParser#typeClass}.
	 * @param ctx the parse tree
	 */
	void enterTypeClass(@NotNull MiniJavaParser.TypeClassContext ctx);
	/**
	 * Exit a parse tree produced by {@link MiniJavaParser#typeClass}.
	 * @param ctx the parse tree
	 */
	void exitTypeClass(@NotNull MiniJavaParser.TypeClassContext ctx);

	/**
	 * Enter a parse tree produced by {@link MiniJavaParser#expressionUnaryMinus}.
	 * @param ctx the parse tree
	 */
	void enterExpressionUnaryMinus(@NotNull MiniJavaParser.ExpressionUnaryMinusContext ctx);
	/**
	 * Exit a parse tree produced by {@link MiniJavaParser#expressionUnaryMinus}.
	 * @param ctx the parse tree
	 */
	void exitExpressionUnaryMinus(@NotNull MiniJavaParser.ExpressionUnaryMinusContext ctx);

	/**
	 * Enter a parse tree produced by {@link MiniJavaParser#typeBoolean}.
	 * @param ctx the parse tree
	 */
	void enterTypeBoolean(@NotNull MiniJavaParser.TypeBooleanContext ctx);
	/**
	 * Exit a parse tree produced by {@link MiniJavaParser#typeBoolean}.
	 * @param ctx the parse tree
	 */
	void exitTypeBoolean(@NotNull MiniJavaParser.TypeBooleanContext ctx);

	/**
	 * Enter a parse tree produced by {@link MiniJavaParser#level1}.
	 * @param ctx the parse tree
	 */
	void enterLevel1(@NotNull MiniJavaParser.Level1Context ctx);
	/**
	 * Exit a parse tree produced by {@link MiniJavaParser#level1}.
	 * @param ctx the parse tree
	 */
	void exitLevel1(@NotNull MiniJavaParser.Level1Context ctx);

	/**
	 * Enter a parse tree produced by {@link MiniJavaParser#statementWhile}.
	 * @param ctx the parse tree
	 */
	void enterStatementWhile(@NotNull MiniJavaParser.StatementWhileContext ctx);
	/**
	 * Exit a parse tree produced by {@link MiniJavaParser#statementWhile}.
	 * @param ctx the parse tree
	 */
	void exitStatementWhile(@NotNull MiniJavaParser.StatementWhileContext ctx);

	/**
	 * Enter a parse tree produced by {@link MiniJavaParser#level3}.
	 * @param ctx the parse tree
	 */
	void enterLevel3(@NotNull MiniJavaParser.Level3Context ctx);
	/**
	 * Exit a parse tree produced by {@link MiniJavaParser#level3}.
	 * @param ctx the parse tree
	 */
	void exitLevel3(@NotNull MiniJavaParser.Level3Context ctx);

	/**
	 * Enter a parse tree produced by {@link MiniJavaParser#expressionMethodCall}.
	 * @param ctx the parse tree
	 */
	void enterExpressionMethodCall(@NotNull MiniJavaParser.ExpressionMethodCallContext ctx);
	/**
	 * Exit a parse tree produced by {@link MiniJavaParser#expressionMethodCall}.
	 * @param ctx the parse tree
	 */
	void exitExpressionMethodCall(@NotNull MiniJavaParser.ExpressionMethodCallContext ctx);

	/**
	 * Enter a parse tree produced by {@link MiniJavaParser#procType}.
	 * @param ctx the parse tree
	 */
	void enterProcType(@NotNull MiniJavaParser.ProcTypeContext ctx);
	/**
	 * Exit a parse tree produced by {@link MiniJavaParser#procType}.
	 * @param ctx the parse tree
	 */
	void exitProcType(@NotNull MiniJavaParser.ProcTypeContext ctx);

	/**
	 * Enter a parse tree produced by {@link MiniJavaParser#level2}.
	 * @param ctx the parse tree
	 */
	void enterLevel2(@NotNull MiniJavaParser.Level2Context ctx);
	/**
	 * Exit a parse tree produced by {@link MiniJavaParser#level2}.
	 * @param ctx the parse tree
	 */
	void exitLevel2(@NotNull MiniJavaParser.Level2Context ctx);

	/**
	 * Enter a parse tree produced by {@link MiniJavaParser#expressionConstantTrue}.
	 * @param ctx the parse tree
	 */
	void enterExpressionConstantTrue(@NotNull MiniJavaParser.ExpressionConstantTrueContext ctx);
	/**
	 * Exit a parse tree produced by {@link MiniJavaParser#expressionConstantTrue}.
	 * @param ctx the parse tree
	 */
	void exitExpressionConstantTrue(@NotNull MiniJavaParser.ExpressionConstantTrueContext ctx);
}