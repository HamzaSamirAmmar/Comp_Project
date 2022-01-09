package ast.nodes.expressions.conditions;

import ast.nodes.expressions.Expression;
import ast.nodes.expressions.Logical;
import ast.nodes.expressions.LogicalNode;
import ast.nodes.util.Formatter;

public class OneOperandCondition extends Condition {
    LogicalNode operand;

    public OneOperandCondition(LogicalNode operand) {
        this.operand = operand;
    }

    public LogicalNode getOperand() {
        return operand;
    }

    public void setOperand(LogicalNode operand) {
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
