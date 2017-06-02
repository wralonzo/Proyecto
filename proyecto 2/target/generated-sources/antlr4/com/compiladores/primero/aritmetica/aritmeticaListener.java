// Generated from aritmetica.g4 by ANTLR 4.4
package com.compiladores.primero.aritmetica;

	import java.util.Map;
	import java.util.HashMap;

import org.antlr.v4.runtime.misc.NotNull;
import org.antlr.v4.runtime.tree.ParseTreeListener;

/**
 * This interface defines a complete listener for a parse tree produced by
 * {@link aritmeticaParser}.
 */
public interface aritmeticaListener extends ParseTreeListener {
	/**
	 * Enter a parse tree produced by {@link aritmeticaParser#sentence}.
	 * @param ctx the parse tree
	 */
	void enterSentence(@NotNull aritmeticaParser.SentenceContext ctx);
	/**
	 * Exit a parse tree produced by {@link aritmeticaParser#sentence}.
	 * @param ctx the parse tree
	 */
	void exitSentence(@NotNull aritmeticaParser.SentenceContext ctx);
	/**
	 * Enter a parse tree produced by {@link aritmeticaParser#expression}.
	 * @param ctx the parse tree
	 */
	void enterExpression(@NotNull aritmeticaParser.ExpressionContext ctx);
	/**
	 * Exit a parse tree produced by {@link aritmeticaParser#expression}.
	 * @param ctx the parse tree
	 */
	void exitExpression(@NotNull aritmeticaParser.ExpressionContext ctx);
	/**
	 * Enter a parse tree produced by {@link aritmeticaParser#conditional}.
	 * @param ctx the parse tree
	 */
	void enterConditional(@NotNull aritmeticaParser.ConditionalContext ctx);
	/**
	 * Exit a parse tree produced by {@link aritmeticaParser#conditional}.
	 * @param ctx the parse tree
	 */
	void exitConditional(@NotNull aritmeticaParser.ConditionalContext ctx);
	/**
	 * Enter a parse tree produced by {@link aritmeticaParser#ciclowhile}.
	 * @param ctx the parse tree
	 */
	void enterCiclowhile(@NotNull aritmeticaParser.CiclowhileContext ctx);
	/**
	 * Exit a parse tree produced by {@link aritmeticaParser#ciclowhile}.
	 * @param ctx the parse tree
	 */
	void exitCiclowhile(@NotNull aritmeticaParser.CiclowhileContext ctx);
	/**
	 * Enter a parse tree produced by {@link aritmeticaParser#start}.
	 * @param ctx the parse tree
	 */
	void enterStart(@NotNull aritmeticaParser.StartContext ctx);
	/**
	 * Exit a parse tree produced by {@link aritmeticaParser#start}.
	 * @param ctx the parse tree
	 */
	void exitStart(@NotNull aritmeticaParser.StartContext ctx);
	/**
	 * Enter a parse tree produced by {@link aritmeticaParser#var_assign}.
	 * @param ctx the parse tree
	 */
	void enterVar_assign(@NotNull aritmeticaParser.Var_assignContext ctx);
	/**
	 * Exit a parse tree produced by {@link aritmeticaParser#var_assign}.
	 * @param ctx the parse tree
	 */
	void exitVar_assign(@NotNull aritmeticaParser.Var_assignContext ctx);
	/**
	 * Enter a parse tree produced by {@link aritmeticaParser#comentariobloke}.
	 * @param ctx the parse tree
	 */
	void enterComentariobloke(@NotNull aritmeticaParser.ComentarioblokeContext ctx);
	/**
	 * Exit a parse tree produced by {@link aritmeticaParser#comentariobloke}.
	 * @param ctx the parse tree
	 */
	void exitComentariobloke(@NotNull aritmeticaParser.ComentarioblokeContext ctx);
	/**
	 * Enter a parse tree produced by {@link aritmeticaParser#program}.
	 * @param ctx the parse tree
	 */
	void enterProgram(@NotNull aritmeticaParser.ProgramContext ctx);
	/**
	 * Exit a parse tree produced by {@link aritmeticaParser#program}.
	 * @param ctx the parse tree
	 */
	void exitProgram(@NotNull aritmeticaParser.ProgramContext ctx);
	/**
	 * Enter a parse tree produced by {@link aritmeticaParser#comentario}.
	 * @param ctx the parse tree
	 */
	void enterComentario(@NotNull aritmeticaParser.ComentarioContext ctx);
	/**
	 * Exit a parse tree produced by {@link aritmeticaParser#comentario}.
	 * @param ctx the parse tree
	 */
	void exitComentario(@NotNull aritmeticaParser.ComentarioContext ctx);
	/**
	 * Enter a parse tree produced by {@link aritmeticaParser#procedimiento}.
	 * @param ctx the parse tree
	 */
	void enterProcedimiento(@NotNull aritmeticaParser.ProcedimientoContext ctx);
	/**
	 * Exit a parse tree produced by {@link aritmeticaParser#procedimiento}.
	 * @param ctx the parse tree
	 */
	void exitProcedimiento(@NotNull aritmeticaParser.ProcedimientoContext ctx);
	/**
	 * Enter a parse tree produced by {@link aritmeticaParser#comentarioliniea}.
	 * @param ctx the parse tree
	 */
	void enterComentarioliniea(@NotNull aritmeticaParser.ComentariolinieaContext ctx);
	/**
	 * Exit a parse tree produced by {@link aritmeticaParser#comentarioliniea}.
	 * @param ctx the parse tree
	 */
	void exitComentarioliniea(@NotNull aritmeticaParser.ComentariolinieaContext ctx);
	/**
	 * Enter a parse tree produced by {@link aritmeticaParser#ciclofor}.
	 * @param ctx the parse tree
	 */
	void enterCiclofor(@NotNull aritmeticaParser.CicloforContext ctx);
	/**
	 * Exit a parse tree produced by {@link aritmeticaParser#ciclofor}.
	 * @param ctx the parse tree
	 */
	void exitCiclofor(@NotNull aritmeticaParser.CicloforContext ctx);
	/**
	 * Enter a parse tree produced by {@link aritmeticaParser#println}.
	 * @param ctx the parse tree
	 */
	void enterPrintln(@NotNull aritmeticaParser.PrintlnContext ctx);
	/**
	 * Exit a parse tree produced by {@link aritmeticaParser#println}.
	 * @param ctx the parse tree
	 */
	void exitPrintln(@NotNull aritmeticaParser.PrintlnContext ctx);
	/**
	 * Enter a parse tree produced by {@link aritmeticaParser#elseif}.
	 * @param ctx the parse tree
	 */
	void enterElseif(@NotNull aritmeticaParser.ElseifContext ctx);
	/**
	 * Exit a parse tree produced by {@link aritmeticaParser#elseif}.
	 * @param ctx the parse tree
	 */
	void exitElseif(@NotNull aritmeticaParser.ElseifContext ctx);
	/**
	 * Enter a parse tree produced by {@link aritmeticaParser#term}.
	 * @param ctx the parse tree
	 */
	void enterTerm(@NotNull aritmeticaParser.TermContext ctx);
	/**
	 * Exit a parse tree produced by {@link aritmeticaParser#term}.
	 * @param ctx the parse tree
	 */
	void exitTerm(@NotNull aritmeticaParser.TermContext ctx);
	/**
	 * Enter a parse tree produced by {@link aritmeticaParser#var_decl}.
	 * @param ctx the parse tree
	 */
	void enterVar_decl(@NotNull aritmeticaParser.Var_declContext ctx);
	/**
	 * Exit a parse tree produced by {@link aritmeticaParser#var_decl}.
	 * @param ctx the parse tree
	 */
	void exitVar_decl(@NotNull aritmeticaParser.Var_declContext ctx);
	/**
	 * Enter a parse tree produced by {@link aritmeticaParser#mensaje}.
	 * @param ctx the parse tree
	 */
	void enterMensaje(@NotNull aritmeticaParser.MensajeContext ctx);
	/**
	 * Exit a parse tree produced by {@link aritmeticaParser#mensaje}.
	 * @param ctx the parse tree
	 */
	void exitMensaje(@NotNull aritmeticaParser.MensajeContext ctx);
	/**
	 * Enter a parse tree produced by {@link aritmeticaParser#concatenar}.
	 * @param ctx the parse tree
	 */
	void enterConcatenar(@NotNull aritmeticaParser.ConcatenarContext ctx);
	/**
	 * Exit a parse tree produced by {@link aritmeticaParser#concatenar}.
	 * @param ctx the parse tree
	 */
	void exitConcatenar(@NotNull aritmeticaParser.ConcatenarContext ctx);
	/**
	 * Enter a parse tree produced by {@link aritmeticaParser#funcion}.
	 * @param ctx the parse tree
	 */
	void enterFuncion(@NotNull aritmeticaParser.FuncionContext ctx);
	/**
	 * Exit a parse tree produced by {@link aritmeticaParser#funcion}.
	 * @param ctx the parse tree
	 */
	void exitFuncion(@NotNull aritmeticaParser.FuncionContext ctx);
	/**
	 * Enter a parse tree produced by {@link aritmeticaParser#factor}.
	 * @param ctx the parse tree
	 */
	void enterFactor(@NotNull aritmeticaParser.FactorContext ctx);
	/**
	 * Exit a parse tree produced by {@link aritmeticaParser#factor}.
	 * @param ctx the parse tree
	 */
	void exitFactor(@NotNull aritmeticaParser.FactorContext ctx);
}