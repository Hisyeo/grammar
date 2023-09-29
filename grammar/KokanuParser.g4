parser grammar KokanuParser;

options {
    tokenVocab=KokanuLexer;
}

sentence
    : leadingSubject? verb prepositions*
    ;

leadingSubject
    : noun modifiers*
    ;

modifiers
    : ContentWord+
    | Te BaseVerb modifiers* prepositions*
    ;


adjectiveClause
    : Ta (ContentWord modifiers*)? Le verb
    ;

verb
    : Le ContentWord modifiers*
    | O ContentWord modifiers*
    ;

prepositions
    : Preposition ContentWord modifiers*
    ;

noun
    : ContentWord (adjectiveClause | modifiers)*
    | Te BaseVerb modifiers* prepositions*
    ;