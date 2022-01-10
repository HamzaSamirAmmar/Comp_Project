package ast.nodes.expressions.conditions;

import ast.nodes.expressions.Expression;
import ast.nodes.expressions.Logical;
import ast.nodes.expressions.LogicalNode;
import ast.nodes.util.Formatter;

public class OneOperandCondition extends Condition {
    Expression operand;//should be logical

    public OneOperandCondition(LogicalNode operand) {
        this.operand = operand;
    }

    public Expression getOperand() {
        return operand;
    }

    public void setOperand(Expression operand) {
        this.operand = operand;
    }

    @Override
    protected String nodeName() {
        return "oneOperandCondition";
    }

    @Override
    protected Formatter nodeValue(Formatter formatter) {

        formatter.object(operand.toString());
        return formatter;
    }
}
