package org.sgx.yuigwt.yui.test;

import org.sgx.yuigwt.yui.YuiContext;
import org.sgx.yuigwt.yui.util.jsclass.JsClass;

import com.google.gwt.core.client.JavaScriptObject;

public abstract class TestSuiteJsClass implements JsClass {

	//properties
	
	protected String name; 
	protected YuiContext y; 
	
	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public YuiContext getY() {
		return y;
	}

	public void setY(YuiContext y) {
		this.y = y;
	}
	

	//methods
	public void setUp() {
		
	}
	public void tearDown() {
		
	}
	
	@Override
	public JavaScriptObject toJSO() {
		// TODO Auto-generated method stub
		return null;
	}

}
