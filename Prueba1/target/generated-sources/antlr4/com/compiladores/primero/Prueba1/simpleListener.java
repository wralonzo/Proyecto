// Generated from simple.g4 by ANTLR 4.4
package com.compiladores.primero.Prueba1;
import org.antlr.v4.runtime.misc.NotNull;
import org.antlr.v4.runtime.tree.ParseTreeListener;

/**
 * This interface defines a complete listener for a parse tree produced by
 * {@link simpleParser}.
 */
public interface simpleListener extends ParseTreeListener {
	/**
	 * Enter a parse tree produced by {@link simpleParser#expresion}.
	 * @param ctx the parse tree
	 */
	void enterExpresion(@NotNull simpleParser.ExpresionContext ctx);
	/**
	 * Exit a parse tree produced by {@link simpleParser#expresion}.
	 * @param ctx the parse tree
	 */
	void exitExpresion(@NotNull simpleParser.ExpresionContext ctx);
	/**
	 * Enter a parse tree produced by {@link simpleParser#stat}.
	 * @param ctx the parse tree
	 */
	void enterStat(@NotNull simpleParser.StatContext ctx);
	/**
	 * Exit a parse tree produced by {@link simpleParser#stat}.
	 * @param ctx the parse tree
	 */
	void exitStat(@NotNull simpleParser.StatContext ctx);
	/**
	 * Enter a parse tree produced by {@link simpleParser#proc}.
	 * @param ctx the parse tree
	 */
	void enterProc(@NotNull simpleParser.ProcContext ctx);
	/**
	 * Exit a parse tree produced by {@link simpleParser#proc}.
	 * @param ctx the parse tree
	 */
	void exitProc(@NotNull simpleParser.ProcContext ctx);
	/**
	 * Enter a parse tree produced by {@link simpleParser#siguiente}.
	 * @param ctx the parse tree
	 */
	void enterSiguiente(@NotNull simpleParser.SiguienteContext ctx);
	/**
	 * Exit a parse tree produced by {@link simpleParser#siguiente}.
	 * @param ctx the parse tree
	 */
	void exitSiguiente(@NotNull simpleParser.SiguienteContext ctx);
	/**
	 * Enter a parse tree produced by {@link simpleParser#inicio}.
	 * @param ctx the parse tree
	 */
	void enterInicio(@NotNull simpleParser.InicioContext ctx);
	/**
	 * Exit a parse tree produced by {@link simpleParser#inicio}.
	 * @param ctx the parse tree
	 */
	void exitInicio(@NotNull simpleParser.InicioContext ctx);
	/**
	 * Enter a parse tree produced by {@link simpleParser#expr}.
	 * @param ctx the parse tree
	 */
	void enterExpr(@NotNull simpleParser.ExprContext ctx);
	/**
	 * Exit a parse tree produced by {@link simpleParser#expr}.
	 * @param ctx the parse tree
	 */
	void exitExpr(@NotNull simpleParser.ExprContext ctx);
	/**
	 * Enter a parse tree produced by {@link simpleParser#convierte}.
	 * @param ctx the parse tree
	 */
	void enterConvierte(@NotNull simpleParser.ConvierteContext ctx);
	/**
	 * Exit a parse tree produced by {@link simpleParser#convierte}.
	 * @param ctx the parse tree
	 */
	void exitConvierte(@NotNull simpleParser.ConvierteContext ctx);
	/**
	 * Enter a parse tree produced by {@link simpleParser#atom}.
	 * @param ctx the parse tree
	 */
	void enterAtom(@NotNull simpleParser.AtomContext ctx);
	/**
	 * Exit a parse tree produced by {@link simpleParser#atom}.
	 * @param ctx the parse tree
	 */
	void exitAtom(@NotNull simpleParser.AtomContext ctx);
	/**
	 * Enter a parse tree produced by {@link simpleParser#multExpr}.
	 * @param ctx the parse tree
	 */
	void enterMultExpr(@NotNull simpleParser.MultExprContext ctx);
	/**
	 * Exit a parse tree produced by {@link simpleParser#multExpr}.
	 * @param ctx the parse tree
	 */
	void exitMultExpr(@NotNull simpleParser.MultExprContext ctx);
	/**
	 * Enter a parse tree produced by {@link simpleParser#prog}.
	 * @param ctx the parse tree
	 */
	void enterProg(@NotNull simpleParser.ProgContext ctx);
	/**
	 * Exit a parse tree produced by {@link simpleParser#prog}.
	 * @param ctx the parse tree
	 */
	void exitProg(@NotNull simpleParser.ProgContext ctx);
}