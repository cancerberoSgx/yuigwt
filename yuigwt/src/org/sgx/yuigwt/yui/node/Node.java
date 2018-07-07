package org.sgx.yuigwt.yui.node;

import org.sgx.yuigwt.yui.util.JsObject;
import org.sgx.yuigwt.yui.util.Point;
import org.sgx.yuigwt.yui.util.Region;

import com.google.gwt.core.client.JavaScriptObject;
import com.google.gwt.dom.client.Document;
import com.google.gwt.dom.client.Element;
import com.google.gwt.user.client.ui.HTMLPanel;

/**
 * The Node class provides a wrapper for manipulating DOM Nodes. Node properties
 * can be accessed via the set/get methods. Use Y.one() to retrieve Node
 * instances.</br> NOTE: Node properties are accessed using the set and get
 * methods. - http://yuilibrary.com/yui/docs/api/classes/Node.html
 * 
 * @author sg
 * 
 */
public class Node extends NodeBase {
	protected Node() {
	}

	/**
	 * <p>
	 * Sets up a delegation listener for an event occurring inside the Node.The
	 * delegated event will be verified against a supplied selector or filtering
	 * function to test if the event references at least one node that should
	 * trigger the subscription callback.
	 * </p>
	 * <p>
	 * Selector string filters will trigger the callback if the event originated
	 * from a node that matches it or is contained in a node that matches it.
	 * Function filters are called for each Node up the parent axis to the
	 * subscribing container node, and receive at each level the Node and the
	 * event object. The function should return true (or a truthy value) if that
	 * Node should trigger the subscription callback. Note, it is possible for
	 * filters to match multiple Nodes for a single event. In this case, the
	 * delegate callback will be executed for each matching Node.
	 * </p>
	 * <p>
	 * For each matching Node, the callback will be executed with its 'this'
	 * object set to the Node matched by the filter (unless a specific context
	 * was provided during subscription), and the provided event's
	 * <code>currentTarget</code> will also be set to the matching Node. The
	 * containing Node from which the subscription was originally made can be
	 * referenced as <code>e.container</code>.
	 * </p>
	 * </div>
	 * 
	 * @param type
	 *            the event type to delegate
	 * @param fn
	 * @param spec
	 *            a selector that must match the target of the event or a
	 *            function to test target and its parents for a match
	 * @param args
	 *            additional arguments to pass on to the callback function.
	 *            These arguments will be added after the event object.
	 * @return
	 */
	public native final Node delegate(String type, NodeEventDelegateCallback fn, String spec, Object arg)/*-{
		var f = $entry(function(evt, args) {
			fn.@org.sgx.yuigwt.yui.node.NodeEventDelegateCallback::call(Lorg/sgx/yuigwt/yui/node/Node;Lorg/sgx/yuigwt/yui/event/YuiEvent;Ljava/lang/Object;)(this, evt, args);
		});
		this.delegate(type, f, spec, arg);
	}-*/;

	/**
	 * <p>
	 * Sets up a delegation listener for an event occurring inside the Node.The
	 * delegated event will be verified against a supplied selector or filtering
	 * function to test if the event references at least one node that should
	 * trigger the subscription callback.
	 * </p>
	 * <p>
	 * Selector string filters will trigger the callback if the event originated
	 * from a node that matches it or is contained in a node that matches it.
	 * Function filters are called for each Node up the parent axis to the
	 * subscribing container node, and receive at each level the Node and the
	 * event object. The function should return true (or a truthy value) if that
	 * Node should trigger the subscription callback. Note, it is possible for
	 * filters to match multiple Nodes for a single event. In this case, the
	 * delegate callback will be executed for each matching Node.
	 * </p>
	 * <p>
	 * For each matching Node, the callback will be executed with its 'this'
	 * object set to the Node matched by the filter (unless a specific context
	 * was provided during subscription), and the provided event's
	 * <code>currentTarget</code> will also be set to the matching Node. The
	 * containing Node from which the subscription was originally made can be
	 * referenced as <code>e.container</code>.
	 * </p>
	 * </div>
	 * 
	 * @param type
	 *            the event type to delegate
	 * @param fn
	 * @param spec
	 *            a selector that must match the target of the event or a
	 *            function to test target and its parents for a match
	 * @return
	 */
	public native final Node delegate(String type, NodeEventDelegateCallback fn, String spec)/*-{
		var f = $entry(function(evt, args) {
			fn.@org.sgx.yuigwt.yui.node.NodeEventDelegateCallback::call(Lorg/sgx/yuigwt/yui/node/Node;Lorg/sgx/yuigwt/yui/event/YuiEvent;Ljava/lang/Object;)(this, evt, args);
		});
		this.delegate(type, f, spec);
	}-*/;

