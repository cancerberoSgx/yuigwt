package org.sgx.yuigwt.yuigallery.itsaselectlist;

import org.sgx.yuigwt.yui.util.JsObject;

import com.google.gwt.core.client.JavaScriptObject;

/**
 * a single item in the ITSASelectlist
 * 
 * @author sg
 * 
 */
public class ITSASelectlistItem extends JsObject {
	protected ITSASelectlistItem(){}
	public static final native ITSASelectlistItem create()/*-{
		return {};
	}-*/;

	/**
	 * 
	 * @return
	 */
	public native final String text() /*-{
		return this.text;
	}-*/;

	/**
	 * 
	 * @param val
	 * @return this - for setter chaining
	 */
	public native final ITSASelectlistItem text(String val) /*-{
		this.text = val;
		return this;
	}-*/;

	/**
	 * 
	 * @return
	 */
	public native final String returnValueString() /*-{
		return this.returnValue + "";
	}-*/;

	/**
	 * 
	 * @return
	 */
	public native final String returnValueObj() /*-{
		return this.returnValue + "";
	}-*/;

	/**
	 * 
	 * @param val
	 * @return this - for setter chaining
	 */
	public native final ITSASelectlistItem returnValue(String val) /*-{
		this.returnValue = val;
		return this;
	}-*/;

	/**
	 * 
	 * @param val
	 * @return this - for setter chaining
	 */
	public native final ITSASelectlistItem returnValue(JavaScriptObject val) /*-{
		this.returnValue = val;
		return this;
	}-*/;

	// TODO: returnValue boolean double int
}
