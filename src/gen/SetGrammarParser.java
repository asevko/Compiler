package gen;// Generated from /Users/alexeisevko/IdeaProjects/Compiler/SetGrammar.g4 by ANTLR 4.7
import org.antlr.v4.runtime.atn.*;
import org.antlr.v4.runtime.dfa.DFA;
import org.antlr.v4.runtime.*;
import org.antlr.v4.runtime.misc.*;
import org.antlr.v4.runtime.tree.*;
import java.util.List;
import java.util.Iterator;
import java.util.ArrayList;

@SuppressWarnings({"all", "warnings", "unchecked", "unused", "cast"})
public class SetGrammarParser extends Parser {
	static { RuntimeMetaData.checkVersion("4.7", RuntimeMetaData.VERSION); }

	protected static final DFA[] _decisionToDFA;
	protected static final PredictionContextCache _sharedContextCache =
		new PredictionContextCache();
	public static final int
		OPEN_BRACKET=1, CLOSE_BRACKET=2, OPEN_CURLY_BRACKET=3, CLOSE_CURLY_BRACKET=4, 
		OPEN_SQUARE_BRACKET=5, CLOSE_SQUARE_BRACKET=6, ELEMENT=7, SET=8, LET=9, 
		FOREACH=10, IN=11, IF=12, ELSE=13, WHILE=14, MAIN=15, FUNCTION=16, RETURN=17, 
		VOID=18, PRINT=19, GET=20, CONTAINS=21, POWER=22, HAS_NEXT=23, ASSIGN=24, 
		DOT=25, COMMA=26, COLON=27, ARROW=28, PLUS=29, MINUS=30, MULTIPLY=31, 
		DIVIDE=32, NEGATION=33, EQUAL=34, NON_EQUAL=35, LESS=36, GREATER=37, SPACE=38, 
		NAME=39, NUMBER=40, LINE=41;
	public static final int
		RULE_program = 0, RULE_type = 1, RULE_void_sign = 2, RULE_block = 3, RULE_declaration = 4, 
		RULE_declaration_element = 5, RULE_set_expression = 6, RULE_function_call = 7, 
		RULE_input_signature = 8, RULE_single_arg_pattern = 9, RULE_non_single_args_pattern = 10, 
		RULE_function_signature = 11, RULE_functionHeader = 12, RULE_non_void_function = 13, 
		RULE_void_function = 14, RULE_block_return = 15, RULE_block_non_return = 16, 
		RULE_equals = 17, RULE_compare = 18, RULE_simple_compare = 19, RULE_negation_compare = 20, 
		RULE_if_block = 21, RULE_else_block = 22, RULE_while_block = 23, RULE_forEach = 24, 
		RULE_print = 25, RULE_get_expression = 26, RULE_has_next = 27, RULE_power = 28, 
		RULE_contains = 29, RULE_body = 30, RULE_expression = 31;
	public static final String[] ruleNames = {
		"program", "type", "void_sign", "block", "declaration", "declaration_element", 
		"set_expression", "function_call", "input_signature", "single_arg_pattern", 
		"non_single_args_pattern", "function_signature", "functionHeader", "non_void_function", 
		"void_function", "block_return", "block_non_return", "equals", "compare", 
		"simple_compare", "negation_compare", "if_block", "else_block", "while_block", 
		"forEach", "print", "get_expression", "has_next", "power", "contains", 
		"body", "expression"
	};

	private static final String[] _LITERAL_NAMES = {
		null, "'('", "')'", "'{'", "'}'", "'['", "']'", "'element'", "'set'", 
		"'let'", "'forEach'", "'in'", "'if'", "'else'", "'while'", "'main'", "'func'", 
		"'return'", "'void'", "'print'", "'get'", "'contains'", "'power'", "'hasNext'", 
		"'='", "'.'", "','", "':'", "'->'", "'+'", "'-'", "'*'", "'/'", "'!'", 
		"'=='", "'!='", "'<'", "'>'"
	};
	private static final String[] _SYMBOLIC_NAMES = {
		null, "OPEN_BRACKET", "CLOSE_BRACKET", "OPEN_CURLY_BRACKET", "CLOSE_CURLY_BRACKET", 
		"OPEN_SQUARE_BRACKET", "CLOSE_SQUARE_BRACKET", "ELEMENT", "SET", "LET", 
		"FOREACH", "IN", "IF", "ELSE", "WHILE", "MAIN", "FUNCTION", "RETURN", 
		"VOID", "PRINT", "GET", "CONTAINS", "POWER", "HAS_NEXT", "ASSIGN", "DOT", 
		"COMMA", "COLON", "ARROW", "PLUS", "MINUS", "MULTIPLY", "DIVIDE", "NEGATION", 
		"EQUAL", "NON_EQUAL", "LESS", "GREATER", "SPACE", "NAME", "NUMBER", "LINE"
	};
	public static final Vocabulary VOCABULARY = new VocabularyImpl(_LITERAL_NAMES, _SYMBOLIC_NAMES);

	/**
	 * @deprecated Use {@link #VOCABULARY} instead.
	 */
	@Deprecated
	public static final String[] tokenNames;
	static {
		tokenNames = new String[_SYMBOLIC_NAMES.length];
		for (int i = 0; i < tokenNames.length; i++) {
			tokenNames[i] = VOCABULARY.getLiteralName(i);
			if (tokenNames[i] == null) {
				tokenNames[i] = VOCABULARY.getSymbolicName(i);
			}

			if (tokenNames[i] == null) {
				tokenNames[i] = "<INVALID>";
			}
		}
	}

	@Override
	@Deprecated
	public String[] getTokenNames() {
		return tokenNames;
	}

	@Override

	public Vocabulary getVocabulary() {
		return VOCABULARY;
	}

	@Override
	public String getGrammarFileName() { return "SetGrammar.g4"; }

	@Override
	public String[] getRuleNames() { return ruleNames; }

	@Override
	public String getSerializedATN() { return _serializedATN; }

	@Override
	public ATN getATN() { return _ATN; }

