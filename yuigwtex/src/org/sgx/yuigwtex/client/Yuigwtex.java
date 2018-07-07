package org.sgx.yuigwtex.client;

import org.sgx.yuigwt.yui.YUICallback;
import org.sgx.yuigwt.yui.YuiContext;
import org.sgx.yuigwt.yui.YuiLoader;
import org.sgx.yuigwt.yui.event.EventCallback;
import org.sgx.yuigwt.yui.event.EventFacade;
import org.sgx.yuigwt.yui.node.Node;
import org.sgx.yuigwt.yui.widget.button.Button;
import org.sgx.yuigwt.yui.widget.button.ButtonConfig;
import org.sgx.yuigwt.yui.widget.slider.Slider;

import com.google.gwt.core.client.EntryPoint;
import com.google.gwt.user.client.Window;
import com.google.gwt.user.client.ui.RootPanel;

/**
 * a sample gwt entry point that uses YUIGWT and in particular programatically loading yui-min javascript using YuiLoader utility
 * 
 * @author sg
 *
 */
public class Yuigwtex implements EntryPoint, YUICallback {
	
	public void onModuleLoad() {
		//The url for yui-min.js from a cdn
		String yuiUrl = "http://yui.yahooapis.com/3.8.1/build/yui/yui-min.js";
		
		//Initial yui modules to work with 
		String[] modules = {"button", "slider"};
		
		YuiLoader.load(yuiUrl, modules, this);
	}
	@Override
	public void ready(YuiContext Y) {
		Node parentNode = Y.one(RootPanel.get());
		
		//remember to add yui3 skin class name to your root node 			
		parentNode.addClass("yui3-skin-sam"); 
		
		Button button1 = (Button) Y.newButton(
			ButtonConfig.create().label("a YUI3 button widget")
		).render(parentNode);	
		button1.on("click", new EventCallback() {			
			@Override
			public void call(EventFacade e) {
				Window.alert(e.domEvent().getClientX()+""); 
			}
		}); 
		
		parentNode.append("<p>First a horizontal default slider...");
		Y.newSlider().render(parentNode); 
		
		parentNode.append("<p>Now a vertical, custom slider...");
		Y.newSlider(Slider.config().axis("y").min(1).
			max(5).value(3).length(200)).render(parentNode);		
	}
}
