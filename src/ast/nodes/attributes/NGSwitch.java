package ast.nodes.attributes;

import ast.nodes.attributes.NGAttribute;
import ast.nodes.expressions.Expression;
import ast.nodes.expressions.Valuable;
import ast.nodes.expressions.literals.ListNode;
import ast.nodes.expressions.literals.MapNode;
import ast.nodes.expressions.literals.MapPairNode;
import ast.nodes.util.Formatter;

public class NGSwitch extends NGAttribute {
    Expression expression;

    public NGSwitch(Expression expression) {
        if (expression instanceof Valuable)
            this.expression = expression;
        else System.err.println("Switch isn't valid");
    }

    public Expression getExpression() {
        return expression;
    }

    public void setExpression(Expression expression) {
        this.expression = expression;
    }

    @Override
    protected String nodeName() {
        return "SwitchNode";
    }

    @Override
    protected Formatter nodeValue(Formatter formatter) {
        return formatter.addProperty("switchValue", expression.toString());
    }
}