	// appendTo

	/**
	 * Appends the node to the given node.
	 * 
	 * @param n
	 *            The node to append to
	 * @return
	 */
	public native final Node appendTo(Node n)/*-{
		this.append(n);
		return this;
	}-*/;

	/**
	 * Determines whether the node is appended to the document.
	 * 
	 * @return Whether or not this node is appended to the document.
	 */
	public native final boolean inDoc()/*-{
		return this.inDoc();
	}-*/;

	/**
	 * Determines whether the node is appended to the document.
	 * 
	 * @param doc
	 *            optional An optional document to check against. Defaults to
	 *            current document.
	 * @return Whether or not this node is appended to the document.
	 */
	public native final boolean inDoc(Document doc)/*-{
		return this.inDoc(doc);
	}-*/;

	/**
	 * Determines whether the node is appended to the document.
	 * 
	 * @param doc
	 *            optional An optional document to check against. Defaults to
	 *            current document.
	 * @return Whether or not this node is appended to the document.
	 */
	public native final boolean inDoc(Element doc)/*-{
		return this.inDoc(doc);
	}-*/;

	/**
	 * Determines whether the node is appended to the document.
	 * 
	 * @param doc
	 *            optional An optional document to check against. Defaults to
	 *            current document.
	 * @return Whether or not this node is appended to the document.
	 */
	public native final boolean inDoc(Node doc)/*-{
		return this.inDoc(doc);
	}-*/;

	/**
	 * Appends the node to the given node.
	 * 
	 * @param n
	 *            The node to append to
	 * @return
	 */
	public native final Node appendTo(Element e)/*-{
		this.append(e);
		return this;
	}-*/;

	/**
	 * Retrieves a NodeList based on the given CSS selector.
	 * 
	 * @param sel
	 *            The CSS selector to test against.
	 * @return A NodeList instance for the matching HTMLCollection/Array.
	 */
	public native final NodeList all(String sel)/*-{
		return this.all(sel);
	}-*/;

	/**
	 * selects one node that match the selector relative to this node.
	 * 
	 * @param sel
	 * @return
	 */
	public native final Node one(String sel)/*-{
		return this.one(sel);
	}-*/;

	// prepend
	/**
	 * Inserts the content as the firstChild of the node.
	 * 
	 * @param content
	 *            The content to insert Use Y.Escape.html() to escape html
	 *            content.
	 * @return self for method chaining
	 */
	public native final Node prepend(NodeBase content)/*-{
		this.prepend(content);
		return this;
	}-*/;

	/**
	 * Inserts the content as the firstChild of the node.
	 * 
	 * @param content
	 *            The content to insert Use Y.Escape.html() to escape html
	 *            content.
	 * @return self for method chaining
	 */
	public native final Node prepend(String content)/*-{
		this.prepend(content);
		return this;
	}-*/;

	/**
	 * Inserts the content as the firstChild of the node.
	 * 
	 * @param content
	 *            The content to insert Use Y.Escape.html() to escape html
	 *            content.
	 * @return self for method chaining
	 */
	public native final Node prepend(Element content)/*-{
		this.prepend(content);
		return this;
	}-*/;

	// previous
	/**
	 * Returns the previous matching sibling. Returns the nearest element node
	 * sibling if no method provided..
	 * 
	 * @param sel
	 *            a selector for testing
	 * @return Node instance or null if not found
	 */
	public native final Node previous(String sel)/*-{
		return this.previous(sel);
	}-*/;

	/**
	 * Returns the previous matching sibling. Returns the nearest element node
	 * sibling if no method provided.
	 * 
	 * @param sel
	 *            a selector for testing
	 * @return Node instance or null if not found
	 */
	public native final Node previous(NodeSelector sel)/*-{
		var f = $entry(function(n) {
			return sel.@org.sgx.yuigwt.yui.node.NodeSelector::select(Lorg/sgx/yuigwt/yui/node/Node;)(n);
		})
		return this.previous(f);
	}-*/;

	// next
	/**
	 * Returns the next matching sibling. Returns the nearest element node
	 * sibling if no method provided.
	 * 
	 * @param sel
	 *            a selector for testing
	 * @return Node instance or null if not found
	 */
	public native final Node next(String sel)/*-{
		return this.next(sel);
	}-*/;

