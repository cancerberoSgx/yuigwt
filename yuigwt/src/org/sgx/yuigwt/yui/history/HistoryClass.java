package org.sgx.yuigwt.yui.history;

import com.google.gwt.core.client.JavaScriptObject;

/**
 * Y.History static properties
 * 
 * @author sg
 * 
 */
public class HistoryClass extends JavaScriptObject {
	protected HistoryClass() {
	}

	/**
	 * Whether or not this browser supports the HTML5 History API.
	 * 
	 * @return
	 */
	public native final boolean html5() /*-{
		return this.html5;
	}-*/;

	/**
	 * Whether or not this browser supports the HTML5 History API.
	 * 
	 * @param val
	 * @return this - for setter chaining
	 */
	public native final HistoryClass html5(boolean val) /*-{
		this.html5 = val;
		return this;
	}-*/;

	/**
	 * Name of this component.
	 * 
	 * @return
	 */
	public native final String NAME() /*-{
		return this.NAME;
	}-*/;

	/**
	 * Name of this component.
	 * 
	 * @param val
	 * @return this - for setter chaining
	 */
	public native final HistoryClass NAME(String val) /*-{
		this.NAME = val;
		return this;
	}-*/;

	/**
	 * Whether or not this browser supports the window.onhashchange event
	 * natively. Note that even if this is true, you may still want to use
	 * HistoryHash's synthetic hashchange event since it normalizes
	 * implementation differences and fixes spec violations across various
	 * browsers.
	 * 
	 * @return
	 */
	public native final boolean nativeHashChange() /*-{
		return this.nativeHashChange;
	}-*/;

	/**
	 * Whether or not this browser supports the window.onhashchange event
	 * natively. Note that even if this is true, you may still want to use
	 * HistoryHash's synthetic hashchange event since it normalizes
	 * implementation differences and fixes spec violations across various
	 * browsers.
	 * 
	 * @param val
	 * @return this - for setter chaining
	 */
	public native final HistoryClass nativeHashChange(boolean val) /*-{
		this.nativeHashChange = val;
		return this;
	}-*/;

	/**
	 * Constant used to identify state changes originating from the add()
	 * method.
	 * 
	 * @return
	 */
	public native final String SRC_ADD() /*-{
		return this.SRC_ADD;
	}-*/;

	/**
	 * Constant used to identify state changes originating from the add()
	 * method.
	 * 
	 * @param val
	 * @return this - for setter chaining
	 */
	public native final HistoryClass SRC_ADD(String val) /*-{
		this.SRC_ADD = val;
		return this;
	}-*/;

	/**
	 * Constant used to identify state changes originating from the replace()
	 * method.
	 * 
	 * @return
	 */
	public native final String SRC_REPLACE() /*-{
		return this.SRC_REPLACE;
	}-*/;

	/**
	 * Constant used to identify state changes originating from the replace()
	 * method.
	 * 
	 * @param val
	 * @return this - for setter chaining
	 */
	public native final HistoryClass SRC_REPLACE(String val) /*-{
this.SRC_REPLACE = val; 
return this; 
}-*/;
}
