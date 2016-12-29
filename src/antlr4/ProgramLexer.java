// Generated from C:/Users/Mariusz/Documents/PJN/QA_Cities/src/antlr4\Program.g4 by ANTLR 4.5.3
package antlr4;
import org.antlr.v4.runtime.Lexer;
import org.antlr.v4.runtime.CharStream;
import org.antlr.v4.runtime.Token;
import org.antlr.v4.runtime.TokenStream;
import org.antlr.v4.runtime.*;
import org.antlr.v4.runtime.atn.*;
import org.antlr.v4.runtime.dfa.DFA;
import org.antlr.v4.runtime.misc.*;

@SuppressWarnings({"all", "warnings", "unchecked", "unused", "cast"})
public class ProgramLexer extends Lexer {
	static { RuntimeMetaData.checkVersion("4.5.3", RuntimeMetaData.VERSION); }

	protected static final DFA[] _decisionToDFA;
	protected static final PredictionContextCache _sharedContextCache =
		new PredictionContextCache();
	public static final int
		QUESTION_WORD=1, TYPE_WORD=2, LOCATION=3, NOUN=4, TEXT=5, WHITESPACE=6;
	public static String[] modeNames = {
		"DEFAULT_MODE"
	};

	public static final String[] ruleNames = {
		"QUESTION_WORD", "TYPE_WORD", "LOCATION", "NOUN", "TEXT", "WHITESPACE"
	};

