package org.sgx.yuigwt.yui.get;

import com.google.gwt.core.client.JavaScriptObject;
import com.google.gwt.dom.client.Document;
import com.google.gwt.dom.client.Element;
/**
 * options for get operations. 
 * @author sg
 *
 */
public class GetConfig extends JavaScriptObject {
	protected GetConfig() {
	}

	public static final native GetConfig create()/*-{
		return {};
	}-*/;

	/**
	 * Whether or not to load scripts asynchronously, meaning they're requested
	 * in parallel and execution order is not guaranteed. Has no effect on CSS,
	 * since CSS is always loaded asynchronously.
	 * 
	 * @return
	 */
	public native final boolean async() /*-{
		return this.async;
	}-*/;

	/**
	 * Whether or not to load scripts asynchronously, meaning they're requested
	 * in parallel and execution order is not guaranteed. Has no effect on CSS,
	 * since CSS is always loaded asynchronously.
	 * 
	 * @param val
	 * @return this - for setter chaining
	 */
	public native final GetConfig async(boolean val) /*-{
		this.async = val;
		return this;
	}-*/;

	/**
	 * HTML attribute name/value pairs that should be added to inserted nodes.
	 * By default, the charset attribute will be set to "utf-8" and nodes will
	 * be given an auto-generated id attribute, but you can override these with
	 * your own values if desired.
	 * 
	 * @return
	 */
	public native final JavaScriptObject attributes() /*-{
		return this.attributes;
	}-*/;

	/**
	 * HTML attribute name/value pairs that should be added to inserted nodes.
	 * By default, the charset attribute will be set to "utf-8" and nodes will
	 * be given an auto-generated id attribute, but you can override these with
	 * your own values if desired.
	 * 
	 * @param val
	 * @return this - for setter chaining
	 */
	public native final GetConfig attributes(JavaScriptObject val) /*-{
		this.attributes = val;
		return this;
	}-*/;

	/**
	 * Whether or not to automatically purge inserted nodes after the purge
	 * threshold is reached. This is true by default for JavaScript, but false
	 * for CSS since purging a CSS node will also remove any styling applied by
	 * the referenced file.
	 * 
	 * @return
	 */
	public native final boolean autopurge() /*-{
		return this.autopurge;
	}-*/;

	/**
	 * Whether or not to automatically purge inserted nodes after the purge
	 * threshold is reached. This is true by default for JavaScript, but false
	 * for CSS since purging a CSS node will also remove any styling applied by
	 * the referenced file.
	 * 
	 * @param val
	 * @return this - for setter chaining
	 */
	public native final GetConfig autopurge(boolean val) /*-{
		this.autopurge = val;
		return this;
	}-*/;

	/**
	 * Arbitrary data object to pass to "on*" callbacks.
	 * 
	 * @return
	 */
	public native final JavaScriptObject data() /*-{
		return this.data;
	}-*/;

	/**
	 * Arbitrary data object to pass to "on*" callbacks.
	 * 
	 * @param val
	 * @return this - for setter chaining
	 */
	public native final GetConfig data(JavaScriptObject val) /*-{
		this.data = val;
		return this;
	}-*/;

	/**
	 * Document into which nodes should be inserted. By default, the current
	 * document is used.
	 * 
	 * @return
	 */
	public native final Document doc() /*-{
		return this.doc;
	}-*/;

	/**
	 * Document into which nodes should be inserted. By default, the current
	 * document is used.
	 * 
	 * @param val
	 * @return this - for setter chaining
	 */
	public native final GetConfig doc(Document val) /*-{
		this.doc = val;
		return this;
	}-*/;

	/**
	 * HTML element or id string of an element before which all generated nodes
	 * should be inserted. If not specified, Get will automatically determine
	 * the best place to insert nodes for maximum compatibility.
	 * 
	 * @return
	 */
	public native final String inserBeforeString() /*-{
		return this.inserBefore + "";
	}-*/;

	/**
	 * HTML element or id string of an element before which all generated nodes
	 * should be inserted. If not specified, Get will automatically determine
	 * the best place to insert nodes for maximum compatibility.
	 * 
	 * @param val
	 * @return this - for setter chaining
	 */
	public native final GetConfig inserBefore(String val) /*-{
		this.inserBefore = val;
		return this;
	}-*/;

	/**
	 * HTML element or id string of an element before which all generated nodes
	 * should be inserted. If not specified, Get will automatically determine
	 * the best place to insert nodes for maximum compatibility.
	 * 
	 * @param val
	 * @return this - for setter chaining
	 */
	public native final GetConfig inserBefore(Element val) /*-{
		this.inserBefore = val;
		return this;
	}-*/;

