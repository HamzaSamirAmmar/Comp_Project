package ast.nodes.expressions.literal;

import ast.nodes.expressions.*;
import ast.nodes.expressions.Iterable;
import ast.nodes.htmlNodes.Mustache;
import ast.nodes.util.Formatter;

import java.util.ArrayList;

public class FunctionCallNode extends Expression implements Iterable, Logical, Concatable {
    String functionName;
    ArrayList<ValuableNode> parameters;


    public FunctionCallNode(String functionName, ArrayList<ValuableNode> parameters) {
        this.functionName = functionName;
        this.parameters = parameters;
    }

    public String getFunctionName() {
        return functionName;
    }

    public void setFunctionName(String functionName) {
        this.functionName = functionName;
    }

    public ArrayList<ValuableNode> getParameters() {
        return parameters;
    }

    public void setParameters(ArrayList<ValuableNode> parameters) {
        this.parameters = parameters;
    }

    @Override
    protected String nodeName() {
        return "FunctionCall";
    }

    @Override
    protected Formatter nodeValue(Formatter formatter) {
         formatter.addProperty("functionName",functionName) ;
        for (ValuableNode parameter: parameters)
            formatter.object(parameter.toString());
        return formatter ;
    }
}
