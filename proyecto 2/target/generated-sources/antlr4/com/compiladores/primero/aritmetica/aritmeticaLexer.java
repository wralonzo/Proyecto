// Generated from aritmetica.g4 by ANTLR 4.4
package com.compiladores.primero.aritmetica;
import org.antlr.v4.runtime.Lexer;
import org.antlr.v4.runtime.CharStream;
import org.antlr.v4.runtime.Token;
import org.antlr.v4.runtime.TokenStream;
import org.antlr.v4.runtime.*;
import org.antlr.v4.runtime.atn.*;
import org.antlr.v4.runtime.dfa.DFA;
import org.antlr.v4.runtime.misc.*;

@SuppressWarnings({"all", "warnings", "unchecked", "unused", "cast"})
public class aritmeticaLexer extends Lexer {
	static { RuntimeMetaData.checkVersion("4.4", RuntimeMetaData.VERSION); }

	protected static final DFA[] _decisionToDFA;
	protected static final PredictionContextCache _sharedContextCache =
		new PredictionContextCache();
	public static final int
		T__4=1, T__3=2, T__2=3, T__1=4, T__0=5, PROGRAM=6, VAR=7, PRINTLN=8, PARA=9, 
		WHILE=10, PROCEDIMIENTO=11, FUNCION=12, RETURN=13, IF=14, ELSE=15, ELSEIF=16, 
		PLUS=17, MINUM=18, MULT=19, DIV=20, MASMAS=21, MENOSMENOS=22, AND=23, 
		OR=24, NOT=25, GT=26, LT=27, GEQ=28, LEQ=29, EQ=30, NEQ=31, ESP=32, ASSIGN=33, 
		BRACKET_OPEN=34, BRACKET_CLOSE=35, PAR_OPEN=36, PAR_CLOSE=37, SEMICOLON=38, 
		BOOLEAN=39, ID=40, NUMBER=41, WS=42;
	public static String[] modeNames = {
		"DEFAULT_MODE"
	};

	public static final String[] tokenNames = {
		"'\\u0000'", "'\\u0001'", "'\\u0002'", "'\\u0003'", "'\\u0004'", "'\\u0005'", 
		"'\\u0006'", "'\\u0007'", "'\b'", "'\t'", "'\n'", "'\\u000B'", "'\f'", 
		"'\r'", "'\\u000E'", "'\\u000F'", "'\\u0010'", "'\\u0011'", "'\\u0012'", 
		"'\\u0013'", "'\\u0014'", "'\\u0015'", "'\\u0016'", "'\\u0017'", "'\\u0018'", 
		"'\\u0019'", "'\\u001A'", "'\\u001B'", "'\\u001C'", "'\\u001D'", "'\\u001E'", 
		"'\\u001F'", "' '", "'!'", "'\"'", "'#'", "'$'", "'%'", "'&'", "'''", 
		"'('", "')'", "'*'"
	};
	public static final String[] ruleNames = {
		"T__4", "T__3", "T__2", "T__1", "T__0", "PROGRAM", "VAR", "PRINTLN", "PARA", 
		"WHILE", "PROCEDIMIENTO", "FUNCION", "RETURN", "IF", "ELSE", "ELSEIF", 
		"PLUS", "MINUM", "MULT", "DIV", "MASMAS", "MENOSMENOS", "AND", "OR", "NOT", 
		"GT", "LT", "GEQ", "LEQ", "EQ", "NEQ", "ESP", "ASSIGN", "BRACKET_OPEN", 
		"BRACKET_CLOSE", "PAR_OPEN", "PAR_CLOSE", "SEMICOLON", "BOOLEAN", "ID", 
		"NUMBER", "WS"
	};


	public aritmeticaLexer(CharStream input) {
		super(input);
		_interp = new LexerATNSimulator(this,_ATN,_decisionToDFA,_sharedContextCache);
	}

