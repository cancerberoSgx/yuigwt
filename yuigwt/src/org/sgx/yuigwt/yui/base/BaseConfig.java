package org.sgx.yuigwt.yui.base;

import org.sgx.yuigwt.yui.attr.AttributeConfig;
import org.sgx.yuigwt.yui.yui.PluginBase;

public class BaseConfig extends AttributeConfig {
	protected BaseConfig() {
	}

	/**
	 * Flag indicating whether or not this object has been through the destroy
	 * lifecycle phase.
	 * 
	 * @return
	 */
	public native final boolean destroyed() /*-{
		return this.destroyed;
	}-*/;

	/**
	 * Flag indicating whether or not this object has been through the destroy
	 * lifecycle phase.
	 * 
	 * @param val
	 * @return this - for setter chaining
	 */
	public native final BaseConfig destroyed(boolean val) /*-{
		this.destroyed = val;
		return this;
	}-*/;
	
	/**
	 * Flag indicating whether or not this object has been through the destroy
	 * lifecycle phase.
	 * 
	 * @param val
	 * @return this - for setter chaining
	 */
	public native final BaseConfig plugins(PluginBase[] plugins) /*-{
		this.plugins = @org.sgx.yuigwt.yui.util.JsUtil::toJsArray([Lcom/google/gwt/core/client/JavaScriptObject;)(plugins);
		return this;
	}-*/;
	public native final BaseConfig plugins(PluginBase plugin) /*-{
		this.plugins = [plugin]; 
		return this;
	}-*/;
}
