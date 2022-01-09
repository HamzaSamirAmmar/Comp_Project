package ast.nodes.expressions;

import ast.nodes.util.Formatter;

public class ConcatenationNode extends Expression implements Iterable,Logical,Concatable {
    ValuableNode leftOperand;
    ValuableNode rightOperand;

    public ConcatenationNode(ValuableNode leftOperand, ValuableNode rightOperand) {
        this.leftOperand = leftOperand;
        this.rightOperand = rightOperand;
    }

    public ValuableNode getLeftOperand() {
        return leftOperand;
    }

    public void setLeftOperand(ValuableNode leftOperand) {
        this.leftOperand = leftOperand;
    }

    public ValuableNode getRightOperand() {
        return rightOperand;
    }

    public void setRightOperand(ValuableNode rightOperand) {
        this.rightOperand = rightOperand;
    }

    @Override
    protected String nodeName() {
        return "concatenatedNodes";
    }

    @Override
    protected Formatter nodeValue(Formatter formatter) {

        return formatter.addProperty("leftOperand",leftOperand.toString())
                .addProperty("rightOperand",rightOperand.toString());
    }
}
