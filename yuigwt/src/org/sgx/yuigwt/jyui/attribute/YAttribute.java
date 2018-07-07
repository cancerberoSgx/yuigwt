package org.sgx.yuigwt.jyui.attribute;

import org.sgx.yuigwt.jyui.event.YEventTarget;
import org.sgx.yuigwt.yui.YuiContext;
import org.sgx.yuigwt.yui.attr.Attribute;
import org.sgx.yuigwt.yui.node.Node;

import com.google.gwt.core.client.JavaScriptObject;
/**
 * 100% Java Wrapper for Attribute
 * @author sg
 *
 */
public class YAttribute extends YEventTarget {
	
	public YAttribute(YuiContext y) {
		super(y);
	}

	public org.sgx.yuigwt.yui.attr.Attribute _wrappedAttribute() {
		return _wrapped.cast(); 
	}

	/**
	 * @param attrName
	 * @return
	 * @see org.sgx.yuigwt.yui.attr.Attribute#getObj(java.lang.String)
	 */
	public  JavaScriptObject getObj(String attrName) {
		return _wrappedAttribute().getObj(attrName);
	}

	/**
	 * @param attrName
	 * @return
	 * @see org.sgx.yuigwt.yui.attr.Attribute#getNode(java.lang.String)
	 */
	public  Node getNode(String attrName) {
		return _wrappedAttribute().getNode(attrName);
	}

	/**
	 * @param attrName
	 * @return
	 * @see org.sgx.yuigwt.yui.attr.Attribute#getString(java.lang.String)
	 */
	public  String getString(String attrName) {
		return _wrappedAttribute().getString(attrName);
	}

	/**
	 * @param attrName
	 * @return
	 * @see org.sgx.yuigwt.yui.attr.Attribute#get(java.lang.String)
	 */
	public  String get(String attrName) {
		return _wrappedAttribute().get(attrName);
	}

	/**
	 * @param attrName
	 * @return
	 * @see org.sgx.yuigwt.yui.attr.Attribute#getDouble(java.lang.String)
	 */
	public  double getDouble(String attrName) {
		return _wrappedAttribute().getDouble(attrName);
	}

	/**
	 * @param attrName
	 * @return
	 * @see org.sgx.yuigwt.yui.attr.Attribute#getInt(java.lang.String)
	 */
	public  int getInt(String attrName) {
		return _wrappedAttribute().getInt(attrName);
	}

	/**
	 * @param attrName
	 * @return
	 * @see org.sgx.yuigwt.yui.attr.Attribute#getBoolean(java.lang.String)
	 */
	public  boolean getBoolean(String attrName) {
		return _wrappedAttribute().getBoolean(attrName);
	}

	/**
	 * @param attrName
	 * @param val
	 * @return
	 * @see org.sgx.yuigwt.yui.attr.Attribute#set(java.lang.String, com.google.gwt.core.client.JavaScriptObject)
	 */
	public  Attribute set(String attrName, JavaScriptObject val) {
		return _wrappedAttribute().set(attrName, val);
	}

	/**
	 * @param attrName
	 * @param val
	 * @return
	 * @see org.sgx.yuigwt.yui.attr.Attribute#set(java.lang.String, java.lang.String)
	 */
	public  Attribute set(String attrName, String val) {
		return _wrappedAttribute().set(attrName, val);
	}

	/**
	 * @param attrName
	 * @param val
	 * @return
	 * @see org.sgx.yuigwt.yui.attr.Attribute#set(java.lang.String, double)
	 */
	public  Attribute set(String attrName, double val) {
		return _wrappedAttribute().set(attrName, val);
	}

	/**
	 * @param attrName
	 * @param val
	 * @return
	 * @see org.sgx.yuigwt.yui.attr.Attribute#set(java.lang.String, int)
	 */
	public  Attribute set(String attrName, int val) {
		return _wrappedAttribute().set(attrName, val);
	}

	/**
	 * @param attrName
	 * @param val
	 * @return
	 * @see org.sgx.yuigwt.yui.attr.Attribute#set(java.lang.String, boolean)
	 */
	public  Attribute set(String attrName, boolean val) {
		return _wrappedAttribute().set(attrName, val);
	}

	/**
	 * @param attrs
	 * @return
	 * @see org.sgx.yuigwt.yui.attr.Attribute#setAttrs(com.google.gwt.core.client.JavaScriptObject)
	 */
	public  Attribute setAttrs(JavaScriptObject attrs) {
		return _wrappedAttribute().setAttrs(attrs);
	}

	/**
	 * @param attrName
	 * @param index
	 * @param value
	 * @return
	 * @see org.sgx.yuigwt.yui.attr.Attribute#setArrayItem(java.lang.String, int, int)
	 */
	public  Attribute setArrayItem(String attrName, int index, int value) {
		return _wrappedAttribute().setArrayItem(attrName, index, value);
	}

	/**
	 * @param attrName
	 * @param index
	 * @param value
	 * @return
	 * @see org.sgx.yuigwt.yui.attr.Attribute#setArrayItem(java.lang.String, int, java.lang.String)
	 */
	public  Attribute setArrayItem(String attrName, int index, String value) {
		return _wrappedAttribute().setArrayItem(attrName, index, value);
	}

	/**
	 * @param attrName
	 * @param index
	 * @param value
	 * @return
	 * @see org.sgx.yuigwt.yui.attr.Attribute#setArrayItem(java.lang.String, int, double)
	 */
	public  Attribute setArrayItem(String attrName, int index, double value) {
		return _wrappedAttribute().setArrayItem(attrName, index, value);
	}

	/**
	 * @param attrName
	 * @param index
	 * @param value
	 * @return
	 * @see org.sgx.yuigwt.yui.attr.Attribute#setArrayItem(java.lang.String, int, boolean)
	 */
	public  Attribute setArrayItem(String attrName, int index, boolean value) {
		return _wrappedAttribute().setArrayItem(attrName, index, value);
	}

	/**
	 * @param attrName
	 * @param index
	 * @param value
	 * @return
	 * @see org.sgx.yuigwt.yui.attr.Attribute#setArrayItem(java.lang.String, int, com.google.gwt.core.client.JavaScriptObject)
	 */
	public  Attribute setArrayItem(String attrName, int index, JavaScriptObject value) {
		return _wrappedAttribute().setArrayItem(attrName, index, value);
	}
	
	
}
