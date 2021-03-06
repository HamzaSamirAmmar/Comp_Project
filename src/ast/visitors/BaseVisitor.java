package ast.visitors;

import ast.nodes.AbstractNode;
import ast.nodes.attributes.*;
import ast.nodes.attributes.forNodes.ForEachNode;
import ast.nodes.attributes.forNodes.Map;
import ast.nodes.attributes.forNodes.IteratorPairNode;
import ast.nodes.expressions.*;
import ast.nodes.expressions.Iterable;
import ast.nodes.expressions.Math.AdditiveNode;
import ast.nodes.expressions.Math.OneOperandMathematicalNode;
import ast.nodes.expressions.conditions.ConditionConcatenation;
import ast.nodes.expressions.conditions.OneOperandCondition;
import ast.nodes.expressions.conditions.TwoOperandCondition;
import ast.nodes.expressions.literals.*;
import ast.nodes.htmlNodes.*;
import generated.HTMLParser;
import generated.HTMLParserBaseVisitor;

import java.util.ArrayList;
import java.util.Stack;

public class BaseVisitor extends HTMLParserBaseVisitor<AbstractNode> {

    @Override
    public HTMLDocument visitHtmlDocument(HTMLParser.HtmlDocumentContext ctx) {
        System.out.println("in doc visitor");
        ArrayList<HTMLElement> elements=new ArrayList<>();
        for (int i = 0; i <ctx.htmlElements().size() ; i++) {
            elements.add((HTMLElement) visit(ctx.htmlElements(i)));
        }
        HTMLDocument document=new HTMLDocument(elements);
//        document.setLine(ctx.htmlElements(0)..getSymbol().getLine());
//        document.setCol(ctx.htmlElements(0).getSymbol().getCharPositionInLine());
        return document;
    }

    @Override
    public AbstractNode visitHtmlElements(HTMLParser.HtmlElementsContext ctx) {
        System.out.println("in elements visitor");
        return visitHtmlElement(ctx.htmlElement());
       
    }
    @Override
    public AbstractNode visitHtmlElement(HTMLParser.HtmlElementContext ctx) {
        System.out.println("in element visitor");
        if(ctx.style() !=null)
            return visitStyle(ctx.style());
        else if(ctx.script()!=null)
            return visitScript(ctx.script());
        else {
            HTMLTag element=new HTMLTag();
            String tagOpenName = ctx.TAG_NAME(0).getText();
            String tagCloseName;
            if(ctx.getChild((ctx.getChildCount()-3)).equals(ctx.TAG_SLASH())){
                tagCloseName = ctx.getChild(ctx.getChildCount()-2).getText();
                if (!testName(tagOpenName, tagCloseName)){
                    System.err.println("open tag name does not match close tag name!");
                    //throw new RuntimeException("name does not match!");
                }
            }
            element.setTagName(tagOpenName);
            if(ctx.htmlContent()!=null){
                element.setContent((HTMLContent) visit(ctx.htmlContent()));
            }
            ArrayList<HTMLAttribute> attributes = new ArrayList<>();
            for (int i = 0; i < ctx.htmlAttribute().size(); i++) {
                attributes.add((HTMLAttribute) visit(ctx.htmlAttribute(i)));
            }
            element.setAttributes(attributes);
            return element;
        }
    }
    @Override
    public AbstractNode visitHtmlContent(HTMLParser.HtmlContentContext ctx) {
        System.out.println("in content visitor");
        ArrayList<HTMLElement> elements=new ArrayList<>();
        for (int i = 0; i <ctx.htmlElement().size() ; i++) {
            elements.add((HTMLElement) visit(ctx.htmlElement(i)));
        }
        ArrayList<HTMLText> texts=new ArrayList<>();
        for (int i = 0; i <ctx.htmlChardata().size() ; i++) {
            texts.add((HTMLText) visit(ctx.htmlChardata(i)));
        }
        ArrayList<Mustache> mustaches=new ArrayList<>();
        for (int i = 0; i <ctx.mustache().size() ; i++) {
            mustaches.add((Mustache) visit(ctx.mustache(i)));
        }
        HTMLContent content= new HTMLContent(texts,mustaches,elements);
        return content;

    }

