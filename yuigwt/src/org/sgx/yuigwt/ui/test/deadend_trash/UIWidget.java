//package org.sgx.yuigwt.ui.test.deadend_trash;
//
//import org.sgx.yuigwt.yui.YuiContext;
//import org.sgx.yuigwt.yui.gwt.GWTUtil;
//import org.sgx.yuigwt.yui.widget.button.ButtonConfig;
//
//import com.google.gwt.core.client.JavaScriptObject;
//import com.google.gwt.dom.client.Element;
//import com.google.gwt.uibinder.client.UiFactory;
//import com.google.gwt.user.client.ui.Composite;
//import com.google.gwt.user.client.ui.HTMLPanel;
//
///**
// * GWT abstract widget for wrapping YUI widgets.
// * This class hierarchy is meant to work with UIBinder. 
// * 
// * IMPORTANT: please call YWidget.setYuiContext(Y) with a 
// * previously loaded YuiContext with required modules loaded. 
// * 
// * @author sg
// * 
// */
//public abstract class UIWidget extends Composite {
//
//	org.sgx.yuigwt.yui.widget.Widget yuiWidget;
//	private static YuiContext yuiContext;
//	
//	public UIWidget(){}
//	public UIWidget(JavaScriptObject config) {
//		super(); 
//		initUIWidget(config); 
//	}
//
//	/**
//	 * this should create the yui widget assigning the yuiWidget field, 
//	 * 
//	 * then a Widget instance wrapping that yuiwidget, 
//	 * 
//	 * then call initWidget() with the later
//	 * 
//	 * and then setStyleName();
//	 * @param config
//	 */
//	protected abstract void initUIWidget(JavaScriptObject config); 
////	{
////		yuiWidget = newYuiWidget(yuiContext, config);
////		HTMLPanel panel = GWTUtil.YUI2GWT(yuiContext, yuiWidget);
////		initWidget(panel);
////		setStyleName(getYuiStyleName());
////	}
//	protected String getYuiStyleName() {
//		return "yuiwidget-" + this.getClass().getName();
//	}
//
////	/**
////	 * subclasses must override this method
////	 * 
////	 * @param y
////	 * @param config
////	 * @return
////	 */
////	protected abstract org.sgx.yuigwt.yui.widget.Widget newYuiWidget(YuiContext y, JavaScriptObject config);
//
//	public org.sgx.yuigwt.yui.widget.Widget getYuiWidget() {
//		return yuiWidget;
//	}
//
//	public static YuiContext getYuiContext() {
//		return yuiContext;
//	}
//	public static YuiContext Y() {
//		return yuiContext;
//	}
//	public static void setYuiContext(YuiContext yuiContext) {
//		UIWidget.yuiContext = yuiContext;
//	}
//	
//	
//	
//}
