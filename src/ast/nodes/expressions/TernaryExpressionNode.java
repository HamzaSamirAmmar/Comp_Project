package ast.nodes.expressions;

import ast.nodes.util.Formatter;

public class TernaryExpressionNode extends Expression implements Iterable,Logical{
    LogicalNode conditionOperand;
    ValuableNode firstExpression;
    ValuableNode secondExpression;

    public TernaryExpressionNode(LogicalNode conditionOperand, ValuableNode firstExpression, ValuableNode secondExpression) {
        this.conditionOperand = conditionOperand;
        this.firstExpression = firstExpression;
        this.secondExpression = secondExpression;
    }

    public LogicalNode getConditionOperand() {
        return conditionOperand;
    }

    public void setConditionOperand(LogicalNode conditionOperand) {
        this.conditionOperand = conditionOperand;
    }

    public ValuableNode getFirstExpression() {
        return firstExpression;
    }

    public void setFirstExpression(ValuableNode firstExpression) {
        this.firstExpression = firstExpression;
    }

    public ValuableNode getSecondExpression() {
        return secondExpression;
    }

    public void setSecondExpression(ValuableNode secondExpression) {
        this.secondExpression = secondExpression;
    }

    @Override
    protected String nodeName() {
        return "ternaryExpression";
    }

    @Override
    protected Formatter nodeValue(Formatter formatter) {

        return formatter.addProperty("condition",conditionOperand.toString())
                .addProperty("firstExpression",firstExpression.toString())
                .addProperty("secondExpression",secondExpression.toString())
                ;
    }
}
