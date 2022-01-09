// Generated from C:/Users/ASUS/Desktop/compiler_test/grammers\HTMLParser.g4 by ANTLR 4.9.2
package generated;
import org.antlr.v4.runtime.tree.ParseTreeListener;

/**
 * This interface defines a complete listener for a parse tree produced by
 * {@link HTMLParser}.
 */
public interface HTMLParserListener extends ParseTreeListener {
	/**
	 * Enter a parse tree produced by {@link HTMLParser#htmlDocument}.
	 * @param ctx the parse tree
	 */
	void enterHtmlDocument(HTMLParser.HtmlDocumentContext ctx);
	/**
	 * Exit a parse tree produced by {@link HTMLParser#htmlDocument}.
	 * @param ctx the parse tree
	 */
	void exitHtmlDocument(HTMLParser.HtmlDocumentContext ctx);
	/**
	 * Enter a parse tree produced by {@link HTMLParser#scriptletOrSeaWs}.
	 * @param ctx the parse tree
	 */
	void enterScriptletOrSeaWs(HTMLParser.ScriptletOrSeaWsContext ctx);
	/**
	 * Exit a parse tree produced by {@link HTMLParser#scriptletOrSeaWs}.
	 * @param ctx the parse tree
	 */
	void exitScriptletOrSeaWs(HTMLParser.ScriptletOrSeaWsContext ctx);
	/**
	 * Enter a parse tree produced by {@link HTMLParser#htmlElements}.
	 * @param ctx the parse tree
	 */
	void enterHtmlElements(HTMLParser.HtmlElementsContext ctx);
	/**
	 * Exit a parse tree produced by {@link HTMLParser#htmlElements}.
	 * @param ctx the parse tree
	 */
	void exitHtmlElements(HTMLParser.HtmlElementsContext ctx);
	/**
	 * Enter a parse tree produced by {@link HTMLParser#htmlElement}.
	 * @param ctx the parse tree
	 */
	void enterHtmlElement(HTMLParser.HtmlElementContext ctx);
	/**
	 * Exit a parse tree produced by {@link HTMLParser#htmlElement}.
	 * @param ctx the parse tree
	 */
	void exitHtmlElement(HTMLParser.HtmlElementContext ctx);
	/**
	 * Enter a parse tree produced by {@link HTMLParser#htmlContent}.
	 * @param ctx the parse tree
	 */
	void enterHtmlContent(HTMLParser.HtmlContentContext ctx);
	/**
	 * Exit a parse tree produced by {@link HTMLParser#htmlContent}.
	 * @param ctx the parse tree
	 */
	void exitHtmlContent(HTMLParser.HtmlContentContext ctx);
	/**
	 * Enter a parse tree produced by {@link HTMLParser#mustache}.
	 * @param ctx the parse tree
	 */
	void enterMustache(HTMLParser.MustacheContext ctx);
	/**
	 * Exit a parse tree produced by {@link HTMLParser#mustache}.
	 * @param ctx the parse tree
	 */
	void exitMustache(HTMLParser.MustacheContext ctx);
	/**
	 * Enter a parse tree produced by {@link HTMLParser#htmlAttribute}.
	 * @param ctx the parse tree
	 */
	void enterHtmlAttribute(HTMLParser.HtmlAttributeContext ctx);
	/**
	 * Exit a parse tree produced by {@link HTMLParser#htmlAttribute}.
	 * @param ctx the parse tree
	 */
	void exitHtmlAttribute(HTMLParser.HtmlAttributeContext ctx);
	/**
	 * Enter a parse tree produced by the {@code ParenthesizedExpression}
	 * labeled alternative in {@link HTMLParser#expression}.
	 * @param ctx the parse tree
	 */
	void enterParenthesizedExpression(HTMLParser.ParenthesizedExpressionContext ctx);
	/**
	 * Exit a parse tree produced by the {@code ParenthesizedExpression}
	 * labeled alternative in {@link HTMLParser#expression}.
	 * @param ctx the parse tree
	 */
	void exitParenthesizedExpression(HTMLParser.ParenthesizedExpressionContext ctx);
	/**
	 * Enter a parse tree produced by the {@code LiteralArrayExpression}
	 * labeled alternative in {@link HTMLParser#expression}.
	 * @param ctx the parse tree
	 */
	void enterLiteralArrayExpression(HTMLParser.LiteralArrayExpressionContext ctx);
	/**
	 * Exit a parse tree produced by the {@code LiteralArrayExpression}
	 * labeled alternative in {@link HTMLParser#expression}.
	 * @param ctx the parse tree
	 */
	void exitLiteralArrayExpression(HTMLParser.LiteralArrayExpressionContext ctx);
	/**
	 * Enter a parse tree produced by the {@code TernaryExpression}
	 * labeled alternative in {@link HTMLParser#expression}.
	 * @param ctx the parse tree
	 */
	void enterTernaryExpression(HTMLParser.TernaryExpressionContext ctx);
	/**
	 * Exit a parse tree produced by the {@code TernaryExpression}
	 * labeled alternative in {@link HTMLParser#expression}.
	 * @param ctx the parse tree
	 */
	void exitTernaryExpression(HTMLParser.TernaryExpressionContext ctx);
	/**
	 * Enter a parse tree produced by the {@code TwoOperandsConditionExpression}
	 * labeled alternative in {@link HTMLParser#expression}.
	 * @param ctx the parse tree
	 */
	void enterTwoOperandsConditionExpression(HTMLParser.TwoOperandsConditionExpressionContext ctx);
	/**
	 * Exit a parse tree produced by the {@code TwoOperandsConditionExpression}
	 * labeled alternative in {@link HTMLParser#expression}.
	 * @param ctx the parse tree
	 */
	void exitTwoOperandsConditionExpression(HTMLParser.TwoOperandsConditionExpressionContext ctx);
	/**
	 * Enter a parse tree produced by the {@code MathematicalExpression}
	 * labeled alternative in {@link HTMLParser#expression}.
	 * @param ctx the parse tree
	 */
	void enterMathematicalExpression(HTMLParser.MathematicalExpressionContext ctx);
	/**
	 * Exit a parse tree produced by the {@code MathematicalExpression}
	 * labeled alternative in {@link HTMLParser#expression}.
	 * @param ctx the parse tree
	 */
	void exitMathematicalExpression(HTMLParser.MathematicalExpressionContext ctx);
	/**
	 * Enter a parse tree produced by the {@code IndexedVariableExpression}
	 * labeled alternative in {@link HTMLParser#expression}.
	 * @param ctx the parse tree
	 */
	void enterIndexedVariableExpression(HTMLParser.IndexedVariableExpressionContext ctx);
	/**
	 * Exit a parse tree produced by the {@code IndexedVariableExpression}
	 * labeled alternative in {@link HTMLParser#expression}.
	 * @param ctx the parse tree
	 */
	void exitIndexedVariableExpression(HTMLParser.IndexedVariableExpressionContext ctx);
	/**
	 * Enter a parse tree produced by the {@code PipeExpression}
	 * labeled alternative in {@link HTMLParser#expression}.
	 * @param ctx the parse tree
	 */
	void enterPipeExpression(HTMLParser.PipeExpressionContext ctx);
	/**
	 * Exit a parse tree produced by the {@code PipeExpression}
	 * labeled alternative in {@link HTMLParser#expression}.
	 * @param ctx the parse tree
	 */
	void exitPipeExpression(HTMLParser.PipeExpressionContext ctx);
	/**
	 * Enter a parse tree produced by the {@code LiteralBooleanExpression}
	 * labeled alternative in {@link HTMLParser#expression}.
	 * @param ctx the parse tree
	 */
	void enterLiteralBooleanExpression(HTMLParser.LiteralBooleanExpressionContext ctx);
	/**
	 * Exit a parse tree produced by the {@code LiteralBooleanExpression}
	 * labeled alternative in {@link HTMLParser#expression}.
	 * @param ctx the parse tree
	 */
	void exitLiteralBooleanExpression(HTMLParser.LiteralBooleanExpressionContext ctx);
	/**
	 * Enter a parse tree produced by the {@code OneOperandConditionExpression}
	 * labeled alternative in {@link HTMLParser#expression}.
	 * @param ctx the parse tree
	 */
	void enterOneOperandConditionExpression(HTMLParser.OneOperandConditionExpressionContext ctx);
	/**
	 * Exit a parse tree produced by the {@code OneOperandConditionExpression}
	 * labeled alternative in {@link HTMLParser#expression}.
	 * @param ctx the parse tree
	 */
	void exitOneOperandConditionExpression(HTMLParser.OneOperandConditionExpressionContext ctx);
	/**
	 * Enter a parse tree produced by the {@code LiteralNumericExpression}
	 * labeled alternative in {@link HTMLParser#expression}.
	 * @param ctx the parse tree
	 */
	void enterLiteralNumericExpression(HTMLParser.LiteralNumericExpressionContext ctx);
	/**
	 * Exit a parse tree produced by the {@code LiteralNumericExpression}
	 * labeled alternative in {@link HTMLParser#expression}.
	 * @param ctx the parse tree
	 */
	void exitLiteralNumericExpression(HTMLParser.LiteralNumericExpressionContext ctx);
	/**
	 * Enter a parse tree produced by the {@code FunctionCallExpression}
	 * labeled alternative in {@link HTMLParser#expression}.
	 * @param ctx the parse tree
	 */
	void enterFunctionCallExpression(HTMLParser.FunctionCallExpressionContext ctx);
	/**
	 * Exit a parse tree produced by the {@code FunctionCallExpression}
	 * labeled alternative in {@link HTMLParser#expression}.
	 * @param ctx the parse tree
	 */
	void exitFunctionCallExpression(HTMLParser.FunctionCallExpressionContext ctx);
	/**
	 * Enter a parse tree produced by the {@code LiteralObjectExpression}
	 * labeled alternative in {@link HTMLParser#expression}.
	 * @param ctx the parse tree
	 */
	void enterLiteralObjectExpression(HTMLParser.LiteralObjectExpressionContext ctx);
	/**
	 * Exit a parse tree produced by the {@code LiteralObjectExpression}
	 * labeled alternative in {@link HTMLParser#expression}.
	 * @param ctx the parse tree
	 */
	void exitLiteralObjectExpression(HTMLParser.LiteralObjectExpressionContext ctx);
	/**
	 * Enter a parse tree produced by the {@code LiteralStringExpression}
	 * labeled alternative in {@link HTMLParser#expression}.
	 * @param ctx the parse tree
	 */
	void enterLiteralStringExpression(HTMLParser.LiteralStringExpressionContext ctx);
	/**
	 * Exit a parse tree produced by the {@code LiteralStringExpression}
	 * labeled alternative in {@link HTMLParser#expression}.
	 * @param ctx the parse tree
	 */
	void exitLiteralStringExpression(HTMLParser.LiteralStringExpressionContext ctx);
	/**
	 * Enter a parse tree produced by the {@code VariableConcatExpression}
	 * labeled alternative in {@link HTMLParser#expression}.
	 * @param ctx the parse tree
	 */
	void enterVariableConcatExpression(HTMLParser.VariableConcatExpressionContext ctx);
	/**
	 * Exit a parse tree produced by the {@code VariableConcatExpression}
	 * labeled alternative in {@link HTMLParser#expression}.
	 * @param ctx the parse tree
	 */
	void exitVariableConcatExpression(HTMLParser.VariableConcatExpressionContext ctx);
	/**
	 * Enter a parse tree produced by the {@code ConcatConditionExpression}
	 * labeled alternative in {@link HTMLParser#expression}.
	 * @param ctx the parse tree
	 */
	void enterConcatConditionExpression(HTMLParser.ConcatConditionExpressionContext ctx);
	/**
	 * Exit a parse tree produced by the {@code ConcatConditionExpression}
	 * labeled alternative in {@link HTMLParser#expression}.
	 * @param ctx the parse tree
	 */
	void exitConcatConditionExpression(HTMLParser.ConcatConditionExpressionContext ctx);
	/**
	 * Enter a parse tree produced by the {@code OneOperandValuableExpression}
	 * labeled alternative in {@link HTMLParser#expression}.
	 * @param ctx the parse tree
	 */
	void enterOneOperandValuableExpression(HTMLParser.OneOperandValuableExpressionContext ctx);
	/**
	 * Exit a parse tree produced by the {@code OneOperandValuableExpression}
	 * labeled alternative in {@link HTMLParser#expression}.
	 * @param ctx the parse tree
	 */
	void exitOneOperandValuableExpression(HTMLParser.OneOperandValuableExpressionContext ctx);
	/**
	 * Enter a parse tree produced by the {@code VariableNameExpression}
	 * labeled alternative in {@link HTMLParser#expression}.
	 * @param ctx the parse tree
	 */
	void enterVariableNameExpression(HTMLParser.VariableNameExpressionContext ctx);
	/**
	 * Exit a parse tree produced by the {@code VariableNameExpression}
	 * labeled alternative in {@link HTMLParser#expression}.
	 * @param ctx the parse tree
	 */
	void exitVariableNameExpression(HTMLParser.VariableNameExpressionContext ctx);
	/**
	 * Enter a parse tree produced by the {@code LiteralCharExpression}
	 * labeled alternative in {@link HTMLParser#expression}.
	 * @param ctx the parse tree
	 */
	void enterLiteralCharExpression(HTMLParser.LiteralCharExpressionContext ctx);
	/**
	 * Exit a parse tree produced by the {@code LiteralCharExpression}
	 * labeled alternative in {@link HTMLParser#expression}.
	 * @param ctx the parse tree
	 */
	void exitLiteralCharExpression(HTMLParser.LiteralCharExpressionContext ctx);
	/**
	 * Enter a parse tree produced by {@link HTMLParser#ng_app}.
	 * @param ctx the parse tree
	 */
	void enterNg_app(HTMLParser.Ng_appContext ctx);
	/**
	 * Exit a parse tree produced by {@link HTMLParser#ng_app}.
	 * @param ctx the parse tree
	 */
	void exitNg_app(HTMLParser.Ng_appContext ctx);
	/**
	 * Enter a parse tree produced by {@link HTMLParser#ng_for}.
	 * @param ctx the parse tree
	 */
	void enterNg_for(HTMLParser.Ng_forContext ctx);
	/**
	 * Exit a parse tree produced by {@link HTMLParser#ng_for}.
	 * @param ctx the parse tree
	 */
	void exitNg_for(HTMLParser.Ng_forContext ctx);
	/**
	 * Enter a parse tree produced by {@link HTMLParser#ng_switch}.
	 * @param ctx the parse tree
	 */
	void enterNg_switch(HTMLParser.Ng_switchContext ctx);
	/**
	 * Exit a parse tree produced by {@link HTMLParser#ng_switch}.
	 * @param ctx the parse tree
	 */
	void exitNg_switch(HTMLParser.Ng_switchContext ctx);
	/**
	 * Enter a parse tree produced by {@link HTMLParser#ng_if}.
	 * @param ctx the parse tree
	 */
	void enterNg_if(HTMLParser.Ng_ifContext ctx);
	/**
	 * Exit a parse tree produced by {@link HTMLParser#ng_if}.
	 * @param ctx the parse tree
	 */
	void exitNg_if(HTMLParser.Ng_ifContext ctx);
	/**
	 * Enter a parse tree produced by {@link HTMLParser#ng_hide}.
	 * @param ctx the parse tree
	 */
	void enterNg_hide(HTMLParser.Ng_hideContext ctx);
	/**
	 * Exit a parse tree produced by {@link HTMLParser#ng_hide}.
	 * @param ctx the parse tree
	 */
	void exitNg_hide(HTMLParser.Ng_hideContext ctx);
	/**
	 * Enter a parse tree produced by {@link HTMLParser#ng_show}.
	 * @param ctx the parse tree
	 */
	void enterNg_show(HTMLParser.Ng_showContext ctx);
	/**
	 * Exit a parse tree produced by {@link HTMLParser#ng_show}.
	 * @param ctx the parse tree
	 */
	void exitNg_show(HTMLParser.Ng_showContext ctx);
	/**
	 * Enter a parse tree produced by {@link HTMLParser#ng_switch_case}.
	 * @param ctx the parse tree
	 */
	void enterNg_switch_case(HTMLParser.Ng_switch_caseContext ctx);
	/**
	 * Exit a parse tree produced by {@link HTMLParser#ng_switch_case}.
	 * @param ctx the parse tree
	 */
	void exitNg_switch_case(HTMLParser.Ng_switch_caseContext ctx);
	/**
	 * Enter a parse tree produced by {@link HTMLParser#ng_switch_default}.
	 * @param ctx the parse tree
	 */
	void enterNg_switch_default(HTMLParser.Ng_switch_defaultContext ctx);
	/**
	 * Exit a parse tree produced by {@link HTMLParser#ng_switch_default}.
	 * @param ctx the parse tree
	 */
	void exitNg_switch_default(HTMLParser.Ng_switch_defaultContext ctx);
	/**
	 * Enter a parse tree produced by {@link HTMLParser#switch_body}.
	 * @param ctx the parse tree
	 */
	void enterSwitch_body(HTMLParser.Switch_bodyContext ctx);
	/**
	 * Exit a parse tree produced by {@link HTMLParser#switch_body}.
	 * @param ctx the parse tree
	 */
	void exitSwitch_body(HTMLParser.Switch_bodyContext ctx);
	/**
	 * Enter a parse tree produced by {@link HTMLParser#switch_case_body}.
	 * @param ctx the parse tree
	 */
	void enterSwitch_case_body(HTMLParser.Switch_case_bodyContext ctx);
	/**
	 * Exit a parse tree produced by {@link HTMLParser#switch_case_body}.
	 * @param ctx the parse tree
	 */
	void exitSwitch_case_body(HTMLParser.Switch_case_bodyContext ctx);
	/**
	 * Enter a parse tree produced by {@link HTMLParser#ng_type}.
	 * @param ctx the parse tree
	 */
	void enterNg_type(HTMLParser.Ng_typeContext ctx);
	/**
	 * Exit a parse tree produced by {@link HTMLParser#ng_type}.
	 * @param ctx the parse tree
	 */
	void exitNg_type(HTMLParser.Ng_typeContext ctx);
	/**
	 * Enter a parse tree produced by {@link HTMLParser#ng_model}.
	 * @param ctx the parse tree
	 */
	void enterNg_model(HTMLParser.Ng_modelContext ctx);
	/**
	 * Exit a parse tree produced by {@link HTMLParser#ng_model}.
	 * @param ctx the parse tree
	 */
	void exitNg_model(HTMLParser.Ng_modelContext ctx);
	/**
	 * Enter a parse tree produced by {@link HTMLParser#ng_event}.
	 * @param ctx the parse tree
	 */
	void enterNg_event(HTMLParser.Ng_eventContext ctx);
	/**
	 * Exit a parse tree produced by {@link HTMLParser#ng_event}.
	 * @param ctx the parse tree
	 */
	void exitNg_event(HTMLParser.Ng_eventContext ctx);
	/**
	 * Enter a parse tree produced by {@link HTMLParser#params}.
	 * @param ctx the parse tree
	 */
	void enterParams(HTMLParser.ParamsContext ctx);
	/**
	 * Exit a parse tree produced by {@link HTMLParser#params}.
	 * @param ctx the parse tree
	 */
	void exitParams(HTMLParser.ParamsContext ctx);
	/**
	 * Enter a parse tree produced by {@link HTMLParser#ng_list}.
	 * @param ctx the parse tree
	 */
	void enterNg_list(HTMLParser.Ng_listContext ctx);
	/**
	 * Exit a parse tree produced by {@link HTMLParser#ng_list}.
	 * @param ctx the parse tree
	 */
	void exitNg_list(HTMLParser.Ng_listContext ctx);
	/**
	 * Enter a parse tree produced by {@link HTMLParser#map_value}.
	 * @param ctx the parse tree
	 */
	void enterMap_value(HTMLParser.Map_valueContext ctx);
	/**
	 * Exit a parse tree produced by {@link HTMLParser#map_value}.
	 * @param ctx the parse tree
	 */
	void exitMap_value(HTMLParser.Map_valueContext ctx);
	/**
	 * Enter a parse tree produced by {@link HTMLParser#map}.
	 * @param ctx the parse tree
	 */
	void enterMap(HTMLParser.MapContext ctx);
	/**
	 * Exit a parse tree produced by {@link HTMLParser#map}.
	 * @param ctx the parse tree
	 */
	void exitMap(HTMLParser.MapContext ctx);
	/**
	 * Enter a parse tree produced by {@link HTMLParser#ngfor_body}.
	 * @param ctx the parse tree
	 */
	void enterNgfor_body(HTMLParser.Ngfor_bodyContext ctx);
	/**
	 * Exit a parse tree produced by {@link HTMLParser#ngfor_body}.
	 * @param ctx the parse tree
	 */
	void exitNgfor_body(HTMLParser.Ngfor_bodyContext ctx);
	/**
	 * Enter a parse tree produced by {@link HTMLParser#pair}.
	 * @param ctx the parse tree
	 */
	void enterPair(HTMLParser.PairContext ctx);
	/**
	 * Exit a parse tree produced by {@link HTMLParser#pair}.
	 * @param ctx the parse tree
	 */
	void exitPair(HTMLParser.PairContext ctx);
	/**
	 * Enter a parse tree produced by {@link HTMLParser#htmlChardata}.
	 * @param ctx the parse tree
	 */
	void enterHtmlChardata(HTMLParser.HtmlChardataContext ctx);
	/**
	 * Exit a parse tree produced by {@link HTMLParser#htmlChardata}.
	 * @param ctx the parse tree
	 */
	void exitHtmlChardata(HTMLParser.HtmlChardataContext ctx);
	/**
	 * Enter a parse tree produced by {@link HTMLParser#htmlMisc}.
	 * @param ctx the parse tree
	 */
	void enterHtmlMisc(HTMLParser.HtmlMiscContext ctx);
	/**
	 * Exit a parse tree produced by {@link HTMLParser#htmlMisc}.
	 * @param ctx the parse tree
	 */
	void exitHtmlMisc(HTMLParser.HtmlMiscContext ctx);
	/**
	 * Enter a parse tree produced by {@link HTMLParser#htmlComment}.
	 * @param ctx the parse tree
	 */
	void enterHtmlComment(HTMLParser.HtmlCommentContext ctx);
	/**
	 * Exit a parse tree produced by {@link HTMLParser#htmlComment}.
	 * @param ctx the parse tree
	 */
	void exitHtmlComment(HTMLParser.HtmlCommentContext ctx);
	/**
	 * Enter a parse tree produced by {@link HTMLParser#script}.
	 * @param ctx the parse tree
	 */
	void enterScript(HTMLParser.ScriptContext ctx);
	/**
	 * Exit a parse tree produced by {@link HTMLParser#script}.
	 * @param ctx the parse tree
	 */
	void exitScript(HTMLParser.ScriptContext ctx);
	/**
	 * Enter a parse tree produced by {@link HTMLParser#style}.
	 * @param ctx the parse tree
	 */
	void enterStyle(HTMLParser.StyleContext ctx);
	/**
	 * Exit a parse tree produced by {@link HTMLParser#style}.
	 * @param ctx the parse tree
	 */
	void exitStyle(HTMLParser.StyleContext ctx);
}