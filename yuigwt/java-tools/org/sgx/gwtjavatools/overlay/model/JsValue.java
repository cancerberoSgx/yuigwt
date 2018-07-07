package org.sgx.gwtjavatools.overlay.model;

import java.util.List;
import java.util.Map;

/**
 * I represent any javascript value - can be an object, primitive or array. Have methods for array accessing and object accessing. 
 * @author sg
 *
 */
public class JsValue {
	/**
	 * one of 
	 */
	String type;
	
	public JsValue(String type) {
		super();
		this.type = type;
	}

	//primitives
	/**
	 * this.value holds the value for primitive types: boolean, string, number using Java.lang.Boolean, java.lang.String or java.lang.Number
	 */
	Object value; 
	
	//object
	
	/**
	 * object properties
	 */
	Map<String,JsValue> properties;  
	
	//array
	/**
	 * the array
	 */
	List<JsValue> values;

	public String getType() {
		return type;
	}

	public void setType(String type) {
		this.type = type;
	}

	public Object getValue() {
		return value;
	}

	public void setValue(Object value) {
		this.value = value;
	}

	public Map<String, JsValue> getProperties() {
		return properties;
	}

	public void setProperties(Map<String, JsValue> properties) {
		this.properties = properties;
	}

	public List<JsValue> getValues() {
		return values;
	}

	public void setValues(List<JsValue> values) {
		this.values = values;
	} 
	
	
	
}
