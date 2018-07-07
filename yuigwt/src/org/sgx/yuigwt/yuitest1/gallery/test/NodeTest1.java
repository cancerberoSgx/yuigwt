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
 * shows some usecases of Y.Node class
 * @author sg
 *
 */
public class NodeTest1 extends AbstractTest {

public NodeTest1() {
	super("node1", "shows some usecases of Y.Node class", 
		new String[]{TAG_NODE}, 
		TestResources.instance.PJaxTest1());
}


public void test(final Node parent) {
YUI.Use(new String[]{"node"}, new YUICallback() {	
		
	
	public void ready(final YuiContext Y) {
		//create a node from another node (parent) - only simple types
		Node child1 = parent.appendChild("<div></div>");
		
		//cerate an arbitrary deepth html markup inside a node
		child1.append("<span><b id='hello'>hello</b> world</span>"); 
		Node hello = parent.one("#hello");
		
		//TODO: select using css3-selectors example
		
		//test descendant - contains()
		System.out.println(parent.contains(child1));
		
		//test ancestor
		Node parentb = child1.ancestor(new Node.AncestorCallback() {
			
			
			public boolean call(Node n) {
				return n == parent; 
			}
		}) ; 
		
		System.out.println(parentb==parent);
	}
}); 
}

}
