package ast.visitors;

import ast.nodes.AbstractNode;
import ast.nodes.attributes.*;
import ast.nodes.expressions.Expression;
import ast.nodes.expressions.literals.*;
import ast.nodes.htmlNodes.*;
import generated.HTMLParser;
import generated.HTMLParserBaseVisitor;

import java.util.ArrayList;

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
    public AbstractNode visitScriptletOrSeaWs(HTMLParser.ScriptletOrSeaWsContext ctx) {
        return super.visitScriptletOrSeaWs(ctx);
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
            element.setTagName(ctx.TAG_NAME(0).getText());
            element.setContent((HTMLContent) visit(ctx.htmlContent()));
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
        //TODO process expressions
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
        else if(ctx.ng_if()!=null)
            return visit(ctx.ng_if());
        else if(ctx.ng_hide()!=null)
            return visit(ctx.ng_hide());
        else if(ctx.ng_show()!=null)
            return visit(ctx.ng_show());
        else if(ctx.ng_event()!=null)
            return visit(ctx.ng_event());
        else return null;//TODO implement the rest
    }

    @Override
    public AbstractNode visitParenthesizedExpression(HTMLParser.ParenthesizedExpressionContext ctx) {
        return super.visitParenthesizedExpression(ctx);
    }

    @Override
    public AbstractNode visitLiteralArrayExpression(HTMLParser.LiteralArrayExpressionContext ctx) {
        return super.visitLiteralArrayExpression(ctx);
    }

    @Override
    public AbstractNode visitTernaryExpression(HTMLParser.TernaryExpressionContext ctx) {
        return super.visitTernaryExpression(ctx);
    }

    @Override
    public AbstractNode visitTwoOperandsConditionExpression(HTMLParser.TwoOperandsConditionExpressionContext ctx) {
        return super.visitTwoOperandsConditionExpression(ctx);
    }

    @Override
    public AbstractNode visitMathematicalExpression(HTMLParser.MathematicalExpressionContext ctx) {
        return super.visitMathematicalExpression(ctx);
    }

    @Override
    public AbstractNode visitIndexedVariableExpression(HTMLParser.IndexedVariableExpressionContext ctx) {
        return super.visitIndexedVariableExpression(ctx);
    }

    @Override
    public AbstractNode visitPipeExpression(HTMLParser.PipeExpressionContext ctx) {
        return super.visitPipeExpression(ctx);
    }

    @Override
    public BooleanNode visitLiteralBooleanExpression(HTMLParser.LiteralBooleanExpressionContext ctx) {
        return new BooleanNode(Boolean.parseBoolean(ctx.NG_BOOLEAN().getText()));
    }

    @Override
    public AbstractNode visitOneOperandConditionExpression(HTMLParser.OneOperandConditionExpressionContext ctx) {
        return super.visitOneOperandConditionExpression(ctx);
    }
    @Override
    public AbstractNode visitOneOperandValuableExpression(HTMLParser.OneOperandValuableExpressionContext ctx) {
        return super.visitOneOperandValuableExpression(ctx);
    }

    @Override
    public DecimalNode visitLiteralNumericExpression(HTMLParser.LiteralNumericExpressionContext ctx) {
        return new DecimalNode(Double.parseDouble(ctx.NG_DECIMAL().getText()));
    }

    @Override
    public AbstractNode visitFunctionCallExpression(HTMLParser.FunctionCallExpressionContext ctx) {
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
        MapNode map=(MapNode) visit(ctx.map());
        return map;
    }

    @Override
    public AbstractNode visitLiteralStringExpression(HTMLParser.LiteralStringExpressionContext ctx) {
        String fullText=ctx.NG_STRING().getText();
        System.out.println(fullText);
        return new StringNode(fullText.substring(1,fullText.length()-1));
    }

    @Override
    public AbstractNode visitVariableConcatExpression(HTMLParser.VariableConcatExpressionContext ctx) {
        return super.visitVariableConcatExpression(ctx);
    }

    @Override
    public AbstractNode visitConcatConditionExpression(HTMLParser.ConcatConditionExpressionContext ctx) {
        return super.visitConcatConditionExpression(ctx);
    }

    @Override
    public VariableNode visitVariableNameExpression(HTMLParser.VariableNameExpressionContext ctx) {
        return new VariableNode(ctx.NG_ID().getText());
    }

    @Override
    public CharNode visitLiteralCharExpression(HTMLParser.LiteralCharExpressionContext ctx) {
        return new CharNode(ctx.NG_CHAR().getText().charAt(1));
    }

    @Override
    public AbstractNode visitNg_app(HTMLParser.Ng_appContext ctx) {
        return super.visitNg_app(ctx);
    }

    @Override
    public AbstractNode visitNg_for(HTMLParser.Ng_forContext ctx) {
        return super.visitNg_for(ctx);
    }

    @Override
    public AbstractNode visitNg_switch(HTMLParser.Ng_switchContext ctx) {
        return super.visitNg_switch(ctx);
    }

    @Override
    public NGIfAttribute visitNg_if(HTMLParser.Ng_ifContext ctx) {
        Expression condition=(Expression) visit(ctx.expression());
        return new NGIfAttribute(condition);
    }

    @Override
    public NGHideAttribute visitNg_hide(HTMLParser.Ng_hideContext ctx) {
        Expression condition=(Expression) visit(ctx.expression());
        return new NGHideAttribute(condition);
    }

    @Override
    public NGShowAttribute visitNg_show(HTMLParser.Ng_showContext ctx) {
        Expression condition=(Expression) visit(ctx.expression());
        return new NGShowAttribute(condition);
    }

    @Override
    public AbstractNode visitNg_switch_case(HTMLParser.Ng_switch_caseContext ctx) {
        return super.visitNg_switch_case(ctx);
    }

    @Override
    public AbstractNode visitNg_switch_default(HTMLParser.Ng_switch_defaultContext ctx) {
        return super.visitNg_switch_default(ctx);
    }

    @Override
    public AbstractNode visitSwitch_body(HTMLParser.Switch_bodyContext ctx) {
        return super.visitSwitch_body(ctx);
    }

    @Override
    public AbstractNode visitSwitch_case_body(HTMLParser.Switch_case_bodyContext ctx) {
        return super.visitSwitch_case_body(ctx);
    }

    @Override
    public AbstractNode visitNg_type(HTMLParser.Ng_typeContext ctx) {
        return super.visitNg_type(ctx);
    }

    @Override
    public AbstractNode visitNg_model(HTMLParser.Ng_modelContext ctx) {
        return super.visitNg_model(ctx);
    }

    @Override
    public NGEventAttribute visitNg_event(HTMLParser.Ng_eventContext ctx) {
        Expression functionCall=(Expression)visit(ctx.expression());
        return new NGEventAttribute(functionCall);
    }

    @Override
    public AbstractNode visitParams(HTMLParser.ParamsContext ctx) {
        return super.visitParams(ctx);
    }

    @Override
    public ListNode visitNg_list(HTMLParser.Ng_listContext ctx) {
        ArrayList<Expression> elements=new ArrayList<>();
        for (int i = 0; i <ctx.expression().size() ; i++) {
            elements.add((Expression) visit(ctx.expression(i)));
        }
        return new ListNode(elements);
    }

    @Override
    public MapPairNode visitMap_value(HTMLParser.Map_valueContext ctx) {
        MapPairNode keyValue= new MapPairNode();
        keyValue.setKey(ctx.NG_ID().getText());
        keyValue.setValue((Expression) visit(ctx.expression()));
        return keyValue;
    }

    @Override
    public MapNode visitMap(HTMLParser.MapContext ctx) {
        ArrayList<MapPairNode> pairNodes=new ArrayList<>();
        for (int i = 0; i <ctx.map_value().size() ; i++) {
            pairNodes.add((MapPairNode) visit(ctx.map_value(i)));
        }
        return new MapNode(pairNodes);
    }

    @Override
    public AbstractNode visitNgfor_body(HTMLParser.Ngfor_bodyContext ctx) {
        return super.visitNgfor_body(ctx);
    }

    @Override
    public AbstractNode visitPair(HTMLParser.PairContext ctx) {
        return super.visitPair(ctx);
    }


    @Override
    public AbstractNode visitHtmlMisc(HTMLParser.HtmlMiscContext ctx) {
        return super.visitHtmlMisc(ctx);
    }

    @Override
    public AbstractNode visitHtmlComment(HTMLParser.HtmlCommentContext ctx) {
        return super.visitHtmlComment(ctx);
    }

    @Override
    public AbstractNode visitScript(HTMLParser.ScriptContext ctx) {
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
        if(ctx.STYLE_BODY()!=null) {
            String styleWithEndTag=ctx.STYLE_BODY().getText();
            return new HTMLStyle(styleWithEndTag.substring(0,styleWithEndTag.length()-8 ));
        }
        else {
            String styleWithEndTag=ctx.STYLE_SHORT_BODY().getText();
            return new HTMLStyle(styleWithEndTag.substring(0, styleWithEndTag.length() - 3));
        }
    }
}
