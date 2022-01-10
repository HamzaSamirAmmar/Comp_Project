package ast.nodes.attributes;

import ast.nodes.expressions.Expression;
import ast.nodes.expressions.Logical;
import ast.nodes.util.Formatter;

public abstract class NGConditionalAttribute extends NGAttribute{
    Expression condition;//should be logical

    public NGConditionalAttribute() {
    }

    public NGConditionalAttribute(Expression condition) {
        if(!(condition instanceof Logical))
            System.err.println("invalid condition !");
        this.condition = condition;
    }
    @Override
    protected Formatter nodeValue(Formatter formatter) {
        return formatter.addProperty("condition",condition.toString() );
    }
}
