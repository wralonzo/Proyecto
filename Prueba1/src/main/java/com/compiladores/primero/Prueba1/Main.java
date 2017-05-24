
package com.compiladores.primero.Prueba1;
import java.io.IOException;

import org.antlr.v4.runtime.ANTLRFileStream;
import org.antlr.v4.runtime.CommonTokenStream;

/**
 * @author Dell PC
 *
 */
public class Main {

	private static final String EXTENSION = "smp";

	public static void main(String[] args) throws IOException {
		String program = args.length > 1 ? args[1] : "test/test." + EXTENSION;

		System.out.println("Interpreting file " + program);

		simpleLexer lexer = new simpleLexer(new ANTLRFileStream(program));
		CommonTokenStream tokens = new CommonTokenStream(lexer);
		//simpleParser parser = new simpleParser(tokens);

//		simpleParser.StartContext tree = parser.start();

		simpleCustomVisitor visitor = new simpleCustomVisitor();
		//visitor.visit(tree);

		System.out.println("Interpretation finished");

	}

}
