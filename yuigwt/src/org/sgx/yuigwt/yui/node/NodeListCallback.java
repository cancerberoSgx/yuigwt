package org.sgx.yuigwt.yui.node;
/**
 * 
 * @author used in for example NodeList.some()
 *
 */
public interface NodeListCallback {
boolean call(Node currentNode, int nodeIndex, NodeList nodeList);
}
