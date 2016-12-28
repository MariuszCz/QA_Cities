grammar Program;

// Parser Rules

innyTekst: (TEXT)* ;

pytajnik : QUESTION_WORD innyTekst;

czasownik: pytajnik LOCATION;

miasto: czasownik CITY_WORD;

nazwa: miasto TEXT innyTekst ;

question: (nazwa)*;

QUESTION_WORD : 'gdzie' | 'co' | 'czy';

CITY_WORD: 'miasto';

LOCATION: 'lezy' | 'jest';

TEXT : (('a'|'A'..'z'|'Z'|[.])+);

WHITESPACE : ( '\t' | ' ' | '\r' | '\n'| '\u000C' )+ -> skip ;
