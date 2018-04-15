package gen;// Generated from /Users/alexeisevko/IdeaProjects/Compiler/SetGrammar.g4 by ANTLR 4.7
import org.antlr.v4.runtime.Lexer;
import org.antlr.v4.runtime.CharStream;
import org.antlr.v4.runtime.Token;
import org.antlr.v4.runtime.TokenStream;
import org.antlr.v4.runtime.*;
import org.antlr.v4.runtime.atn.*;
import org.antlr.v4.runtime.dfa.DFA;
import org.antlr.v4.runtime.misc.*;

@SuppressWarnings({"all", "warnings", "unchecked", "unused", "cast"})
public class SetGrammarLexer extends Lexer {
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
	public static String[] channelNames = {
		"DEFAULT_TOKEN_CHANNEL", "HIDDEN"
	};

	public static String[] modeNames = {
		"DEFAULT_MODE"
	};

	public static final String[] ruleNames = {
		"OPEN_BRACKET", "CLOSE_BRACKET", "OPEN_CURLY_BRACKET", "CLOSE_CURLY_BRACKET", 
		"OPEN_SQUARE_BRACKET", "CLOSE_SQUARE_BRACKET", "ELEMENT", "SET", "LET", 
		"FOREACH", "IN", "IF", "ELSE", "WHILE", "MAIN", "FUNCTION", "RETURN", 
		"VOID", "PRINT", "GET", "CONTAINS", "POWER", "HAS_NEXT", "ASSIGN", "DOT", 
		"COMMA", "COLON", "ARROW", "PLUS", "MINUS", "MULTIPLY", "DIVIDE", "NEGATION", 
		"EQUAL", "NON_EQUAL", "LESS", "GREATER", "SPACE", "NAME", "NUMBER", "LINE"
	};

