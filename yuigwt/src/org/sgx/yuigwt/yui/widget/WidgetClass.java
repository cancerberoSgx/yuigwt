package org.sgx.yuigwt.yui.widget;

import org.sgx.yuigwt.yui.base.BaseClass;
import org.sgx.yuigwt.yui.node.Node;

import com.google.gwt.core.client.JavaScriptObject;

/**
 * widget static fields. 
 * 
 * @author sg
 * 
 */
public class WidgetClass extends BaseClass {
	protected WidgetClass() {
	}

	/**
	 * Object hash, defining how attribute values are to be parsed from markup
	 * contained in the widget's content box. e.g.:
	 * 
	 * <pre>
	 *   {
	 *       // Set single Node references using selector syntax 
	 *       // (selector is run through node.one)
	 *       titleNode: "span.yui-title",
	 *       // Set NodeList references using selector syntax 
	 *       // (array indicates selector is to be run through node.all)
	 *       listNodes: ["li.yui-item"],
	 *       // Set other attribute types, using a parse function. 
	 *       // Context is set to the widget instance.
	 *       label: function(contentBox) {
	 *           return contentBox.one("span.title").get("innerHTML");
	 *       }
	 *   }
	 * </pre>
	 * 
	 * @return
	 */
	public final native JavaScriptObject HTML_PARSER()/*-{
		return this.HTML_PARSER;
	}-*/;

	/**
	 * Constant used to identify state changes originating from the DOM (as
	 * opposed to the JavaScript model).
	 * 
	 * @return
	 */
	public final native String UI_SRC()/*-{
		return this.UI_SRC;
	}-*/;

	/**
	 * 
	 <p>
	 * Returns the widget instance whose bounding box contains, or is, the given
	 * node.
	 * </p>
	 * 
	 * <p>
	 * In the case of nested widgets, the nearest bounding box ancestor is used
	 * to return the widget instance.
	 * </p>
	 * 
	 * @param n
	 *            The node for which to return a Widget instance. If a selector
	 *            string is passed in, which selects more than one node, the
	 *            first node found is used.
	 * @return Widget instance, or null if not found.
	 */
	public final native Widget getByNode(Node n)/*-{
		return this.getByNode(n);
	}-*/;

	/**
	 * 
	 <p>
	 * Returns the widget instance whose bounding box contains, or is, the given
	 * node.
	 * </p>
	 * 
	 * <p>
	 * In the case of nested widgets, the nearest bounding box ancestor is used
	 * to return the widget instance.
	 * </p>
	 * 
	 * @param n
	 *            The node for which to return a Widget instance. If a selector
	 *            string is passed in, which selects more than one node, the
	 *            first node found is used.
	 * @return Widget instance, or null if not found.
	 */
	public final native Widget getByNode(String n)/*-{
		return this.getByNode(n);
	}-*/;
	
	
	
}
