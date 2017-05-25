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
		COMILLAS=1, PUNTOCOMA=2, ESPACIO=3, PAREND=4, PARENI=5, ASIGNA=6, SALTOLINEA=7, 
		MAIN=8, PAR=9, LLAVE=10, CARACTER=11, CICLO1=12, C=13, ID=14, INT=15, 
		WS=16;
	public static final String[] tokenNames = {
		"<INVALID>", "'\"'", "';'", "' '", "')'", "'('", "'='", "SALTOLINEA", 
		"'principal'", "'()'", "'{'", "CARACTER", "'F'", "'for'", "ID", "INT", 
		"WS"
	};
	public static final int
		RULE_start = 0, RULE_ciclofor = 1, RULE_inicio = 2, RULE_tipo = 3, RULE_mensaje = 4;
	public static final String[] ruleNames = {
		"start", "ciclofor", "inicio", "tipo", "mensaje"
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
	public static class StartContext extends ParserRuleContext {
		public MensajeContext mensaje() {
			return getRuleContext(MensajeContext.class,0);
		}
		public InicioContext inicio() {
			return getRuleContext(InicioContext.class,0);
		}
		public CicloforContext ciclofor() {
			return getRuleContext(CicloforContext.class,0);
		}
		public StartContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_start; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof simpleListener ) ((simpleListener)listener).enterStart(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof simpleListener ) ((simpleListener)listener).exitStart(this);
		}
	}

	public final StartContext start() throws RecognitionException {
		StartContext _localctx = new StartContext(_ctx, getState());
		enterRule(_localctx, 0, RULE_start);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(10); inicio();
			setState(11); mensaje();
			setState(12); ciclofor();
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

	public static class CicloforContext extends ParserRuleContext {
		public TerminalNode ASIGNA() { return getToken(simpleParser.ASIGNA, 0); }
		public TerminalNode PAREND() { return getToken(simpleParser.PAREND, 0); }
		public TerminalNode PUNTOCOMA() { return getToken(simpleParser.PUNTOCOMA, 0); }
		public TerminalNode CARACTER() { return getToken(simpleParser.CARACTER, 0); }
		public TerminalNode PARENI() { return getToken(simpleParser.PARENI, 0); }
		public TerminalNode ESPACIO(int i) {
			return getToken(simpleParser.ESPACIO, i);
		}
		public TerminalNode C() { return getToken(simpleParser.C, 0); }
		public TerminalNode INT() { return getToken(simpleParser.INT, 0); }
		public List<TerminalNode> ESPACIO() { return getTokens(simpleParser.ESPACIO); }
		public CicloforContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_ciclofor; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof simpleListener ) ((simpleListener)listener).enterCiclofor(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof simpleListener ) ((simpleListener)listener).exitCiclofor(this);
		}
	}

	public final CicloforContext ciclofor() throws RecognitionException {
		CicloforContext _localctx = new CicloforContext(_ctx, getState());
		enterRule(_localctx, 2, RULE_ciclofor);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(14); match(C);
			setState(15); match(ESPACIO);
			setState(16); match(PARENI);
			setState(17); match(CARACTER);
			setState(18); match(ESPACIO);
			setState(19); match(ASIGNA);
			setState(20); match(INT);
			setState(21); match(PUNTOCOMA);
			setState(22); match(PAREND);
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
		public TerminalNode PAR() { return getToken(simpleParser.PAR, 0); }
		public TerminalNode LLAVE() { return getToken(simpleParser.LLAVE, 0); }
		public TerminalNode MAIN() { return getToken(simpleParser.MAIN, 0); }
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
		enterRule(_localctx, 4, RULE_inicio);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(24); match(MAIN);
			setState(25); match(PAR);
			setState(26); match(LLAVE);
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

	public static class TipoContext extends ParserRuleContext {
		public TerminalNode ID() { return getToken(simpleParser.ID, 0); }
		public TerminalNode CARACTER() { return getToken(simpleParser.CARACTER, 0); }
		public TerminalNode INT() { return getToken(simpleParser.INT, 0); }
		public TipoContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_tipo; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof simpleListener ) ((simpleListener)listener).enterTipo(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof simpleListener ) ((simpleListener)listener).exitTipo(this);
		}
	}

	public final TipoContext tipo() throws RecognitionException {
		TipoContext _localctx = new TipoContext(_ctx, getState());
		enterRule(_localctx, 6, RULE_tipo);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(28); match(INT);
			setState(29); match(CARACTER);
			setState(30); match(ID);
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

	public static class MensajeContext extends ParserRuleContext {
		public TerminalNode COMILLAS(int i) {
			return getToken(simpleParser.COMILLAS, i);
		}
		public TerminalNode PUNTOCOMA() { return getToken(simpleParser.PUNTOCOMA, 0); }
		public TerminalNode CARACTER() { return getToken(simpleParser.CARACTER, 0); }
		public List<TerminalNode> COMILLAS() { return getTokens(simpleParser.COMILLAS); }
		public MensajeContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_mensaje; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof simpleListener ) ((simpleListener)listener).enterMensaje(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof simpleListener ) ((simpleListener)listener).exitMensaje(this);
		}
	}

	public final MensajeContext mensaje() throws RecognitionException {
		MensajeContext _localctx = new MensajeContext(_ctx, getState());
		enterRule(_localctx, 8, RULE_mensaje);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(32); match(COMILLAS);
			setState(33); match(CARACTER);
			setState(34); match(COMILLAS);
			setState(35); match(PUNTOCOMA);
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
		"\3\u0430\ud6d1\u8206\uad2d\u4417\uaef1\u8d80\uaadd\3\22(\4\2\t\2\4\3\t"+
		"\3\4\4\t\4\4\5\t\5\4\6\t\6\3\2\3\2\3\2\3\2\3\3\3\3\3\3\3\3\3\3\3\3\3\3"+
		"\3\3\3\3\3\3\3\4\3\4\3\4\3\4\3\5\3\5\3\5\3\5\3\6\3\6\3\6\3\6\3\6\3\6\2"+
		"\2\7\2\4\6\b\n\2\2\"\2\f\3\2\2\2\4\20\3\2\2\2\6\32\3\2\2\2\b\36\3\2\2"+
		"\2\n\"\3\2\2\2\f\r\5\6\4\2\r\16\5\n\6\2\16\17\5\4\3\2\17\3\3\2\2\2\20"+
		"\21\7\17\2\2\21\22\7\5\2\2\22\23\7\7\2\2\23\24\7\r\2\2\24\25\7\5\2\2\25"+
		"\26\7\b\2\2\26\27\7\21\2\2\27\30\7\4\2\2\30\31\7\6\2\2\31\5\3\2\2\2\32"+
		"\33\7\n\2\2\33\34\7\13\2\2\34\35\7\f\2\2\35\7\3\2\2\2\36\37\7\21\2\2\37"+
		" \7\r\2\2 !\7\20\2\2!\t\3\2\2\2\"#\7\3\2\2#$\7\r\2\2$%\7\3\2\2%&\7\4\2"+
		"\2&\13\3\2\2\2\2";
	public static final ATN _ATN =
		new ATNDeserializer().deserialize(_serializedATN.toCharArray());
	static {
		_decisionToDFA = new DFA[_ATN.getNumberOfDecisions()];
		for (int i = 0; i < _ATN.getNumberOfDecisions(); i++) {
			_decisionToDFA[i] = new DFA(_ATN.getDecisionState(i), i);
		}
	}
}