	/**
	 * Returns the next matching sibling. Returns the nearest element node
	 * sibling if no method provided.
	 * 
	 * @param sel
	 *            a selector for testing
	 * @return Node instance or null if not found
	 */
	public native final Node next(NodeSelector sel)/*-{
		var f = $entry(function(n) {
			return sel.@org.sgx.yuigwt.yui.node.NodeSelector::select(Lorg/sgx/yuigwt/yui/node/Node;)(n);
		})
		return this.next(f);
	}-*/;

	// cloneNode
	/**
	 * Passes through to DOM method.
	 * 
	 * @param deep
	 *            Whether or not to perform a deep clone, which includes subtree
	 *            and attributes
	 * @return The clone
	 */
	public native final Node cloneNode(boolean deep)/*-{
		return this.cloneNode(deep);
	}-*/;

	// compareTo
	/**
	 * Compares nodes to determine if they match. Node instances can be compared
	 * to each other and/or HTMLElements.
	 * 
	 * @param n
	 *            The reference node to compare to the node.
	 * @return True if the nodes match, false if they do not.
	 */
	public native final boolean compareTo(Node n)/*-{
		return this.compareTo(n);
	}-*/;

	// contains
	/**
	 * Determines whether the node is an ancestor of another HTML element in the
	 * DOM hierarchy.
	 * 
	 * @param el
	 *            The possible node or descendent
	 * @return Whether or not this node is the needle its ancestor
	 */
	public native final boolean contains(Node el)/*-{
		return this.contains(el);
	}-*/;

	/**
	 * Determines whether the node is an ancestor of another HTML element in the
	 * DOM hierarchy.
	 * 
	 * @param el
	 *            The possible node or descendent.
	 * @return Whether or not this node is the needle its ancestor
	 */
	public native final boolean contains(Element el)/*-{
		return this.contains(el);
	}-*/;

	// create
	/**
	 * <p>
	 * Returns a new dom node using the provided markup string.
	 * </p>
	 * <div class=params><h4>Parameters:</h4>
	 * <ul class=params-list>
	 * <li class=param><code class=param-name>html</code><span class=type><a
	 * href=
	 * "https://developer.mozilla.org/en/JavaScript/Reference/Global_Objects/String"
	 * class="crosslink external" target=_blank>String</a></span><div
	 * class=param-description>
	 * <p>
	 * The markup used to create the element Use<a
	 * href="../classes/Escape.html#method_html"><code>Y.Escape.html()</code>
	 * </a>to escape html content.
	 * </p>
	 * </div></li>
	 * <li class=param><code class=param-name>doc</code><span class=type><a
	 * href=
	 * "https://developer.mozilla.org/en/Document_Object_Model_%28DOM%29/HTMLDocument"
	 * class="crosslink external" target=_blank>HTMLDocument</a></span><div
	 * class=param-description>
	 * <p>
	 * An optional document context
	 * </p>
	 * </div></li>
	 * </ul>
	 * </div><div class=returns><h4>Returns:</h4><div
	 * class=returns-description><span class=type><a href="../classes/Node.html"
	 * class=crosslink>Node</a></span>: A Node instance bound to a DOM node or
	 * fragment</div></div>
	 */
	public native final Node create(String html)/*-{
		return this.create(html);
	}-*/;

	/**
	 * Returns the style's current value. Use camelCase (e.g. 'backgroundColor')
	 * for multi-word properties.
	 * 
	 * @param styProp
	 *            style property name to get style value from
	 * @return The current value of the style property for the element.
	 */
	public native final String getStyle(String styProp)/*-{
		return this.getStyle(styProp) + "";
	}-*/;

	/**
	 * Determines whether each node has the given className.
	 * 
	 * @param html
	 *            the class name to search for
	 * @return Whether or not the element has the specified class
	 */
	public native final boolean hasClass(String className)/*-{
		return this.hasClass(className);
	}-*/;

	// /**
	// * @param attr the attribute name to get
	// * @return an attribute value on the Node instance. Unless pre-configured
	// (via Node.ATTRS), get hands off to the underlying DOM node. Only valid
	// attributes/properties for the node will be queried.
	// */
	// public native final String get(String attr)/*-{
	// return this.get(attr);
	// }-*/;
	// /**
	// * Sets an attribute on the Node instance. Unless pre-configured (via
	// Node.ATTRS), set hands off to the underlying DOM node. Only valid
	// attributes/properties for the node will be set. To set custom attributes
	// use setAttribute.
	// */
	// public native final Node set(String attr, String val)/*-{
	// this.set(attr, val)
	// return this; ;
	// }-*/;
	// /**
	// * Sets an attribute on the Node instance. Unless pre-configured (via
	// Node.ATTRS), set hands off to the underlying DOM node. Only valid
	// attributes/properties for the node will be set. To set custom attributes
	// use setAttribute.
	// */
	// public native final Node set(String attr, double val)/*-{
	// this.set(attr, val)
	// return this; ;
	// }-*/;

