package org.sgx.yuigwt.alloyui.widget.component;

import org.sgx.yuigwt.yui.widget.ext.WidgetExt;

/**
 * A base class for Component, providing: * Widget Lifecycle (initializer,
 * renderUI, bindUI, syncUI, destructor)
 * 
 * @author sg
 * 
 */
public class Component extends WidgetExt {
	protected Component() {
	}

	/**
	 * Clone the current Component.
	 * 
	 * @return
	 */
	public native final Component clone()/*-{
		return this.clone();
	}-*/;

}
