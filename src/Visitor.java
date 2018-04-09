import gen.SetGrammarBaseVisitor;
import gen.SetGrammarParser;
import gen.SetGrammarVisitor;
import org.antlr.v4.runtime.tree.ErrorNode;
import org.antlr.v4.runtime.tree.ParseTree;
import org.antlr.v4.runtime.tree.RuleNode;
import org.antlr.v4.runtime.tree.TerminalNode;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class Visitor extends SetGrammarBaseVisitor<String> {

    private List<String> errors = new ArrayList<>();
    private Variables variables = new Variables();
    private Map<String, String> functions = new HashMap<>();
    private Map<String, SetGrammarParser.Function_signatureContext> functionSignatures = new HashMap<>();

    @Override
    public String visitProgram(SetGrammarParser.ProgramContext ctx) {
        String buffer = "";

        return buffer;
    }

    @Override
    public String visitType(SetGrammarParser.TypeContext ctx) {
        if (ctx.SET() != null)
            return "Set";
        if (ctx.ELEMENT() != null)
            return "Element";
        return "";
    }

    @Override
    public String visitVoid_sign(SetGrammarParser.Void_signContext ctx) {
        return "()";
    }

    @Override
    public String visitBlock(SetGrammarParser.BlockContext ctx) {
        variables.increase();
        StringBuilder buffer = new StringBuilder("{\n");
        for (SetGrammarParser.BodyContext context : ctx.body())
            buffer.append(visitBody(context)).append("\n");
        buffer.append("}\n");
        variables.decrease();
        return buffer.toString();
    }

    @Override
    public String visitDeclaration(SetGrammarParser.DeclarationContext ctx) {
        StringBuilder buffer = new StringBuilder();
        if (variables.get(ctx.NAME().getText()) != null) {
            if (ctx.SET() != null) {
                errors.add("Initialize error: Variable " + ctx.NAME().getText() + " already used");
            } else if (!variables.get(ctx.NAME().getText()).equalsIgnoreCase("set")) {
                errors.add("Cast error:  variable " + ctx.NAME().getText() + " is not set");
            }
        } else {
            variables.put(ctx.NAME().getText(), "set");
            buffer.append("Set ");
        }
        if (ctx.expression().function_call() != null) {
            if (functions.get(ctx.expression().function_call().NAME().getText()) != null)
                if (!functions.get(ctx.expression().function_call().NAME().getText()).equalsIgnoreCase("set"))
                    errors.add("Cast error: function " + ctx.expression().function_call().NAME().getText() + " return not set");
        }
        buffer.append(ctx.NAME().getText()).append(" = ").append(visitExpression(ctx.expression())).append(";");
        return buffer.toString();
    }

    @Override
    public String visitDeclaration_element(SetGrammarParser.Declaration_elementContext ctx) {
        StringBuilder buffer = new StringBuilder();
        if (variables.get(ctx.NAME().getText()) != null) {
            if (ctx.ELEMENT() != null) {
                errors.add("Initialize error: Variable " + ctx.NAME().getText() + " already used");
            } else if (!variables.get(ctx.NAME().getText()).equalsIgnoreCase("element")) {
                errors.add("Cast error:  variable " + ctx.NAME().getText() + " is not element");
            }
        } else {
            variables.put(ctx.NAME().getText(), "element");
            buffer.append("Element ");
        }
        if (ctx.LINE() != null)
            buffer.append(ctx.NAME().getText()).append(" = new Element(").append(ctx.LINE().getText()).append(");");
        if (ctx.function_call() != null) {
            if (functions.get(ctx.function_call().NAME().getText()) != null)
                if (!functions.get(ctx.function_call().NAME().getText()).equalsIgnoreCase("element"))
                    errors.add("Cast error: function " + ctx.function_call().NAME().getText() + " return not element");
            buffer.append(ctx.NAME().getText()).append(" = ").append(visitFunction_call(ctx.function_call())).append(";");
        }
        if (ctx.get_expression() != null)
            buffer.append(ctx.NAME().getText()).append(" = ").append(visitGet_expression(ctx.get_expression())).append(";");
        return buffer.toString();
    }

    @Override
    public String visitSet_expression(SetGrammarParser.Set_expressionContext ctx) {
        for (int i = 0; i < ctx.NAME().size(); i++) {
            if (variables.get(ctx.NAME(i).getText()) == null)
                errors.add("Initialize error: Variable " + ctx.NAME(i).getText() + " not initialize");
            else if (!variables.get(ctx.NAME(i).getText()).equalsIgnoreCase("element"))
                errors.add("Cast error:  variable " + ctx.NAME(i).getText() + " is not element");
        }
        return ctx.getText();
    }

    @Override
    public String visitFunction_call(SetGrammarParser.Function_callContext ctx) {
        String buffer = "";
        if (functions.get(ctx.NAME().getText()) == null) {
            errors.add("Initialize error: cant find function " + ctx.NAME().getText());
        } else if (!checkSignatures(ctx.input_signature(), functionSignatures.get(ctx.NAME().getText()))) {
            errors.add("Error: cant find such arguments in function " + ctx.NAME().getText());
        }
        if (ctx.input_signature() != null)
            buffer += ctx.NAME().getText() + visitInput_signature(ctx.input_signature());
        else buffer+=ctx.NAME().getText()+"()";
        return buffer;
    }

    @Override
    public String visitInput_signature(SetGrammarParser.Input_signatureContext ctx) {
        return ctx.getText();
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
        StringBuilder buffer = new StringBuilder("{\n");
        for (SetGrammarParser.BodyContext context : ctx.body())
            buffer.append(visitBody(context)).append("\n");
        buffer.append("return ").append(ctx.NAME().getText()).append(";").append("\n}\n");
        if (variables.get(ctx.NAME().getText()) == null)
            errors.add("Error: cant find variable " + ctx.NAME().getText() + " at return");
        variables.decrease();
        return buffer.toString();
    }

    @Override
    public String visitBlock_non_return(SetGrammarParser.Block_non_returnContext ctx) {
        StringBuilder buffer = new StringBuilder("{\n");
        for (SetGrammarParser.BodyContext context : ctx.body())
            buffer.append(visitBody(context)).append("\n");
        buffer.append("return;\n}\n");
        variables.decrease();
        return buffer.toString();
    }

    @Override
    public String visitEquals(SetGrammarParser.EqualsContext ctx) {
        StringBuilder buffer = new StringBuilder();
        if (ctx.EQUAL() != null)
            buffer.append("equal(").append(visitExpression(ctx.expression(0))).append(",").append(visitExpression(ctx.expression(1))).append(")");
        if (ctx.NON_EQUAL() != null)
            buffer.append("nonEqual(").append(visitExpression(ctx.expression(0))).append(",").append(visitExpression(ctx.expression(1))).append(")");
        return buffer.toString();
    }

    @Override
    public String visitCompare(SetGrammarParser.CompareContext ctx) {
        return visitPower(ctx.power(0)) + ctx.getChild(1).getText() + visitPower(ctx.power(1));
    }

    @Override
    public String visitSimple_compare(SetGrammarParser.Simple_compareContext ctx) {
        StringBuilder buffer = new StringBuilder();
        if (ctx.equals() != null)
            buffer.append(visitEquals(ctx.equals()));
        if (ctx.compare() != null)
            buffer.append(visitCompare(ctx.compare()));
        if (ctx.contains() != null)
            buffer.append(visitContains(ctx.contains()));
        if (ctx.has_next() != null)
            buffer.append(visitHas_next(ctx.has_next()));
        return buffer.toString();
    }

    @Override
    public String visitNegation_compare(SetGrammarParser.Negation_compareContext ctx) {
        return "!(" + visitSimple_compare(ctx.simple_compare()) + ")";
    }

    @Override
    public String visitIf_block(SetGrammarParser.If_blockContext ctx) {
        StringBuilder buffer = new StringBuilder();
        if (ctx.simple_compare() != null)
            buffer.append("if(").append(visitSimple_compare(ctx.simple_compare())).append(")");
        if (ctx.negation_compare() != null)
            buffer.append("if(").append(visitNegation_compare(ctx.negation_compare())).append(")");
        buffer.append(visitBlock(ctx.block()));
        if (ctx.else_block() != null)
            buffer.append(visitElse_block(ctx.else_block()));
        return buffer.toString();
    }

    @Override
    public String visitElse_block(SetGrammarParser.Else_blockContext ctx) {
        String buffer = "";
        buffer += "else" + visitBlock(ctx.block());
        return buffer;
    }

    @Override
    public String visitWhile_block(SetGrammarParser.While_blockContext ctx) {
        String buffer = "";
        if (ctx.simple_compare() != null)
            buffer += "while(" + visitSimple_compare(ctx.simple_compare()) + ")";
        if (ctx.negation_compare() != null)
            buffer += "while(" + visitNegation_compare(ctx.negation_compare()) + ")";
        buffer += visitBlock(ctx.block());
        return buffer;
    }

    @Override
    public String visitForEach(SetGrammarParser.ForEachContext ctx) {
        return null;
    }

    @Override
    public String visitPrint(SetGrammarParser.PrintContext ctx) {
        return "\tSystem.out.println(" + ctx.LINE().getText() + ").toString();";
    }

    @Override
    public String visitGet_expression(SetGrammarParser.Get_expressionContext ctx) {
        return ctx.getText();
    }

    @Override
    public String visitHas_next(SetGrammarParser.Has_nextContext ctx) {
        return ctx.getText();
    }

    @Override
    public String visitPower(SetGrammarParser.PowerContext ctx) {
        return ctx.getText();
    }

    @Override
    public String visitContains(SetGrammarParser.ContainsContext ctx) {
        return ctx.getText();
    }

    @Override
    public String visitBody(SetGrammarParser.BodyContext ctx) {
        if (ctx.print() != null)
            return visitPrint(ctx.print());
        else if (ctx.declaration() != null)
            return visitDeclaration(ctx.declaration());
        else if (ctx.print() != null)
            return visitPrint(ctx.print());
        else if (ctx.function_call() != null)
            return visitFunction_call(ctx.function_call()) + ";";
        else if (ctx.while_block() != null)
            return visitWhile_block(ctx.while_block());
        else if (ctx.if_block() != null)
            return visitIf_block(ctx.if_block());
        else if (ctx.declaration() != null)
            return visitDeclaration(ctx.declaration());
        else if (ctx.declaration_element() != null)
            return visitDeclaration_element(ctx.declaration_element());
        else  if(ctx.forEach() != null)
            return visitForEach(ctx.forEach());
        else return "";
    }

    @Override
    public String visitExpression(SetGrammarParser.ExpressionContext ctx) {
        if (ctx.getChildCount() == 3) {
            if (variables.get(ctx.NAME(0).getText()) == null
                    || variables.get(ctx.NAME(1).getText()) == null) {
                errors.add("Error: cant find variable " + ctx.NAME(0).getText()
                        + "|" + ctx.NAME(1).getText());
            } else if ((variables.get(ctx.NAME(0).getText()).equalsIgnoreCase("element") &&
                    variables.get(ctx.NAME(1).getText()).equalsIgnoreCase("set")))
                errors.add("Calculate error: variable " + ctx.NAME(0).getText() + " is element " +
                        " and " + variables.get(ctx.NAME(1).getText()) + " is set");
        }
        if (ctx.set_expression() != null)
            return "new Set(new Element[]" + visitSet_expression(ctx.set_expression()) + ")";
        if (ctx.PLUS() != null)
            return "plus(" + ctx.getChild(0).getText() + ", " + ctx.getChild(2).getText() + ")";
        if (ctx.MINUS() != null)
            return "minus(" + ctx.getChild(0).getText() + ", " + ctx.getChild(2).getText() + ")";
        if (ctx.DIVIDE() != null)
            return "divide(" + ctx.getChild(0).getText() + ", " + ctx.getChild(2).getText() + ")";
        if (ctx.MULTIPLY() != null)
            return "multiply(" + ctx.getChild(0).getText() + ", " + ctx.getChild(2).getText() + ")";
        if (ctx.function_call() != null)
            return visitFunction_call(ctx.function_call());
        if (ctx.get_expression() != null)
            return visitGet_expression(ctx.get_expression());
        if (ctx.getChildCount() == 1) {
            if (variables.get(ctx.getChild(0).getText()) == null)
                errors.add("Error: cant find variable " + ctx.getChild(0).getText());
            return ctx.getChild(0).getText();
        }
        return "";
    }

    boolean checkSignatures(SetGrammarParser.Input_signatureContext in, SetGrammarParser.FunctionHeaderContext sig) {
        boolean check = true;
        if (sig == null && in == null)
            return true;
        if (sig == null || in == null)
            return false;
        if (in.NAME().size() == sig.NAME().size()) {
            for (int i = 0; i < sig.type().size(); i++) {
                if (variables.get(in.NAME(i).getText()) == null
                        || !variables.get(in.NAME(i).getText()).equalsIgnoreCase(visitType(sig.type(i))))
                    check = false;
            }
        } else check = false;
        return check;
    }
}