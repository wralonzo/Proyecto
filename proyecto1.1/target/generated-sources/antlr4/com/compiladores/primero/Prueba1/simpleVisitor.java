// Generated from com\compiladores\primero\Prueba1\simple.g4 by ANTLR 4.5.1
package com.compiladores.primero.Prueba1;
import org.antlr.v4.runtime.tree.ParseTreeVisitor;

/**
 * This interface defines a complete generic visitor for a parse tree produced
 * by {@link simpleParser}.
 *
 * @param <T> The return type of the visit operation. Use {@link Void} for
 * operations with no return type.
 */
public interface simpleVisitor<T> extends ParseTreeVisitor<T> {
	/**
	 * Visit a parse tree produced by {@link simpleParser#start}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitStart(simpleParser.StartContext ctx);
	/**
	 * Visit a parse tree produced by {@link simpleParser#ciclofor}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitCiclofor(simpleParser.CicloforContext ctx);
	/**
	 * Visit a parse tree produced by {@link simpleParser#inicio}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitInicio(simpleParser.InicioContext ctx);
	/**
	 * Visit a parse tree produced by {@link simpleParser#tipo}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitTipo(simpleParser.TipoContext ctx);
	/**
	 * Visit a parse tree produced by {@link simpleParser#mensaje}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitMensaje(simpleParser.MensajeContext ctx);
}