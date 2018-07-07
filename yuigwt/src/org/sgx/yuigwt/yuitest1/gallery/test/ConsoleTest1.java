package org.sgx.yuigwt.yuitest1.gallery.test;

import org.sgx.yuigwt.yui.YUI;
import org.sgx.yuigwt.yui.YUICallback;
import org.sgx.yuigwt.yui.YuiContext;
import org.sgx.yuigwt.yui.console.Console;
import org.sgx.yuigwt.yui.console.ConsoleConfig;
import org.sgx.yuigwt.yui.console.ConsoleEvent;
import org.sgx.yuigwt.yui.dd.DragConfig;
import org.sgx.yuigwt.yui.event.EventCallback;
import org.sgx.yuigwt.yui.event.EventFacade;
import org.sgx.yuigwt.yui.node.Node;
import org.sgx.yuigwt.yuitest1.gallery.GalleryConstants;

import com.google.gwt.user.client.Window;
/**
 * console utility and loggin utils test
<pre>
YUI().use('console', 'dd-plugin',  function(Y) {
	var console1 = new Y.Console({collapsed: true}); 
	console1.plug(Y.Plugin.Drag); 
	console1.before("entry", function(e){
		if(!confirm("Do you really want to add the msg: "+e.message.message+" ? ")) {
			alert("preventing"); 
			e.preventDefault(); 
		}
	});
	console1.render(); 
	console1.log("using Console.log()", "info", "myapp");
});
</pre>
 * @author sg
 *
 */
public class ConsoleTest1 extends AbstractTest {

public ConsoleTest1() {
	super("console1", "console utility and loggin utils test - console is draggable and resizable", 
		new String[]{GalleryConstants.TAG_EVENT, GalleryConstants.TAG_CONSOLE, GalleryConstants.TAG_DD, GalleryConstants.TAG_RESIZE}, 
		TestResources.instance.ConsoleTest1());
}

@Override
public void test(final Node parent) {
YUI.Use(new String[]{"console", "dd-plugin", "resize", "resize-plugin"}, new YUICallback() {
	@Override
	public void ready(final YuiContext Y) {
		
		//Y.log will output on firebug's console
		Y.log("using Y.log()", "info", "myapp");
		
		//create a draggable console
		final Console console1 = Y.newConsole(ConsoleConfig.create());
		console1.plug(Y.Plugin().Drag()); 
		
		//be a nasty console catching each log entry and asking for confirmation. 
		console1.before(Console.EVENT_ENTRY, new EventCallback() {			
			@Override
			public void call(EventFacade e) {
				if(!Window.confirm("Do you really want to add the msg: "+((ConsoleEvent)e).message().message()+" ? "))  {
					Window.alert("preventing"); 
					e.preventDefault(); 
				}
			}
		}); 
		//render and log something. 
		console1.render(); 
		console1.log("using Console.log()", "info", "myapp"); 	
		
		//now install DD and resize plugins for the console
		console1.plug(Y.Plugin().Drag(), DragConfig.create().handles(new String[]{".yui3-console-hd"}));
		console1.plug(Y.Plugin().Resize()); 
		console1.log("drag the title for move and also resizable. ");
	}
	
}); 
}

}
