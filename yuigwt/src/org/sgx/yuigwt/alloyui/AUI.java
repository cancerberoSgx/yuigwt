package org.sgx.yuigwt.alloyui;

import org.sgx.yuigwt.yui.YUI;
import org.sgx.yuigwt.yui.YUICallback;
import org.sgx.yuigwt.yui.YuiConfig;
import org.sgx.yuigwt.yui.event.EventTarget;

public class AUI extends EventTarget {
	protected AUI() {
	}

	
	// Main constructors
	
	public static native final AUI AUI(YuiConfig cfg)/*-{
		return $wnd.AUI(cfg);
	}-*/;

	public static native final AUI AUI()/*-{
		return $wnd.AUI();
	}-*/;
	
	
	/**
	 * @param modules
	 * @param c
	 */
	public native final void use(String[] modules, AUICallback c)/*-{
		var f = $entry(function(Y) {
			c.@org.sgx.yuigwt.alloyui.AUICallback::ready(Lorg/sgx/yuigwt/alloyui/AuiContext;)(Y);
		});
		this.use(@org.sgx.yuigwt.yui.util.JsUtil::toJsArrayString([Ljava/lang/String;)(modules), f);
	}-*/;
	/**
	 * @param modules
	 * @param c
	 */
	public static native final void Use(String[] modules, AUICallback c)/*-{
		var f = $entry(function(Y) {
			c.@org.sgx.yuigwt.alloyui.AUICallback::ready(Lorg/sgx/yuigwt/alloyui/AuiContext;)(Y);
		});
		$wnd.AUI().use(@org.sgx.yuigwt.yui.util.JsUtil::toJsArrayString([Ljava/lang/String;)(modules), f);
	}-*/;
	
	/**
	 * @param modules
	 * @param c
	 */
	public static native final void Use(String[] modules, YuiConfig config, AUICallback c)/*-{
		var f = $entry(function(Y) {
			c.@org.sgx.yuigwt.alloyui.AUICallback::ready(Lorg/sgx/yuigwt/alloyui/AuiContext;)(Y);
		});
		$wnd.AUI(config).use(@org.sgx.yuigwt.yui.util.JsUtil::toJsArrayString([Ljava/lang/String;)(modules), f);
	}-*/;
	
	/**
	 * @param modules
	 * @param c
	 */
	public native final void ready(String[] modules, AUICallback c)/*-{
		var f = $entry(function(Y) {
			c.@org.sgx.yuigwt.alloyui.AUICallback::ready(Lorg/sgx/yuigwt/alloyui/AuiContext;)(Y);
		});
		this.ready(@org.sgx.yuigwt.yui.util.JsUtil::toJsArrayString([Ljava/lang/String;)(modules), f);
	}-*/;
	
	/**
	 * @param modules
	 * @param c
	 */
	public static native final void Ready(String[] modules, AUICallback c)/*-{
		var f = $entry(function(Y) {
			c.@org.sgx.yuigwt.alloyui.AUICallback::ready(Lorg/sgx/yuigwt/alloyui/AuiContext;)(Y);
		});
		$wnd.AUI().ready(@org.sgx.yuigwt.yui.util.JsUtil::toJsArrayString([Ljava/lang/String;)(modules), f);
	}-*/;
	
	/**
	 * @param modules
	 * @param c
	 */
	public static native final void Ready(String[] modules, YuiConfig config, AUICallback c)/*-{
		var f = $entry(function(Y) {
			c.@org.sgx.yuigwt.alloyui.AUICallback::ready(Lorg/sgx/yuigwt/alloyui/AuiContext;)(Y);
		});
		$wnd.AUI(config).ready(@org.sgx.yuigwt.yui.util.JsUtil::toJsArrayString([Ljava/lang/String;)(modules), f);
	}-*/;
	
	
//	/**
//	 * @param modules
//	 * @param c
//	 */
//	public static native final void Ready(YuiConfig cfg, String[] modules,
//			YUICallback c)/*-{
//		var f = $entry(function(Y) {
//			c.@org.sgx.yuigwt.yui.YUICallback::ready(Lorg/sgx/yuigwt/yui/YuiContext;)(Y);
//		});
//		$wnd
//				.AUI(cfg)
//				.use(
//						@org.sgx.yuigwt.yui.util.JsUtil::toJsArrayString([Ljava/lang/String;)(modules),
//						f);
//	}-*/;
//
//	/**
//	 * shortcut for new YUI().use()
//	 * @param modules
//	 * @param c
//	 */
//	public static native final void Use(String[] modules, YUICallback c)/*-{
//		var f = $entry(function(Y) {
//			c.@org.sgx.yuigwt.yui.YUICallback::ready(Lorg/sgx/yuigwt/yui/YuiContext;)(Y);
//		});
//		$wnd
//				.YUI()
//				.use(
//						@org.sgx.yuigwt.yui.util.JsUtil::toJsArrayString([Ljava/lang/String;)(modules),
//						f);
//	}-*/;
//
//	/**
//	 * @param modules
//	 * @param c
//	 */
//	public native final void use(String[] modules, YUICallback c)/*-{
//		var f = $entry(function(Y) {
//			c.@org.sgx.yuigwt.yui.YUICallback::ready(Lorg/sgx/yuigwt/yui/YuiContext;)(Y);
//		});
//		this
//				.use(
//						@org.sgx.yuigwt.yui.util.JsUtil::toJsArrayString([Ljava/lang/String;)(modules),
//						f);
//	}-*/;
}
