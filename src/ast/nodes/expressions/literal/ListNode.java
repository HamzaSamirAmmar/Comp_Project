package ast.nodes.expressions.literal;

import ast.nodes.expressions.Expression;
import ast.nodes.expressions.Iterable;
import ast.nodes.expressions.Valuable;
import ast.nodes.expressions.ValuableNode;
import ast.nodes.htmlNodes.Mustache;
import ast.nodes.util.Formatter;

import java.util.ArrayList;

public class ListNode extends Expression implements Iterable {
    ArrayList<ValuableNode> elements;

    public ListNode(ArrayList<ValuableNode> elements) {
        this.elements = elements;
    }

    public ArrayList<ValuableNode> getElements() {
        return elements;
    }

    public void setElements(ArrayList<ValuableNode> elements) {
        this.elements = elements;
    }

    @Override
    protected String nodeName() {
        return "list";
    }

    @Override
    protected Formatter nodeValue(Formatter formatter) {
            formatter.array("list",new ArrayList<>(elements));
        return formatter ;
    }
}
