package ast.nodes.attributes;

import ast.nodes.expressions.Expression;
import ast.nodes.expressions.Logical;
import ast.nodes.util.Formatter;

public class NGShowAttribute extends NGConditionalAttribute{

    public NGShowAttribute() {
    }

    public NGShowAttribute(Expression condition) {
        super(condition);
        this.condition = condition;
        this.name="ng-show";
    }

    public Expression getCondition() {
        return condition;
    }

    public void setCondition(Expression condition) {
        this.condition = condition;
    }

    @Override
    protected String nodeName() {
        return "ng-showAttribute";
    }

}
