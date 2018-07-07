package org.sgx.yuigwt.yui.history;

import com.google.gwt.core.client.JavaScriptObject;

/**
 * 
 * @author sg
 * 
 */
public class HistoryBaseConfig extends JavaScriptObject {
	protected HistoryBaseConfig() {
	}

	/**
	 * 
	 * @return
	 */
	public native final JavaScriptObject initialState() /*-{
		return this.initialState;
	}-*/;

	/**
	 * If true, a history:change event will be fired whenever the URL changes, even if there is no associated state change.
	 * 
	 * @param val
	 * @return this - for setter chaining
	 */
	public native final HistoryBaseConfig initialState(JavaScriptObject val) /*-{
		this.initialState = val;
		return this;
	}-*/;

	/**
	 * If true, a history:change event will be fired whenever the URL changes, even if there is no associated state change.
	 * 
	 * @return
	 */
	public native final boolean force() /*-{
		return this.force;
	}-*/;

	/**
	 * 
	 * @param val
	 * @return this - for setter chaining
	 */
	public native final HistoryBaseConfig force(boolean val) /*-{
		this.force = val;
		return this;
	}-*/;
}
