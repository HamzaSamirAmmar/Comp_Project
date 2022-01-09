package ast.nodes.htmlNodes;

import ast.nodes.util.Formatter;

public class HTMLStyle extends HTMLElement{
    String style;

    public HTMLStyle(String style) {
        this.style = style;
    }

    public String getStyle() {
        return style;
    }

    public void setStyle(String style) {
        this.style = style;
    }

    @Override
    protected String nodeName() {
        return "styleNode";
    }

    @Override
    protected Formatter nodeValue(Formatter formatter) {
        return formatter.addProperty("styleCode", style);
    }
}
