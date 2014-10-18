// Generated from C:\Users\Kristin\Downloads\MiniJava.g4 by ANTLR 4.1
package compiler.Frontend;
import org.antlr.v4.runtime.atn.*;
import org.antlr.v4.runtime.dfa.DFA;
import org.antlr.v4.runtime.*;
import org.antlr.v4.runtime.misc.*;
import org.antlr.v4.runtime.tree.*;
import java.util.List;
import java.util.Iterator;
import java.util.ArrayList;

@SuppressWarnings({"all", "warnings", "unchecked", "unused", "cast"})
public class MiniJavaParser extends Parser {
	protected static final DFA[] _decisionToDFA;
	protected static final PredictionContextCache _sharedContextCache =
		new PredictionContextCache();
	public static final int
		T__35=1, T__34=2, T__33=3, T__32=4, T__31=5, T__30=6, T__29=7, T__28=8, 
		T__27=9, T__26=10, T__25=11, T__24=12, T__23=13, T__22=14, T__21=15, T__20=16, 
		T__19=17, T__18=18, T__17=19, T__16=20, T__15=21, T__14=22, T__13=23, 
		T__12=24, T__11=25, T__10=26, T__9=27, T__8=28, T__7=29, T__6=30, T__5=31, 
		T__4=32, T__3=33, T__2=34, T__1=35, T__0=36, IDENT=37, INT=38, STRING=39, 
		COMMENT=40, WHITESPACE=41;
	public static final String[] tokenNames = {
		"<INVALID>", "'main'", "'new'", "'true'", "'return'", "'class'", "'while'", 
		"';'", "'void'", "'{'", "'&&'", "'='", "'}'", "'extends'", "'if'", "'int'", 
		"'('", "'System.out.print'", "'*'", "'this'", "','", "'false'", "'.'", 
		"'boolean'", "'System.out.println'", "'['", "'<'", "'=='", "'String'", 
		"']'", "'public'", "'!'", "'static'", "'else'", "')'", "'+'", "'-'", "IDENT", 
		"INT", "STRING", "COMMENT", "WHITESPACE"
	};
	public static final int
		RULE_program = 0, RULE_classDeclaration = 1, RULE_mainClass = 2, RULE_block = 3, 
		RULE_varDeclaration = 4, RULE_variable = 5, RULE_type = 6, RULE_basictype = 7, 
		RULE_arraytype = 8, RULE_typeBoolean = 9, RULE_typeInt = 10, RULE_typeClass = 11, 
		RULE_methodDeclaration = 12, RULE_procType = 13, RULE_typeVoid = 14, RULE_statement = 15, 
		RULE_statementAssign = 16, RULE_statementPrintln = 17, RULE_statementReturn = 18, 
		RULE_statementBlock = 19, RULE_statementIfThenElse = 20, RULE_statementWhile = 21, 
		RULE_statementArrayAsg = 22, RULE_statementMethodCallPnt = 23, RULE_statementMethodCall = 24, 
		RULE_expression = 25, RULE_level1 = 26, RULE_level2 = 27, RULE_level3 = 28, 
		RULE_level4 = 29, RULE_level5 = 30, RULE_expressionUnaryMinus = 31, RULE_expressionIdentifier = 32, 
		RULE_expressionParentheses = 33, RULE_expressionConstantTrue = 34, RULE_expressionConstantFalse = 35, 
		RULE_expressionConstantInteger = 36, RULE_expressionConstantString = 37, 
		RULE_expressionNegate = 38, RULE_expressionNewIntArray = 39, RULE_expressionNewObject = 40, 
		RULE_expressionIdentifierArray = 41, RULE_expressionMethodCall = 42, RULE_identifier = 43, 
		RULE_id = 44, RULE_idThis = 45, RULE_idIDENT = 46;
	public static final String[] ruleNames = {
		"program", "classDeclaration", "mainClass", "block", "varDeclaration", 
		"variable", "type", "basictype", "arraytype", "typeBoolean", "typeInt", 
		"typeClass", "methodDeclaration", "procType", "typeVoid", "statement", 
		"statementAssign", "statementPrintln", "statementReturn", "statementBlock", 
		"statementIfThenElse", "statementWhile", "statementArrayAsg", "statementMethodCallPnt", 
		"statementMethodCall", "expression", "level1", "level2", "level3", "level4", 
		"level5", "expressionUnaryMinus", "expressionIdentifier", "expressionParentheses", 
		"expressionConstantTrue", "expressionConstantFalse", "expressionConstantInteger", 
		"expressionConstantString", "expressionNegate", "expressionNewIntArray", 
		"expressionNewObject", "expressionIdentifierArray", "expressionMethodCall", 
		"identifier", "id", "idThis", "idIDENT"
	};

	@Override
	public String getGrammarFileName() { return "MiniJava.g4"; }

	@Override
	public String[] getTokenNames() { return tokenNames; }

	@Override
	public String[] getRuleNames() { return ruleNames; }

	@Override
	public ATN getATN() { return _ATN; }

