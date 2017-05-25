// Generated from simple.g4 by ANTLR 4.4
package com.compiladores.primero.Prueba1;
import org.antlr.v4.runtime.Lexer;
import org.antlr.v4.runtime.CharStream;
import org.antlr.v4.runtime.Token;
import org.antlr.v4.runtime.TokenStream;
import org.antlr.v4.runtime.*;
import org.antlr.v4.runtime.atn.*;
import org.antlr.v4.runtime.dfa.DFA;
import org.antlr.v4.runtime.misc.*;

@SuppressWarnings({"all", "warnings", "unchecked", "unused", "cast"})
public class simpleLexer extends Lexer {
	static { RuntimeMetaData.checkVersion("4.4", RuntimeMetaData.VERSION); }

	protected static final DFA[] _decisionToDFA;
	protected static final PredictionContextCache _sharedContextCache =
		new PredictionContextCache();
	public static final int
		COMILLAS=1, PUNTOCOMA=2, ESPACIO=3, PAREND=4, PARENI=5, ASIGNA=6, SALTOLINEA=7, 
		MAIN=8, PAR=9, LLAVE=10, CARACTER=11, CICLO1=12, C=13, ID=14, INT=15, 
		WS=16;
	public static String[] modeNames = {
		"DEFAULT_MODE"
	};

	public static final String[] tokenNames = {
		"'\\u0000'", "'\\u0001'", "'\\u0002'", "'\\u0003'", "'\\u0004'", "'\\u0005'", 
		"'\\u0006'", "'\\u0007'", "'\b'", "'\t'", "'\n'", "'\\u000B'", "'\f'", 
		"'\r'", "'\\u000E'", "'\\u000F'", "'\\u0010'"
	};
	public static final String[] ruleNames = {
		"COMILLAS", "PUNTOCOMA", "ESPACIO", "PAREND", "PARENI", "ASIGNA", "SALTOLINEA", 
		"MAIN", "PAR", "LLAVE", "CARACTER", "CICLO1", "C", "ID", "INT", "WS"
	};


	public simpleLexer(CharStream input) {
		super(input);
		_interp = new LexerATNSimulator(this,_ATN,_decisionToDFA,_sharedContextCache);
	}

	@Override
	public String getGrammarFileName() { return "simple.g4"; }

	@Override
	public String[] getTokenNames() { return tokenNames; }

	@Override
	public String[] getRuleNames() { return ruleNames; }

	@Override
	public String getSerializedATN() { return _serializedATN; }

	@Override
	public String[] getModeNames() { return modeNames; }

	@Override
	public ATN getATN() { return _ATN; }

	public static final String _serializedATN =
		"\3\u0430\ud6d1\u8206\uad2d\u4417\uaef1\u8d80\uaadd\2\22c\b\1\4\2\t\2\4"+
		"\3\t\3\4\4\t\4\4\5\t\5\4\6\t\6\4\7\t\7\4\b\t\b\4\t\t\t\4\n\t\n\4\13\t"+
		"\13\4\f\t\f\4\r\t\r\4\16\t\16\4\17\t\17\4\20\t\20\4\21\t\21\3\2\3\2\3"+
		"\3\3\3\3\4\3\4\3\5\3\5\3\6\3\6\3\7\3\7\3\b\6\b\61\n\b\r\b\16\b\62\3\b"+
		"\3\b\3\t\3\t\3\t\3\t\3\t\3\t\3\t\3\t\3\t\3\t\3\n\3\n\3\n\3\13\3\13\3\f"+
		"\3\f\7\fH\n\f\f\f\16\fK\13\f\3\r\3\r\3\16\3\16\3\16\3\16\3\17\6\17T\n"+
		"\17\r\17\16\17U\3\20\6\20Y\n\20\r\20\16\20Z\3\21\6\21^\n\21\r\21\16\21"+
		"_\3\21\3\21\2\2\22\3\3\5\4\7\5\t\6\13\7\r\b\17\t\21\n\23\13\25\f\27\r"+
		"\31\16\33\17\35\20\37\21!\22\3\2\6\5\2\13\f\17\17\"\"\5\2C\\aac|\6\2\62"+
		";C\\aac|\4\2C\\c|g\2\3\3\2\2\2\2\5\3\2\2\2\2\7\3\2\2\2\2\t\3\2\2\2\2\13"+
		"\3\2\2\2\2\r\3\2\2\2\2\17\3\2\2\2\2\21\3\2\2\2\2\23\3\2\2\2\2\25\3\2\2"+
		"\2\2\27\3\2\2\2\2\31\3\2\2\2\2\33\3\2\2\2\2\35\3\2\2\2\2\37\3\2\2\2\2"+
		"!\3\2\2\2\3#\3\2\2\2\5%\3\2\2\2\7\'\3\2\2\2\t)\3\2\2\2\13+\3\2\2\2\r-"+
		"\3\2\2\2\17\60\3\2\2\2\21\66\3\2\2\2\23@\3\2\2\2\25C\3\2\2\2\27E\3\2\2"+
		"\2\31L\3\2\2\2\33N\3\2\2\2\35S\3\2\2\2\37X\3\2\2\2!]\3\2\2\2#$\7$\2\2"+
		"$\4\3\2\2\2%&\7=\2\2&\6\3\2\2\2\'(\7\"\2\2(\b\3\2\2\2)*\7+\2\2*\n\3\2"+
		"\2\2+,\7*\2\2,\f\3\2\2\2-.\7?\2\2.\16\3\2\2\2/\61\t\2\2\2\60/\3\2\2\2"+
		"\61\62\3\2\2\2\62\60\3\2\2\2\62\63\3\2\2\2\63\64\3\2\2\2\64\65\b\b\2\2"+
		"\65\20\3\2\2\2\66\67\7r\2\2\678\7t\2\289\7k\2\29:\7p\2\2:;\7e\2\2;<\7"+
		"k\2\2<=\7r\2\2=>\7c\2\2>?\7n\2\2?\22\3\2\2\2@A\7*\2\2AB\7+\2\2B\24\3\2"+
		"\2\2CD\7}\2\2D\26\3\2\2\2EI\t\3\2\2FH\t\4\2\2GF\3\2\2\2HK\3\2\2\2IG\3"+
		"\2\2\2IJ\3\2\2\2J\30\3\2\2\2KI\3\2\2\2LM\7H\2\2M\32\3\2\2\2NO\7h\2\2O"+
		"P\7q\2\2PQ\7t\2\2Q\34\3\2\2\2RT\t\5\2\2SR\3\2\2\2TU\3\2\2\2US\3\2\2\2"+
		"UV\3\2\2\2V\36\3\2\2\2WY\4\62;\2XW\3\2\2\2YZ\3\2\2\2ZX\3\2\2\2Z[\3\2\2"+
		"\2[ \3\2\2\2\\^\t\2\2\2]\\\3\2\2\2^_\3\2\2\2_]\3\2\2\2_`\3\2\2\2`a\3\2"+
		"\2\2ab\b\21\2\2b\"\3\2\2\2\b\2\62IUZ_\3\b\2\2";
	public static final ATN _ATN =
		new ATNDeserializer().deserialize(_serializedATN.toCharArray());
	static {
		_decisionToDFA = new DFA[_ATN.getNumberOfDecisions()];
		for (int i = 0; i < _ATN.getNumberOfDecisions(); i++) {
			_decisionToDFA[i] = new DFA(_ATN.getDecisionState(i), i);
		}
	}
}