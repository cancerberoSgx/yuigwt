package org.sgx.yuigwt.yui.node.focusmanager;

import org.sgx.yuigwt.yui.base.Base;
import org.sgx.yuigwt.yui.node.Node;

import com.google.gwt.core.client.JavaScriptObject;

/**
 * this class represents aNode.focusManager. Use like this: 
 * <pre>
NodeFocusManager fm = NodeFocusManager.getFor(aNode); 
fm.after("focusedChange", new ..)
fm.focus(1); 
</pre>
 * @see http://yuilibrary.com/yui/docs/node-focusmanager
 * @see http://yuilibrary.com/yui/docs/api/classes/plugin.NodeFocusManager.html
 * 
 * @author sg
 *
 */
public class NodeFocusManager extends Base {
protected NodeFocusManager(){}
public static final String EVENT_FOCUSEDCHANGE = "focusedChange";
public static final native NodeFocusManager getFor(Node n)/*-{
	return n.focusManager; 
}-*/;

/**
 * Blurs the current active descendant and sets the focused attribute to false.
 * @return self for method chaining
 */
public native final NodeFocusManager blur() /*-{
this.blur(); 
return this; 
}-*/;

/**
 * Focuses the active descendant and sets the focused attribute to true.
 * @return self for method chaining
 */
public native final NodeFocusManager focus() /*-{
this.focus(); 
return this; 
}-*/;
/**
 * Focuses the active descendant and sets the focused attribute to true.
 * @param index Number representing the index of the descendant to be set as the active descendant.
 * @return self for method chaining
 */
public native final NodeFocusManager focus(int index) /*-{
this.focus(index); 
return this; 
}-*/;
/**
 * Focuses the active descendant and sets the focused attribute to true.
 * @param index Node instance representing the index of the descendant to be set as the active descendant.
 * @return self for method chaining
 */
public native final NodeFocusManager focus(Node index) /*-{
this.focus(index); 
return this; 
}-*/;
/**
 * Refreshes the Focus Manager's descendants by re-executing the CSS selector query specified by the descendants attribute.
 * @return self for method chaining
 */
public native final NodeFocusManager refresh() /*-{
this.refresh(); 
return this; 
}-*/;
/**
 * Enables the Focus Manager.
 * @return self for method chaining
 */
public native final NodeFocusManager start() /*-{
this.start(); 
return this; 
}-*/;

/**
 * Disables the Focus Manager by detaching all event handlers.
 * @return self for method chaining
 */
public native final NodeFocusManager stop() /*-{
this.stop(); 
return this; 
}-*/;



//attrs
/**
 * Node, or index of the Node, representing the descendant that is either focused or is focusable (tabIndex attribute is set to 0). The value cannot represent a disabled descendant Node. Use a value of -1 to remove all descendant Nodes from the default tab flow. If no value is specified, the active descendant will be inferred using the following criteria:
<br/>
    Examining the tabIndex attribute of each descendant and using the first descendant whose tabIndex attribute is set to 0
<br/>    If no default can be inferred then the value is set to either 0 or the index of the first enabled descendant.


 * @return the attribute
 */
public final native int activeDescendant()/*-{
return this.get("activeDescendant");
}-*/;

/**
 * Node, or index of the Node, representing the descendant that is either focused or is focusable (tabIndex attribute is set to 0). The value cannot represent a disabled descendant Node. Use a value of -1 to remove all descendant Nodes from the default tab flow. If no value is specified, the active descendant will be inferred using the following criteria:
<br/>
    Examining the tabIndex attribute of each descendant and using the first descendant whose tabIndex attribute is set to 0
<br/>    If no default can be inferred then the value is set to either 0 or the index of the first enabled descendant.

 * @param val
 * @return self for method chaining
 */
public final native NodeFocusManager activeDescendant(int val)/*-{
this.set("activeDescendant", val);
return this; 
}-*/;

/**
 * Boolean indicating if focus should be set to the first/last descendant when the end or beginning of the descendants has been reached.Default: true
 * @return the attribute
 */
public final native boolean circular()/*-{
return this.get("circular");
}-*/;

/**
 * Boolean indicating if focus should be set to the first/last descendant when the end or beginning of the descendants has been reached.Default: true
 * @param val
 * @return self for method chaining
 */
public final native NodeFocusManager circular(boolean val)/*-{
this.set("circular", val);
return this; 
}-*/;
/**
 * String representing the CSS selector used to define the descendant Nodes whose focus should be managed.
 * @return the attribute
 */
public final native String descendants()/*-{
return this.get("descendants");
}-*/;

/**
 * String representing the CSS selector used to define the descendant Nodes whose focus should be managed.
 * @param val
 * @return self for method chaining
 */
public final native NodeFocusManager descendants(String val)/*-{
this.set("descendants", val);
return this; 
}-*/;

/**
 * String representing the name of class applied to the focused active descendant Node. Can also be an object literal used to define both the class name, and the Node to which the class should be applied. If using an object literal, the format is: { className: "focus", fn: myFunction }. The function referenced by the fn property in the object literal will be passed a reference to the currently focused active descendant Node.
 * @return the attribute
 */
public final native String focusClass()/*-{
return this.get("focusClass");
}-*/;

/**
 * String representing the name of class applied to the focused active descendant Node. Can also be an object literal used to define both the class name, and the Node to which the class should be applied. If using an object literal, the format is: { className: "focus", fn: myFunction }. The function referenced by the fn property in the object literal will be passed a reference to the currently focused active descendant Node.
 * @param val
 * @return self for method chaining
 */
public final native NodeFocusManager focusClass(String val)/*-{
this.set("focusClass", val);
return this; 
}-*/;

/**
 * Boolean indicating that one of the descendants is focused.Default: false
 * @return
 */
public native final boolean focused() /*-{
return this.focused; 
}-*/;

/**
 * Boolean indicating that one of the descendants is focused.Default: false
 * @param val
 * @return this - for setter chaining
 */
public native final NodeFocusManager focused(boolean val) /*-{
this.focused = val; 
return this; 
}-*/;

