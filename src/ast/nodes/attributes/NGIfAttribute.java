package ast.nodes.attributes;

import ast.nodes.expressions.Expression;
import ast.nodes.expressions.Logical;
import ast.nodes.util.Formatter;

public class NGIfAttribute extends NGConditionalAttribute{

    public NGIfAttribute() {
    }

    public NGIfAttribute(Expression condition) {
        super(condition);
        this.name="ng-if";
    }

    public Expression getCondition() {
        return condition;
    }

    public void setCondition(Expression condition) {
        this.condition = condition;
    }

    @Override
    protected String nodeName() {
        return "ng-ifAttribute";
    }


}