	public SetGrammarParser(TokenStream input) {
		super(input);
		_interp = new ParserATNSimulator(this,_ATN,_decisionToDFA,_sharedContextCache);
	}
	public static class ProgramContext extends ParserRuleContext {
		public TerminalNode MAIN() { return getToken(SetGrammarParser.MAIN, 0); }
		public BlockContext block() {
			return getRuleContext(BlockContext.class,0);
		}
		public List<Void_functionContext> void_function() {
			return getRuleContexts(Void_functionContext.class);
		}
		public Void_functionContext void_function(int i) {
			return getRuleContext(Void_functionContext.class,i);
		}
		public List<Non_void_functionContext> non_void_function() {
			return getRuleContexts(Non_void_functionContext.class);
		}
		public Non_void_functionContext non_void_function(int i) {
			return getRuleContext(Non_void_functionContext.class,i);
		}
		public ProgramContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_program; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SetGrammarListener ) ((SetGrammarListener)listener).enterProgram(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SetGrammarListener ) ((SetGrammarListener)listener).exitProgram(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SetGrammarVisitor ) return ((SetGrammarVisitor<? extends T>)visitor).visitProgram(this);
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
			setState(68);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==FUNCTION) {
				{
				setState(66);
				_errHandler.sync(this);
				switch ( getInterpreter().adaptivePredict(_input,0,_ctx) ) {
				case 1:
					{
					setState(64);
					void_function();
					}
					break;
				case 2:
					{
					setState(65);
					non_void_function();
					}
					break;
				}
				}
				setState(70);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(71);
			match(MAIN);
			setState(72);
			block();
			setState(77);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==FUNCTION) {
				{
				setState(75);
				_errHandler.sync(this);
				switch ( getInterpreter().adaptivePredict(_input,2,_ctx) ) {
				case 1:
					{
					setState(73);
					void_function();
					}
					break;
				case 2:
					{
					setState(74);
					non_void_function();
					}
					break;
				}
				}
				setState(79);
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

	public static class TypeContext extends ParserRuleContext {
		public TerminalNode ELEMENT() { return getToken(SetGrammarParser.ELEMENT, 0); }
		public TerminalNode SET() { return getToken(SetGrammarParser.SET, 0); }
		public TypeContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_type; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SetGrammarListener ) ((SetGrammarListener)listener).enterType(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SetGrammarListener ) ((SetGrammarListener)listener).exitType(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SetGrammarVisitor ) return ((SetGrammarVisitor<? extends T>)visitor).visitType(this);
			else return visitor.visitChildren(this);
		}
	}

	public final TypeContext type() throws RecognitionException {
		TypeContext _localctx = new TypeContext(_ctx, getState());
		enterRule(_localctx, 2, RULE_type);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(80);
			_la = _input.LA(1);
			if ( !(_la==ELEMENT || _la==SET) ) {
			_errHandler.recoverInline(this);
			}
			else {
				if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
				_errHandler.reportMatch(this);
				consume();
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

	public static class Void_signContext extends ParserRuleContext {
		public TerminalNode OPEN_BRACKET() { return getToken(SetGrammarParser.OPEN_BRACKET, 0); }
		public TerminalNode CLOSE_BRACKET() { return getToken(SetGrammarParser.CLOSE_BRACKET, 0); }
		public Void_signContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_void_sign; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SetGrammarListener ) ((SetGrammarListener)listener).enterVoid_sign(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SetGrammarListener ) ((SetGrammarListener)listener).exitVoid_sign(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SetGrammarVisitor ) return ((SetGrammarVisitor<? extends T>)visitor).visitVoid_sign(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Void_signContext void_sign() throws RecognitionException {
		Void_signContext _localctx = new Void_signContext(_ctx, getState());
		enterRule(_localctx, 4, RULE_void_sign);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(82);
			match(OPEN_BRACKET);
			setState(83);
			match(CLOSE_BRACKET);
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
		public TerminalNode OPEN_CURLY_BRACKET() { return getToken(SetGrammarParser.OPEN_CURLY_BRACKET, 0); }
		public TerminalNode CLOSE_CURLY_BRACKET() { return getToken(SetGrammarParser.CLOSE_CURLY_BRACKET, 0); }
		public List<BodyContext> body() {
			return getRuleContexts(BodyContext.class);
		}
		public BodyContext body(int i) {
			return getRuleContext(BodyContext.class,i);
		}
		public BlockContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_block; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SetGrammarListener ) ((SetGrammarListener)listener).enterBlock(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SetGrammarListener ) ((SetGrammarListener)listener).exitBlock(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SetGrammarVisitor ) return ((SetGrammarVisitor<? extends T>)visitor).visitBlock(this);
			else return visitor.visitChildren(this);
		}
	}

	public final BlockContext block() throws RecognitionException {
		BlockContext _localctx = new BlockContext(_ctx, getState());
		enterRule(_localctx, 6, RULE_block);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(85);
			match(OPEN_CURLY_BRACKET);
			setState(89);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << LET) | (1L << FOREACH) | (1L << IF) | (1L << WHILE) | (1L << PRINT) | (1L << NAME))) != 0)) {
				{
				{
				setState(86);
				body();
				}
				}
				setState(91);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(92);
			match(CLOSE_CURLY_BRACKET);
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

	public static class DeclarationContext extends ParserRuleContext {
		public TerminalNode LET() { return getToken(SetGrammarParser.LET, 0); }
		public TerminalNode NAME() { return getToken(SetGrammarParser.NAME, 0); }
		public TerminalNode ASSIGN() { return getToken(SetGrammarParser.ASSIGN, 0); }
		public ExpressionContext expression() {
			return getRuleContext(ExpressionContext.class,0);
		}
		public TerminalNode COLON() { return getToken(SetGrammarParser.COLON, 0); }
		public TerminalNode SET() { return getToken(SetGrammarParser.SET, 0); }
		public DeclarationContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_declaration; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SetGrammarListener ) ((SetGrammarListener)listener).enterDeclaration(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SetGrammarListener ) ((SetGrammarListener)listener).exitDeclaration(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SetGrammarVisitor ) return ((SetGrammarVisitor<? extends T>)visitor).visitDeclaration(this);
			else return visitor.visitChildren(this);
		}
	}

	public final DeclarationContext declaration() throws RecognitionException {
		DeclarationContext _localctx = new DeclarationContext(_ctx, getState());
		enterRule(_localctx, 8, RULE_declaration);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(94);
			match(LET);
			setState(95);
			match(NAME);
			setState(98);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==COLON) {
				{
				setState(96);
				match(COLON);
				setState(97);
				match(SET);
				}
			}

			setState(100);
			match(ASSIGN);
			setState(101);
			expression();
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

	public static class Declaration_elementContext extends ParserRuleContext {
		public TerminalNode LET() { return getToken(SetGrammarParser.LET, 0); }
		public TerminalNode NAME() { return getToken(SetGrammarParser.NAME, 0); }
		public TerminalNode ASSIGN() { return getToken(SetGrammarParser.ASSIGN, 0); }
		public TerminalNode LINE() { return getToken(SetGrammarParser.LINE, 0); }
		public Function_callContext function_call() {
			return getRuleContext(Function_callContext.class,0);
		}
		public Get_expressionContext get_expression() {
			return getRuleContext(Get_expressionContext.class,0);
		}
		public TerminalNode COLON() { return getToken(SetGrammarParser.COLON, 0); }
		public TerminalNode ELEMENT() { return getToken(SetGrammarParser.ELEMENT, 0); }
		public Declaration_elementContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_declaration_element; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SetGrammarListener ) ((SetGrammarListener)listener).enterDeclaration_element(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SetGrammarListener ) ((SetGrammarListener)listener).exitDeclaration_element(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SetGrammarVisitor ) return ((SetGrammarVisitor<? extends T>)visitor).visitDeclaration_element(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Declaration_elementContext declaration_element() throws RecognitionException {
		Declaration_elementContext _localctx = new Declaration_elementContext(_ctx, getState());
		enterRule(_localctx, 10, RULE_declaration_element);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(103);
			match(LET);
			setState(104);
			match(NAME);
			setState(107);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==COLON) {
				{
				setState(105);
				match(COLON);
				setState(106);
				match(ELEMENT);
				}
			}

			setState(109);
			match(ASSIGN);
			setState(113);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,7,_ctx) ) {
			case 1:
				{
				setState(110);
				match(LINE);
				}
				break;
			case 2:
				{
				setState(111);
				function_call();
				}
				break;
			case 3:
				{
				setState(112);
				get_expression();
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

	public static class Set_expressionContext extends ParserRuleContext {
		public TerminalNode OPEN_CURLY_BRACKET() { return getToken(SetGrammarParser.OPEN_CURLY_BRACKET, 0); }
		public List<TerminalNode> NAME() { return getTokens(SetGrammarParser.NAME); }
		public TerminalNode NAME(int i) {
			return getToken(SetGrammarParser.NAME, i);
		}
		public TerminalNode CLOSE_CURLY_BRACKET() { return getToken(SetGrammarParser.CLOSE_CURLY_BRACKET, 0); }
		public List<TerminalNode> COMMA() { return getTokens(SetGrammarParser.COMMA); }
		public TerminalNode COMMA(int i) {
			return getToken(SetGrammarParser.COMMA, i);
		}
		public Set_expressionContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_set_expression; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SetGrammarListener ) ((SetGrammarListener)listener).enterSet_expression(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SetGrammarListener ) ((SetGrammarListener)listener).exitSet_expression(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SetGrammarVisitor ) return ((SetGrammarVisitor<? extends T>)visitor).visitSet_expression(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Set_expressionContext set_expression() throws RecognitionException {
		Set_expressionContext _localctx = new Set_expressionContext(_ctx, getState());
		enterRule(_localctx, 12, RULE_set_expression);
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(115);
			match(OPEN_CURLY_BRACKET);
			setState(120);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,8,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					{
					{
					setState(116);
					match(NAME);
					setState(117);
					match(COMMA);
					}
					} 
				}
				setState(122);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,8,_ctx);
			}
			setState(123);
			match(NAME);
			setState(124);
			match(CLOSE_CURLY_BRACKET);
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

	public static class Function_callContext extends ParserRuleContext {
		public TerminalNode NAME() { return getToken(SetGrammarParser.NAME, 0); }
		public Input_signatureContext input_signature() {
			return getRuleContext(Input_signatureContext.class,0);
		}
		public TerminalNode OPEN_BRACKET() { return getToken(SetGrammarParser.OPEN_BRACKET, 0); }
		public TerminalNode CLOSE_BRACKET() { return getToken(SetGrammarParser.CLOSE_BRACKET, 0); }
		public Function_callContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_function_call; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SetGrammarListener ) ((SetGrammarListener)listener).enterFunction_call(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SetGrammarListener ) ((SetGrammarListener)listener).exitFunction_call(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SetGrammarVisitor ) return ((SetGrammarVisitor<? extends T>)visitor).visitFunction_call(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Function_callContext function_call() throws RecognitionException {
		Function_callContext _localctx = new Function_callContext(_ctx, getState());
		enterRule(_localctx, 14, RULE_function_call);
		try {
			enterOuterAlt(_localctx, 1);
			{
			{
			setState(126);
			match(NAME);
			setState(130);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,9,_ctx) ) {
			case 1:
				{
				setState(127);
				input_signature();
				}
				break;
			case 2:
				{
				{
				setState(128);
				match(OPEN_BRACKET);
				setState(129);
				match(CLOSE_BRACKET);
				}
				}
				break;
			}
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

	public static class Input_signatureContext extends ParserRuleContext {
		public TerminalNode OPEN_BRACKET() { return getToken(SetGrammarParser.OPEN_BRACKET, 0); }
		public List<TerminalNode> NAME() { return getTokens(SetGrammarParser.NAME); }
		public TerminalNode NAME(int i) {
			return getToken(SetGrammarParser.NAME, i);
		}
		public TerminalNode CLOSE_BRACKET() { return getToken(SetGrammarParser.CLOSE_BRACKET, 0); }
		public List<TerminalNode> COMMA() { return getTokens(SetGrammarParser.COMMA); }
		public TerminalNode COMMA(int i) {
			return getToken(SetGrammarParser.COMMA, i);
		}
		public Input_signatureContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_input_signature; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SetGrammarListener ) ((SetGrammarListener)listener).enterInput_signature(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SetGrammarListener ) ((SetGrammarListener)listener).exitInput_signature(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SetGrammarVisitor ) return ((SetGrammarVisitor<? extends T>)visitor).visitInput_signature(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Input_signatureContext input_signature() throws RecognitionException {
		Input_signatureContext _localctx = new Input_signatureContext(_ctx, getState());
		enterRule(_localctx, 16, RULE_input_signature);
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(132);
			match(OPEN_BRACKET);
			setState(137);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,10,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					{
					{
					setState(133);
					match(NAME);
					setState(134);
					match(COMMA);
					}
					} 
				}
				setState(139);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,10,_ctx);
			}
			setState(140);
			match(NAME);
			setState(141);
			match(CLOSE_BRACKET);
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

	public static class Single_arg_patternContext extends ParserRuleContext {
		public TerminalNode NAME() { return getToken(SetGrammarParser.NAME, 0); }
		public TerminalNode COLON() { return getToken(SetGrammarParser.COLON, 0); }
		public TypeContext type() {
			return getRuleContext(TypeContext.class,0);
		}
		public Single_arg_patternContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_single_arg_pattern; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SetGrammarListener ) ((SetGrammarListener)listener).enterSingle_arg_pattern(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SetGrammarListener ) ((SetGrammarListener)listener).exitSingle_arg_pattern(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SetGrammarVisitor ) return ((SetGrammarVisitor<? extends T>)visitor).visitSingle_arg_pattern(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Single_arg_patternContext single_arg_pattern() throws RecognitionException {
		Single_arg_patternContext _localctx = new Single_arg_patternContext(_ctx, getState());
		enterRule(_localctx, 18, RULE_single_arg_pattern);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(143);
			match(NAME);
			setState(144);
			match(COLON);
			setState(145);
			type();
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

	public static class Non_single_args_patternContext extends ParserRuleContext {
		public Single_arg_patternContext single_arg_pattern() {
			return getRuleContext(Single_arg_patternContext.class,0);
		}
		public TerminalNode COMMA() { return getToken(SetGrammarParser.COMMA, 0); }
		public Non_single_args_patternContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_non_single_args_pattern; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SetGrammarListener ) ((SetGrammarListener)listener).enterNon_single_args_pattern(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SetGrammarListener ) ((SetGrammarListener)listener).exitNon_single_args_pattern(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SetGrammarVisitor ) return ((SetGrammarVisitor<? extends T>)visitor).visitNon_single_args_pattern(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Non_single_args_patternContext non_single_args_pattern() throws RecognitionException {
		Non_single_args_patternContext _localctx = new Non_single_args_patternContext(_ctx, getState());
		enterRule(_localctx, 20, RULE_non_single_args_pattern);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(147);
			single_arg_pattern();
			setState(148);
			match(COMMA);
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

	public static class Function_signatureContext extends ParserRuleContext {
		public TerminalNode OPEN_BRACKET() { return getToken(SetGrammarParser.OPEN_BRACKET, 0); }
		public Single_arg_patternContext single_arg_pattern() {
			return getRuleContext(Single_arg_patternContext.class,0);
		}
		public TerminalNode CLOSE_BRACKET() { return getToken(SetGrammarParser.CLOSE_BRACKET, 0); }
		public List<Non_single_args_patternContext> non_single_args_pattern() {
			return getRuleContexts(Non_single_args_patternContext.class);
		}
		public Non_single_args_patternContext non_single_args_pattern(int i) {
			return getRuleContext(Non_single_args_patternContext.class,i);
		}
		public Function_signatureContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_function_signature; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SetGrammarListener ) ((SetGrammarListener)listener).enterFunction_signature(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SetGrammarListener ) ((SetGrammarListener)listener).exitFunction_signature(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SetGrammarVisitor ) return ((SetGrammarVisitor<? extends T>)visitor).visitFunction_signature(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Function_signatureContext function_signature() throws RecognitionException {
		Function_signatureContext _localctx = new Function_signatureContext(_ctx, getState());
		enterRule(_localctx, 22, RULE_function_signature);
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(150);
			match(OPEN_BRACKET);
			setState(154);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,11,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					{
					{
					setState(151);
					non_single_args_pattern();
					}
					} 
				}
				setState(156);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,11,_ctx);
			}
			setState(157);
			single_arg_pattern();
			setState(158);
			match(CLOSE_BRACKET);
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

	public static class FunctionHeaderContext extends ParserRuleContext {
		public TerminalNode FUNCTION() { return getToken(SetGrammarParser.FUNCTION, 0); }
		public TerminalNode NAME() { return getToken(SetGrammarParser.NAME, 0); }
		public Function_signatureContext function_signature() {
			return getRuleContext(Function_signatureContext.class,0);
		}
		public Void_signContext void_sign() {
			return getRuleContext(Void_signContext.class,0);
		}
		public FunctionHeaderContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_functionHeader; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SetGrammarListener ) ((SetGrammarListener)listener).enterFunctionHeader(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SetGrammarListener ) ((SetGrammarListener)listener).exitFunctionHeader(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SetGrammarVisitor ) return ((SetGrammarVisitor<? extends T>)visitor).visitFunctionHeader(this);
			else return visitor.visitChildren(this);
		}
	}

	public final FunctionHeaderContext functionHeader() throws RecognitionException {
		FunctionHeaderContext _localctx = new FunctionHeaderContext(_ctx, getState());
		enterRule(_localctx, 24, RULE_functionHeader);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(160);
			match(FUNCTION);
			setState(161);
			match(NAME);
			setState(164);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,12,_ctx) ) {
			case 1:
				{
				setState(162);
				function_signature();
				}
				break;
			case 2:
				{
				setState(163);
				void_sign();
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

	public static class Non_void_functionContext extends ParserRuleContext {
		public FunctionHeaderContext functionHeader() {
			return getRuleContext(FunctionHeaderContext.class,0);
		}
		public TerminalNode ARROW() { return getToken(SetGrammarParser.ARROW, 0); }
		public TypeContext type() {
			return getRuleContext(TypeContext.class,0);
		}
		public Block_returnContext block_return() {
			return getRuleContext(Block_returnContext.class,0);
		}
		public Non_void_functionContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_non_void_function; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SetGrammarListener ) ((SetGrammarListener)listener).enterNon_void_function(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SetGrammarListener ) ((SetGrammarListener)listener).exitNon_void_function(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SetGrammarVisitor ) return ((SetGrammarVisitor<? extends T>)visitor).visitNon_void_function(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Non_void_functionContext non_void_function() throws RecognitionException {
		Non_void_functionContext _localctx = new Non_void_functionContext(_ctx, getState());
		enterRule(_localctx, 26, RULE_non_void_function);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(166);
			functionHeader();
			setState(167);
			match(ARROW);
			setState(168);
			type();
			setState(169);
			block_return();
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

	public static class Void_functionContext extends ParserRuleContext {
		public FunctionHeaderContext functionHeader() {
			return getRuleContext(FunctionHeaderContext.class,0);
		}
		public Block_non_returnContext block_non_return() {
			return getRuleContext(Block_non_returnContext.class,0);
		}
		public TerminalNode ARROW() { return getToken(SetGrammarParser.ARROW, 0); }
		public Void_signContext void_sign() {
			return getRuleContext(Void_signContext.class,0);
		}
		public TerminalNode OPEN_BRACKET() { return getToken(SetGrammarParser.OPEN_BRACKET, 0); }
		public TerminalNode VOID() { return getToken(SetGrammarParser.VOID, 0); }
		public TerminalNode CLOSE_BRACKET() { return getToken(SetGrammarParser.CLOSE_BRACKET, 0); }
		public Void_functionContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_void_function; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SetGrammarListener ) ((SetGrammarListener)listener).enterVoid_function(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SetGrammarListener ) ((SetGrammarListener)listener).exitVoid_function(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SetGrammarVisitor ) return ((SetGrammarVisitor<? extends T>)visitor).visitVoid_function(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Void_functionContext void_function() throws RecognitionException {
		Void_functionContext _localctx = new Void_functionContext(_ctx, getState());
		enterRule(_localctx, 28, RULE_void_function);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(171);
			functionHeader();
			setState(179);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==ARROW) {
				{
				setState(172);
				match(ARROW);
				setState(177);
				_errHandler.sync(this);
				switch ( getInterpreter().adaptivePredict(_input,13,_ctx) ) {
				case 1:
					{
					{
					setState(173);
					match(OPEN_BRACKET);
					setState(174);
					match(VOID);
					setState(175);
					match(CLOSE_BRACKET);
					}
					}
					break;
				case 2:
					{
					setState(176);
					void_sign();
					}
					break;
				}
				}
			}

			setState(181);
			block_non_return();
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

	public static class Block_returnContext extends ParserRuleContext {
		public TerminalNode OPEN_CURLY_BRACKET() { return getToken(SetGrammarParser.OPEN_CURLY_BRACKET, 0); }
		public TerminalNode RETURN() { return getToken(SetGrammarParser.RETURN, 0); }
		public TerminalNode NAME() { return getToken(SetGrammarParser.NAME, 0); }
		public TerminalNode CLOSE_CURLY_BRACKET() { return getToken(SetGrammarParser.CLOSE_CURLY_BRACKET, 0); }
		public List<BodyContext> body() {
			return getRuleContexts(BodyContext.class);
		}
		public BodyContext body(int i) {
			return getRuleContext(BodyContext.class,i);
		}
		public Block_returnContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_block_return; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SetGrammarListener ) ((SetGrammarListener)listener).enterBlock_return(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SetGrammarListener ) ((SetGrammarListener)listener).exitBlock_return(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SetGrammarVisitor ) return ((SetGrammarVisitor<? extends T>)visitor).visitBlock_return(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Block_returnContext block_return() throws RecognitionException {
		Block_returnContext _localctx = new Block_returnContext(_ctx, getState());
		enterRule(_localctx, 30, RULE_block_return);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(183);
			match(OPEN_CURLY_BRACKET);
			setState(187);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << LET) | (1L << FOREACH) | (1L << IF) | (1L << WHILE) | (1L << PRINT) | (1L << NAME))) != 0)) {
				{
				{
				setState(184);
				body();
				}
				}
				setState(189);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(190);
			match(RETURN);
			setState(191);
			match(NAME);
			setState(192);
			match(CLOSE_CURLY_BRACKET);
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

	public static class Block_non_returnContext extends ParserRuleContext {
		public TerminalNode OPEN_CURLY_BRACKET() { return getToken(SetGrammarParser.OPEN_CURLY_BRACKET, 0); }
		public TerminalNode CLOSE_CURLY_BRACKET() { return getToken(SetGrammarParser.CLOSE_CURLY_BRACKET, 0); }
		public List<BodyContext> body() {
			return getRuleContexts(BodyContext.class);
		}
		public BodyContext body(int i) {
			return getRuleContext(BodyContext.class,i);
		}
		public Block_non_returnContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_block_non_return; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SetGrammarListener ) ((SetGrammarListener)listener).enterBlock_non_return(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SetGrammarListener ) ((SetGrammarListener)listener).exitBlock_non_return(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SetGrammarVisitor ) return ((SetGrammarVisitor<? extends T>)visitor).visitBlock_non_return(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Block_non_returnContext block_non_return() throws RecognitionException {
		Block_non_returnContext _localctx = new Block_non_returnContext(_ctx, getState());
		enterRule(_localctx, 32, RULE_block_non_return);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(194);
			match(OPEN_CURLY_BRACKET);
			setState(198);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << LET) | (1L << FOREACH) | (1L << IF) | (1L << WHILE) | (1L << PRINT) | (1L << NAME))) != 0)) {
				{
				{
				setState(195);
				body();
				}
				}
				setState(200);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(201);
			match(CLOSE_CURLY_BRACKET);
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

	public static class EqualsContext extends ParserRuleContext {
		public TerminalNode EQUAL() { return getToken(SetGrammarParser.EQUAL, 0); }
		public TerminalNode NON_EQUAL() { return getToken(SetGrammarParser.NON_EQUAL, 0); }
		public List<ExpressionContext> expression() {
			return getRuleContexts(ExpressionContext.class);
		}
		public ExpressionContext expression(int i) {
			return getRuleContext(ExpressionContext.class,i);
		}
		public EqualsContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_equals; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SetGrammarListener ) ((SetGrammarListener)listener).enterEquals(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SetGrammarListener ) ((SetGrammarListener)listener).exitEquals(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SetGrammarVisitor ) return ((SetGrammarVisitor<? extends T>)visitor).visitEquals(this);
			else return visitor.visitChildren(this);
		}
	}

	public final EqualsContext equals() throws RecognitionException {
		EqualsContext _localctx = new EqualsContext(_ctx, getState());
		enterRule(_localctx, 34, RULE_equals);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			{
			setState(203);
			expression();
			}
			setState(204);
			_la = _input.LA(1);
			if ( !(_la==EQUAL || _la==NON_EQUAL) ) {
			_errHandler.recoverInline(this);
			}
			else {
				if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
				_errHandler.reportMatch(this);
				consume();
			}
			{
			setState(205);
			expression();
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

	public static class CompareContext extends ParserRuleContext {
		public TerminalNode EQUAL() { return getToken(SetGrammarParser.EQUAL, 0); }
		public TerminalNode NON_EQUAL() { return getToken(SetGrammarParser.NON_EQUAL, 0); }
		public TerminalNode LESS() { return getToken(SetGrammarParser.LESS, 0); }
		public TerminalNode GREATER() { return getToken(SetGrammarParser.GREATER, 0); }
		public List<PowerContext> power() {
			return getRuleContexts(PowerContext.class);
		}
		public PowerContext power(int i) {
			return getRuleContext(PowerContext.class,i);
		}
		public CompareContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_compare; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SetGrammarListener ) ((SetGrammarListener)listener).enterCompare(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SetGrammarListener ) ((SetGrammarListener)listener).exitCompare(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SetGrammarVisitor ) return ((SetGrammarVisitor<? extends T>)visitor).visitCompare(this);
			else return visitor.visitChildren(this);
		}
	}

	public final CompareContext compare() throws RecognitionException {
		CompareContext _localctx = new CompareContext(_ctx, getState());
		enterRule(_localctx, 36, RULE_compare);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			{
			setState(207);
			power();
			}
			setState(208);
			_la = _input.LA(1);
			if ( !((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << EQUAL) | (1L << NON_EQUAL) | (1L << LESS) | (1L << GREATER))) != 0)) ) {
			_errHandler.recoverInline(this);
			}
			else {
				if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
				_errHandler.reportMatch(this);
				consume();
			}
			{
			setState(209);
			power();
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

	public static class Simple_compareContext extends ParserRuleContext {
		public EqualsContext equals() {
			return getRuleContext(EqualsContext.class,0);
		}
		public CompareContext compare() {
			return getRuleContext(CompareContext.class,0);
		}
		public ContainsContext contains() {
			return getRuleContext(ContainsContext.class,0);
		}
		public Has_nextContext has_next() {
			return getRuleContext(Has_nextContext.class,0);
		}
		public Simple_compareContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_simple_compare; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SetGrammarListener ) ((SetGrammarListener)listener).enterSimple_compare(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SetGrammarListener ) ((SetGrammarListener)listener).exitSimple_compare(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SetGrammarVisitor ) return ((SetGrammarVisitor<? extends T>)visitor).visitSimple_compare(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Simple_compareContext simple_compare() throws RecognitionException {
		Simple_compareContext _localctx = new Simple_compareContext(_ctx, getState());
		enterRule(_localctx, 38, RULE_simple_compare);
		try {
			setState(215);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,17,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(211);
				equals();
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(212);
				compare();
				}
				break;
			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(213);
				contains();
				}
				break;
			case 4:
				enterOuterAlt(_localctx, 4);
				{
				setState(214);
				has_next();
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

	public static class Negation_compareContext extends ParserRuleContext {
		public TerminalNode NEGATION() { return getToken(SetGrammarParser.NEGATION, 0); }
		public TerminalNode OPEN_BRACKET() { return getToken(SetGrammarParser.OPEN_BRACKET, 0); }
		public Simple_compareContext simple_compare() {
			return getRuleContext(Simple_compareContext.class,0);
		}
		public TerminalNode CLOSE_BRACKET() { return getToken(SetGrammarParser.CLOSE_BRACKET, 0); }
		public Negation_compareContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_negation_compare; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SetGrammarListener ) ((SetGrammarListener)listener).enterNegation_compare(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SetGrammarListener ) ((SetGrammarListener)listener).exitNegation_compare(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SetGrammarVisitor ) return ((SetGrammarVisitor<? extends T>)visitor).visitNegation_compare(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Negation_compareContext negation_compare() throws RecognitionException {
		Negation_compareContext _localctx = new Negation_compareContext(_ctx, getState());
		enterRule(_localctx, 40, RULE_negation_compare);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(217);
			match(NEGATION);
			setState(218);
			match(OPEN_BRACKET);
			setState(219);
			simple_compare();
			setState(220);
			match(CLOSE_BRACKET);
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

	public static class If_blockContext extends ParserRuleContext {
		public TerminalNode IF() { return getToken(SetGrammarParser.IF, 0); }
		public BlockContext block() {
			return getRuleContext(BlockContext.class,0);
		}
		public Simple_compareContext simple_compare() {
			return getRuleContext(Simple_compareContext.class,0);
		}
		public Negation_compareContext negation_compare() {
			return getRuleContext(Negation_compareContext.class,0);
		}
		public Else_blockContext else_block() {
			return getRuleContext(Else_blockContext.class,0);
		}
		public If_blockContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_if_block; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SetGrammarListener ) ((SetGrammarListener)listener).enterIf_block(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SetGrammarListener ) ((SetGrammarListener)listener).exitIf_block(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SetGrammarVisitor ) return ((SetGrammarVisitor<? extends T>)visitor).visitIf_block(this);
			else return visitor.visitChildren(this);
		}
	}

	public final If_blockContext if_block() throws RecognitionException {
		If_blockContext _localctx = new If_blockContext(_ctx, getState());
		enterRule(_localctx, 42, RULE_if_block);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(222);
			match(IF);
			setState(225);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case OPEN_CURLY_BRACKET:
			case NAME:
				{
				setState(223);
				simple_compare();
				}
				break;
			case NEGATION:
				{
				setState(224);
				negation_compare();
				}
				break;
			default:
				throw new NoViableAltException(this);
			}
			setState(227);
			block();
			setState(229);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==ELSE) {
				{
				setState(228);
				else_block();
				}
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

	public static class Else_blockContext extends ParserRuleContext {
		public TerminalNode ELSE() { return getToken(SetGrammarParser.ELSE, 0); }
		public BlockContext block() {
			return getRuleContext(BlockContext.class,0);
		}
		public Else_blockContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_else_block; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SetGrammarListener ) ((SetGrammarListener)listener).enterElse_block(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SetGrammarListener ) ((SetGrammarListener)listener).exitElse_block(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SetGrammarVisitor ) return ((SetGrammarVisitor<? extends T>)visitor).visitElse_block(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Else_blockContext else_block() throws RecognitionException {
		Else_blockContext _localctx = new Else_blockContext(_ctx, getState());
		enterRule(_localctx, 44, RULE_else_block);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(231);
			match(ELSE);
			setState(232);
			block();
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

	public static class While_blockContext extends ParserRuleContext {
		public TerminalNode WHILE() { return getToken(SetGrammarParser.WHILE, 0); }
		public BlockContext block() {
			return getRuleContext(BlockContext.class,0);
		}
		public Simple_compareContext simple_compare() {
			return getRuleContext(Simple_compareContext.class,0);
		}
		public Negation_compareContext negation_compare() {
			return getRuleContext(Negation_compareContext.class,0);
		}
		public While_blockContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_while_block; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SetGrammarListener ) ((SetGrammarListener)listener).enterWhile_block(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SetGrammarListener ) ((SetGrammarListener)listener).exitWhile_block(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SetGrammarVisitor ) return ((SetGrammarVisitor<? extends T>)visitor).visitWhile_block(this);
			else return visitor.visitChildren(this);
		}
	}

	public final While_blockContext while_block() throws RecognitionException {
		While_blockContext _localctx = new While_blockContext(_ctx, getState());
		enterRule(_localctx, 46, RULE_while_block);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(234);
			match(WHILE);
			setState(237);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case OPEN_CURLY_BRACKET:
			case NAME:
				{
				setState(235);
				simple_compare();
				}
				break;
			case NEGATION:
				{
				setState(236);
				negation_compare();
				}
				break;
			default:
				throw new NoViableAltException(this);
			}
			setState(239);
			block();
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

	public static class ForEachContext extends ParserRuleContext {
		public TerminalNode FOREACH() { return getToken(SetGrammarParser.FOREACH, 0); }
		public TerminalNode OPEN_BRACKET() { return getToken(SetGrammarParser.OPEN_BRACKET, 0); }
		public List<TerminalNode> NAME() { return getTokens(SetGrammarParser.NAME); }
		public TerminalNode NAME(int i) {
			return getToken(SetGrammarParser.NAME, i);
		}
		public TerminalNode IN() { return getToken(SetGrammarParser.IN, 0); }
		public TerminalNode CLOSE_BRACKET() { return getToken(SetGrammarParser.CLOSE_BRACKET, 0); }
		public BlockContext block() {
			return getRuleContext(BlockContext.class,0);
		}
		public ForEachContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_forEach; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SetGrammarListener ) ((SetGrammarListener)listener).enterForEach(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SetGrammarListener ) ((SetGrammarListener)listener).exitForEach(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SetGrammarVisitor ) return ((SetGrammarVisitor<? extends T>)visitor).visitForEach(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ForEachContext forEach() throws RecognitionException {
		ForEachContext _localctx = new ForEachContext(_ctx, getState());
		enterRule(_localctx, 48, RULE_forEach);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(241);
			match(FOREACH);
			setState(242);
			match(OPEN_BRACKET);
			setState(243);
			match(NAME);
			setState(244);
			match(IN);
			setState(245);
			match(NAME);
			setState(246);
			match(CLOSE_BRACKET);
			setState(247);
			block();
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

	public static class PrintContext extends ParserRuleContext {
		public TerminalNode PRINT() { return getToken(SetGrammarParser.PRINT, 0); }
		public TerminalNode OPEN_BRACKET() { return getToken(SetGrammarParser.OPEN_BRACKET, 0); }
		public TerminalNode CLOSE_BRACKET() { return getToken(SetGrammarParser.CLOSE_BRACKET, 0); }
		public TerminalNode NAME() { return getToken(SetGrammarParser.NAME, 0); }
		public TerminalNode LINE() { return getToken(SetGrammarParser.LINE, 0); }
		public PrintContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_print; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SetGrammarListener ) ((SetGrammarListener)listener).enterPrint(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SetGrammarListener ) ((SetGrammarListener)listener).exitPrint(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SetGrammarVisitor ) return ((SetGrammarVisitor<? extends T>)visitor).visitPrint(this);
			else return visitor.visitChildren(this);
		}
	}

	public final PrintContext print() throws RecognitionException {
		PrintContext _localctx = new PrintContext(_ctx, getState());
		enterRule(_localctx, 50, RULE_print);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(249);
			match(PRINT);
			setState(250);
			match(OPEN_BRACKET);
			setState(251);
			_la = _input.LA(1);
			if ( !(_la==NAME || _la==LINE) ) {
			_errHandler.recoverInline(this);
			}
			else {
				if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
				_errHandler.reportMatch(this);
				consume();
			}
			setState(252);
			match(CLOSE_BRACKET);
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

	public static class Get_expressionContext extends ParserRuleContext {
		public TerminalNode NAME() { return getToken(SetGrammarParser.NAME, 0); }
		public TerminalNode DOT() { return getToken(SetGrammarParser.DOT, 0); }
		public TerminalNode GET() { return getToken(SetGrammarParser.GET, 0); }
		public TerminalNode OPEN_BRACKET() { return getToken(SetGrammarParser.OPEN_BRACKET, 0); }
		public TerminalNode NUMBER() { return getToken(SetGrammarParser.NUMBER, 0); }
		public TerminalNode CLOSE_BRACKET() { return getToken(SetGrammarParser.CLOSE_BRACKET, 0); }
		public Get_expressionContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_get_expression; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SetGrammarListener ) ((SetGrammarListener)listener).enterGet_expression(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SetGrammarListener ) ((SetGrammarListener)listener).exitGet_expression(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SetGrammarVisitor ) return ((SetGrammarVisitor<? extends T>)visitor).visitGet_expression(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Get_expressionContext get_expression() throws RecognitionException {
		Get_expressionContext _localctx = new Get_expressionContext(_ctx, getState());
		enterRule(_localctx, 52, RULE_get_expression);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(254);
			match(NAME);
			setState(255);
			match(DOT);
			setState(256);
			match(GET);
			setState(257);
			match(OPEN_BRACKET);
			setState(258);
			match(NUMBER);
			setState(259);
			match(CLOSE_BRACKET);
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

	public static class Has_nextContext extends ParserRuleContext {
		public TerminalNode NAME() { return getToken(SetGrammarParser.NAME, 0); }
		public TerminalNode DOT() { return getToken(SetGrammarParser.DOT, 0); }
		public TerminalNode HAS_NEXT() { return getToken(SetGrammarParser.HAS_NEXT, 0); }
		public Void_signContext void_sign() {
			return getRuleContext(Void_signContext.class,0);
		}
		public Has_nextContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_has_next; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SetGrammarListener ) ((SetGrammarListener)listener).enterHas_next(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SetGrammarListener ) ((SetGrammarListener)listener).exitHas_next(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SetGrammarVisitor ) return ((SetGrammarVisitor<? extends T>)visitor).visitHas_next(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Has_nextContext has_next() throws RecognitionException {
		Has_nextContext _localctx = new Has_nextContext(_ctx, getState());
		enterRule(_localctx, 54, RULE_has_next);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(261);
			match(NAME);
			setState(262);
			match(DOT);
			setState(263);
			match(HAS_NEXT);
			setState(264);
			void_sign();
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

	public static class PowerContext extends ParserRuleContext {
		public TerminalNode NAME() { return getToken(SetGrammarParser.NAME, 0); }
		public TerminalNode DOT() { return getToken(SetGrammarParser.DOT, 0); }
		public TerminalNode POWER() { return getToken(SetGrammarParser.POWER, 0); }
		public Void_signContext void_sign() {
			return getRuleContext(Void_signContext.class,0);
		}
		public PowerContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_power; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SetGrammarListener ) ((SetGrammarListener)listener).enterPower(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SetGrammarListener ) ((SetGrammarListener)listener).exitPower(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SetGrammarVisitor ) return ((SetGrammarVisitor<? extends T>)visitor).visitPower(this);
			else return visitor.visitChildren(this);
		}
	}

	public final PowerContext power() throws RecognitionException {
		PowerContext _localctx = new PowerContext(_ctx, getState());
		enterRule(_localctx, 56, RULE_power);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(266);
			match(NAME);
			setState(267);
			match(DOT);
			setState(268);
			match(POWER);
			setState(269);
			void_sign();
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

	public static class ContainsContext extends ParserRuleContext {
		public List<TerminalNode> NAME() { return getTokens(SetGrammarParser.NAME); }
		public TerminalNode NAME(int i) {
			return getToken(SetGrammarParser.NAME, i);
		}
		public TerminalNode DOT() { return getToken(SetGrammarParser.DOT, 0); }
		public TerminalNode CONTAINS() { return getToken(SetGrammarParser.CONTAINS, 0); }
		public TerminalNode OPEN_BRACKET() { return getToken(SetGrammarParser.OPEN_BRACKET, 0); }
		public TerminalNode CLOSE_BRACKET() { return getToken(SetGrammarParser.CLOSE_BRACKET, 0); }
		public ContainsContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_contains; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SetGrammarListener ) ((SetGrammarListener)listener).enterContains(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SetGrammarListener ) ((SetGrammarListener)listener).exitContains(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SetGrammarVisitor ) return ((SetGrammarVisitor<? extends T>)visitor).visitContains(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ContainsContext contains() throws RecognitionException {
		ContainsContext _localctx = new ContainsContext(_ctx, getState());
		enterRule(_localctx, 58, RULE_contains);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(271);
			match(NAME);
			setState(272);
			match(DOT);
			setState(273);
			match(CONTAINS);
			setState(274);
			match(OPEN_BRACKET);
			setState(275);
			match(NAME);
			setState(276);
			match(CLOSE_BRACKET);
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

	public static class BodyContext extends ParserRuleContext {
		public PrintContext print() {
			return getRuleContext(PrintContext.class,0);
		}
		public DeclarationContext declaration() {
			return getRuleContext(DeclarationContext.class,0);
		}
		public Function_callContext function_call() {
			return getRuleContext(Function_callContext.class,0);
		}
		public Declaration_elementContext declaration_element() {
			return getRuleContext(Declaration_elementContext.class,0);
		}
		public If_blockContext if_block() {
			return getRuleContext(If_blockContext.class,0);
		}
		public While_blockContext while_block() {
			return getRuleContext(While_blockContext.class,0);
		}
		public ForEachContext forEach() {
			return getRuleContext(ForEachContext.class,0);
		}
		public BodyContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_body; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SetGrammarListener ) ((SetGrammarListener)listener).enterBody(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SetGrammarListener ) ((SetGrammarListener)listener).exitBody(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SetGrammarVisitor ) return ((SetGrammarVisitor<? extends T>)visitor).visitBody(this);
			else return visitor.visitChildren(this);
		}
	}

	public final BodyContext body() throws RecognitionException {
		BodyContext _localctx = new BodyContext(_ctx, getState());
		enterRule(_localctx, 60, RULE_body);
		try {
			setState(285);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,21,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(278);
				print();
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(279);
				declaration();
				}
				break;
			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(280);
				function_call();
				}
				break;
			case 4:
				enterOuterAlt(_localctx, 4);
				{
				setState(281);
				declaration_element();
				}
				break;
			case 5:
				enterOuterAlt(_localctx, 5);
				{
				setState(282);
				if_block();
				}
				break;
			case 6:
				enterOuterAlt(_localctx, 6);
				{
				setState(283);
				while_block();
				}
				break;
			case 7:
				enterOuterAlt(_localctx, 7);
				{
				setState(284);
				forEach();
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

	public static class ExpressionContext extends ParserRuleContext {
		public Set_expressionContext set_expression() {
			return getRuleContext(Set_expressionContext.class,0);
		}
		public List<TerminalNode> NAME() { return getTokens(SetGrammarParser.NAME); }
		public TerminalNode NAME(int i) {
			return getToken(SetGrammarParser.NAME, i);
		}
		public TerminalNode PLUS() { return getToken(SetGrammarParser.PLUS, 0); }
		public TerminalNode MINUS() { return getToken(SetGrammarParser.MINUS, 0); }
		public TerminalNode MULTIPLY() { return getToken(SetGrammarParser.MULTIPLY, 0); }
		public TerminalNode DIVIDE() { return getToken(SetGrammarParser.DIVIDE, 0); }
		public Function_callContext function_call() {
			return getRuleContext(Function_callContext.class,0);
		}
		public Get_expressionContext get_expression() {
			return getRuleContext(Get_expressionContext.class,0);
		}
		public ExpressionContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_expression; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SetGrammarListener ) ((SetGrammarListener)listener).enterExpression(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SetGrammarListener ) ((SetGrammarListener)listener).exitExpression(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SetGrammarVisitor ) return ((SetGrammarVisitor<? extends T>)visitor).visitExpression(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ExpressionContext expression() throws RecognitionException {
		ExpressionContext _localctx = new ExpressionContext(_ctx, getState());
		enterRule(_localctx, 62, RULE_expression);
		try {
			setState(303);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,22,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(287);
				set_expression();
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(288);
				match(NAME);
				setState(289);
				match(PLUS);
				setState(290);
				match(NAME);
				}
				break;
			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(291);
				match(NAME);
				setState(292);
				match(MINUS);
				setState(293);
				match(NAME);
				}
				break;
			case 4:
				enterOuterAlt(_localctx, 4);
				{
				setState(294);
				match(NAME);
				setState(295);
				match(MULTIPLY);
				setState(296);
				match(NAME);
				}
				break;
			case 5:
				enterOuterAlt(_localctx, 5);
				{
				setState(297);
				match(NAME);
				setState(298);
				match(DIVIDE);
				setState(299);
				match(NAME);
				}
				break;
			case 6:
				enterOuterAlt(_localctx, 6);
				{
				setState(300);
				match(NAME);
				}
				break;
			case 7:
				enterOuterAlt(_localctx, 7);
				{
				setState(301);
				function_call();
				}
				break;
			case 8:
				enterOuterAlt(_localctx, 8);
				{
				setState(302);
				get_expression();
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

	public static final String _serializedATN =
		"\3\u608b\ua72a\u8133\ub9ed\u417c\u3be7\u7786\u5964\3+\u0134\4\2\t\2\4"+
		"\3\t\3\4\4\t\4\4\5\t\5\4\6\t\6\4\7\t\7\4\b\t\b\4\t\t\t\4\n\t\n\4\13\t"+
		"\13\4\f\t\f\4\r\t\r\4\16\t\16\4\17\t\17\4\20\t\20\4\21\t\21\4\22\t\22"+
		"\4\23\t\23\4\24\t\24\4\25\t\25\4\26\t\26\4\27\t\27\4\30\t\30\4\31\t\31"+
		"\4\32\t\32\4\33\t\33\4\34\t\34\4\35\t\35\4\36\t\36\4\37\t\37\4 \t \4!"+
		"\t!\3\2\3\2\7\2E\n\2\f\2\16\2H\13\2\3\2\3\2\3\2\3\2\7\2N\n\2\f\2\16\2"+
		"Q\13\2\3\3\3\3\3\4\3\4\3\4\3\5\3\5\7\5Z\n\5\f\5\16\5]\13\5\3\5\3\5\3\6"+
		"\3\6\3\6\3\6\5\6e\n\6\3\6\3\6\3\6\3\7\3\7\3\7\3\7\5\7n\n\7\3\7\3\7\3\7"+
		"\3\7\5\7t\n\7\3\b\3\b\3\b\7\by\n\b\f\b\16\b|\13\b\3\b\3\b\3\b\3\t\3\t"+
		"\3\t\3\t\5\t\u0085\n\t\3\n\3\n\3\n\7\n\u008a\n\n\f\n\16\n\u008d\13\n\3"+
		"\n\3\n\3\n\3\13\3\13\3\13\3\13\3\f\3\f\3\f\3\r\3\r\7\r\u009b\n\r\f\r\16"+
		"\r\u009e\13\r\3\r\3\r\3\r\3\16\3\16\3\16\3\16\5\16\u00a7\n\16\3\17\3\17"+
		"\3\17\3\17\3\17\3\20\3\20\3\20\3\20\3\20\3\20\5\20\u00b4\n\20\5\20\u00b6"+
		"\n\20\3\20\3\20\3\21\3\21\7\21\u00bc\n\21\f\21\16\21\u00bf\13\21\3\21"+
		"\3\21\3\21\3\21\3\22\3\22\7\22\u00c7\n\22\f\22\16\22\u00ca\13\22\3\22"+
		"\3\22\3\23\3\23\3\23\3\23\3\24\3\24\3\24\3\24\3\25\3\25\3\25\3\25\5\25"+
		"\u00da\n\25\3\26\3\26\3\26\3\26\3\26\3\27\3\27\3\27\5\27\u00e4\n\27\3"+
		"\27\3\27\5\27\u00e8\n\27\3\30\3\30\3\30\3\31\3\31\3\31\5\31\u00f0\n\31"+
		"\3\31\3\31\3\32\3\32\3\32\3\32\3\32\3\32\3\32\3\32\3\33\3\33\3\33\3\33"+
		"\3\33\3\34\3\34\3\34\3\34\3\34\3\34\3\34\3\35\3\35\3\35\3\35\3\35\3\36"+
		"\3\36\3\36\3\36\3\36\3\37\3\37\3\37\3\37\3\37\3\37\3\37\3 \3 \3 \3 \3"+
		" \3 \3 \5 \u0120\n \3!\3!\3!\3!\3!\3!\3!\3!\3!\3!\3!\3!\3!\3!\3!\3!\5"+
		"!\u0132\n!\3!\2\2\"\2\4\6\b\n\f\16\20\22\24\26\30\32\34\36 \"$&(*,.\60"+
		"\62\64\668:<>@\2\6\3\2\t\n\3\2$%\3\2$\'\4\2))++\2\u0138\2F\3\2\2\2\4R"+
		"\3\2\2\2\6T\3\2\2\2\bW\3\2\2\2\n`\3\2\2\2\fi\3\2\2\2\16u\3\2\2\2\20\u0080"+
		"\3\2\2\2\22\u0086\3\2\2\2\24\u0091\3\2\2\2\26\u0095\3\2\2\2\30\u0098\3"+
		"\2\2\2\32\u00a2\3\2\2\2\34\u00a8\3\2\2\2\36\u00ad\3\2\2\2 \u00b9\3\2\2"+
		"\2\"\u00c4\3\2\2\2$\u00cd\3\2\2\2&\u00d1\3\2\2\2(\u00d9\3\2\2\2*\u00db"+
		"\3\2\2\2,\u00e0\3\2\2\2.\u00e9\3\2\2\2\60\u00ec\3\2\2\2\62\u00f3\3\2\2"+
		"\2\64\u00fb\3\2\2\2\66\u0100\3\2\2\28\u0107\3\2\2\2:\u010c\3\2\2\2<\u0111"+
		"\3\2\2\2>\u011f\3\2\2\2@\u0131\3\2\2\2BE\5\36\20\2CE\5\34\17\2DB\3\2\2"+
		"\2DC\3\2\2\2EH\3\2\2\2FD\3\2\2\2FG\3\2\2\2GI\3\2\2\2HF\3\2\2\2IJ\7\21"+
		"\2\2JO\5\b\5\2KN\5\36\20\2LN\5\34\17\2MK\3\2\2\2ML\3\2\2\2NQ\3\2\2\2O"+
		"M\3\2\2\2OP\3\2\2\2P\3\3\2\2\2QO\3\2\2\2RS\t\2\2\2S\5\3\2\2\2TU\7\3\2"+
		"\2UV\7\4\2\2V\7\3\2\2\2W[\7\5\2\2XZ\5> \2YX\3\2\2\2Z]\3\2\2\2[Y\3\2\2"+
		"\2[\\\3\2\2\2\\^\3\2\2\2][\3\2\2\2^_\7\6\2\2_\t\3\2\2\2`a\7\13\2\2ad\7"+
		")\2\2bc\7\35\2\2ce\7\n\2\2db\3\2\2\2de\3\2\2\2ef\3\2\2\2fg\7\32\2\2gh"+
		"\5@!\2h\13\3\2\2\2ij\7\13\2\2jm\7)\2\2kl\7\35\2\2ln\7\t\2\2mk\3\2\2\2"+
		"mn\3\2\2\2no\3\2\2\2os\7\32\2\2pt\7+\2\2qt\5\20\t\2rt\5\66\34\2sp\3\2"+
		"\2\2sq\3\2\2\2sr\3\2\2\2t\r\3\2\2\2uz\7\5\2\2vw\7)\2\2wy\7\34\2\2xv\3"+
		"\2\2\2y|\3\2\2\2zx\3\2\2\2z{\3\2\2\2{}\3\2\2\2|z\3\2\2\2}~\7)\2\2~\177"+
		"\7\6\2\2\177\17\3\2\2\2\u0080\u0084\7)\2\2\u0081\u0085\5\22\n\2\u0082"+
		"\u0083\7\3\2\2\u0083\u0085\7\4\2\2\u0084\u0081\3\2\2\2\u0084\u0082\3\2"+
		"\2\2\u0085\21\3\2\2\2\u0086\u008b\7\3\2\2\u0087\u0088\7)\2\2\u0088\u008a"+
		"\7\34\2\2\u0089\u0087\3\2\2\2\u008a\u008d\3\2\2\2\u008b\u0089\3\2\2\2"+
		"\u008b\u008c\3\2\2\2\u008c\u008e\3\2\2\2\u008d\u008b\3\2\2\2\u008e\u008f"+
		"\7)\2\2\u008f\u0090\7\4\2\2\u0090\23\3\2\2\2\u0091\u0092\7)\2\2\u0092"+
		"\u0093\7\35\2\2\u0093\u0094\5\4\3\2\u0094\25\3\2\2\2\u0095\u0096\5\24"+
		"\13\2\u0096\u0097\7\34\2\2\u0097\27\3\2\2\2\u0098\u009c\7\3\2\2\u0099"+
		"\u009b\5\26\f\2\u009a\u0099\3\2\2\2\u009b\u009e\3\2\2\2\u009c\u009a\3"+
		"\2\2\2\u009c\u009d\3\2\2\2\u009d\u009f\3\2\2\2\u009e\u009c\3\2\2\2\u009f"+
		"\u00a0\5\24\13\2\u00a0\u00a1\7\4\2\2\u00a1\31\3\2\2\2\u00a2\u00a3\7\22"+
		"\2\2\u00a3\u00a6\7)\2\2\u00a4\u00a7\5\30\r\2\u00a5\u00a7\5\6\4\2\u00a6"+
		"\u00a4\3\2\2\2\u00a6\u00a5\3\2\2\2\u00a7\33\3\2\2\2\u00a8\u00a9\5\32\16"+
		"\2\u00a9\u00aa\7\36\2\2\u00aa\u00ab\5\4\3\2\u00ab\u00ac\5 \21\2\u00ac"+
		"\35\3\2\2\2\u00ad\u00b5\5\32\16\2\u00ae\u00b3\7\36\2\2\u00af\u00b0\7\3"+
		"\2\2\u00b0\u00b1\7\24\2\2\u00b1\u00b4\7\4\2\2\u00b2\u00b4\5\6\4\2\u00b3"+
		"\u00af\3\2\2\2\u00b3\u00b2\3\2\2\2\u00b4\u00b6\3\2\2\2\u00b5\u00ae\3\2"+
		"\2\2\u00b5\u00b6\3\2\2\2\u00b6\u00b7\3\2\2\2\u00b7\u00b8\5\"\22\2\u00b8"+
		"\37\3\2\2\2\u00b9\u00bd\7\5\2\2\u00ba\u00bc\5> \2\u00bb\u00ba\3\2\2\2"+
		"\u00bc\u00bf\3\2\2\2\u00bd\u00bb\3\2\2\2\u00bd\u00be\3\2\2\2\u00be\u00c0"+
		"\3\2\2\2\u00bf\u00bd\3\2\2\2\u00c0\u00c1\7\23\2\2\u00c1\u00c2\7)\2\2\u00c2"+
		"\u00c3\7\6\2\2\u00c3!\3\2\2\2\u00c4\u00c8\7\5\2\2\u00c5\u00c7\5> \2\u00c6"+
		"\u00c5\3\2\2\2\u00c7\u00ca\3\2\2\2\u00c8\u00c6\3\2\2\2\u00c8\u00c9\3\2"+
		"\2\2\u00c9\u00cb\3\2\2\2\u00ca\u00c8\3\2\2\2\u00cb\u00cc\7\6\2\2\u00cc"+
		"#\3\2\2\2\u00cd\u00ce\5@!\2\u00ce\u00cf\t\3\2\2\u00cf\u00d0\5@!\2\u00d0"+
		"%\3\2\2\2\u00d1\u00d2\5:\36\2\u00d2\u00d3\t\4\2\2\u00d3\u00d4\5:\36\2"+
		"\u00d4\'\3\2\2\2\u00d5\u00da\5$\23\2\u00d6\u00da\5&\24\2\u00d7\u00da\5"+
		"<\37\2\u00d8\u00da\58\35\2\u00d9\u00d5\3\2\2\2\u00d9\u00d6\3\2\2\2\u00d9"+
		"\u00d7\3\2\2\2\u00d9\u00d8\3\2\2\2\u00da)\3\2\2\2\u00db\u00dc\7#\2\2\u00dc"+
		"\u00dd\7\3\2\2\u00dd\u00de\5(\25\2\u00de\u00df\7\4\2\2\u00df+\3\2\2\2"+
		"\u00e0\u00e3\7\16\2\2\u00e1\u00e4\5(\25\2\u00e2\u00e4\5*\26\2\u00e3\u00e1"+
		"\3\2\2\2\u00e3\u00e2\3\2\2\2\u00e4\u00e5\3\2\2\2\u00e5\u00e7\5\b\5\2\u00e6"+
		"\u00e8\5.\30\2\u00e7\u00e6\3\2\2\2\u00e7\u00e8\3\2\2\2\u00e8-\3\2\2\2"+
		"\u00e9\u00ea\7\17\2\2\u00ea\u00eb\5\b\5\2\u00eb/\3\2\2\2\u00ec\u00ef\7"+
		"\20\2\2\u00ed\u00f0\5(\25\2\u00ee\u00f0\5*\26\2\u00ef\u00ed\3\2\2\2\u00ef"+
		"\u00ee\3\2\2\2\u00f0\u00f1\3\2\2\2\u00f1\u00f2\5\b\5\2\u00f2\61\3\2\2"+
		"\2\u00f3\u00f4\7\f\2\2\u00f4\u00f5\7\3\2\2\u00f5\u00f6\7)\2\2\u00f6\u00f7"+
		"\7\r\2\2\u00f7\u00f8\7)\2\2\u00f8\u00f9\7\4\2\2\u00f9\u00fa\5\b\5\2\u00fa"+
		"\63\3\2\2\2\u00fb\u00fc\7\25\2\2\u00fc\u00fd\7\3\2\2\u00fd\u00fe\t\5\2"+
		"\2\u00fe\u00ff\7\4\2\2\u00ff\65\3\2\2\2\u0100\u0101\7)\2\2\u0101\u0102"+
		"\7\33\2\2\u0102\u0103\7\26\2\2\u0103\u0104\7\3\2\2\u0104\u0105\7*\2\2"+
		"\u0105\u0106\7\4\2\2\u0106\67\3\2\2\2\u0107\u0108\7)\2\2\u0108\u0109\7"+
		"\33\2\2\u0109\u010a\7\31\2\2\u010a\u010b\5\6\4\2\u010b9\3\2\2\2\u010c"+
		"\u010d\7)\2\2\u010d\u010e\7\33\2\2\u010e\u010f\7\30\2\2\u010f\u0110\5"+
		"\6\4\2\u0110;\3\2\2\2\u0111\u0112\7)\2\2\u0112\u0113\7\33\2\2\u0113\u0114"+
		"\7\27\2\2\u0114\u0115\7\3\2\2\u0115\u0116\7)\2\2\u0116\u0117\7\4\2\2\u0117"+
		"=\3\2\2\2\u0118\u0120\5\64\33\2\u0119\u0120\5\n\6\2\u011a\u0120\5\20\t"+
		"\2\u011b\u0120\5\f\7\2\u011c\u0120\5,\27\2\u011d\u0120\5\60\31\2\u011e"+
		"\u0120\5\62\32\2\u011f\u0118\3\2\2\2\u011f\u0119\3\2\2\2\u011f\u011a\3"+
		"\2\2\2\u011f\u011b\3\2\2\2\u011f\u011c\3\2\2\2\u011f\u011d\3\2\2\2\u011f"+
		"\u011e\3\2\2\2\u0120?\3\2\2\2\u0121\u0132\5\16\b\2\u0122\u0123\7)\2\2"+
		"\u0123\u0124\7\37\2\2\u0124\u0132\7)\2\2\u0125\u0126\7)\2\2\u0126\u0127"+
		"\7 \2\2\u0127\u0132\7)\2\2\u0128\u0129\7)\2\2\u0129\u012a\7!\2\2\u012a"+
		"\u0132\7)\2\2\u012b\u012c\7)\2\2\u012c\u012d\7\"\2\2\u012d\u0132\7)\2"+
		"\2\u012e\u0132\7)\2\2\u012f\u0132\5\20\t\2\u0130\u0132\5\66\34\2\u0131"+
		"\u0121\3\2\2\2\u0131\u0122\3\2\2\2\u0131\u0125\3\2\2\2\u0131\u0128\3\2"+
		"\2\2\u0131\u012b\3\2\2\2\u0131\u012e\3\2\2\2\u0131\u012f\3\2\2\2\u0131"+
		"\u0130\3\2\2\2\u0132A\3\2\2\2\31DFMO[dmsz\u0084\u008b\u009c\u00a6\u00b3"+
		"\u00b5\u00bd\u00c8\u00d9\u00e3\u00e7\u00ef\u011f\u0131";
	public static final ATN _ATN =
		new ATNDeserializer().deserialize(_serializedATN.toCharArray());
	static {
		_decisionToDFA = new DFA[_ATN.getNumberOfDecisions()];
		for (int i = 0; i < _ATN.getNumberOfDecisions(); i++) {
			_decisionToDFA[i] = new DFA(_ATN.getDecisionState(i), i);
		}
	}
}