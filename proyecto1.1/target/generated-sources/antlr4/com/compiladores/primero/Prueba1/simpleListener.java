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
	 * Enter a parse tree produced by {@link simpleParser#ciclofor}.
	 * @param ctx the parse tree
	 */
	void enterCiclofor(@NotNull simpleParser.CicloforContext ctx);
	/**
	 * Exit a parse tree produced by {@link simpleParser#ciclofor}.
	 * @param ctx the parse tree
	 */
	void exitCiclofor(@NotNull simpleParser.CicloforContext ctx);
	/**
	 * Enter a parse tree produced by {@link simpleParser#tipo}.
	 * @param ctx the parse tree
	 */
	void enterTipo(@NotNull simpleParser.TipoContext ctx);
	/**
	 * Exit a parse tree produced by {@link simpleParser#tipo}.
	 * @param ctx the parse tree
	 */
	void exitTipo(@NotNull simpleParser.TipoContext ctx);
	/**
	 * Enter a parse tree produced by {@link simpleParser#start}.
	 * @param ctx the parse tree
	 */
	void enterStart(@NotNull simpleParser.StartContext ctx);
	/**
	 * Exit a parse tree produced by {@link simpleParser#start}.
	 * @param ctx the parse tree
	 */
	void exitStart(@NotNull simpleParser.StartContext ctx);
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
	 * Enter a parse tree produced by {@link simpleParser#mensaje}.
	 * @param ctx the parse tree
	 */
	void enterMensaje(@NotNull simpleParser.MensajeContext ctx);
	/**
	 * Exit a parse tree produced by {@link simpleParser#mensaje}.
	 * @param ctx the parse tree
	 */
	void exitMensaje(@NotNull simpleParser.MensajeContext ctx);
}