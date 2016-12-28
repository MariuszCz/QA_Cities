// Generated from C:/Users/Mariusz/Documents/PJN/QA_Cities/src/antlr4\Program.g4 by ANTLR 4.5.3
package antlr4;
import org.antlr.v4.runtime.atn.*;
import org.antlr.v4.runtime.dfa.DFA;
import org.antlr.v4.runtime.*;
import org.antlr.v4.runtime.misc.*;
import org.antlr.v4.runtime.tree.*;
import java.util.List;
import java.util.Iterator;
import java.util.ArrayList;

@SuppressWarnings({"all", "warnings", "unchecked", "unused", "cast"})
public class ProgramParser extends Parser {
	static { RuntimeMetaData.checkVersion("4.5.3", RuntimeMetaData.VERSION); }

	protected static final DFA[] _decisionToDFA;
	protected static final PredictionContextCache _sharedContextCache =
		new PredictionContextCache();
	public static final int
		QUESTION_WORD=1, TYPE_WORD=2, LOCATION=3, TEXT=4, WHITESPACE=5;
	public static final int
		RULE_innyTekst = 0, RULE_pytajnik = 1, RULE_czasownik = 2, RULE_typ = 3, 
		RULE_nazwa = 4, RULE_question = 5;
	public static final String[] ruleNames = {
		"innyTekst", "pytajnik", "czasownik", "typ", "nazwa", "question"
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

	@Override
	public String getGrammarFileName() { return "Program.g4"; }

	@Override
	public String[] getRuleNames() { return ruleNames; }

	@Override
	public String getSerializedATN() { return _serializedATN; }

	@Override
	public ATN getATN() { return _ATN; }

	public ProgramParser(TokenStream input) {
		super(input);
		_interp = new ParserATNSimulator(this,_ATN,_decisionToDFA,_sharedContextCache);
	}
	public static class InnyTekstContext extends ParserRuleContext {
		public List<TerminalNode> TEXT() { return getTokens(ProgramParser.TEXT); }
		public TerminalNode TEXT(int i) {
			return getToken(ProgramParser.TEXT, i);
		}
		public InnyTekstContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_innyTekst; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof ProgramListener ) ((ProgramListener)listener).enterInnyTekst(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof ProgramListener ) ((ProgramListener)listener).exitInnyTekst(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof ProgramVisitor ) return ((ProgramVisitor<? extends T>)visitor).visitInnyTekst(this);
			else return visitor.visitChildren(this);
		}
	}

	public final InnyTekstContext innyTekst() throws RecognitionException {
		InnyTekstContext _localctx = new InnyTekstContext(_ctx, getState());
		enterRule(_localctx, 0, RULE_innyTekst);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(15);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==TEXT) {
				{
				{
				setState(12);
				match(TEXT);
				}
				}
				setState(17);
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

	public static class PytajnikContext extends ParserRuleContext {
		public TerminalNode QUESTION_WORD() { return getToken(ProgramParser.QUESTION_WORD, 0); }
		public PytajnikContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_pytajnik; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof ProgramListener ) ((ProgramListener)listener).enterPytajnik(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof ProgramListener ) ((ProgramListener)listener).exitPytajnik(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof ProgramVisitor ) return ((ProgramVisitor<? extends T>)visitor).visitPytajnik(this);
			else return visitor.visitChildren(this);
		}
	}

	public final PytajnikContext pytajnik() throws RecognitionException {
		PytajnikContext _localctx = new PytajnikContext(_ctx, getState());
		enterRule(_localctx, 2, RULE_pytajnik);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(18);
			match(QUESTION_WORD);
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

	public static class CzasownikContext extends ParserRuleContext {
		public PytajnikContext pytajnik() {
			return getRuleContext(PytajnikContext.class,0);
		}
		public InnyTekstContext innyTekst() {
			return getRuleContext(InnyTekstContext.class,0);
		}
		public TerminalNode LOCATION() { return getToken(ProgramParser.LOCATION, 0); }
		public CzasownikContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_czasownik; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof ProgramListener ) ((ProgramListener)listener).enterCzasownik(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof ProgramListener ) ((ProgramListener)listener).exitCzasownik(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof ProgramVisitor ) return ((ProgramVisitor<? extends T>)visitor).visitCzasownik(this);
			else return visitor.visitChildren(this);
		}
	}

	public final CzasownikContext czasownik() throws RecognitionException {
		CzasownikContext _localctx = new CzasownikContext(_ctx, getState());
		enterRule(_localctx, 4, RULE_czasownik);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(20);
			pytajnik();
			setState(21);
			innyTekst();
			setState(22);
			match(LOCATION);
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

	public static class TypContext extends ParserRuleContext {
		public CzasownikContext czasownik() {
			return getRuleContext(CzasownikContext.class,0);
		}
		public InnyTekstContext innyTekst() {
			return getRuleContext(InnyTekstContext.class,0);
		}
		public TerminalNode TYPE_WORD() { return getToken(ProgramParser.TYPE_WORD, 0); }
		public TypContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_typ; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof ProgramListener ) ((ProgramListener)listener).enterTyp(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof ProgramListener ) ((ProgramListener)listener).exitTyp(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof ProgramVisitor ) return ((ProgramVisitor<? extends T>)visitor).visitTyp(this);
			else return visitor.visitChildren(this);
		}
	}

	public final TypContext typ() throws RecognitionException {
		TypContext _localctx = new TypContext(_ctx, getState());
		enterRule(_localctx, 6, RULE_typ);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(24);
			czasownik();
			setState(25);
			innyTekst();
			setState(26);
			match(TYPE_WORD);
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

	public static class NazwaContext extends ParserRuleContext {
		public TypContext typ() {
			return getRuleContext(TypContext.class,0);
		}
		public TerminalNode TEXT() { return getToken(ProgramParser.TEXT, 0); }
		public InnyTekstContext innyTekst() {
			return getRuleContext(InnyTekstContext.class,0);
		}
		public NazwaContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_nazwa; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof ProgramListener ) ((ProgramListener)listener).enterNazwa(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof ProgramListener ) ((ProgramListener)listener).exitNazwa(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof ProgramVisitor ) return ((ProgramVisitor<? extends T>)visitor).visitNazwa(this);
			else return visitor.visitChildren(this);
		}
	}

	public final NazwaContext nazwa() throws RecognitionException {
		NazwaContext _localctx = new NazwaContext(_ctx, getState());
		enterRule(_localctx, 8, RULE_nazwa);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(28);
			typ();
			setState(29);
			match(TEXT);
			setState(30);
			innyTekst();
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

	public static class QuestionContext extends ParserRuleContext {
		public List<NazwaContext> nazwa() {
			return getRuleContexts(NazwaContext.class);
		}
		public NazwaContext nazwa(int i) {
			return getRuleContext(NazwaContext.class,i);
		}
		public QuestionContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_question; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof ProgramListener ) ((ProgramListener)listener).enterQuestion(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof ProgramListener ) ((ProgramListener)listener).exitQuestion(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof ProgramVisitor ) return ((ProgramVisitor<? extends T>)visitor).visitQuestion(this);
			else return visitor.visitChildren(this);
		}
	}

	public final QuestionContext question() throws RecognitionException {
		QuestionContext _localctx = new QuestionContext(_ctx, getState());
		enterRule(_localctx, 10, RULE_question);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(35);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==QUESTION_WORD) {
				{
				{
				setState(32);
				nazwa();
				}
				}
				setState(37);
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

	public static final String _serializedATN =
		"\3\u0430\ud6d1\u8206\uad2d\u4417\uaef1\u8d80\uaadd\3\7)\4\2\t\2\4\3\t"+
		"\3\4\4\t\4\4\5\t\5\4\6\t\6\4\7\t\7\3\2\7\2\20\n\2\f\2\16\2\23\13\2\3\3"+
		"\3\3\3\4\3\4\3\4\3\4\3\5\3\5\3\5\3\5\3\6\3\6\3\6\3\6\3\7\7\7$\n\7\f\7"+
		"\16\7\'\13\7\3\7\2\2\b\2\4\6\b\n\f\2\2$\2\21\3\2\2\2\4\24\3\2\2\2\6\26"+
		"\3\2\2\2\b\32\3\2\2\2\n\36\3\2\2\2\f%\3\2\2\2\16\20\7\6\2\2\17\16\3\2"+
		"\2\2\20\23\3\2\2\2\21\17\3\2\2\2\21\22\3\2\2\2\22\3\3\2\2\2\23\21\3\2"+
		"\2\2\24\25\7\3\2\2\25\5\3\2\2\2\26\27\5\4\3\2\27\30\5\2\2\2\30\31\7\5"+
		"\2\2\31\7\3\2\2\2\32\33\5\6\4\2\33\34\5\2\2\2\34\35\7\4\2\2\35\t\3\2\2"+
		"\2\36\37\5\b\5\2\37 \7\6\2\2 !\5\2\2\2!\13\3\2\2\2\"$\5\n\6\2#\"\3\2\2"+
		"\2$\'\3\2\2\2%#\3\2\2\2%&\3\2\2\2&\r\3\2\2\2\'%\3\2\2\2\4\21%";
	public static final ATN _ATN =
		new ATNDeserializer().deserialize(_serializedATN.toCharArray());
	static {
		_decisionToDFA = new DFA[_ATN.getNumberOfDecisions()];
		for (int i = 0; i < _ATN.getNumberOfDecisions(); i++) {
			_decisionToDFA[i] = new DFA(_ATN.getDecisionState(i), i);
		}
	}
}