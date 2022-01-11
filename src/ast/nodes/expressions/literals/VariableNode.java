package ast.nodes.expressions.literals;

import ast.nodes.expressions.*;
import ast.nodes.expressions.Iterable;
import ast.nodes.util.Formatter;

public class VariableNode extends Expression implements Valuable, Iterable, Logical, Concatable,FunctionCallable {
    String variableName;

    public VariableNode(String variableName) {
        this.variableName = variableName;
    }

    public String getVariableName() {
        return variableName;
    }

    public void setVariableName(String variableName) {
        this.variableName = variableName;
    }

    @Override
    protected String nodeName() {
        return "variable/functionName";
    }

    @Override
    protected Formatter nodeValue(Formatter formatter) {
        return formatter.addProperty("name",variableName);
    }
}
