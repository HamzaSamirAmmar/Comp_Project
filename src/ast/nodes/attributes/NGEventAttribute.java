package ast.nodes.attributes;

import ast.nodes.expressions.Expression;
import ast.nodes.expressions.Logical;
import ast.nodes.expressions.literals.FunctionCallNode;
import ast.nodes.util.Formatter;

public class NGEventAttribute extends NGAttribute{
    String eventName;
    Expression functionCall;

    public NGEventAttribute() {
    }

    public NGEventAttribute(String eventName,Expression functionCall) {
        if(!(functionCall instanceof FunctionCallNode))
            System.err.println("invalid function call !");
        this.functionCall = functionCall;
        this.eventName=eventName;
        this.name="ng-event";
    }

    public String getEventName() {
        return eventName;
    }

    public void setEventName(String eventName) {
        this.eventName = eventName;
    }

    public Expression getFunctionCall() {
        return functionCall;
    }

    public void setFunctionCall(Expression functionCall) {
        this.functionCall = functionCall;
    }

    @Override
    protected String nodeName() {
        return "ng-eventAttribute";
    }

    @Override
    protected Formatter nodeValue(Formatter formatter) {

        return formatter.addProperty("eventName",eventName).object(functionCall.toString());
    }
}
