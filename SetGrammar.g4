grammar SetGrammar;

OPEN_BRACKET : '(';
CLOSE_BRACKET : ')';
OPEN_CURLY_BRACKET : '{';
CLOSE_CURLY_BRACKET : '}';
OPEN_SQUARE_BRACKET : '[';
CLOSE_SQUARE_BRACKET : ']';

ELEMENT: 'element';
SET: 'set';

LET: 'let';

FOREACH : 'forEach';
IN: 'in';
IF: 'if';
ELSE: 'else';
WHILE: 'while';


MAIN : 'main';
FUNCTION: 'func';
RETURN: 'return';
VOID: 'void';

PRINT: 'print';
GET: 'get';
CONTAINS: 'contains';
POWER: 'power';
HAS_NEXT: 'hasNext';

ASSIGN : '=';
DOT: '.';
COMMA : ',';
COLON : ':';
ARROW : '->';

PLUS : '+';
MINUS : '-';
MULTIPLY : '*';
DIVIDE : '/';

NEGATION : '!';
EQUAL: '==';
NON_EQUAL: '!=';
LESS: '<';
GREATER: '>';


SPACE :   [ \n\t\r]+ -> skip;

NAME : [a-zA-Z_][a-zA-Z_0-9]* ;
NUMBER : [0-9]+ ;
LINE : '"'(.)+?'"';

program: (void_function|non_void_function)* MAIN block (void_function|non_void_function)*;

type: ELEMENT|SET;
void_sign: OPEN_BRACKET CLOSE_BRACKET;
block: OPEN_CURLY_BRACKET body* CLOSE_CURLY_BRACKET;
declaration: LET NAME (COLON SET)? ASSIGN expression;
declaration_element: LET NAME (COLON ELEMENT)? ASSIGN (LINE|function_call|get_expression);


set_expression : OPEN_CURLY_BRACKET (NAME COMMA)* NAME CLOSE_CURLY_BRACKET;

function_call: (NAME (input_signature|(OPEN_BRACKET CLOSE_BRACKET)));
input_signature: OPEN_BRACKET (NAME COMMA)* NAME CLOSE_BRACKET;

single_arg_pattern: NAME COLON type;
non_single_args_pattern:  single_arg_pattern COMMA;

function_signature: OPEN_BRACKET non_single_args_pattern* single_arg_pattern CLOSE_BRACKET;
functionHeader: FUNCTION NAME (function_signature|void_sign);
non_void_function: functionHeader ARROW type block_return;
void_function: functionHeader (ARROW ((OPEN_BRACKET VOID CLOSE_BRACKET)|void_sign))? block_non_return;

block_return: OPEN_CURLY_BRACKET body* RETURN NAME CLOSE_CURLY_BRACKET;
block_non_return: OPEN_CURLY_BRACKET body* CLOSE_CURLY_BRACKET;

equals: (expression) (EQUAL|NON_EQUAL) (expression);
compare: (power) (EQUAL|NON_EQUAL|LESS|GREATER) (power);
simple_compare : equals|compare|contains|has_next;
negation_compare : NEGATION OPEN_BRACKET simple_compare CLOSE_BRACKET;
if_block: IF (simple_compare|negation_compare) block else_block?;
else_block: ELSE block;
while_block: WHILE (simple_compare|negation_compare) block;
forEach: FOREACH OPEN_BRACKET NAME IN NAME CLOSE_BRACKET block;


print: PRINT OPEN_BRACKET (NAME | LINE) CLOSE_BRACKET;
get_expression: NAME DOT GET OPEN_BRACKET NUMBER CLOSE_BRACKET;
has_next: NAME DOT HAS_NEXT void_sign;
power: NAME DOT POWER void_sign;
contains: NAME DOT CONTAINS OPEN_BRACKET NAME CLOSE_BRACKET;

body:
        print
    |   declaration                                             
    |   function_call
    |   declaration_element
    |   if_block
    |   while_block
    |   forEach
    ;

expression:
        set_expression
    |   NAME PLUS NAME
    |   NAME MINUS NAME
    |   NAME MULTIPLY NAME
    |   NAME DIVIDE NAME
    |   NAME
    |   function_call
    |   get_expression
    ;