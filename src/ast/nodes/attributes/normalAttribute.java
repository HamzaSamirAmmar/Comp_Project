package ast.nodes.attributes;

import ast.nodes.util.Formatter;

public class normalAttribute extends HTMLAttribute {
    String name;
    String value;

    public normalAttribute(String name, String value) {
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
