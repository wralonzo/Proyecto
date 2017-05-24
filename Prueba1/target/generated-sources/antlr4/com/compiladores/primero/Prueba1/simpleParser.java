// Generated from simple.g4 by ANTLR 4.4
package com.compiladores.primero.Prueba1;
import org.antlr.v4.runtime.atn.*;
import org.antlr.v4.runtime.dfa.DFA;
import org.antlr.v4.runtime.*;
import org.antlr.v4.runtime.misc.*;
import org.antlr.v4.runtime.tree.*;
import java.util.List;
import java.util.Iterator;
import java.util.ArrayList;

@SuppressWarnings({"all", "warnings", "unchecked", "unused", "cast"})
public class simpleParser extends Parser {
	static { RuntimeMetaData.checkVersion("4.4", RuntimeMetaData.VERSION); }

	protected static final DFA[] _decisionToDFA;
	protected static final PredictionContextCache _sharedContextCache =
		new PredictionContextCache();
	public static final int
		MAS=1, MENOS=2, MULTI=3, DIVIDIR=4, PAREND=5, PARENI=6, ASIGNA=7, ID=8, 
		INT=9, WS=10;
	public static final String[] tokenNames = {
		"<INVALID>", "'+'", "'-'", "'*'", "'/'", "')'", "'('", "'='", "ID", "INT", 
		"WS"
	};
	public static final int
		RULE_prog = 0, RULE_stat = 1, RULE_expr = 2, RULE_multExpr = 3, RULE_atom = 4, 
		RULE_proc = 5, RULE_inicio = 6, RULE_expresion = 7, RULE_convierte = 8, 
		RULE_siguiente = 9;
	public static final String[] ruleNames = {
		"prog", "stat", "expr", "multExpr", "atom", "proc", "inicio", "expresion", 
		"convierte", "siguiente"
	};

	@Override
	public String getGrammarFileName() { return "simple.g4"; }

	@Override
	public String[] getTokenNames() { return tokenNames; }

	@Override
	public String[] getRuleNames() { return ruleNames; }

	@Override
	public String getSerializedATN() { return _serializedATN; }

	@Override
	public ATN getATN() { return _ATN; }

