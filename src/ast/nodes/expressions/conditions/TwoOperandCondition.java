package ast.nodes.expressions.conditions;

import ast.nodes.expressions.Expression;
import ast.nodes.expressions.Logical;
import ast.nodes.expressions.Valuable;
import ast.nodes.expressions.ValuableNode;
import ast.nodes.util.Formatter;

public class TwoOperandCondition extends Condition  {
    ValuableNode leftOperand,rightOperand;
    String operator;


    public TwoOperandCondition(ValuableNode leftOperand, ValuableNode rightOperand, String operator) {
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
        return "TwoOperandCondition";
    }
    @Override
    protected Formatter nodeValue(Formatter formatter) {
        formatter.object(leftOperand.toString()).addProperty("operator",operator).object(rightOperand.toString());
        return formatter;
    }
}
