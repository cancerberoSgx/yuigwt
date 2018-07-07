package org.sgx.yuigwt.yuitest1.gallery.test;


import org.sgx.yuigwt.yui.YUI;
import org.sgx.yuigwt.yui.YUICallback;
import org.sgx.yuigwt.yui.YuiContext;
import org.sgx.yuigwt.yui.event.EventCallback;
import org.sgx.yuigwt.yui.event.EventFacade;
import org.sgx.yuigwt.yui.node.Node;
import org.sgx.yuigwt.yui.widget.button.ButtonConfig;
import org.sgx.yuigwt.yuitest1.gallery.GalleryConstants;
/**
 * cookie
 * @author sg
 *
 */
public class CookieTest1 extends AbstractTest {

public CookieTest1() {
	super("cookie1", "cookie test", 
		new String[]{GalleryConstants.TAG_COOKIE, GalleryConstants.TAG_UTILS}, 
		TestResources.instance.CookieTest1());
}


public void test(final Node parent) {
YUI.Use(new String[]{"button", "cookie"}, new YUICallback() {
	
	public void ready(final YuiContext Y) {
		final String cookieKey1 = "cookietestkey1", cookieKey2 = "cookietestkey2";	
		parent.append("<p>The online cookie tester: </p>");
		final Node p = parent.appendChild(
			"<input type=\"text\" value=\"value to store\"></input>");
//		final Cookie cookie1 = Y.newcookie(cookieConfig.create().max(5).expires(3600000));
		
		
		Y.newButton(ButtonConfig.create().label("Save").render(parent).on("click", new EventCallback() {			
			
			public void call(EventFacade e) {
				Y.Cookie().set(cookieKey1, p.get("value")); 
			}
		})); 
		Y.newButton(ButtonConfig.create().label("Load").render(parent).on("click", new EventCallback() {			
			
			public void call(EventFacade e) {
				p.set("value", Y.Cookie().getString(cookieKey1)); 
			}
		})); 
		
	}
}); 
}

}