	/**
	 * Returns the nearest ancestor that passes the test applied by supplied
	 * boolean method.
	 * 
	 * @param selector
	 *            A selector string for testing elements.
	 * @return
	 */
	public native final Node ancestor(String selector)/*-{
		return this.ancestor(selector);
	}-*/;

	public static interface AncestorCallback {
		boolean call(Node n);
	}

	/**
	 * Returns the nearest ancestor that passes the test applied by supplied
	 * boolean method.
	 * 
	 * @param selector
	 *            A selector string for testing elements.
	 * @return
	 */
	public native final Node ancestor(AncestorCallback selector)/*-{
		var f =
		//		$entry(
		function(n) {
			return selector.@org.sgx.yuigwt.yui.node.Node.AncestorCallback::call(Lorg/sgx/yuigwt/yui/node/Node;)(n);
		}
		//		)
		;
		return this.ancestor(f);
	}-*/;

	/**
	 * Returns the nearest ancestor that passes the test applied by supplied
	 * boolean method.
	 * 
	 * @param selector
	 *            A selector string for testing elements.
	 * @param testSelf
	 *            Whether or not to include the element in the scan If a
	 *            function is used, it receives the current node being tested as
	 *            the only argument.
	 * @return
	 */
	public native final Node ancestor(AncestorCallback selector, boolean testSelf)/*-{
		var f = $entry(function(n) {
			return selector.@org.sgx.yuigwt.yui.node.Node.AncestorCallback::call(Lorg/sgx/yuigwt/yui/node/Node;)(n);
		});
		return this.ancestor(f, testSelf);
	}-*/;

	/**
	 * Returns the nearest ancestor that passes the test applied by supplied
	 * boolean method.
	 * 
	 * @param selector
	 *            A selector string for testing elements.
	 * @param testSelf
	 *            Whether or not to include the element in the scan If a
	 *            function is used, it receives the current node being tested as
	 *            the only argument.
	 * @return
	 */
	public native final Node ancestor(String selector, boolean testSelf)/*-{
		return this.ancestor(selector, testSelf);
	}-*/;

	/**
	 * Removes the node from its parent. Shortcut for
	 * myNode.get('parentNode').removeChild(myNode);
	 * 
	 * @return
	 */
	public native final Node remove()/*-{
		this.remove();
		return this;
	}-*/;

	/**
	 * Removes the node from its parent. Shortcut for
	 * myNode.get('parentNode').removeChild(myNode);
	 * 
	 * @param destroy
	 *            whether or not to call destroy() on the node after removal.
	 * @return
	 */
	public native final Node remove(boolean destroy)/*-{
		this.remove(destroy);
		return this;
	}-*/;

	/**
	 * Passes through to DOM method.
	 * 
	 * @param attrName
	 *            The attribute to be removed
	 * @return
	 */
	public native final Node removeAttribute(String attrName)/*-{
		this.removeAttribute(attrName);
		return this;
	}-*/;

	/**
	 * Passes through to DOM method.
	 * 
	 * @param childNode
	 *            Node to be removed
	 * @return The removed node
	 */
	public native final Node removeChild(Node childNode)/*-{
		return this.removeChild(childNode);
	}-*/;

	/**
	 * Passes through to DOM method.
	 * 
	 * @param childNode
	 *            Node to be removed
	 * @return The removed node
	 */
	public native final Node removeChild(Element childNode)/*-{
		return this.removeChild(childNode);
	}-*/;

	// setContent
	/**
	 * Replaces the node's current content with the content. Note that this
	 * passes to innerHTML and is not escaped. Use Y.Escape.html() to escape
	 * html content or set('text') to add as text.
	 * 
	 * @deprecated
	 * @param c
	 *            The content to insert
	 * @return
	 */
	public native final Node setContent(Element c)/*-{
		this.setContent(c);
		return this;
	}-*/;

	/**
	 * Replaces the node's current content with the content. Note that this
	 * passes to innerHTML and is not escaped. Use Y.Escape.html() to escape
	 * html content or set('text') to add as text.
	 * 
	 * @deprecated
	 * @param c
	 *            The content to insert
	 * @return
	 */
	public native final Node setContent(String c)/*-{
		this.setContent(c);
		return this;
	}-*/;

