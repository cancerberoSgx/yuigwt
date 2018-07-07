package org.sgx.gwtjavatools;

public class Test1 {

	public static void main(String[] args) {
		Overlay1Generator gen = new Overlay1Generator(); 
		StringBuffer sb = new StringBuffer(); 
		gen.generateOverlayFrom(sb, CSSStyleIn.class, "Transition", "org.sgx.p1", 
				new String[]{Overlay1Generator.OPT_SETTER}); 
		System.out.println(sb.toString());
	}

}
