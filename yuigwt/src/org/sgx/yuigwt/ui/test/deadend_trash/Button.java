//package org.sgx.yuigwt.ui.test.deadend_trash;
//
//import org.sgx.yuigwt.yui.YuiContext;
//import org.sgx.yuigwt.yui.event.EventCallback;
//import org.sgx.yuigwt.yui.gwt.GWTUtil;
//import org.sgx.yuigwt.yui.widget.button.ButtonConfig;
//import org.sgx.yuigwt.yui.widget.button.ButtonEvent;
//
//import com.google.gwt.core.client.JavaScriptObject;
//import com.google.gwt.user.client.ui.HTMLPanel;
///**
// * GWT Widget wrapping a YUI Button
// * @author sg
// *
// */
//public class Button extends UIWidget {
//	public Button() {
////		super( ButtonConfig.create());
//		initUIWidget(ButtonConfig.create()); 
//	}
//	public Button(String label, EventCallback<ButtonEvent> clickHandler) {
//		this(); 
//		setLabel(label); 
//		getYuiWidget().on("click", clickHandler); 
//		
//	}
//	
//	protected void initUIWidget(JavaScriptObject config)	{
//		yuiWidget = Y().newButton(config); //newYuiWidget(Y(), config);
//		HTMLPanel panel = GWTUtil.YUI2GWT(Y(), yuiWidget);
//		initWidget(panel);
//		setStyleName(getYuiStyleName());
////		yuiWidget.render(panel.getElement()); 
//	}
//	
////	@Override
////	protected org.sgx.yuigwt.yui.widget.Widget newYuiWidget(YuiContext y, JavaScriptObject config) {
////		return y.newButton(config); 
////	}
//	
//	public void setLabel(String label) {
//		getYuiWidget().set("label", label); 
//	}
//	public String getLabel() {
//		return getYuiWidget().getString("label"); 
//	}
//	public void setDisabled(boolean val) {
//		getYuiWidget().set("disabled", val);
//	}
//	public boolean getDisabled() {
//		return getYuiWidget().getBoolean("disabled");  
//	}
//}
