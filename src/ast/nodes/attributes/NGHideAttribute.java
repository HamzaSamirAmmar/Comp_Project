package ast.nodes.attributes;

import ast.nodes.expressions.Expression;
import ast.nodes.expressions.Logical;
import ast.nodes.util.Formatter;

public class NGHideAttribute extends NGConditionalAttribute{


    public NGHideAttribute() {
    }

    public NGHideAttribute(Expression condition) {
        super(condition);
        this.name="ng-hide";
    }

    public Expression getCondition() {
        return condition;
    }

    public void setCondition(Expression condition) {
        this.condition = condition;
    }

    @Override
    protected String nodeName() {
        return "ng-HideAttribute";
    }

}
