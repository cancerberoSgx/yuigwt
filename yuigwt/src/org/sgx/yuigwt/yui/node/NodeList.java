package org.sgx.yuigwt.yui.node;

import org.sgx.yuigwt.yui.util.SimpleCallback;

public class NodeList extends NodeBase {
protected NodeList(){}
/**
 * 
 * @param l Arrays/NodeLists and/or values to concatenate to the resulting NodeList
 * @return A new NodeList comprised of this NodeList joined with the input. 
 */
public final native NodeList concat(NodeList l)/*-{
	return concat(l); 
}-*/;


public static interface NodeListIterator {
	void next(Node n, int index, NodeList instance); 
}
/**
 * Applies the given function to each Node in the NodeList.
 * @param iterator The function to apply. It receives 3 arguments: the current node instance, the node's index, and the NodeList instance
 * @return self for method chaining
 */
public native final NodeList each(NodeListIterator iterator) /*-{
this.each($entry(function(n, index, instance){
	return iterator.@org.sgx.yuigwt.yui.node.NodeList.NodeListIterator::next(Lorg/sgx/yuigwt/yui/node/Node;ILorg/sgx/yuigwt/yui/node/NodeList;)(n, index, instance); 
}));
return this;  
}-*/;
/**
 * Retrieves the Node instance at the given index.
 */
public native final Node item(int index) /*-{
return this.item(index); 
}-*/;
/**
 * Makes each node visible. If the "transition" module is loaded, show optionally animates the showing of the node using either the default transition effect ('fadeIn'), or the given named effect.
 * @param name A named Transition effect to use as the show effect.
 * @param config Options to use with the transition.
 * @param c An optional function to run after the transition completes.
 * @return self for method chaining
 */
public native final NodeList show(String name, Transition config, SimpleCallback c) /*-{
	var f = $entry(function(){
		return c.@org.sgx.yuigwt.yui.util.SimpleCallback::call()(); 
	}); 
	return this.show(name, config, f); 
}-*/;
/**
 * Makes each node visible. If the "transition" module is loaded, show optionally animates the showing of the node using either the default transition effect ('fadeIn'), or the given named effect.
 * @param name A named Transition effect to use as the show effect.
 * @return self for method chaining
 */
public native final NodeList show(String name) /*-{
return this.show(name); 
}-*/;

/**
 * @return The first item in the NodeList. 
 */
public native final Node shift() /*-{
return this.shift(); 
}-*/;
/**
 * Returns the current number of items in the NodeList.
 * @return
 */
public native final int size() /*-{
return this.size(); 
}-*/;
/**
 * 
 * @param begin Zero-based index at which to begin extraction. As a negative index, start indicates an offset from the end of the sequence. slice(-2) extracts the second-to-last element and the last element in the sequence.
 * @param end Zero-based index at which to end extraction. slice extracts up to but not including end. slice(1,4) extracts the second element through the fourth element (elements indexed 1, 2, and 3). As a negative index, end indicates an offset from the end of the sequence. slice(2,-1) extracts the third element through the second-to-last element in the sequence. If end is omitted, slice extracts to the end of the sequence.
 * @return  A new NodeList comprised of this NodeList joined with the input.
 */
public native final NodeList slice(int begin, int end) /*-{
return this.slice(begin, end); 
}-*/;

/**
 * Executes the function once for each node until a true value is returned.
 * @param c he function to apply. It receives 3 arguments: the current node instance, the node's index, and the NodeList instance
 * @return Whether or not the function returned true for any node. 
 */
public native final boolean some(NodeListCallback c) /*-{
var f = $entry(function(n,i,nl){
	return c.@org.sgx.yuigwt.yui.node.NodeListCallback::call(Lorg/sgx/yuigwt/yui/node/Node;ILorg/sgx/yuigwt/yui/node/NodeList;)(n,i,nl); 
}); 
return this.some(f); 
}-*/;
/**
 * 
 * @param index Index at which to start changing the array. If negative, will begin that many elements from the end.
 * @param howMany An integer indicating the number of old array elements to remove. If howMany is 0, no elements are removed. In this case, you should specify at least one new element. If no howMany parameter is specified (second syntax above, which is a SpiderMonkey extension), all elements after index are removed. {Node | DOMNode| element1, ..., elementN The elements to add to the array. If you don't specify any elements, splice simply removes elements from the array.
 * @return The element(s) removed. 
 */
public native final NodeList splice(int index, int howMany) /*-{
return this.splice(index, howMany); 
}-*/;
/**
 * Returns the index of the node in the NodeList instance or -1 if the node isn't found.
 * @param n the node to search for
 * @return the index of the node value or -1 if not found 
 */
public native final int indexOf(Node n) /*-{
return this.indexOf(n); 
}-*/;
/**
 * Determines if the instance is bound to any nodes
 * @return Whether or not the NodeList is bound to any nodes 
 */
public native final boolean isEmpty() /*-{
return this.isEmpty(); 
}-*/;

}
