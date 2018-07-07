package org.sgx.yuigwt.yui.util;

/**
 * TODO: only tested on firefox
 * 
 * @author sg
 * 
 */
public class JsError extends JsObject {
	protected JsError(){}
	/**
	 * 
	 * @return
	 */
	public native final String fileName() /*-{
		return this.fileName;
	}-*/;

	/**
	 * 
	 * @param val
	 * @return this - for setter chaining
	 */
	public native final JsError fileName(String val) /*-{
		this.fileName = val;
		return this;
	}-*/;

	/**
	 * 
	 * @return
	 */
	public native final int lineNumber() /*-{
		return this.lineNumber;
	}-*/;

	/**
	 * 
	 * @param val
	 * @return this - for setter chaining
	 */
	public native final JsError lineNumber(int val) /*-{
		this.lineNumber = val;
		return this;
	}-*/;
}
