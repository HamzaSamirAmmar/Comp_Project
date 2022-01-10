// Generated from C:/Users/ASUS/Desktop/compiler_test/grammers\HTMLParser.g4 by ANTLR 4.9.2
package generated;
import org.antlr.v4.runtime.atn.*;
import org.antlr.v4.runtime.dfa.DFA;
import org.antlr.v4.runtime.*;
import org.antlr.v4.runtime.misc.*;
import org.antlr.v4.runtime.tree.*;
import java.util.List;
import java.util.Iterator;
import java.util.ArrayList;

@SuppressWarnings({"all", "warnings", "unchecked", "unused", "cast"})
public class HTMLParser extends Parser {
	static { RuntimeMetaData.checkVersion("4.9.2", RuntimeMetaData.VERSION); }

	protected static final DFA[] _decisionToDFA;
	protected static final PredictionContextCache _sharedContextCache =
		new PredictionContextCache();
	public static final int
		HTML_COMMENT=1, HTML_CONDITIONAL_COMMENT=2, XML=3, CDATA=4, DTD=5, SCRIPTLET=6, 
		SEA_WS=7, SCRIPT_OPEN=8, STYLE_OPEN=9, TAG_OPEN=10, MUSTACHE_OPEN=11, 
		HTML_TEXT=12, NG_APP=13, NGSHOW=14, NGHIDE=15, NGIF=16, NG_SWITCH=17, 
		NG_SWITCH_CASE=18, NG_SWITCH_DEFAULT=19, NG_TYPE=20, NG_MODEL=21, NG_AT_EVENT=22, 
		NG_EVENT=23, NG_BEGINING=24, NG_ATTRBIUTE=25, SINGLE_QOUTE=26, NGFOR=27, 
		ID=28, IN=29, TAG_CLOSE=30, TAG_SLASH_CLOSE=31, TAG_SLASH=32, TAG_EQUALS=33, 
		TAG_NAME=34, TAG_WHITESPACE=35, SCRIPT_BODY=36, SCRIPT_SHORT_BODY=37, 
		STYLE_BODY=38, STYLE_SHORT_BODY=39, ATTVALUE_VALUE=40, ATTRIBUTE=41, NG_BOOLEAN=42, 
		NG_IN=43, NG_ID=44, NG_SINGLE_QOUTE=45, SQUARE_OPEN=46, SQUARE_CLOSE=47, 
		BRACKET_OPEN=48, BRACKET_CLOSE=49, CURLEY_BRACKET_OPEN=50, CURLEY_BRACKET_CLOSE=51, 
		DOT=52, NG_OPERATOR_TWO_OPERAND=53, NG_ONE_LOGICAL_OPERAND=54, NG_ONE_VALUABLE_OPERAND=55, 
		CONDITIONAL_CONCAT_OPERATOR=56, ADDITIVE_OPERATOR=57, MULTIPLICATIVE_OPERATOR=58, 
		NG_WHITESPACE=59, NG_DECIMAL=60, NG_CHAR=61, NG_STRING=62, EQUAL_SIGN=63, 
		SEMI_COLON=64, COLON=65, COMMA=66, QUESTION_MARK=67, PIPE=68, MUSTACHE_CLOSE=69, 
		WHITESPACE=70, FORMATTER=71, SINGLE_QUOTE=72, FORMATE=73, MODEL_MANIPULATOR_COLON=74, 
		TYPE_WHITESPACE=75, TYPE_BEGINNING=76, INPUT_TYPE=77, TYPE_QUOTE=78;
	public static final int
		RULE_htmlDocument = 0, RULE_scriptletOrSeaWs = 1, RULE_htmlElements = 2, 
		RULE_htmlElement = 3, RULE_htmlContent = 4, RULE_mustache = 5, RULE_htmlAttribute = 6, 
		RULE_expression = 7, RULE_ng_app = 8, RULE_ng_for = 9, RULE_ng_switch = 10, 
		RULE_ng_if = 11, RULE_ng_hide = 12, RULE_ng_show = 13, RULE_ng_switch_case = 14, 
		RULE_ng_switch_default = 15, RULE_switch_body = 16, RULE_switch_case_body = 17, 
		RULE_ng_type = 18, RULE_ng_model = 19, RULE_ng_event = 20, RULE_params = 21, 
		RULE_ng_list = 22, RULE_map_value = 23, RULE_map = 24, RULE_ngfor_body = 25, 
		RULE_pair = 26, RULE_htmlChardata = 27, RULE_htmlMisc = 28, RULE_htmlComment = 29, 
		RULE_script = 30, RULE_style = 31;
	private static String[] makeRuleNames() {
		return new String[] {
			"htmlDocument", "scriptletOrSeaWs", "htmlElements", "htmlElement", "htmlContent", 
			"mustache", "htmlAttribute", "expression", "ng_app", "ng_for", "ng_switch", 
			"ng_if", "ng_hide", "ng_show", "ng_switch_case", "ng_switch_default", 
			"switch_body", "switch_case_body", "ng_type", "ng_model", "ng_event", 
			"params", "ng_list", "map_value", "map", "ngfor_body", "pair", "htmlChardata", 
			"htmlMisc", "htmlComment", "script", "style"
		};
	}
	public static final String[] ruleNames = makeRuleNames();

	private static String[] makeLiteralNames() {
		return new String[] {
			null, null, null, null, null, null, null, null, null, null, "'<'", "'{{'", 
			null, "'app'", "'ng-show'", "'ng-hide'", "'ng-if'", "'ng-switch'", "'ng-switch-case'", 
			"'ng-switchDefault'", "'type'", "'ng-model'", null, null, null, null, 
			null, "'ng-for'", "'x'", null, "'>'", "'/>'", "'/'", null, null, null, 
			null, null, null, null, null, null, null, null, null, null, "'['", "']'", 
			"'('", "')'", "'{'", "'}'", "'.'", null, null, null, null, null, null, 
			null, null, null, null, null, "';'", null, "','", "'?'", "'|'", "'}}'", 
			null, "'myFormater'"
		};
	}
	private static final String[] _LITERAL_NAMES = makeLiteralNames();
	private static String[] makeSymbolicNames() {
		return new String[] {
			null, "HTML_COMMENT", "HTML_CONDITIONAL_COMMENT", "XML", "CDATA", "DTD", 
			"SCRIPTLET", "SEA_WS", "SCRIPT_OPEN", "STYLE_OPEN", "TAG_OPEN", "MUSTACHE_OPEN", 
			"HTML_TEXT", "NG_APP", "NGSHOW", "NGHIDE", "NGIF", "NG_SWITCH", "NG_SWITCH_CASE", 
			"NG_SWITCH_DEFAULT", "NG_TYPE", "NG_MODEL", "NG_AT_EVENT", "NG_EVENT", 
			"NG_BEGINING", "NG_ATTRBIUTE", "SINGLE_QOUTE", "NGFOR", "ID", "IN", "TAG_CLOSE", 
			"TAG_SLASH_CLOSE", "TAG_SLASH", "TAG_EQUALS", "TAG_NAME", "TAG_WHITESPACE", 
			"SCRIPT_BODY", "SCRIPT_SHORT_BODY", "STYLE_BODY", "STYLE_SHORT_BODY", 
			"ATTVALUE_VALUE", "ATTRIBUTE", "NG_BOOLEAN", "NG_IN", "NG_ID", "NG_SINGLE_QOUTE", 
			"SQUARE_OPEN", "SQUARE_CLOSE", "BRACKET_OPEN", "BRACKET_CLOSE", "CURLEY_BRACKET_OPEN", 
			"CURLEY_BRACKET_CLOSE", "DOT", "NG_OPERATOR_TWO_OPERAND", "NG_ONE_LOGICAL_OPERAND", 
			"NG_ONE_VALUABLE_OPERAND", "CONDITIONAL_CONCAT_OPERATOR", "ADDITIVE_OPERATOR", 
			"MULTIPLICATIVE_OPERATOR", "NG_WHITESPACE", "NG_DECIMAL", "NG_CHAR", 
			"NG_STRING", "EQUAL_SIGN", "SEMI_COLON", "COLON", "COMMA", "QUESTION_MARK", 
			"PIPE", "MUSTACHE_CLOSE", "WHITESPACE", "FORMATTER", "SINGLE_QUOTE", 
			"FORMATE", "MODEL_MANIPULATOR_COLON", "TYPE_WHITESPACE", "TYPE_BEGINNING", 
			"INPUT_TYPE", "TYPE_QUOTE"
		};
	}
	private static final String[] _SYMBOLIC_NAMES = makeSymbolicNames();
	public static final Vocabulary VOCABULARY = new VocabularyImpl(_LITERAL_NAMES, _SYMBOLIC_NAMES);

	/**
	 * @deprecated Use {@link #VOCABULARY} instead.
	 */
	@Deprecated
	public static final String[] tokenNames;
	static {
		tokenNames = new String[_SYMBOLIC_NAMES.length];
		for (int i = 0; i < tokenNames.length; i++) {
			tokenNames[i] = VOCABULARY.getLiteralName(i);
			if (tokenNames[i] == null) {
				tokenNames[i] = VOCABULARY.getSymbolicName(i);
			}

			if (tokenNames[i] == null) {
				tokenNames[i] = "<INVALID>";
			}
		}
	}

	@Override
	@Deprecated
	public String[] getTokenNames() {
		return tokenNames;
	}

	@Override

	public Vocabulary getVocabulary() {
		return VOCABULARY;
	}

	@Override
	public String getGrammarFileName() { return "HTMLParser.g4"; }

	@Override
	public String[] getRuleNames() { return ruleNames; }

	@Override
	public String getSerializedATN() { return _serializedATN; }

	@Override
	public ATN getATN() { return _ATN; }

	public HTMLParser(TokenStream input) {
		super(input);
		_interp = new ParserATNSimulator(this,_ATN,_decisionToDFA,_sharedContextCache);
	}

