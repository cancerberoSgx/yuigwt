package org.sgx.yuigwt.yui.util.jsclass;

import com.google.gwt.core.client.GWT;
import com.google.gwt.core.client.JavaScriptObject;

public class Test1 {
public static abstract class Apple implements JsClass {
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
}
}
