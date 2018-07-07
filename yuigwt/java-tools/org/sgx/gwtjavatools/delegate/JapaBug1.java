package org.sgx.gwtjavatools.delegate;

public class JapaBug1 {
public static void main(String[] args) {
	test1(); 
}

private static void test1() {
	String javaCode =
		"package p; " +
		"public class A {" +
			"public native final void instanceMethod1(); " +
			"public static native final void instanceMethod1(); " +
		"}"; 
	
	
}
}
