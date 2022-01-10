package ast.nodes.attributes;

import ast.nodes.util.Formatter;

public class NormalAttribute extends HTMLAttribute {
    String value;

    public NormalAttribute(String name, String value) {
        this.name = name;
        this.value = value;
    }

    @Override
    protected String nodeName() {
        return "normalAttribute";
    }

    @Override
    protected Formatter nodeValue(Formatter formatter) {

        return formatter.addProperty("attributeName", name)
                .addProperty("value", value);
    }
}
