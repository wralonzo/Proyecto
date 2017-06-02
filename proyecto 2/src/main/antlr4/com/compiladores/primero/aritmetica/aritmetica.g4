grammar aritmetica;//NOMBRE DE NUESTRA GRAMATICA


/*NOMBRE DE LIBRERIAS JAVA PARA USO DE FUNCIONES RESERVADAS DENTRO DE LA GRAMATICA
 * PORQUE CADA VEZ QUE COMPILAMOS SE COSNTRUYE UN DE NUEVO NUESTRO ARCHIVO PARSER
 * CON INCLUYENDO ESTAS LIBRERIAS HACE QUE ESTEN CONSTANTES EN DICHO ARCHIVO*/
@parser::header{
	import java.util.Map;
	import java.util.HashMap;
}

/*LIBERIA PARA GUARDAR EL CONTENIDO DE 
 *VARIABLES EN UNA TABLA DE SIMBOLOS
 *QUE SE IMPLEMENTA COMO UN MAPA DE CADENAS
 *IDENTIFICANDO CADA VALOR Y ASIGNARLO A LA VARIABLE
 */
 
@parser::members {
	Map<String, Object> symbolTable = new HashMap<String, Object>();
}


//////ANALISIS SEMANTICO DEL PROGRAMA 
/////INCLUYE TODAS LAS REGLAS 
/////GRAMATICALES
start:program;//INICIO DEL PROGRAMA, DEFINIDO EN EL PROGRAMA PRINCIPA (MAIN)

//DECLARA VARIABLE EJ. VAR A;
var_decl:VAR ID SEMICOLON
		{symbolTable.put($ID.text, 0);};//GUARDAR EN LA TABLA DE SIMBOLOS LA VARIABLE ID

//ASIGNAR VALORES A LA VARIABLE EJ. A=10;
var_assign: ID ASSIGN expression SEMICOLON
		{symbolTable.put($ID.text, $expression.value);};
//FUNCION IMPRIMIR
println: PRINTLN expression SEMICOLON
		{System.out.println($expression.value);};//MUESTRA EL CONTENIDO EN CONSOLA

//funcion if else o else if
conditional: IF PAR_OPEN expression PAR_CLOSE
			BRACKET_OPEN (sentence* | (sentence* elseif*) )BRACKET_CLOSE 
			ELSE
			BRACKET_OPEN sentence* BRACKET_CLOSE
			;
/*FUNCION PRA EVALUAR EX 3PRESIONES ARITMETICAS
 * RETURN VALUE (EVALUA LAS OPERACIONES EN BASE A EL PARAMETRO VALUE)
 * Y SE VAN CREANDO INSTANCIAS DE LOS DEMAS PROCESOS
 */
expression returns [Object value]: 
		t1=factor {$value = (int)$t1.value;}
			(PLUS t2=factor {$value = (int)$value + (int)$t2.value;}
				| MINUM t2=factor {$value = (int)$value - (int)$t2.value;}
				| EQ t3 = factor {$value = (int)$value == (int)$t3.value;}
				| GT t4 = factor {$value = (int)$value > (int)$t4.value;}
				| LT t5 = factor {$value = (int)$value < (int)$t5.value;}
				| GEQ t6 = factor {$value = (int)$value >= (int)$t6.value;}
				| LEQ t7 = factor {$value = (int)$value <= (int)$t7.value;}
				| NEQ t8 = factor {$value = (int)$value != (int)$t8.value;}
				
				)*;
				
				

/*ESTA FUNCION ME PERMITE MULTIPLICAR Y DIVIDIR 
 * EVALUANDO CADA VARIABLE DEFINIDA QUE SE GUARDA EN EL MAPA DE SIMBOLOS
 */
factor returns [Object value]: 
		t1=term {$value = (int)$t1.value;} 
			(MULT t2=term {$value = (int)$value * (int)$t2.value;}
				| DIV t2=term {$value = (int)$value / (int)$t2.value;})*;

/*EVALUA EL TERMINO 
 * SI ES NUMERO
 * CADENA
 * BOOLEAN
 */
