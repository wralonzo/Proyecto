grammar simple;

start:
inicio mensaje ciclofor
;

	COMILLAS: '"';
	PUNTOCOMA: ';';
	ESPACIO: ' ';
	PAREND : ')';
	PARENI : '(';
	ASIGNA : '=';
	SALTOLINEA: [ \t\r\n]+ -> skip ;
	MAIN: 'principal';
	PAR: '()';
	LLAVE: '{';
	CARACTER: ('a'..'z'|'A'..'Z'|'_') ('a'..'z'|'A'..'Z'|'0'..'9'|'_')*;
	CICLO1: 'F';
	
	C: 'for';
	ciclofor:
	C ESPACIO PARENI CARACTER ESPACIO ASIGNA INT PUNTOCOMA PAREND
	;
	
	
	inicio:
	MAIN 
	PAR
	LLAVE
	//SALTOLINEA
	
	;
	
	tipo:
	INT CARACTER ID 
	;

	
	//mostrar mensane
	mensaje:
			COMILLAS CARACTER COMILLAS PUNTOCOMA
			
	;
	
	//ciclo for
	
		
	/*----------------
	* reglas LEXICAS
	*----------------*/
	ID : ('a'..'z'|'A'..'Z')+;
	INT : '0'..'9'+;
	
	
	
	WS
	:
	[ \t\r\n]+ -> skip
	;