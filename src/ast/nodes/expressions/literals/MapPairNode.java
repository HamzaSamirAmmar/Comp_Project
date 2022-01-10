package ast.nodes.expressions.literals;

import ast.nodes.expressions.Expression;
import ast.nodes.expressions.ValuableNode;
import ast.nodes.util.Formatter;

public class MapPairNode extends Expression {
    String key;
    Expression value;

    public MapPairNode() {
    }

    public MapPairNode(String key, Expression value) {
        this.key = key;
        this.value = value;
    }

    public String getKey() {
        return key;
    }

    public void setKey(String key) {
        this.key = key;
    }

    public Expression getValue() {
        return value;
    }

    public void setValue(Expression value) {
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
