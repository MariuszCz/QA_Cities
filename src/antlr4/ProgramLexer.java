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
		QUESTION_WORD=1, TYPE_WORD=2, LOCATION=3, TEXT=4, WHITESPACE=5;
	public static String[] modeNames = {
		"DEFAULT_MODE"
	};

	public static final String[] ruleNames = {
		"QUESTION_WORD", "TYPE_WORD", "LOCATION", "TEXT", "WHITESPACE"
	};

	private static final String[] _LITERAL_NAMES = {
	};
	private static final String[] _SYMBOLIC_NAMES = {
		null, "QUESTION_WORD", "TYPE_WORD", "LOCATION", "TEXT", "WHITESPACE"
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
		"\3\u0430\ud6d1\u8206\uad2d\u4417\uaef1\u8d80\uaadd\2\7O\b\1\4\2\t\2\4"+
		"\3\t\3\4\4\t\4\4\5\t\5\4\6\t\6\3\2\3\2\3\2\3\2\3\2\3\2\3\2\3\2\3\2\3\2"+
		"\5\2\30\n\2\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\5\3%\n\3\3\4\3"+
		"\4\3\4\3\4\3\4\3\4\3\4\3\4\3\4\3\4\3\4\3\4\3\4\3\4\3\4\3\4\3\4\3\4\3\4"+
		"\3\4\3\4\3\4\3\4\3\4\5\4?\n\4\3\5\6\5B\n\5\r\5\16\5C\3\5\5\5G\n\5\3\6"+
		"\6\6J\n\6\r\6\16\6K\3\6\3\6\2\2\7\3\3\5\4\7\5\t\6\13\7\3\2\4\4\2\60\60"+
		"C|\5\2\13\f\16\17\"\"W\2\3\3\2\2\2\2\5\3\2\2\2\2\7\3\2\2\2\2\t\3\2\2\2"+
		"\2\13\3\2\2\2\3\27\3\2\2\2\5$\3\2\2\2\7>\3\2\2\2\tF\3\2\2\2\13I\3\2\2"+
		"\2\r\16\7i\2\2\16\17\7f\2\2\17\20\7|\2\2\20\21\7k\2\2\21\30\7g\2\2\22"+
		"\23\7e\2\2\23\30\7q\2\2\24\25\7e\2\2\25\26\7|\2\2\26\30\7{\2\2\27\r\3"+
		"\2\2\2\27\22\3\2\2\2\27\24\3\2\2\2\30\4\3\2\2\2\31\32\7o\2\2\32\33\7k"+
		"\2\2\33\34\7c\2\2\34\35\7u\2\2\35\36\7v\2\2\36%\7q\2\2\37 \7q\2\2 !\7"+
		"u\2\2!\"\7q\2\2\"#\7d\2\2#%\7c\2\2$\31\3\2\2\2$\37\3\2\2\2%\6\3\2\2\2"+
		"&\'\7n\2\2\'(\7g\2\2()\7|\2\2)?\7{\2\2*+\7l\2\2+,\7g\2\2,-\7u\2\2-?\7"+
		"v\2\2./\7r\2\2/\60\7q\2\2\60\61\7n\2\2\61\62\7q\2\2\62\63\7|\2\2\63\64"+
		"\7q\2\2\64\65\7p\2\2\65?\7g\2\2\66\67\7|\2\2\678\7p\2\289\7c\2\29:\7l"+
		"\2\2:;\7f\2\2;<\7w\2\2<=\7l\2\2=?\7g\2\2>&\3\2\2\2>*\3\2\2\2>.\3\2\2\2"+
		">\66\3\2\2\2?\b\3\2\2\2@B\t\2\2\2A@\3\2\2\2BC\3\2\2\2CA\3\2\2\2CD\3\2"+
		"\2\2DG\3\2\2\2EG\7A\2\2FA\3\2\2\2FE\3\2\2\2G\n\3\2\2\2HJ\t\3\2\2IH\3\2"+
		"\2\2JK\3\2\2\2KI\3\2\2\2KL\3\2\2\2LM\3\2\2\2MN\b\6\2\2N\f\3\2\2\2\n\2"+
		"\27$>ACFK\3\b\2\2";
	public static final ATN _ATN =
		new ATNDeserializer().deserialize(_serializedATN.toCharArray());
	static {
		_decisionToDFA = new DFA[_ATN.getNumberOfDecisions()];
		for (int i = 0; i < _ATN.getNumberOfDecisions(); i++) {
			_decisionToDFA[i] = new DFA(_ATN.getDecisionState(i), i);
		}
	}
}