package org.sgx.yuigwt.yui.util;

import org.sgx.yuigwt.yui.YuiContext;
import org.sgx.yuigwt.yui.event.NodeEventCallback;
import org.sgx.yuigwt.yui.node.Node;

import com.google.gwt.core.client.JavaScriptObject;
import com.google.gwt.core.client.JsArrayString;
import com.google.gwt.dom.client.Element;
import com.google.gwt.user.client.ui.HTML;
import com.google.gwt.user.client.ui.Widget;

/**
 * yui java utilities. 
 * @author sgurin
 *
 */
public class YUIUtil {
	/**
	 * HTML element creation using java code and json strings for attrs - css
	 * @param Y the yuic ontext that should have node module loaded.
	 * @param attrs a valid json string like "{'id': 'foo123'}" or simply "'id': 'foo123'". attributes tag and cdata are special. 
	 * The "tag" attribute indicates the tag name of the new html node, if not indicated it will use 
	 * @param css a valid json string with css property values
	 * @param childs an array of nodes. Because right-evaluation, you can use this NODE() function for create them 
	 * @return a new node. 
	 */
	public static Node NODE(YuiContext Y, String attrs, String css, Node[] childs) {
		JavaScriptObject 
			attrsObj = attrs==null ? JavaScriptObject.createObject() :
				(attrs.startsWith("{") ? JsUtil.eval("("+attrs+")") : JsUtil.eval("({"+attrs+"})")), 
				
			cssObj = css==null ? JavaScriptObject.createObject() : 
				(css.startsWith("{") ? JsUtil.eval("("+css+")") : JsUtil.eval("({"+css+"})"));	
			
		return NODE(Y, attrsObj, cssObj, childs); 
		
		
	}
	public static Node NODE(YuiContext Y, JavaScriptObject attrsObj) {
		return NODE(Y, attrsObj, null, null); 
	}
	public static Node NODE(YuiContext Y, JavaScriptObject attrsObj, JavaScriptObject style) {
		return NODE(Y, attrsObj, style, null); 
	}
	public static Node NODE(YuiContext Y, JavaScriptObject attrsObj, Node[] childs) {
		return NODE(Y, attrsObj, null, childs); 
	}
	/**
	 * main utility for creating node structures literally 100% in java. You can use Attr and Style overlays for creating the attributes and style objects. 
	 * @param Y yui context with node support
	 * @param attrsObj an object with html attributes to set to the new node and also two extra special attributes, "tag" for the node tagNama and "cdata" for the noew text.. Use HTMLAttrs for building  
	 * @param cssObj a css style object, use Style for building. 
	 * @param childs an array of other nodes that will be appended to the new node. Advantadge can be take from right to left java evaluation, like this Node n = NODE(..., new Node[]{NODE(...), NODE(..., new Node[]{NODE(...)})}) 
	 * @return the new node. 
	 */
	public static Node NODE(YuiContext Y, JavaScriptObject attrsObj,
			JavaScriptObject cssObj, Node[] childs) {
		if(attrsObj==null) //required
			return null;
		Object o = JsUtil.cloneObject(attrsObj);
		String tag = (String) JsUtil.get(attrsObj, "tag"), 
			cdata = (String) JsUtil.get(attrsObj, "cdata");
//		if(tag==null) //required
//			return null;
		if(tag==null)
			tag="span"; 
		Node thisNode = null; 
		thisNode = Y.one("document").create("<"+tag+"></"+tag+">"); 
		
		JsArrayString attrNames = JsUtil.props(attrsObj);
		for (int i = 0; i < attrNames.length(); i++) {
			String attr = attrNames.get(i);
			if(attr!=null && !attr.equals("tag") && !attr.equals("cdata"))
				thisNode.setAttribute(attr, (String) JsUtil.get(attrsObj, attr));
		}
		if(cdata!=null)
			thisNode.setContent(cdata);
		thisNode.setStyles(cssObj);		
		if(childs!=null) 
			for (int i = 0; i < childs.length; i++) 
				thisNode.append(childs[i]);
		return thisNode;
	}
	public static Node NODE(YuiContext Y, String attrs, String css) {
		return NODE(Y, attrs, css, null); 
	}
	public static Node NODE(YuiContext Y, String attrs) {
		return NODE(Y, attrs, null, null);
	}
	
	
	//menu nav utils
	public static Node makeMenuItem(YuiContext Y, String label) {
		return makeMenuItem(Y, label, null); 
	}	
	public static Node makeMenuItem(YuiContext Y, String label, Node[] childs) {
		return makeMenuItem(Y, label, null, null, childs); 
	}
	public static Node makeMenuItem(YuiContext Y, String label, NodeEventCallback clickHandler, Node[] childs) {
		return makeMenuItem(Y, label, null, clickHandler, childs); 
	}
	public static Node makeMenuItem(YuiContext Y, String label, String href, NodeEventCallback clickHandler, Node[] childs) {

		//if no children the element is a <li><a...
//		if(childs==null || childs.length==0) {
			String nodeAttrs = href!=null ? ("tag:'a',href:'"+href+"',cdata:'"+label+"'") : 
				("tag:'span',cdata:'"+label+"'"); 
			Node labelEl = NODE(Y, nodeAttrs, null, null), 
				el = NODE(Y, "tag:'li',class:'yui3-menuitem'", null, new Node[]{labelEl});
			
			
			if(clickHandler!=null)
				labelEl.on("click", clickHandler); 
			
			if(childs!=null&&childs.length>0) {
//				labelEl.addClass("yui3-menuitem-content");
				labelEl.addClass("yui3-menu-label"); 
				Node root = NODE(Y, "tag:'div',class:'yui3-menu'", null, null), 
				content = NODE(Y, "tag:'div',class:'yui3-menu-content'", null, null), 
				list = NODE(Y, "tag:'ul'", null, null);
				root.append(content);
				content.append(list);
				for (int i = 0; i < childs.length; i++) {
					list.append(childs[i]);
				}
				el.append(root); 
			}
			else {
				labelEl.addClass("yui3-menuitem-content"); 
			}
			return el;		
//		}
//		else {
			//if contains children the elmeent is a <li><a></a><div></div><ul>
//			Node root = NODE(Y, "tag:'div',class:'yui3-menu'", null, null), 
//				content = NODE(Y, "tag:'div',class:'yui3-menu-content'", null, null), 
//				list = NODE(Y, "tag:'ul'", null, null);
//			root.append(content);
//			content.append(list);
//			for (int i = 0; i < childs.length; i++) {
//				list.append(childs[i]);
//			}
//			return root;
//		}
	}
	public static Node makeMenu(YuiContext Y, boolean horizontal) {
		return makeMenu(Y, horizontal, null); 
	}
	public static Node makeMenu(YuiContext Y, boolean horizontal, Node[] menuItems) {
		Node root = NODE(Y, "tag:'div',class:'yui3-menu'", null, null), 
				content = NODE(Y, "tag:'div',class:'yui3-menu-content'", null, null);
//		Window.alert(root+""); 
		root.addClass(horizontal?"yui3-menu-horizontal":"yui3-menu-vertical");
		root.append(content);
		if(menuItems==null || menuItems.length==0)
			return root;
		Node list = NODE(Y, "tag:'ul'", null, null);
//		list.addClass("first-of-type");
		content.append(list);
		for (int i = 0; i < menuItems.length; i++) {
			list.append(menuItems[i]);
		}
		return root;
	}
	public static Node getNode(YuiContext y, Widget w) {
		return y.one(w.getElement()); 
	}
	public static Node getNode(YuiContext y, Element e) {
		return y.one(e); 
	}
	
	
}
