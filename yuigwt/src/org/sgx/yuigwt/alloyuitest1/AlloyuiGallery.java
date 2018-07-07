package org.sgx.yuigwt.alloyuitest1;

import org.sgx.yuigwt.alloyui.AUICallback;
import org.sgx.yuigwt.alloyui.AuiContext;
import org.sgx.yuigwt.alloyui.widget.buttonitem.ButtonItemConfig;
import org.sgx.yuigwt.alloyuitest1.test.Test;
import org.sgx.yuigwt.yui.event.EventCallback;
import org.sgx.yuigwt.yui.event.EventFacade;
import org.sgx.yuigwt.yui.node.Node;

import com.google.gwt.user.client.Element;

public class AlloyuiGallery implements AUICallback {
	
private AlloyuiGalleryUtil util = null;
private Element parentEl;
private AuiContext A;
private Node testLauncherContainer;
private Node testParent;

public AlloyuiGallery() {
	util = new AlloyuiGalleryUtil(this); 		
}

	
public void render(Element parent) {
	parentEl = parent; 
	util.loadAui(this); 	
}



@Override
public void ready(AuiContext A) {
	this.A = A; 
//	Node parent = A.one(parentEl); 
//	parent.append(
//		"<table>" +
//			"<tr>" +
//				"<td id=\"left\"></td>" +
//				"<td id=\"right\"></td>" +
//			"</tr>" +				
//		"</table>"); 
	testLauncherContainer = A.one("#left");
	testParent = A.one("#right");
	
	drawTestLaunchers();
}


private void drawTestLaunchers() {
	 
	for(final Test t : util.getTests()){
		A.newButtonItem(ButtonItemConfig.create().label(t.getName())).
			render(testLauncherContainer).
			on("click", new EventCallback<EventFacade>() {

			@Override
			public void call(EventFacade e) {
				setCurrentTest(t); 
			}
		}); 
	}
}


public void setCurrentTest(Test t) {
	testParent.empty(); 
	t.test(testParent); 
}
}
