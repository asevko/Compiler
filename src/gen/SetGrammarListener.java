package gen;// Generated from /Users/alexeisevko/IdeaProjects/Compiler/SetGrammar.g4 by ANTLR 4.7
import org.antlr.v4.runtime.tree.ParseTreeListener;

/**
 * This interface defines a complete listener for a parse tree produced by
 * {@link SetGrammarParser}.
 */
public interface SetGrammarListener extends ParseTreeListener {
	/**
	 * Enter a parse tree produced by {@link SetGrammarParser#program}.
	 * @param ctx the parse tree
	 */
	void enterProgram(SetGrammarParser.ProgramContext ctx);
	/**
	 * Exit a parse tree produced by {@link SetGrammarParser#program}.
	 * @param ctx the parse tree
	 */
	void exitProgram(SetGrammarParser.ProgramContext ctx);
	/**
	 * Enter a parse tree produced by {@link SetGrammarParser#type}.
	 * @param ctx the parse tree
	 */
	void enterType(SetGrammarParser.TypeContext ctx);
	/**
	 * Exit a parse tree produced by {@link SetGrammarParser#type}.
	 * @param ctx the parse tree
	 */
	void exitType(SetGrammarParser.TypeContext ctx);
	/**
	 * Enter a parse tree produced by {@link SetGrammarParser#void_sign}.
	 * @param ctx the parse tree
	 */
	void enterVoid_sign(SetGrammarParser.Void_signContext ctx);
	/**
	 * Exit a parse tree produced by {@link SetGrammarParser#void_sign}.
	 * @param ctx the parse tree
	 */
	void exitVoid_sign(SetGrammarParser.Void_signContext ctx);
	/**
	 * Enter a parse tree produced by {@link SetGrammarParser#block}.
	 * @param ctx the parse tree
	 */
	void enterBlock(SetGrammarParser.BlockContext ctx);
	/**
	 * Exit a parse tree produced by {@link SetGrammarParser#block}.
	 * @param ctx the parse tree
	 */
	void exitBlock(SetGrammarParser.BlockContext ctx);
	/**
	 * Enter a parse tree produced by {@link SetGrammarParser#declaration}.
	 * @param ctx the parse tree
	 */
	void enterDeclaration(SetGrammarParser.DeclarationContext ctx);
	/**
	 * Exit a parse tree produced by {@link SetGrammarParser#declaration}.
	 * @param ctx the parse tree
	 */
	void exitDeclaration(SetGrammarParser.DeclarationContext ctx);
	/**
	 * Enter a parse tree produced by {@link SetGrammarParser#declaration_element}.
	 * @param ctx the parse tree
	 */
	void enterDeclaration_element(SetGrammarParser.Declaration_elementContext ctx);
	/**
	 * Exit a parse tree produced by {@link SetGrammarParser#declaration_element}.
	 * @param ctx the parse tree
	 */
	void exitDeclaration_element(SetGrammarParser.Declaration_elementContext ctx);
	/**
	 * Enter a parse tree produced by {@link SetGrammarParser#set_expression}.
	 * @param ctx the parse tree
	 */
	void enterSet_expression(SetGrammarParser.Set_expressionContext ctx);
	/**
	 * Exit a parse tree produced by {@link SetGrammarParser#set_expression}.
	 * @param ctx the parse tree
	 */
	void exitSet_expression(SetGrammarParser.Set_expressionContext ctx);
	/**
	 * Enter a parse tree produced by {@link SetGrammarParser#function_call}.
	 * @param ctx the parse tree
	 */
	void enterFunction_call(SetGrammarParser.Function_callContext ctx);
	/**
	 * Exit a parse tree produced by {@link SetGrammarParser#function_call}.
	 * @param ctx the parse tree
	 */
	void exitFunction_call(SetGrammarParser.Function_callContext ctx);
	/**
	 * Enter a parse tree produced by {@link SetGrammarParser#input_signature}.
	 * @param ctx the parse tree
	 */
	void enterInput_signature(SetGrammarParser.Input_signatureContext ctx);
	/**
	 * Exit a parse tree produced by {@link SetGrammarParser#input_signature}.
	 * @param ctx the parse tree
	 */
	void exitInput_signature(SetGrammarParser.Input_signatureContext ctx);
	/**
	 * Enter a parse tree produced by {@link SetGrammarParser#single_arg_pattern}.
	 * @param ctx the parse tree
	 */
	void enterSingle_arg_pattern(SetGrammarParser.Single_arg_patternContext ctx);
	/**
	 * Exit a parse tree produced by {@link SetGrammarParser#single_arg_pattern}.
	 * @param ctx the parse tree
	 */
	void exitSingle_arg_pattern(SetGrammarParser.Single_arg_patternContext ctx);
	/**
	 * Enter a parse tree produced by {@link SetGrammarParser#non_single_args_pattern}.
	 * @param ctx the parse tree
	 */
	void enterNon_single_args_pattern(SetGrammarParser.Non_single_args_patternContext ctx);
	/**
	 * Exit a parse tree produced by {@link SetGrammarParser#non_single_args_pattern}.
	 * @param ctx the parse tree
	 */
	void exitNon_single_args_pattern(SetGrammarParser.Non_single_args_patternContext ctx);
	/**
	 * Enter a parse tree produced by {@link SetGrammarParser#functionHeader}.
	 * @param ctx the parse tree
	 */
	void enterFunctionHeader(SetGrammarParser.FunctionHeaderContext ctx);
	/**
	 * Exit a parse tree produced by {@link SetGrammarParser#functionHeader}.
	 * @param ctx the parse tree
	 */
	void exitFunctionHeader(SetGrammarParser.FunctionHeaderContext ctx);
	/**
	 * Enter a parse tree produced by {@link SetGrammarParser#function_signature}.
	 * @param ctx the parse tree
	 */
	void enterFunction_signature(SetGrammarParser.Function_signatureContext ctx);
	/**
	 * Exit a parse tree produced by {@link SetGrammarParser#function_signature}.
	 * @param ctx the parse tree
	 */
	void exitFunction_signature(SetGrammarParser.Function_signatureContext ctx);
	/**
	 * Enter a parse tree produced by {@link SetGrammarParser#non_void_function}.
	 * @param ctx the parse tree
	 */
	void enterNon_void_function(SetGrammarParser.Non_void_functionContext ctx);
	/**
	 * Exit a parse tree produced by {@link SetGrammarParser#non_void_function}.
	 * @param ctx the parse tree
	 */
	void exitNon_void_function(SetGrammarParser.Non_void_functionContext ctx);
	/**
	 * Enter a parse tree produced by {@link SetGrammarParser#void_function}.
	 * @param ctx the parse tree
	 */
	void enterVoid_function(SetGrammarParser.Void_functionContext ctx);
	/**
	 * Exit a parse tree produced by {@link SetGrammarParser#void_function}.
	 * @param ctx the parse tree
	 */
	void exitVoid_function(SetGrammarParser.Void_functionContext ctx);
	/**
	 * Enter a parse tree produced by {@link SetGrammarParser#block_return}.
	 * @param ctx the parse tree
	 */
	void enterBlock_return(SetGrammarParser.Block_returnContext ctx);
	/**
	 * Exit a parse tree produced by {@link SetGrammarParser#block_return}.
	 * @param ctx the parse tree
	 */
	void exitBlock_return(SetGrammarParser.Block_returnContext ctx);
	/**
	 * Enter a parse tree produced by {@link SetGrammarParser#block_non_return}.
	 * @param ctx the parse tree
	 */
	void enterBlock_non_return(SetGrammarParser.Block_non_returnContext ctx);
	/**
	 * Exit a parse tree produced by {@link SetGrammarParser#block_non_return}.
	 * @param ctx the parse tree
	 */
	void exitBlock_non_return(SetGrammarParser.Block_non_returnContext ctx);
	/**
	 * Enter a parse tree produced by {@link SetGrammarParser#equals}.
	 * @param ctx the parse tree
	 */
	void enterEquals(SetGrammarParser.EqualsContext ctx);
	/**
	 * Exit a parse tree produced by {@link SetGrammarParser#equals}.
	 * @param ctx the parse tree
	 */
	void exitEquals(SetGrammarParser.EqualsContext ctx);
	/**
	 * Enter a parse tree produced by {@link SetGrammarParser#compare}.
	 * @param ctx the parse tree
	 */
	void enterCompare(SetGrammarParser.CompareContext ctx);
	/**
	 * Exit a parse tree produced by {@link SetGrammarParser#compare}.
	 * @param ctx the parse tree
	 */
	void exitCompare(SetGrammarParser.CompareContext ctx);
	/**
	 * Enter a parse tree produced by {@link SetGrammarParser#simple_compare}.
	 * @param ctx the parse tree
	 */
	void enterSimple_compare(SetGrammarParser.Simple_compareContext ctx);
	/**
	 * Exit a parse tree produced by {@link SetGrammarParser#simple_compare}.
	 * @param ctx the parse tree
	 */
	void exitSimple_compare(SetGrammarParser.Simple_compareContext ctx);
	/**
	 * Enter a parse tree produced by {@link SetGrammarParser#negation_compare}.
	 * @param ctx the parse tree
	 */
	void enterNegation_compare(SetGrammarParser.Negation_compareContext ctx);
	/**
	 * Exit a parse tree produced by {@link SetGrammarParser#negation_compare}.
	 * @param ctx the parse tree
	 */
	void exitNegation_compare(SetGrammarParser.Negation_compareContext ctx);
	/**
	 * Enter a parse tree produced by {@link SetGrammarParser#if_block}.
	 * @param ctx the parse tree
	 */
	void enterIf_block(SetGrammarParser.If_blockContext ctx);
	/**
	 * Exit a parse tree produced by {@link SetGrammarParser#if_block}.
	 * @param ctx the parse tree
	 */
	void exitIf_block(SetGrammarParser.If_blockContext ctx);
	/**
	 * Enter a parse tree produced by {@link SetGrammarParser#else_block}.
	 * @param ctx the parse tree
	 */
	void enterElse_block(SetGrammarParser.Else_blockContext ctx);
	/**
	 * Exit a parse tree produced by {@link SetGrammarParser#else_block}.
	 * @param ctx the parse tree
	 */
	void exitElse_block(SetGrammarParser.Else_blockContext ctx);
	/**
	 * Enter a parse tree produced by {@link SetGrammarParser#while_block}.
	 * @param ctx the parse tree
	 */
	void enterWhile_block(SetGrammarParser.While_blockContext ctx);
	/**
	 * Exit a parse tree produced by {@link SetGrammarParser#while_block}.
	 * @param ctx the parse tree
	 */
	void exitWhile_block(SetGrammarParser.While_blockContext ctx);
	/**
	 * Enter a parse tree produced by {@link SetGrammarParser#forEach}.
	 * @param ctx the parse tree
	 */
	void enterForEach(SetGrammarParser.ForEachContext ctx);
	/**
	 * Exit a parse tree produced by {@link SetGrammarParser#forEach}.
	 * @param ctx the parse tree
	 */
	void exitForEach(SetGrammarParser.ForEachContext ctx);
	/**
	 * Enter a parse tree produced by {@link SetGrammarParser#print}.
	 * @param ctx the parse tree
	 */
	void enterPrint(SetGrammarParser.PrintContext ctx);
	/**
	 * Exit a parse tree produced by {@link SetGrammarParser#print}.
	 * @param ctx the parse tree
	 */
	void exitPrint(SetGrammarParser.PrintContext ctx);
	/**
	 * Enter a parse tree produced by {@link SetGrammarParser#get_expression}.
	 * @param ctx the parse tree
	 */
	void enterGet_expression(SetGrammarParser.Get_expressionContext ctx);
	/**
	 * Exit a parse tree produced by {@link SetGrammarParser#get_expression}.
	 * @param ctx the parse tree
	 */
	void exitGet_expression(SetGrammarParser.Get_expressionContext ctx);
	/**
	 * Enter a parse tree produced by {@link SetGrammarParser#has_next}.
	 * @param ctx the parse tree
	 */
	void enterHas_next(SetGrammarParser.Has_nextContext ctx);
	/**
	 * Exit a parse tree produced by {@link SetGrammarParser#has_next}.
	 * @param ctx the parse tree
	 */
	void exitHas_next(SetGrammarParser.Has_nextContext ctx);
	/**
	 * Enter a parse tree produced by {@link SetGrammarParser#power}.
	 * @param ctx the parse tree
	 */
	void enterPower(SetGrammarParser.PowerContext ctx);
	/**
	 * Exit a parse tree produced by {@link SetGrammarParser#power}.
	 * @param ctx the parse tree
	 */
	void exitPower(SetGrammarParser.PowerContext ctx);
	/**
	 * Enter a parse tree produced by {@link SetGrammarParser#contains}.
	 * @param ctx the parse tree
	 */
	void enterContains(SetGrammarParser.ContainsContext ctx);
	/**
	 * Exit a parse tree produced by {@link SetGrammarParser#contains}.
	 * @param ctx the parse tree
	 */
	void exitContains(SetGrammarParser.ContainsContext ctx);
	/**
	 * Enter a parse tree produced by {@link SetGrammarParser#body}.
	 * @param ctx the parse tree
	 */
	void enterBody(SetGrammarParser.BodyContext ctx);
	/**
	 * Exit a parse tree produced by {@link SetGrammarParser#body}.
	 * @param ctx the parse tree
	 */
	void exitBody(SetGrammarParser.BodyContext ctx);
	/**
	 * Enter a parse tree produced by {@link SetGrammarParser#expression}.
	 * @param ctx the parse tree
	 */
	void enterExpression(SetGrammarParser.ExpressionContext ctx);
	/**
	 * Exit a parse tree produced by {@link SetGrammarParser#expression}.
	 * @param ctx the parse tree
	 */
	void exitExpression(SetGrammarParser.ExpressionContext ctx);
}