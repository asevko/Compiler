package test;

import gen.SetGrammarBaseVisitor;
import gen.SetGrammarParser;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class Visitor extends SetGrammarBaseVisitor<String> {

    private List<String> errors = new ArrayList<>();
    private Variables variables = new Variables();
    private Map<String, String> functions = new HashMap<>();
    private Map<String, SetGrammarParser.FunctionHeaderContext> functionSignatures = new HashMap<>();

    @Override
    public String visitProgram(SetGrammarParser.ProgramContext ctx) {
        String buffer = program;
        StringBuilder buffer1 = new StringBuilder();
        for (SetGrammarParser.Non_void_functionContext context : ctx.non_void_function())
            buffer1.append(visitNon_void_function(context));
        for (SetGrammarParser.Void_functionContext context : ctx.void_function())
            buffer1.append(visitVoid_function(context));
        buffer += visitBlock(ctx.block());
        buffer += buffer1.toString() + utils + setClass + elementClass + "\n}";
        StringBuilder error = new StringBuilder();
        if (errors.size() > 0) {
            for (String string : errors) {
                error.append("ERROR:\t")
                        .append(string)
                        .append("\n");
            }
            System.out.println(error);
            //JOptionPane.showMessageDialog(null, error);
        }
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
            } else if (!variables.get(ctx.NAME().getText()).equalsIgnoreCase("Set")) {
                errors.add("Cast error:  variable " + ctx.NAME().getText() + " is not Set");
            }
        } else {
            variables.put(ctx.NAME().getText(), "Set");
            buffer.append("Set ");
        }
        if (ctx.expression().function_call() != null) {
            if (functions.get(ctx.expression().function_call().NAME().getText()) != null)
                if (!functions.get(ctx.expression().function_call().NAME().getText()).equalsIgnoreCase("Set"))
                    errors.add("Cast error: function " + ctx.expression().function_call().NAME().getText() + " return not Set");
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
            } else if (!variables.get(ctx.NAME().getText()).equalsIgnoreCase("Element")) {
                errors.add("Cast error:  variable " + ctx.NAME().getText() + " is not Element");
            }
        } else {
            variables.put(ctx.NAME().getText(), "Element");
            buffer.append("Element ");
        }
        if (ctx.LINE() != null)
            buffer.append(ctx.NAME().getText()).append(" = new Element(").append(ctx.LINE().getText()).append(");");
        if (ctx.function_call() != null) {
            if (functions.get(ctx.function_call().NAME().getText()) != null)
                if (!functions.get(ctx.function_call().NAME().getText()).equalsIgnoreCase("Element"))
                    errors.add("Cast error: function " + ctx.function_call().NAME().getText() + " return not Element");
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
            else if (!variables.get(ctx.NAME(i).getText()).equalsIgnoreCase("Element"))
                errors.add("Cast error:  variable " + ctx.NAME(i).getText() + " is not Element");
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
        StringBuilder buffer = new StringBuilder();
        if (ctx.NAME().toString() == null) {
            errors.add("Initialize error: cant find variable " + ctx.NAME().getText());
        }
        if (visitType(ctx.type()).equals("")) {
            errors.add("Initialize error: unknown type " + ctx.type().getText());
        }
        buffer.append(visitType(ctx.type())).append(" ").append(ctx.NAME().getText());
        return buffer.toString();
    }

    @Override
    public String visitNon_single_args_pattern(SetGrammarParser.Non_single_args_patternContext ctx) {
        if (ctx.single_arg_pattern() == null) {
            errors.add("Initialize error: unexpected type pattern");
        }
        StringBuilder buffer = new StringBuilder();
        buffer.append(visitSingle_arg_pattern(ctx.single_arg_pattern())).append(",").append(" ");
        return buffer.toString();
    }

    @Override
    public String visitFunction_signature(SetGrammarParser.Function_signatureContext ctx) {
        if (ctx.non_single_args_pattern() == null &&
                ctx.single_arg_pattern() == null) {
            errors.add("Initialize error: unknown function signature");
        } else if (ctx.single_arg_pattern() == null) {
            errors.add("Initialize error: function does not have any signature");
        }
        StringBuilder buffer = new StringBuilder();
        buffer.append(ctx.OPEN_BRACKET().getText());
        for(SetGrammarParser.Non_single_args_patternContext non_single_ctx : ctx.non_single_args_pattern()) {
            buffer.append(visitNon_single_args_pattern(non_single_ctx));
        }
        buffer.append(visitSingle_arg_pattern(ctx.single_arg_pattern()));
        buffer.append(ctx.CLOSE_BRACKET().getText());
        return buffer.toString();
    }

    @Override
    public String visitFunctionHeader(SetGrammarParser.FunctionHeaderContext ctx) {
        if(ctx.NAME() == null) {
            errors.add("Initialize error: function should have name" + ctx.NAME().getText());
        } else if (ctx.function_signature() == null && ctx.void_sign() == null) {
            errors.add("Initialize error: function " + ctx.NAME().toString() + " should have signature");
        }
        StringBuilder buffer = new StringBuilder();
        buffer.append(ctx.NAME().getText()).append(" ");
        if (ctx.function_signature() != null) {
            buffer.append(visitFunction_signature(ctx.function_signature()));
        } else if (ctx.void_sign() != null) {
            buffer.append(visitVoid_sign(ctx.void_sign()));
        }
        return buffer.toString();
    }

    @Override
    public String visitNon_void_function(SetGrammarParser.Non_void_functionContext ctx) {
        if (ctx.functionHeader() == null) {
            errors.add("Initialize error: expected function header");
        } else if (ctx.type() == null) {
            errors.add("Initialize error: function is not void");
        } else if (ctx.block_return() == null) {
            errors.add("Initialize error: function should have body");
        }
        if (functions.get(ctx.functionHeader().NAME().getText()) == null) {
            functions.put(ctx.functionHeader().NAME().getText(), visitType(ctx.type()));
        } else {
            errors.add("Function name " + ctx.functionHeader().NAME().getText() + " already used");
        }
        functionSignatures.put(ctx.functionHeader().NAME().getText(), ctx.functionHeader());
        for (SetGrammarParser.Non_single_args_patternContext var: ctx.functionHeader().function_signature().non_single_args_pattern()) {
            variables.increase();
            variables.put(var.single_arg_pattern().NAME().getText(), var.single_arg_pattern().type().getText());
        }
        variables.increase();
        variables.put(ctx.functionHeader().function_signature().single_arg_pattern().NAME().getText(),
                ctx.functionHeader().function_signature().single_arg_pattern().type().getText());
        String type = visitType(ctx.type());
        StringBuilder builder = new StringBuilder();
        builder.append("\nprivate ")
                .append(type)
                .append(" ")
                .append(visitFunctionHeader(ctx.functionHeader()))
                .append(" throws Exception")
                .append(visitBlock_return(ctx.block_return()));
        return builder.toString();
    }

    @Override
    public String visitVoid_function(SetGrammarParser.Void_functionContext ctx) {
        if (ctx.functionHeader() == null) {
            errors.add("Initialize error: expected function header");
        } else if (ctx.block_non_return() == null) {
            errors.add("Initialize error: function should have body");
        }
        if (functions.get(ctx.functionHeader().NAME().getText()) == null) {
            functions.put(ctx.functionHeader().NAME().getText(), "void");
        } else  {
            errors.add("Initialize error: function " + ctx.functionHeader().NAME().getText() + " already exists");
        }
        StringBuilder builder = new StringBuilder();
        String functionHeader = visitFunctionHeader(ctx.functionHeader());
        functionSignatures.put(ctx.functionHeader().NAME().getText(), ctx.functionHeader());
        variables.increase();
        builder.append("void ")
                .append(functionHeader)
                .append(" throws Exception")
                .append(visitBlock_non_return(ctx.block_non_return()));
        return builder.toString();
    }

    @Override
    public String visitBlock_return(SetGrammarParser.Block_returnContext ctx) {
        StringBuilder buffer = new StringBuilder("{\n");
        for (SetGrammarParser.BodyContext context : ctx.body())
            buffer.append(visitBody(context)).append("\n");
        if (ctx.expression() != null) {
            buffer.append("return ").append(visitExpression(ctx.expression())).append(";").append("\n}\n");
        } else if (variables.get(ctx.NAME().getText()) != null) {
            buffer.append("return ").append(ctx.NAME().getText()).append(";").append("\n}\n");
        } else {
            errors.add("Error: cant find variable " + ctx.NAME().getText() + " at return");
        }
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
            buffer.append("if (").append(visitSimple_compare(ctx.simple_compare())).append(")");
        if (ctx.negation_compare() != null)
            buffer.append("if (").append(visitNegation_compare(ctx.negation_compare())).append(")");
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
        if (ctx.block() == null) {
            errors.add("Initialize error: forEach block should have body");
        }
        if (variables.get(ctx.NAME().toString()) == null) {
            variables.put(ctx.NAME().toString(), ctx.ELEMENT().toString());
        } else {
            errors.add("Initialize error: variable " + ctx.NAME().toString() + " already exists");
        }
        if (ctx.expression() == null) {
            errors.add("Expression expected in forEach cycle");
        }
//        if (!variables.get(ctx.NAME(1).toString()).equals("Set")){
//            errors.add("Initialize error: type of variable `" + ctx.NAME(1).toString() + "` should be Set");
//        }
        variables.increase();
        StringBuilder builder = new StringBuilder();
        builder.append("for (Element ")
                .append(ctx.NAME())
                .append(" : ")
                .append(visitExpression(ctx.expression()))
                .append(".getSet()")
                .append(")")
                .append(visitBlock(ctx.block()));
        return builder.toString();
    }

    @Override
    public String visitPrint(SetGrammarParser.PrintContext ctx) {
        StringBuilder builder = new StringBuilder();
        builder.append("\tSystem.out.println(");
        if(ctx.NAME() != null) {
            builder.append(ctx.NAME().getText());
        } else if (ctx.LINE() != null) {
            builder.append(ctx.LINE().getText());
        }
        builder.append(");\n");
        return builder.toString();
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
        else if(ctx.forEach() != null)
            return visitForEach(ctx.forEach());
        else if(ctx.expression() != null) {
            return visitExpression(ctx.expression());
        }
        else return "";
    }

    @Override
    public String visitExpression(SetGrammarParser.ExpressionContext ctx) {
        if (ctx.getChildCount() == 3) {
            if (variables.get(ctx.NAME(0).getText()) == null
                    || variables.get(ctx.NAME(1).getText()) == null) {
                errors.add("Error: cant find variable " + ctx.NAME(0).getText()
                        + "|" + ctx.NAME(1).getText());
            } else if ((variables.get(ctx.NAME(0).getText()).equalsIgnoreCase("Element") &&
                    variables.get(ctx.NAME(1).getText()).equalsIgnoreCase("Set")))
                errors.add("Calculate error: variable " + ctx.NAME(0).getText() + " is Element " +
                        " and " + variables.get(ctx.NAME(1).getText()) + " is Set");
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
        if (in.NAME().size() == sig.function_signature().non_single_args_pattern().size()) {
            for (int i = 0; i < sig.function_signature().non_single_args_pattern().size(); i++) {
                if (variables.get(in.NAME(i).getText()) == null
                        || !variables.get(in.NAME(i).getText()).equalsIgnoreCase(visitType(sig.function_signature().single_arg_pattern().type())))
                    check = false;
            }
        } else check = false;
        return check;
    }

    String program = "import java.util.HashSet;\n" +
            "import java.util.Collections;\n" +
            "import java.util.concurrent.atomic.AtomicBoolean;\n" +
            "\n" +
            "public class Program {\n" +
            "    public static void main(String[] args) {\n" +
            "        try {\n" +
            "            new Program().start();\n" +
            "        } catch (Exception e) {\n" +
            "            System.err.println(e.getMessage());\n" +
            "        }\n" +
            "    }\n" +
            "    private void start() throws Exception";

    String utils =
            "        private Set plus(Set a, Set b) {\n" +
            "            b.getSet().forEach(a::add);\n" +
            "            return  a;\n" +
            "        }\n" +
            "\n" +
            "        private Set plus(Set a, Element el) {\n" +
            "            a.add(el);\n" +
            "            return  a;\n" +
            "        }\n" +
            "\n" +
            "        private Set plus(Element el, Set a) {\n" +
            "            a.add(el);\n" +
            "            return  a;\n" +
            "        }\n" +
            "\n" +
            "        private Set minus(Set a, Set b) {\n" +
            "            a.getSet().forEach(b::remove);\n" +
            "            return  a;\n" +
            "        }\n" +
            "\n" +
            "        private Set minus(Set a, Element el) {\n" +
            "            a.remove(el);\n" +
            "            return  a;\n" +
            "        }\n" +
            "\n" +
            "        private Set multiply(Set a, Set b) {\n" +
            "            HashSet<Element> resultSet = new HashSet<>();\n" +
            "            a.getSet().forEach(elementA -> {\n" +
            "                AtomicBoolean elementsEqual = new AtomicBoolean(false);\n" +
            "                b.getSet().forEach(elementB -> {\n" +
            "                    if (elementA == elementB) {\n" +
            "                        elementsEqual.set(true);\n" +
            "                    }\n" +
            "                });\n" +
            "                if (elementsEqual.get()) {\n" +
            "                    resultSet.add(elementA);\n" +
            "                }\n" +
            "            });\n" +
            "            return new Set((Element[]) resultSet.toArray());\n" +
            "        }\n" +
            "\n" +
            "        private Set multiply(Set a, Element el) {\n" +
            "            a.add(el);\n" +
            "            return  a;\n" +
            "        }\n" +
            "\n" +
            "        private Set multiply(Element el, Set a) {\n" +
            "            a.add(el);\n" +
            "            return  a;\n" +
            "        }\n" +
            "\n" +
            "\n" +
            "        private Set divide(Set a, Set b) {\n" +
            "            Set res = new Set();\n" +
            "            res.add(minus(a, b));\n" +
            "            res.add(minus(b, a));\n" +
            "            return  res;\n" +
            "        }\n" +
            "\n" +
            "        private boolean equal(Set a, Set b) {\n" +
            "            return  a.equals(b);\n" +
            "        }\n" +
            "\n" +
            "        private boolean nonEqual(Set a, Set b) {\n" +
            "            return !equal(a, b);\n" +
            "        }\n" +
            "\n" +
            "        private boolean equal(Element a, Element b) {\n" +
            "          return a.getElement().equals(b.getElement());\n" +
            "        }\n" +
            "\n" +
            "        private boolean nonEaual(Element a, Element b) {\n" +
            "            return  !(equal(a, b));\n" +
            "        }";
    String setClass = "public class Set {\n" +
            "\n" +
            "    private HashSet<Element> set = new HashSet<>();\n" +
            "\n" +
            "    public Set() {\n" +
            "    }\n" +
            "\n" +
            "    public Set(Element[] elements) {\n" +
            "        Collections.addAll(set, elements);\n" +
            "    }\n" +
            "\n" +
            "    public HashSet<Element> getSet() {\n" +
            "        return set;\n" +
            "    }\n" +
            "\n" +
            "    public void add(Element element) {\n" +
            "        set.add(element);\n" +
            "    }\n" +
            "\n" +
            "    public boolean contains(Element element) {\n" +
            "        return set.contains(element);\n" +
            "    }\n" +
            "\n" +
            "    public int power() {\n" +
            "        return set.size();\n" +
            "    }\n" +
            "\n" +
            "    public void remove(Element element) {\n" +
            "        set.remove(element);\n" +
            "    }\n" +
            "\n" +
            "    public void setSet(HashSet<Element> set) {\n" +
            "        this.set = set;\n" +
            "    }\n" +
            "\n" +
            "    public void add(Set s) {\n" +
            "        this.set.addAll(s.getSet());\n" +
            "    }\n" +
            "\n" +
            "    @Override\n" +
            "    public String toString() {\n" +
            "        StringBuffer buffer = new StringBuffer();\n" +
            "        set.forEach(element -> buffer.append(element.toString()).append(\" \"));\n" +
            "        return buffer.toString();\n" +
            "    }\n" +
            "}";

    String elementClass = "public class Element {\n" +
            "    private String element;\n" +
            "\n" +
            "    public Element(String element) {\n" +
            "        this.element = element;\n" +
            "    }\n" +
            "\n" +
            "    public String getElement() {\n" +
            "        return element;\n" +
            "    }\n" +
            "\n" +
            "    @Override\n" +
            "    public String toString() {\n" +
            "        return element;\n" +
            "    }\n" +
            "}";
}