package org.sgx.yuigwt.yui.editor;

import org.sgx.yuigwt.yui.node.Node;
import org.sgx.yuigwt.yui.node.NodeBase;
import org.sgx.yuigwt.yui.yui.PluginBase;

import com.google.gwt.core.client.JavaScriptObject;
import com.google.gwt.core.client.JsArray;

/**
 * overlay of static fields of Y.Plugin:EditorBidi
 * 
 * @see http://yuilibrary.com/yui/docs/api/classes/Plugin.EditorBidi.html
 * @author sg
 * 
 */
public class EditorBidi extends PluginBase {
	protected EditorBidi() {
	}

	/**
	 * Method to test a node's style attribute for text-align and removing it.
	 * 
	 * @param n
	 * @return
	 */
	public native final NodeBase removeTextAlign(NodeBase n)/*-{
		return this.removeTextAlign(n);
	}-*/;

	/**
	 * Generates a list of all the block parents of the current NodeList
	 * 
	 * @param nodeArray
	 * @return
	 */
	public native final JsArray<Node> addParents(JsArray<Node> nodeArray)/*-{
		return this.addParents(node, wrap);
	}-*/;

	/**
	 * Returns a block parent for a given element
	 * 
	 * @param node
	 * @param wrap
	 * @return
	 */
	public native final Node blockParent(Node node, boolean wrap)/*-{
		return this.blockParent(node, wrap);
	}-*/;

	/**
	 * The data key to store on the node.
	 * 
	 * @return self for method chaining
	 */
	public native final JavaScriptObject _NODE_SELECTED() /*-{
		return this._NODE_SELECTED;
	}-*/;

	public native final JavaScriptObject RE_TEXT_ALIGN() /*-{
		return this.RE_TEXT_ALIGN;
	}-*/;

	// TODO : other props.

}
