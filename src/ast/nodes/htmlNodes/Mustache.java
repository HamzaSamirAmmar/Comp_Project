package ast.nodes.htmlNodes;

import ast.nodes.AbstractNode;
import ast.nodes.expressions.Expression;
import ast.nodes.util.Formatter;

public class Mustache extends AbstractNode {
    Expression expression;

    public Mustache() {
    }

    public Mustache(Expression expression) {
        this.expression = expression;
    }

    public Expression getExpression() {
        return expression;
    }

    public void setExpression(Expression expression) {
        this.expression = expression;
    }

    @Override
    protected String nodeName() {
        return "mustache";
    }

    @Override
    protected Formatter nodeValue(Formatter formatter) {
            return formatter.object(expression.toString("Exp"));

    }
}
