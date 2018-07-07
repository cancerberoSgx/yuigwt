package org.sgx.yuigwt.yui.base;

import org.sgx.yuigwt.yui.attr.AttributeDefProp;
import org.sgx.yuigwt.yui.attr.AttributeJsClass;

import com.google.gwt.core.client.JavaScriptObject;
/**
 * 
 * @author sg
 *
 */
public abstract class BaseJsClass extends AttributeJsClass {

	
	String name; 
	
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
}
