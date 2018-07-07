package org.sgx.yuigwt.yuitest1.gallery.test;

import static org.sgx.yuigwt.yuitest1.gallery.GalleryConstants.TAG_NODE;
import static org.sgx.yuigwt.yuitest1.gallery.GalleryConstants.TAG_SCROLLVIEW;

import org.sgx.yuigwt.yui.YUI;
import org.sgx.yuigwt.yui.YUICallback;
import org.sgx.yuigwt.yui.YuiContext;
import org.sgx.yuigwt.yui.attr.AttributeEvent;
import org.sgx.yuigwt.yui.console.Console;
import org.sgx.yuigwt.yui.console.ConsoleConfig;
import org.sgx.yuigwt.yui.event.EventCallback;
import org.sgx.yuigwt.yui.event.EventFacade;
import org.sgx.yuigwt.yui.node.Node;
import org.sgx.yuigwt.yui.widget.button.ButtonConfig;
import org.sgx.yuigwt.yui.widget.scrollview.ScrollView;
import org.sgx.yuigwt.yui.widget.scrollview.ScrollView.Flick;
import org.sgx.yuigwt.yui.widget.scrollview.ScrollViewConfig;
/**
 * nodeFocusManager1
 * @author sg
 *
 */
public class ScrollViewTest extends AbstractTest {

protected ScrollView sv1;
private int currentScrollY=0;

public ScrollViewTest() {
	super("scrollView1", "scrollView1", 
		new String[]{TAG_NODE, TAG_SCROLLVIEW}, 
		TestResources.instance.ScrollViewTest());
}


public void test(final Node parent) {
YUI.Use(new String[]{"scrollview-base", "button", "console"}, new YUICallback() {
	
	public void ready(final YuiContext Y) {

		final Console console1 = Y.newConsole(ConsoleConfig.create());
		console1.render(); 
		
		Node sv1Node = parent.appendChild("<div id=\"scrollview1\"></div>"); 		
		
		StringBuffer sb = new StringBuffer(); 
		for (int i = 0; i < 100; i++) {
			sb.append("<p>This is a long line "+i+" </p>"); 
		}
		sv1Node.set("innerHTML", sb.toString()); 
		
		sv1 = Y.newScrollView(ScrollViewConfig.create().
			flick(Flick.create().minDistance(8).minVelocity(0.3).axis("y")).
			srcNode(sv1Node).height("100px")); 
		sv1.render(); 
		sv1.on(ScrollView.EVENT_SCROLLYCHANGE, new EventCallback<AttributeEvent>() {
			
			public void call(AttributeEvent e) {
				console1.log("scrollX changed: "+e.newValDouble()); 
			}
		}); 
		
		Y.newButton(
			ButtonConfig.create().label("up").
			on("click", new EventCallback<EventFacade>() {
				
				public void call(EventFacade e) {
					currentScrollY-=20;  
					sv1.scrollTo(0, currentScrollY); 
				}
			})
		).render(parent);
		
		Y.newButton(
			ButtonConfig.create().label("down").
			on("click", new EventCallback<EventFacade>() {
				
				public void call(EventFacade e) {
					currentScrollY+=20;  
					sv1.scrollTo(0, currentScrollY); 
				}
			})
		).render(parent);
		
		
	}
}); 
}

}
