lexer grammar HisyeoLexer;

import HisyeoWordLexer;

WS: [ \u202F\n\t\r]+ -> channel(HIDDEN);

// simple interjection
Oiyo
    : 'oiyo'
    ;


ProperNoun : Uppercase Lowercase+
    ;

fragment Uppercase
    : 'O' | 'B' | 'E' | 'U' | 'K' | 'S' | 'T' | 'I'
    | 'Ô' | 'F' | 'Ê' | 'Û' | 'G' | 'X' | 'D' | 'Î'
    | 'C' | 'Z' | 'Y' | 'L' | 'W' | 'H' | 'N' | 'M'
    ;

fragment Lowercase
    : 'o' | 'b' | 'e' | 'u' | 'k' | 's' | 't' | 'i'
    | 'ô' | 'f' | 'ê' | 'û' | 'g' | 'x' | 'd' | 'î'
    | 'c' | 'z' | 'y' | 'l' | 'w' | 'h' | 'n' | 'm'
    ;

Comma : ',';

Colon
    : ':'
    | '—'
    ;

Period
    : '.'
    | ';'
    ;

QuestionStart
    : '¿'
    ;

QuestionEnd
    : '?'
    ;

QuotationStart
    : '“'
    | '«'
    ;

QuotationEnd
    : '”'
    | '»'
    ;