    @Override
    public AbstractNode visitHtmlChardata(HTMLParser.HtmlChardataContext ctx) {
        System.out.println("in text visitor");
        return new HTMLText(ctx.getText());
    }
    @Override
    public AbstractNode visitMustache(HTMLParser.MustacheContext ctx) {
        System.out.println("in mustache visitor");
        Mustache mustache=new Mustache();
        Expression exp=(Expression) visit(ctx.expression());
        mustache.setExpression(exp);
        return mustache;
    }


    @Override
    public AbstractNode visitHtmlAttribute(HTMLParser.HtmlAttributeContext ctx) {
        System.out.println("in attribute visitor");
        HTMLAttribute attribute=null;
        if(ctx.TAG_NAME() !=null)//case not a NG attribute
            return new NormalAttribute(ctx.TAG_NAME().getText(),ctx.ATTVALUE_VALUE().getText());
        else if(ctx.ng_app()!=null)
            return visit(ctx.ng_app());
        else if(ctx.ng_for()!=null)
            return visit(ctx.ng_for());
        else if(ctx.ng_switch()!=null)
            return visit(ctx.ng_switch());
        else if(ctx.ng_switch_case()!=null)
            return visit(ctx.ng_switch_case());
        else if(ctx.ng_switch_default()!=null)
            return visit(ctx.ng_switch_default());
        else if(ctx.ng_if()!=null)
            return visit(ctx.ng_if());
        else if(ctx.ng_hide()!=null)
            return visit(ctx.ng_hide());
        else if(ctx.ng_show()!=null)
            return visit(ctx.ng_show());
        else if(ctx.ng_event()!=null)
            return visit(ctx.ng_event());
        else if(ctx.ng_model()!=null)
            return visit(ctx.ng_model());
        else
            return visit(ctx.ng_type());
    }

    @Override
    public AbstractNode visitParenthesizedExpression(HTMLParser.ParenthesizedExpressionContext ctx) {
        System.out.println("in Parenthesized Expression visitor");
        return visit(ctx.expression());
    }

    @Override
    public AbstractNode visitLiteralArrayExpression(HTMLParser.LiteralArrayExpressionContext ctx) {
        System.out.println("in Literal Array Expression visitor");
        return visit(ctx.ng_list());
    }
    @Override
    public AbstractNode visitTernaryExpression(HTMLParser.TernaryExpressionContext ctx) {
        System.out.println("in ternary expression visitor");
        if (ctx.QUESTION_MARK() != null && ctx.COLON() != null) {
            Expression conditionOperand = (Expression) visit(ctx.expression(0));
            Expression firstExpression = (Expression) visit(ctx.expression(1));
            Expression secondExpression = (Expression) visit(ctx.expression(2));
            if (conditionOperand instanceof Logical )
                return new TernaryExpressionNode(conditionOperand, firstExpression, secondExpression);
        }
        throw new RuntimeException("Invalid ternary expression");
    }

    @Override
    public AbstractNode visitTwoOperandsConditionExpression(HTMLParser.TwoOperandsConditionExpressionContext ctx) {
        System.out.println("in two operands condition visitor");
        Expression leftOperand = (Expression) visit(ctx.expression(0));
        Expression rightOperand = (Expression) visit(ctx.expression(1));
        String operator  = ctx.NG_OPERATOR_TWO_OPERAND().getText();

        return new TwoOperandCondition(leftOperand,rightOperand,operator);
    }

    @Override
    public AbstractNode visitMathematicalExpression(HTMLParser.MathematicalExpressionContext ctx) {
        System.out.println("Math is Math, and nothing else");
        if (ctx.ADDITIVE_OPERATOR() != null) {
            System.out.println("Additive");
            String operator = ctx.ADDITIVE_OPERATOR().getText();
            Expression leftOperand = (Expression) visit(ctx.expression(0));
            Expression rightOperand = (Expression) visit(ctx.expression(1));
            return new AdditiveNode(leftOperand, rightOperand, operator);
        } else {
            System.out.println("Multiplication");
            String operator = ctx.MULTIPLICATIVE_OPERATOR().getText();
            Expression leftOperand = (Expression) visit(ctx.expression(0));
            Expression rightOperand = (Expression) visit(ctx.expression(1));
            return new AdditiveNode(leftOperand, rightOperand, operator);
        }
    }

