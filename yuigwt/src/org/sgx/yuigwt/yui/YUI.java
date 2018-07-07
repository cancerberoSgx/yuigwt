package org.sgx.yuigwt.yui;

import org.sgx.yuigwt.yui.event.EventTarget;

/**
 * an overlay type for YUI global object. In this special case of the YUI global object, we support both static and instance methods, for example, YUI.Use and YUI.YUI().use()
 * 
 * 
 * @author sg
 * 
 */
public class YUI extends EventTarget {

	protected YUI() {
	}

	// Main constructors

	public static native final YUI YUI(YuiConfig cfg)/*-{
		return $wnd.YUI(cfg);
	}-*/;

	public static native final YUI YUI()/*-{
		return $wnd.YUI();
	}-*/;

	/**
	 * @param modules
	 * @param c
	 */
	public static native final void Use(YuiConfig cfg, String[] modules, YUICallback c)/*-{
		var f = $entry(function(Y) {
			c.@org.sgx.yuigwt.yui.YUICallback::ready(Lorg/sgx/yuigwt/yui/YuiContext;)(Y);
		});
		$wnd
				.YUI(cfg)
				.use(
						@org.sgx.yuigwt.yui.util.JsUtil::toJsArrayString([Ljava/lang/String;)(modules),
						f);
	}-*/;

	/**
	 * shortcut for new YUI().use()
	 * 
	 * @param modules
	 * @param c
	 */
	public static native final void Use(String[] modules, YUICallback c)/*-{
		var f = $entry(function(Y) {
			c.@org.sgx.yuigwt.yui.YUICallback::ready(Lorg/sgx/yuigwt/yui/YuiContext;)(Y);
		});
		$wnd
				.YUI()
				.use(
						@org.sgx.yuigwt.yui.util.JsUtil::toJsArrayString([Ljava/lang/String;)(modules),
						f);
	}-*/;

	/**
	 * @param modules
	 * @param c
	 */
	public native final void use(String[] modules, YUICallback c)/*-{
		var f = $entry(function(Y) {
			c.@org.sgx.yuigwt.yui.YUICallback::ready(Lorg/sgx/yuigwt/yui/YuiContext;)(Y);
		});
		var m = @org.sgx.yuigwt.yui.util.JsUtil::toJsArrayString([Ljava/lang/String;)(modules);
		this.use(m,	f);
	}-*/;

	// Y.use() - it is different of YUI().use() because the modules are loaded to the "main sandbox" instead to only load to "local sandbox"

	// public native final void use(Object...params)/*-{
	// if(!params)return;
	// var f = $entry(function(Y){
	// var c = params[params.length-1];
	// c.@org.sgx.yuigwt.yui.YUICallback::ready(Lorg/sgx/yuigwt/yui/YuiContext;)(Y);
	// });
	// var modules =
	// @org.sgx.yuigwt.yui.util.JsUtil::arrayRemoveLast([Ljava/lang/Object;)(params);
	// this.use(@org.sgx.yuigwt.yui.util.JsUtil::toJsArrayString([Ljava/lang/Object;)(modules),
	// f);
	// }-*/;

	// public final native Shape mouseDown(MouseEventListener l)/*-{
	// var f = $entry(function(e) {
	// l.@org.sgx.raphael4gwt.raphael.event.MouseEventListener::notifyMouseEvent(Lcom/google/gwt/dom/client/NativeEvent;)(e);
	// });
	// @org.sgx.raphael4gwt.raphael.event.EventHelper::putMouseEventListener(Lorg/sgx/raphael4gwt/raphael/event/MouseEventListener;Lcom/google/gwt/core/client/JavaScriptObject;)(l,f);
	// return this.mousedown(f);
	// }-*/;

}
