package ast.nodes.attributes;

import ast.nodes.expressions.ConcatenationNode;
import ast.nodes.expressions.Expression;
import ast.nodes.expressions.literals.FunctionCallNode;
import ast.nodes.expressions.literals.VariableNode;
import ast.nodes.util.Formatter;

public class NgModelNode extends NGAttribute  {
    Expression model;

    public NgModelNode(Expression model) {
        if(model.getClass() == VariableNode.class ||
                model.getClass() == FunctionCallNode.class ||
                model.getClass() == ConcatenationNode.class)
            this.model = model;
        else System.err.println("the model value can only be a variable name," +
                " a function call or a concatenation");
    }

    public Expression getModel() {
        return model;
    }

    public void setModel(Expression model) {
        if(model.getClass() == VariableNode.class ||
                model.getClass() == FunctionCallNode.class ||
                model.getClass() == ConcatenationNode.class)
            this.model = model;
        else System.err.println("the model value can only be a variable name," +
                " a function call or a concatenation");
    }

    @Override
    protected String nodeName() {
        return "ngModel";
    }

    @Override
    protected Formatter nodeValue(Formatter formatter) {
        return formatter.object(model.toString());
    }
}
