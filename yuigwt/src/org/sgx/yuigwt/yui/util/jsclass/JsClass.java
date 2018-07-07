package org.sgx.yuigwt.yui.util.jsclass;

import com.google.gwt.core.client.JavaScriptObject;

/**
 * <p>This package utility tye to solve the problem of writing Js objects with methods 
 * (function properties), </p> 
 * 
 *  <p>The user implements this interface and the GWT compiler will do the job of 
 *  knowing how to translate it instances to equivalent JSO objects. This is dome in method JsClass::toJSO() that is generated at compile time automatically. 
 *  </p>  
 *  <p>For example, in the following java code, </p> 
 *  
<pre>public static abstract class Apple implements JsClass {
	String color; 
	int age; 	
	public void sayHello() {
		System.out.println("hello from apple colored "+color);
	}
	public String getColor() {
		return color;
	}
	public void setColor(String color) {
		this.color = color;
	}
	public int getAge() {
		return age;
	}
	public void setAge(int age) {
		this.age = age;
	}	
}

public static void main(String[] args) {
	Apple apple1 = GWT.create(Apple.class);
	apple1.setColor("red"); 
	apple1.setAge(2); 
	JavaScriptObject apple1JSO = apple1.toJSO(); 
}</pre>

<p>the instance apple1JSO is the javascript native object:</p> 
  
   <pre>   {
	   color: "red", 
	   age: 2, 
	   sayHello: function() {
	   	..
	   }
   }</pre>
 *  
 * <p>Introduction. Think on the problem of building a js object with variable name methods, like </p> 
 * 
 * @author sg
 *
 */
public interface JsClass {
	
	JavaScriptObject toJSO(); 
}
