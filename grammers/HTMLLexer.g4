lexer grammar  HTMLLexer;

HTML_COMMENT
    : '<!--' .*? '-->'
    ;

HTML_CONDITIONAL_COMMENT
    : '<![' .*? ']>'
    ;

XML
    : '<?xml' .*? '>'
    ;

CDATA
    : '<![CDATA[' .*? ']]>'
    ;

DTD
    : '<!' .*? '>'
    ;

SCRIPTLET
    : '<?' .*? '?>'
    | '<%' .*? '%>'
    ;

SEA_WS
    :  (' '|'\t'|'\r'? '\n')+ ->skip
    ;

SCRIPT_OPEN
    : '<script' .*? '>' ->pushMode(SCRIPT)
    ;

STYLE_OPEN
    : '<style' .*? '>'  ->pushMode(STYLE)
    ;

TAG_OPEN
    : '<' -> pushMode(TAG)
    ;
MUSTACHE_OPEN
    : '{{' -> pushMode(NG)
    ;

HTML_TEXT
    : ~('<' | '{')+ //{ is not acceptable
    ;


// tag declarations

mode TAG;

NG_APP
    :'app'
    ;
NGSHOW
    : 'ng-show'
    ;

NGHIDE
    : 'ng-hide'
    ;

NGIF
    : 'ng-if'
    ;

NG_SWITCH
    : 'ng-switch'
    ;

NG_SWITCH_CASE
    : 'ng-switch-case'
    ;

NG_SWITCH_DEFAULT
    : 'ng-switchDefault'
    ;
NG_TYPE
    : 'type' ->pushMode(TYPE)
    ;
NG_MODEL
         : 'ng-model'
         ;
NG_AT_EVENT
    : '@' NG_EVENT
    ;
NG_EVENT
    : 'click'
    | 'blur'
    | 'submit'
    | 'toggle'
    | 'mouseover'
    ;

NG_BEGINING
    : '!' NG_WHITESPACE* '\'' ->pushMode(NG)
    ;

NG_ATTRBIUTE
    : '!'
    ;

SINGLE_QOUTE
    : '\''
    ;

NGFOR
    : 'ng-for'
    ;
ID
    : 'x'
    ;
IN
    : 'in'
    ;

TAG_CLOSE
    : '>' -> popMode
    ;

TAG_SLASH_CLOSE
    : '/>' -> popMode
    ;

TAG_SLASH
    : '/'
    ;

// lexing mode for attribute values

TAG_EQUALS
    : '=' -> pushMode(ATTVALUE)
    ;

TAG_NAME
    : TAG_NameStartChar TAG_NameChar*
    ;

TAG_WHITESPACE
    : [ \t\r\n] -> channel(HIDDEN)
    ;

fragment
HEXDIGIT
    : [a-fA-F0-9]
    ;

fragment
DIGIT
    : [0-9]
    ;

fragment
TAG_NameChar
    : TAG_NameStartChar
    | '-'
    | '_'
    | '.'
    | DIGIT
    | '\u00B7'
    | '\u0300'..'\u036F'
    | '\u203F'..'\u2040'
    ;

fragment
TAG_NameStartChar
    : [:a-zA-Z]
    | '\u2070'..'\u218F'
    | '\u2C00'..'\u2FEF'
    | '\u3001'..'\uD7FF'
    | '\uF900'..'\uFDCF'
    | '\uFDF0'..'\uFFFD'
    ;


// <scripts>

mode SCRIPT;

SCRIPT_BODY
    : .*? '</script>' -> popMode
    ;

SCRIPT_SHORT_BODY
    : .*? '</>' -> popMode
    ;


// <styles>

mode STYLE;

STYLE_BODY
    : .*? '</style>' -> popMode
    ;

STYLE_SHORT_BODY
    : .*? '</>' -> popMode
    ;


// attribute values

mode ATTVALUE;

// an attribute value may have spaces b/t the '=' and the value
ATTVALUE_VALUE
    : ' '* ATTRIBUTE -> popMode
    ;


ATTRIBUTE
    : DOUBLE_QUOTE_STRING
    | SINGLE_QUOTE_STRING
    | ATTCHARS
    | HEXCHARS
    | DECCHARS
    ;


fragment ATTCHARS
    : ATTCHAR+ ' '?
    ;

fragment ATTCHAR
    : '-'
    | '_'
    | '.'
    | '/'
    | '+'
    | ','
    | '?'
    | '='
    | ':'
    | ';'
    | '#'
    | [0-9a-zA-Z]
    ;

fragment HEXCHARS
    : '#' [0-9a-fA-F]+
    ;

fragment DECCHARS
    : [0-9]+ '%'?
    ;

