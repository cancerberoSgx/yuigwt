package org.sgx.yuigwt.yuitest1.gallery.test;

import static org.sgx.yuigwt.yuitest1.gallery.GalleryConstants.TAG_INTL;

import org.sgx.yuigwt.yui.YUI;
import org.sgx.yuigwt.yui.YUICallback;
import org.sgx.yuigwt.yui.YuiConfig;
import org.sgx.yuigwt.yui.YuiContext;
import org.sgx.yuigwt.yui.event.EventCallback;
import org.sgx.yuigwt.yui.intl.Intl;
import org.sgx.yuigwt.yui.intl.IntlEvent;
import org.sgx.yuigwt.yui.node.Node;
import org.sgx.yuigwt.yui.util.JsObject;
import org.sgx.yuigwt.yui.widget.button.ButtonConfig;
import org.sgx.yuigwt.yui.widget.button.ButtonEvent;
/**
 * in this example we use the Intl utility for internationalizing some node content. Also we listen for langChange event, and update content when it happens.   
 * @author sg
 *
 */
public class IntlTest1 extends AbstractTest {

protected Node helloNode;
protected Node byeNode;

public IntlTest1() {
	super("intl1", "in this example we use the Intl utility for internationalizing some node content. Also we listen for langChange event, and update content when it happens.", 
		new String[]{TAG_INTL}, 
		TestResources.instance.IntlTest1());
}


public void test(final Node parent) {
YUI.YUI(YuiConfig.create()
	).use(new String[]{"intl", "button"}, new YUICallback() {
	
	public void ready(final YuiContext Y) {
		Y.Intl().add("greetings", "zh-Hans", 
			JsObject.one("HELLO", "你好！")
			._("GOODBYE", "再见！")
		); 
		Y.Intl().add("greetings", "es", 
			JsObject.one("HELLO", "Hola!")
			._("GOODBYE", "Hasta luego!")
		); 
		Y.Intl().setLang("greetings", "zh-Hans"); 
		helloNode = parent.appendChild("<p></p>");
		byeNode = parent.appendChild("<p></p>"); 
		
		setIntlContent(Y); 
		
		//add a intl language change event listener, and update the node text to selected language
		Y.Intl().on(Intl.EVENT_LANGCHANGE, new EventCallback<IntlEvent>() {
			
			public void call(IntlEvent e) {
				setIntlContent(Y); 
			}
		}); 		
		
		Y.newButton(ButtonConfig.create().label("es").render(parent).
			on("click", new EventCallback<ButtonEvent>() {				
				
				public void call(ButtonEvent e) {
					Y.Intl().setLang("greetings", "es"); 
				}
			})
		); 	
		Y.newButton(ButtonConfig.create().label("zh-Hans").render(parent).
			on("click", new EventCallback<ButtonEvent>() {				
				
				public void call(ButtonEvent e) {
					Y.Intl().setLang("greetings", "zh-Hans"); 
				}
			})
		); 	
	}
}); 
}

protected void setIntlContent(YuiContext Y) {
	helloNode.text(Y.Intl().get("greetings", "HELLO"));
	byeNode.text(Y.Intl().get("greetings", "GOODBYE"));
}

}