term returns [Object value]: 
		NUMBER {$value = Integer.parseInt($NUMBER.text);} 
		| ID {$value = symbolTable.get($ID.text);}
		| BOOLEAN {$value = Boolean.parseBoolean($BOOLEAN.text);}
		| PAR_OPEN expression {$value = $expression.value;}PAR_CLOSE;

/*
 * SENTENCIA PRINCIPAL DEL PROGRAMA 
 * EJECUTA UNA SENTENCIA O UN BLOQUE DE ELLAS
 */
program: (PROGRAM ID BRACKET_OPEN)
	(sentence | conditional | ciclofor | ciclowhile | procedimiento |funcion)*
	(BRACKET_CLOSE);

//FUNCION PARA MOSTRAR UN MENSAJE	
mensaje:
'Mensaje ' '"' concatenar* '"' ';';

/*
 * FUNCION PARA CONCATENAR 
 */
concatenar:
ID+ID
|
ID ' '
|ID

;
//COMENTARION EN LINEA
comentarioliniea:'//' concatenar* | mensaje;
//COMENTARIO EN BLOKE			
comentariobloke:
'/*' concatenar*  '*/';
//COMENTARIO PRINCIPAL
comentario:comentarioliniea
			|comentariobloke ;
			 
	
elseif:
ELSEIF PAR_OPEN expression PAR_CLOSE BRACKET_OPEN sentence* 
				BRACKET_CLOSE ;


//ciclo for
ciclofor :
	//var_decl var_assign
	(PARA  PAR_OPEN expression SEMICOLON expression  SEMICOLON) 
		(NUMBER (MASMAS | MENOSMENOS))( PAR_CLOSE BRACKET_OPEN)(sentence  | conditional)* 	
	     (BRACKET_CLOSE)
	;
//buble while	
ciclowhile:
		(WHILE PAR_OPEN expression PAR_CLOSE BRACKET_OPEN)(
		(( sentence | conditional | ciclofor)*)(ID (MASMAS | MENOSMENOS)))
		(BRACKET_CLOSE)
;
//procedimiento
procedimiento:((PROCEDIMIENTO ID PAR_OPEN)((((VAR ID) |(VAR ID ' '))* PAR_CLOSE)| (PAR_CLOSE)) (BRACKET_OPEN) 
(sentence | ciclofor | ciclowhile | conditional)* 
BRACKET_CLOSE)
;
	
funcion:((FUNCION ID PAR_OPEN)((((VAR ID) |(VAR ID ' '))* PAR_CLOSE)| (PAR_CLOSE)) (BRACKET_OPEN) 
(sentence | ciclofor | ciclowhile | conditional)*
	(RETURN (ID | NUMBER) SEMICOLON) 
BRACKET_CLOSE)
;



//SENTENCIA PARA EL PRINCIPAL PARA EL PROGRAMA
sentence: var_decl | var_assign | println| mensaje|comentario;


//ANALISIS SINTATICO 
//DIFINICION DE TOKENS
PROGRAM: 'chapinprogram ';
VAR: 'var ';
PRINTLN: 'imprimir ';
PARA :'for';
WHILE: 'while';
PROCEDIMIENTO: 'procedimiento ';
FUNCION: 'funcion ';
RETURN: 'return ';


IF: 'if';		
ELSE: 'else';
ELSEIF: 'elseif';

PLUS:'+'; 
MINUM:'-';
MULT:'*';
DIV:'/';

MASMAS:'++;';
MENOSMENOS: '--;';
AND:'&&'; 
OR:'||';
NOT:'!';

GT: '>';
LT: '<';
GEQ: '>=';
LEQ:'<=';
EQ: '==';
NEQ:'!=';

ESP: ' ';
ASSIGN:'=';

BRACKET_OPEN: '{';
BRACKET_CLOSE: '}';

PAR_OPEN:'(';
PAR_CLOSE:')';

SEMICOLON:';';

BOOLEAN: 'true' | 'false';

ID:[a-zA-Z][a-zA-Z0-9]*;
//CON:[a-zA-Z][a-zA-Z0-9]*;

NUMBER:[0-9]+;

WS : [\t\r\n]+ -> skip
   ;
   
  

