package org.sgx.yuigwt.yui.node;

import com.google.gwt.core.client.JavaScriptObject;
import com.google.gwt.dom.client.Element;
/**
 * overlay for Y.Node.*
 * @author sg
 *
 */
public class NodeClass extends JavaScriptObject {
protected NodeClass(){}
public final native Node create(String s)/*-{
	return this.create(s); 
}-*/;
/**
 * Retrieves the DOM node bound to a Node instance
 * @param node The Node instance or an HTMLNode
 * @return HTMLNode: The DOM node bound to the Node instance. If a DOM node is passed as the node argument, it is simply returned. 
 */
public final native Element getDOMNode(Node node)/*-{
return this.getDOMNode(node); 
}-*/;
/**
 * Retrieves the DOM node bound to a Node instance
 * @param node The Node instance or an HTMLNode
 * @return HTMLNode: The DOM node bound to the Node instance. If a DOM node is passed as the node argument, it is simply returned. 
 */
public final native Element getDOMNode(Element node)/*-{
return this.getDOMNode(node); 
}-*/;

/**
 * Returns a single Node instance bound to the node or the first element matching the given selector. Returns null if no match found. Note: For chaining purposes you may want to use Y.all, which returns a NodeList when no match is found.
 * @param node a node or Selector
 * @return a Node instance or null if no match found.  
 */
public final native Element one(Element node)/*-{
return this.one(node); 
}-*/;

/**
 * Returns a single Node instance bound to the node or the first element matching the given selector. Returns null if no match found. Note: For chaining purposes you may want to use Y.all, which returns a NodeList when no match is found.
 * @param node a node or Selector
 * @return a Node instance or null if no match found.  
 */
public final native Element one(String node)/*-{
return this.one(node); 
}-*/;


}
