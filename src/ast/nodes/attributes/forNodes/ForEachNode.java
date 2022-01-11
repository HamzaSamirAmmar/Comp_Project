package ast.nodes.attributes.forNodes;

import ast.nodes.attributes.HTMLAttribute;
import ast.nodes.expressions.Expression;
import ast.nodes.expressions.literals.ListNode;
import ast.nodes.util.Formatter;

import java.util.ArrayList;

public class ForEachNode extends HTMLAttribute {
    String iterator;
    Expression list;
    String index; // null if index not provided
    Expression indexValue; // null if index not provided

    public ForEachNode(String iterator, Expression list) {
        this.iterator = iterator;
        this.list = list;
    }

    public void setIndex(String index) {
        this.index = index;
    }

    public void setIndexValue(Expression indexValue) {
        this.indexValue = indexValue;
    }

    @Override
    protected String nodeName() {
        return "forEach";
    }

    @Override
    protected Formatter nodeValue(Formatter formatter) {
        formatter.addProperty("iterator", iterator);
        if (list instanceof ListNode)
            formatter.array("list", new ArrayList<>(((ListNode) list).getElements()));
        else formatter.addProperty("ListName", list.toString());
        if (index != null && indexValue != null) {
            formatter.addProperty("index name", index);
//            if (indexValue instanceof VariableNode)
//                formatter.addProperty("indexValue", indexValue.toString());
//            if (indexValue instanceof FunctionCallNode)
//                formatter.addProperty("Function", indexValue.toString());
            formatter.object(indexValue.toString("index value"));
        }
        return formatter;
    }
}
