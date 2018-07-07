package org.sgx.yuigwt.yui.widget.button;

import org.sgx.yuigwt.yui.widget.WidgetConfig;

/**
 * 
 * @author s
 * 
 */
public class ButtonConfig extends WidgetConfig {
	protected ButtonConfig() {
	}

	public static final native ButtonConfig create()/*-{
		return {};
	}-*/;

	/**
	 * button's label
	 * 
	 * @return
	 */
	public native final String label() /*-{
		return this.label;
	}-*/;

	/**
	 * button's label
	 * 
	 * @param val
	 * @return this - for setter chaining
	 */
	public native final ButtonConfig label(String val) /*-{
		this.label = val;
		return this;
	}-*/;
}
