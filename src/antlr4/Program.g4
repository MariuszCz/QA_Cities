grammar Program;

// Parser Rules

innyTekst: (TEXT)* ;

pytajnik : QUESTION_WORD ;

czasownik: pytajnik innyTekst LOCATION;

typ: czasownik innyTekst TYPE_WORD;

nazwa: typ TEXT innyTekst ;

question: (nazwa)*;

QUESTION_WORD : 'gdzie' | 'co' | 'czy';

TYPE_WORD: 'miasto' | 'osoba';

LOCATION: 'lezy' | 'jest' | 'polozone' | 'znajduje';

TEXT : (('a'|'A'..'z'|'Z'|[.])+)|'?';

WHITESPACE : ( '\t' | ' ' | '\r' | '\n'| '\u000C' )+ -> skip ;
