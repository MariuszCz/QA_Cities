grammar Program;

// Parser Rules

innyTekst: (TEXT)* ;

pytajnik : QUESTION_WORD ;

czasownik: pytajnik innyTekst LOCATION;// | LOCATION;

rzeczownik: czasownik (NOUN)*;// | pytajnik innyTekst NOUN ;

typ: rzeczownik innyTekst (TYPE_WORD)* ;//| czasownik innyTekst TYPE_WORD;

nazwa: typ (TEXT)+ ENDSIGN ;

question: (nazwa)*;

QUESTION_WORD : ('G'|'g')'dzie' | ('C'|'c')'o' | ('C'|'c')'zy' | ('I'|'i')'le'| ('K'|'k')'to'| ('K'|'k')'im'| ('K'|'k')'iedy' | ('J'|'j')'a'('a'..'z')+;

TYPE_WORD: 'miesc'('a'..'z')+ | 'miast'('a'..'z')+ | 'osob'('a'..'z')+| 'miejsc'('a'..'z')+;

LOCATION: 'lezy' | 'jest' | 'znajduje' | 'ma' |'mia'('a'..'z')+ | 'posiada'  | 'urodz'('a'..'z')+ | 'by'('a'..'z')+| 'umar'('a'..'z')+| 'zmar'('a'..'z')+| 'wygla'('a'..'z')+;

NOUN : 'poloz'('a'..'z')+ | 'lud'('a'..'z')+| 'mieszk'('a'..'z')+ | 'powierz'('a'..'z')+ | 'wsp'('a'..'z')+ | 'kod'('a'..'z')+ | 'poczt'('a'..'z')+
|'stref'('a'..'z')+|'cza'('a'..'z')+|'kra'('a'..'z')+|'panst'('a'..'z')+|'dzielni'('a'..'z')+|'rejo'('a'..'z')+ |'sie' |'malzo'('a'..'z')+|'zon'('a'..'z')+|'mez'('a'..'z')+ ;

TEXT : (('a'|'A'..'z'|'Z'|[.])+);

ENDSIGN : '?';

WHITESPACE : ( '\t' | ' ' | '\r' | '\n'| '\u000C' )+ -> skip ;