	private static final String[] _LITERAL_NAMES = {
	};
	private static final String[] _SYMBOLIC_NAMES = {
		null, "QUESTION_WORD", "TYPE_WORD", "LOCATION", "NOUN", "TEXT", "WHITESPACE"
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


	public ProgramLexer(CharStream input) {
		super(input);
		_interp = new LexerATNSimulator(this,_ATN,_decisionToDFA,_sharedContextCache);
	}

	@Override
	public String getGrammarFileName() { return "Program.g4"; }

	@Override
	public String[] getRuleNames() { return ruleNames; }

	@Override
	public String getSerializedATN() { return _serializedATN; }

	@Override
	public String[] getModeNames() { return modeNames; }

	@Override
	public ATN getATN() { return _ATN; }

	public static final String _serializedATN =
		"\3\u0430\ud6d1\u8206\uad2d\u4417\uaef1\u8d80\uaadd\2\b\u009f\b\1\4\2\t"+
		"\2\4\3\t\3\4\4\t\4\4\5\t\5\4\6\t\6\4\7\t\7\3\2\3\2\3\2\3\2\3\2\3\2\3\2"+
		"\3\2\3\2\3\2\3\2\3\2\3\2\3\2\3\2\3\2\3\2\3\2\6\2\"\n\2\r\2\16\2#\5\2&"+
		"\n\2\3\3\3\3\3\3\3\3\3\3\3\3\3\3\6\3/\n\3\r\3\16\3\60\3\3\3\3\3\3\3\3"+
		"\3\3\3\3\3\3\6\3:\n\3\r\3\16\3;\3\3\3\3\3\3\3\3\3\3\3\3\6\3D\n\3\r\3\16"+
		"\3E\5\3H\n\3\3\4\3\4\3\4\3\4\3\4\3\4\3\4\3\4\3\4\3\4\3\4\3\4\3\4\3\4\3"+
		"\4\3\4\3\4\3\4\3\4\3\4\3\4\3\4\3\4\3\4\3\4\5\4c\n\4\3\5\3\5\3\5\3\5\3"+
		"\5\3\5\3\5\6\5l\n\5\r\5\16\5m\3\5\3\5\3\5\3\5\3\5\6\5u\n\5\r\5\16\5v\3"+
		"\5\3\5\3\5\3\5\3\5\3\5\3\5\3\5\3\5\6\5\u0082\n\5\r\5\16\5\u0083\3\5\3"+
		"\5\3\5\3\5\3\5\6\5\u008b\n\5\r\5\16\5\u008c\5\5\u008f\n\5\3\6\6\6\u0092"+
		"\n\6\r\6\16\6\u0093\3\6\5\6\u0097\n\6\3\7\6\7\u009a\n\7\r\7\16\7\u009b"+
		"\3\7\3\7\2\2\b\3\3\5\4\7\5\t\6\13\7\r\b\3\2\b\4\2IIii\4\2EEee\4\2KKkk"+
		"\4\2LLll\4\2\60\60C|\5\2\13\f\16\17\"\"\u00b6\2\3\3\2\2\2\2\5\3\2\2\2"+
		"\2\7\3\2\2\2\2\t\3\2\2\2\2\13\3\2\2\2\2\r\3\2\2\2\3%\3\2\2\2\5G\3\2\2"+
		"\2\7b\3\2\2\2\t\u008e\3\2\2\2\13\u0096\3\2\2\2\r\u0099\3\2\2\2\17\20\t"+
		"\2\2\2\20\21\7f\2\2\21\22\7|\2\2\22\23\7k\2\2\23&\7g\2\2\24\25\t\3\2\2"+
		"\25&\7q\2\2\26\27\t\3\2\2\27\30\7|\2\2\30&\7{\2\2\31\32\t\4\2\2\32\33"+
		"\7n\2\2\33&\7g\2\2\34\35\t\5\2\2\35\36\7c\2\2\36\37\7m\2\2\37!\3\2\2\2"+
		" \"\4c|\2! \3\2\2\2\"#\3\2\2\2#!\3\2\2\2#$\3\2\2\2$&\3\2\2\2%\17\3\2\2"+
		"\2%\24\3\2\2\2%\26\3\2\2\2%\31\3\2\2\2%\34\3\2\2\2&\4\3\2\2\2\'(\7o\2"+
		"\2()\7k\2\2)*\7g\2\2*+\7u\2\2+,\7e\2\2,.\3\2\2\2-/\4c|\2.-\3\2\2\2/\60"+
		"\3\2\2\2\60.\3\2\2\2\60\61\3\2\2\2\61H\3\2\2\2\62\63\7o\2\2\63\64\7k\2"+
		"\2\64\65\7c\2\2\65\66\7u\2\2\66\67\7v\2\2\679\3\2\2\28:\4c|\298\3\2\2"+
		"\2:;\3\2\2\2;9\3\2\2\2;<\3\2\2\2<H\3\2\2\2=>\7q\2\2>?\7u\2\2?@\7q\2\2"+
		"@A\7d\2\2AC\3\2\2\2BD\4c|\2CB\3\2\2\2DE\3\2\2\2EC\3\2\2\2EF\3\2\2\2FH"+
		"\3\2\2\2G\'\3\2\2\2G\62\3\2\2\2G=\3\2\2\2H\6\3\2\2\2IJ\7n\2\2JK\7g\2\2"+
		"KL\7|\2\2Lc\7{\2\2MN\7l\2\2NO\7g\2\2OP\7u\2\2Pc\7v\2\2QR\7|\2\2RS\7p\2"+
		"\2ST\7c\2\2TU\7l\2\2UV\7f\2\2VW\7w\2\2WX\7l\2\2Xc\7g\2\2YZ\7o\2\2Zc\7"+
		"c\2\2[\\\7r\2\2\\]\7q\2\2]^\7u\2\2^_\7k\2\2_`\7c\2\2`a\7f\2\2ac\7c\2\2"+
		"bI\3\2\2\2bM\3\2\2\2bQ\3\2\2\2bY\3\2\2\2b[\3\2\2\2c\b\3\2\2\2de\7r\2\2"+
		"ef\7q\2\2fg\7n\2\2gh\7q\2\2hi\7|\2\2ik\3\2\2\2jl\4c|\2kj\3\2\2\2lm\3\2"+
		"\2\2mk\3\2\2\2mn\3\2\2\2n\u008f\3\2\2\2op\7n\2\2pq\7w\2\2qr\7f\2\2rt\3"+
		"\2\2\2su\4c|\2ts\3\2\2\2uv\3\2\2\2vt\3\2\2\2vw\3\2\2\2w\u008f\3\2\2\2"+
		"xy\7r\2\2yz\7q\2\2z{\7y\2\2{|\7k\2\2|}\7g\2\2}~\7t\2\2~\177\7|\2\2\177"+
		"\u0081\3\2\2\2\u0080\u0082\4c|\2\u0081\u0080\3\2\2\2\u0082\u0083\3\2\2"+
		"\2\u0083\u0081\3\2\2\2\u0083\u0084\3\2\2\2\u0084\u008f\3\2\2\2\u0085\u0086"+
		"\7y\2\2\u0086\u0087\7u\2\2\u0087\u0088\7r\2\2\u0088\u008a\3\2\2\2\u0089"+
		"\u008b\4c|\2\u008a\u0089\3\2\2\2\u008b\u008c\3\2\2\2\u008c\u008a\3\2\2"+
		"\2\u008c\u008d\3\2\2\2\u008d\u008f\3\2\2\2\u008ed\3\2\2\2\u008eo\3\2\2"+
		"\2\u008ex\3\2\2\2\u008e\u0085\3\2\2\2\u008f\n\3\2\2\2\u0090\u0092\t\6"+
		"\2\2\u0091\u0090\3\2\2\2\u0092\u0093\3\2\2\2\u0093\u0091\3\2\2\2\u0093"+
		"\u0094\3\2\2\2\u0094\u0097\3\2\2\2\u0095\u0097\7A\2\2\u0096\u0091\3\2"+
		"\2\2\u0096\u0095\3\2\2\2\u0097\f\3\2\2\2\u0098\u009a\t\7\2\2\u0099\u0098"+
		"\3\2\2\2\u009a\u009b\3\2\2\2\u009b\u0099\3\2\2\2\u009b\u009c\3\2\2\2\u009c"+
		"\u009d\3\2\2\2\u009d\u009e\b\7\2\2\u009e\16\3\2\2\2\23\2#%\60;EGbmv\u0083"+
		"\u008c\u008e\u0091\u0093\u0096\u009b\3\b\2\2";
	public static final ATN _ATN =
		new ATNDeserializer().deserialize(_serializedATN.toCharArray());
	static {
		_decisionToDFA = new DFA[_ATN.getNumberOfDecisions()];
		for (int i = 0; i < _ATN.getNumberOfDecisions(); i++) {
			_decisionToDFA[i] = new DFA(_ATN.getDecisionState(i), i);
		}
	}
}