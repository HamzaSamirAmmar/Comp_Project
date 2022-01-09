// Generated from C:/Users/ASUS/Desktop/compiler_test/grammers\HTMLParser.g4 by ANTLR 4.9.2
package generated;
import org.antlr.v4.runtime.tree.ParseTreeVisitor;

/**
 * This interface defines a complete generic visitor for a parse tree produced
 * by {@link HTMLParser}.
 *
 * @param <T> The return type of the visit operation. Use {@link Void} for
 * operations with no return type.
 */
public interface HTMLParserVisitor<T> extends ParseTreeVisitor<T> {
	/**
	 * Visit a parse tree produced by {@link HTMLParser#htmlDocument}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitHtmlDocument(HTMLParser.HtmlDocumentContext ctx);
	/**
	 * Visit a parse tree produced by {@link HTMLParser#scriptletOrSeaWs}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitScriptletOrSeaWs(HTMLParser.ScriptletOrSeaWsContext ctx);
	/**
	 * Visit a parse tree produced by {@link HTMLParser#htmlElements}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitHtmlElements(HTMLParser.HtmlElementsContext ctx);
	/**
	 * Visit a parse tree produced by {@link HTMLParser#htmlElement}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitHtmlElement(HTMLParser.HtmlElementContext ctx);
	/**
	 * Visit a parse tree produced by {@link HTMLParser#htmlContent}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitHtmlContent(HTMLParser.HtmlContentContext ctx);
	/**
	 * Visit a parse tree produced by {@link HTMLParser#mustache}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitMustache(HTMLParser.MustacheContext ctx);
	/**
	 * Visit a parse tree produced by {@link HTMLParser#htmlAttribute}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitHtmlAttribute(HTMLParser.HtmlAttributeContext ctx);
	/**
	 * Visit a parse tree produced by the {@code ParenthesizedExpression}
	 * labeled alternative in {@link HTMLParser#expression}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitParenthesizedExpression(HTMLParser.ParenthesizedExpressionContext ctx);
	/**
	 * Visit a parse tree produced by the {@code LiteralArrayExpression}
	 * labeled alternative in {@link HTMLParser#expression}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitLiteralArrayExpression(HTMLParser.LiteralArrayExpressionContext ctx);
	/**
	 * Visit a parse tree produced by the {@code TernaryExpression}
	 * labeled alternative in {@link HTMLParser#expression}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitTernaryExpression(HTMLParser.TernaryExpressionContext ctx);
	/**
	 * Visit a parse tree produced by the {@code TwoOperandsConditionExpression}
	 * labeled alternative in {@link HTMLParser#expression}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitTwoOperandsConditionExpression(HTMLParser.TwoOperandsConditionExpressionContext ctx);
	/**
	 * Visit a parse tree produced by the {@code MathematicalExpression}
	 * labeled alternative in {@link HTMLParser#expression}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitMathematicalExpression(HTMLParser.MathematicalExpressionContext ctx);
	/**
	 * Visit a parse tree produced by the {@code IndexedVariableExpression}
	 * labeled alternative in {@link HTMLParser#expression}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitIndexedVariableExpression(HTMLParser.IndexedVariableExpressionContext ctx);
	/**
	 * Visit a parse tree produced by the {@code PipeExpression}
	 * labeled alternative in {@link HTMLParser#expression}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitPipeExpression(HTMLParser.PipeExpressionContext ctx);
	/**
	 * Visit a parse tree produced by the {@code LiteralBooleanExpression}
	 * labeled alternative in {@link HTMLParser#expression}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitLiteralBooleanExpression(HTMLParser.LiteralBooleanExpressionContext ctx);
	/**
	 * Visit a parse tree produced by the {@code OneOperandConditionExpression}
	 * labeled alternative in {@link HTMLParser#expression}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitOneOperandConditionExpression(HTMLParser.OneOperandConditionExpressionContext ctx);
	/**
	 * Visit a parse tree produced by the {@code LiteralNumericExpression}
	 * labeled alternative in {@link HTMLParser#expression}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitLiteralNumericExpression(HTMLParser.LiteralNumericExpressionContext ctx);
	/**
	 * Visit a parse tree produced by the {@code FunctionCallExpression}
	 * labeled alternative in {@link HTMLParser#expression}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitFunctionCallExpression(HTMLParser.FunctionCallExpressionContext ctx);
	/**
	 * Visit a parse tree produced by the {@code LiteralObjectExpression}
	 * labeled alternative in {@link HTMLParser#expression}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitLiteralObjectExpression(HTMLParser.LiteralObjectExpressionContext ctx);
	/**
	 * Visit a parse tree produced by the {@code LiteralStringExpression}
	 * labeled alternative in {@link HTMLParser#expression}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitLiteralStringExpression(HTMLParser.LiteralStringExpressionContext ctx);
	/**
	 * Visit a parse tree produced by the {@code VariableConcatExpression}
	 * labeled alternative in {@link HTMLParser#expression}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitVariableConcatExpression(HTMLParser.VariableConcatExpressionContext ctx);
	/**
	 * Visit a parse tree produced by the {@code ConcatConditionExpression}
	 * labeled alternative in {@link HTMLParser#expression}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitConcatConditionExpression(HTMLParser.ConcatConditionExpressionContext ctx);
	/**
	 * Visit a parse tree produced by the {@code OneOperandValuableExpression}
	 * labeled alternative in {@link HTMLParser#expression}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitOneOperandValuableExpression(HTMLParser.OneOperandValuableExpressionContext ctx);
	/**
	 * Visit a parse tree produced by the {@code VariableNameExpression}
	 * labeled alternative in {@link HTMLParser#expression}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitVariableNameExpression(HTMLParser.VariableNameExpressionContext ctx);
	/**
	 * Visit a parse tree produced by the {@code LiteralCharExpression}
	 * labeled alternative in {@link HTMLParser#expression}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitLiteralCharExpression(HTMLParser.LiteralCharExpressionContext ctx);
	/**
	 * Visit a parse tree produced by {@link HTMLParser#ng_app}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitNg_app(HTMLParser.Ng_appContext ctx);
	/**
	 * Visit a parse tree produced by {@link HTMLParser#ng_for}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitNg_for(HTMLParser.Ng_forContext ctx);
	/**
	 * Visit a parse tree produced by {@link HTMLParser#ng_switch}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitNg_switch(HTMLParser.Ng_switchContext ctx);
	/**
	 * Visit a parse tree produced by {@link HTMLParser#ng_if}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitNg_if(HTMLParser.Ng_ifContext ctx);
	/**
	 * Visit a parse tree produced by {@link HTMLParser#ng_hide}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitNg_hide(HTMLParser.Ng_hideContext ctx);
	/**
	 * Visit a parse tree produced by {@link HTMLParser#ng_show}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitNg_show(HTMLParser.Ng_showContext ctx);
	/**
	 * Visit a parse tree produced by {@link HTMLParser#ng_switch_case}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitNg_switch_case(HTMLParser.Ng_switch_caseContext ctx);
	/**
	 * Visit a parse tree produced by {@link HTMLParser#ng_switch_default}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitNg_switch_default(HTMLParser.Ng_switch_defaultContext ctx);
	/**
	 * Visit a parse tree produced by {@link HTMLParser#switch_body}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitSwitch_body(HTMLParser.Switch_bodyContext ctx);
	/**
	 * Visit a parse tree produced by {@link HTMLParser#switch_case_body}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitSwitch_case_body(HTMLParser.Switch_case_bodyContext ctx);
	/**
	 * Visit a parse tree produced by {@link HTMLParser#ng_type}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitNg_type(HTMLParser.Ng_typeContext ctx);
	/**
	 * Visit a parse tree produced by {@link HTMLParser#ng_model}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitNg_model(HTMLParser.Ng_modelContext ctx);
	/**
	 * Visit a parse tree produced by {@link HTMLParser#ng_event}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitNg_event(HTMLParser.Ng_eventContext ctx);
	/**
	 * Visit a parse tree produced by {@link HTMLParser#params}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitParams(HTMLParser.ParamsContext ctx);
	/**
	 * Visit a parse tree produced by {@link HTMLParser#ng_list}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitNg_list(HTMLParser.Ng_listContext ctx);
	/**
	 * Visit a parse tree produced by {@link HTMLParser#map_value}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitMap_value(HTMLParser.Map_valueContext ctx);
	/**
	 * Visit a parse tree produced by {@link HTMLParser#map}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitMap(HTMLParser.MapContext ctx);
	/**
	 * Visit a parse tree produced by {@link HTMLParser#ngfor_body}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitNgfor_body(HTMLParser.Ngfor_bodyContext ctx);
	/**
	 * Visit a parse tree produced by {@link HTMLParser#pair}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitPair(HTMLParser.PairContext ctx);
	/**
	 * Visit a parse tree produced by {@link HTMLParser#htmlChardata}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitHtmlChardata(HTMLParser.HtmlChardataContext ctx);
	/**
	 * Visit a parse tree produced by {@link HTMLParser#htmlMisc}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitHtmlMisc(HTMLParser.HtmlMiscContext ctx);
	/**
	 * Visit a parse tree produced by {@link HTMLParser#htmlComment}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitHtmlComment(HTMLParser.HtmlCommentContext ctx);
	/**
	 * Visit a parse tree produced by {@link HTMLParser#script}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitScript(HTMLParser.ScriptContext ctx);
	/**
	 * Visit a parse tree produced by {@link HTMLParser#style}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitStyle(HTMLParser.StyleContext ctx);
}