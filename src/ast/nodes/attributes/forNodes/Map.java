package ast.nodes.attributes.forNodes;

import ast.nodes.attributes.HTMLAttribute;
import ast.nodes.expressions.Expression;
import ast.nodes.expressions.literals.MapNode;
import ast.nodes.expressions.literals.VariableNode;
import ast.nodes.util.Formatter;

public class Map extends HTMLAttribute {
    IteratorPairNode pair;
    Expression map;

    public Map(IteratorPairNode pair, Expression map) {
        this.pair = pair;
        this.map = map;
    }

    @Override
    protected String nodeName() {
        return "mapLoop";
    }

    @Override
    protected Formatter nodeValue(Formatter formatter) {
        formatter.addProperty("keyIterator", pair.keyIterator).addProperty("valueIterator",pair.valueIterator);
        if (map instanceof VariableNode)
        formatter.addProperty("map", map.toString());
        if (map instanceof MapNode)
            formatter.object(map.toString());
//            formatter.addProperty("map",new (((MapNode) map).));
        return formatter;
    }
}
