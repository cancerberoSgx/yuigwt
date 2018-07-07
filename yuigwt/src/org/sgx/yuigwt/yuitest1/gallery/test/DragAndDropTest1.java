package org.sgx.yuigwt.yuitest1.gallery.test;

import org.sgx.yuigwt.yui.YUI;
import org.sgx.yuigwt.yui.YUICallback;
import org.sgx.yuigwt.yui.YuiContext;
import org.sgx.yuigwt.yui.console.Console;
import org.sgx.yuigwt.yui.console.ConsoleConfig;
import org.sgx.yuigwt.yui.dd.Drag;
import org.sgx.yuigwt.yui.dd.DragConfig;
import org.sgx.yuigwt.yui.node.Node;
import org.sgx.yuigwt.yuitest1.gallery.GalleryConstants;
/**
 * @author sg
 *
 */
public class DragAndDropTest1 extends AbstractTest {

public DragAndDropTest1() {
	super("dragAndDrop1", "dragAndDrop1", 
		new String[]{GalleryConstants.TAG_DD}, 
		TestResources.instance.DragAndDropTest1());
}


public void test(final Node parent) {
YUI.Use(new String[]{"dd-drag", "console", "dd-plugin"}, new YUICallback() {

	
	public void ready(final YuiContext Y) {
		Node node1 = parent.appendChild("<p>dragme1</p>"); 
		Drag dd = Y.newDDDrag(DragConfig.create().node(node1)); 
		
		//now a console dragable only at its title - using drag handle
		final Console console1 = Y.newConsole(ConsoleConfig.create()).render().cast();
		console1.plug(Y.Plugin().Drag(), DragConfig.create().handles(new String[]{"h4"})); 
		console1.log("this console is only draggable by its title."); 
	}
}); 
}

}
