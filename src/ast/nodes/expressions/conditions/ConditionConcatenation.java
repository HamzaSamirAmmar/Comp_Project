package ast.nodes.expressions.conditions;

import ast.nodes.expressions.Expression;
import ast.nodes.expressions.Logical;
import ast.nodes.expressions.LogicalNode;
import ast.nodes.util.Formatter;

public class ConditionConcatenation extends Condition {
    String operator;
    Expression leftCondition;//should be logical
    Expression rightCondition;//should be logical

    public ConditionConcatenation(String operator, Expression leftCondition, Expression rightCondition) {
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

    public Expression getLeftCondition() {
        return leftCondition;
    }

    public void setLeftCondition(Expression leftCondition) {
        this.leftCondition = leftCondition;
    }

    public Expression getRightCondition() {
        return rightCondition;
    }

    public void setRightCondition(Expression rightCondition) {
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
