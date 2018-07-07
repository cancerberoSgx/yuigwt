package org.sgx.yuigwt.galleryexplorer.client.ui;

import org.sgx.yuigwt.galleryexplorer.client.api.Module;
import org.sgx.yuigwt.yui.YuiContext;
import org.sgx.yuigwt.yui.console.Console;
import org.sgx.yuigwt.yui.console.ConsoleConfig;
import org.sgx.yuigwt.yui.event.EventCallback;
import org.sgx.yuigwt.yui.event.EventFacade;
import org.sgx.yuigwt.yui.node.Node;
import org.sgx.yuigwt.yui.stylesheet.StyleSheet;
import org.sgx.yuigwt.yui.util.JsObject;
import org.sgx.yuigwt.yui.util.Style;
import org.sgx.yuigwt.yui.widget.button.ButtonConfig;
import org.sgx.yuigwt.yui.widget.button.ButtonEvent;
import org.sgx.yuigwt.yui.yql.YQL;
import org.sgx.yuigwt.yui.yql.YQLCallback;
import org.sgx.yuigwt.yui.yql.YQLResult;
import org.sgx.yuigwt.yuigallery.YuiGalleryContext;

import com.google.gwt.core.client.JavaScriptObject;
import com.google.gwt.core.client.JsArray;
import com.google.gwt.user.client.Window;

public class Gallery {
	YuiGalleryContext Y;
	Node parentNode;
	GalleryUtil util;
	Console console;
	private Node mainPanel, mainContent, navContent, extraContent, footer;
	StyleSheet styleSheet;
	/**
	 * creates a gallery ui, load the module gallery data from datatables.org, and 
	 * renders the webapp.
	 * @param Y
	 * @param parentNode
	 */
	public Gallery(YuiGalleryContext Y, Node parentNode) {
		this.Y=Y; 
		this.parentNode=parentNode;
		console = Y.newConsole(ConsoleConfig.create().collapsed(true)).render().cast();
		console.srcNode().setXY(260,20); 
		this.util = new GalleryUtil(this); 	
//		render(); 
	}
	
	public void render() {

		styleSheet = Y.newStyleSheet(); 
		
		Node body = Y.one("body");
		body.addClass("yui3-skin-sam"); 
		
		mainPanel = body.one("#layout");
		navContent = body.one("#nav>.content"); 
		navContent.setStyle("border", "4px solid pink"); 
		mainContent = body.one("#main>.content"); 
		mainContent.getDOMNode().setId("main-example-panel"); 
		extraContent = body.one("#extra>.content");
		footer = body.one("#ft");
		
		Y.newButton(ButtonConfig.create().label("search1").
			on("click", new EventCallback<ButtonEvent>() {
			@Override
			public void call(ButtonEvent e) {
				new Search1().render(mainContent, Gallery.this); 
			}
		})).render(navContent); 
		
		Y.newButton(ButtonConfig.create().label("module listing 1").
			on("click", new EventCallback<ButtonEvent>() {
			@Override
			public void call(ButtonEvent e) {
				new ABCModuleListing().render(mainContent, Gallery.this); 
			}
		})).render(navContent); 
		
		installHeightHack(Y); 
	}
	
	
	
	final static int vdiff=105;
	final static String sel = "#nav .content, #main .content, #extra .content"; 
	private void installHeightHack(final YuiContext Y) {	
		Y.on("windowresize", new EventCallback() {		
			@Override
			public void call(EventFacade e) {
				styleSheet.set(sel, Style.create().height((getMainContent().winHeight()-vdiff)+"px")); 
			}
		}); 
		styleSheet.set(sel, Style.create().height((getMainContent().winHeight()-vdiff)+"px"));
	}
	

	public Node getMainContent() {
		return mainContent;
	}
	public void setMainContent(Node mainContent) {
		this.mainContent = mainContent;
	}
	public Node getNavContent() {
		return navContent;
	}
	public StyleSheet getStyleSheet() {
		return styleSheet;
	}
}
