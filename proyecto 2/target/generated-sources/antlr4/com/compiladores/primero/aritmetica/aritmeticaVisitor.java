// Generated from com\compiladores\primero\aritmetica\aritmetica.g4 by ANTLR 4.5.1
package com.compiladores.primero.aritmetica;

	import java.util.Map;
	import java.util.HashMap;

import org.antlr.v4.runtime.tree.ParseTreeVisitor;

/**
 * This interface defines a complete generic visitor for a parse tree produced
 * by {@link aritmeticaParser}.
 *
 * @param <T> The return type of the visit operation. Use {@link Void} for
 * operations with no return type.
 */
public interface aritmeticaVisitor<T> extends ParseTreeVisitor<T> {
	/**
	 * Visit a parse tree produced by {@link aritmeticaParser#start}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitStart(aritmeticaParser.StartContext ctx);
	/**
	 * Visit a parse tree produced by {@link aritmeticaParser#var_decl}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitVar_decl(aritmeticaParser.Var_declContext ctx);
	/**
	 * Visit a parse tree produced by {@link aritmeticaParser#var_assign}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitVar_assign(aritmeticaParser.Var_assignContext ctx);
	/**
	 * Visit a parse tree produced by {@link aritmeticaParser#println}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitPrintln(aritmeticaParser.PrintlnContext ctx);
	/**
	 * Visit a parse tree produced by {@link aritmeticaParser#conditional}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitConditional(aritmeticaParser.ConditionalContext ctx);
	/**
	 * Visit a parse tree produced by {@link aritmeticaParser#expression}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitExpression(aritmeticaParser.ExpressionContext ctx);
	/**
	 * Visit a parse tree produced by {@link aritmeticaParser#factor}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitFactor(aritmeticaParser.FactorContext ctx);
	/**
	 * Visit a parse tree produced by {@link aritmeticaParser#term}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitTerm(aritmeticaParser.TermContext ctx);
	/**
	 * Visit a parse tree produced by {@link aritmeticaParser#program}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitProgram(aritmeticaParser.ProgramContext ctx);
	/**
	 * Visit a parse tree produced by {@link aritmeticaParser#mensaje}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitMensaje(aritmeticaParser.MensajeContext ctx);
	/**
	 * Visit a parse tree produced by {@link aritmeticaParser#concatenar}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitConcatenar(aritmeticaParser.ConcatenarContext ctx);
	/**
	 * Visit a parse tree produced by {@link aritmeticaParser#comentarioliniea}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitComentarioliniea(aritmeticaParser.ComentariolinieaContext ctx);
	/**
	 * Visit a parse tree produced by {@link aritmeticaParser#comentariobloke}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitComentariobloke(aritmeticaParser.ComentarioblokeContext ctx);
	/**
	 * Visit a parse tree produced by {@link aritmeticaParser#comentario}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitComentario(aritmeticaParser.ComentarioContext ctx);
	/**
	 * Visit a parse tree produced by {@link aritmeticaParser#elseif}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitElseif(aritmeticaParser.ElseifContext ctx);
	/**
	 * Visit a parse tree produced by {@link aritmeticaParser#ciclofor}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitCiclofor(aritmeticaParser.CicloforContext ctx);
	/**
	 * Visit a parse tree produced by {@link aritmeticaParser#ciclowhile}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitCiclowhile(aritmeticaParser.CiclowhileContext ctx);
	/**
	 * Visit a parse tree produced by {@link aritmeticaParser#procedimiento}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitProcedimiento(aritmeticaParser.ProcedimientoContext ctx);
	/**
	 * Visit a parse tree produced by {@link aritmeticaParser#funcion}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitFuncion(aritmeticaParser.FuncionContext ctx);
	/**
	 * Visit a parse tree produced by {@link aritmeticaParser#sentence}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitSentence(aritmeticaParser.SentenceContext ctx);
}