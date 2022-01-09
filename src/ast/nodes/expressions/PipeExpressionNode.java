package ast.nodes.expressions;

import ast.nodes.expressions.literal.FunctionCallNode;
import ast.nodes.util.Formatter;

public class PipeExpressionNode extends Expression implements Iterable,Logical,Concatable{
    ValuableNode firstOperand;
    FunctionCallNode functionCall;

    public PipeExpressionNode(ValuableNode firstOperand, FunctionCallNode functionCall) {
        this.firstOperand = firstOperand;
        this.functionCall = functionCall;
    }

    public ValuableNode getFirstOperand() {
        return firstOperand;
    }

    public void setFirstOperand(ValuableNode firstOperand) {
        this.firstOperand = firstOperand;
    }

    public FunctionCallNode getFunctionCall() {
        return functionCall;
    }

    public void setFunctionCall(FunctionCallNode functionCall) {
        this.functionCall = functionCall;
    }

    @Override
    protected String nodeName() {
        return "pipeExpression";
    }

    @Override
    protected Formatter nodeValue(Formatter formatter) {

        return formatter.addProperty("piped",firstOperand.toString())
                .addProperty("functionCall",functionCall.toString());
    }
}
