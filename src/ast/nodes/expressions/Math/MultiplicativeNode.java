package ast.nodes.expressions.Math;

import ast.nodes.expressions.Expression;
import ast.nodes.expressions.Valuable;
import ast.nodes.expressions.ValuableNode;
import ast.nodes.util.Formatter;

public class MultiplicativeNode extends Expression {
    ValuableNode leftOperand;
    ValuableNode rightOperand;
    String operator;

    public MultiplicativeNode(ValuableNode leftOperand, ValuableNode rightOperand, String operator) {
        this.leftOperand = leftOperand;
        this.rightOperand = rightOperand;
        this.operator = operator;
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

    public String getOperator() {
        return operator;
    }

    public void setOperator(String operator) {
        this.operator = operator;
    }

    @Override
    protected String nodeName() {
        return "MultiplicativeNode";
    }

    @Override
    protected Formatter nodeValue(Formatter formatter) {

        return formatter.addProperty("leftOperand",leftOperand.toString())
                .addProperty("operator",operator)
                .addProperty("rightOperand",rightOperand.toString())
                ;
    }
}