	private static final String[] _LITERAL_NAMES = {
		null, "'('", "')'", "'{'", "'}'", "'['", "']'", "'Element'", "'Set'", 
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


	public SetGrammarLexer(CharStream input) {
		super(input);
		_interp = new LexerATNSimulator(this,_ATN,_decisionToDFA,_sharedContextCache);
	}

	@Override
	public String getGrammarFileName() { return "SetGrammar.g4"; }

	@Override
	public String[] getRuleNames() { return ruleNames; }

	@Override
	public String getSerializedATN() { return _serializedATN; }

	@Override
	public String[] getChannelNames() { return channelNames; }

	@Override
	public String[] getModeNames() { return modeNames; }

	@Override
	public ATN getATN() { return _ATN; }

	public static final String _serializedATN =
		"\3\u608b\ua72a\u8133\ub9ed\u417c\u3be7\u7786\u5964\2+\u00fb\b\1\4\2\t"+
		"\2\4\3\t\3\4\4\t\4\4\5\t\5\4\6\t\6\4\7\t\7\4\b\t\b\4\t\t\t\4\n\t\n\4\13"+
		"\t\13\4\f\t\f\4\r\t\r\4\16\t\16\4\17\t\17\4\20\t\20\4\21\t\21\4\22\t\22"+
		"\4\23\t\23\4\24\t\24\4\25\t\25\4\26\t\26\4\27\t\27\4\30\t\30\4\31\t\31"+
		"\4\32\t\32\4\33\t\33\4\34\t\34\4\35\t\35\4\36\t\36\4\37\t\37\4 \t \4!"+
		"\t!\4\"\t\"\4#\t#\4$\t$\4%\t%\4&\t&\4\'\t\'\4(\t(\4)\t)\4*\t*\3\2\3\2"+
		"\3\3\3\3\3\4\3\4\3\5\3\5\3\6\3\6\3\7\3\7\3\b\3\b\3\b\3\b\3\b\3\b\3\b\3"+
		"\b\3\t\3\t\3\t\3\t\3\n\3\n\3\n\3\n\3\13\3\13\3\13\3\13\3\13\3\13\3\13"+
		"\3\13\3\f\3\f\3\f\3\r\3\r\3\r\3\16\3\16\3\16\3\16\3\16\3\17\3\17\3\17"+
		"\3\17\3\17\3\17\3\20\3\20\3\20\3\20\3\20\3\21\3\21\3\21\3\21\3\21\3\22"+
		"\3\22\3\22\3\22\3\22\3\22\3\22\3\23\3\23\3\23\3\23\3\23\3\24\3\24\3\24"+
		"\3\24\3\24\3\24\3\25\3\25\3\25\3\25\3\26\3\26\3\26\3\26\3\26\3\26\3\26"+
		"\3\26\3\26\3\27\3\27\3\27\3\27\3\27\3\27\3\30\3\30\3\30\3\30\3\30\3\30"+
		"\3\30\3\30\3\31\3\31\3\32\3\32\3\33\3\33\3\34\3\34\3\35\3\35\3\35\3\36"+
		"\3\36\3\37\3\37\3 \3 \3!\3!\3\"\3\"\3#\3#\3#\3$\3$\3$\3%\3%\3&\3&\3\'"+
		"\6\'\u00e2\n\'\r\'\16\'\u00e3\3\'\3\'\3(\3(\7(\u00ea\n(\f(\16(\u00ed\13"+
		"(\3)\6)\u00f0\n)\r)\16)\u00f1\3*\3*\6*\u00f6\n*\r*\16*\u00f7\3*\3*\3\u00f7"+
		"\2+\3\3\5\4\7\5\t\6\13\7\r\b\17\t\21\n\23\13\25\f\27\r\31\16\33\17\35"+
		"\20\37\21!\22#\23%\24\'\25)\26+\27-\30/\31\61\32\63\33\65\34\67\359\36"+
		";\37= ?!A\"C#E$G%I&K\'M(O)Q*S+\3\2\6\5\2\13\f\17\17\"\"\5\2C\\aac|\6\2"+
		"\62;C\\aac|\3\2\62;\2\u00fe\2\3\3\2\2\2\2\5\3\2\2\2\2\7\3\2\2\2\2\t\3"+
		"\2\2\2\2\13\3\2\2\2\2\r\3\2\2\2\2\17\3\2\2\2\2\21\3\2\2\2\2\23\3\2\2\2"+
		"\2\25\3\2\2\2\2\27\3\2\2\2\2\31\3\2\2\2\2\33\3\2\2\2\2\35\3\2\2\2\2\37"+
		"\3\2\2\2\2!\3\2\2\2\2#\3\2\2\2\2%\3\2\2\2\2\'\3\2\2\2\2)\3\2\2\2\2+\3"+
		"\2\2\2\2-\3\2\2\2\2/\3\2\2\2\2\61\3\2\2\2\2\63\3\2\2\2\2\65\3\2\2\2\2"+
		"\67\3\2\2\2\29\3\2\2\2\2;\3\2\2\2\2=\3\2\2\2\2?\3\2\2\2\2A\3\2\2\2\2C"+
		"\3\2\2\2\2E\3\2\2\2\2G\3\2\2\2\2I\3\2\2\2\2K\3\2\2\2\2M\3\2\2\2\2O\3\2"+
		"\2\2\2Q\3\2\2\2\2S\3\2\2\2\3U\3\2\2\2\5W\3\2\2\2\7Y\3\2\2\2\t[\3\2\2\2"+
		"\13]\3\2\2\2\r_\3\2\2\2\17a\3\2\2\2\21i\3\2\2\2\23m\3\2\2\2\25q\3\2\2"+
		"\2\27y\3\2\2\2\31|\3\2\2\2\33\177\3\2\2\2\35\u0084\3\2\2\2\37\u008a\3"+
		"\2\2\2!\u008f\3\2\2\2#\u0094\3\2\2\2%\u009b\3\2\2\2\'\u00a0\3\2\2\2)\u00a6"+
		"\3\2\2\2+\u00aa\3\2\2\2-\u00b3\3\2\2\2/\u00b9\3\2\2\2\61\u00c1\3\2\2\2"+
		"\63\u00c3\3\2\2\2\65\u00c5\3\2\2\2\67\u00c7\3\2\2\29\u00c9\3\2\2\2;\u00cc"+
		"\3\2\2\2=\u00ce\3\2\2\2?\u00d0\3\2\2\2A\u00d2\3\2\2\2C\u00d4\3\2\2\2E"+
		"\u00d6\3\2\2\2G\u00d9\3\2\2\2I\u00dc\3\2\2\2K\u00de\3\2\2\2M\u00e1\3\2"+
		"\2\2O\u00e7\3\2\2\2Q\u00ef\3\2\2\2S\u00f3\3\2\2\2UV\7*\2\2V\4\3\2\2\2"+
		"WX\7+\2\2X\6\3\2\2\2YZ\7}\2\2Z\b\3\2\2\2[\\\7\177\2\2\\\n\3\2\2\2]^\7"+
		"]\2\2^\f\3\2\2\2_`\7_\2\2`\16\3\2\2\2ab\7G\2\2bc\7n\2\2cd\7g\2\2de\7o"+
		"\2\2ef\7g\2\2fg\7p\2\2gh\7v\2\2h\20\3\2\2\2ij\7U\2\2jk\7g\2\2kl\7v\2\2"+
		"l\22\3\2\2\2mn\7n\2\2no\7g\2\2op\7v\2\2p\24\3\2\2\2qr\7h\2\2rs\7q\2\2"+
		"st\7t\2\2tu\7G\2\2uv\7c\2\2vw\7e\2\2wx\7j\2\2x\26\3\2\2\2yz\7k\2\2z{\7"+
		"p\2\2{\30\3\2\2\2|}\7k\2\2}~\7h\2\2~\32\3\2\2\2\177\u0080\7g\2\2\u0080"+
		"\u0081\7n\2\2\u0081\u0082\7u\2\2\u0082\u0083\7g\2\2\u0083\34\3\2\2\2\u0084"+
		"\u0085\7y\2\2\u0085\u0086\7j\2\2\u0086\u0087\7k\2\2\u0087\u0088\7n\2\2"+
		"\u0088\u0089\7g\2\2\u0089\36\3\2\2\2\u008a\u008b\7o\2\2\u008b\u008c\7"+
		"c\2\2\u008c\u008d\7k\2\2\u008d\u008e\7p\2\2\u008e \3\2\2\2\u008f\u0090"+
		"\7h\2\2\u0090\u0091\7w\2\2\u0091\u0092\7p\2\2\u0092\u0093\7e\2\2\u0093"+
		"\"\3\2\2\2\u0094\u0095\7t\2\2\u0095\u0096\7g\2\2\u0096\u0097\7v\2\2\u0097"+
		"\u0098\7w\2\2\u0098\u0099\7t\2\2\u0099\u009a\7p\2\2\u009a$\3\2\2\2\u009b"+
		"\u009c\7x\2\2\u009c\u009d\7q\2\2\u009d\u009e\7k\2\2\u009e\u009f\7f\2\2"+
		"\u009f&\3\2\2\2\u00a0\u00a1\7r\2\2\u00a1\u00a2\7t\2\2\u00a2\u00a3\7k\2"+
		"\2\u00a3\u00a4\7p\2\2\u00a4\u00a5\7v\2\2\u00a5(\3\2\2\2\u00a6\u00a7\7"+
		"i\2\2\u00a7\u00a8\7g\2\2\u00a8\u00a9\7v\2\2\u00a9*\3\2\2\2\u00aa\u00ab"+
		"\7e\2\2\u00ab\u00ac\7q\2\2\u00ac\u00ad\7p\2\2\u00ad\u00ae\7v\2\2\u00ae"+
		"\u00af\7c\2\2\u00af\u00b0\7k\2\2\u00b0\u00b1\7p\2\2\u00b1\u00b2\7u\2\2"+
		"\u00b2,\3\2\2\2\u00b3\u00b4\7r\2\2\u00b4\u00b5\7q\2\2\u00b5\u00b6\7y\2"+
		"\2\u00b6\u00b7\7g\2\2\u00b7\u00b8\7t\2\2\u00b8.\3\2\2\2\u00b9\u00ba\7"+
		"j\2\2\u00ba\u00bb\7c\2\2\u00bb\u00bc\7u\2\2\u00bc\u00bd\7P\2\2\u00bd\u00be"+
		"\7g\2\2\u00be\u00bf\7z\2\2\u00bf\u00c0\7v\2\2\u00c0\60\3\2\2\2\u00c1\u00c2"+
		"\7?\2\2\u00c2\62\3\2\2\2\u00c3\u00c4\7\60\2\2\u00c4\64\3\2\2\2\u00c5\u00c6"+
		"\7.\2\2\u00c6\66\3\2\2\2\u00c7\u00c8\7<\2\2\u00c88\3\2\2\2\u00c9\u00ca"+
		"\7/\2\2\u00ca\u00cb\7@\2\2\u00cb:\3\2\2\2\u00cc\u00cd\7-\2\2\u00cd<\3"+
		"\2\2\2\u00ce\u00cf\7/\2\2\u00cf>\3\2\2\2\u00d0\u00d1\7,\2\2\u00d1@\3\2"+
		"\2\2\u00d2\u00d3\7\61\2\2\u00d3B\3\2\2\2\u00d4\u00d5\7#\2\2\u00d5D\3\2"+
		"\2\2\u00d6\u00d7\7?\2\2\u00d7\u00d8\7?\2\2\u00d8F\3\2\2\2\u00d9\u00da"+
		"\7#\2\2\u00da\u00db\7?\2\2\u00dbH\3\2\2\2\u00dc\u00dd\7>\2\2\u00ddJ\3"+
		"\2\2\2\u00de\u00df\7@\2\2\u00dfL\3\2\2\2\u00e0\u00e2\t\2\2\2\u00e1\u00e0"+
		"\3\2\2\2\u00e2\u00e3\3\2\2\2\u00e3\u00e1\3\2\2\2\u00e3\u00e4\3\2\2\2\u00e4"+
		"\u00e5\3\2\2\2\u00e5\u00e6\b\'\2\2\u00e6N\3\2\2\2\u00e7\u00eb\t\3\2\2"+
		"\u00e8\u00ea\t\4\2\2\u00e9\u00e8\3\2\2\2\u00ea\u00ed\3\2\2\2\u00eb\u00e9"+
		"\3\2\2\2\u00eb\u00ec\3\2\2\2\u00ecP\3\2\2\2\u00ed\u00eb\3\2\2\2\u00ee"+
		"\u00f0\t\5\2\2\u00ef\u00ee\3\2\2\2\u00f0\u00f1\3\2\2\2\u00f1\u00ef\3\2"+
		"\2\2\u00f1\u00f2\3\2\2\2\u00f2R\3\2\2\2\u00f3\u00f5\7$\2\2\u00f4\u00f6"+
		"\13\2\2\2\u00f5\u00f4\3\2\2\2\u00f6\u00f7\3\2\2\2\u00f7\u00f8\3\2\2\2"+
		"\u00f7\u00f5\3\2\2\2\u00f8\u00f9\3\2\2\2\u00f9\u00fa\7$\2\2\u00faT\3\2"+
		"\2\2\7\2\u00e3\u00eb\u00f1\u00f7\3\b\2\2";
	public static final ATN _ATN =
		new ATNDeserializer().deserialize(_serializedATN.toCharArray());
	static {
		_decisionToDFA = new DFA[_ATN.getNumberOfDecisions()];
		for (int i = 0; i < _ATN.getNumberOfDecisions(); i++) {
			_decisionToDFA[i] = new DFA(_ATN.getDecisionState(i), i);
		}
	}
}