	public simpleParser(TokenStream input) {
		super(input);
		_interp = new ParserATNSimulator(this,_ATN,_decisionToDFA,_sharedContextCache);
	}
	public static class ProgContext extends ParserRuleContext {
		public StatContext stat(int i) {
			return getRuleContext(StatContext.class,i);
		}
		public List<StatContext> stat() {
			return getRuleContexts(StatContext.class);
		}
		public ProgContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_prog; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof simpleListener ) ((simpleListener)listener).enterProg(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof simpleListener ) ((simpleListener)listener).exitProg(this);
		}
	}

	public final ProgContext prog() throws RecognitionException {
		ProgContext _localctx = new ProgContext(_ctx, getState());
		enterRule(_localctx, 0, RULE_prog);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(21); 
			_errHandler.sync(this);
			_la = _input.LA(1);
			do {
				{
				{
				setState(20); stat();
				}
				}
				setState(23); 
				_errHandler.sync(this);
				_la = _input.LA(1);
			} while ( (((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << PARENI) | (1L << ID) | (1L << INT))) != 0) );
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

	public static class StatContext extends ParserRuleContext {
		public TerminalNode ASIGNA() { return getToken(simpleParser.ASIGNA, 0); }
		public TerminalNode ID() { return getToken(simpleParser.ID, 0); }
		public ExprContext expr() {
			return getRuleContext(ExprContext.class,0);
		}
		public StatContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_stat; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof simpleListener ) ((simpleListener)listener).enterStat(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof simpleListener ) ((simpleListener)listener).exitStat(this);
		}
	}

	public final StatContext stat() throws RecognitionException {
		StatContext _localctx = new StatContext(_ctx, getState());
		enterRule(_localctx, 2, RULE_stat);
		try {
			setState(29);
			switch ( getInterpreter().adaptivePredict(_input,1,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(25); expr();
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(26); match(ID);
				setState(27); match(ASIGNA);
				setState(28); expr();
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

	public static class ExprContext extends ParserRuleContext {
		public List<TerminalNode> MENOS() { return getTokens(simpleParser.MENOS); }
		public List<TerminalNode> MAS() { return getTokens(simpleParser.MAS); }
		public TerminalNode MENOS(int i) {
			return getToken(simpleParser.MENOS, i);
		}
		public List<MultExprContext> multExpr() {
			return getRuleContexts(MultExprContext.class);
		}
		public TerminalNode MAS(int i) {
			return getToken(simpleParser.MAS, i);
		}
		public MultExprContext multExpr(int i) {
			return getRuleContext(MultExprContext.class,i);
		}
		public ExprContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_expr; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof simpleListener ) ((simpleListener)listener).enterExpr(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof simpleListener ) ((simpleListener)listener).exitExpr(this);
		}
	}

	public final ExprContext expr() throws RecognitionException {
		ExprContext _localctx = new ExprContext(_ctx, getState());
		enterRule(_localctx, 4, RULE_expr);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(31); multExpr();
			setState(36);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==MAS || _la==MENOS) {
				{
				{
				setState(32);
				_la = _input.LA(1);
				if ( !(_la==MAS || _la==MENOS) ) {
				_errHandler.recoverInline(this);
				}
				consume();
				setState(33); multExpr();
				}
				}
				setState(38);
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

	public static class MultExprContext extends ParserRuleContext {
		public List<TerminalNode> MULTI() { return getTokens(simpleParser.MULTI); }
		public AtomContext atom(int i) {
			return getRuleContext(AtomContext.class,i);
		}
		public List<TerminalNode> DIVIDIR() { return getTokens(simpleParser.DIVIDIR); }
		public TerminalNode DIVIDIR(int i) {
			return getToken(simpleParser.DIVIDIR, i);
		}
		public TerminalNode MULTI(int i) {
			return getToken(simpleParser.MULTI, i);
		}
		public List<AtomContext> atom() {
			return getRuleContexts(AtomContext.class);
		}
		public MultExprContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_multExpr; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof simpleListener ) ((simpleListener)listener).enterMultExpr(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof simpleListener ) ((simpleListener)listener).exitMultExpr(this);
		}
	}

	public final MultExprContext multExpr() throws RecognitionException {
		MultExprContext _localctx = new MultExprContext(_ctx, getState());
		enterRule(_localctx, 6, RULE_multExpr);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(39); atom();
			setState(44);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==MULTI || _la==DIVIDIR) {
				{
				{
				setState(40);
				_la = _input.LA(1);
				if ( !(_la==MULTI || _la==DIVIDIR) ) {
				_errHandler.recoverInline(this);
				}
				consume();
				setState(41); atom();
				}
				}
				setState(46);
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

	public static class AtomContext extends ParserRuleContext {
		public TerminalNode PAREND() { return getToken(simpleParser.PAREND, 0); }
		public TerminalNode ID() { return getToken(simpleParser.ID, 0); }
		public ExprContext expr() {
			return getRuleContext(ExprContext.class,0);
		}
		public TerminalNode PARENI() { return getToken(simpleParser.PARENI, 0); }
		public TerminalNode INT() { return getToken(simpleParser.INT, 0); }
		public AtomContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_atom; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof simpleListener ) ((simpleListener)listener).enterAtom(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof simpleListener ) ((simpleListener)listener).exitAtom(this);
		}
	}

	public final AtomContext atom() throws RecognitionException {
		AtomContext _localctx = new AtomContext(_ctx, getState());
		enterRule(_localctx, 8, RULE_atom);
		try {
			setState(53);
			switch (_input.LA(1)) {
			case INT:
				enterOuterAlt(_localctx, 1);
				{
				setState(47); match(INT);
				}
				break;
			case ID:
				enterOuterAlt(_localctx, 2);
				{
				setState(48); match(ID);
				}
				break;
			case PARENI:
				enterOuterAlt(_localctx, 3);
				{
				setState(49); match(PARENI);
				setState(50); expr();
				setState(51); match(PAREND);
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

	public static class ProcContext extends ParserRuleContext {
		public List<InicioContext> inicio() {
			return getRuleContexts(InicioContext.class);
		}
		public InicioContext inicio(int i) {
			return getRuleContext(InicioContext.class,i);
		}
		public ProcContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_proc; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof simpleListener ) ((simpleListener)listener).enterProc(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof simpleListener ) ((simpleListener)listener).exitProc(this);
		}
	}

	public final ProcContext proc() throws RecognitionException {
		ProcContext _localctx = new ProcContext(_ctx, getState());
		enterRule(_localctx, 10, RULE_proc);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(56); 
			_errHandler.sync(this);
			_la = _input.LA(1);
			do {
				{
				{
				setState(55); inicio();
				}
				}
				setState(58); 
				_errHandler.sync(this);
				_la = _input.LA(1);
			} while ( (((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << PARENI) | (1L << ID) | (1L << INT))) != 0) );
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

	public static class InicioContext extends ParserRuleContext {
		public TerminalNode ASIGNA() { return getToken(simpleParser.ASIGNA, 0); }
		public TerminalNode ID() { return getToken(simpleParser.ID, 0); }
		public ExpresionContext expresion() {
			return getRuleContext(ExpresionContext.class,0);
		}
		public InicioContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_inicio; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof simpleListener ) ((simpleListener)listener).enterInicio(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof simpleListener ) ((simpleListener)listener).exitInicio(this);
		}
	}

	public final InicioContext inicio() throws RecognitionException {
		InicioContext _localctx = new InicioContext(_ctx, getState());
		enterRule(_localctx, 12, RULE_inicio);
		try {
			setState(64);
			switch ( getInterpreter().adaptivePredict(_input,6,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(60); expresion();
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(61); match(ID);
				setState(62); match(ASIGNA);
				setState(63); expresion();
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

	public static class ExpresionContext extends ParserRuleContext {
		public List<TerminalNode> MENOS() { return getTokens(simpleParser.MENOS); }
		public List<ConvierteContext> convierte() {
			return getRuleContexts(ConvierteContext.class);
		}
		public TerminalNode MENOS(int i) {
			return getToken(simpleParser.MENOS, i);
		}
		public ConvierteContext convierte(int i) {
			return getRuleContext(ConvierteContext.class,i);
		}
		public ExpresionContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_expresion; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof simpleListener ) ((simpleListener)listener).enterExpresion(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof simpleListener ) ((simpleListener)listener).exitExpresion(this);
		}
	}

	public final ExpresionContext expresion() throws RecognitionException {
		ExpresionContext _localctx = new ExpresionContext(_ctx, getState());
		enterRule(_localctx, 14, RULE_expresion);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(66); convierte();
			setState(69); 
			_errHandler.sync(this);
			_la = _input.LA(1);
			do {
				{
				{
				{
				setState(67); match(MENOS);
				}
				setState(68); convierte();
				}
				}
				setState(71); 
				_errHandler.sync(this);
				_la = _input.LA(1);
			} while ( _la==MENOS );
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

	public static class ConvierteContext extends ParserRuleContext {
		public List<TerminalNode> MAS() { return getTokens(simpleParser.MAS); }
		public TerminalNode MAS(int i) {
			return getToken(simpleParser.MAS, i);
		}
		public List<SiguienteContext> siguiente() {
			return getRuleContexts(SiguienteContext.class);
		}
		public SiguienteContext siguiente(int i) {
			return getRuleContext(SiguienteContext.class,i);
		}
		public ConvierteContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_convierte; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof simpleListener ) ((simpleListener)listener).enterConvierte(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof simpleListener ) ((simpleListener)listener).exitConvierte(this);
		}
	}

	public final ConvierteContext convierte() throws RecognitionException {
		ConvierteContext _localctx = new ConvierteContext(_ctx, getState());
		enterRule(_localctx, 16, RULE_convierte);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(73); siguiente();
			setState(76); 
			_errHandler.sync(this);
			_la = _input.LA(1);
			do {
				{
				{
				{
				setState(74); match(MAS);
				}
				setState(75); siguiente();
				}
				}
				setState(78); 
				_errHandler.sync(this);
				_la = _input.LA(1);
			} while ( _la==MAS );
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

	public static class SiguienteContext extends ParserRuleContext {
		public TerminalNode PAREND() { return getToken(simpleParser.PAREND, 0); }
		public TerminalNode ID() { return getToken(simpleParser.ID, 0); }
		public ExpresionContext expresion() {
			return getRuleContext(ExpresionContext.class,0);
		}
		public TerminalNode PARENI() { return getToken(simpleParser.PARENI, 0); }
		public TerminalNode INT() { return getToken(simpleParser.INT, 0); }
		public SiguienteContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_siguiente; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof simpleListener ) ((simpleListener)listener).enterSiguiente(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof simpleListener ) ((simpleListener)listener).exitSiguiente(this);
		}
	}

	public final SiguienteContext siguiente() throws RecognitionException {
		SiguienteContext _localctx = new SiguienteContext(_ctx, getState());
		enterRule(_localctx, 18, RULE_siguiente);
		try {
			setState(86);
			switch (_input.LA(1)) {
			case INT:
				enterOuterAlt(_localctx, 1);
				{
				setState(80); match(INT);
				}
				break;
			case ID:
				enterOuterAlt(_localctx, 2);
				{
				setState(81); match(ID);
				}
				break;
			case PARENI:
				enterOuterAlt(_localctx, 3);
				{
				setState(82); match(PARENI);
				setState(83); expresion();
				setState(84); match(PAREND);
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

	public static final String _serializedATN =
		"\3\u0430\ud6d1\u8206\uad2d\u4417\uaef1\u8d80\uaadd\3\f[\4\2\t\2\4\3\t"+
		"\3\4\4\t\4\4\5\t\5\4\6\t\6\4\7\t\7\4\b\t\b\4\t\t\t\4\n\t\n\4\13\t\13\3"+
		"\2\6\2\30\n\2\r\2\16\2\31\3\3\3\3\3\3\3\3\5\3 \n\3\3\4\3\4\3\4\7\4%\n"+
		"\4\f\4\16\4(\13\4\3\5\3\5\3\5\7\5-\n\5\f\5\16\5\60\13\5\3\6\3\6\3\6\3"+
		"\6\3\6\3\6\5\68\n\6\3\7\6\7;\n\7\r\7\16\7<\3\b\3\b\3\b\3\b\5\bC\n\b\3"+
		"\t\3\t\3\t\6\tH\n\t\r\t\16\tI\3\n\3\n\3\n\6\nO\n\n\r\n\16\nP\3\13\3\13"+
		"\3\13\3\13\3\13\3\13\5\13Y\n\13\3\13\2\2\f\2\4\6\b\n\f\16\20\22\24\2\4"+
		"\3\2\3\4\3\2\5\6\\\2\27\3\2\2\2\4\37\3\2\2\2\6!\3\2\2\2\b)\3\2\2\2\n\67"+
		"\3\2\2\2\f:\3\2\2\2\16B\3\2\2\2\20D\3\2\2\2\22K\3\2\2\2\24X\3\2\2\2\26"+
		"\30\5\4\3\2\27\26\3\2\2\2\30\31\3\2\2\2\31\27\3\2\2\2\31\32\3\2\2\2\32"+
		"\3\3\2\2\2\33 \5\6\4\2\34\35\7\n\2\2\35\36\7\t\2\2\36 \5\6\4\2\37\33\3"+
		"\2\2\2\37\34\3\2\2\2 \5\3\2\2\2!&\5\b\5\2\"#\t\2\2\2#%\5\b\5\2$\"\3\2"+
		"\2\2%(\3\2\2\2&$\3\2\2\2&\'\3\2\2\2\'\7\3\2\2\2(&\3\2\2\2).\5\n\6\2*+"+
		"\t\3\2\2+-\5\n\6\2,*\3\2\2\2-\60\3\2\2\2.,\3\2\2\2./\3\2\2\2/\t\3\2\2"+
		"\2\60.\3\2\2\2\618\7\13\2\2\628\7\n\2\2\63\64\7\b\2\2\64\65\5\6\4\2\65"+
		"\66\7\7\2\2\668\3\2\2\2\67\61\3\2\2\2\67\62\3\2\2\2\67\63\3\2\2\28\13"+
		"\3\2\2\29;\5\16\b\2:9\3\2\2\2;<\3\2\2\2<:\3\2\2\2<=\3\2\2\2=\r\3\2\2\2"+
		">C\5\20\t\2?@\7\n\2\2@A\7\t\2\2AC\5\20\t\2B>\3\2\2\2B?\3\2\2\2C\17\3\2"+
		"\2\2DG\5\22\n\2EF\7\4\2\2FH\5\22\n\2GE\3\2\2\2HI\3\2\2\2IG\3\2\2\2IJ\3"+
		"\2\2\2J\21\3\2\2\2KN\5\24\13\2LM\7\3\2\2MO\5\24\13\2NL\3\2\2\2OP\3\2\2"+
		"\2PN\3\2\2\2PQ\3\2\2\2Q\23\3\2\2\2RY\7\13\2\2SY\7\n\2\2TU\7\b\2\2UV\5"+
		"\20\t\2VW\7\7\2\2WY\3\2\2\2XR\3\2\2\2XS\3\2\2\2XT\3\2\2\2Y\25\3\2\2\2"+
		"\f\31\37&.\67<BIPX";
	public static final ATN _ATN =
		new ATNDeserializer().deserialize(_serializedATN.toCharArray());
	static {
		_decisionToDFA = new DFA[_ATN.getNumberOfDecisions()];
		for (int i = 0; i < _ATN.getNumberOfDecisions(); i++) {
			_decisionToDFA[i] = new DFA(_ATN.getDecisionState(i), i);
		}
	}
}