    @Override
    public AbstractNode visitIndexedVariableExpression(HTMLParser.IndexedVariableExpressionContext ctx) {
        System.out.println("in indexed variable expression visitor");
        if (ctx.SQUARE_OPEN() != null && ctx.SQUARE_CLOSE() != null) {
            Expression indexed = (Expression) visit(ctx.expression(0));
            Expression index = (Expression) visit(ctx.expression(1));
            if (indexed instanceof Iterable && index instanceof Numeric)
                return new IndexedExpressionNode(indexed, index);
        }
        throw new RuntimeException("Invalid Indexed Variable Expression");
    }

    @Override
    public AbstractNode visitPipeExpression(HTMLParser.PipeExpressionContext ctx) {
        System.out.println("in pipe Expression visitor");

        Expression firstOperand = (Expression) visit(ctx.expression(0));
        Expression functionCall = (Expression) visit(ctx.expression(1));
        FunctionCallNode params = (FunctionCallNode)visit(ctx.params());
        if(!(functionCall instanceof FunctionCallable))
            throw new RuntimeException("invalid function call!");
        params.setFunctionCall(functionCall);

        return new PipeExpressionNode(firstOperand,params);
    }

    @Override
    public BooleanNode visitLiteralBooleanExpression(HTMLParser.LiteralBooleanExpressionContext ctx) {
        System.out.println("in literal boolean expression visitor");
        return new BooleanNode(Boolean.parseBoolean(ctx.NG_BOOLEAN().getText()));
    }

    @Override
    public AbstractNode visitOneOperandConditionExpression(HTMLParser.OneOperandConditionExpressionContext ctx) {
        System.out.println("in one operand condition visitor");
        Expression operand = (Expression) visit(ctx.expression());
        return new OneOperandCondition(operand);
    }

    @Override
    public AbstractNode visitOneOperandValuableExpression(HTMLParser.OneOperandValuableExpressionContext ctx) {
        System.out.println("One operand valuable");
        boolean operandIsLeft = (ctx.children.get(0) == ctx.NG_ONE_VALUABLE_OPERAND());
        String operator = ctx.NG_ONE_VALUABLE_OPERAND().getText();
        Expression operand = (Expression) visit(ctx.expression());
        return new OneOperandMathematicalNode(operandIsLeft,operator,operand);
    }

    @Override
    public DecimalNode visitLiteralNumericExpression(HTMLParser.LiteralNumericExpressionContext ctx) {
        System.out.println("in literal numeric expression visitor");
        return new DecimalNode(Double.parseDouble(ctx.NG_DECIMAL().getText()));
    }

    @Override
    public AbstractNode visitFunctionCallExpression(HTMLParser.FunctionCallExpressionContext ctx) {
        System.out.println("in function call expression visitor");
        Expression functionCall=(Expression)visit(ctx.expression());
        ArrayList<Expression> parameters=new ArrayList<>();
        if(ctx.params()!=null)
        for (int i = 0; i <ctx.params()
                .expression()
                .size() ; i++) {
            parameters.add((Expression) visit(ctx.params().expression(i)));
        }
        return new FunctionCallNode(functionCall,parameters);
    }

    @Override
    public MapNode visitLiteralObjectExpression(HTMLParser.LiteralObjectExpressionContext ctx) {
        System.out.println("in literal object expression visitor");
        MapNode map=(MapNode) visit(ctx.map());
        return map;
    }

    @Override
    public AbstractNode visitLiteralStringExpression(HTMLParser.LiteralStringExpressionContext ctx) {
        System.out.println("in literal string expression visitor");
        String fullText=ctx.NG_STRING().getText();
        return new StringNode(fullText.substring(1,fullText.length()-1));
    }

    @Override
    public AbstractNode visitVariableConcatExpression(HTMLParser.VariableConcatExpressionContext ctx) {
        System.out.println("in variable concat expression visitor");
        Expression leftOperand = (Expression) visit(ctx.expression(0));
        Expression rightOperand = (Expression) visit(ctx.expression(1));
        if (leftOperand instanceof Concatable &&( (rightOperand instanceof FunctionCallNode)
                                                 || (rightOperand instanceof VariableNode)
                                                 || (rightOperand instanceof ConcatenationNode)
                                                 || (rightOperand instanceof IndexedExpressionNode) ))
            return new ConcatenationNode(leftOperand, rightOperand);

        throw new RuntimeException("Invalid Concat Expression");
    }

