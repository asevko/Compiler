import gen.SetGrammarParser;
import gen.SetGrammarVisitor;
import org.antlr.v4.runtime.tree.ErrorNode;
import org.antlr.v4.runtime.tree.ParseTree;
import org.antlr.v4.runtime.tree.RuleNode;
import org.antlr.v4.runtime.tree.TerminalNode;

public class Visitor implements SetGrammarVisitor<String> {
    @Override
    public String visitProgram(SetGrammarParser.ProgramContext ctx) {
        return null;
    }

    @Override
    public String visitType(SetGrammarParser.TypeContext ctx) {
        return null;
    }

    @Override
    public String visitVoid_sign(SetGrammarParser.Void_signContext ctx) {
        return null;
    }

    @Override
    public String visitBlock(SetGrammarParser.BlockContext ctx) {
        return null;
    }

    @Override
    public String visitDeclaration(SetGrammarParser.DeclarationContext ctx) {
        return null;
    }

    @Override
    public String visitDeclaration_element(SetGrammarParser.Declaration_elementContext ctx) {
        return null;
    }

    @Override
    public String visitSet_expression(SetGrammarParser.Set_expressionContext ctx) {
        return null;
    }

    @Override
    public String visitFunction_call(SetGrammarParser.Function_callContext ctx) {
        return null;
    }

    @Override
    public String visitInput_signature(SetGrammarParser.Input_signatureContext ctx) {
        return null;
    }

    @Override
    public String visitSingle_arg_pattern(SetGrammarParser.Single_arg_patternContext ctx) {
        return null;
    }

    @Override
    public String visitNon_single_args_pattern(SetGrammarParser.Non_single_args_patternContext ctx) {
        return null;
    }

    @Override
    public String visitFunction_signature(SetGrammarParser.Function_signatureContext ctx) {
        return null;
    }

    @Override
    public String visitFunctionHeader(SetGrammarParser.FunctionHeaderContext ctx) {
        return null;
    }

    @Override
    public String visitNon_void_function(SetGrammarParser.Non_void_functionContext ctx) {
        return null;
    }

    @Override
    public String visitVoid_function(SetGrammarParser.Void_functionContext ctx) {
        return null;
    }

    @Override
    public String visitBlock_return(SetGrammarParser.Block_returnContext ctx) {
        return null;
    }

    @Override
    public String visitBlock_non_return(SetGrammarParser.Block_non_returnContext ctx) {
        return null;
    }

    @Override
    public String visitEquals(SetGrammarParser.EqualsContext ctx) {
        return null;
    }

    @Override
    public String visitCompare(SetGrammarParser.CompareContext ctx) {
        return null;
    }

    @Override
    public String visitSimple_compare(SetGrammarParser.Simple_compareContext ctx) {
        return null;
    }

    @Override
    public String visitNegation_compare(SetGrammarParser.Negation_compareContext ctx) {
        return null;
    }

    @Override
    public String visitIf_block(SetGrammarParser.If_blockContext ctx) {
        return null;
    }

    @Override
    public String visitElse_block(SetGrammarParser.Else_blockContext ctx) {
        return null;
    }

    @Override
    public String visitWhile_block(SetGrammarParser.While_blockContext ctx) {
        return null;
    }

    @Override
    public String visitForEach(SetGrammarParser.ForEachContext ctx) {
        return null;
    }

    @Override
    public String visitPrint(SetGrammarParser.PrintContext ctx) {
        return null;
    }

    @Override
    public String visitGet_expression(SetGrammarParser.Get_expressionContext ctx) {
        return null;
    }

    @Override
    public String visitHas_next(SetGrammarParser.Has_nextContext ctx) {
        return null;
    }

    @Override
    public String visitPower(SetGrammarParser.PowerContext ctx) {
        return null;
    }

    @Override
    public String visitContains(SetGrammarParser.ContainsContext ctx) {
        return null;
    }

    @Override
    public String visitBody(SetGrammarParser.BodyContext ctx) {
        return null;
    }

    @Override
    public String visitExpression(SetGrammarParser.ExpressionContext ctx) {
        return null;
    }

    @Override
    public String visit(ParseTree parseTree) {
        return null;
    }

    @Override
    public String visitChildren(RuleNode ruleNode) {
        return null;
    }

    @Override
    public String visitTerminal(TerminalNode terminalNode) {
        return null;
    }

    @Override
    public String visitErrorNode(ErrorNode errorNode) {
        return null;
    }
}