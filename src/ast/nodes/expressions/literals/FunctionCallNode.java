package ast.nodes.expressions.literals;

import ast.nodes.expressions.*;
import ast.nodes.expressions.Iterable;
import ast.nodes.util.Formatter;

import java.util.ArrayList;

public class FunctionCallNode extends Expression implements Iterable,Valuable, Logical, Concatable,FunctionCallable {
    Expression functionCall;
    ArrayList<Expression> parameters;


    public FunctionCallNode(Expression functionCall, ArrayList<Expression> parameters) {
        if(!(functionCall instanceof FunctionCallable))
            System.err.println("invalid function call!");
        this.functionCall = functionCall;
        this.parameters = parameters;
    }

    public Expression getFunctionCall() {
        return functionCall;
    }

    public void setFunctionCall(Expression functionCall) {
        this.functionCall = functionCall;
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
         formatter.object( functionCall.toString()) ;
        for (Expression parameter: parameters)
            formatter.object(parameter.toString());
        return formatter ;
    }
}