	/**
	 * Replaces the node's current content with the content. Note that this
	 * passes to innerHTML and is not escaped. Use Y.Escape.html() to escape
	 * html content or set('text') to add as text.
	 * 
	 * @deprecated
	 * @param c
	 *            The content to insert
	 * @return
	 */
	public native final Node setContent(NodeBase c)/*-{
		this.setContent(c);
		return this;
	}-*/;

	// setHTML
	/**
	 * Replaces the node's current html content with the content provided. Note
	 * that this passes to innerHTML and is not escaped. Use Y.Escape.html() to
	 * escape HTML, or set('text') to add as text.
	 * 
	 * @deprecated
	 * @param c
	 *            The content to insert
	 * @return
	 */
	public native final Node setHTML(NodeBase c)/*-{
		this.setHTML(c);
		return this;
	}-*/;

	/**
	 * Replaces the node's current html content with the content provided. Note
	 * that this passes to innerHTML and is not escaped. Use Y.Escape.html() to
	 * escape HTML, or set('text') to add as text.
	 * 
	 * @deprecated
	 * @param c
	 *            The content to insert
	 * @return
	 */
	public native final Node setHTML(String c)/*-{
		this.setHTML(c);
		return this;
	}-*/;

	/**
	 * Replaces the node's current html content with the content provided. Note
	 * that this passes to innerHTML and is not escaped. Use Y.Escape.html() to
	 * escape HTML, or set('text') to add as text.
	 * 
	 * @deprecated
	 * @param c
	 *            The content to insert
	 * @return
	 */
	public native final Node setHTML(Element c)/*-{
		this.setHTML(c);
		return this;
	}-*/;

	/**
	 * Set the position of the node in page coordinates, regardless of how the
	 * node is positioned.
	 * 
	 * @param x
	 *            X value for new position (coordinates are page-based)
	 * @return
	 */
	public native final Node setX(int x)/*-{
		this.setX(x);
		return this;
	}-*/;

	/**
	 * Set the position of the node in page coordinates, regardless of how the
	 * node is positioned.
	 * 
	 * @param x
	 *            X value for new position (coordinates are page-based)
	 * @return
	 */
	public native final Node setX(double x)/*-{
		this.setX(x);
		return this;
	}-*/;

	/**
	 * 
	 * @return
	 */
	public native final double getX() /*-{
		return this.getX();
	}-*/;

	/**
	 * 
	 * @return
	 */
	public native final double getY() /*-{
		return this.getY();
	}-*/;

	/**
	 * Set the position of the node in page coordinates, regardless of how the
	 * node is positioned.
	 * 
	 * @param y
	 *            y value for new position (coordinates are page-based)
	 * @return
	 */
	public native final Node setY(int y)/*-{
		this.setY(y);
		return this;
	}-*/;

	/**
	 * Set the position of the node in page coordinates, regardless of how the
	 * node is positioned.
	 * 
	 * @param y
	 *            y value for new position (coordinates are page-based)
	 * @return
	 */
	public native final Node setY(double y)/*-{
		this.setY(y);
		return this;
	}-*/;

	/**
	 * Set the position of the node in page coordinates, regardless of how the
	 * node is positioned.
	 * 
	 * @param x
	 * @param y
	 * @return
	 */
	public native final Node setXY(int x, int y)/*-{
		this.setX(x);
		return this;
	}-*/;

	/**
	 * Set the position of the node in page coordinates, regardless of how the
	 * node is positioned.
	 * 
	 * @param x
	 * @param y
	 * @return
	 */
	public native final Node setXY(double x, double y)/*-{
		this.setX(x);
		return this;
	}-*/;

	/**
	 * Set the position of the node in page coordinates, regardless of how the
	 * node is positioned.
	 * 
	 * @param p
	 * @return
	 */
	public native final Node setXY(Point p)/*-{
		this.setXY(p);
		return this;
	}-*/;

	/**
	 * Gets the current position of the node in page coordinates.
	 * 
	 * @returns an array The XY position of the node
	 */
	public native final Point getXY()/*-{
		//	$wnd.alert("getXY - " + this); 
		return this.getXY();
	}-*/;

	/**
	 * Allows setting attributes on DOM nodes, normalizing in some cases. This
	 * passes through to the DOM node, allowing for custom attributes.
	 * 
	 * @param name
	 *            The attribute name
	 * @param value
	 *            The value to set
	 * @return
	 */
	public native final Node setAttribute(String name, String value)/*-{
		this.setAttribute(name, value);
		return this;
	}-*/;

