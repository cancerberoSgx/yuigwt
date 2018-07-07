package org.sgx.yuigwt.yuitest1.gallery.test;

import static org.sgx.yuigwt.yuitest1.gallery.GalleryConstants.*;

import org.sgx.yuigwt.yui.YUI;
import org.sgx.yuigwt.yui.YUICallback;
import org.sgx.yuigwt.yui.YuiContext;
import org.sgx.yuigwt.yui.attr.AttributeEvent;
import org.sgx.yuigwt.yui.console.Console;
import org.sgx.yuigwt.yui.console.ConsoleConfig;
import org.sgx.yuigwt.yui.event.EventCallback;
import org.sgx.yuigwt.yui.event.EventFacade;
import org.sgx.yuigwt.yui.node.Node;
import org.sgx.yuigwt.yui.node.focusmanager.NodeFocusManager;
import org.sgx.yuigwt.yui.node.focusmanager.NodeFocusManagerConfig;
import org.sgx.yuigwt.yui.node.focusmanager.NodeFocusManager.Keys;
import org.sgx.yuigwt.yui.util.JsUtil;
import org.sgx.yuigwt.yui.widget.Widget;
import org.sgx.yuigwt.yui.widget.button.ButtonConfig;
/**
 * nodeFocusManager1
 * @see http://yuilibrary.com/yui/docs/node-focusmanager
 * @author sg
 *
 */
public class NodeFocusManagerTest1 extends AbstractTest {

public NodeFocusManagerTest1() {
	super("nodeFocusManager1", "nodeFocusManager1 @see http://yuilibrary.com/yui/docs/node-focusmanager", 
		new String[]{TAG_NODE, TAG_NODEFOCUSMANAGER, TAG_CONSOLE}, 
		TestResources.instance.NodeFocusManagerTest1());
}

@Override
public void test(final Node parent) {
YUI.Use(new String[]{"button", "node-focusmanager", "console"}, new YUICallback() {
	@Override
	public void ready(final YuiContext Y) {

		final Console console1 = Y.newConsole(ConsoleConfig.create());
		console1.render(); 
		
		Widget button1 = Y.newButton(
			ButtonConfig.create().label("a simple button")
		).render(parent);	
		
		parent.append("<input type=\"text\" value=\"editme1\"></input><br/>" +
				"<input type=\"text\" value=\"editme2\"></input>"); 
		
		parent.plug(Y.Plugin().NodeFocusManager(), NodeFocusManagerConfig.create().
			descendants("input, button").
			keys(Keys.create().
				next("down:39").
				previous("down:37")
			)
		);
		NodeFocusManager fm = NodeFocusManager.getFor(parent); 
		fm.set("activeDescendant", 1); 
		fm.on(NodeFocusManager.EVENT_FOCUSEDCHANGE, new EventCallback<AttributeEvent>() {

			@Override
			public void call(AttributeEvent e) {
				if(!e.newValBoolean()) {
					console1.log("parent has lost focus"); 
				}
				else {
					console1.log("parent has gain focus"); 
				}
			}
		}); 
	}
}); 
}

}
