package ast.nodes.expressions.literal;

import ast.nodes.expressions.Concatable;
import ast.nodes.expressions.Expression;
import ast.nodes.expressions.Logical;
import ast.nodes.util.Formatter;

public class BooleanNode extends Expression implements Logical {
    Boolean boolName;

    public BooleanNode(Boolean boolName) {
        this.boolName = boolName;
    }

    public Boolean getBoolName() {
        return boolName;
    }

    public void setBoolName(Boolean boolName) {
        this.boolName = boolName;
    }

    @Override
    protected String nodeName() {
        return "booleanValue";
    }

    @Override
    protected Formatter nodeValue(Formatter formatter) {
        return formatter.addProperty("boolValue",boolName.toString()) ;
    }
}
