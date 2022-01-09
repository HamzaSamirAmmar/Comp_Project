package ast.nodes.expressions.literal;

import ast.nodes.expressions.Expression;
import ast.nodes.expressions.Iterable;
import ast.nodes.htmlNodes.HTMLElement;
import ast.nodes.util.Formatter;

import java.util.ArrayList;

public class Map extends Expression implements Iterable {
    ArrayList<MapPair> pairs;

    public Map(ArrayList<MapPair> pairs) {
        this.pairs = pairs;
    }

    public ArrayList<MapPair> getPairs() {
        return pairs;
    }

    public void setPairs(ArrayList<MapPair> pairs) {
        this.pairs = pairs;
    }

    @Override
    protected String nodeName() {
        return "map";
    }

    @Override
    protected Formatter nodeValue(Formatter formatter) {

        for (MapPair pair: pairs)
            formatter.object(pair.toString());
        return formatter;
    }
}
