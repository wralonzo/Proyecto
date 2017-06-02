
package com.compiladores.primero.aritmetica;
import java.io.IOException;

import org.antlr.v4.runtime.ANTLRFileStream;
import org.antlr.v4.runtime.CommonTokenStream;

public class Main {

	private static final String EXTENSION = "at";

	public static void main(String[] args) throws IOException {
		String program = args.length > 1 ? args[1] : "test/test." + EXTENSION;

		System.out.println("Interpreting file " + program);

		aritmeticaLexer lexer = new aritmeticaLexer(new ANTLRFileStream(program));
		CommonTokenStream tokens = new CommonTokenStream(lexer);
		aritmeticaParser parser = new aritmeticaParser(tokens);

		aritmeticaParser.StartContext tree = parser.start();

		aritmeticaCustomVisitor visitor = new aritmeticaCustomVisitor();
		visitor.visit(tree);

		System.out.println("\n\nInterpretation finished");

	
		
	}
	
	

}
