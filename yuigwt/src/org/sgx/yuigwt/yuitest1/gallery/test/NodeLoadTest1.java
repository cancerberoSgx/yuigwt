package org.sgx.yuigwt.yuitest1.gallery.test;

import static org.sgx.yuigwt.yuitest1.gallery.GalleryConstants.TAG_NODE;

import org.sgx.yuigwt.yui.YUI;
import org.sgx.yuigwt.yui.YUICallback;
import org.sgx.yuigwt.yui.YuiContext;
import org.sgx.yuigwt.yui.node.Node;
import org.sgx.yuigwt.yui.node.Node.NodeLoadCallback;
import org.sgx.yuigwt.yui.node.Node.NodeLoadCallbackArg;
import org.sgx.yuigwt.yui.util.JsUtil;

import com.google.gwt.core.client.GWT;
import com.google.gwt.user.client.Window;
/**
 * shows how to use node-load module - http://yuilibrary.com/yui/docs/api/modules/node-load.html
 * @author sg
 *
 */
public class NodeLoadTest1 extends AbstractTest {

public NodeLoadTest1() {
	super("nodeLoad1", "shows how to use node-load module - http://yuilibrary.com/yui/docs/api/modules/node-load.html", 
		new String[]{TAG_NODE}, 
		TestResources.instance.PJaxTest1());
}

@Override
public void test(final Node parent) {
YUI.Use(new String[]{"node-load"}, new YUICallback() {	
		
	@Override
	public void ready(final YuiContext Y) {
		String base = GWT.getModuleBaseURL()+"testfiles/"; 
		
		Node n1 = Y.one(parent.getDOMNode()).appendChild("<div></div>");
		Window.alert(n1+""); 
		n1.load(base+"page1.html", "#p1", new NodeLoadCallback() {
			
			@Override
			public void call(NodeLoadCallbackArg arguments) {
				Window.alert("from java: "+JsUtil.dumpObj(arguments)); 
			}
		}); 
		
	}
}); 
}

}
