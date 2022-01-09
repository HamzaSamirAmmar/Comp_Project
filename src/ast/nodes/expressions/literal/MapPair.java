package ast.nodes.expressions.literal;

import ast.nodes.expressions.Expression;
import ast.nodes.expressions.Valuable;
import ast.nodes.expressions.ValuableNode;
import ast.nodes.util.Formatter;

public class MapPair extends Expression {
    String key;
    ValuableNode value;

    public MapPair(String key, ValuableNode value) {
        this.key = key;
        this.value = value;
    }

    public String getKey() {
        return key;
    }

    public void setKey(String key) {
        this.key = key;
    }

    public ValuableNode getValue() {
        return value;
    }

    public void setValue(ValuableNode value) {
        this.value = value;
    }

    @Override
    protected String nodeName() {
        return "pair";
    }

    @Override
    protected Formatter nodeValue(Formatter formatter) {

        return formatter.addProperty(key,value.toString());
    }
}
