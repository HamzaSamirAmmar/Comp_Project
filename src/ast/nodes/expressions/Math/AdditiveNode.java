package ast.nodes.expressions.Math;

import ast.nodes.expressions.*;
import ast.nodes.expressions.literals.DecimalNode;
import ast.nodes.expressions.literals.FunctionCallNode;
import ast.nodes.expressions.literals.StringNode;
import ast.nodes.expressions.literals.VariableNode;
import ast.nodes.util.Formatter;

public class AdditiveNode extends Expression implements Valuable {
    Expression leftOperand;//should be valuable
    Expression rightOperand;//should be valuable
    String operator;

    public AdditiveNode(Expression leftOperand, Expression rightOperand, String operator) {
        if (leftOperand instanceof DecimalNode || leftOperand instanceof FunctionCallNode || leftOperand instanceof StringNode || leftOperand instanceof VariableNode || leftOperand instanceof ConcatenableNode || leftOperand instanceof PipeExpressionNode || leftOperand instanceof TernaryExpressionNode) {
            if (rightOperand instanceof DecimalNode || rightOperand instanceof FunctionCallNode || rightOperand instanceof StringNode || rightOperand instanceof VariableNode || rightOperand instanceof ConcatenableNode || rightOperand instanceof PipeExpressionNode || rightOperand instanceof TernaryExpressionNode) {
                this.leftOperand = leftOperand;
                this.rightOperand = rightOperand;
                this.operator = operator;
            }
        } else {
            System.err.println("Invalid additive");
        }
    }

    public Expression getLeftOperand() {
        return leftOperand;
    }

    public void setLeftOperand(Expression leftOperand) {
        this.leftOperand = leftOperand;
    }

    public Expression getRightOperand() {
        return rightOperand;
    }

    public void setRightOperand(Expression rightOperand) {
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
        return "additiveNode";
    }

    @Override
    protected Formatter nodeValue(Formatter formatter) {
        formatter.addProperty("leftOperand", leftOperand.toString());
        formatter.addProperty("Operator", operator);
        formatter.addProperty("rightOperand", rightOperand.toString());
        return formatter;
    }
}
