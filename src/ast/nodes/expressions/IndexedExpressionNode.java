package ast.nodes.expressions;

import ast.nodes.util.Formatter;

public class IndexedExpressionNode extends Expression implements Iterable,Logical,Concatable{
    IterableNode indexed;
    ValuableNode index;

    public IndexedExpressionNode(IterableNode indexed, ValuableNode index) {
        this.indexed = indexed;
        this.index = index;
    }

    public IterableNode getIndexed() {
        return indexed;
    }

    public void setIndexed(IterableNode indexed) {
        this.indexed = indexed;
    }

    public ValuableNode getIndex() {
        return index;
    }

    public void setIndex(ValuableNode index) {
        this.index = index;
    }

    @Override
    protected String nodeName() {
        return "indexedExpression";
    }

    @Override
    protected Formatter nodeValue(Formatter formatter) {
        return formatter.addProperty("indexed",indexed.toString())
                .addProperty("index",index.toString());
    }
}
