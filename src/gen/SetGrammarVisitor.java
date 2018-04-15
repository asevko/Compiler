package gen;// Generated from /Users/alexeisevko/IdeaProjects/Compiler/SetGrammar.g4 by ANTLR 4.7
import org.antlr.v4.runtime.tree.ParseTreeVisitor;

/**
 * This interface defines a complete generic visitor for a parse tree produced
 * by {@link SetGrammarParser}.
 *
 * @param <T> The return type of the visit operation. Use {@link Void} for
 * operations with no return type.
 */
public interface SetGrammarVisitor<T> extends ParseTreeVisitor<T> {
	/**
	 * Visit a parse tree produced by {@link SetGrammarParser#program}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitProgram(SetGrammarParser.ProgramContext ctx);
	/**
	 * Visit a parse tree produced by {@link SetGrammarParser#type}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitType(SetGrammarParser.TypeContext ctx);
	/**
	 * Visit a parse tree produced by {@link SetGrammarParser#void_sign}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitVoid_sign(SetGrammarParser.Void_signContext ctx);
	/**
	 * Visit a parse tree produced by {@link SetGrammarParser#block}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitBlock(SetGrammarParser.BlockContext ctx);
	/**
	 * Visit a parse tree produced by {@link SetGrammarParser#declaration}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitDeclaration(SetGrammarParser.DeclarationContext ctx);
	/**
	 * Visit a parse tree produced by {@link SetGrammarParser#declaration_element}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitDeclaration_element(SetGrammarParser.Declaration_elementContext ctx);
	/**
	 * Visit a parse tree produced by {@link SetGrammarParser#set_expression}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitSet_expression(SetGrammarParser.Set_expressionContext ctx);
	/**
	 * Visit a parse tree produced by {@link SetGrammarParser#function_call}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitFunction_call(SetGrammarParser.Function_callContext ctx);
	/**
	 * Visit a parse tree produced by {@link SetGrammarParser#input_signature}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitInput_signature(SetGrammarParser.Input_signatureContext ctx);
	/**
	 * Visit a parse tree produced by {@link SetGrammarParser#single_arg_pattern}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitSingle_arg_pattern(SetGrammarParser.Single_arg_patternContext ctx);
	/**
	 * Visit a parse tree produced by {@link SetGrammarParser#non_single_args_pattern}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitNon_single_args_pattern(SetGrammarParser.Non_single_args_patternContext ctx);
	/**
	 * Visit a parse tree produced by {@link SetGrammarParser#functionHeader}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitFunctionHeader(SetGrammarParser.FunctionHeaderContext ctx);
	/**
	 * Visit a parse tree produced by {@link SetGrammarParser#function_signature}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitFunction_signature(SetGrammarParser.Function_signatureContext ctx);
	/**
	 * Visit a parse tree produced by {@link SetGrammarParser#non_void_function}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitNon_void_function(SetGrammarParser.Non_void_functionContext ctx);
	/**
	 * Visit a parse tree produced by {@link SetGrammarParser#void_function}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitVoid_function(SetGrammarParser.Void_functionContext ctx);
	/**
	 * Visit a parse tree produced by {@link SetGrammarParser#block_return}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitBlock_return(SetGrammarParser.Block_returnContext ctx);
	/**
	 * Visit a parse tree produced by {@link SetGrammarParser#block_non_return}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitBlock_non_return(SetGrammarParser.Block_non_returnContext ctx);
	/**
	 * Visit a parse tree produced by {@link SetGrammarParser#equals}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitEquals(SetGrammarParser.EqualsContext ctx);
	/**
	 * Visit a parse tree produced by {@link SetGrammarParser#compare}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitCompare(SetGrammarParser.CompareContext ctx);
	/**
	 * Visit a parse tree produced by {@link SetGrammarParser#simple_compare}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitSimple_compare(SetGrammarParser.Simple_compareContext ctx);
	/**
	 * Visit a parse tree produced by {@link SetGrammarParser#negation_compare}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitNegation_compare(SetGrammarParser.Negation_compareContext ctx);
	/**
	 * Visit a parse tree produced by {@link SetGrammarParser#if_block}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitIf_block(SetGrammarParser.If_blockContext ctx);
	/**
	 * Visit a parse tree produced by {@link SetGrammarParser#else_block}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitElse_block(SetGrammarParser.Else_blockContext ctx);
	/**
	 * Visit a parse tree produced by {@link SetGrammarParser#while_block}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitWhile_block(SetGrammarParser.While_blockContext ctx);
	/**
	 * Visit a parse tree produced by {@link SetGrammarParser#forEach}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitForEach(SetGrammarParser.ForEachContext ctx);
	/**
	 * Visit a parse tree produced by {@link SetGrammarParser#print}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitPrint(SetGrammarParser.PrintContext ctx);
	/**
	 * Visit a parse tree produced by {@link SetGrammarParser#get_expression}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitGet_expression(SetGrammarParser.Get_expressionContext ctx);
	/**
	 * Visit a parse tree produced by {@link SetGrammarParser#has_next}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitHas_next(SetGrammarParser.Has_nextContext ctx);
	/**
	 * Visit a parse tree produced by {@link SetGrammarParser#power}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitPower(SetGrammarParser.PowerContext ctx);
	/**
	 * Visit a parse tree produced by {@link SetGrammarParser#contains}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitContains(SetGrammarParser.ContainsContext ctx);
	/**
	 * Visit a parse tree produced by {@link SetGrammarParser#body}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitBody(SetGrammarParser.BodyContext ctx);
	/**
	 * Visit a parse tree produced by {@link SetGrammarParser#expression}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitExpression(SetGrammarParser.ExpressionContext ctx);
}