    @Override
    public AbstractNode visitConcatConditionExpression(HTMLParser.ConcatConditionExpressionContext ctx) {
        System.out.println("in Condition Concatenation visitor");
        Expression leftOperand = (Expression) visit(ctx.expression(0));
        Expression rightOperand = (Expression) visit(ctx.expression(1));
        String operator  = ctx.CONDITIONAL_CONCAT_OPERATOR().getText();

        return new ConditionConcatenation(operator,leftOperand,rightOperand);
    }

    @Override
    public VariableNode visitVariableNameExpression(HTMLParser.VariableNameExpressionContext ctx) {
        System.out.println("in variable name expression visitor");
        return new VariableNode(ctx.NG_ID().getText());
    }

    @Override
    public CharNode visitLiteralCharExpression(HTMLParser.LiteralCharExpressionContext ctx) {
        System.out.println("in literal char expression visitor");
        return new CharNode(ctx.NG_CHAR().getText().charAt(1));
    }

    @Override
    public AbstractNode visitNg_app(HTMLParser.Ng_appContext ctx) {
        System.out.println("in ng_app visitor");
        return new NGAppAttribute(ctx.NG_ID().getText());
    }

    @Override
    public AbstractNode visitNg_for(HTMLParser.Ng_forContext ctx) {
        System.out.println("in ng_for visitor");
        if (ctx.ngfor_body() != null)
            return visitNgfor_body(ctx.ngfor_body());
        throw new RuntimeException("Invalid loop body");
    }

    @Override
    public AbstractNode visitNg_switch(HTMLParser.Ng_switchContext ctx) {
        System.out.println("in Ng_switch visitor");
        Expression expression = (Expression) visit(ctx.switch_body());
        return new NGSwitch(expression);
    }

    @Override
    public NGIfAttribute visitNg_if(HTMLParser.Ng_ifContext ctx) {
        System.out.println("in Ng_if visitor");
        Expression condition=(Expression) visit(ctx.expression());
        return new NGIfAttribute(condition);
    }

    @Override
    public NGHideAttribute visitNg_hide(HTMLParser.Ng_hideContext ctx) {
        System.out.println("in Ng_hide visitor");
        Expression condition=(Expression) visit(ctx.expression());
        return new NGHideAttribute(condition);
    }

    @Override
    public NGShowAttribute visitNg_show(HTMLParser.Ng_showContext ctx) {
        System.out.println("in Ng_show visitor");
        Expression condition=(Expression) visit(ctx.expression());
        return new NGShowAttribute(condition);
    }

    @Override
    public AbstractNode visitNg_switch_case(HTMLParser.Ng_switch_caseContext ctx) {
        System.out.println("in Ng_switch_case visitor");
        Expression expression = (Expression) visit(ctx.switch_case_body());
        return new NGSwitchCase(expression);
    }

    @Override
    public AbstractNode visitNg_switch_default(HTMLParser.Ng_switch_defaultContext ctx) {
        System.out.println("in Ng_switch_default visitor");
        return new NGSwitchDefault();
    }

    @Override
    public AbstractNode visitSwitch_body(HTMLParser.Switch_bodyContext ctx) {
        System.out.println("in switch_body visitor");
        return visit(ctx.expression());
    }

    @Override
    public AbstractNode visitSwitch_case_body(HTMLParser.Switch_case_bodyContext ctx) {
        System.out.println("in switch_case_body visitor");
        return visit(ctx.expression());
    }

    @Override
    public AbstractNode visitNg_type(HTMLParser.Ng_typeContext ctx) {
        System.out.println("in ng_Type visitor");
        return new NgTypeNode(ctx.INPUT_TYPE().getText());
    }

    @Override
    public AbstractNode visitNg_model(HTMLParser.Ng_modelContext ctx) {
        System.out.println("in ng_model visitor");
        Expression model = (Expression) visit(ctx.expression());
        NgModelNode ngModelNode = new NgModelNode(model);
        if(ngModelNode.getModel()!=null){
            return ngModelNode;
        }
        // this will give null pointer exception and didn't know what to replace with
        return ngModelNode;
    }

    @Override
    public NGEventAttribute visitNg_event(HTMLParser.Ng_eventContext ctx) {
        System.out.println("in ng_event visitor");
        Expression functionCall=(Expression)visit(ctx.expression());
        String eventName= ctx.NG_AT_EVENT().getText().substring(1);
        return new NGEventAttribute(eventName,functionCall);
    }