	public native final Element getDOMNode()/*-{
		return this.getDOMNode();
	}-*/;

	// /**
	// * Sets multiple attributes.
	// * @param attrs an object of name/value pairs to set
	// * @return
	// */
	// public native final Node setAttrs(JavaScriptObject attrMap)/*-{
	// this.setAttrs(attrMap);
	// return this;
	// }-*/;

	// /**
	// * Returns the nearest ancestor that passes the test applied by supplied
	// boolean method.
	// * @param selector
	// * @return
	// */
	// public native final Node ancestor(NodeSelector selector)/*-{
	// var f =
	// $entry(function(){selector.@org.sgx.yuigwt.yui.node.NodeSelector::select(Lorg/sgx/yuigwt/yui/node/Node;)})
	// return this.ancestor(selector);
	// }-*/;

	// attribute accessors
	/**
	 * Returns a NodeList instance of all HTMLElement children.
	 * 
	 * @return the attribute
	 */
	public final native NodeList children()/*-{
		return this.get("children");
	}-*/;

	/**
	 * Returns a region object for the node
	 * 
	 * @return the attribute
	 */
	public final native Region region()/*-{
		return this.get("region");
	}-*/;

	/**
	 * 
	 * @param val
	 * @return self for method chaining
	 */
	public final native Node region(JavaScriptObject val)/*-{
		this.set("region", val);
		return this;
	}-*/;

	/**
	 * Document height
	 * 
	 * @return the attribute
	 */
	public final native int docHeight()/*-{
		return this.get("docHeight");
	}-*/;

	/**
	 * Pixel distance the page has been scrolled horizontally
	 * 
	 * @return the attribute
	 */
	public final native int docScrollX()/*-{
		return this.get("docScrollX");
	}-*/;

	/**
	 * Pixel distance the page has been scrolled vertically
	 * 
	 * @return the attribute
	 */
	public final native int docScrollY()/*-{
		return this.get("docScrollY");
	}-*/;

	/**
	 * document width
	 * 
	 * @return
	 */
	public final native int docWidth()/*-{
		return this.get("docWidth");
	}-*/;

	/**
	 * Allows for getting and setting the text of an element. Formatting is
	 * preserved and special characters are treated literally.
	 * 
	 * @return the attribute
	 */
	public final native String for_()/*-{
		return this.get("for");
	}-*/;

	/**
	 * Allows for getting and setting the text of an element. Formatting is
	 * preserved and special characters are treated literally.
	 * 
	 * @param val
	 * @return self for method chaining
	 */
	public final native Node for_(String val)/*-{
		this.set("for", val);
		return this;
	}-*/;

	/**
	 * Allows for getting and setting the text of an element. Formatting is
	 * preserved and special characters are treated literally.
	 * 
	 * @return the attribute
	 */
	public final native String text()/*-{
		return this.get("text");
	}-*/;

	/**
	 * Allows for getting and setting the text of an element. Formatting is
	 * preserved and special characters are treated literally.
	 * 
	 * @param val
	 * @return self for method chaining
	 */
	public final native Node text(String val)/*-{
		this.set("text", val);
		return this;
	}-*/;

	/**
	 * Returns a region object for the node's viewport
	 * 
	 * @return the attribute
	 */
	public final native Region viewportRegion()/*-{
		return this.get("viewportRegion");
	}-*/;

	/**
	 * Returns a region object for the node's viewport
	 * 
	 * @param val
	 * @return self for method chaining
	 */
	public final native Node viewportRegion(JavaScriptObject val)/*-{
		this.set("viewportRegion", val);
		return this;
	}-*/;

	/**
	 * Returns the inner height of the viewport (exludes scrollbar).
	 * 
	 * @return the attribute
	 */
	public final native int winHeight()/*-{
		return this.get("winHeight");
	}-*/;

	/**
	 * Returns the inner width of the viewport (exludes scrollbar).
	 * 
	 * @return the attribute
	 */
	public final native int winWidth()/*-{
		return this.get("winWidth");
	}-*/;