fragment DOUBLE_QUOTE_STRING
    : '"' ~[<"]* '"'
    ;
fragment SINGLE_QUOTE_STRING
    : '\'' ~[<']* '\''
    ;

mode NG;
          NG_BOOLEAN
         : 'TRUE'
         | 'FALSE'
         | 'true'
         | 'false'
         ;
         NG_IN
         : 'in'
         ;
         NG_ID //this rule defines a variable/function name
         : [a-zA-Z_] ([a-zA-Z0-9_])*
         ;
         NG_SINGLE_QOUTE
         : '\'' ->popMode
         ;
         SQUARE_OPEN
         : '['
         ;
         SQUARE_CLOSE
         : ']'
         ;
         BRACKET_OPEN
         : '('
         ;
         BRACKET_CLOSE
         : ')'
         ;
         CURLEY_BRACKET_OPEN
         : '{'
         ;
         CURLEY_BRACKET_CLOSE
         : '}'
         ;
         DOT
         : '.'
         ;
         NG_OPERATOR_TWO_OPERAND
         : '<'
         | '>'
         | '<='
         | '>='
         | '=='
         ;
         NG_ONE_LOGICAL_OPERAND
         : '!'
         ;
         NG_ONE_VALUABLE_OPERAND
         : '++'
         | '--'
         ;
         CONDITIONAL_CONCAT_OPERATOR
         : '&&'
         | '||'
         ;
         ADDITIVE_OPERATOR
         : '+' | '-' | '+=' | '-='
         ;
         MULTIPLICATIVE_OPERATOR
         : '*' | '/' | '%' | '*=' | '/=' | '%='
         ;
         NG_WHITESPACE // tried the [\t\n\r] thing and it didn't work for some reason , this is a workaround
         : ' '-> channel(HIDDEN)
         ;
         NG_DECIMAL //this rule defines a decimal number (could contain a fraction)
         :('-')?[0-9]+('.'[0-9]+)?
         ;
         NG_CHAR
         : '\'' ([a-zA-Z0-9_] |'-' | '/'|'+'| ',' | '?' | '=' | ':' | ';' | '#' | ' ') '\''
         ;
         NG_STRING
         : '"' ~[<"]* '"'
         | '\'' ~[<']* '\''
         ;
         fragment STRING : '"' ( '\\"' | . )*? '"' ;
         EQUAL_SIGN
         : '='
         ;
         SEMI_COLON
         : ';'
         ;
         COLON
         : ':'
         ;
         COMMA
         : ','
         ;
         QUESTION_MARK
         : '?'
         ;
         PIPE
         : '|'
         ;
         MUSTACHE_CLOSE
         : '}}' ->popMode
         ;



mode MODEL_MANIPULATOR;

         WHITESPACE : ' ' -> skip ;
         FORMATTER
         : 'myFormater'
         ;
         fragment DATE_SEPARATOR: ('/'|','|'-');

         SINGLE_QUOTE
         : '\'' ->popMode
         ;

         FORMATE
         : '\'' TYPE_WHITESPACE* (MONTH* (DATE_SEPARATOR)? DAY*  (DATE_SEPARATOR)? YEAR*
         | DAY*  (DATE_SEPARATOR)? MONTH*  (DATE_SEPARATOR)? YEAR*
         |YEAR*  (DATE_SEPARATOR)? MONTH*  (DATE_SEPARATOR)? DAY*)
         ;

         MODEL_MANIPULATOR_COLON
         : ':'
         ;
         fragment DAY : ('d'|'D'|'day'|'DAY') ;
         fragment MONTH : ('m'|'M'|'Mon'|'Month'|'mon'|'month') ;
         fragment YEAR : ('y'|'Y'|'Year'|'year'|'Yr'|'yr') ;
mode TYPE ;
    TYPE_WHITESPACE
    : ' ' ->channel(HIDDEN)
    ;
    TYPE_BEGINNING
    : TYPE_WHITESPACE*'!' TYPE_WHITESPACE* '\'' TYPE_WHITESPACE*
    ;
    INPUT_TYPE
      :'text'| 'number'| 'date'| 'email' |'button'|'checkbox'|'color'
          |'datetime-local'|'file'|'hidden'|'image'|'month'|'password'
          |'radio'|'range'|'reset'|'search'|'submit'|'tel'|'time'|'url'|'week'
      ;
     TYPE_QUOTE
     : '\'' ->popMode
     ;
//mode SWITCH_CASE;
//      SWITCH_WHITESPACE
//      : ' ' ->channel(HIDDEN)
//      ;
//      SWITCH_CASE_BEGINNING
//      : '!' SWITCH_WHITESPACE* '\''
//      ;
//      SWICTH_EXPRESSION
//      : (~'\'')+
//      ;
//      SWITCH_QUOTE
//      : '\''->popMode
//      ;

