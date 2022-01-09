package ast.nodes.htmlNodes;

import ast.nodes.AbstractNode;
import ast.nodes.util.Formatter;

import java.util.ArrayList;
import java.util.List;

public class HTMLDocument extends AbstractNode {
    private List<HTMLElement> elements = new ArrayList<HTMLElement>();

    public HTMLDocument(List<HTMLElement> elements) {
        this.elements = elements;
    }

    public void setElements(List<HTMLElement> elements) {
        this.elements = elements;
    }

    public List<HTMLElement> getElements() {
        return elements;
    }

    @Override
    protected String nodeName() {
        return "htmlDocument";
    }

    @Override
    protected Formatter nodeValue(Formatter formatter) {

        for (HTMLElement element: elements)
            formatter.object(element.toString());
        return formatter;
    }
}
