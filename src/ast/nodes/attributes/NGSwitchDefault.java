package ast.nodes.attributes;

import ast.nodes.util.Formatter;

public class NGSwitchDefault extends  NGAttribute{
    @Override
    protected String nodeName() {
        return "NGSwitchDefault";
    }

    public NGSwitchDefault() {
    }

    @Override
    protected Formatter nodeValue(Formatter formatter) {
        return formatter.object(nodeName());
    }
}
