package ast.nodes.attributes;

import ast.nodes.expressions.Expression;
import ast.nodes.expressions.Valuable;
import ast.nodes.expressions.literals.ListNode;
import ast.nodes.expressions.literals.MapNode;
import ast.nodes.expressions.literals.MapPairNode;
import ast.nodes.util.Formatter;

public class NGSwitchCase extends NGAttribute {

    Expression expression;

    public NGSwitchCase(Expression expression) {
        if (expression instanceof Valuable)
            this.expression = expression;
        else System.err.println("Switch case isn't valid");
    }

    public Expression getExpression() {
        return expression;
    }

    public void setExpression(Expression expression) {
        this.expression = expression;
    }

    @Override
    protected String nodeName() {
        return "SwitchCaseNode";
    }

    @Override
    protected Formatter nodeValue(Formatter formatter) {
        return formatter.addProperty("switchCaseValue", expression.toString());
    }
}
