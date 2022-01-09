package ast.nodes.expressions.Math;

import ast.nodes.expressions.Expression;
import ast.nodes.expressions.ValuableNode;
import ast.nodes.util.Formatter;

public class OneOperandMathematicalNode extends Expression {
    boolean operandIsLeft;
    String operator;
    ValuableNode operand;

    public OneOperandMathematicalNode(boolean operandIsLeft, String operator, ValuableNode operand) {
        this.operandIsLeft = operandIsLeft;
        this.operator = operator;
        this.operand = operand;
    }

    public boolean isOperandIsLeft() {
        return operandIsLeft;
    }

    public void setOperandIsLeft(boolean operandIsLeft) {
        this.operandIsLeft = operandIsLeft;
    }

    public String getOperator() {
        return operator;
    }

    public void setOperator(String operator) {
        this.operator = operator;
    }

    public ValuableNode getOperand() {
        return operand;
    }

    public void setOperand(ValuableNode operand) {
        this.operand = operand;
    }

    @Override
    protected String nodeName() {
        return "OneOperandMathematicalNode";
    }

    @Override
    protected Formatter nodeValue(Formatter formatter) {
        return formatter.addProperty("operand",operand.toString())
                .addProperty("operator",operator);
    }
}