	public MiniJavaParser(TokenStream input) {
		super(input);
		_interp = new ParserATNSimulator(this,_ATN,_decisionToDFA,_sharedContextCache);
	}
	public static class ProgramContext extends ParserRuleContext {
		public List<ClassDeclarationContext> classDeclaration() {
			return getRuleContexts(ClassDeclarationContext.class);
		}
		public ClassDeclarationContext classDeclaration(int i) {
			return getRuleContext(ClassDeclarationContext.class,i);
		}
		public MainClassContext mainClass() {
			return getRuleContext(MainClassContext.class,0);
		}
		public ProgramContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_program; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof MiniJavaListener ) ((MiniJavaListener)listener).enterProgram(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof MiniJavaListener ) ((MiniJavaListener)listener).exitProgram(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof MiniJavaVisitor ) return ((MiniJavaVisitor<? extends T>)visitor).visitProgram(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ProgramContext program() throws RecognitionException {
		ProgramContext _localctx = new ProgramContext(_ctx, getState());
		enterRule(_localctx, 0, RULE_program);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(94); mainClass();
			setState(98);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==5) {
				{
				{
				setState(95); classDeclaration();
				}
				}
				setState(100);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class ClassDeclarationContext extends ParserRuleContext {
		public Token className;
		public Token superClassName;
		public List<MethodDeclarationContext> methodDeclaration() {
			return getRuleContexts(MethodDeclarationContext.class);
		}
		public List<VarDeclarationContext> varDeclaration() {
			return getRuleContexts(VarDeclarationContext.class);
		}
		public TerminalNode IDENT(int i) {
			return getToken(MiniJavaParser.IDENT, i);
		}
		public MethodDeclarationContext methodDeclaration(int i) {
			return getRuleContext(MethodDeclarationContext.class,i);
		}
		public List<TerminalNode> IDENT() { return getTokens(MiniJavaParser.IDENT); }
		public VarDeclarationContext varDeclaration(int i) {
			return getRuleContext(VarDeclarationContext.class,i);
		}
		public ClassDeclarationContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_classDeclaration; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof MiniJavaListener ) ((MiniJavaListener)listener).enterClassDeclaration(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof MiniJavaListener ) ((MiniJavaListener)listener).exitClassDeclaration(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof MiniJavaVisitor ) return ((MiniJavaVisitor<? extends T>)visitor).visitClassDeclaration(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ClassDeclarationContext classDeclaration() throws RecognitionException {
		ClassDeclarationContext _localctx = new ClassDeclarationContext(_ctx, getState());
		enterRule(_localctx, 2, RULE_classDeclaration);
		int _la;
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(101); match(5);
			setState(102); ((ClassDeclarationContext)_localctx).className = match(IDENT);
			setState(105);
			_la = _input.LA(1);
			if (_la==13) {
				{
				setState(103); match(13);
				setState(104); ((ClassDeclarationContext)_localctx).superClassName = match(IDENT);
				}
			}

			setState(107); match(9);
			setState(111);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,2,_ctx);
			while ( _alt!=2 && _alt!=-1 ) {
				if ( _alt==1 ) {
					{
					{
					setState(108); varDeclaration();
					}
					} 
				}
				setState(113);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,2,_ctx);
			}
			setState(117);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << 8) | (1L << 15) | (1L << 23) | (1L << 30) | (1L << 32) | (1L << IDENT))) != 0)) {
				{
				{
				setState(114); methodDeclaration();
				}
				}
				setState(119);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(120); match(12);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class MainClassContext extends ParserRuleContext {
		public Token className;
		public Token parameterName;
		public TerminalNode IDENT(int i) {
			return getToken(MiniJavaParser.IDENT, i);
		}
		public BlockContext block() {
			return getRuleContext(BlockContext.class,0);
		}
		public List<TerminalNode> IDENT() { return getTokens(MiniJavaParser.IDENT); }
		public MainClassContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_mainClass; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof MiniJavaListener ) ((MiniJavaListener)listener).enterMainClass(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof MiniJavaListener ) ((MiniJavaListener)listener).exitMainClass(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof MiniJavaVisitor ) return ((MiniJavaVisitor<? extends T>)visitor).visitMainClass(this);
			else return visitor.visitChildren(this);
		}
	}

	public final MainClassContext mainClass() throws RecognitionException {
		MainClassContext _localctx = new MainClassContext(_ctx, getState());
		enterRule(_localctx, 4, RULE_mainClass);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(122); match(5);
			setState(123); ((MainClassContext)_localctx).className = match(IDENT);
			setState(124); match(9);
			setState(125); match(30);
			setState(126); match(32);
			setState(127); match(8);
			setState(128); match(1);
			setState(129); match(16);
			setState(130); match(28);
			setState(131); match(25);
			setState(132); match(29);
			setState(133); ((MainClassContext)_localctx).parameterName = match(IDENT);
			setState(134); match(34);
			setState(135); block();
			setState(136); match(12);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class BlockContext extends ParserRuleContext {
		public List<VarDeclarationContext> varDeclaration() {
			return getRuleContexts(VarDeclarationContext.class);
		}
		public StatementContext statement(int i) {
			return getRuleContext(StatementContext.class,i);
		}
		public List<StatementContext> statement() {
			return getRuleContexts(StatementContext.class);
		}
		public VarDeclarationContext varDeclaration(int i) {
			return getRuleContext(VarDeclarationContext.class,i);
		}
		public BlockContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_block; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof MiniJavaListener ) ((MiniJavaListener)listener).enterBlock(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof MiniJavaListener ) ((MiniJavaListener)listener).exitBlock(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof MiniJavaVisitor ) return ((MiniJavaVisitor<? extends T>)visitor).visitBlock(this);
			else return visitor.visitChildren(this);
		}
	}

	public final BlockContext block() throws RecognitionException {
		BlockContext _localctx = new BlockContext(_ctx, getState());
		enterRule(_localctx, 6, RULE_block);
		int _la;
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(138); match(9);
			setState(142);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,4,_ctx);
			while ( _alt!=2 && _alt!=-1 ) {
				if ( _alt==1 ) {
					{
					{
					setState(139); varDeclaration();
					}
					} 
				}
				setState(144);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,4,_ctx);
			}
			setState(148);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << 6) | (1L << 9) | (1L << 14) | (1L << 17) | (1L << 19) | (1L << 24) | (1L << IDENT))) != 0)) {
				{
				{
				setState(145); statement();
				}
				}
				setState(150);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(151); match(12);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class VarDeclarationContext extends ParserRuleContext {
		public VariableContext variable() {
			return getRuleContext(VariableContext.class,0);
		}
		public VarDeclarationContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_varDeclaration; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof MiniJavaListener ) ((MiniJavaListener)listener).enterVarDeclaration(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof MiniJavaListener ) ((MiniJavaListener)listener).exitVarDeclaration(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof MiniJavaVisitor ) return ((MiniJavaVisitor<? extends T>)visitor).visitVarDeclaration(this);
			else return visitor.visitChildren(this);
		}
	}

	public final VarDeclarationContext varDeclaration() throws RecognitionException {
		VarDeclarationContext _localctx = new VarDeclarationContext(_ctx, getState());
		enterRule(_localctx, 8, RULE_varDeclaration);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(153); variable();
			setState(154); match(7);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class VariableContext extends ParserRuleContext {
		public Token variableName;
		public TypeContext type() {
			return getRuleContext(TypeContext.class,0);
		}
		public TerminalNode IDENT() { return getToken(MiniJavaParser.IDENT, 0); }
		public VariableContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_variable; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof MiniJavaListener ) ((MiniJavaListener)listener).enterVariable(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof MiniJavaListener ) ((MiniJavaListener)listener).exitVariable(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof MiniJavaVisitor ) return ((MiniJavaVisitor<? extends T>)visitor).visitVariable(this);
			else return visitor.visitChildren(this);
		}
	}

	public final VariableContext variable() throws RecognitionException {
		VariableContext _localctx = new VariableContext(_ctx, getState());
		enterRule(_localctx, 10, RULE_variable);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(156); type();
			setState(157); ((VariableContext)_localctx).variableName = match(IDENT);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class TypeContext extends ParserRuleContext {
		public ArraytypeContext arraytype() {
			return getRuleContext(ArraytypeContext.class,0);
		}
		public BasictypeContext basictype() {
			return getRuleContext(BasictypeContext.class,0);
		}
		public TypeContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_type; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof MiniJavaListener ) ((MiniJavaListener)listener).enterType(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof MiniJavaListener ) ((MiniJavaListener)listener).exitType(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof MiniJavaVisitor ) return ((MiniJavaVisitor<? extends T>)visitor).visitType(this);
			else return visitor.visitChildren(this);
		}
	}

	public final TypeContext type() throws RecognitionException {
		TypeContext _localctx = new TypeContext(_ctx, getState());
		enterRule(_localctx, 12, RULE_type);
		try {
			setState(161);
			switch ( getInterpreter().adaptivePredict(_input,6,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(159); basictype();
				}
				break;

			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(160); arraytype();
				}
				break;
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class BasictypeContext extends ParserRuleContext {
		public TypeIntContext typeInt() {
			return getRuleContext(TypeIntContext.class,0);
		}
		public TypeClassContext typeClass() {
			return getRuleContext(TypeClassContext.class,0);
		}
		public TypeBooleanContext typeBoolean() {
			return getRuleContext(TypeBooleanContext.class,0);
		}
		public BasictypeContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_basictype; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof MiniJavaListener ) ((MiniJavaListener)listener).enterBasictype(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof MiniJavaListener ) ((MiniJavaListener)listener).exitBasictype(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof MiniJavaVisitor ) return ((MiniJavaVisitor<? extends T>)visitor).visitBasictype(this);
			else return visitor.visitChildren(this);
		}
	}

	public final BasictypeContext basictype() throws RecognitionException {
		BasictypeContext _localctx = new BasictypeContext(_ctx, getState());
		enterRule(_localctx, 14, RULE_basictype);
		try {
			setState(166);
			switch (_input.LA(1)) {
			case 23:
				enterOuterAlt(_localctx, 1);
				{
				setState(163); typeBoolean();
				}
				break;
			case 15:
				enterOuterAlt(_localctx, 2);
				{
				setState(164); typeInt();
				}
				break;
			case IDENT:
				enterOuterAlt(_localctx, 3);
				{
				setState(165); typeClass();
				}
				break;
			default:
				throw new NoViableAltException(this);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class ArraytypeContext extends ParserRuleContext {
		public BasictypeContext basictype() {
			return getRuleContext(BasictypeContext.class,0);
		}
		public ArraytypeContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_arraytype; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof MiniJavaListener ) ((MiniJavaListener)listener).enterArraytype(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof MiniJavaListener ) ((MiniJavaListener)listener).exitArraytype(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof MiniJavaVisitor ) return ((MiniJavaVisitor<? extends T>)visitor).visitArraytype(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ArraytypeContext arraytype() throws RecognitionException {
		ArraytypeContext _localctx = new ArraytypeContext(_ctx, getState());
		enterRule(_localctx, 16, RULE_arraytype);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(168); basictype();
			setState(169); match(25);
			setState(170); match(29);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class TypeBooleanContext extends ParserRuleContext {
		public TypeBooleanContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_typeBoolean; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof MiniJavaListener ) ((MiniJavaListener)listener).enterTypeBoolean(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof MiniJavaListener ) ((MiniJavaListener)listener).exitTypeBoolean(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof MiniJavaVisitor ) return ((MiniJavaVisitor<? extends T>)visitor).visitTypeBoolean(this);
			else return visitor.visitChildren(this);
		}
	}

	public final TypeBooleanContext typeBoolean() throws RecognitionException {
		TypeBooleanContext _localctx = new TypeBooleanContext(_ctx, getState());
		enterRule(_localctx, 18, RULE_typeBoolean);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(172); match(23);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class TypeIntContext extends ParserRuleContext {
		public TypeIntContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_typeInt; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof MiniJavaListener ) ((MiniJavaListener)listener).enterTypeInt(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof MiniJavaListener ) ((MiniJavaListener)listener).exitTypeInt(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof MiniJavaVisitor ) return ((MiniJavaVisitor<? extends T>)visitor).visitTypeInt(this);
			else return visitor.visitChildren(this);
		}
	}

	public final TypeIntContext typeInt() throws RecognitionException {
		TypeIntContext _localctx = new TypeIntContext(_ctx, getState());
		enterRule(_localctx, 20, RULE_typeInt);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(174); match(15);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class TypeClassContext extends ParserRuleContext {
		public Token className;
		public TerminalNode IDENT() { return getToken(MiniJavaParser.IDENT, 0); }
		public TypeClassContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_typeClass; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof MiniJavaListener ) ((MiniJavaListener)listener).enterTypeClass(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof MiniJavaListener ) ((MiniJavaListener)listener).exitTypeClass(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof MiniJavaVisitor ) return ((MiniJavaVisitor<? extends T>)visitor).visitTypeClass(this);
			else return visitor.visitChildren(this);
		}
	}

	public final TypeClassContext typeClass() throws RecognitionException {
		TypeClassContext _localctx = new TypeClassContext(_ctx, getState());
		enterRule(_localctx, 22, RULE_typeClass);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(176); ((TypeClassContext)_localctx).className = match(IDENT);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class MethodDeclarationContext extends ParserRuleContext {
		public Token isPublic;
		public Token isStatic;
		public Token methodName;
		public List<VarDeclarationContext> varDeclaration() {
			return getRuleContexts(VarDeclarationContext.class);
		}
		public StatementContext statement(int i) {
			return getRuleContext(StatementContext.class,i);
		}
		public VariableContext variable(int i) {
			return getRuleContext(VariableContext.class,i);
		}
		public List<StatementContext> statement() {
			return getRuleContexts(StatementContext.class);
		}
		public StatementReturnContext statementReturn() {
			return getRuleContext(StatementReturnContext.class,0);
		}
		public ProcTypeContext procType() {
			return getRuleContext(ProcTypeContext.class,0);
		}
		public TerminalNode IDENT() { return getToken(MiniJavaParser.IDENT, 0); }
		public List<VariableContext> variable() {
			return getRuleContexts(VariableContext.class);
		}
		public VarDeclarationContext varDeclaration(int i) {
			return getRuleContext(VarDeclarationContext.class,i);
		}
		public MethodDeclarationContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_methodDeclaration; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof MiniJavaListener ) ((MiniJavaListener)listener).enterMethodDeclaration(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof MiniJavaListener ) ((MiniJavaListener)listener).exitMethodDeclaration(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof MiniJavaVisitor ) return ((MiniJavaVisitor<? extends T>)visitor).visitMethodDeclaration(this);
			else return visitor.visitChildren(this);
		}
	}

	public final MethodDeclarationContext methodDeclaration() throws RecognitionException {
		MethodDeclarationContext _localctx = new MethodDeclarationContext(_ctx, getState());
		enterRule(_localctx, 24, RULE_methodDeclaration);
		int _la;
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(179);
			_la = _input.LA(1);
			if (_la==30) {
				{
				setState(178); ((MethodDeclarationContext)_localctx).isPublic = match(30);
				}
			}

			setState(182);
			_la = _input.LA(1);
			if (_la==32) {
				{
				setState(181); ((MethodDeclarationContext)_localctx).isStatic = match(32);
				}
			}

			setState(184); procType();
			setState(185); ((MethodDeclarationContext)_localctx).methodName = match(IDENT);
			setState(186); match(16);
			setState(195);
			_la = _input.LA(1);
			if ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << 15) | (1L << 23) | (1L << IDENT))) != 0)) {
				{
				setState(187); variable();
				setState(192);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while (_la==20) {
					{
					{
					setState(188); match(20);
					setState(189); variable();
					}
					}
					setState(194);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				}
			}

			setState(197); match(34);
			setState(198); match(9);
			setState(202);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,12,_ctx);
			while ( _alt!=2 && _alt!=-1 ) {
				if ( _alt==1 ) {
					{
					{
					setState(199); varDeclaration();
					}
					} 
				}
				setState(204);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,12,_ctx);
			}
			setState(208);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << 6) | (1L << 9) | (1L << 14) | (1L << 17) | (1L << 19) | (1L << 24) | (1L << IDENT))) != 0)) {
				{
				{
				setState(205); statement();
				}
				}
				setState(210);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(211); statementReturn();
			setState(212); match(12);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class ProcTypeContext extends ParserRuleContext {
		public TypeContext type() {
			return getRuleContext(TypeContext.class,0);
		}
		public TypeVoidContext typeVoid() {
			return getRuleContext(TypeVoidContext.class,0);
		}
		public ProcTypeContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_procType; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof MiniJavaListener ) ((MiniJavaListener)listener).enterProcType(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof MiniJavaListener ) ((MiniJavaListener)listener).exitProcType(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof MiniJavaVisitor ) return ((MiniJavaVisitor<? extends T>)visitor).visitProcType(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ProcTypeContext procType() throws RecognitionException {
		ProcTypeContext _localctx = new ProcTypeContext(_ctx, getState());
		enterRule(_localctx, 26, RULE_procType);
		try {
			setState(216);
			switch (_input.LA(1)) {
			case 8:
				enterOuterAlt(_localctx, 1);
				{
				setState(214); typeVoid();
				}
				break;
			case 15:
			case 23:
			case IDENT:
				enterOuterAlt(_localctx, 2);
				{
				setState(215); type();
				}
				break;
			default:
				throw new NoViableAltException(this);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class TypeVoidContext extends ParserRuleContext {
		public TypeVoidContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_typeVoid; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof MiniJavaListener ) ((MiniJavaListener)listener).enterTypeVoid(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof MiniJavaListener ) ((MiniJavaListener)listener).exitTypeVoid(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof MiniJavaVisitor ) return ((MiniJavaVisitor<? extends T>)visitor).visitTypeVoid(this);
			else return visitor.visitChildren(this);
		}
	}

	public final TypeVoidContext typeVoid() throws RecognitionException {
		TypeVoidContext _localctx = new TypeVoidContext(_ctx, getState());
		enterRule(_localctx, 28, RULE_typeVoid);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(218); match(8);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class StatementContext extends ParserRuleContext {
		public StatementPrintlnContext statementPrintln() {
			return getRuleContext(StatementPrintlnContext.class,0);
		}
		public StatementMethodCallPntContext statementMethodCallPnt() {
			return getRuleContext(StatementMethodCallPntContext.class,0);
		}
		public StatementAssignContext statementAssign() {
			return getRuleContext(StatementAssignContext.class,0);
		}
		public StatementIfThenElseContext statementIfThenElse() {
			return getRuleContext(StatementIfThenElseContext.class,0);
		}
		public StatementBlockContext statementBlock() {
			return getRuleContext(StatementBlockContext.class,0);
		}
		public StatementWhileContext statementWhile() {
			return getRuleContext(StatementWhileContext.class,0);
		}
		public StatementArrayAsgContext statementArrayAsg() {
			return getRuleContext(StatementArrayAsgContext.class,0);
		}
		public StatementMethodCallContext statementMethodCall() {
			return getRuleContext(StatementMethodCallContext.class,0);
		}
		public StatementContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_statement; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof MiniJavaListener ) ((MiniJavaListener)listener).enterStatement(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof MiniJavaListener ) ((MiniJavaListener)listener).exitStatement(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof MiniJavaVisitor ) return ((MiniJavaVisitor<? extends T>)visitor).visitStatement(this);
			else return visitor.visitChildren(this);
		}
	}

	public final StatementContext statement() throws RecognitionException {
		StatementContext _localctx = new StatementContext(_ctx, getState());
		enterRule(_localctx, 30, RULE_statement);
		try {
			setState(228);
			switch ( getInterpreter().adaptivePredict(_input,15,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(220); statementAssign();
				}
				break;

			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(221); statementPrintln();
				}
				break;

			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(222); statementBlock();
				}
				break;

			case 4:
				enterOuterAlt(_localctx, 4);
				{
				setState(223); statementIfThenElse();
				}
				break;

			case 5:
				enterOuterAlt(_localctx, 5);
				{
				setState(224); statementWhile();
				}
				break;

			case 6:
				enterOuterAlt(_localctx, 6);
				{
				setState(225); statementArrayAsg();
				}
				break;

			case 7:
				enterOuterAlt(_localctx, 7);
				{
				setState(226); statementMethodCallPnt();
				}
				break;

			case 8:
				enterOuterAlt(_localctx, 8);
				{
				setState(227); statementMethodCall();
				}
				break;
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class StatementAssignContext extends ParserRuleContext {
		public IdContext lhs;
		public ExpressionContext rhs;
		public IdContext id() {
			return getRuleContext(IdContext.class,0);
		}
		public ExpressionContext expression() {
			return getRuleContext(ExpressionContext.class,0);
		}
		public StatementAssignContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_statementAssign; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof MiniJavaListener ) ((MiniJavaListener)listener).enterStatementAssign(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof MiniJavaListener ) ((MiniJavaListener)listener).exitStatementAssign(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof MiniJavaVisitor ) return ((MiniJavaVisitor<? extends T>)visitor).visitStatementAssign(this);
			else return visitor.visitChildren(this);
		}
	}

	public final StatementAssignContext statementAssign() throws RecognitionException {
		StatementAssignContext _localctx = new StatementAssignContext(_ctx, getState());
		enterRule(_localctx, 32, RULE_statementAssign);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(230); ((StatementAssignContext)_localctx).lhs = id();
			setState(231); match(11);
			setState(232); ((StatementAssignContext)_localctx).rhs = expression();
			setState(233); match(7);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class StatementPrintlnContext extends ParserRuleContext {
		public ExpressionContext argument;
		public ExpressionContext expression() {
			return getRuleContext(ExpressionContext.class,0);
		}
		public StatementPrintlnContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_statementPrintln; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof MiniJavaListener ) ((MiniJavaListener)listener).enterStatementPrintln(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof MiniJavaListener ) ((MiniJavaListener)listener).exitStatementPrintln(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof MiniJavaVisitor ) return ((MiniJavaVisitor<? extends T>)visitor).visitStatementPrintln(this);
			else return visitor.visitChildren(this);
		}
	}

	public final StatementPrintlnContext statementPrintln() throws RecognitionException {
		StatementPrintlnContext _localctx = new StatementPrintlnContext(_ctx, getState());
		enterRule(_localctx, 34, RULE_statementPrintln);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(235); match(24);
			setState(236); match(16);
			setState(237); ((StatementPrintlnContext)_localctx).argument = expression();
			setState(238); match(34);
			setState(239); match(7);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class StatementReturnContext extends ParserRuleContext {
		public ExpressionContext argument;
		public ExpressionContext expression() {
			return getRuleContext(ExpressionContext.class,0);
		}
		public StatementReturnContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_statementReturn; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof MiniJavaListener ) ((MiniJavaListener)listener).enterStatementReturn(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof MiniJavaListener ) ((MiniJavaListener)listener).exitStatementReturn(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof MiniJavaVisitor ) return ((MiniJavaVisitor<? extends T>)visitor).visitStatementReturn(this);
			else return visitor.visitChildren(this);
		}
	}

	public final StatementReturnContext statementReturn() throws RecognitionException {
		StatementReturnContext _localctx = new StatementReturnContext(_ctx, getState());
		enterRule(_localctx, 36, RULE_statementReturn);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(241); match(4);
			setState(246);
			_la = _input.LA(1);
			if (_la==16) {
				{
				setState(242); match(16);
				setState(243); ((StatementReturnContext)_localctx).argument = expression();
				setState(244); match(34);
				}
			}

			setState(248); match(7);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class StatementBlockContext extends ParserRuleContext {
		public BlockContext blockStatement;
		public BlockContext block() {
			return getRuleContext(BlockContext.class,0);
		}
		public StatementBlockContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_statementBlock; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof MiniJavaListener ) ((MiniJavaListener)listener).enterStatementBlock(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof MiniJavaListener ) ((MiniJavaListener)listener).exitStatementBlock(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof MiniJavaVisitor ) return ((MiniJavaVisitor<? extends T>)visitor).visitStatementBlock(this);
			else return visitor.visitChildren(this);
		}
	}

	public final StatementBlockContext statementBlock() throws RecognitionException {
		StatementBlockContext _localctx = new StatementBlockContext(_ctx, getState());
		enterRule(_localctx, 38, RULE_statementBlock);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(250); ((StatementBlockContext)_localctx).blockStatement = block();
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class StatementIfThenElseContext extends ParserRuleContext {
		public ExpressionContext argument;
		public StatementContext ifStatement;
		public StatementContext elseStatement;
		public StatementContext statement(int i) {
			return getRuleContext(StatementContext.class,i);
		}
		public List<StatementContext> statement() {
			return getRuleContexts(StatementContext.class);
		}
		public ExpressionContext expression() {
			return getRuleContext(ExpressionContext.class,0);
		}
		public StatementIfThenElseContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_statementIfThenElse; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof MiniJavaListener ) ((MiniJavaListener)listener).enterStatementIfThenElse(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof MiniJavaListener ) ((MiniJavaListener)listener).exitStatementIfThenElse(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof MiniJavaVisitor ) return ((MiniJavaVisitor<? extends T>)visitor).visitStatementIfThenElse(this);
			else return visitor.visitChildren(this);
		}
	}

	public final StatementIfThenElseContext statementIfThenElse() throws RecognitionException {
		StatementIfThenElseContext _localctx = new StatementIfThenElseContext(_ctx, getState());
		enterRule(_localctx, 40, RULE_statementIfThenElse);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(252); match(14);
			setState(253); match(16);
			setState(254); ((StatementIfThenElseContext)_localctx).argument = expression();
			setState(255); match(34);
			setState(256); ((StatementIfThenElseContext)_localctx).ifStatement = statement();
			setState(259);
			switch ( getInterpreter().adaptivePredict(_input,17,_ctx) ) {
			case 1:
				{
				setState(257); match(33);
				setState(258); ((StatementIfThenElseContext)_localctx).elseStatement = statement();
				}
				break;
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class StatementWhileContext extends ParserRuleContext {
		public ExpressionContext argument;
		public StatementContext whileStatement;
		public StatementContext statement() {
			return getRuleContext(StatementContext.class,0);
		}
		public ExpressionContext expression() {
			return getRuleContext(ExpressionContext.class,0);
		}
		public StatementWhileContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_statementWhile; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof MiniJavaListener ) ((MiniJavaListener)listener).enterStatementWhile(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof MiniJavaListener ) ((MiniJavaListener)listener).exitStatementWhile(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof MiniJavaVisitor ) return ((MiniJavaVisitor<? extends T>)visitor).visitStatementWhile(this);
			else return visitor.visitChildren(this);
		}
	}

	public final StatementWhileContext statementWhile() throws RecognitionException {
		StatementWhileContext _localctx = new StatementWhileContext(_ctx, getState());
		enterRule(_localctx, 42, RULE_statementWhile);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(261); match(6);
			setState(262); match(16);
			setState(263); ((StatementWhileContext)_localctx).argument = expression();
			setState(264); match(34);
			setState(265); ((StatementWhileContext)_localctx).whileStatement = statement();
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class StatementArrayAsgContext extends ParserRuleContext {
		public IdContext name;
		public ExpressionContext lhs;
		public ExpressionContext rhs;
		public IdContext id() {
			return getRuleContext(IdContext.class,0);
		}
		public ExpressionContext expression(int i) {
			return getRuleContext(ExpressionContext.class,i);
		}
		public List<ExpressionContext> expression() {
			return getRuleContexts(ExpressionContext.class);
		}
		public StatementArrayAsgContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_statementArrayAsg; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof MiniJavaListener ) ((MiniJavaListener)listener).enterStatementArrayAsg(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof MiniJavaListener ) ((MiniJavaListener)listener).exitStatementArrayAsg(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof MiniJavaVisitor ) return ((MiniJavaVisitor<? extends T>)visitor).visitStatementArrayAsg(this);
			else return visitor.visitChildren(this);
		}
	}

	public final StatementArrayAsgContext statementArrayAsg() throws RecognitionException {
		StatementArrayAsgContext _localctx = new StatementArrayAsgContext(_ctx, getState());
		enterRule(_localctx, 44, RULE_statementArrayAsg);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(267); ((StatementArrayAsgContext)_localctx).name = id();
			setState(268); match(25);
			setState(269); ((StatementArrayAsgContext)_localctx).lhs = expression();
			setState(270); match(29);
			setState(271); match(11);
			setState(272); ((StatementArrayAsgContext)_localctx).rhs = expression();
			setState(273); match(7);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class StatementMethodCallPntContext extends ParserRuleContext {
		public ExpressionContext argument;
		public ExpressionContext expression() {
			return getRuleContext(ExpressionContext.class,0);
		}
		public StatementMethodCallPntContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_statementMethodCallPnt; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof MiniJavaListener ) ((MiniJavaListener)listener).enterStatementMethodCallPnt(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof MiniJavaListener ) ((MiniJavaListener)listener).exitStatementMethodCallPnt(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof MiniJavaVisitor ) return ((MiniJavaVisitor<? extends T>)visitor).visitStatementMethodCallPnt(this);
			else return visitor.visitChildren(this);
		}
	}

	public final StatementMethodCallPntContext statementMethodCallPnt() throws RecognitionException {
		StatementMethodCallPntContext _localctx = new StatementMethodCallPntContext(_ctx, getState());
		enterRule(_localctx, 46, RULE_statementMethodCallPnt);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(275); match(17);
			setState(276); match(16);
			setState(277); ((StatementMethodCallPntContext)_localctx).argument = expression();
			setState(278); match(34);
			setState(279); match(7);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class StatementMethodCallContext extends ParserRuleContext {
		public IdContext name;
		public Token methodName;
		public ExpressionContext headArgument;
		public ExpressionContext expression;
		public List<ExpressionContext> tailArguments = new ArrayList<ExpressionContext>();
		public IdContext id() {
			return getRuleContext(IdContext.class,0);
		}
		public ExpressionContext expression(int i) {
			return getRuleContext(ExpressionContext.class,i);
		}
		public List<ExpressionContext> expression() {
			return getRuleContexts(ExpressionContext.class);
		}
		public TerminalNode IDENT() { return getToken(MiniJavaParser.IDENT, 0); }
		public StatementMethodCallContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_statementMethodCall; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof MiniJavaListener ) ((MiniJavaListener)listener).enterStatementMethodCall(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof MiniJavaListener ) ((MiniJavaListener)listener).exitStatementMethodCall(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof MiniJavaVisitor ) return ((MiniJavaVisitor<? extends T>)visitor).visitStatementMethodCall(this);
			else return visitor.visitChildren(this);
		}
	}

	public final StatementMethodCallContext statementMethodCall() throws RecognitionException {
		StatementMethodCallContext _localctx = new StatementMethodCallContext(_ctx, getState());
		enterRule(_localctx, 48, RULE_statementMethodCall);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(284);
			switch ( getInterpreter().adaptivePredict(_input,18,_ctx) ) {
			case 1:
				{
				setState(281); ((StatementMethodCallContext)_localctx).name = id();
				setState(282); match(22);
				}
				break;
			}
			setState(286); ((StatementMethodCallContext)_localctx).methodName = match(IDENT);
			setState(287); match(16);
			setState(296);
			_la = _input.LA(1);
			if ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << 2) | (1L << 3) | (1L << 16) | (1L << 19) | (1L << 21) | (1L << 31) | (1L << 36) | (1L << IDENT) | (1L << INT) | (1L << STRING))) != 0)) {
				{
				setState(288); ((StatementMethodCallContext)_localctx).headArgument = expression();
				setState(293);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while (_la==20) {
					{
					{
					setState(289); match(20);
					setState(290); ((StatementMethodCallContext)_localctx).expression = expression();
					((StatementMethodCallContext)_localctx).tailArguments.add(((StatementMethodCallContext)_localctx).expression);
					}
					}
					setState(295);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				}
			}

			setState(298); match(34);
			setState(299); match(7);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class ExpressionContext extends ParserRuleContext {
		public Level1Context head;
		public Level1Context level1;
		public List<Level1Context> tail = new ArrayList<Level1Context>();
		public Level1Context level1(int i) {
			return getRuleContext(Level1Context.class,i);
		}
		public List<Level1Context> level1() {
			return getRuleContexts(Level1Context.class);
		}
		public ExpressionContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_expression; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof MiniJavaListener ) ((MiniJavaListener)listener).enterExpression(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof MiniJavaListener ) ((MiniJavaListener)listener).exitExpression(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof MiniJavaVisitor ) return ((MiniJavaVisitor<? extends T>)visitor).visitExpression(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ExpressionContext expression() throws RecognitionException {
		ExpressionContext _localctx = new ExpressionContext(_ctx, getState());
		enterRule(_localctx, 50, RULE_expression);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(301); ((ExpressionContext)_localctx).head = level1();
			setState(306);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==10) {
				{
				{
				setState(302); match(10);
				setState(303); ((ExpressionContext)_localctx).level1 = level1();
				((ExpressionContext)_localctx).tail.add(((ExpressionContext)_localctx).level1);
				}
				}
				setState(308);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class Level1Context extends ParserRuleContext {
		public Level2Context head;
		public Level2Context level2;
		public List<Level2Context> tail = new ArrayList<Level2Context>();
		public Level2Context level2(int i) {
			return getRuleContext(Level2Context.class,i);
		}
		public List<Level2Context> level2() {
			return getRuleContexts(Level2Context.class);
		}
		public Level1Context(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_level1; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof MiniJavaListener ) ((MiniJavaListener)listener).enterLevel1(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof MiniJavaListener ) ((MiniJavaListener)listener).exitLevel1(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof MiniJavaVisitor ) return ((MiniJavaVisitor<? extends T>)visitor).visitLevel1(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Level1Context level1() throws RecognitionException {
		Level1Context _localctx = new Level1Context(_ctx, getState());
		enterRule(_localctx, 52, RULE_level1);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(309); ((Level1Context)_localctx).head = level2();
			setState(314);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==27) {
				{
				{
				setState(310); match(27);
				setState(311); ((Level1Context)_localctx).level2 = level2();
				((Level1Context)_localctx).tail.add(((Level1Context)_localctx).level2);
				}
				}
				setState(316);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class Level2Context extends ParserRuleContext {
		public Level3Context head;
		public Level3Context level3;
		public List<Level3Context> tail = new ArrayList<Level3Context>();
		public List<Level3Context> level3() {
			return getRuleContexts(Level3Context.class);
		}
		public Level3Context level3(int i) {
			return getRuleContext(Level3Context.class,i);
		}
		public Level2Context(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_level2; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof MiniJavaListener ) ((MiniJavaListener)listener).enterLevel2(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof MiniJavaListener ) ((MiniJavaListener)listener).exitLevel2(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof MiniJavaVisitor ) return ((MiniJavaVisitor<? extends T>)visitor).visitLevel2(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Level2Context level2() throws RecognitionException {
		Level2Context _localctx = new Level2Context(_ctx, getState());
		enterRule(_localctx, 54, RULE_level2);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(317); ((Level2Context)_localctx).head = level3();
			setState(322);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==26) {
				{
				{
				setState(318); match(26);
				setState(319); ((Level2Context)_localctx).level3 = level3();
				((Level2Context)_localctx).tail.add(((Level2Context)_localctx).level3);
				}
				}
				setState(324);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class Level3Context extends ParserRuleContext {
		public Level4Context head;
		public Level4Context level4;
		public List<Level4Context> tail = new ArrayList<Level4Context>();
		public List<Level4Context> level4() {
			return getRuleContexts(Level4Context.class);
		}
		public Level4Context level4(int i) {
			return getRuleContext(Level4Context.class,i);
		}
		public Level3Context(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_level3; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof MiniJavaListener ) ((MiniJavaListener)listener).enterLevel3(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof MiniJavaListener ) ((MiniJavaListener)listener).exitLevel3(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof MiniJavaVisitor ) return ((MiniJavaVisitor<? extends T>)visitor).visitLevel3(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Level3Context level3() throws RecognitionException {
		Level3Context _localctx = new Level3Context(_ctx, getState());
		enterRule(_localctx, 56, RULE_level3);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(325); ((Level3Context)_localctx).head = level4();
			setState(330);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==35 || _la==36) {
				{
				{
				setState(326);
				_la = _input.LA(1);
				if ( !(_la==35 || _la==36) ) {
				_errHandler.recoverInline(this);
				}
				consume();
				setState(327); ((Level3Context)_localctx).level4 = level4();
				((Level3Context)_localctx).tail.add(((Level3Context)_localctx).level4);
				}
				}
				setState(332);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class Level4Context extends ParserRuleContext {
		public Level5Context head;
		public Level5Context level5;
		public List<Level5Context> tail = new ArrayList<Level5Context>();
		public List<Level5Context> level5() {
			return getRuleContexts(Level5Context.class);
		}
		public Level5Context level5(int i) {
			return getRuleContext(Level5Context.class,i);
		}
		public Level4Context(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_level4; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof MiniJavaListener ) ((MiniJavaListener)listener).enterLevel4(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof MiniJavaListener ) ((MiniJavaListener)listener).exitLevel4(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof MiniJavaVisitor ) return ((MiniJavaVisitor<? extends T>)visitor).visitLevel4(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Level4Context level4() throws RecognitionException {
		Level4Context _localctx = new Level4Context(_ctx, getState());
		enterRule(_localctx, 58, RULE_level4);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(333); ((Level4Context)_localctx).head = level5();
			setState(338);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==18) {
				{
				{
				setState(334); match(18);
				setState(335); ((Level4Context)_localctx).level5 = level5();
				((Level4Context)_localctx).tail.add(((Level4Context)_localctx).level5);
				}
				}
				setState(340);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class Level5Context extends ParserRuleContext {
		public ExpressionConstantFalseContext expressionConstantFalse() {
			return getRuleContext(ExpressionConstantFalseContext.class,0);
		}
		public ExpressionConstantStringContext expressionConstantString() {
			return getRuleContext(ExpressionConstantStringContext.class,0);
		}
		public ExpressionConstantIntegerContext expressionConstantInteger() {
			return getRuleContext(ExpressionConstantIntegerContext.class,0);
		}
		public ExpressionParenthesesContext expressionParentheses() {
			return getRuleContext(ExpressionParenthesesContext.class,0);
		}
		public ExpressionNegateContext expressionNegate() {
			return getRuleContext(ExpressionNegateContext.class,0);
		}
		public ExpressionNewIntArrayContext expressionNewIntArray() {
			return getRuleContext(ExpressionNewIntArrayContext.class,0);
		}
		public ExpressionNewObjectContext expressionNewObject() {
			return getRuleContext(ExpressionNewObjectContext.class,0);
		}
		public ExpressionIdentifierArrayContext expressionIdentifierArray() {
			return getRuleContext(ExpressionIdentifierArrayContext.class,0);
		}
		public ExpressionMethodCallContext expressionMethodCall() {
			return getRuleContext(ExpressionMethodCallContext.class,0);
		}
		public ExpressionUnaryMinusContext expressionUnaryMinus() {
			return getRuleContext(ExpressionUnaryMinusContext.class,0);
		}
		public ExpressionConstantTrueContext expressionConstantTrue() {
			return getRuleContext(ExpressionConstantTrueContext.class,0);
		}
		public ExpressionIdentifierContext expressionIdentifier() {
			return getRuleContext(ExpressionIdentifierContext.class,0);
		}
		public Level5Context(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_level5; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof MiniJavaListener ) ((MiniJavaListener)listener).enterLevel5(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof MiniJavaListener ) ((MiniJavaListener)listener).exitLevel5(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof MiniJavaVisitor ) return ((MiniJavaVisitor<? extends T>)visitor).visitLevel5(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Level5Context level5() throws RecognitionException {
		Level5Context _localctx = new Level5Context(_ctx, getState());
		enterRule(_localctx, 60, RULE_level5);
		try {
			setState(353);
			switch ( getInterpreter().adaptivePredict(_input,26,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(341); expressionUnaryMinus();
				}
				break;

			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(342); expressionIdentifier();
				}
				break;

			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(343); expressionParentheses();
				}
				break;

			case 4:
				enterOuterAlt(_localctx, 4);
				{
				setState(344); expressionConstantTrue();
				}
				break;

			case 5:
				enterOuterAlt(_localctx, 5);
				{
				setState(345); expressionConstantFalse();
				}
				break;

			case 6:
				enterOuterAlt(_localctx, 6);
				{
				setState(346); expressionConstantInteger();
				}
				break;

			case 7:
				enterOuterAlt(_localctx, 7);
				{
				setState(347); expressionConstantString();
				}
				break;

			case 8:
				enterOuterAlt(_localctx, 8);
				{
				setState(348); expressionNegate();
				}
				break;

			case 9:
				enterOuterAlt(_localctx, 9);
				{
				setState(349); expressionNewIntArray();
				}
				break;

			case 10:
				enterOuterAlt(_localctx, 10);
				{
				setState(350); expressionNewObject();
				}
				break;

			case 11:
				enterOuterAlt(_localctx, 11);
				{
				setState(351); expressionIdentifierArray();
				}
				break;

			case 12:
				enterOuterAlt(_localctx, 12);
				{
				setState(352); expressionMethodCall();
				}
				break;
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class ExpressionUnaryMinusContext extends ParserRuleContext {
		public Level5Context argument;
		public Level5Context level5() {
			return getRuleContext(Level5Context.class,0);
		}
		public ExpressionUnaryMinusContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_expressionUnaryMinus; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof MiniJavaListener ) ((MiniJavaListener)listener).enterExpressionUnaryMinus(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof MiniJavaListener ) ((MiniJavaListener)listener).exitExpressionUnaryMinus(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof MiniJavaVisitor ) return ((MiniJavaVisitor<? extends T>)visitor).visitExpressionUnaryMinus(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ExpressionUnaryMinusContext expressionUnaryMinus() throws RecognitionException {
		ExpressionUnaryMinusContext _localctx = new ExpressionUnaryMinusContext(_ctx, getState());
		enterRule(_localctx, 62, RULE_expressionUnaryMinus);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(355); match(36);
			setState(356); ((ExpressionUnaryMinusContext)_localctx).argument = level5();
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class ExpressionIdentifierContext extends ParserRuleContext {
		public IdContext name;
		public IdContext id() {
			return getRuleContext(IdContext.class,0);
		}
		public ExpressionIdentifierContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_expressionIdentifier; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof MiniJavaListener ) ((MiniJavaListener)listener).enterExpressionIdentifier(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof MiniJavaListener ) ((MiniJavaListener)listener).exitExpressionIdentifier(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof MiniJavaVisitor ) return ((MiniJavaVisitor<? extends T>)visitor).visitExpressionIdentifier(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ExpressionIdentifierContext expressionIdentifier() throws RecognitionException {
		ExpressionIdentifierContext _localctx = new ExpressionIdentifierContext(_ctx, getState());
		enterRule(_localctx, 64, RULE_expressionIdentifier);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(358); ((ExpressionIdentifierContext)_localctx).name = id();
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class ExpressionParenthesesContext extends ParserRuleContext {
		public ExpressionContext argument;
		public ExpressionContext expression() {
			return getRuleContext(ExpressionContext.class,0);
		}
		public ExpressionParenthesesContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_expressionParentheses; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof MiniJavaListener ) ((MiniJavaListener)listener).enterExpressionParentheses(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof MiniJavaListener ) ((MiniJavaListener)listener).exitExpressionParentheses(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof MiniJavaVisitor ) return ((MiniJavaVisitor<? extends T>)visitor).visitExpressionParentheses(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ExpressionParenthesesContext expressionParentheses() throws RecognitionException {
		ExpressionParenthesesContext _localctx = new ExpressionParenthesesContext(_ctx, getState());
		enterRule(_localctx, 66, RULE_expressionParentheses);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(360); match(16);
			setState(361); ((ExpressionParenthesesContext)_localctx).argument = expression();
			setState(362); match(34);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class ExpressionConstantTrueContext extends ParserRuleContext {
		public ExpressionConstantTrueContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_expressionConstantTrue; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof MiniJavaListener ) ((MiniJavaListener)listener).enterExpressionConstantTrue(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof MiniJavaListener ) ((MiniJavaListener)listener).exitExpressionConstantTrue(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof MiniJavaVisitor ) return ((MiniJavaVisitor<? extends T>)visitor).visitExpressionConstantTrue(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ExpressionConstantTrueContext expressionConstantTrue() throws RecognitionException {
		ExpressionConstantTrueContext _localctx = new ExpressionConstantTrueContext(_ctx, getState());
		enterRule(_localctx, 68, RULE_expressionConstantTrue);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(364); match(3);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class ExpressionConstantFalseContext extends ParserRuleContext {
		public ExpressionConstantFalseContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_expressionConstantFalse; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof MiniJavaListener ) ((MiniJavaListener)listener).enterExpressionConstantFalse(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof MiniJavaListener ) ((MiniJavaListener)listener).exitExpressionConstantFalse(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof MiniJavaVisitor ) return ((MiniJavaVisitor<? extends T>)visitor).visitExpressionConstantFalse(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ExpressionConstantFalseContext expressionConstantFalse() throws RecognitionException {
		ExpressionConstantFalseContext _localctx = new ExpressionConstantFalseContext(_ctx, getState());
		enterRule(_localctx, 70, RULE_expressionConstantFalse);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(366); match(21);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class ExpressionConstantIntegerContext extends ParserRuleContext {
		public Token value;
		public TerminalNode INT() { return getToken(MiniJavaParser.INT, 0); }
		public ExpressionConstantIntegerContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_expressionConstantInteger; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof MiniJavaListener ) ((MiniJavaListener)listener).enterExpressionConstantInteger(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof MiniJavaListener ) ((MiniJavaListener)listener).exitExpressionConstantInteger(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof MiniJavaVisitor ) return ((MiniJavaVisitor<? extends T>)visitor).visitExpressionConstantInteger(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ExpressionConstantIntegerContext expressionConstantInteger() throws RecognitionException {
		ExpressionConstantIntegerContext _localctx = new ExpressionConstantIntegerContext(_ctx, getState());
		enterRule(_localctx, 72, RULE_expressionConstantInteger);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(368); ((ExpressionConstantIntegerContext)_localctx).value = match(INT);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class ExpressionConstantStringContext extends ParserRuleContext {
		public Token value;
		public TerminalNode STRING() { return getToken(MiniJavaParser.STRING, 0); }
		public ExpressionConstantStringContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_expressionConstantString; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof MiniJavaListener ) ((MiniJavaListener)listener).enterExpressionConstantString(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof MiniJavaListener ) ((MiniJavaListener)listener).exitExpressionConstantString(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof MiniJavaVisitor ) return ((MiniJavaVisitor<? extends T>)visitor).visitExpressionConstantString(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ExpressionConstantStringContext expressionConstantString() throws RecognitionException {
		ExpressionConstantStringContext _localctx = new ExpressionConstantStringContext(_ctx, getState());
		enterRule(_localctx, 74, RULE_expressionConstantString);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(370); ((ExpressionConstantStringContext)_localctx).value = match(STRING);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class ExpressionNegateContext extends ParserRuleContext {
		public Level5Context arguement;
		public Level5Context level5() {
			return getRuleContext(Level5Context.class,0);
		}
		public ExpressionNegateContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_expressionNegate; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof MiniJavaListener ) ((MiniJavaListener)listener).enterExpressionNegate(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof MiniJavaListener ) ((MiniJavaListener)listener).exitExpressionNegate(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof MiniJavaVisitor ) return ((MiniJavaVisitor<? extends T>)visitor).visitExpressionNegate(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ExpressionNegateContext expressionNegate() throws RecognitionException {
		ExpressionNegateContext _localctx = new ExpressionNegateContext(_ctx, getState());
		enterRule(_localctx, 76, RULE_expressionNegate);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(372); match(31);
			setState(373); ((ExpressionNegateContext)_localctx).arguement = level5();
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class ExpressionNewIntArrayContext extends ParserRuleContext {
		public ExpressionContext argument;
		public ExpressionContext expression() {
			return getRuleContext(ExpressionContext.class,0);
		}
		public ExpressionNewIntArrayContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_expressionNewIntArray; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof MiniJavaListener ) ((MiniJavaListener)listener).enterExpressionNewIntArray(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof MiniJavaListener ) ((MiniJavaListener)listener).exitExpressionNewIntArray(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof MiniJavaVisitor ) return ((MiniJavaVisitor<? extends T>)visitor).visitExpressionNewIntArray(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ExpressionNewIntArrayContext expressionNewIntArray() throws RecognitionException {
		ExpressionNewIntArrayContext _localctx = new ExpressionNewIntArrayContext(_ctx, getState());
		enterRule(_localctx, 78, RULE_expressionNewIntArray);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(375); match(2);
			setState(376); match(15);
			setState(377); match(25);
			setState(378); ((ExpressionNewIntArrayContext)_localctx).argument = expression();
			setState(379); match(29);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class ExpressionNewObjectContext extends ParserRuleContext {
		public Token name;
		public TerminalNode IDENT() { return getToken(MiniJavaParser.IDENT, 0); }
		public ExpressionNewObjectContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_expressionNewObject; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof MiniJavaListener ) ((MiniJavaListener)listener).enterExpressionNewObject(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof MiniJavaListener ) ((MiniJavaListener)listener).exitExpressionNewObject(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof MiniJavaVisitor ) return ((MiniJavaVisitor<? extends T>)visitor).visitExpressionNewObject(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ExpressionNewObjectContext expressionNewObject() throws RecognitionException {
		ExpressionNewObjectContext _localctx = new ExpressionNewObjectContext(_ctx, getState());
		enterRule(_localctx, 80, RULE_expressionNewObject);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(381); match(2);
			setState(382); ((ExpressionNewObjectContext)_localctx).name = match(IDENT);
			setState(383); match(16);
			setState(384); match(34);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class ExpressionIdentifierArrayContext extends ParserRuleContext {
		public IdContext name;
		public ExpressionContext argument;
		public IdContext id() {
			return getRuleContext(IdContext.class,0);
		}
		public ExpressionContext expression() {
			return getRuleContext(ExpressionContext.class,0);
		}
		public ExpressionIdentifierArrayContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_expressionIdentifierArray; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof MiniJavaListener ) ((MiniJavaListener)listener).enterExpressionIdentifierArray(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof MiniJavaListener ) ((MiniJavaListener)listener).exitExpressionIdentifierArray(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof MiniJavaVisitor ) return ((MiniJavaVisitor<? extends T>)visitor).visitExpressionIdentifierArray(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ExpressionIdentifierArrayContext expressionIdentifierArray() throws RecognitionException {
		ExpressionIdentifierArrayContext _localctx = new ExpressionIdentifierArrayContext(_ctx, getState());
		enterRule(_localctx, 82, RULE_expressionIdentifierArray);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(386); ((ExpressionIdentifierArrayContext)_localctx).name = id();
			setState(387); match(25);
			setState(388); ((ExpressionIdentifierArrayContext)_localctx).argument = expression();
			setState(389); match(29);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class ExpressionMethodCallContext extends ParserRuleContext {
		public IdContext name;
		public Token methodName;
		public ExpressionContext headArgument;
		public ExpressionContext expression;
		public List<ExpressionContext> tailArguments = new ArrayList<ExpressionContext>();
		public IdContext id() {
			return getRuleContext(IdContext.class,0);
		}
		public ExpressionContext expression(int i) {
			return getRuleContext(ExpressionContext.class,i);
		}
		public List<ExpressionContext> expression() {
			return getRuleContexts(ExpressionContext.class);
		}
		public TerminalNode IDENT() { return getToken(MiniJavaParser.IDENT, 0); }
		public ExpressionMethodCallContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_expressionMethodCall; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof MiniJavaListener ) ((MiniJavaListener)listener).enterExpressionMethodCall(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof MiniJavaListener ) ((MiniJavaListener)listener).exitExpressionMethodCall(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof MiniJavaVisitor ) return ((MiniJavaVisitor<? extends T>)visitor).visitExpressionMethodCall(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ExpressionMethodCallContext expressionMethodCall() throws RecognitionException {
		ExpressionMethodCallContext _localctx = new ExpressionMethodCallContext(_ctx, getState());
		enterRule(_localctx, 84, RULE_expressionMethodCall);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(394);
			switch ( getInterpreter().adaptivePredict(_input,27,_ctx) ) {
			case 1:
				{
				setState(391); ((ExpressionMethodCallContext)_localctx).name = id();
				setState(392); match(22);
				}
				break;
			}
			setState(396); ((ExpressionMethodCallContext)_localctx).methodName = match(IDENT);
			setState(397); match(16);
			setState(406);
			_la = _input.LA(1);
			if ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << 2) | (1L << 3) | (1L << 16) | (1L << 19) | (1L << 21) | (1L << 31) | (1L << 36) | (1L << IDENT) | (1L << INT) | (1L << STRING))) != 0)) {
				{
				setState(398); ((ExpressionMethodCallContext)_localctx).headArgument = expression();
				setState(403);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while (_la==20) {
					{
					{
					setState(399); match(20);
					setState(400); ((ExpressionMethodCallContext)_localctx).expression = expression();
					((ExpressionMethodCallContext)_localctx).tailArguments.add(((ExpressionMethodCallContext)_localctx).expression);
					}
					}
					setState(405);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				}
			}

			setState(408); match(34);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class IdentifierContext extends ParserRuleContext {
		public Token IDENT;
		public List<Token> selectors = new ArrayList<Token>();
		public TerminalNode IDENT(int i) {
			return getToken(MiniJavaParser.IDENT, i);
		}
		public IdContext id() {
			return getRuleContext(IdContext.class,0);
		}
		public List<TerminalNode> IDENT() { return getTokens(MiniJavaParser.IDENT); }
		public IdentifierContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_identifier; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof MiniJavaListener ) ((MiniJavaListener)listener).enterIdentifier(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof MiniJavaListener ) ((MiniJavaListener)listener).exitIdentifier(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof MiniJavaVisitor ) return ((MiniJavaVisitor<? extends T>)visitor).visitIdentifier(this);
			else return visitor.visitChildren(this);
		}
	}

	public final IdentifierContext identifier() throws RecognitionException {
		IdentifierContext _localctx = new IdentifierContext(_ctx, getState());
		enterRule(_localctx, 86, RULE_identifier);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(410); id();
			setState(415);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==22) {
				{
				{
				setState(411); match(22);
				setState(412); ((IdentifierContext)_localctx).IDENT = match(IDENT);
				((IdentifierContext)_localctx).selectors.add(((IdentifierContext)_localctx).IDENT);
				}
				}
				setState(417);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class IdContext extends ParserRuleContext {
		public IdIDENTContext idIDENT() {
			return getRuleContext(IdIDENTContext.class,0);
		}
		public IdThisContext idThis() {
			return getRuleContext(IdThisContext.class,0);
		}
		public IdContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_id; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof MiniJavaListener ) ((MiniJavaListener)listener).enterId(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof MiniJavaListener ) ((MiniJavaListener)listener).exitId(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof MiniJavaVisitor ) return ((MiniJavaVisitor<? extends T>)visitor).visitId(this);
			else return visitor.visitChildren(this);
		}
	}

	public final IdContext id() throws RecognitionException {
		IdContext _localctx = new IdContext(_ctx, getState());
		enterRule(_localctx, 88, RULE_id);
		try {
			setState(420);
			switch (_input.LA(1)) {
			case 19:
				enterOuterAlt(_localctx, 1);
				{
				setState(418); idThis();
				}
				break;
			case IDENT:
				enterOuterAlt(_localctx, 2);
				{
				setState(419); idIDENT();
				}
				break;
			default:
				throw new NoViableAltException(this);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class IdThisContext extends ParserRuleContext {
		public IdThisContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_idThis; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof MiniJavaListener ) ((MiniJavaListener)listener).enterIdThis(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof MiniJavaListener ) ((MiniJavaListener)listener).exitIdThis(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof MiniJavaVisitor ) return ((MiniJavaVisitor<? extends T>)visitor).visitIdThis(this);
			else return visitor.visitChildren(this);
		}
	}

	public final IdThisContext idThis() throws RecognitionException {
		IdThisContext _localctx = new IdThisContext(_ctx, getState());
		enterRule(_localctx, 90, RULE_idThis);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(422); match(19);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class IdIDENTContext extends ParserRuleContext {
		public Token name;
		public TerminalNode IDENT() { return getToken(MiniJavaParser.IDENT, 0); }
		public IdIDENTContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_idIDENT; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof MiniJavaListener ) ((MiniJavaListener)listener).enterIdIDENT(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof MiniJavaListener ) ((MiniJavaListener)listener).exitIdIDENT(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof MiniJavaVisitor ) return ((MiniJavaVisitor<? extends T>)visitor).visitIdIDENT(this);
			else return visitor.visitChildren(this);
		}
	}

	public final IdIDENTContext idIDENT() throws RecognitionException {
		IdIDENTContext _localctx = new IdIDENTContext(_ctx, getState());
		enterRule(_localctx, 92, RULE_idIDENT);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(424); ((IdIDENTContext)_localctx).name = match(IDENT);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static final String _serializedATN =
		"\3\uacf5\uee8c\u4f5d\u8b0d\u4a45\u78bd\u1b2f\u3378\3+\u01ad\4\2\t\2\4"+
		"\3\t\3\4\4\t\4\4\5\t\5\4\6\t\6\4\7\t\7\4\b\t\b\4\t\t\t\4\n\t\n\4\13\t"+
		"\13\4\f\t\f\4\r\t\r\4\16\t\16\4\17\t\17\4\20\t\20\4\21\t\21\4\22\t\22"+
		"\4\23\t\23\4\24\t\24\4\25\t\25\4\26\t\26\4\27\t\27\4\30\t\30\4\31\t\31"+
		"\4\32\t\32\4\33\t\33\4\34\t\34\4\35\t\35\4\36\t\36\4\37\t\37\4 \t \4!"+
		"\t!\4\"\t\"\4#\t#\4$\t$\4%\t%\4&\t&\4\'\t\'\4(\t(\4)\t)\4*\t*\4+\t+\4"+
		",\t,\4-\t-\4.\t.\4/\t/\4\60\t\60\3\2\3\2\7\2c\n\2\f\2\16\2f\13\2\3\3\3"+
		"\3\3\3\3\3\5\3l\n\3\3\3\3\3\7\3p\n\3\f\3\16\3s\13\3\3\3\7\3v\n\3\f\3\16"+
		"\3y\13\3\3\3\3\3\3\4\3\4\3\4\3\4\3\4\3\4\3\4\3\4\3\4\3\4\3\4\3\4\3\4\3"+
		"\4\3\4\3\4\3\5\3\5\7\5\u008f\n\5\f\5\16\5\u0092\13\5\3\5\7\5\u0095\n\5"+
		"\f\5\16\5\u0098\13\5\3\5\3\5\3\6\3\6\3\6\3\7\3\7\3\7\3\b\3\b\5\b\u00a4"+
		"\n\b\3\t\3\t\3\t\5\t\u00a9\n\t\3\n\3\n\3\n\3\n\3\13\3\13\3\f\3\f\3\r\3"+
		"\r\3\16\5\16\u00b6\n\16\3\16\5\16\u00b9\n\16\3\16\3\16\3\16\3\16\3\16"+
		"\3\16\7\16\u00c1\n\16\f\16\16\16\u00c4\13\16\5\16\u00c6\n\16\3\16\3\16"+
		"\3\16\7\16\u00cb\n\16\f\16\16\16\u00ce\13\16\3\16\7\16\u00d1\n\16\f\16"+
		"\16\16\u00d4\13\16\3\16\3\16\3\16\3\17\3\17\5\17\u00db\n\17\3\20\3\20"+
		"\3\21\3\21\3\21\3\21\3\21\3\21\3\21\3\21\5\21\u00e7\n\21\3\22\3\22\3\22"+
		"\3\22\3\22\3\23\3\23\3\23\3\23\3\23\3\23\3\24\3\24\3\24\3\24\3\24\5\24"+
		"\u00f9\n\24\3\24\3\24\3\25\3\25\3\26\3\26\3\26\3\26\3\26\3\26\3\26\5\26"+
		"\u0106\n\26\3\27\3\27\3\27\3\27\3\27\3\27\3\30\3\30\3\30\3\30\3\30\3\30"+
		"\3\30\3\30\3\31\3\31\3\31\3\31\3\31\3\31\3\32\3\32\3\32\5\32\u011f\n\32"+
		"\3\32\3\32\3\32\3\32\3\32\7\32\u0126\n\32\f\32\16\32\u0129\13\32\5\32"+
		"\u012b\n\32\3\32\3\32\3\32\3\33\3\33\3\33\7\33\u0133\n\33\f\33\16\33\u0136"+
		"\13\33\3\34\3\34\3\34\7\34\u013b\n\34\f\34\16\34\u013e\13\34\3\35\3\35"+
		"\3\35\7\35\u0143\n\35\f\35\16\35\u0146\13\35\3\36\3\36\3\36\7\36\u014b"+
		"\n\36\f\36\16\36\u014e\13\36\3\37\3\37\3\37\7\37\u0153\n\37\f\37\16\37"+
		"\u0156\13\37\3 \3 \3 \3 \3 \3 \3 \3 \3 \3 \3 \3 \5 \u0164\n \3!\3!\3!"+
		"\3\"\3\"\3#\3#\3#\3#\3$\3$\3%\3%\3&\3&\3\'\3\'\3(\3(\3(\3)\3)\3)\3)\3"+
		")\3)\3*\3*\3*\3*\3*\3+\3+\3+\3+\3+\3,\3,\3,\5,\u018d\n,\3,\3,\3,\3,\3"+
		",\7,\u0194\n,\f,\16,\u0197\13,\5,\u0199\n,\3,\3,\3-\3-\3-\7-\u01a0\n-"+
		"\f-\16-\u01a3\13-\3.\3.\5.\u01a7\n.\3/\3/\3\60\3\60\3\60\2\61\2\4\6\b"+
		"\n\f\16\20\22\24\26\30\32\34\36 \"$&(*,.\60\62\64\668:<>@BDFHJLNPRTVX"+
		"Z\\^\2\3\3\2%&\u01ae\2`\3\2\2\2\4g\3\2\2\2\6|\3\2\2\2\b\u008c\3\2\2\2"+
		"\n\u009b\3\2\2\2\f\u009e\3\2\2\2\16\u00a3\3\2\2\2\20\u00a8\3\2\2\2\22"+
		"\u00aa\3\2\2\2\24\u00ae\3\2\2\2\26\u00b0\3\2\2\2\30\u00b2\3\2\2\2\32\u00b5"+
		"\3\2\2\2\34\u00da\3\2\2\2\36\u00dc\3\2\2\2 \u00e6\3\2\2\2\"\u00e8\3\2"+
		"\2\2$\u00ed\3\2\2\2&\u00f3\3\2\2\2(\u00fc\3\2\2\2*\u00fe\3\2\2\2,\u0107"+
		"\3\2\2\2.\u010d\3\2\2\2\60\u0115\3\2\2\2\62\u011e\3\2\2\2\64\u012f\3\2"+
		"\2\2\66\u0137\3\2\2\28\u013f\3\2\2\2:\u0147\3\2\2\2<\u014f\3\2\2\2>\u0163"+
		"\3\2\2\2@\u0165\3\2\2\2B\u0168\3\2\2\2D\u016a\3\2\2\2F\u016e\3\2\2\2H"+
		"\u0170\3\2\2\2J\u0172\3\2\2\2L\u0174\3\2\2\2N\u0176\3\2\2\2P\u0179\3\2"+
		"\2\2R\u017f\3\2\2\2T\u0184\3\2\2\2V\u018c\3\2\2\2X\u019c\3\2\2\2Z\u01a6"+
		"\3\2\2\2\\\u01a8\3\2\2\2^\u01aa\3\2\2\2`d\5\6\4\2ac\5\4\3\2ba\3\2\2\2"+
		"cf\3\2\2\2db\3\2\2\2de\3\2\2\2e\3\3\2\2\2fd\3\2\2\2gh\7\7\2\2hk\7\'\2"+
		"\2ij\7\17\2\2jl\7\'\2\2ki\3\2\2\2kl\3\2\2\2lm\3\2\2\2mq\7\13\2\2np\5\n"+
		"\6\2on\3\2\2\2ps\3\2\2\2qo\3\2\2\2qr\3\2\2\2rw\3\2\2\2sq\3\2\2\2tv\5\32"+
		"\16\2ut\3\2\2\2vy\3\2\2\2wu\3\2\2\2wx\3\2\2\2xz\3\2\2\2yw\3\2\2\2z{\7"+
		"\16\2\2{\5\3\2\2\2|}\7\7\2\2}~\7\'\2\2~\177\7\13\2\2\177\u0080\7 \2\2"+
		"\u0080\u0081\7\"\2\2\u0081\u0082\7\n\2\2\u0082\u0083\7\3\2\2\u0083\u0084"+
		"\7\22\2\2\u0084\u0085\7\36\2\2\u0085\u0086\7\33\2\2\u0086\u0087\7\37\2"+
		"\2\u0087\u0088\7\'\2\2\u0088\u0089\7$\2\2\u0089\u008a\5\b\5\2\u008a\u008b"+
		"\7\16\2\2\u008b\7\3\2\2\2\u008c\u0090\7\13\2\2\u008d\u008f\5\n\6\2\u008e"+
		"\u008d\3\2\2\2\u008f\u0092\3\2\2\2\u0090\u008e\3\2\2\2\u0090\u0091\3\2"+
		"\2\2\u0091\u0096\3\2\2\2\u0092\u0090\3\2\2\2\u0093\u0095\5 \21\2\u0094"+
		"\u0093\3\2\2\2\u0095\u0098\3\2\2\2\u0096\u0094\3\2\2\2\u0096\u0097\3\2"+
		"\2\2\u0097\u0099\3\2\2\2\u0098\u0096\3\2\2\2\u0099\u009a\7\16\2\2\u009a"+
		"\t\3\2\2\2\u009b\u009c\5\f\7\2\u009c\u009d\7\t\2\2\u009d\13\3\2\2\2\u009e"+
		"\u009f\5\16\b\2\u009f\u00a0\7\'\2\2\u00a0\r\3\2\2\2\u00a1\u00a4\5\20\t"+
		"\2\u00a2\u00a4\5\22\n\2\u00a3\u00a1\3\2\2\2\u00a3\u00a2\3\2\2\2\u00a4"+
		"\17\3\2\2\2\u00a5\u00a9\5\24\13\2\u00a6\u00a9\5\26\f\2\u00a7\u00a9\5\30"+
		"\r\2\u00a8\u00a5\3\2\2\2\u00a8\u00a6\3\2\2\2\u00a8\u00a7\3\2\2\2\u00a9"+
		"\21\3\2\2\2\u00aa\u00ab\5\20\t\2\u00ab\u00ac\7\33\2\2\u00ac\u00ad\7\37"+
		"\2\2\u00ad\23\3\2\2\2\u00ae\u00af\7\31\2\2\u00af\25\3\2\2\2\u00b0\u00b1"+
		"\7\21\2\2\u00b1\27\3\2\2\2\u00b2\u00b3\7\'\2\2\u00b3\31\3\2\2\2\u00b4"+
		"\u00b6\7 \2\2\u00b5\u00b4\3\2\2\2\u00b5\u00b6\3\2\2\2\u00b6\u00b8\3\2"+
		"\2\2\u00b7\u00b9\7\"\2\2\u00b8\u00b7\3\2\2\2\u00b8\u00b9\3\2\2\2\u00b9"+
		"\u00ba\3\2\2\2\u00ba\u00bb\5\34\17\2\u00bb\u00bc\7\'\2\2\u00bc\u00c5\7"+
		"\22\2\2\u00bd\u00c2\5\f\7\2\u00be\u00bf\7\26\2\2\u00bf\u00c1\5\f\7\2\u00c0"+
		"\u00be\3\2\2\2\u00c1\u00c4\3\2\2\2\u00c2\u00c0\3\2\2\2\u00c2\u00c3\3\2"+
		"\2\2\u00c3\u00c6\3\2\2\2\u00c4\u00c2\3\2\2\2\u00c5\u00bd\3\2\2\2\u00c5"+
		"\u00c6\3\2\2\2\u00c6\u00c7\3\2\2\2\u00c7\u00c8\7$\2\2\u00c8\u00cc\7\13"+
		"\2\2\u00c9\u00cb\5\n\6\2\u00ca\u00c9\3\2\2\2\u00cb\u00ce\3\2\2\2\u00cc"+
		"\u00ca\3\2\2\2\u00cc\u00cd\3\2\2\2\u00cd\u00d2\3\2\2\2\u00ce\u00cc\3\2"+
		"\2\2\u00cf\u00d1\5 \21\2\u00d0\u00cf\3\2\2\2\u00d1\u00d4\3\2\2\2\u00d2"+
		"\u00d0\3\2\2\2\u00d2\u00d3\3\2\2\2\u00d3\u00d5\3\2\2\2\u00d4\u00d2\3\2"+
		"\2\2\u00d5\u00d6\5&\24\2\u00d6\u00d7\7\16\2\2\u00d7\33\3\2\2\2\u00d8\u00db"+
		"\5\36\20\2\u00d9\u00db\5\16\b\2\u00da\u00d8\3\2\2\2\u00da\u00d9\3\2\2"+
		"\2\u00db\35\3\2\2\2\u00dc\u00dd\7\n\2\2\u00dd\37\3\2\2\2\u00de\u00e7\5"+
		"\"\22\2\u00df\u00e7\5$\23\2\u00e0\u00e7\5(\25\2\u00e1\u00e7\5*\26\2\u00e2"+
		"\u00e7\5,\27\2\u00e3\u00e7\5.\30\2\u00e4\u00e7\5\60\31\2\u00e5\u00e7\5"+
		"\62\32\2\u00e6\u00de\3\2\2\2\u00e6\u00df\3\2\2\2\u00e6\u00e0\3\2\2\2\u00e6"+
		"\u00e1\3\2\2\2\u00e6\u00e2\3\2\2\2\u00e6\u00e3\3\2\2\2\u00e6\u00e4\3\2"+
		"\2\2\u00e6\u00e5\3\2\2\2\u00e7!\3\2\2\2\u00e8\u00e9\5Z.\2\u00e9\u00ea"+
		"\7\r\2\2\u00ea\u00eb\5\64\33\2\u00eb\u00ec\7\t\2\2\u00ec#\3\2\2\2\u00ed"+
		"\u00ee\7\32\2\2\u00ee\u00ef\7\22\2\2\u00ef\u00f0\5\64\33\2\u00f0\u00f1"+
		"\7$\2\2\u00f1\u00f2\7\t\2\2\u00f2%\3\2\2\2\u00f3\u00f8\7\6\2\2\u00f4\u00f5"+
		"\7\22\2\2\u00f5\u00f6\5\64\33\2\u00f6\u00f7\7$\2\2\u00f7\u00f9\3\2\2\2"+
		"\u00f8\u00f4\3\2\2\2\u00f8\u00f9\3\2\2\2\u00f9\u00fa\3\2\2\2\u00fa\u00fb"+
		"\7\t\2\2\u00fb\'\3\2\2\2\u00fc\u00fd\5\b\5\2\u00fd)\3\2\2\2\u00fe\u00ff"+
		"\7\20\2\2\u00ff\u0100\7\22\2\2\u0100\u0101\5\64\33\2\u0101\u0102\7$\2"+
		"\2\u0102\u0105\5 \21\2\u0103\u0104\7#\2\2\u0104\u0106\5 \21\2\u0105\u0103"+
		"\3\2\2\2\u0105\u0106\3\2\2\2\u0106+\3\2\2\2\u0107\u0108\7\b\2\2\u0108"+
		"\u0109\7\22\2\2\u0109\u010a\5\64\33\2\u010a\u010b\7$\2\2\u010b\u010c\5"+
		" \21\2\u010c-\3\2\2\2\u010d\u010e\5Z.\2\u010e\u010f\7\33\2\2\u010f\u0110"+
		"\5\64\33\2\u0110\u0111\7\37\2\2\u0111\u0112\7\r\2\2\u0112\u0113\5\64\33"+
		"\2\u0113\u0114\7\t\2\2\u0114/\3\2\2\2\u0115\u0116\7\23\2\2\u0116\u0117"+
		"\7\22\2\2\u0117\u0118\5\64\33\2\u0118\u0119\7$\2\2\u0119\u011a\7\t\2\2"+
		"\u011a\61\3\2\2\2\u011b\u011c\5Z.\2\u011c\u011d\7\30\2\2\u011d\u011f\3"+
		"\2\2\2\u011e\u011b\3\2\2\2\u011e\u011f\3\2\2\2\u011f\u0120\3\2\2\2\u0120"+
		"\u0121\7\'\2\2\u0121\u012a\7\22\2\2\u0122\u0127\5\64\33\2\u0123\u0124"+
		"\7\26\2\2\u0124\u0126\5\64\33\2\u0125\u0123\3\2\2\2\u0126\u0129\3\2\2"+
		"\2\u0127\u0125\3\2\2\2\u0127\u0128\3\2\2\2\u0128\u012b\3\2\2\2\u0129\u0127"+
		"\3\2\2\2\u012a\u0122\3\2\2\2\u012a\u012b\3\2\2\2\u012b\u012c\3\2\2\2\u012c"+
		"\u012d\7$\2\2\u012d\u012e\7\t\2\2\u012e\63\3\2\2\2\u012f\u0134\5\66\34"+
		"\2\u0130\u0131\7\f\2\2\u0131\u0133\5\66\34\2\u0132\u0130\3\2\2\2\u0133"+
		"\u0136\3\2\2\2\u0134\u0132\3\2\2\2\u0134\u0135\3\2\2\2\u0135\65\3\2\2"+
		"\2\u0136\u0134\3\2\2\2\u0137\u013c\58\35\2\u0138\u0139\7\35\2\2\u0139"+
		"\u013b\58\35\2\u013a\u0138\3\2\2\2\u013b\u013e\3\2\2\2\u013c\u013a\3\2"+
		"\2\2\u013c\u013d\3\2\2\2\u013d\67\3\2\2\2\u013e\u013c\3\2\2\2\u013f\u0144"+
		"\5:\36\2\u0140\u0141\7\34\2\2\u0141\u0143\5:\36\2\u0142\u0140\3\2\2\2"+
		"\u0143\u0146\3\2\2\2\u0144\u0142\3\2\2\2\u0144\u0145\3\2\2\2\u01459\3"+
		"\2\2\2\u0146\u0144\3\2\2\2\u0147\u014c\5<\37\2\u0148\u0149\t\2\2\2\u0149"+
		"\u014b\5<\37\2\u014a\u0148\3\2\2\2\u014b\u014e\3\2\2\2\u014c\u014a\3\2"+
		"\2\2\u014c\u014d\3\2\2\2\u014d;\3\2\2\2\u014e\u014c\3\2\2\2\u014f\u0154"+
		"\5> \2\u0150\u0151\7\24\2\2\u0151\u0153\5> \2\u0152\u0150\3\2\2\2\u0153"+
		"\u0156\3\2\2\2\u0154\u0152\3\2\2\2\u0154\u0155\3\2\2\2\u0155=\3\2\2\2"+
		"\u0156\u0154\3\2\2\2\u0157\u0164\5@!\2\u0158\u0164\5B\"\2\u0159\u0164"+
		"\5D#\2\u015a\u0164\5F$\2\u015b\u0164\5H%\2\u015c\u0164\5J&\2\u015d\u0164"+
		"\5L\'\2\u015e\u0164\5N(\2\u015f\u0164\5P)\2\u0160\u0164\5R*\2\u0161\u0164"+
		"\5T+\2\u0162\u0164\5V,\2\u0163\u0157\3\2\2\2\u0163\u0158\3\2\2\2\u0163"+
		"\u0159\3\2\2\2\u0163\u015a\3\2\2\2\u0163\u015b\3\2\2\2\u0163\u015c\3\2"+
		"\2\2\u0163\u015d\3\2\2\2\u0163\u015e\3\2\2\2\u0163\u015f\3\2\2\2\u0163"+
		"\u0160\3\2\2\2\u0163\u0161\3\2\2\2\u0163\u0162\3\2\2\2\u0164?\3\2\2\2"+
		"\u0165\u0166\7&\2\2\u0166\u0167\5> \2\u0167A\3\2\2\2\u0168\u0169\5Z.\2"+
		"\u0169C\3\2\2\2\u016a\u016b\7\22\2\2\u016b\u016c\5\64\33\2\u016c\u016d"+
		"\7$\2\2\u016dE\3\2\2\2\u016e\u016f\7\5\2\2\u016fG\3\2\2\2\u0170\u0171"+
		"\7\27\2\2\u0171I\3\2\2\2\u0172\u0173\7(\2\2\u0173K\3\2\2\2\u0174\u0175"+
		"\7)\2\2\u0175M\3\2\2\2\u0176\u0177\7!\2\2\u0177\u0178\5> \2\u0178O\3\2"+
		"\2\2\u0179\u017a\7\4\2\2\u017a\u017b\7\21\2\2\u017b\u017c\7\33\2\2\u017c"+
		"\u017d\5\64\33\2\u017d\u017e\7\37\2\2\u017eQ\3\2\2\2\u017f\u0180\7\4\2"+
		"\2\u0180\u0181\7\'\2\2\u0181\u0182\7\22\2\2\u0182\u0183\7$\2\2\u0183S"+
		"\3\2\2\2\u0184\u0185\5Z.\2\u0185\u0186\7\33\2\2\u0186\u0187\5\64\33\2"+
		"\u0187\u0188\7\37\2\2\u0188U\3\2\2\2\u0189\u018a\5Z.\2\u018a\u018b\7\30"+
		"\2\2\u018b\u018d\3\2\2\2\u018c\u0189\3\2\2\2\u018c\u018d\3\2\2\2\u018d"+
		"\u018e\3\2\2\2\u018e\u018f\7\'\2\2\u018f\u0198\7\22\2\2\u0190\u0195\5"+
		"\64\33\2\u0191\u0192\7\26\2\2\u0192\u0194\5\64\33\2\u0193\u0191\3\2\2"+
		"\2\u0194\u0197\3\2\2\2\u0195\u0193\3\2\2\2\u0195\u0196\3\2\2\2\u0196\u0199"+
		"\3\2\2\2\u0197\u0195\3\2\2\2\u0198\u0190\3\2\2\2\u0198\u0199\3\2\2\2\u0199"+
		"\u019a\3\2\2\2\u019a\u019b\7$\2\2\u019bW\3\2\2\2\u019c\u01a1\5Z.\2\u019d"+
		"\u019e\7\30\2\2\u019e\u01a0\7\'\2\2\u019f\u019d\3\2\2\2\u01a0\u01a3\3"+
		"\2\2\2\u01a1\u019f\3\2\2\2\u01a1\u01a2\3\2\2\2\u01a2Y\3\2\2\2\u01a3\u01a1"+
		"\3\2\2\2\u01a4\u01a7\5\\/\2\u01a5\u01a7\5^\60\2\u01a6\u01a4\3\2\2\2\u01a6"+
		"\u01a5\3\2\2\2\u01a7[\3\2\2\2\u01a8\u01a9\7\25\2\2\u01a9]\3\2\2\2\u01aa"+
		"\u01ab\7\'\2\2\u01ab_\3\2\2\2\"dkqw\u0090\u0096\u00a3\u00a8\u00b5\u00b8"+
		"\u00c2\u00c5\u00cc\u00d2\u00da\u00e6\u00f8\u0105\u011e\u0127\u012a\u0134"+
		"\u013c\u0144\u014c\u0154\u0163\u018c\u0195\u0198\u01a1\u01a6";
	public static final ATN _ATN =
		ATNSimulator.deserialize(_serializedATN.toCharArray());
	static {
		_decisionToDFA = new DFA[_ATN.getNumberOfDecisions()];
		for (int i = 0; i < _ATN.getNumberOfDecisions(); i++) {
			_decisionToDFA[i] = new DFA(_ATN.getDecisionState(i), i);
		}
	}
}