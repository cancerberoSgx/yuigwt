package org.sgx.yuigwt.yui.widget.autocomplete;

import org.sgx.yuigwt.yui.node.Node;
import org.sgx.yuigwt.yui.widget.WidgetEvent;

import com.google.gwt.core.client.JsArray;

public class AutoCompleteEvent extends WidgetEvent {
	protected AutoCompleteEvent() {
	};

	/**
	 * Full contents of the text input field or textarea that generated the query.
	 * 
	 * @return
	 */
	public native final String inputValue() /*-{
		return this.inputValue;
	}-*/;

	/**
	 * Full contents of the text input field or textarea that generated the query.
	 * 
	 * @param val
	 * @return this - for setter chaining
	 */
	public native final AutoCompleteEvent inputValue(String val) /*-{
		this.inputValue = val;
		return this;
	}-*/;

	/**
	 * AutoComplete query. This is the string that will be used to request completion results. It may or may not be the same as inputValue.
	 * 
	 * @return
	 */
	public native final String query() /*-{
		return this.query;
	}-*/;

	/**
	 * AutoComplete query. This is the string that will be used to request completion results. It may or may not be the same as inputValue.
	 * 
	 * @param val
	 * @return this - for setter chaining
	 */
	public native final AutoCompleteEvent query(String val) /*-{
		this.query = val;
		return this;
	}-*/;

	/**
	 * Source of the event.
	 * 
	 * @return
	 */
	public native final String src() /*-{
		return this.src;
	}-*/;

	/**
	 * Source of the event.
	 * 
	 * @param val
	 * @return this - for setter chaining
	 */
	public native final AutoCompleteEvent src(String val) /*-{
		this.src = val;
		return this;
	}-*/;

	/**
	 * 
	 * @return
	 */
	public native final Node itemNode() /*-{
		return this.itemNode;
	}-*/;

	/**
	 * 
	 * @param val
	 * @return this - for setter chaining
	 */
	public native final AutoCompleteEvent itemNode(Node val) /*-{
		this.itemNode = val;
		return this;
	}-*/;

	/**
	 * Result object for the selected resul in a "select" event
	 * 
	 * @return
	 */
	public native final AutoCompleteResult result() /*-{
		return this.result;
	}-*/;

	/**
	 * Raw, unfiltered result data from the source (if available).
	 * 
	 * @return
	 */
	public native final JsArray data() /*-{
		return this.data;
	}-*/;

	/**
	 * Array of filtered, formatted, and highlighted result
	 * 
	 * @return
	 */
	public native final JsArray<AutoCompleteResult> results() /*-{
		return this.results;
	}-*/;
}
