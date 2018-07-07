package org.sgx.gwtjavatools.delegate;

import japa.parser.JavaParser;
import japa.parser.ParseException;
import japa.parser.ast.CompilationUnit;
import japa.parser.ast.ImportDeclaration;
import japa.parser.ast.body.MethodDeclaration;
import japa.parser.ast.body.Parameter;
import japa.parser.ast.visitor.VoidVisitorAdapter;

import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;
import java.io.InputStream;
import java.util.List;

public class ParserTest {
	
//	public static String get
	public static void main(String[] args){
       try {
		test1();
	} catch (ParseException e) {
		// TODO Auto-generated catch block
		e.printStackTrace();
	} catch (IOException e) {
		// TODO Auto-generated catch block
		e.printStackTrace();
	} 
    }

private static void test1() throws ParseException, IOException {
	 // creates an input stream for the file to be parsed
//	ParserTest.class
	
	File classFile = new File("/home/sebastian/workspace3.7/yuigwt/java-tools/org/sgx/gwtjavatools/delegate/JYUIDelegateMethods.java");
	
//    InputStream in = ParserTest.class.getClassLoader().getResourceAsStream("/java-tools/org/sgx/gwtjavatools/delegate/JYUIDelegateMethods.java");//new FileInputStream("test.java");

	FileInputStream in = new FileInputStream(classFile); 
	
    CompilationUnit cu;
    try {
        // parse the file
        cu = JavaParser.parse(in);
    } finally {
        in.close();
    }

 // visit and print the methods names
    new MethodVisitor().visit(cu, null);

    // prints the resulting compilation unit to default system output
//    System.out.println(cu.toString());
}

/**
 * Simple visitor implementation for visiting MethodDeclaration nodes. 
 */
private static class MethodVisitor extends VoidVisitorAdapter {

    @Override
    public void visit(MethodDeclaration n, Object arg) {
    	List<Parameter> params = n.getParameters();
    	for(Parameter p : params) {
    		System.out.println("param "+p.getId()+" - "+p.getType()); 
    	}
        // here you can access the attributes of the method.
        // this method will be called for all methods in this 
        // CompilationUnit, including inner class methods
//        System.out.println(n.getName());
    }
    
}

}
