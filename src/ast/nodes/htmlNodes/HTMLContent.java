package ast.nodes.htmlNodes;

import ast.nodes.AbstractNode;
import ast.nodes.util.Formatter;

import java.util.ArrayList;

public class HTMLContent extends AbstractNode {
    ArrayList<HTMLText> texts;
    ArrayList<Mustache> mustaches;
    ArrayList<HTMLElement> elements;

    public HTMLContent() {
    }

    public HTMLContent(ArrayList<HTMLText> texts, ArrayList<Mustache> mustaches, ArrayList<HTMLElement> elements) {
        this.texts = texts;
        this.mustaches = mustaches;
        this.elements = elements;
    }

    public void setTexts(ArrayList<HTMLText> texts) {
        this.texts = texts;
    }

    public void setMustaches(ArrayList<Mustache> mustaches) {
        this.mustaches = mustaches;
    }

    public void setElements(ArrayList<HTMLElement> elements) {
        this.elements = elements;
    }

    public ArrayList<HTMLText> getTexts() {
        return texts;
    }

    public ArrayList<Mustache> getMustaches() {
        return mustaches;
    }

    public ArrayList<HTMLElement> getElements() {
        return elements;
    }

    @Override
    protected String nodeName() {
        return "htmlTagContent";
    }

    @Override
    protected Formatter nodeValue(Formatter formatter) {

//        ArrayList<Object> texts=new ArrayList<>(this.texts);
//        if (texts.size()!=0)
//            formatter.array("texts", texts);
//        ArrayList<Object> mustaches=new ArrayList<>(this.mustaches);
//        if (mustaches.size()!=0)
//            formatter.array("mustaches", mustaches);
//        ArrayList<Object> elems=new ArrayList<>(this.elements);
//        if (elems.size()!=0)
//            formatter.array("elements", elems);
        for (HTMLText text: texts)
            formatter.object(text.toString());
        for (Mustache mustache: mustaches)
            formatter.object(mustache.toString());
        for (HTMLElement element: elements) {
            if(element instanceof HTMLTag)
            formatter.object(((HTMLTag)element).toString());
            else if (element instanceof HTMLScript)
                formatter.object(((HTMLScript)element).toString());
            else
                formatter.object(((HTMLStyle)element).toString());
        }
        return formatter;
    }
}
