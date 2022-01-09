parser grammar HTMLParser;

options { tokenVocab=HTMLLexer; }

htmlDocument
    : scriptletOrSeaWs* XML? scriptletOrSeaWs* DTD? scriptletOrSeaWs* htmlElements*
    ;

scriptletOrSeaWs
    : SCRIPTLET
    | SEA_WS
    ;

htmlElements
    : htmlMisc* htmlElement htmlMisc*
    ;

htmlElement
    : TAG_OPEN TAG_NAME htmlAttribute*
      (TAG_CLOSE (htmlContent TAG_OPEN TAG_SLASH TAG_NAME TAG_CLOSE)? | TAG_SLASH_CLOSE)
    | SCRIPTLET
    | script
    | style
    ;

htmlContent
    : (htmlChardata)? ((mustache |htmlElement | CDATA | htmlComment) htmlChardata?)*
    ;
mustache
    :MUSTACHE_OPEN expression MUSTACHE_CLOSE
    ;

htmlAttribute
    : ng_app
    | ng_for
    | ng_switch
    | ng_switch_case
    | ng_switch_default
    | ng_if
    | ng_hide
    | ng_show
    | ng_type
    | ng_model
    | ng_event
    | TAG_NAME (TAG_EQUALS  ATTVALUE_VALUE)?
    ;
expression
       : expression DOT expression                                    #VariableConcatExpression
       | expression NG_OPERATOR_TWO_OPERAND expression                #TwoOperandsConditionExpression
       | expression CONDITIONAL_CONCAT_OPERATOR expression            #ConcatConditionExpression
       | expression QUESTION_MARK expression COLON expression         #TernaryExpression
       | expression MULTIPLICATIVE_OPERATOR expression                #MathematicalExpression
       | expression ADDITIVE_OPERATOR expression                      #MathematicalExpression
       | expression (BRACKET_OPEN (params)? BRACKET_CLOSE)            #FunctionCallExpression
       | expression PIPE expression COLON params                      #PipeExpression
       | NG_ID                                                        #VariableNameExpression
       | NG_DECIMAL                                                   #LiteralNumericExpression
       | NG_CHAR                                                      #LiteralCharExpression
       | NG_STRING                                                    #LiteralStringExpression
       | NG_BOOLEAN                                                   #LiteralBooleanExpression
       | ng_list                                                      #LiteralArrayExpression
       | map                                                          #LiteralObjectExpression
       | expression (SQUARE_OPEN expression SQUARE_CLOSE)             #IndexedVariableExpression
       | NG_ONE_LOGICAL_OPERAND expression                           #OneOperandConditionExpression
       | NG_ONE_VALUABLE_OPERAND expression                             #OneOperandValuableExpression
       | expression NG_ONE_VALUABLE_OPERAND                             #OneOperandValuableExpression
       | BRACKET_OPEN expression BRACKET_CLOSE                        #ParenthesizedExpression
       ;

ng_app
    : NG_APP NG_BEGINING NG_ID NG_SINGLE_QOUTE
    ;

ng_for
    : NGFOR NG_BEGINING ngfor_body NG_SINGLE_QOUTE
    ;

ng_switch
    : NG_SWITCH NG_BEGINING switch_body NG_SINGLE_QOUTE
    ;

ng_if
    :  NGIF NG_BEGINING expression NG_SINGLE_QOUTE
    ;
ng_hide
    : NGHIDE NG_BEGINING expression NG_SINGLE_QOUTE
    ;

ng_show
    :NGSHOW NG_BEGINING expression NG_SINGLE_QOUTE
    ;

ng_switch_case
    : NG_SWITCH_CASE NG_BEGINING switch_case_body NG_SINGLE_QOUTE
    ;

ng_switch_default
    :NG_SWITCH_DEFAULT
    ;

switch_body
    : expression
    ;

switch_case_body
    : expression
    ;
ng_type
    : NG_TYPE TYPE_BEGINNING INPUT_TYPE TYPE_QUOTE
    ;
ng_model
    : NG_MODEL NG_BEGINING expression NG_SINGLE_QOUTE
    ;
ng_event
    : NG_AT_EVENT  NG_BEGINING expression NG_SINGLE_QOUTE
    ;

//ng_element //this rule defines : a variable name,a variable member , function name (with brackets) , array element (with square brackets) and nested array calls
//    : NG_ID (SQUARE_OPEN (ng_element | NG_DECIMAL ) SQUARE_CLOSE)? (BRACKET_OPEN (params)? BRACKET_CLOSE)? // !!LATER_ENHANCEMENT!! :add parameters to function call
//    ;
//
//ng_element_chain //this rule defines chaining ng_element calls.
//    : ng_element (DOT ng_element)*
//    ;
//
//function_call// it differs from ng_element in the non-optionality of the barckets
//    : NG_ID (SQUARE_OPEN (ng_element | NG_DECIMAL ) SQUARE_CLOSE)? (BRACKET_OPEN (params)? BRACKET_CLOSE)
//    ;

params
    :(expression) (COMMA(expression))*
    ;

//ng_condition_body //this rule defines a condition statement with three elements : right and left sides could be (ng_element_chain or a decimal ) and an operator in between , we can add whitespaces in between any of the three elements
//    : ( ng_element_chain | NG_DECIMAL ) NG_WHITESPACE* NG_OPERATOR NG_WHITESPACE* ( ng_element_chain | NG_DECIMAL ) // !!LATER_ENHANCEMENT!! : condition is an only ng element chain
//    | ng_element_chain
//    ;


//value
//    : (NG_STRING | NG_CHAR | NG_DECIMAL | NG_BOOLEAN)
//    ;

ng_list
    : SQUARE_OPEN (expression COMMA)* expression COMMA? SQUARE_CLOSE
    ;

map_value
    : NG_ID COLON expression
    ;

map
    : CURLEY_BRACKET_OPEN map_value(COMMA map_value)* COMMA? CURLEY_BRACKET_CLOSE
    ;

ngfor_body //can be reduced to three rules
    : NG_ID NG_IN expression (SEMI_COLON NG_ID EQUAL_SIGN expression)?
    | pair NG_IN expression
    ;
pair
    :NG_ID COMMA NG_ID
    ;

htmlChardata
    : HTML_TEXT
    | SEA_WS
    ;

htmlMisc
    : htmlComment
    | SEA_WS
    ;

htmlComment
    : HTML_COMMENT
    | HTML_CONDITIONAL_COMMENT
    ;

script
    : SCRIPT_OPEN (SCRIPT_BODY | SCRIPT_SHORT_BODY)
    ;

style
    : STYLE_OPEN (STYLE_BODY | STYLE_SHORT_BODY)
    ;
