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
	 * Visit a parse tree produced by {@link simpleParser#prog}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitProg(simpleParser.ProgContext ctx);
	/**
	 * Visit a parse tree produced by {@link simpleParser#stat}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitStat(simpleParser.StatContext ctx);
	/**
	 * Visit a parse tree produced by {@link simpleParser#expr}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitExpr(simpleParser.ExprContext ctx);
	/**
	 * Visit a parse tree produced by {@link simpleParser#multExpr}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitMultExpr(simpleParser.MultExprContext ctx);
	/**
	 * Visit a parse tree produced by {@link simpleParser#atom}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitAtom(simpleParser.AtomContext ctx);
	/**
	 * Visit a parse tree produced by {@link simpleParser#proc}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitProc(simpleParser.ProcContext ctx);
	/**
	 * Visit a parse tree produced by {@link simpleParser#inicio}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitInicio(simpleParser.InicioContext ctx);
	/**
	 * Visit a parse tree produced by {@link simpleParser#expresion}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitExpresion(simpleParser.ExpresionContext ctx);
	/**
	 * Visit a parse tree produced by {@link simpleParser#convierte}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitConvierte(simpleParser.ConvierteContext ctx);
	/**
	 * Visit a parse tree produced by {@link simpleParser#siguiente}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitSiguiente(simpleParser.SiguienteContext ctx);
}