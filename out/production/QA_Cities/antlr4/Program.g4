grammar Program;

// Parser Rules

innyTekst: (TEXT)* ;

pytajnik : QUESTION_WORD ;

czasownik: pytajnik innyTekst LOCATION;

rzeczownik: czasownik NOUN;

typ: rzeczownik innyTekst TYPE_WORD;

nazwa: typ TEXT innyTekst ;

question: (nazwa)*;

QUESTION_WORD : ('G'|'g')'dzie' | ('C'|'c')'o' | ('C'|'c')'zy' | ('I'|'i')'le' | ('J'|'j')'ak'('a'..'z')+;

TYPE_WORD: 'miesc'('a'..'z')+ | 'miast'('a'..'z')+ | 'osob'('a'..'z')+;

LOCATION: 'lezy' | 'jest' | 'znajduje' | 'ma' | 'posiada';

NOUN : 'poloz'('a'..'z')+ | 'lud'('a'..'z')+ | 'powierz'('a'..'z')+ | 'wsp'('a'..'z')+;

TEXT : (('a'|'A'..'z'|'Z'|[.])+)|'?';

WHITESPACE : ( '\t' | ' ' | '\r' | '\n'| '\u000C' )+ -> skip ;
