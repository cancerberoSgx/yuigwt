package org.sgx.yuigwt.alloyuitest1.test;


import org.sgx.yuigwt.alloyui.AUI;
import org.sgx.yuigwt.alloyui.AUICallback;
import org.sgx.yuigwt.alloyui.AuiContext;
import org.sgx.yuigwt.alloyui.widget.buttonitem.ButtonItem;
import org.sgx.yuigwt.alloyui.widget.buttonitem.ButtonItemConfig;
import org.sgx.yuigwt.yui.event.EventCallback;
import org.sgx.yuigwt.yui.event.EventFacade;
import org.sgx.yuigwt.yui.node.Node;
import org.sgx.yuigwt.yui.util.SimpleCallback;
import org.sgx.yuigwt.yui.util.JsUtil;

public class ButtonItemTest1 extends AbstractTest implements AUICallback{

private Node parent;

public ButtonItemTest1() {
	super("buttonItem1", "anim tests", 
		new String[]{}, 
		TestResources.instance.ButtonItemTest1());
}


public void test(Node parent) {
	AUI.Ready(new String[]{"aui-button-item"}, this); 
	this.parent = parent; 
}


public void ready(final AuiContext A) {
	ButtonItem button1 = A.newButtonItem(ButtonItemConfig.create().
		icon("home").label("home")); 
	button1.on("click", new EventCallback<EventFacade>() {
		
		public void call(EventFacade e) {
			final ButtonItem clickedButton = e.getTarget().cast();
			clickedButton.hide(); 
			JsUtil.setTimeout(new SimpleCallback() {
				
				
				public void call() {
					clickedButton.show(); 
				}
			}, 500); 
		}
	}); 
	button1.render(parent); 
}
	
}