	public static class HtmlDocumentContext extends ParserRuleContext {
		public List<ScriptletOrSeaWsContext> scriptletOrSeaWs() {
			return getRuleContexts(ScriptletOrSeaWsContext.class);
		}
		public ScriptletOrSeaWsContext scriptletOrSeaWs(int i) {
			return getRuleContext(ScriptletOrSeaWsContext.class,i);
		}
		public TerminalNode XML() { return getToken(HTMLParser.XML, 0); }
		public TerminalNode DTD() { return getToken(HTMLParser.DTD, 0); }
		public List<HtmlElementsContext> htmlElements() {
			return getRuleContexts(HtmlElementsContext.class);
		}
		public HtmlElementsContext htmlElements(int i) {
			return getRuleContext(HtmlElementsContext.class,i);
		}
		public HtmlDocumentContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_htmlDocument; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof HTMLParserListener ) ((HTMLParserListener)listener).enterHtmlDocument(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof HTMLParserListener ) ((HTMLParserListener)listener).exitHtmlDocument(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof HTMLParserVisitor ) return ((HTMLParserVisitor<? extends T>)visitor).visitHtmlDocument(this);
			else return visitor.visitChildren(this);
		}
	}

	public final HtmlDocumentContext htmlDocument() throws RecognitionException {
		HtmlDocumentContext _localctx = new HtmlDocumentContext(_ctx, getState());
		enterRule(_localctx, 0, RULE_htmlDocument);
		int _la;
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(67);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,0,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					{
					{
					setState(64);
					scriptletOrSeaWs();
					}
					} 
				}
				setState(69);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,0,_ctx);
			}
			setState(71);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==XML) {
				{
				setState(70);
				match(XML);
				}
			}

			setState(76);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,2,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					{
					{
					setState(73);
					scriptletOrSeaWs();
					}
					} 
				}
				setState(78);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,2,_ctx);
			}
			setState(80);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==DTD) {
				{
				setState(79);
				match(DTD);
				}
			}

			setState(85);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,4,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					{
					{
					setState(82);
					scriptletOrSeaWs();
					}
					} 
				}
				setState(87);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,4,_ctx);
			}
			setState(91);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << HTML_COMMENT) | (1L << HTML_CONDITIONAL_COMMENT) | (1L << SCRIPTLET) | (1L << SEA_WS) | (1L << SCRIPT_OPEN) | (1L << STYLE_OPEN) | (1L << TAG_OPEN))) != 0)) {
				{
				{
				setState(88);
				htmlElements();
				}
				}
				setState(93);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class ScriptletOrSeaWsContext extends ParserRuleContext {
		public TerminalNode SCRIPTLET() { return getToken(HTMLParser.SCRIPTLET, 0); }
		public TerminalNode SEA_WS() { return getToken(HTMLParser.SEA_WS, 0); }
		public ScriptletOrSeaWsContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_scriptletOrSeaWs; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof HTMLParserListener ) ((HTMLParserListener)listener).enterScriptletOrSeaWs(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof HTMLParserListener ) ((HTMLParserListener)listener).exitScriptletOrSeaWs(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof HTMLParserVisitor ) return ((HTMLParserVisitor<? extends T>)visitor).visitScriptletOrSeaWs(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ScriptletOrSeaWsContext scriptletOrSeaWs() throws RecognitionException {
		ScriptletOrSeaWsContext _localctx = new ScriptletOrSeaWsContext(_ctx, getState());
		enterRule(_localctx, 2, RULE_scriptletOrSeaWs);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(94);
			_la = _input.LA(1);
			if ( !(_la==SCRIPTLET || _la==SEA_WS) ) {
			_errHandler.recoverInline(this);
			}
			else {
				if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
				_errHandler.reportMatch(this);
				consume();
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class HtmlElementsContext extends ParserRuleContext {
		public HtmlElementContext htmlElement() {
			return getRuleContext(HtmlElementContext.class,0);
		}
		public List<HtmlMiscContext> htmlMisc() {
			return getRuleContexts(HtmlMiscContext.class);
		}
		public HtmlMiscContext htmlMisc(int i) {
			return getRuleContext(HtmlMiscContext.class,i);
		}
		public HtmlElementsContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_htmlElements; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof HTMLParserListener ) ((HTMLParserListener)listener).enterHtmlElements(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof HTMLParserListener ) ((HTMLParserListener)listener).exitHtmlElements(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof HTMLParserVisitor ) return ((HTMLParserVisitor<? extends T>)visitor).visitHtmlElements(this);
			else return visitor.visitChildren(this);
		}
	}

	public final HtmlElementsContext htmlElements() throws RecognitionException {
		HtmlElementsContext _localctx = new HtmlElementsContext(_ctx, getState());
		enterRule(_localctx, 4, RULE_htmlElements);
		int _la;
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(99);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << HTML_COMMENT) | (1L << HTML_CONDITIONAL_COMMENT) | (1L << SEA_WS))) != 0)) {
				{
				{
				setState(96);
				htmlMisc();
				}
				}
				setState(101);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(102);
			htmlElement();
			setState(106);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,7,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					{
					{
					setState(103);
					htmlMisc();
					}
					} 
				}
				setState(108);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,7,_ctx);
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class HtmlElementContext extends ParserRuleContext {
		public List<TerminalNode> TAG_OPEN() { return getTokens(HTMLParser.TAG_OPEN); }
		public TerminalNode TAG_OPEN(int i) {
			return getToken(HTMLParser.TAG_OPEN, i);
		}
		public List<TerminalNode> TAG_NAME() { return getTokens(HTMLParser.TAG_NAME); }
		public TerminalNode TAG_NAME(int i) {
			return getToken(HTMLParser.TAG_NAME, i);
		}
		public List<TerminalNode> TAG_CLOSE() { return getTokens(HTMLParser.TAG_CLOSE); }
		public TerminalNode TAG_CLOSE(int i) {
			return getToken(HTMLParser.TAG_CLOSE, i);
		}
		public TerminalNode TAG_SLASH_CLOSE() { return getToken(HTMLParser.TAG_SLASH_CLOSE, 0); }
		public List<HtmlAttributeContext> htmlAttribute() {
			return getRuleContexts(HtmlAttributeContext.class);
		}
		public HtmlAttributeContext htmlAttribute(int i) {
			return getRuleContext(HtmlAttributeContext.class,i);
		}
		public HtmlContentContext htmlContent() {
			return getRuleContext(HtmlContentContext.class,0);
		}
		public TerminalNode TAG_SLASH() { return getToken(HTMLParser.TAG_SLASH, 0); }
		public TerminalNode SCRIPTLET() { return getToken(HTMLParser.SCRIPTLET, 0); }
		public ScriptContext script() {
			return getRuleContext(ScriptContext.class,0);
		}
		public StyleContext style() {
			return getRuleContext(StyleContext.class,0);
		}
		public HtmlElementContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_htmlElement; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof HTMLParserListener ) ((HTMLParserListener)listener).enterHtmlElement(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof HTMLParserListener ) ((HTMLParserListener)listener).exitHtmlElement(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof HTMLParserVisitor ) return ((HTMLParserVisitor<? extends T>)visitor).visitHtmlElement(this);
			else return visitor.visitChildren(this);
		}
	}

	public final HtmlElementContext htmlElement() throws RecognitionException {
		HtmlElementContext _localctx = new HtmlElementContext(_ctx, getState());
		enterRule(_localctx, 6, RULE_htmlElement);
		int _la;
		try {
			setState(132);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case TAG_OPEN:
				enterOuterAlt(_localctx, 1);
				{
				setState(109);
				match(TAG_OPEN);
				setState(110);
				match(TAG_NAME);
				setState(114);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << NG_APP) | (1L << NGSHOW) | (1L << NGHIDE) | (1L << NGIF) | (1L << NG_SWITCH) | (1L << NG_SWITCH_CASE) | (1L << NG_SWITCH_DEFAULT) | (1L << NG_TYPE) | (1L << NG_MODEL) | (1L << NG_AT_EVENT) | (1L << NGFOR) | (1L << TAG_NAME))) != 0)) {
					{
					{
					setState(111);
					htmlAttribute();
					}
					}
					setState(116);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				setState(127);
				_errHandler.sync(this);
				switch (_input.LA(1)) {
				case TAG_CLOSE:
					{
					setState(117);
					match(TAG_CLOSE);
					setState(124);
					_errHandler.sync(this);
					switch ( getInterpreter().adaptivePredict(_input,9,_ctx) ) {
					case 1:
						{
						setState(118);
						htmlContent();
						setState(119);
						match(TAG_OPEN);
						setState(120);
						match(TAG_SLASH);
						setState(121);
						match(TAG_NAME);
						setState(122);
						match(TAG_CLOSE);
						}
						break;
					}
					}
					break;
				case TAG_SLASH_CLOSE:
					{
					setState(126);
					match(TAG_SLASH_CLOSE);
					}
					break;
				default:
					throw new NoViableAltException(this);
				}
				}
				break;
			case SCRIPTLET:
				enterOuterAlt(_localctx, 2);
				{
				setState(129);
				match(SCRIPTLET);
				}
				break;
			case SCRIPT_OPEN:
				enterOuterAlt(_localctx, 3);
				{
				setState(130);
				script();
				}
				break;
			case STYLE_OPEN:
				enterOuterAlt(_localctx, 4);
				{
				setState(131);
				style();
				}
				break;
			default:
				throw new NoViableAltException(this);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class HtmlContentContext extends ParserRuleContext {
		public List<HtmlChardataContext> htmlChardata() {
			return getRuleContexts(HtmlChardataContext.class);
		}
		public HtmlChardataContext htmlChardata(int i) {
			return getRuleContext(HtmlChardataContext.class,i);
		}
		public List<MustacheContext> mustache() {
			return getRuleContexts(MustacheContext.class);
		}
		public MustacheContext mustache(int i) {
			return getRuleContext(MustacheContext.class,i);
		}
		public List<HtmlElementContext> htmlElement() {
			return getRuleContexts(HtmlElementContext.class);
		}
		public HtmlElementContext htmlElement(int i) {
			return getRuleContext(HtmlElementContext.class,i);
		}
		public List<TerminalNode> CDATA() { return getTokens(HTMLParser.CDATA); }
		public TerminalNode CDATA(int i) {
			return getToken(HTMLParser.CDATA, i);
		}
		public List<HtmlCommentContext> htmlComment() {
			return getRuleContexts(HtmlCommentContext.class);
		}
		public HtmlCommentContext htmlComment(int i) {
			return getRuleContext(HtmlCommentContext.class,i);
		}
		public HtmlContentContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_htmlContent; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof HTMLParserListener ) ((HTMLParserListener)listener).enterHtmlContent(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof HTMLParserListener ) ((HTMLParserListener)listener).exitHtmlContent(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof HTMLParserVisitor ) return ((HTMLParserVisitor<? extends T>)visitor).visitHtmlContent(this);
			else return visitor.visitChildren(this);
		}
	}

	public final HtmlContentContext htmlContent() throws RecognitionException {
		HtmlContentContext _localctx = new HtmlContentContext(_ctx, getState());
		enterRule(_localctx, 8, RULE_htmlContent);
		int _la;
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(135);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==SEA_WS || _la==HTML_TEXT) {
				{
				setState(134);
				htmlChardata();
				}
			}

			setState(148);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,15,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					{
					{
					setState(141);
					_errHandler.sync(this);
					switch (_input.LA(1)) {
					case MUSTACHE_OPEN:
						{
						setState(137);
						mustache();
						}
						break;
					case SCRIPTLET:
					case SCRIPT_OPEN:
					case STYLE_OPEN:
					case TAG_OPEN:
						{
						setState(138);
						htmlElement();
						}
						break;
					case CDATA:
						{
						setState(139);
						match(CDATA);
						}
						break;
					case HTML_COMMENT:
					case HTML_CONDITIONAL_COMMENT:
						{
						setState(140);
						htmlComment();
						}
						break;
					default:
						throw new NoViableAltException(this);
					}
					setState(144);
					_errHandler.sync(this);
					_la = _input.LA(1);
					if (_la==SEA_WS || _la==HTML_TEXT) {
						{
						setState(143);
						htmlChardata();
						}
					}

					}
					} 
				}
				setState(150);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,15,_ctx);
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class MustacheContext extends ParserRuleContext {
		public TerminalNode MUSTACHE_OPEN() { return getToken(HTMLParser.MUSTACHE_OPEN, 0); }
		public ExpressionContext expression() {
			return getRuleContext(ExpressionContext.class,0);
		}
		public TerminalNode MUSTACHE_CLOSE() { return getToken(HTMLParser.MUSTACHE_CLOSE, 0); }
		public MustacheContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_mustache; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof HTMLParserListener ) ((HTMLParserListener)listener).enterMustache(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof HTMLParserListener ) ((HTMLParserListener)listener).exitMustache(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof HTMLParserVisitor ) return ((HTMLParserVisitor<? extends T>)visitor).visitMustache(this);
			else return visitor.visitChildren(this);
		}
	}

	public final MustacheContext mustache() throws RecognitionException {
		MustacheContext _localctx = new MustacheContext(_ctx, getState());
		enterRule(_localctx, 10, RULE_mustache);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(151);
			match(MUSTACHE_OPEN);
			setState(152);
			expression(0);
			setState(153);
			match(MUSTACHE_CLOSE);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class HtmlAttributeContext extends ParserRuleContext {
		public Ng_appContext ng_app() {
			return getRuleContext(Ng_appContext.class,0);
		}
		public Ng_forContext ng_for() {
			return getRuleContext(Ng_forContext.class,0);
		}
		public Ng_switchContext ng_switch() {
			return getRuleContext(Ng_switchContext.class,0);
		}
		public Ng_switch_caseContext ng_switch_case() {
			return getRuleContext(Ng_switch_caseContext.class,0);
		}
		public Ng_switch_defaultContext ng_switch_default() {
			return getRuleContext(Ng_switch_defaultContext.class,0);
		}
		public Ng_ifContext ng_if() {
			return getRuleContext(Ng_ifContext.class,0);
		}
		public Ng_hideContext ng_hide() {
			return getRuleContext(Ng_hideContext.class,0);
		}
		public Ng_showContext ng_show() {
			return getRuleContext(Ng_showContext.class,0);
		}
		public Ng_typeContext ng_type() {
			return getRuleContext(Ng_typeContext.class,0);
		}
		public Ng_modelContext ng_model() {
			return getRuleContext(Ng_modelContext.class,0);
		}
		public Ng_eventContext ng_event() {
			return getRuleContext(Ng_eventContext.class,0);
		}
		public TerminalNode TAG_NAME() { return getToken(HTMLParser.TAG_NAME, 0); }
		public TerminalNode TAG_EQUALS() { return getToken(HTMLParser.TAG_EQUALS, 0); }
		public TerminalNode ATTVALUE_VALUE() { return getToken(HTMLParser.ATTVALUE_VALUE, 0); }
		public HtmlAttributeContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_htmlAttribute; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof HTMLParserListener ) ((HTMLParserListener)listener).enterHtmlAttribute(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof HTMLParserListener ) ((HTMLParserListener)listener).exitHtmlAttribute(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof HTMLParserVisitor ) return ((HTMLParserVisitor<? extends T>)visitor).visitHtmlAttribute(this);
			else return visitor.visitChildren(this);
		}
	}

	public final HtmlAttributeContext htmlAttribute() throws RecognitionException {
		HtmlAttributeContext _localctx = new HtmlAttributeContext(_ctx, getState());
		enterRule(_localctx, 12, RULE_htmlAttribute);
		int _la;
		try {
			setState(171);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case NG_APP:
				enterOuterAlt(_localctx, 1);
				{
				setState(155);
				ng_app();
				}
				break;
			case NGFOR:
				enterOuterAlt(_localctx, 2);
				{
				setState(156);
				ng_for();
				}
				break;
			case NG_SWITCH:
				enterOuterAlt(_localctx, 3);
				{
				setState(157);
				ng_switch();
				}
				break;
			case NG_SWITCH_CASE:
				enterOuterAlt(_localctx, 4);
				{
				setState(158);
				ng_switch_case();
				}
				break;
			case NG_SWITCH_DEFAULT:
				enterOuterAlt(_localctx, 5);
				{
				setState(159);
				ng_switch_default();
				}
				break;
			case NGIF:
				enterOuterAlt(_localctx, 6);
				{
				setState(160);
				ng_if();
				}
				break;
			case NGHIDE:
				enterOuterAlt(_localctx, 7);
				{
				setState(161);
				ng_hide();
				}
				break;
			case NGSHOW:
				enterOuterAlt(_localctx, 8);
				{
				setState(162);
				ng_show();
				}
				break;
			case NG_TYPE:
				enterOuterAlt(_localctx, 9);
				{
				setState(163);
				ng_type();
				}
				break;
			case NG_MODEL:
				enterOuterAlt(_localctx, 10);
				{
				setState(164);
				ng_model();
				}
				break;
			case NG_AT_EVENT:
				enterOuterAlt(_localctx, 11);
				{
				setState(165);
				ng_event();
				}
				break;
			case TAG_NAME:
				enterOuterAlt(_localctx, 12);
				{
				setState(166);
				match(TAG_NAME);
				setState(169);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==TAG_EQUALS) {
					{
					setState(167);
					match(TAG_EQUALS);
					setState(168);
					match(ATTVALUE_VALUE);
					}
				}

				}
				break;
			default:
				throw new NoViableAltException(this);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class ExpressionContext extends ParserRuleContext {
		public ExpressionContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_expression; }
	 
		public ExpressionContext() { }
		public void copyFrom(ExpressionContext ctx) {
			super.copyFrom(ctx);
		}
	}
	public static class ParenthesizedExpressionContext extends ExpressionContext {
		public TerminalNode BRACKET_OPEN() { return getToken(HTMLParser.BRACKET_OPEN, 0); }
		public ExpressionContext expression() {
			return getRuleContext(ExpressionContext.class,0);
		}
		public TerminalNode BRACKET_CLOSE() { return getToken(HTMLParser.BRACKET_CLOSE, 0); }
		public ParenthesizedExpressionContext(ExpressionContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof HTMLParserListener ) ((HTMLParserListener)listener).enterParenthesizedExpression(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof HTMLParserListener ) ((HTMLParserListener)listener).exitParenthesizedExpression(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof HTMLParserVisitor ) return ((HTMLParserVisitor<? extends T>)visitor).visitParenthesizedExpression(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class LiteralArrayExpressionContext extends ExpressionContext {
		public Ng_listContext ng_list() {
			return getRuleContext(Ng_listContext.class,0);
		}
		public LiteralArrayExpressionContext(ExpressionContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof HTMLParserListener ) ((HTMLParserListener)listener).enterLiteralArrayExpression(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof HTMLParserListener ) ((HTMLParserListener)listener).exitLiteralArrayExpression(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof HTMLParserVisitor ) return ((HTMLParserVisitor<? extends T>)visitor).visitLiteralArrayExpression(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class TernaryExpressionContext extends ExpressionContext {
		public List<ExpressionContext> expression() {
			return getRuleContexts(ExpressionContext.class);
		}
		public ExpressionContext expression(int i) {
			return getRuleContext(ExpressionContext.class,i);
		}
		public TerminalNode QUESTION_MARK() { return getToken(HTMLParser.QUESTION_MARK, 0); }
		public TerminalNode COLON() { return getToken(HTMLParser.COLON, 0); }
		public TernaryExpressionContext(ExpressionContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof HTMLParserListener ) ((HTMLParserListener)listener).enterTernaryExpression(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof HTMLParserListener ) ((HTMLParserListener)listener).exitTernaryExpression(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof HTMLParserVisitor ) return ((HTMLParserVisitor<? extends T>)visitor).visitTernaryExpression(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class TwoOperandsConditionExpressionContext extends ExpressionContext {
		public List<ExpressionContext> expression() {
			return getRuleContexts(ExpressionContext.class);
		}
		public ExpressionContext expression(int i) {
			return getRuleContext(ExpressionContext.class,i);
		}
		public TerminalNode NG_OPERATOR_TWO_OPERAND() { return getToken(HTMLParser.NG_OPERATOR_TWO_OPERAND, 0); }
		public TwoOperandsConditionExpressionContext(ExpressionContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof HTMLParserListener ) ((HTMLParserListener)listener).enterTwoOperandsConditionExpression(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof HTMLParserListener ) ((HTMLParserListener)listener).exitTwoOperandsConditionExpression(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof HTMLParserVisitor ) return ((HTMLParserVisitor<? extends T>)visitor).visitTwoOperandsConditionExpression(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class MathematicalExpressionContext extends ExpressionContext {
		public List<ExpressionContext> expression() {
			return getRuleContexts(ExpressionContext.class);
		}
		public ExpressionContext expression(int i) {
			return getRuleContext(ExpressionContext.class,i);
		}
		public TerminalNode MULTIPLICATIVE_OPERATOR() { return getToken(HTMLParser.MULTIPLICATIVE_OPERATOR, 0); }
		public TerminalNode ADDITIVE_OPERATOR() { return getToken(HTMLParser.ADDITIVE_OPERATOR, 0); }
		public MathematicalExpressionContext(ExpressionContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof HTMLParserListener ) ((HTMLParserListener)listener).enterMathematicalExpression(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof HTMLParserListener ) ((HTMLParserListener)listener).exitMathematicalExpression(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof HTMLParserVisitor ) return ((HTMLParserVisitor<? extends T>)visitor).visitMathematicalExpression(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class IndexedVariableExpressionContext extends ExpressionContext {
		public List<ExpressionContext> expression() {
			return getRuleContexts(ExpressionContext.class);
		}
		public ExpressionContext expression(int i) {
			return getRuleContext(ExpressionContext.class,i);
		}
		public TerminalNode SQUARE_OPEN() { return getToken(HTMLParser.SQUARE_OPEN, 0); }
		public TerminalNode SQUARE_CLOSE() { return getToken(HTMLParser.SQUARE_CLOSE, 0); }
		public IndexedVariableExpressionContext(ExpressionContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof HTMLParserListener ) ((HTMLParserListener)listener).enterIndexedVariableExpression(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof HTMLParserListener ) ((HTMLParserListener)listener).exitIndexedVariableExpression(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof HTMLParserVisitor ) return ((HTMLParserVisitor<? extends T>)visitor).visitIndexedVariableExpression(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class PipeExpressionContext extends ExpressionContext {
		public List<ExpressionContext> expression() {
			return getRuleContexts(ExpressionContext.class);
		}
		public ExpressionContext expression(int i) {
			return getRuleContext(ExpressionContext.class,i);
		}
		public TerminalNode PIPE() { return getToken(HTMLParser.PIPE, 0); }
		public TerminalNode COLON() { return getToken(HTMLParser.COLON, 0); }
		public ParamsContext params() {
			return getRuleContext(ParamsContext.class,0);
		}
		public PipeExpressionContext(ExpressionContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof HTMLParserListener ) ((HTMLParserListener)listener).enterPipeExpression(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof HTMLParserListener ) ((HTMLParserListener)listener).exitPipeExpression(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof HTMLParserVisitor ) return ((HTMLParserVisitor<? extends T>)visitor).visitPipeExpression(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class LiteralBooleanExpressionContext extends ExpressionContext {
		public TerminalNode NG_BOOLEAN() { return getToken(HTMLParser.NG_BOOLEAN, 0); }
		public LiteralBooleanExpressionContext(ExpressionContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof HTMLParserListener ) ((HTMLParserListener)listener).enterLiteralBooleanExpression(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof HTMLParserListener ) ((HTMLParserListener)listener).exitLiteralBooleanExpression(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof HTMLParserVisitor ) return ((HTMLParserVisitor<? extends T>)visitor).visitLiteralBooleanExpression(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class OneOperandConditionExpressionContext extends ExpressionContext {
		public TerminalNode NG_ONE_LOGICAL_OPERAND() { return getToken(HTMLParser.NG_ONE_LOGICAL_OPERAND, 0); }
		public ExpressionContext expression() {
			return getRuleContext(ExpressionContext.class,0);
		}
		public OneOperandConditionExpressionContext(ExpressionContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof HTMLParserListener ) ((HTMLParserListener)listener).enterOneOperandConditionExpression(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof HTMLParserListener ) ((HTMLParserListener)listener).exitOneOperandConditionExpression(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof HTMLParserVisitor ) return ((HTMLParserVisitor<? extends T>)visitor).visitOneOperandConditionExpression(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class LiteralNumericExpressionContext extends ExpressionContext {
		public TerminalNode NG_DECIMAL() { return getToken(HTMLParser.NG_DECIMAL, 0); }
		public LiteralNumericExpressionContext(ExpressionContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof HTMLParserListener ) ((HTMLParserListener)listener).enterLiteralNumericExpression(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof HTMLParserListener ) ((HTMLParserListener)listener).exitLiteralNumericExpression(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof HTMLParserVisitor ) return ((HTMLParserVisitor<? extends T>)visitor).visitLiteralNumericExpression(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class FunctionCallExpressionContext extends ExpressionContext {
		public ExpressionContext expression() {
			return getRuleContext(ExpressionContext.class,0);
		}
		public TerminalNode BRACKET_OPEN() { return getToken(HTMLParser.BRACKET_OPEN, 0); }
		public TerminalNode BRACKET_CLOSE() { return getToken(HTMLParser.BRACKET_CLOSE, 0); }
		public ParamsContext params() {
			return getRuleContext(ParamsContext.class,0);
		}
		public FunctionCallExpressionContext(ExpressionContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof HTMLParserListener ) ((HTMLParserListener)listener).enterFunctionCallExpression(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof HTMLParserListener ) ((HTMLParserListener)listener).exitFunctionCallExpression(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof HTMLParserVisitor ) return ((HTMLParserVisitor<? extends T>)visitor).visitFunctionCallExpression(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class LiteralObjectExpressionContext extends ExpressionContext {
		public MapContext map() {
			return getRuleContext(MapContext.class,0);
		}
		public LiteralObjectExpressionContext(ExpressionContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof HTMLParserListener ) ((HTMLParserListener)listener).enterLiteralObjectExpression(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof HTMLParserListener ) ((HTMLParserListener)listener).exitLiteralObjectExpression(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof HTMLParserVisitor ) return ((HTMLParserVisitor<? extends T>)visitor).visitLiteralObjectExpression(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class LiteralStringExpressionContext extends ExpressionContext {
		public TerminalNode NG_STRING() { return getToken(HTMLParser.NG_STRING, 0); }
		public LiteralStringExpressionContext(ExpressionContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof HTMLParserListener ) ((HTMLParserListener)listener).enterLiteralStringExpression(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof HTMLParserListener ) ((HTMLParserListener)listener).exitLiteralStringExpression(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof HTMLParserVisitor ) return ((HTMLParserVisitor<? extends T>)visitor).visitLiteralStringExpression(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class VariableConcatExpressionContext extends ExpressionContext {
		public List<ExpressionContext> expression() {
			return getRuleContexts(ExpressionContext.class);
		}
		public ExpressionContext expression(int i) {
			return getRuleContext(ExpressionContext.class,i);
		}
		public TerminalNode DOT() { return getToken(HTMLParser.DOT, 0); }
		public VariableConcatExpressionContext(ExpressionContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof HTMLParserListener ) ((HTMLParserListener)listener).enterVariableConcatExpression(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof HTMLParserListener ) ((HTMLParserListener)listener).exitVariableConcatExpression(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof HTMLParserVisitor ) return ((HTMLParserVisitor<? extends T>)visitor).visitVariableConcatExpression(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class ConcatConditionExpressionContext extends ExpressionContext {
		public List<ExpressionContext> expression() {
			return getRuleContexts(ExpressionContext.class);
		}
		public ExpressionContext expression(int i) {
			return getRuleContext(ExpressionContext.class,i);
		}
		public TerminalNode CONDITIONAL_CONCAT_OPERATOR() { return getToken(HTMLParser.CONDITIONAL_CONCAT_OPERATOR, 0); }
		public ConcatConditionExpressionContext(ExpressionContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof HTMLParserListener ) ((HTMLParserListener)listener).enterConcatConditionExpression(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof HTMLParserListener ) ((HTMLParserListener)listener).exitConcatConditionExpression(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof HTMLParserVisitor ) return ((HTMLParserVisitor<? extends T>)visitor).visitConcatConditionExpression(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class OneOperandValuableExpressionContext extends ExpressionContext {
		public TerminalNode NG_ONE_VALUABLE_OPERAND() { return getToken(HTMLParser.NG_ONE_VALUABLE_OPERAND, 0); }
		public ExpressionContext expression() {
			return getRuleContext(ExpressionContext.class,0);
		}
		public OneOperandValuableExpressionContext(ExpressionContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof HTMLParserListener ) ((HTMLParserListener)listener).enterOneOperandValuableExpression(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof HTMLParserListener ) ((HTMLParserListener)listener).exitOneOperandValuableExpression(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof HTMLParserVisitor ) return ((HTMLParserVisitor<? extends T>)visitor).visitOneOperandValuableExpression(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class VariableNameExpressionContext extends ExpressionContext {
		public TerminalNode NG_ID() { return getToken(HTMLParser.NG_ID, 0); }
		public VariableNameExpressionContext(ExpressionContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof HTMLParserListener ) ((HTMLParserListener)listener).enterVariableNameExpression(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof HTMLParserListener ) ((HTMLParserListener)listener).exitVariableNameExpression(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof HTMLParserVisitor ) return ((HTMLParserVisitor<? extends T>)visitor).visitVariableNameExpression(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class LiteralCharExpressionContext extends ExpressionContext {
		public TerminalNode NG_CHAR() { return getToken(HTMLParser.NG_CHAR, 0); }
		public LiteralCharExpressionContext(ExpressionContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof HTMLParserListener ) ((HTMLParserListener)listener).enterLiteralCharExpression(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof HTMLParserListener ) ((HTMLParserListener)listener).exitLiteralCharExpression(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof HTMLParserVisitor ) return ((HTMLParserVisitor<? extends T>)visitor).visitLiteralCharExpression(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ExpressionContext expression() throws RecognitionException {
		return expression(0);
	}

	private ExpressionContext expression(int _p) throws RecognitionException {
		ParserRuleContext _parentctx = _ctx;
		int _parentState = getState();
		ExpressionContext _localctx = new ExpressionContext(_ctx, _parentState);
		ExpressionContext _prevctx = _localctx;
		int _startState = 14;
		enterRecursionRule(_localctx, 14, RULE_expression, _p);
		int _la;
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(189);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case NG_ID:
				{
				_localctx = new VariableNameExpressionContext(_localctx);
				_ctx = _localctx;
				_prevctx = _localctx;

				setState(174);
				match(NG_ID);
				}
				break;
			case NG_DECIMAL:
				{
				_localctx = new LiteralNumericExpressionContext(_localctx);
				_ctx = _localctx;
				_prevctx = _localctx;
				setState(175);
				match(NG_DECIMAL);
				}
				break;
			case NG_CHAR:
				{
				_localctx = new LiteralCharExpressionContext(_localctx);
				_ctx = _localctx;
				_prevctx = _localctx;
				setState(176);
				match(NG_CHAR);
				}
				break;
			case NG_STRING:
				{
				_localctx = new LiteralStringExpressionContext(_localctx);
				_ctx = _localctx;
				_prevctx = _localctx;
				setState(177);
				match(NG_STRING);
				}
				break;
			case NG_BOOLEAN:
				{
				_localctx = new LiteralBooleanExpressionContext(_localctx);
				_ctx = _localctx;
				_prevctx = _localctx;
				setState(178);
				match(NG_BOOLEAN);
				}
				break;
			case SQUARE_OPEN:
				{
				_localctx = new LiteralArrayExpressionContext(_localctx);
				_ctx = _localctx;
				_prevctx = _localctx;
				setState(179);
				ng_list();
				}
				break;
			case CURLEY_BRACKET_OPEN:
				{
				_localctx = new LiteralObjectExpressionContext(_localctx);
				_ctx = _localctx;
				_prevctx = _localctx;
				setState(180);
				map();
				}
				break;
			case NG_ONE_LOGICAL_OPERAND:
				{
				_localctx = new OneOperandConditionExpressionContext(_localctx);
				_ctx = _localctx;
				_prevctx = _localctx;
				setState(181);
				match(NG_ONE_LOGICAL_OPERAND);
				setState(182);
				expression(4);
				}
				break;
			case NG_ONE_VALUABLE_OPERAND:
				{
				_localctx = new OneOperandValuableExpressionContext(_localctx);
				_ctx = _localctx;
				_prevctx = _localctx;
				setState(183);
				match(NG_ONE_VALUABLE_OPERAND);
				setState(184);
				expression(3);
				}
				break;
			case BRACKET_OPEN:
				{
				_localctx = new ParenthesizedExpressionContext(_localctx);
				_ctx = _localctx;
				_prevctx = _localctx;
				setState(185);
				match(BRACKET_OPEN);
				setState(186);
				expression(0);
				setState(187);
				match(BRACKET_CLOSE);
				}
				break;
			default:
				throw new NoViableAltException(this);
			}
			_ctx.stop = _input.LT(-1);
			setState(234);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,22,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					if ( _parseListeners!=null ) triggerExitRuleEvent();
					_prevctx = _localctx;
					{
					setState(232);
					_errHandler.sync(this);
					switch ( getInterpreter().adaptivePredict(_input,21,_ctx) ) {
					case 1:
						{
						_localctx = new VariableConcatExpressionContext(new ExpressionContext(_parentctx, _parentState));
						pushNewRecursionContext(_localctx, _startState, RULE_expression);
						setState(191);
						if (!(precpred(_ctx, 20))) throw new FailedPredicateException(this, "precpred(_ctx, 20)");
						setState(192);
						match(DOT);
						setState(193);
						expression(21);
						}
						break;
					case 2:
						{
						_localctx = new TwoOperandsConditionExpressionContext(new ExpressionContext(_parentctx, _parentState));
						pushNewRecursionContext(_localctx, _startState, RULE_expression);
						setState(194);
						if (!(precpred(_ctx, 19))) throw new FailedPredicateException(this, "precpred(_ctx, 19)");
						setState(195);
						match(NG_OPERATOR_TWO_OPERAND);
						setState(196);
						expression(20);
						}
						break;
					case 3:
						{
						_localctx = new ConcatConditionExpressionContext(new ExpressionContext(_parentctx, _parentState));
						pushNewRecursionContext(_localctx, _startState, RULE_expression);
						setState(197);
						if (!(precpred(_ctx, 18))) throw new FailedPredicateException(this, "precpred(_ctx, 18)");
						setState(198);
						match(CONDITIONAL_CONCAT_OPERATOR);
						setState(199);
						expression(19);
						}
						break;
					case 4:
						{
						_localctx = new TernaryExpressionContext(new ExpressionContext(_parentctx, _parentState));
						pushNewRecursionContext(_localctx, _startState, RULE_expression);
						setState(200);
						if (!(precpred(_ctx, 17))) throw new FailedPredicateException(this, "precpred(_ctx, 17)");
						setState(201);
						match(QUESTION_MARK);
						setState(202);
						expression(0);
						setState(203);
						match(COLON);
						setState(204);
						expression(18);
						}
						break;
					case 5:
						{
						_localctx = new MathematicalExpressionContext(new ExpressionContext(_parentctx, _parentState));
						pushNewRecursionContext(_localctx, _startState, RULE_expression);
						setState(206);
						if (!(precpred(_ctx, 16))) throw new FailedPredicateException(this, "precpred(_ctx, 16)");
						setState(207);
						match(MULTIPLICATIVE_OPERATOR);
						setState(208);
						expression(17);
						}
						break;
					case 6:
						{
						_localctx = new MathematicalExpressionContext(new ExpressionContext(_parentctx, _parentState));
						pushNewRecursionContext(_localctx, _startState, RULE_expression);
						setState(209);
						if (!(precpred(_ctx, 15))) throw new FailedPredicateException(this, "precpred(_ctx, 15)");
						setState(210);
						match(ADDITIVE_OPERATOR);
						setState(211);
						expression(16);
						}
						break;
					case 7:
						{
						_localctx = new FunctionCallExpressionContext(new ExpressionContext(_parentctx, _parentState));
						pushNewRecursionContext(_localctx, _startState, RULE_expression);
						setState(212);
						if (!(precpred(_ctx, 14))) throw new FailedPredicateException(this, "precpred(_ctx, 14)");
						{
						setState(213);
						match(BRACKET_OPEN);
						setState(215);
						_errHandler.sync(this);
						_la = _input.LA(1);
						if ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << NG_BOOLEAN) | (1L << NG_ID) | (1L << SQUARE_OPEN) | (1L << BRACKET_OPEN) | (1L << CURLEY_BRACKET_OPEN) | (1L << NG_ONE_LOGICAL_OPERAND) | (1L << NG_ONE_VALUABLE_OPERAND) | (1L << NG_DECIMAL) | (1L << NG_CHAR) | (1L << NG_STRING))) != 0)) {
							{
							setState(214);
							params();
							}
						}

						setState(217);
						match(BRACKET_CLOSE);
						}
						}
						break;
					case 8:
						{
						_localctx = new PipeExpressionContext(new ExpressionContext(_parentctx, _parentState));
						pushNewRecursionContext(_localctx, _startState, RULE_expression);
						setState(218);
						if (!(precpred(_ctx, 13))) throw new FailedPredicateException(this, "precpred(_ctx, 13)");
						setState(219);
						match(PIPE);
						setState(220);
						expression(0);
						setState(223);
						_errHandler.sync(this);
						switch ( getInterpreter().adaptivePredict(_input,20,_ctx) ) {
						case 1:
							{
							setState(221);
							match(COLON);
							setState(222);
							params();
							}
							break;
						}
						}
						break;
					case 9:
						{
						_localctx = new IndexedVariableExpressionContext(new ExpressionContext(_parentctx, _parentState));
						pushNewRecursionContext(_localctx, _startState, RULE_expression);
						setState(225);
						if (!(precpred(_ctx, 5))) throw new FailedPredicateException(this, "precpred(_ctx, 5)");
						{
						setState(226);
						match(SQUARE_OPEN);
						setState(227);
						expression(0);
						setState(228);
						match(SQUARE_CLOSE);
						}
						}
						break;
					case 10:
						{
						_localctx = new OneOperandValuableExpressionContext(new ExpressionContext(_parentctx, _parentState));
						pushNewRecursionContext(_localctx, _startState, RULE_expression);
						setState(230);
						if (!(precpred(_ctx, 2))) throw new FailedPredicateException(this, "precpred(_ctx, 2)");
						setState(231);
						match(NG_ONE_VALUABLE_OPERAND);
						}
						break;
					}
					} 
				}
				setState(236);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,22,_ctx);
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			unrollRecursionContexts(_parentctx);
		}
		return _localctx;
	}

	public static class Ng_appContext extends ParserRuleContext {
		public TerminalNode NG_APP() { return getToken(HTMLParser.NG_APP, 0); }
		public TerminalNode NG_BEGINING() { return getToken(HTMLParser.NG_BEGINING, 0); }
		public TerminalNode NG_ID() { return getToken(HTMLParser.NG_ID, 0); }
		public TerminalNode NG_SINGLE_QOUTE() { return getToken(HTMLParser.NG_SINGLE_QOUTE, 0); }
		public Ng_appContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_ng_app; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof HTMLParserListener ) ((HTMLParserListener)listener).enterNg_app(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof HTMLParserListener ) ((HTMLParserListener)listener).exitNg_app(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof HTMLParserVisitor ) return ((HTMLParserVisitor<? extends T>)visitor).visitNg_app(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Ng_appContext ng_app() throws RecognitionException {
		Ng_appContext _localctx = new Ng_appContext(_ctx, getState());
		enterRule(_localctx, 16, RULE_ng_app);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(237);
			match(NG_APP);
			setState(238);
			match(NG_BEGINING);
			setState(239);
			match(NG_ID);
			setState(240);
			match(NG_SINGLE_QOUTE);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class Ng_forContext extends ParserRuleContext {
		public TerminalNode NGFOR() { return getToken(HTMLParser.NGFOR, 0); }
		public TerminalNode NG_BEGINING() { return getToken(HTMLParser.NG_BEGINING, 0); }
		public Ngfor_bodyContext ngfor_body() {
			return getRuleContext(Ngfor_bodyContext.class,0);
		}
		public TerminalNode NG_SINGLE_QOUTE() { return getToken(HTMLParser.NG_SINGLE_QOUTE, 0); }
		public Ng_forContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_ng_for; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof HTMLParserListener ) ((HTMLParserListener)listener).enterNg_for(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof HTMLParserListener ) ((HTMLParserListener)listener).exitNg_for(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof HTMLParserVisitor ) return ((HTMLParserVisitor<? extends T>)visitor).visitNg_for(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Ng_forContext ng_for() throws RecognitionException {
		Ng_forContext _localctx = new Ng_forContext(_ctx, getState());
		enterRule(_localctx, 18, RULE_ng_for);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(242);
			match(NGFOR);
			setState(243);
			match(NG_BEGINING);
			setState(244);
			ngfor_body();
			setState(245);
			match(NG_SINGLE_QOUTE);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class Ng_switchContext extends ParserRuleContext {
		public TerminalNode NG_SWITCH() { return getToken(HTMLParser.NG_SWITCH, 0); }
		public TerminalNode NG_BEGINING() { return getToken(HTMLParser.NG_BEGINING, 0); }
		public Switch_bodyContext switch_body() {
			return getRuleContext(Switch_bodyContext.class,0);
		}
		public TerminalNode NG_SINGLE_QOUTE() { return getToken(HTMLParser.NG_SINGLE_QOUTE, 0); }
		public Ng_switchContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_ng_switch; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof HTMLParserListener ) ((HTMLParserListener)listener).enterNg_switch(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof HTMLParserListener ) ((HTMLParserListener)listener).exitNg_switch(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof HTMLParserVisitor ) return ((HTMLParserVisitor<? extends T>)visitor).visitNg_switch(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Ng_switchContext ng_switch() throws RecognitionException {
		Ng_switchContext _localctx = new Ng_switchContext(_ctx, getState());
		enterRule(_localctx, 20, RULE_ng_switch);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(247);
			match(NG_SWITCH);
			setState(248);
			match(NG_BEGINING);
			setState(249);
			switch_body();
			setState(250);
			match(NG_SINGLE_QOUTE);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class Ng_ifContext extends ParserRuleContext {
		public TerminalNode NGIF() { return getToken(HTMLParser.NGIF, 0); }
		public TerminalNode NG_BEGINING() { return getToken(HTMLParser.NG_BEGINING, 0); }
		public ExpressionContext expression() {
			return getRuleContext(ExpressionContext.class,0);
		}
		public TerminalNode NG_SINGLE_QOUTE() { return getToken(HTMLParser.NG_SINGLE_QOUTE, 0); }
		public Ng_ifContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_ng_if; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof HTMLParserListener ) ((HTMLParserListener)listener).enterNg_if(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof HTMLParserListener ) ((HTMLParserListener)listener).exitNg_if(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof HTMLParserVisitor ) return ((HTMLParserVisitor<? extends T>)visitor).visitNg_if(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Ng_ifContext ng_if() throws RecognitionException {
		Ng_ifContext _localctx = new Ng_ifContext(_ctx, getState());
		enterRule(_localctx, 22, RULE_ng_if);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(252);
			match(NGIF);
			setState(253);
			match(NG_BEGINING);
			setState(254);
			expression(0);
			setState(255);
			match(NG_SINGLE_QOUTE);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class Ng_hideContext extends ParserRuleContext {
		public TerminalNode NGHIDE() { return getToken(HTMLParser.NGHIDE, 0); }
		public TerminalNode NG_BEGINING() { return getToken(HTMLParser.NG_BEGINING, 0); }
		public ExpressionContext expression() {
			return getRuleContext(ExpressionContext.class,0);
		}
		public TerminalNode NG_SINGLE_QOUTE() { return getToken(HTMLParser.NG_SINGLE_QOUTE, 0); }
		public Ng_hideContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_ng_hide; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof HTMLParserListener ) ((HTMLParserListener)listener).enterNg_hide(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof HTMLParserListener ) ((HTMLParserListener)listener).exitNg_hide(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof HTMLParserVisitor ) return ((HTMLParserVisitor<? extends T>)visitor).visitNg_hide(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Ng_hideContext ng_hide() throws RecognitionException {
		Ng_hideContext _localctx = new Ng_hideContext(_ctx, getState());
		enterRule(_localctx, 24, RULE_ng_hide);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(257);
			match(NGHIDE);
			setState(258);
			match(NG_BEGINING);
			setState(259);
			expression(0);
			setState(260);
			match(NG_SINGLE_QOUTE);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class Ng_showContext extends ParserRuleContext {
		public TerminalNode NGSHOW() { return getToken(HTMLParser.NGSHOW, 0); }
		public TerminalNode NG_BEGINING() { return getToken(HTMLParser.NG_BEGINING, 0); }
		public ExpressionContext expression() {
			return getRuleContext(ExpressionContext.class,0);
		}
		public TerminalNode NG_SINGLE_QOUTE() { return getToken(HTMLParser.NG_SINGLE_QOUTE, 0); }
		public Ng_showContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_ng_show; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof HTMLParserListener ) ((HTMLParserListener)listener).enterNg_show(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof HTMLParserListener ) ((HTMLParserListener)listener).exitNg_show(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof HTMLParserVisitor ) return ((HTMLParserVisitor<? extends T>)visitor).visitNg_show(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Ng_showContext ng_show() throws RecognitionException {
		Ng_showContext _localctx = new Ng_showContext(_ctx, getState());
		enterRule(_localctx, 26, RULE_ng_show);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(262);
			match(NGSHOW);
			setState(263);
			match(NG_BEGINING);
			setState(264);
			expression(0);
			setState(265);
			match(NG_SINGLE_QOUTE);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class Ng_switch_caseContext extends ParserRuleContext {
		public TerminalNode NG_SWITCH_CASE() { return getToken(HTMLParser.NG_SWITCH_CASE, 0); }
		public TerminalNode NG_BEGINING() { return getToken(HTMLParser.NG_BEGINING, 0); }
		public Switch_case_bodyContext switch_case_body() {
			return getRuleContext(Switch_case_bodyContext.class,0);
		}
		public TerminalNode NG_SINGLE_QOUTE() { return getToken(HTMLParser.NG_SINGLE_QOUTE, 0); }
		public Ng_switch_caseContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_ng_switch_case; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof HTMLParserListener ) ((HTMLParserListener)listener).enterNg_switch_case(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof HTMLParserListener ) ((HTMLParserListener)listener).exitNg_switch_case(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof HTMLParserVisitor ) return ((HTMLParserVisitor<? extends T>)visitor).visitNg_switch_case(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Ng_switch_caseContext ng_switch_case() throws RecognitionException {
		Ng_switch_caseContext _localctx = new Ng_switch_caseContext(_ctx, getState());
		enterRule(_localctx, 28, RULE_ng_switch_case);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(267);
			match(NG_SWITCH_CASE);
			setState(268);
			match(NG_BEGINING);
			setState(269);
			switch_case_body();
			setState(270);
			match(NG_SINGLE_QOUTE);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class Ng_switch_defaultContext extends ParserRuleContext {
		public TerminalNode NG_SWITCH_DEFAULT() { return getToken(HTMLParser.NG_SWITCH_DEFAULT, 0); }
		public Ng_switch_defaultContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_ng_switch_default; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof HTMLParserListener ) ((HTMLParserListener)listener).enterNg_switch_default(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof HTMLParserListener ) ((HTMLParserListener)listener).exitNg_switch_default(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof HTMLParserVisitor ) return ((HTMLParserVisitor<? extends T>)visitor).visitNg_switch_default(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Ng_switch_defaultContext ng_switch_default() throws RecognitionException {
		Ng_switch_defaultContext _localctx = new Ng_switch_defaultContext(_ctx, getState());
		enterRule(_localctx, 30, RULE_ng_switch_default);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(272);
			match(NG_SWITCH_DEFAULT);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class Switch_bodyContext extends ParserRuleContext {
		public ExpressionContext expression() {
			return getRuleContext(ExpressionContext.class,0);
		}
		public Switch_bodyContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_switch_body; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof HTMLParserListener ) ((HTMLParserListener)listener).enterSwitch_body(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof HTMLParserListener ) ((HTMLParserListener)listener).exitSwitch_body(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof HTMLParserVisitor ) return ((HTMLParserVisitor<? extends T>)visitor).visitSwitch_body(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Switch_bodyContext switch_body() throws RecognitionException {
		Switch_bodyContext _localctx = new Switch_bodyContext(_ctx, getState());
		enterRule(_localctx, 32, RULE_switch_body);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(274);
			expression(0);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class Switch_case_bodyContext extends ParserRuleContext {
		public ExpressionContext expression() {
			return getRuleContext(ExpressionContext.class,0);
		}
		public Switch_case_bodyContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_switch_case_body; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof HTMLParserListener ) ((HTMLParserListener)listener).enterSwitch_case_body(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof HTMLParserListener ) ((HTMLParserListener)listener).exitSwitch_case_body(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof HTMLParserVisitor ) return ((HTMLParserVisitor<? extends T>)visitor).visitSwitch_case_body(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Switch_case_bodyContext switch_case_body() throws RecognitionException {
		Switch_case_bodyContext _localctx = new Switch_case_bodyContext(_ctx, getState());
		enterRule(_localctx, 34, RULE_switch_case_body);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(276);
			expression(0);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class Ng_typeContext extends ParserRuleContext {
		public TerminalNode NG_TYPE() { return getToken(HTMLParser.NG_TYPE, 0); }
		public TerminalNode TYPE_BEGINNING() { return getToken(HTMLParser.TYPE_BEGINNING, 0); }
		public TerminalNode INPUT_TYPE() { return getToken(HTMLParser.INPUT_TYPE, 0); }
		public TerminalNode TYPE_QUOTE() { return getToken(HTMLParser.TYPE_QUOTE, 0); }
		public Ng_typeContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_ng_type; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof HTMLParserListener ) ((HTMLParserListener)listener).enterNg_type(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof HTMLParserListener ) ((HTMLParserListener)listener).exitNg_type(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof HTMLParserVisitor ) return ((HTMLParserVisitor<? extends T>)visitor).visitNg_type(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Ng_typeContext ng_type() throws RecognitionException {
		Ng_typeContext _localctx = new Ng_typeContext(_ctx, getState());
		enterRule(_localctx, 36, RULE_ng_type);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(278);
			match(NG_TYPE);
			setState(279);
			match(TYPE_BEGINNING);
			setState(280);
			match(INPUT_TYPE);
			setState(281);
			match(TYPE_QUOTE);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class Ng_modelContext extends ParserRuleContext {
		public TerminalNode NG_MODEL() { return getToken(HTMLParser.NG_MODEL, 0); }
		public TerminalNode NG_BEGINING() { return getToken(HTMLParser.NG_BEGINING, 0); }
		public ExpressionContext expression() {
			return getRuleContext(ExpressionContext.class,0);
		}
		public TerminalNode NG_SINGLE_QOUTE() { return getToken(HTMLParser.NG_SINGLE_QOUTE, 0); }
		public Ng_modelContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_ng_model; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof HTMLParserListener ) ((HTMLParserListener)listener).enterNg_model(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof HTMLParserListener ) ((HTMLParserListener)listener).exitNg_model(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof HTMLParserVisitor ) return ((HTMLParserVisitor<? extends T>)visitor).visitNg_model(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Ng_modelContext ng_model() throws RecognitionException {
		Ng_modelContext _localctx = new Ng_modelContext(_ctx, getState());
		enterRule(_localctx, 38, RULE_ng_model);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(283);
			match(NG_MODEL);
			setState(284);
			match(NG_BEGINING);
			setState(285);
			expression(0);
			setState(286);
			match(NG_SINGLE_QOUTE);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class Ng_eventContext extends ParserRuleContext {
		public TerminalNode NG_AT_EVENT() { return getToken(HTMLParser.NG_AT_EVENT, 0); }
		public TerminalNode NG_BEGINING() { return getToken(HTMLParser.NG_BEGINING, 0); }
		public ExpressionContext expression() {
			return getRuleContext(ExpressionContext.class,0);
		}
		public TerminalNode NG_SINGLE_QOUTE() { return getToken(HTMLParser.NG_SINGLE_QOUTE, 0); }
		public Ng_eventContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_ng_event; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof HTMLParserListener ) ((HTMLParserListener)listener).enterNg_event(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof HTMLParserListener ) ((HTMLParserListener)listener).exitNg_event(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof HTMLParserVisitor ) return ((HTMLParserVisitor<? extends T>)visitor).visitNg_event(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Ng_eventContext ng_event() throws RecognitionException {
		Ng_eventContext _localctx = new Ng_eventContext(_ctx, getState());
		enterRule(_localctx, 40, RULE_ng_event);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(288);
			match(NG_AT_EVENT);
			setState(289);
			match(NG_BEGINING);
			setState(290);
			expression(0);
			setState(291);
			match(NG_SINGLE_QOUTE);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class ParamsContext extends ParserRuleContext {
		public List<ExpressionContext> expression() {
			return getRuleContexts(ExpressionContext.class);
		}
		public ExpressionContext expression(int i) {
			return getRuleContext(ExpressionContext.class,i);
		}
		public List<TerminalNode> COMMA() { return getTokens(HTMLParser.COMMA); }
		public TerminalNode COMMA(int i) {
			return getToken(HTMLParser.COMMA, i);
		}
		public ParamsContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_params; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof HTMLParserListener ) ((HTMLParserListener)listener).enterParams(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof HTMLParserListener ) ((HTMLParserListener)listener).exitParams(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof HTMLParserVisitor ) return ((HTMLParserVisitor<? extends T>)visitor).visitParams(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ParamsContext params() throws RecognitionException {
		ParamsContext _localctx = new ParamsContext(_ctx, getState());
		enterRule(_localctx, 42, RULE_params);
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			{
			setState(293);
			expression(0);
			}
			setState(298);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,23,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					{
					{
					setState(294);
					match(COMMA);
					{
					setState(295);
					expression(0);
					}
					}
					} 
				}
				setState(300);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,23,_ctx);
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class Ng_listContext extends ParserRuleContext {
		public TerminalNode SQUARE_OPEN() { return getToken(HTMLParser.SQUARE_OPEN, 0); }
		public List<ExpressionContext> expression() {
			return getRuleContexts(ExpressionContext.class);
		}
		public ExpressionContext expression(int i) {
			return getRuleContext(ExpressionContext.class,i);
		}
		public TerminalNode SQUARE_CLOSE() { return getToken(HTMLParser.SQUARE_CLOSE, 0); }
		public List<TerminalNode> COMMA() { return getTokens(HTMLParser.COMMA); }
		public TerminalNode COMMA(int i) {
			return getToken(HTMLParser.COMMA, i);
		}
		public Ng_listContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_ng_list; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof HTMLParserListener ) ((HTMLParserListener)listener).enterNg_list(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof HTMLParserListener ) ((HTMLParserListener)listener).exitNg_list(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof HTMLParserVisitor ) return ((HTMLParserVisitor<? extends T>)visitor).visitNg_list(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Ng_listContext ng_list() throws RecognitionException {
		Ng_listContext _localctx = new Ng_listContext(_ctx, getState());
		enterRule(_localctx, 44, RULE_ng_list);
		int _la;
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(301);
			match(SQUARE_OPEN);
			setState(307);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,24,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					{
					{
					setState(302);
					expression(0);
					setState(303);
					match(COMMA);
					}
					} 
				}
				setState(309);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,24,_ctx);
			}
			setState(310);
			expression(0);
			setState(312);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==COMMA) {
				{
				setState(311);
				match(COMMA);
				}
			}

			setState(314);
			match(SQUARE_CLOSE);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class Map_valueContext extends ParserRuleContext {
		public TerminalNode NG_ID() { return getToken(HTMLParser.NG_ID, 0); }
		public TerminalNode COLON() { return getToken(HTMLParser.COLON, 0); }
		public ExpressionContext expression() {
			return getRuleContext(ExpressionContext.class,0);
		}
		public Map_valueContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_map_value; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof HTMLParserListener ) ((HTMLParserListener)listener).enterMap_value(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof HTMLParserListener ) ((HTMLParserListener)listener).exitMap_value(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof HTMLParserVisitor ) return ((HTMLParserVisitor<? extends T>)visitor).visitMap_value(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Map_valueContext map_value() throws RecognitionException {
		Map_valueContext _localctx = new Map_valueContext(_ctx, getState());
		enterRule(_localctx, 46, RULE_map_value);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(316);
			match(NG_ID);
			setState(317);
			match(COLON);
			setState(318);
			expression(0);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class MapContext extends ParserRuleContext {
		public TerminalNode CURLEY_BRACKET_OPEN() { return getToken(HTMLParser.CURLEY_BRACKET_OPEN, 0); }
		public List<Map_valueContext> map_value() {
			return getRuleContexts(Map_valueContext.class);
		}
		public Map_valueContext map_value(int i) {
			return getRuleContext(Map_valueContext.class,i);
		}
		public TerminalNode CURLEY_BRACKET_CLOSE() { return getToken(HTMLParser.CURLEY_BRACKET_CLOSE, 0); }
		public List<TerminalNode> COMMA() { return getTokens(HTMLParser.COMMA); }
		public TerminalNode COMMA(int i) {
			return getToken(HTMLParser.COMMA, i);
		}
		public MapContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_map; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof HTMLParserListener ) ((HTMLParserListener)listener).enterMap(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof HTMLParserListener ) ((HTMLParserListener)listener).exitMap(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof HTMLParserVisitor ) return ((HTMLParserVisitor<? extends T>)visitor).visitMap(this);
			else return visitor.visitChildren(this);
		}
	}

	public final MapContext map() throws RecognitionException {
		MapContext _localctx = new MapContext(_ctx, getState());
		enterRule(_localctx, 48, RULE_map);
		int _la;
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(320);
			match(CURLEY_BRACKET_OPEN);
			setState(321);
			map_value();
			setState(326);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,26,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					{
					{
					setState(322);
					match(COMMA);
					setState(323);
					map_value();
					}
					} 
				}
				setState(328);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,26,_ctx);
			}
			setState(330);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==COMMA) {
				{
				setState(329);
				match(COMMA);
				}
			}

			setState(332);
			match(CURLEY_BRACKET_CLOSE);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class Ngfor_bodyContext extends ParserRuleContext {
		public List<TerminalNode> NG_ID() { return getTokens(HTMLParser.NG_ID); }
		public TerminalNode NG_ID(int i) {
			return getToken(HTMLParser.NG_ID, i);
		}
		public TerminalNode NG_IN() { return getToken(HTMLParser.NG_IN, 0); }
		public List<ExpressionContext> expression() {
			return getRuleContexts(ExpressionContext.class);
		}
		public ExpressionContext expression(int i) {
			return getRuleContext(ExpressionContext.class,i);
		}
		public TerminalNode SEMI_COLON() { return getToken(HTMLParser.SEMI_COLON, 0); }
		public TerminalNode EQUAL_SIGN() { return getToken(HTMLParser.EQUAL_SIGN, 0); }
		public PairContext pair() {
			return getRuleContext(PairContext.class,0);
		}
		public Ngfor_bodyContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_ngfor_body; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof HTMLParserListener ) ((HTMLParserListener)listener).enterNgfor_body(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof HTMLParserListener ) ((HTMLParserListener)listener).exitNgfor_body(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof HTMLParserVisitor ) return ((HTMLParserVisitor<? extends T>)visitor).visitNgfor_body(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Ngfor_bodyContext ngfor_body() throws RecognitionException {
		Ngfor_bodyContext _localctx = new Ngfor_bodyContext(_ctx, getState());
		enterRule(_localctx, 50, RULE_ngfor_body);
		int _la;
		try {
			setState(347);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,29,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(334);
				match(NG_ID);
				setState(335);
				match(NG_IN);
				setState(336);
				expression(0);
				setState(341);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==SEMI_COLON) {
					{
					setState(337);
					match(SEMI_COLON);
					setState(338);
					match(NG_ID);
					setState(339);
					match(EQUAL_SIGN);
					setState(340);
					expression(0);
					}
				}

				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(343);
				pair();
				setState(344);
				match(NG_IN);
				setState(345);
				expression(0);
				}
				break;
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class PairContext extends ParserRuleContext {
		public List<TerminalNode> NG_ID() { return getTokens(HTMLParser.NG_ID); }
		public TerminalNode NG_ID(int i) {
			return getToken(HTMLParser.NG_ID, i);
		}
		public TerminalNode COMMA() { return getToken(HTMLParser.COMMA, 0); }
		public PairContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_pair; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof HTMLParserListener ) ((HTMLParserListener)listener).enterPair(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof HTMLParserListener ) ((HTMLParserListener)listener).exitPair(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof HTMLParserVisitor ) return ((HTMLParserVisitor<? extends T>)visitor).visitPair(this);
			else return visitor.visitChildren(this);
		}
	}

	public final PairContext pair() throws RecognitionException {
		PairContext _localctx = new PairContext(_ctx, getState());
		enterRule(_localctx, 52, RULE_pair);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(349);
			match(NG_ID);
			setState(350);
			match(COMMA);
			setState(351);
			match(NG_ID);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class HtmlChardataContext extends ParserRuleContext {
		public TerminalNode HTML_TEXT() { return getToken(HTMLParser.HTML_TEXT, 0); }
		public TerminalNode SEA_WS() { return getToken(HTMLParser.SEA_WS, 0); }
		public HtmlChardataContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_htmlChardata; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof HTMLParserListener ) ((HTMLParserListener)listener).enterHtmlChardata(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof HTMLParserListener ) ((HTMLParserListener)listener).exitHtmlChardata(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof HTMLParserVisitor ) return ((HTMLParserVisitor<? extends T>)visitor).visitHtmlChardata(this);
			else return visitor.visitChildren(this);
		}
	}

	public final HtmlChardataContext htmlChardata() throws RecognitionException {
		HtmlChardataContext _localctx = new HtmlChardataContext(_ctx, getState());
		enterRule(_localctx, 54, RULE_htmlChardata);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(353);
			_la = _input.LA(1);
			if ( !(_la==SEA_WS || _la==HTML_TEXT) ) {
			_errHandler.recoverInline(this);
			}
			else {
				if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
				_errHandler.reportMatch(this);
				consume();
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class HtmlMiscContext extends ParserRuleContext {
		public HtmlCommentContext htmlComment() {
			return getRuleContext(HtmlCommentContext.class,0);
		}
		public TerminalNode SEA_WS() { return getToken(HTMLParser.SEA_WS, 0); }
		public HtmlMiscContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_htmlMisc; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof HTMLParserListener ) ((HTMLParserListener)listener).enterHtmlMisc(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof HTMLParserListener ) ((HTMLParserListener)listener).exitHtmlMisc(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof HTMLParserVisitor ) return ((HTMLParserVisitor<? extends T>)visitor).visitHtmlMisc(this);
			else return visitor.visitChildren(this);
		}
	}

	public final HtmlMiscContext htmlMisc() throws RecognitionException {
		HtmlMiscContext _localctx = new HtmlMiscContext(_ctx, getState());
		enterRule(_localctx, 56, RULE_htmlMisc);
		try {
			setState(357);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case HTML_COMMENT:
			case HTML_CONDITIONAL_COMMENT:
				enterOuterAlt(_localctx, 1);
				{
				setState(355);
				htmlComment();
				}
				break;
			case SEA_WS:
				enterOuterAlt(_localctx, 2);
				{
				setState(356);
				match(SEA_WS);
				}
				break;
			default:
				throw new NoViableAltException(this);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class HtmlCommentContext extends ParserRuleContext {
		public TerminalNode HTML_COMMENT() { return getToken(HTMLParser.HTML_COMMENT, 0); }
		public TerminalNode HTML_CONDITIONAL_COMMENT() { return getToken(HTMLParser.HTML_CONDITIONAL_COMMENT, 0); }
		public HtmlCommentContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_htmlComment; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof HTMLParserListener ) ((HTMLParserListener)listener).enterHtmlComment(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof HTMLParserListener ) ((HTMLParserListener)listener).exitHtmlComment(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof HTMLParserVisitor ) return ((HTMLParserVisitor<? extends T>)visitor).visitHtmlComment(this);
			else return visitor.visitChildren(this);
		}
	}

	public final HtmlCommentContext htmlComment() throws RecognitionException {
		HtmlCommentContext _localctx = new HtmlCommentContext(_ctx, getState());
		enterRule(_localctx, 58, RULE_htmlComment);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(359);
			_la = _input.LA(1);
			if ( !(_la==HTML_COMMENT || _la==HTML_CONDITIONAL_COMMENT) ) {
			_errHandler.recoverInline(this);
			}
			else {
				if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
				_errHandler.reportMatch(this);
				consume();
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class ScriptContext extends ParserRuleContext {
		public TerminalNode SCRIPT_OPEN() { return getToken(HTMLParser.SCRIPT_OPEN, 0); }
		public TerminalNode SCRIPT_BODY() { return getToken(HTMLParser.SCRIPT_BODY, 0); }
		public TerminalNode SCRIPT_SHORT_BODY() { return getToken(HTMLParser.SCRIPT_SHORT_BODY, 0); }
		public ScriptContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_script; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof HTMLParserListener ) ((HTMLParserListener)listener).enterScript(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof HTMLParserListener ) ((HTMLParserListener)listener).exitScript(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof HTMLParserVisitor ) return ((HTMLParserVisitor<? extends T>)visitor).visitScript(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ScriptContext script() throws RecognitionException {
		ScriptContext _localctx = new ScriptContext(_ctx, getState());
		enterRule(_localctx, 60, RULE_script);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(361);
			match(SCRIPT_OPEN);
			setState(362);
			_la = _input.LA(1);
			if ( !(_la==SCRIPT_BODY || _la==SCRIPT_SHORT_BODY) ) {
			_errHandler.recoverInline(this);
			}
			else {
				if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
				_errHandler.reportMatch(this);
				consume();
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class StyleContext extends ParserRuleContext {
		public TerminalNode STYLE_OPEN() { return getToken(HTMLParser.STYLE_OPEN, 0); }
		public TerminalNode STYLE_BODY() { return getToken(HTMLParser.STYLE_BODY, 0); }
		public TerminalNode STYLE_SHORT_BODY() { return getToken(HTMLParser.STYLE_SHORT_BODY, 0); }
		public StyleContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_style; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof HTMLParserListener ) ((HTMLParserListener)listener).enterStyle(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof HTMLParserListener ) ((HTMLParserListener)listener).exitStyle(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof HTMLParserVisitor ) return ((HTMLParserVisitor<? extends T>)visitor).visitStyle(this);
			else return visitor.visitChildren(this);
		}
	}

	public final StyleContext style() throws RecognitionException {
		StyleContext _localctx = new StyleContext(_ctx, getState());
		enterRule(_localctx, 62, RULE_style);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(364);
			match(STYLE_OPEN);
			setState(365);
			_la = _input.LA(1);
			if ( !(_la==STYLE_BODY || _la==STYLE_SHORT_BODY) ) {
			_errHandler.recoverInline(this);
			}
			else {
				if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
				_errHandler.reportMatch(this);
				consume();
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public boolean sempred(RuleContext _localctx, int ruleIndex, int predIndex) {
		switch (ruleIndex) {
		case 7:
			return expression_sempred((ExpressionContext)_localctx, predIndex);
		}
		return true;
	}
	private boolean expression_sempred(ExpressionContext _localctx, int predIndex) {
		switch (predIndex) {
		case 0:
			return precpred(_ctx, 20);
		case 1:
			return precpred(_ctx, 19);
		case 2:
			return precpred(_ctx, 18);
		case 3:
			return precpred(_ctx, 17);
		case 4:
			return precpred(_ctx, 16);
		case 5:
			return precpred(_ctx, 15);
		case 6:
			return precpred(_ctx, 14);
		case 7:
			return precpred(_ctx, 13);
		case 8:
			return precpred(_ctx, 5);
		case 9:
			return precpred(_ctx, 2);
		}
		return true;
	}

	public static final String _serializedATN =
		"\3\u608b\ua72a\u8133\ub9ed\u417c\u3be7\u7786\u5964\3P\u0172\4\2\t\2\4"+
		"\3\t\3\4\4\t\4\4\5\t\5\4\6\t\6\4\7\t\7\4\b\t\b\4\t\t\t\4\n\t\n\4\13\t"+
		"\13\4\f\t\f\4\r\t\r\4\16\t\16\4\17\t\17\4\20\t\20\4\21\t\21\4\22\t\22"+
		"\4\23\t\23\4\24\t\24\4\25\t\25\4\26\t\26\4\27\t\27\4\30\t\30\4\31\t\31"+
		"\4\32\t\32\4\33\t\33\4\34\t\34\4\35\t\35\4\36\t\36\4\37\t\37\4 \t \4!"+
		"\t!\3\2\7\2D\n\2\f\2\16\2G\13\2\3\2\5\2J\n\2\3\2\7\2M\n\2\f\2\16\2P\13"+
		"\2\3\2\5\2S\n\2\3\2\7\2V\n\2\f\2\16\2Y\13\2\3\2\7\2\\\n\2\f\2\16\2_\13"+
		"\2\3\3\3\3\3\4\7\4d\n\4\f\4\16\4g\13\4\3\4\3\4\7\4k\n\4\f\4\16\4n\13\4"+
		"\3\5\3\5\3\5\7\5s\n\5\f\5\16\5v\13\5\3\5\3\5\3\5\3\5\3\5\3\5\3\5\5\5\177"+
		"\n\5\3\5\5\5\u0082\n\5\3\5\3\5\3\5\5\5\u0087\n\5\3\6\5\6\u008a\n\6\3\6"+
		"\3\6\3\6\3\6\5\6\u0090\n\6\3\6\5\6\u0093\n\6\7\6\u0095\n\6\f\6\16\6\u0098"+
		"\13\6\3\7\3\7\3\7\3\7\3\b\3\b\3\b\3\b\3\b\3\b\3\b\3\b\3\b\3\b\3\b\3\b"+
		"\3\b\3\b\5\b\u00ac\n\b\5\b\u00ae\n\b\3\t\3\t\3\t\3\t\3\t\3\t\3\t\3\t\3"+
		"\t\3\t\3\t\3\t\3\t\3\t\3\t\3\t\5\t\u00c0\n\t\3\t\3\t\3\t\3\t\3\t\3\t\3"+
		"\t\3\t\3\t\3\t\3\t\3\t\3\t\3\t\3\t\3\t\3\t\3\t\3\t\3\t\3\t\3\t\3\t\3\t"+
		"\5\t\u00da\n\t\3\t\3\t\3\t\3\t\3\t\3\t\5\t\u00e2\n\t\3\t\3\t\3\t\3\t\3"+
		"\t\3\t\3\t\7\t\u00eb\n\t\f\t\16\t\u00ee\13\t\3\n\3\n\3\n\3\n\3\n\3\13"+
		"\3\13\3\13\3\13\3\13\3\f\3\f\3\f\3\f\3\f\3\r\3\r\3\r\3\r\3\r\3\16\3\16"+
		"\3\16\3\16\3\16\3\17\3\17\3\17\3\17\3\17\3\20\3\20\3\20\3\20\3\20\3\21"+
		"\3\21\3\22\3\22\3\23\3\23\3\24\3\24\3\24\3\24\3\24\3\25\3\25\3\25\3\25"+
		"\3\25\3\26\3\26\3\26\3\26\3\26\3\27\3\27\3\27\7\27\u012b\n\27\f\27\16"+
		"\27\u012e\13\27\3\30\3\30\3\30\3\30\7\30\u0134\n\30\f\30\16\30\u0137\13"+
		"\30\3\30\3\30\5\30\u013b\n\30\3\30\3\30\3\31\3\31\3\31\3\31\3\32\3\32"+
		"\3\32\3\32\7\32\u0147\n\32\f\32\16\32\u014a\13\32\3\32\5\32\u014d\n\32"+
		"\3\32\3\32\3\33\3\33\3\33\3\33\3\33\3\33\3\33\5\33\u0158\n\33\3\33\3\33"+
		"\3\33\3\33\5\33\u015e\n\33\3\34\3\34\3\34\3\34\3\35\3\35\3\36\3\36\5\36"+
		"\u0168\n\36\3\37\3\37\3 \3 \3 \3!\3!\3!\3!\2\3\20\"\2\4\6\b\n\f\16\20"+
		"\22\24\26\30\32\34\36 \"$&(*,.\60\62\64\668:<>@\2\7\3\2\b\t\4\2\t\t\16"+
		"\16\3\2\3\4\3\2&\'\3\2()\2\u018e\2E\3\2\2\2\4`\3\2\2\2\6e\3\2\2\2\b\u0086"+
		"\3\2\2\2\n\u0089\3\2\2\2\f\u0099\3\2\2\2\16\u00ad\3\2\2\2\20\u00bf\3\2"+
		"\2\2\22\u00ef\3\2\2\2\24\u00f4\3\2\2\2\26\u00f9\3\2\2\2\30\u00fe\3\2\2"+
		"\2\32\u0103\3\2\2\2\34\u0108\3\2\2\2\36\u010d\3\2\2\2 \u0112\3\2\2\2\""+
		"\u0114\3\2\2\2$\u0116\3\2\2\2&\u0118\3\2\2\2(\u011d\3\2\2\2*\u0122\3\2"+
		"\2\2,\u0127\3\2\2\2.\u012f\3\2\2\2\60\u013e\3\2\2\2\62\u0142\3\2\2\2\64"+
		"\u015d\3\2\2\2\66\u015f\3\2\2\28\u0163\3\2\2\2:\u0167\3\2\2\2<\u0169\3"+
		"\2\2\2>\u016b\3\2\2\2@\u016e\3\2\2\2BD\5\4\3\2CB\3\2\2\2DG\3\2\2\2EC\3"+
		"\2\2\2EF\3\2\2\2FI\3\2\2\2GE\3\2\2\2HJ\7\5\2\2IH\3\2\2\2IJ\3\2\2\2JN\3"+
		"\2\2\2KM\5\4\3\2LK\3\2\2\2MP\3\2\2\2NL\3\2\2\2NO\3\2\2\2OR\3\2\2\2PN\3"+
		"\2\2\2QS\7\7\2\2RQ\3\2\2\2RS\3\2\2\2SW\3\2\2\2TV\5\4\3\2UT\3\2\2\2VY\3"+
		"\2\2\2WU\3\2\2\2WX\3\2\2\2X]\3\2\2\2YW\3\2\2\2Z\\\5\6\4\2[Z\3\2\2\2\\"+
		"_\3\2\2\2][\3\2\2\2]^\3\2\2\2^\3\3\2\2\2_]\3\2\2\2`a\t\2\2\2a\5\3\2\2"+
		"\2bd\5:\36\2cb\3\2\2\2dg\3\2\2\2ec\3\2\2\2ef\3\2\2\2fh\3\2\2\2ge\3\2\2"+
		"\2hl\5\b\5\2ik\5:\36\2ji\3\2\2\2kn\3\2\2\2lj\3\2\2\2lm\3\2\2\2m\7\3\2"+
		"\2\2nl\3\2\2\2op\7\f\2\2pt\7$\2\2qs\5\16\b\2rq\3\2\2\2sv\3\2\2\2tr\3\2"+
		"\2\2tu\3\2\2\2u\u0081\3\2\2\2vt\3\2\2\2w~\7 \2\2xy\5\n\6\2yz\7\f\2\2z"+
		"{\7\"\2\2{|\7$\2\2|}\7 \2\2}\177\3\2\2\2~x\3\2\2\2~\177\3\2\2\2\177\u0082"+
		"\3\2\2\2\u0080\u0082\7!\2\2\u0081w\3\2\2\2\u0081\u0080\3\2\2\2\u0082\u0087"+
		"\3\2\2\2\u0083\u0087\7\b\2\2\u0084\u0087\5> \2\u0085\u0087\5@!\2\u0086"+
		"o\3\2\2\2\u0086\u0083\3\2\2\2\u0086\u0084\3\2\2\2\u0086\u0085\3\2\2\2"+
		"\u0087\t\3\2\2\2\u0088\u008a\58\35\2\u0089\u0088\3\2\2\2\u0089\u008a\3"+
		"\2\2\2\u008a\u0096\3\2\2\2\u008b\u0090\5\f\7\2\u008c\u0090\5\b\5\2\u008d"+
		"\u0090\7\6\2\2\u008e\u0090\5<\37\2\u008f\u008b\3\2\2\2\u008f\u008c\3\2"+
		"\2\2\u008f\u008d\3\2\2\2\u008f\u008e\3\2\2\2\u0090\u0092\3\2\2\2\u0091"+
		"\u0093\58\35\2\u0092\u0091\3\2\2\2\u0092\u0093\3\2\2\2\u0093\u0095\3\2"+
		"\2\2\u0094\u008f\3\2\2\2\u0095\u0098\3\2\2\2\u0096\u0094\3\2\2\2\u0096"+
		"\u0097\3\2\2\2\u0097\13\3\2\2\2\u0098\u0096\3\2\2\2\u0099\u009a\7\r\2"+
		"\2\u009a\u009b\5\20\t\2\u009b\u009c\7G\2\2\u009c\r\3\2\2\2\u009d\u00ae"+
		"\5\22\n\2\u009e\u00ae\5\24\13\2\u009f\u00ae\5\26\f\2\u00a0\u00ae\5\36"+
		"\20\2\u00a1\u00ae\5 \21\2\u00a2\u00ae\5\30\r\2\u00a3\u00ae\5\32\16\2\u00a4"+
		"\u00ae\5\34\17\2\u00a5\u00ae\5&\24\2\u00a6\u00ae\5(\25\2\u00a7\u00ae\5"+
		"*\26\2\u00a8\u00ab\7$\2\2\u00a9\u00aa\7#\2\2\u00aa\u00ac\7*\2\2\u00ab"+
		"\u00a9\3\2\2\2\u00ab\u00ac\3\2\2\2\u00ac\u00ae\3\2\2\2\u00ad\u009d\3\2"+
		"\2\2\u00ad\u009e\3\2\2\2\u00ad\u009f\3\2\2\2\u00ad\u00a0\3\2\2\2\u00ad"+
		"\u00a1\3\2\2\2\u00ad\u00a2\3\2\2\2\u00ad\u00a3\3\2\2\2\u00ad\u00a4\3\2"+
		"\2\2\u00ad\u00a5\3\2\2\2\u00ad\u00a6\3\2\2\2\u00ad\u00a7\3\2\2\2\u00ad"+
		"\u00a8\3\2\2\2\u00ae\17\3\2\2\2\u00af\u00b0\b\t\1\2\u00b0\u00c0\7.\2\2"+
		"\u00b1\u00c0\7>\2\2\u00b2\u00c0\7?\2\2\u00b3\u00c0\7@\2\2\u00b4\u00c0"+
		"\7,\2\2\u00b5\u00c0\5.\30\2\u00b6\u00c0\5\62\32\2\u00b7\u00b8\78\2\2\u00b8"+
		"\u00c0\5\20\t\6\u00b9\u00ba\79\2\2\u00ba\u00c0\5\20\t\5\u00bb\u00bc\7"+
		"\62\2\2\u00bc\u00bd\5\20\t\2\u00bd\u00be\7\63\2\2\u00be\u00c0\3\2\2\2"+
		"\u00bf\u00af\3\2\2\2\u00bf\u00b1\3\2\2\2\u00bf\u00b2\3\2\2\2\u00bf\u00b3"+
		"\3\2\2\2\u00bf\u00b4\3\2\2\2\u00bf\u00b5\3\2\2\2\u00bf\u00b6\3\2\2\2\u00bf"+
		"\u00b7\3\2\2\2\u00bf\u00b9\3\2\2\2\u00bf\u00bb\3\2\2\2\u00c0\u00ec\3\2"+
		"\2\2\u00c1\u00c2\f\26\2\2\u00c2\u00c3\7\66\2\2\u00c3\u00eb\5\20\t\27\u00c4"+
		"\u00c5\f\25\2\2\u00c5\u00c6\7\67\2\2\u00c6\u00eb\5\20\t\26\u00c7\u00c8"+
		"\f\24\2\2\u00c8\u00c9\7:\2\2\u00c9\u00eb\5\20\t\25\u00ca\u00cb\f\23\2"+
		"\2\u00cb\u00cc\7E\2\2\u00cc\u00cd\5\20\t\2\u00cd\u00ce\7C\2\2\u00ce\u00cf"+
		"\5\20\t\24\u00cf\u00eb\3\2\2\2\u00d0\u00d1\f\22\2\2\u00d1\u00d2\7<\2\2"+
		"\u00d2\u00eb\5\20\t\23\u00d3\u00d4\f\21\2\2\u00d4\u00d5\7;\2\2\u00d5\u00eb"+
		"\5\20\t\22\u00d6\u00d7\f\20\2\2\u00d7\u00d9\7\62\2\2\u00d8\u00da\5,\27"+
		"\2\u00d9\u00d8\3\2\2\2\u00d9\u00da\3\2\2\2\u00da\u00db\3\2\2\2\u00db\u00eb"+
		"\7\63\2\2\u00dc\u00dd\f\17\2\2\u00dd\u00de\7F\2\2\u00de\u00e1\5\20\t\2"+
		"\u00df\u00e0\7C\2\2\u00e0\u00e2\5,\27\2\u00e1\u00df\3\2\2\2\u00e1\u00e2"+
		"\3\2\2\2\u00e2\u00eb\3\2\2\2\u00e3\u00e4\f\7\2\2\u00e4\u00e5\7\60\2\2"+
		"\u00e5\u00e6\5\20\t\2\u00e6\u00e7\7\61\2\2\u00e7\u00eb\3\2\2\2\u00e8\u00e9"+
		"\f\4\2\2\u00e9\u00eb\79\2\2\u00ea\u00c1\3\2\2\2\u00ea\u00c4\3\2\2\2\u00ea"+
		"\u00c7\3\2\2\2\u00ea\u00ca\3\2\2\2\u00ea\u00d0\3\2\2\2\u00ea\u00d3\3\2"+
		"\2\2\u00ea\u00d6\3\2\2\2\u00ea\u00dc\3\2\2\2\u00ea\u00e3\3\2\2\2\u00ea"+
		"\u00e8\3\2\2\2\u00eb\u00ee\3\2\2\2\u00ec\u00ea\3\2\2\2\u00ec\u00ed\3\2"+
		"\2\2\u00ed\21\3\2\2\2\u00ee\u00ec\3\2\2\2\u00ef\u00f0\7\17\2\2\u00f0\u00f1"+
		"\7\32\2\2\u00f1\u00f2\7.\2\2\u00f2\u00f3\7/\2\2\u00f3\23\3\2\2\2\u00f4"+
		"\u00f5\7\35\2\2\u00f5\u00f6\7\32\2\2\u00f6\u00f7\5\64\33\2\u00f7\u00f8"+
		"\7/\2\2\u00f8\25\3\2\2\2\u00f9\u00fa\7\23\2\2\u00fa\u00fb\7\32\2\2\u00fb"+
		"\u00fc\5\"\22\2\u00fc\u00fd\7/\2\2\u00fd\27\3\2\2\2\u00fe\u00ff\7\22\2"+
		"\2\u00ff\u0100\7\32\2\2\u0100\u0101\5\20\t\2\u0101\u0102\7/\2\2\u0102"+
		"\31\3\2\2\2\u0103\u0104\7\21\2\2\u0104\u0105\7\32\2\2\u0105\u0106\5\20"+
		"\t\2\u0106\u0107\7/\2\2\u0107\33\3\2\2\2\u0108\u0109\7\20\2\2\u0109\u010a"+
		"\7\32\2\2\u010a\u010b\5\20\t\2\u010b\u010c\7/\2\2\u010c\35\3\2\2\2\u010d"+
		"\u010e\7\24\2\2\u010e\u010f\7\32\2\2\u010f\u0110\5$\23\2\u0110\u0111\7"+
		"/\2\2\u0111\37\3\2\2\2\u0112\u0113\7\25\2\2\u0113!\3\2\2\2\u0114\u0115"+
		"\5\20\t\2\u0115#\3\2\2\2\u0116\u0117\5\20\t\2\u0117%\3\2\2\2\u0118\u0119"+
		"\7\26\2\2\u0119\u011a\7N\2\2\u011a\u011b\7O\2\2\u011b\u011c\7P\2\2\u011c"+
		"\'\3\2\2\2\u011d\u011e\7\27\2\2\u011e\u011f\7\32\2\2\u011f\u0120\5\20"+
		"\t\2\u0120\u0121\7/\2\2\u0121)\3\2\2\2\u0122\u0123\7\30\2\2\u0123\u0124"+
		"\7\32\2\2\u0124\u0125\5\20\t\2\u0125\u0126\7/\2\2\u0126+\3\2\2\2\u0127"+
		"\u012c\5\20\t\2\u0128\u0129\7D\2\2\u0129\u012b\5\20\t\2\u012a\u0128\3"+
		"\2\2\2\u012b\u012e\3\2\2\2\u012c\u012a\3\2\2\2\u012c\u012d\3\2\2\2\u012d"+
		"-\3\2\2\2\u012e\u012c\3\2\2\2\u012f\u0135\7\60\2\2\u0130\u0131\5\20\t"+
		"\2\u0131\u0132\7D\2\2\u0132\u0134\3\2\2\2\u0133\u0130\3\2\2\2\u0134\u0137"+
		"\3\2\2\2\u0135\u0133\3\2\2\2\u0135\u0136\3\2\2\2\u0136\u0138\3\2\2\2\u0137"+
		"\u0135\3\2\2\2\u0138\u013a\5\20\t\2\u0139\u013b\7D\2\2\u013a\u0139\3\2"+
		"\2\2\u013a\u013b\3\2\2\2\u013b\u013c\3\2\2\2\u013c\u013d\7\61\2\2\u013d"+
		"/\3\2\2\2\u013e\u013f\7.\2\2\u013f\u0140\7C\2\2\u0140\u0141\5\20\t\2\u0141"+
		"\61\3\2\2\2\u0142\u0143\7\64\2\2\u0143\u0148\5\60\31\2\u0144\u0145\7D"+
		"\2\2\u0145\u0147\5\60\31\2\u0146\u0144\3\2\2\2\u0147\u014a\3\2\2\2\u0148"+
		"\u0146\3\2\2\2\u0148\u0149\3\2\2\2\u0149\u014c\3\2\2\2\u014a\u0148\3\2"+
		"\2\2\u014b\u014d\7D\2\2\u014c\u014b\3\2\2\2\u014c\u014d\3\2\2\2\u014d"+
		"\u014e\3\2\2\2\u014e\u014f\7\65\2\2\u014f\63\3\2\2\2\u0150\u0151\7.\2"+
		"\2\u0151\u0152\7-\2\2\u0152\u0157\5\20\t\2\u0153\u0154\7B\2\2\u0154\u0155"+
		"\7.\2\2\u0155\u0156\7A\2\2\u0156\u0158\5\20\t\2\u0157\u0153\3\2\2\2\u0157"+
		"\u0158\3\2\2\2\u0158\u015e\3\2\2\2\u0159\u015a\5\66\34\2\u015a\u015b\7"+
		"-\2\2\u015b\u015c\5\20\t\2\u015c\u015e\3\2\2\2\u015d\u0150\3\2\2\2\u015d"+
		"\u0159\3\2\2\2\u015e\65\3\2\2\2\u015f\u0160\7.\2\2\u0160\u0161\7D\2\2"+
		"\u0161\u0162\7.\2\2\u0162\67\3\2\2\2\u0163\u0164\t\3\2\2\u01649\3\2\2"+
		"\2\u0165\u0168\5<\37\2\u0166\u0168\7\t\2\2\u0167\u0165\3\2\2\2\u0167\u0166"+
		"\3\2\2\2\u0168;\3\2\2\2\u0169\u016a\t\4\2\2\u016a=\3\2\2\2\u016b\u016c"+
		"\7\n\2\2\u016c\u016d\t\5\2\2\u016d?\3\2\2\2\u016e\u016f\7\13\2\2\u016f"+
		"\u0170\t\6\2\2\u0170A\3\2\2\2!EINRW]elt~\u0081\u0086\u0089\u008f\u0092"+
		"\u0096\u00ab\u00ad\u00bf\u00d9\u00e1\u00ea\u00ec\u012c\u0135\u013a\u0148"+
		"\u014c\u0157\u015d\u0167";
	public static final ATN _ATN =
		new ATNDeserializer().deserialize(_serializedATN.toCharArray());
	static {
		_decisionToDFA = new DFA[_ATN.getNumberOfDecisions()];
		for (int i = 0; i < _ATN.getNumberOfDecisions(); i++) {
			_decisionToDFA[i] = new DFA(_ATN.getDecisionState(i), i);
		}
	}
}