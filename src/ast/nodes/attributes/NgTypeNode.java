package ast.nodes.attributes;

import ast.nodes.attributes.variables.TypeValueNode;
import ast.nodes.util.Formatter;

public class NgTypeNode extends NGAttribute {

    protected String typeValue;

    public String getTypeValue() {
        return typeValue;
    }

    public void setTypeValue(String typeValue) throws Exception {
        this.typeValue =  new TypeValueNode(typeValue).getTypeValue();
    }

    public NgTypeNode(String typeValue)  {
        //System.out.println(typeValue);
        this.typeValue =  new TypeValueNode(typeValue).getTypeValue();
    }

    @Override
    protected String nodeName() {
        return  "ngType";
    }

    @Override
    protected Formatter nodeValue(Formatter formatter) {
        return formatter.addProperty("ngType",typeValue);
    }
}
