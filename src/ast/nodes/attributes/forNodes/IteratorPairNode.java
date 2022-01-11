package ast.nodes.attributes.forNodes;

import ast.nodes.AbstractNode;
import ast.nodes.util.Formatter;

    public class IteratorPairNode extends AbstractNode{
        String keyIterator;
        String valueIterator;

        public IteratorPairNode(String key, String value) {
            this.keyIterator = key;
            this.valueIterator = value;
        }
        @Override
        protected String nodeName() {
            return "IteratorPairNode";
        }

        @Override
        protected Formatter nodeValue(Formatter formatter) {
            return formatter.addProperty("keyIterator", keyIterator)
                    .addProperty("valueIterator", valueIterator);
        }

}
