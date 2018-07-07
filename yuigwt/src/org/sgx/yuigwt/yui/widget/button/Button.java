package org.sgx.yuigwt.yui.widget.button;

import org.sgx.yuigwt.yui.widget.Widget;

/**
 * YUI's Button component is a mixed-module approach to providing a simple-to-use button that normalizes and enhances the Web browser's default button component.
 * 
 * @see http://yuilibrary.com/yui/docs/button/
 * @see http://yuilibrary.com/yui/docs/api/modules/button.html
 * @author sg
 * 
 */
public class Button extends Widget {
	protected Button() {
	}

	public static final native ButtonConfig config()/*-{
		return {};
	}-*/;

	/**
	 * Hooks up events for the widget
	 */
	public native final void bindUI()/*-{
		this.bindUI();
	}-*/;
	
/**
 * 
 * @return
 */
public native final String label() /*-{
return this.get("label"); 
}-*/;

/**
 * 
 * @param val
 * @return this - for method chaining
 */
public native final Button label(String val) /*-{
this.set("label", val); 
return this; 
}-*/;
}
