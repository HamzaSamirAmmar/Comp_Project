package ast.nodes.expressions.conditions;

import ast.nodes.expressions.Logical;
import ast.nodes.expressions.LogicalNode;
import ast.nodes.util.Formatter;

public class ConditionConcatenation extends Condition {
    String operator;
    LogicalNode leftCondition;
    LogicalNode rightCondition;

    public ConditionConcatenation(String operator, LogicalNode leftCondition, LogicalNode rightCondition) {
        this.operator = operator;
        this.leftCondition = leftCondition;
        this.rightCondition = rightCondition;
    }

    public String getOperator() {
        return operator;
    }

    public void setOperator(String operator) {
        this.operator = operator;
    }

    public LogicalNode getLeftCondition() {
        return leftCondition;
    }

    public void setLeftCondition(LogicalNode leftCondition) {
        this.leftCondition = leftCondition;
    }

    public LogicalNode getRightCondition() {
        return rightCondition;
    }

    public void setRightCondition(LogicalNode rightCondition) {
        this.rightCondition = rightCondition;
    }

    @Override
    protected String nodeName() {
        return "concatConcatenation";
    }

    @Override
    protected Formatter nodeValue(Formatter formatter) {
        formatter.object(leftCondition.toString()).addProperty("operator",operator).object(rightCondition.toString());
        return formatter;
    }
}