	/**
	 * 
	 Animate one or more css properties to a given value. Requires the
	 * "transition" module. <br/>
	 * example usage:
	 * 
	 * <pre>
	 * Y.one('#demo').transition({
	 *     duration: 1, // in seconds, default is 0.5
	 *     easing: 'ease-out', // default is 'ease'
	 *     delay: '1', // delay start for 1 second, default is 0
	 * 
	 *     height: '10px',
	 *     width: '10px',
	 * 
	 *     opacity: { // per property
	 *         value: 0,
	 *         duration: 2,
	 *         delay: 2,
	 *         easing: 'ease-in'
	 *     }
	 * });
	 * </pre>
	 * 
	 * @return the attribute
	 */
	public final native Node transition(Transition t)/*-{
		return this.transition(t);
	}-*/;

	/**
	 * Applies a unique ID to the node if none exists
	 * 
	 * @return The existing or generated ID
	 */
	public final native String generateID()/*-{
		return this.generateID();
	}-*/;

	// node-load module
	public static class NodeLoadCallbackArg extends JavaScriptObject {
		protected NodeLoadCallbackArg() {
		}
	}

	public static interface NodeLoadCallback {
		void call(NodeLoadCallbackArg arguments);
	}

	/**
	 * Loads content from the given url and replaces the Node's existing content
	 * with the remote content. Requires node-load module
	 * 
	 * @param {String} url The URL to load via XMLHttpRequest.
	 * @param {String} selector An optional selector representing a subset of an
	 *        HTML document to load.
	 * @param {Function} callback An optional function to run after the content
	 *        has been loaded.
	 * 
	 * @see http
	 *      ://yuilibrary.com/yui/docs/api/files/node_js_node-load.js.html#l1
	 * @see http://yuilibrary.com/yui/docs/api/modules/node-load.html
	 * @param t
	 */
	public final native void load(String url, String selector, NodeLoadCallback callback)/*-{
		var f = $entry(function() {
			callback.@org.sgx.yuigwt.yui.node.Node.NodeLoadCallback::call(*)(arguments);
		});
		this.load(url, selector, f);
	}-*/;

	/**
	 * Loads content from the given url and replaces the Node's existing content
	 * with the remote content. Requires node-load module
	 * 
	 * @param {String} url The URL to load via XMLHttpRequest.
	 * @param {String} selector An optional selector representing a subset of an
	 *        HTML document to load.
	 * @param {Function} callback An optional function to run after the content
	 *        has been loaded.
	 * 
	 * @see http
	 *      ://yuilibrary.com/yui/docs/api/files/node_js_node-load.js.html#l1
	 * @see http://yuilibrary.com/yui/docs/api/modules/node-load.html
	 * @param t
	 */
	public final native void load(String url, String selector)/*-{
		this.load(url, selector);
	}-*/;

	/**
	 * Loads content from the given url and replaces the Node's existing content
	 * with the remote content. Requires node-load module
	 * 
	 * @param {String} url The URL to load via XMLHttpRequest.
	 * @param {String} selector An optional selector representing a subset of an
	 *        HTML document to load.
	 * @param {Function} callback An optional function to run after the content
	 *        has been loaded.
	 * 
	 * @see http
	 *      ://yuilibrary.com/yui/docs/api/files/node_js_node-load.js.html#l1
	 * @see http://yuilibrary.com/yui/docs/api/modules/node-load.html
	 * @param t
	 */
	public final native void load(String url)/*-{
		this.load(url);
	}-*/;

	/**
	 * Retrieves arbitrary data stored on a Node instance. If no data is
	 * associated with the Node, it will attempt to retrieve a value from the
	 * corresponding HTML data attribute. (e.g. node.getData('foo') will check
	 * node.getAttribute('data-foo')).
	 * 
	 * @param name
	 *            Optional name of the data field to retrieve. If no name is
	 *            given, all data is returned.
	 * @return Whatever is stored at the given field
	 */
	public final native String getData(String name)/*-{
		return this.getData(name);
	}-*/;

	/**
	 * Retrieves arbitrary data stored on a Node instance. If no data is
	 * associated with the Node, it will attempt to retrieve a value from the
	 * corresponding HTML data attribute. (e.g. node.getData('foo') will check
	 * node.getAttribute('data-foo')).
	 * 
	 * @param name
	 *            Optional name of the data field to retrieve. If no name is
	 *            given, all data is returned.
	 * @return Whatever is stored at the given field
	 */
	public final native JavaScriptObject getDataObj(String name)/*-{
		return this.getData(name);
	}-*/;

	/**
	 * Retrieves arbitrary data stored on a Node instance. If no data is
	 * associated with the Node, it will attempt to retrieve a value from the
	 * corresponding HTML data attribute. (e.g. node.getData('foo') will check
	 * node.getAttribute('data-foo')).
	 * 
	 * @param name
	 *            Optional name of the data field to retrieve. If no name is
	 *            given, all data is returned.
	 * @return Whatever is stored at the given field
	 */
	public final native JsObject getData()/*-{
		return this.getData();
	}-*/;

