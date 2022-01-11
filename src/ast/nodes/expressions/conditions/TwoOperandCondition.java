package ast.nodes.expressions.conditions;

import ast.nodes.expressions.Expression;
import ast.nodes.expressions.Logical;
import ast.nodes.expressions.Valuable;
import ast.nodes.expressions.ValuableNode;
import ast.nodes.util.Formatter;

public class TwoOperandCondition extends Condition  {
    Expression leftOperand,rightOperand;//should be valuable

    String operator;


    public TwoOperandCondition(Expression leftOperand, Expression rightOperand, String operator) {
        if(leftOperand instanceof Valuable)
            this.leftOperand = leftOperand;
        else throw new RuntimeException("left operand should be a valuable expression");
        if(rightOperand instanceof Valuable)
            this.rightOperand = rightOperand;
        else  throw new RuntimeException("right operand should be a valuable expression");
        this.operator = operator;
    }

    public Expression getLeftOperand() {
        return leftOperand;
    }

    public void setLeftOperand(Expression leftOperand) {
        if(leftOperand instanceof Valuable)
            this.leftOperand = leftOperand;
        else throw new RuntimeException("left operand should be a valuable expression");
    }

    public Expression getRightOperand() {
        return rightOperand;
    }

    public void setRightOperand(Expression rightOperand) {
        if(rightOperand instanceof Valuable)
            this.rightOperand = rightOperand;
        else  System.err.println("right operand should be a valuable expression");
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
        formatter.object(leftOperand.toString("leftOperand")).addProperty("operator",operator).object(rightOperand.toString("rightOperand"));
        return formatter;
    }
}