	/**
	 * Object literal representing the keys to be used to navigate between the next/previous descendant. The format for the attribute's value is { next: "down:40", previous: "down:38" }. The value for the "next" and "previous" properties are used to attach key event listeners. See the Using the key Event section of the Event documentation for more information on "key" event listeners.
	 * @author sg
	 *
	 */
	public static class Keys extends JavaScriptObject {
		protected Keys(){}
		public static native final Keys create()/*-{
			return {}; 
		}-*/;
		public static native final Keys create(String next, String previous)/*-{
			return {"next": next, "previous": previous}; 
		}-*/;

		/**
		 * 
		 * @return
		 */
		public native final String next() /*-{
		return this.next; 
		}-*/;
		
		/**
		 * 
		 * @param val
		 * @return this - for setter chaining
		 */
		public native final NodeFocusManager.Keys next(String val) /*-{
		this.next = val; 
		return this; 
		}-*/;
		
		/**
		 * 
		 * @return
		 */
		public native final String previous() /*-{
		return this.previous; 
		}-*/;
		
		/**
		 * 
		 * @param val
		 * @return this - for setter chaining
		 */
		public native final NodeFocusManager.Keys previous(String val) /*-{
		this.previous = val; 
		return this; 
		}-*/;
	}
/**
 * Object literal representing the keys to be used to navigate between the next/previous descendant. The format for the attribute's value is { next: "down:40", previous: "down:38" }. The value for the "next" and "previous" properties are used to attach key event listeners. See the Using the key Event section of the Event documentation for more information on "key" event listeners.
 * @return the attribute
 */
public final native Keys keys()/*-{
return this.get("keys");
}-*/;

/**
 * Object literal representing the keys to be used to navigate between the next/previous descendant. The format for the attribute's value is { next: "down:40", previous: "down:38" }. The value for the "next" and "previous" properties are used to attach key event listeners. See the Using the key Event section of the Event documentation for more information on "key" event listeners.
 * @param val
 * @return self for method chaining
 */
public final native NodeFocusManager keys(Keys val)/*-{
this.set("keys", val);
return this; 
}-*/;
	
}