	/**
	 * Retrieves arbitrary data stored on a Node instance. If no data is
	 * associated with the Node, it will attempt to retrieve a value from the
	 * corresponding HTML data attribute. (e.g. node.getData('foo') will check
	 * node.getAttribute('data-foo')).
	 * 
	 * @param name
	 *            Optional name of the data field to retrieve. If no name is
	 *            given, all data is returned.
	 * @return Whatever is stored at the given field
	 */
	public final native int getDataInt(String name)/*-{
		return this.getData(name);
	}-*/;

	/**
	 * Retrieves arbitrary data stored on a Node instance. If no data is
	 * associated with the Node, it will attempt to retrieve a value from the
	 * corresponding HTML data attribute. (e.g. node.getData('foo') will check
	 * node.getAttribute('data-foo')).
	 * 
	 * @param name
	 *            Optional name of the data field to retrieve. If no name is
	 *            given, all data is returned.
	 * @return Whatever is stored at the given field
	 */
	public final native boolean getDataBoolean(String name)/*-{
		return this.getData(name);
	}-*/;

	/**
	 * Stores arbitrary data on a Node instance. This is not stored with the DOM
	 * node.
	 * 
	 * @param name
	 *            The name of the field to set. If no val is given, name is
	 *            treated as the data and overrides any existing data.
	 * @param val
	 *            The value to be assigned to the field.
	 * @return self for method chaining
	 */
	public final native Node setData(String name, String val)/*-{
		this.setData(name, val);
		return this;
	}-*/;

	/**
	 * Stores arbitrary data on a Node instance. This is not stored with the DOM
	 * node.
	 * 
	 * @param name
	 *            The name of the field to set. If no val is given, name is
	 *            treated as the data and overrides any existing data.
	 * @param val
	 *            The value to be assigned to the field.
	 * @return self for method chaining
	 */
	public final native Node setData(String name, int val)/*-{
		this.setData(name, val);
		return this;
	}-*/;

	/**
	 * Stores arbitrary data on a Node instance. This is not stored with the DOM
	 * node.
	 * 
	 * @param name
	 *            The name of the field to set. If no val is given, name is
	 *            treated as the data and overrides any existing data.
	 * @param val
	 *            The value to be assigned to the field.
	 * @return self for method chaining
	 */
	public final native Node setData(String name, double val)/*-{
		this.setData(name, val);
		return this;
	}-*/;

	/**
	 * Stores arbitrary data on a Node instance. This is not stored with the DOM
	 * node.
	 * 
	 * @param name
	 *            The name of the field to set. If no val is given, name is
	 *            treated as the data and overrides any existing data.
	 * @param val
	 *            The value to be assigned to the field.
	 * @return self for method chaining
	 */
	public final native Node setData(String name, JavaScriptObject val)/*-{
		this.setData(name, val);
		return this;
	}-*/;

	/**
	 * Stores arbitrary data on a Node instance. This is not stored with the DOM
	 * node.
	 * 
	 * @param name
	 *            The name of the field to set. If no val is given, name is
	 *            treated as the data and overrides any existing data.
	 * @param val
	 *            The value to be assigned to the field.
	 * @return self for method chaining
	 */
	public final native Node setData(String name, boolean val)/*-{
		this.setData(name, val);
		return this;
	}-*/;

	/**
	 * integration with GWT widgets : it returns a new HTMLPanel that wrapps
	 * this YUI node. this node must not be already a descendant of an existing GWT Widget :(
	 * 
	 * @return
	 */
	public final native HTMLPanel asHTMLPanel()/*-{
		return @com.google.gwt.user.client.ui.HTMLPanel::wrap(Lcom/google/gwt/dom/client/Element;)(this.getDOMNode()); 
	}-*/;

	/**
	 * scrolls the element into view.
	 * @return
	 */
	public final native Node scrollIntoView()/*-{
		this.scrollIntoView();
		return this; 
	}-*/;
	
	/**
	 * scrolls the element into view.
	 * @param alignWithTop If true, the scrolled element is aligned with the top of the scroll area. If false, it is aligned with the bottom. Note: By default, the element is scrolled to align with the top of the scroll area.
	 * @return
	 */
	public final native Node scrollIntoView(boolean alignWithTop)/*-{
		this.scrollIntoView(alignWithTop);
		return this; 
	}-*/;
	
}
