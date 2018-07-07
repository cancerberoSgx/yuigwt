package org.sgx.yuigwt.yuigallery.deferred;

import org.sgx.yuigwt.yui.node.Node;
import org.sgx.yuigwt.yui.node.NodeBase;
/**
 * adds the deferred() method to Node. Cast from a node plugged with Y.Plugin.NodeDeferred
 * @author sg
 *
 */
public class NodeDeferred extends Node {
protected NodeDeferred(){}

public static final native Node deferred(NodeBase n)/*-{
	return n.deferred; 
}-*/;

/**
 * 
 * @return 
 */
public native final NodeDeferred deferred() /*-{
return this.deferred;
}-*/;
}