	/**
	 * SimpleCallback to execute after a transaction is complete, regardless of
	 * whether it succeeded or failed.
	 * 
	 * @param c
	 * @return
	 */
	public native final GetConfig onEnd(GetOptionsCallback c)/*-{
		//function dump(o) {var s = ""; for(var i in o) {s+=i+", "; }; return s; }; 
		var f = $entry(function(params) {
			return c.@org.sgx.yuigwt.yui.get.GetOptionsCallback::call(Lorg/sgx/yuigwt/yui/get/Transaction;)(arguments[0]);
		});
		this.onEnd = f;
		return this;
	}-*/;

	/**
	 * SimpleCallback to execute after a transaction fails, times out, or is aborted.
	 * 
	 * @param c
	 * @return
	 */
	public native final GetConfig onFailure(GetOptionsCallback c)/*-{
		//function dump(o) {var s = ""; for(var i in o) {s+=i+", "; }; return s; }; 
		var f = $entry(function(params) {
			return c.@org.sgx.yuigwt.yui.get.GetOptionsCallback::call(Lorg/sgx/yuigwt/yui/get/Transaction;)(arguments[0]);
		});
		this.onFailure = f;
		return this;
	}-*/;

	/**
	 * SimpleCallback to execute after each individual request in a transaction either
	 * succeeds or fails.
	 * 
	 * @param c
	 * @return
	 */
	public native final GetConfig onProgress(GetOptionsCallback c)/*-{
		//function dump(o) {var s = ""; for(var i in o) {s+=i+", "; }; return s; }; 
		var f = $entry(function(params) {
			return c.@org.sgx.yuigwt.yui.get.GetOptionsCallback::call(Lorg/sgx/yuigwt/yui/get/Transaction;)(arguments[0]);
		});
		this.onProgress = f;
		return this;
	}-*/;

	/**
	 * SimpleCallback to execute after a transaction times out
	 * 
	 * @param c
	 * @return
	 */
	public native final GetConfig onTimeout(GetOptionsCallback c)/*-{
		//function dump(o) {var s = ""; for(var i in o) {s+=i+", "; }; return s; }; 
		var f = $entry(function(params) {
			return c.@org.sgx.yuigwt.yui.get.GetOptionsCallback::call(Lorg/sgx/yuigwt/yui/get/Transaction;)(arguments[0]);
		});
		this.onTimeout = f;
		return this;
	}-*/;

	/**
	 * Polling interval (in milliseconds) for detecting CSS load completion in
	 * browsers that don't support the load event on <link> nodes. This isn't
	 * used for JavaScript.
	 * 
	 * @return
	 */
	public native final int pollInterval() /*-{
		return this.pollInterval;
	}-*/;

	/**
	 * Polling interval (in milliseconds) for detecting CSS load completion in
	 * browsers that don't support the load event on <link> nodes. This isn't
	 * used for JavaScript.
	 * 
	 * @param val
	 * @return this - for setter chaining
	 */
	public native final GetConfig pollInterval(int val) /*-{
		this.pollInterval = val;
		return this;
	}-*/;

	/**
	 * DataTypeNumber of nodes to insert before triggering an automatic purge when
	 * autopurge is true.
	 * 
	 * @return
	 */
	public native final int purgethreshold() /*-{
		return this.purgethreshold;
	}-*/;

	/**
	 * DataTypeNumber of nodes to insert before triggering an automatic purge when
	 * autopurge is true.
	 * 
	 * @param val
	 * @return this - for setter chaining
	 */
	public native final GetConfig purgethreshold(int val) /*-{
		this.purgethreshold = val;
		return this;
	}-*/;

	/**
	 * DataTypeNumber of milliseconds to wait before aborting a transaction. When a
	 * timeout occurs, the onTimeout callback is called, followed by onFailure
	 * and finally onEnd. By default, there is no timeout.
	 * 
	 * @return
	 */
	public native final int timeout() /*-{
		return this.timeout;
	}-*/;

	/**
	 * DataTypeNumber of milliseconds to wait before aborting a transaction. When a
	 * timeout occurs, the onTimeout callback is called, followed by onFailure
	 * and finally onEnd. By default, there is no timeout.
	 * 
	 * @param val
	 * @return this - for setter chaining
	 */
	public native final GetConfig timeout(int val) /*-{
		this.timeout = val;
		return this;
	}-*/;

	/**
	 * Resource type ("css" or "js"). This option is set automatically by the
	 * css() and js() functions and will be ignored there, but may be useful
	 * when using the load() function. If not specified, the type will be
	 * inferred from the URL, defaulting to "js" if the URL doesn't contain a
	 * recognizable file extension.
	 * 
	 * @return
	 */
	public native final String type() /*-{
		return this.type;
	}-*/;

	/**
	 * Resource type ("css" or "js"). This option is set automatically by the
	 * css() and js() functions and will be ignored there, but may be useful
	 * when using the load() function. If not specified, the type will be
	 * inferred from the URL, defaulting to "js" if the URL doesn't contain a
	 * recognizable file extension.
	 * 
	 * @param val
	 * @return this - for setter chaining
	 */
	public native final GetConfig type(String val) /*-{
		this.type = val; 
		return this; 
	}-*/;
}
