package ast.nodes.htmlNodes;

import ast.nodes.attributes.HTMLAttribute;
import ast.nodes.util.Formatter;

import java.util.ArrayList;

public class HTMLTag extends  HTMLElement{
    String tagName;
    HTMLContent content;
    ArrayList<HTMLAttribute> attributes;

    public HTMLTag() {
    }

    public HTMLTag(String tagName, HTMLContent content, ArrayList<HTMLAttribute> attributes) {
        this.tagName = tagName;
        this.content = content;
        this.attributes = attributes;
    }

    public void setTagName(String tagName) {
        this.tagName = tagName;
    }

    public void setContent( HTMLContent content) {
        this.content = content;
    }

    public void setAttributes(ArrayList<HTMLAttribute> attributes) {
        this.attributes = attributes;
    }

    public String getTagName() {
        return tagName;
    }

    public HTMLContent getContent() {
        return content;
    }

    public ArrayList<HTMLAttribute> getAttributes() {
        return attributes;
    }

    @Override
    protected String nodeName() {
        return "tagElement";
    }

    @Override
    protected Formatter nodeValue(Formatter formatter) {

        formatter.addProperty("tagName", tagName);

        for (HTMLAttribute attribute: attributes)
            formatter.object(attribute.toString());
        if (content != null)
            formatter.object(content.toString());
        return formatter;
    }
}
