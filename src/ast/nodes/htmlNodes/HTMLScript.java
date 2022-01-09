package ast.nodes.htmlNodes;

import ast.nodes.util.Formatter;

public class HTMLScript extends HTMLElement{
    String script;

    public HTMLScript() {
    }

    public HTMLScript(String script) {
        this.script = script;
    }

    public String getScript() {
        return script;
    }

    public void setScript(String script) {
        this.script = script;
    }

    @Override
    protected String nodeName() {
        return "scriptNode";
    }

    @Override
    protected Formatter nodeValue(Formatter formatter) {
         return formatter.addProperty("scriptCode", script);
    }
}