    @Override
    public AbstractNode visitParams(HTMLParser.ParamsContext ctx) {
        System.out.println("in params visitor");
        ArrayList<Expression> params = new ArrayList<>();
        for(int i=0;i<ctx.getChildCount();i++){
            params.add((Expression)visit(ctx.expression(i))) ;
        }
        return new FunctionCallNode(params);
    }

    @Override
    public ListNode visitNg_list(HTMLParser.Ng_listContext ctx) {
        System.out.println("in ng_list visitor");
        ArrayList<Expression> elements=new ArrayList<>();
        for (int i = 0; i <ctx.expression().size() ; i++) {
            elements.add((Expression) visit(ctx.expression(i)));
        }
        return new ListNode(elements);
    }

    @Override
    public MapPairNode visitMap_value(HTMLParser.Map_valueContext ctx) {
        System.out.println("in map_value visitor");
        MapPairNode keyValue= new MapPairNode();
        keyValue.setKey(ctx.NG_ID().getText());
        keyValue.setValue((Expression) visit(ctx.expression()));
        return keyValue;
    }

    @Override
    public MapNode visitMap(HTMLParser.MapContext ctx) {
        System.out.println("in map visitor");
        ArrayList<MapPairNode> pairNodes=new ArrayList<>();
        for (int i = 0; i <ctx.map_value().size() ; i++) {
            pairNodes.add((MapPairNode) visit(ctx.map_value(i)));
        }
        return new MapNode(pairNodes);
    }

    @Override
    public AbstractNode visitNgfor_body(HTMLParser.Ngfor_bodyContext ctx) {
        System.out.println("in ngfor_body visitor");
        if (ctx.pair() == null) {
            ForEachNode forNode;
            String iterator = ctx.NG_ID(0).getText();
            Expression list = (Expression) visit(ctx.expression(0));
            if (list instanceof Iterable && (ctx.SEMI_COLON() == null && ctx.EQUAL_SIGN() == null))
                return new ForEachNode(iterator, list);
            if (ctx.SEMI_COLON() != null && ctx.EQUAL_SIGN() != null) {
                String index = ctx.NG_ID(1).getText();
                Expression indexValue = (Expression) visit(ctx.expression(1));
                if (list instanceof Iterable && indexValue instanceof Numeric)
                {
                    forNode = new ForEachNode(iterator, list);
                    forNode.setIndex(index);
                    forNode.setIndexValue(indexValue);
                    return forNode;
                }
            }
            throw new RuntimeException("Invalid for body");
        } else {
            IteratorPairNode pair = (IteratorPairNode) visitPair(ctx.pair());
            Expression map = (Expression) visit(ctx.expression(0));
            if (map instanceof Iterable)
                return new Map(pair, map);
            throw new RuntimeException("Invalid map");
        }
    }

    @Override
    public AbstractNode visitPair(HTMLParser.PairContext ctx) {
        System.out.println("in pair visitor");
        return new IteratorPairNode(ctx.NG_ID(0).getText(), ctx.NG_ID(1).getText());
    }

    @Override
    public AbstractNode visitScript(HTMLParser.ScriptContext ctx) {
        System.out.println("in script visitor");
        if(ctx.SCRIPT_BODY()!=null) {
            String scriptWithEndTag=ctx.SCRIPT_BODY().getText();
            return new HTMLScript(scriptWithEndTag.substring(0,scriptWithEndTag.length()-9));
        }
        else {
            String scriptWithEndTag=ctx.SCRIPT_SHORT_BODY().getText();
            return new HTMLScript(scriptWithEndTag.substring(0,scriptWithEndTag.length()-3));
        }
    }

    @Override
    public AbstractNode visitStyle(HTMLParser.StyleContext ctx) {
        System.out.println("in style visitor");
        if(ctx.STYLE_BODY()!=null) {
            String styleWithEndTag=ctx.STYLE_BODY().getText();
            return new HTMLStyle(styleWithEndTag.substring(0,styleWithEndTag.length()-8 ));
        }
        else {
            String styleWithEndTag=ctx.STYLE_SHORT_BODY().getText();
            return new HTMLStyle(styleWithEndTag.substring(0, styleWithEndTag.length() - 3));
        }
    }
    private boolean testName(String openTag, String closeTag) {
        return openTag.compareToIgnoreCase(closeTag) == 0;
    }
}
