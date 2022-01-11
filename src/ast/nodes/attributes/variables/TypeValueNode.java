package ast.nodes.attributes.variables;

import ast.nodes.expressions.Valuable;

public class TypeValueNode implements Valuable {
    private String typeValue ;

    public TypeValueNode(String typeValue) {
        String[] values = {"text","button","checkbox","color","date","datetime-local","email",
                "file","hidden","image","month","number","password","radio","range","reset","search",
                "submit","tel","time","url","week"};
        this.typeValue = values[0];
        boolean aType = false;
        for (String value:values) {
            if(typeValue.equals(value)){
                aType = true;
                this.typeValue = typeValue;
            }
        }
        if(!aType){
            try {
                throw new Exception("the string you enter is not a type");
            }catch (Exception e){
                System.err.println("the string you enter is not a type");
            }
        }
    }

    public String getTypeValue() {
        return typeValue;
    }
}
