package ast.nodes.expressions.literals;

import ast.nodes.expressions.*;
import ast.nodes.expressions.Iterable;
import ast.nodes.util.Formatter;

import java.util.ArrayList;

public class FunctionCallNode extends Expression implements Iterable,Valuable, Logical, Concatable {
    String functionName;
    ArrayList<Expression> parameters;


    public FunctionCallNode(String functionName, ArrayList<Expression> parameters) {
        this.functionName = functionName;
        this.parameters = parameters;
    }

    public String getFunctionName() {
        return functionName;
    }

    public void setFunctionName(String functionName) {
        this.functionName = functionName;
    }

    public ArrayList<Expression> getParameters() {
        return parameters;
    }

    public void setParameters(ArrayList<Expression> parameters) {
        this.parameters = parameters;
    }

    @Override
    protected String nodeName() {
        return "FunctionCall";
    }

    @Override
    protected Formatter nodeValue(Formatter formatter) {
         formatter.addProperty("functionName",functionName) ;
        for (Expression parameter: parameters)
            formatter.object(parameter.toString());
        return formatter ;
    }
}
