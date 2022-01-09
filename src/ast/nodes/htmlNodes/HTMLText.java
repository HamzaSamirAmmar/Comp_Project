package ast.nodes.htmlNodes;

import ast.nodes.AbstractNode;
import ast.nodes.util.Formatter;

public class HTMLText extends AbstractNode {
    String text;

    public HTMLText() {
    }

    public HTMLText(String text) {
        this.text = text;
    }

    public String getText() {
        return text;
    }

    public void setText(String text) {
        this.text = text;
    }

    @Override
    protected String nodeName() {
        return "text";
    }

    @Override
    protected Formatter nodeValue(Formatter formatter) {
        return formatter.addProperty("textValue", text);
    }
}
