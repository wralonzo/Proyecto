grammar simple;

	
	MAS : '+';
	MENOS : '-';
	MULTI : '*';
	DIVIDIR : '/';
	PAREND : ')';
	PARENI : '(';
	ASIGNA : '=';
	/*----------------
	* REGLAS SINTACTICAS
	*----------------*/
	//regla1
	prog : stat+;
	stat : expr | ID ASIGNA expr;
	expr : multExpr ((MAS | MENOS )multExpr)*;
	multExpr: atom ((MULTI | DIVIDIR) atom )*;
	atom : INT | ID | PARENI expr PAREND;
	
	//regla2
	proc: inicio+;
	inicio: expresion | ID ASIGNA expresion;
	expresion: convierte((MENOS)convierte)+;
	convierte: siguiente ((MAS) siguiente)+;
	siguiente: INT | ID |PARENI expresion PAREND;
	
	
	/*----------------
	* reglas LEXICAS
	*----------------*/
	ID : ('a'..'z'|'A'..'Z')+;
	INT : '0'..'9'+;
	WS
	:
	[ \t\r\n]+ -> skip
	;