	@Override
	public String getGrammarFileName() { return "aritmetica.g4"; }

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
		"\3\u0430\ud6d1\u8206\uad2d\u4417\uaef1\u8d80\uaadd\2,\u0116\b\1\4\2\t"+
		"\2\4\3\t\3\4\4\t\4\4\5\t\5\4\6\t\6\4\7\t\7\4\b\t\b\4\t\t\t\4\n\t\n\4\13"+
		"\t\13\4\f\t\f\4\r\t\r\4\16\t\16\4\17\t\17\4\20\t\20\4\21\t\21\4\22\t\22"+
		"\4\23\t\23\4\24\t\24\4\25\t\25\4\26\t\26\4\27\t\27\4\30\t\30\4\31\t\31"+
		"\4\32\t\32\4\33\t\33\4\34\t\34\4\35\t\35\4\36\t\36\4\37\t\37\4 \t \4!"+
		"\t!\4\"\t\"\4#\t#\4$\t$\4%\t%\4&\t&\4\'\t\'\4(\t(\4)\t)\4*\t*\4+\t+\3"+
		"\2\3\2\3\3\3\3\3\3\3\4\3\4\3\4\3\5\3\5\3\5\3\6\3\6\3\6\3\6\3\6\3\6\3\6"+
		"\3\6\3\6\3\7\3\7\3\7\3\7\3\7\3\7\3\7\3\7\3\7\3\7\3\7\3\7\3\7\3\7\3\7\3"+
		"\b\3\b\3\b\3\b\3\b\3\t\3\t\3\t\3\t\3\t\3\t\3\t\3\t\3\t\3\t\3\n\3\n\3\n"+
		"\3\n\3\13\3\13\3\13\3\13\3\13\3\13\3\f\3\f\3\f\3\f\3\f\3\f\3\f\3\f\3\f"+
		"\3\f\3\f\3\f\3\f\3\f\3\f\3\r\3\r\3\r\3\r\3\r\3\r\3\r\3\r\3\r\3\16\3\16"+
		"\3\16\3\16\3\16\3\16\3\16\3\16\3\17\3\17\3\17\3\20\3\20\3\20\3\20\3\20"+
		"\3\21\3\21\3\21\3\21\3\21\3\21\3\21\3\22\3\22\3\23\3\23\3\24\3\24\3\25"+
		"\3\25\3\26\3\26\3\26\3\26\3\27\3\27\3\27\3\27\3\30\3\30\3\30\3\31\3\31"+
		"\3\31\3\32\3\32\3\33\3\33\3\34\3\34\3\35\3\35\3\35\3\36\3\36\3\36\3\37"+
		"\3\37\3\37\3 \3 \3 \3!\3!\3\"\3\"\3#\3#\3$\3$\3%\3%\3&\3&\3\'\3\'\3(\3"+
		"(\3(\3(\3(\3(\3(\3(\3(\5(\u0102\n(\3)\3)\7)\u0106\n)\f)\16)\u0109\13)"+
		"\3*\6*\u010c\n*\r*\16*\u010d\3+\6+\u0111\n+\r+\16+\u0112\3+\3+\2\2,\3"+
		"\3\5\4\7\5\t\6\13\7\r\b\17\t\21\n\23\13\25\f\27\r\31\16\33\17\35\20\37"+
		"\21!\22#\23%\24\'\25)\26+\27-\30/\31\61\32\63\33\65\34\67\359\36;\37="+
		" ?!A\"C#E$G%I&K\'M(O)Q*S+U,\3\2\6\4\2C\\c|\5\2\62;C\\c|\3\2\62;\4\2\13"+
		"\f\17\17\u0119\2\3\3\2\2\2\2\5\3\2\2\2\2\7\3\2\2\2\2\t\3\2\2\2\2\13\3"+
		"\2\2\2\2\r\3\2\2\2\2\17\3\2\2\2\2\21\3\2\2\2\2\23\3\2\2\2\2\25\3\2\2\2"+
		"\2\27\3\2\2\2\2\31\3\2\2\2\2\33\3\2\2\2\2\35\3\2\2\2\2\37\3\2\2\2\2!\3"+
		"\2\2\2\2#\3\2\2\2\2%\3\2\2\2\2\'\3\2\2\2\2)\3\2\2\2\2+\3\2\2\2\2-\3\2"+
		"\2\2\2/\3\2\2\2\2\61\3\2\2\2\2\63\3\2\2\2\2\65\3\2\2\2\2\67\3\2\2\2\2"+
		"9\3\2\2\2\2;\3\2\2\2\2=\3\2\2\2\2?\3\2\2\2\2A\3\2\2\2\2C\3\2\2\2\2E\3"+
		"\2\2\2\2G\3\2\2\2\2I\3\2\2\2\2K\3\2\2\2\2M\3\2\2\2\2O\3\2\2\2\2Q\3\2\2"+
		"\2\2S\3\2\2\2\2U\3\2\2\2\3W\3\2\2\2\5Y\3\2\2\2\7\\\3\2\2\2\t_\3\2\2\2"+
		"\13b\3\2\2\2\rk\3\2\2\2\17z\3\2\2\2\21\177\3\2\2\2\23\u0089\3\2\2\2\25"+
		"\u008d\3\2\2\2\27\u0093\3\2\2\2\31\u00a2\3\2\2\2\33\u00ab\3\2\2\2\35\u00b3"+
		"\3\2\2\2\37\u00b6\3\2\2\2!\u00bb\3\2\2\2#\u00c2\3\2\2\2%\u00c4\3\2\2\2"+
		"\'\u00c6\3\2\2\2)\u00c8\3\2\2\2+\u00ca\3\2\2\2-\u00ce\3\2\2\2/\u00d2\3"+
		"\2\2\2\61\u00d5\3\2\2\2\63\u00d8\3\2\2\2\65\u00da\3\2\2\2\67\u00dc\3\2"+
		"\2\29\u00de\3\2\2\2;\u00e1\3\2\2\2=\u00e4\3\2\2\2?\u00e7\3\2\2\2A\u00ea"+
		"\3\2\2\2C\u00ec\3\2\2\2E\u00ee\3\2\2\2G\u00f0\3\2\2\2I\u00f2\3\2\2\2K"+
		"\u00f4\3\2\2\2M\u00f6\3\2\2\2O\u0101\3\2\2\2Q\u0103\3\2\2\2S\u010b\3\2"+
		"\2\2U\u0110\3\2\2\2WX\7$\2\2X\4\3\2\2\2YZ\7,\2\2Z[\7\61\2\2[\6\3\2\2\2"+
		"\\]\7\61\2\2]^\7,\2\2^\b\3\2\2\2_`\7\61\2\2`a\7\61\2\2a\n\3\2\2\2bc\7"+
		"O\2\2cd\7g\2\2de\7p\2\2ef\7u\2\2fg\7c\2\2gh\7l\2\2hi\7g\2\2ij\7\"\2\2"+
		"j\f\3\2\2\2kl\7e\2\2lm\7j\2\2mn\7c\2\2no\7r\2\2op\7k\2\2pq\7p\2\2qr\7"+
		"r\2\2rs\7t\2\2st\7q\2\2tu\7i\2\2uv\7t\2\2vw\7c\2\2wx\7o\2\2xy\7\"\2\2"+
		"y\16\3\2\2\2z{\7x\2\2{|\7c\2\2|}\7t\2\2}~\7\"\2\2~\20\3\2\2\2\177\u0080"+
		"\7k\2\2\u0080\u0081\7o\2\2\u0081\u0082\7r\2\2\u0082\u0083\7t\2\2\u0083"+
		"\u0084\7k\2\2\u0084\u0085\7o\2\2\u0085\u0086\7k\2\2\u0086\u0087\7t\2\2"+
		"\u0087\u0088\7\"\2\2\u0088\22\3\2\2\2\u0089\u008a\7h\2\2\u008a\u008b\7"+
		"q\2\2\u008b\u008c\7t\2\2\u008c\24\3\2\2\2\u008d\u008e\7y\2\2\u008e\u008f"+
		"\7j\2\2\u008f\u0090\7k\2\2\u0090\u0091\7n\2\2\u0091\u0092\7g\2\2\u0092"+
		"\26\3\2\2\2\u0093\u0094\7r\2\2\u0094\u0095\7t\2\2\u0095\u0096\7q\2\2\u0096"+
		"\u0097\7e\2\2\u0097\u0098\7g\2\2\u0098\u0099\7f\2\2\u0099\u009a\7k\2\2"+
		"\u009a\u009b\7o\2\2\u009b\u009c\7k\2\2\u009c\u009d\7g\2\2\u009d\u009e"+
		"\7p\2\2\u009e\u009f\7v\2\2\u009f\u00a0\7q\2\2\u00a0\u00a1\7\"\2\2\u00a1"+
		"\30\3\2\2\2\u00a2\u00a3\7h\2\2\u00a3\u00a4\7w\2\2\u00a4\u00a5\7p\2\2\u00a5"+
		"\u00a6\7e\2\2\u00a6\u00a7\7k\2\2\u00a7\u00a8\7q\2\2\u00a8\u00a9\7p\2\2"+
		"\u00a9\u00aa\7\"\2\2\u00aa\32\3\2\2\2\u00ab\u00ac\7t\2\2\u00ac\u00ad\7"+
		"g\2\2\u00ad\u00ae\7v\2\2\u00ae\u00af\7w\2\2\u00af\u00b0\7t\2\2\u00b0\u00b1"+
		"\7p\2\2\u00b1\u00b2\7\"\2\2\u00b2\34\3\2\2\2\u00b3\u00b4\7k\2\2\u00b4"+
		"\u00b5\7h\2\2\u00b5\36\3\2\2\2\u00b6\u00b7\7g\2\2\u00b7\u00b8\7n\2\2\u00b8"+
		"\u00b9\7u\2\2\u00b9\u00ba\7g\2\2\u00ba \3\2\2\2\u00bb\u00bc\7g\2\2\u00bc"+
		"\u00bd\7n\2\2\u00bd\u00be\7u\2\2\u00be\u00bf\7g\2\2\u00bf\u00c0\7k\2\2"+
		"\u00c0\u00c1\7h\2\2\u00c1\"\3\2\2\2\u00c2\u00c3\7-\2\2\u00c3$\3\2\2\2"+
		"\u00c4\u00c5\7/\2\2\u00c5&\3\2\2\2\u00c6\u00c7\7,\2\2\u00c7(\3\2\2\2\u00c8"+
		"\u00c9\7\61\2\2\u00c9*\3\2\2\2\u00ca\u00cb\7-\2\2\u00cb\u00cc\7-\2\2\u00cc"+
		"\u00cd\7=\2\2\u00cd,\3\2\2\2\u00ce\u00cf\7/\2\2\u00cf\u00d0\7/\2\2\u00d0"+
		"\u00d1\7=\2\2\u00d1.\3\2\2\2\u00d2\u00d3\7(\2\2\u00d3\u00d4\7(\2\2\u00d4"+
		"\60\3\2\2\2\u00d5\u00d6\7~\2\2\u00d6\u00d7\7~\2\2\u00d7\62\3\2\2\2\u00d8"+
		"\u00d9\7#\2\2\u00d9\64\3\2\2\2\u00da\u00db\7@\2\2\u00db\66\3\2\2\2\u00dc"+
		"\u00dd\7>\2\2\u00dd8\3\2\2\2\u00de\u00df\7@\2\2\u00df\u00e0\7?\2\2\u00e0"+
		":\3\2\2\2\u00e1\u00e2\7>\2\2\u00e2\u00e3\7?\2\2\u00e3<\3\2\2\2\u00e4\u00e5"+
		"\7?\2\2\u00e5\u00e6\7?\2\2\u00e6>\3\2\2\2\u00e7\u00e8\7#\2\2\u00e8\u00e9"+
		"\7?\2\2\u00e9@\3\2\2\2\u00ea\u00eb\7\"\2\2\u00ebB\3\2\2\2\u00ec\u00ed"+
		"\7?\2\2\u00edD\3\2\2\2\u00ee\u00ef\7}\2\2\u00efF\3\2\2\2\u00f0\u00f1\7"+
		"\177\2\2\u00f1H\3\2\2\2\u00f2\u00f3\7*\2\2\u00f3J\3\2\2\2\u00f4\u00f5"+
		"\7+\2\2\u00f5L\3\2\2\2\u00f6\u00f7\7=\2\2\u00f7N\3\2\2\2\u00f8\u00f9\7"+
		"v\2\2\u00f9\u00fa\7t\2\2\u00fa\u00fb\7w\2\2\u00fb\u0102\7g\2\2\u00fc\u00fd"+
		"\7h\2\2\u00fd\u00fe\7c\2\2\u00fe\u00ff\7n\2\2\u00ff\u0100\7u\2\2\u0100"+
		"\u0102\7g\2\2\u0101\u00f8\3\2\2\2\u0101\u00fc\3\2\2\2\u0102P\3\2\2\2\u0103"+
		"\u0107\t\2\2\2\u0104\u0106\t\3\2\2\u0105\u0104\3\2\2\2\u0106\u0109\3\2"+
		"\2\2\u0107\u0105\3\2\2\2\u0107\u0108\3\2\2\2\u0108R\3\2\2\2\u0109\u0107"+
		"\3\2\2\2\u010a\u010c\t\4\2\2\u010b\u010a\3\2\2\2\u010c\u010d\3\2\2\2\u010d"+
		"\u010b\3\2\2\2\u010d\u010e\3\2\2\2\u010eT\3\2\2\2\u010f\u0111\t\5\2\2"+
		"\u0110\u010f\3\2\2\2\u0111\u0112\3\2\2\2\u0112\u0110\3\2\2\2\u0112\u0113"+
		"\3\2\2\2\u0113\u0114\3\2\2\2\u0114\u0115\b+\2\2\u0115V\3\2\2\2\7\2\u0101"+
		"\u0107\u010d\u0112\3\b\2\2";
	public static final ATN _ATN =
		new ATNDeserializer().deserialize(_serializedATN.toCharArray());
	static {
		_decisionToDFA = new DFA[_ATN.getNumberOfDecisions()];
		for (int i = 0; i < _ATN.getNumberOfDecisions(); i++) {
			_decisionToDFA[i] = new DFA(_ATN.getDecisionState(i), i);
		}
	}
}