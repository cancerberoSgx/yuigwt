package org.sgx.yuigwt.yui.editor;

import org.sgx.yuigwt.yui.YuiContext;
import org.sgx.yuigwt.yui.base.Base;
import org.sgx.yuigwt.yui.node.Node;
import org.sgx.yuigwt.yui.node.NodeBase;
import org.sgx.yuigwt.yui.util.SimpleCallback;

/**
 * <p> The Rich Text Editor is a UI control that allows for the rich formatting of
 * text content, including common structural treatments like lists, formatting
 * treatments like bold and italic text. </p> 
 *
 * <p>The current release of the Rich Text Editor for YUI 3 is the base utility
 * layers that provide a foundation on which you can create an Editor. This
 * version of Editor does not contain a GUI of any kind.</p>
 * 
 * @see http://yuilibrary.com/yui/docs/editor/
 * @see http://yuilibrary.com/yui/docs/api/classes/EditorBase.html
 * @author sg
 * 
 */
public class EditorBase extends Base {
	protected EditorBase() {
	}

	public static final String EVENT_NODECHANGE = "nodeChange", EVENT_READY = "ready";

	/**
	 * Copy certain styles from one node instance to another (used for new
	 * paragraph creation mainly)
	 * 
	 * @param from
	 *            The Node instance to copy the styles from
	 * @param to
	 *            The Node instance to copy the styles to
	 * @return self for method chaining
	 */
	public native final EditorBase copyStyles(Node from, Node to) /*-{
		this.copyStyles(from, to);
		return this;
	}-*/;

	/**
	 * Pass through to the frame.execCommand method
	 * 
	 * @param cmd
	 *            The command to pass: inserthtml, insertimage, bold
	 * @param val
	 *            The optional value of the command: Helvetica
	 * @return Node/NodeList: The Node or Nodelist affected by the command. Only
	 *         returns on override commands, not browser defined commands.
	 */
	public native final NodeBase execCommand(String cmd, String val) /*-{
		return this.execCommand();
	}-*/;

	/**
	 * Focus the contentWindow of the iframe
	 * 
	 * @param c
	 *            SimpleCallback function to execute after focus happens
	 * @return self for method chaining
	 */
	public native final EditorBase focus(SimpleCallback c) /*-{
		this.focus($entry(function() {
			return c.@org.sgx.yuigwt.yui.util.SimpleCallback::call()();
		}));
	}-*/;

	/**
	 * (Un)Filters the content of the Editor, cleaning YUI related code.
	 * 
	 * @return The filtered content of the Editor
	 */
	public native final String getContent() /*-{
		return this.getContent();
	}-*/;

	/**
	 * Walk the dom tree from this node up to body, returning a reversed array
	 * of parents.
	 * 
	 * @return The Node to start from
	 */
	public native final NodeBase getDomPath(NodeBase node) /*-{
		return this.getDomPath(node);
	}-*/;

	/**
	 * Get the YUI instance of the frame
	 * 
	 * @return The YUI instance bound to the frame.
	 */
	public native final YuiContext getInstance() /*-{
		return this.getInstance();
	}-*/;

	/**
	 * Handles the hiding of the Editor instance. Currently only handles the
	 * iframe
	 * 
	 * @return self for method chaining
	 */
	public native final EditorBase hide() /*-{
		this.hide();
		return this;
	}-*/;

	/**
	 * Handles the showing of the Editor instance. Currently only handles the
	 * iframe
	 * 
	 * @return self for method chaining
	 */
	public native final EditorBase show() /*-{
		this.show();
		return this;
	}-*/;

	/**
	 * Renders the Y.Frame to the passed node.
	 * 
	 * @return self for method chaining
	 */
	public native final EditorBase render(Node node) /*-{
		this.render(node);
		return this;
	}-*/;
}
