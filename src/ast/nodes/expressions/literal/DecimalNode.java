package ast.nodes.expressions.literal;

import ast.nodes.expressions.Expression;
import ast.nodes.util.Formatter;

public class DecimalNode extends Expression {
    Double decimalValue;

    public DecimalNode(Double decimalValue) {
        this.decimalValue = decimalValue;
    }

    public Double getDecimalValue() {
        return decimalValue;
    }

    public void setDecimalValue(Double decimalValue) {
        this.decimalValue = decimalValue;
    }

    @Override
    protected String nodeName() {
        return "decimalValue";
    }

    @Override
    protected Formatter nodeValue(Formatter formatter) {
        return formatter.addProperty("decimalValue",decimalValue.toString()) ;
    }
}
