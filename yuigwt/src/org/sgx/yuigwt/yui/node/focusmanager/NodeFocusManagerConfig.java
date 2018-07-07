package org.sgx.yuigwt.yui.node.focusmanager;

import org.sgx.yuigwt.yui.base.BaseConfig;

public class NodeFocusManagerConfig extends BaseConfig {
protected NodeFocusManagerConfig(){}
public static final native NodeFocusManagerConfig create()/*-{
	return {}; 
}-*/;

/**
 * Node, or index of the Node, representing the descendant that is either focused or is focusable (tabIndex attribute is set to 0). The value cannot represent a disabled descendant Node. Use a value of -1 to remove all descendant Nodes from the default tab flow. If no value is specified, the active descendant will be inferred using the following criteria:
<br/>
    Examining the tabIndex attribute of each descendant and using the first descendant whose tabIndex attribute is set to 0
<br/>    If no default can be inferred then the value is set to either 0 or the index of the first enabled descendant.

 * @return
 */
public native final int activeDescendant() /*-{
return this.activeDescendant; 
}-*/;

/**
 * Node, or index of the Node, representing the descendant that is either focused or is focusable (tabIndex attribute is set to 0). The value cannot represent a disabled descendant Node. Use a value of -1 to remove all descendant Nodes from the default tab flow. If no value is specified, the active descendant will be inferred using the following criteria:
<br/>
    Examining the tabIndex attribute of each descendant and using the first descendant whose tabIndex attribute is set to 0
<br/>    If no default can be inferred then the value is set to either 0 or the index of the first enabled descendant.

 * @param val
 * @return this - for setter chaining
 */
public native final NodeFocusManagerConfig activeDescendant(int val) /*-{
this.activeDescendant = val; 
return this; 
}-*/;

/**
 * Boolean indicating if focus should be set to the first/last descendant when the end or beginning of the descendants has been reached.Default: true
 * @return
 */
public native final boolean circular() /*-{
return this.circular; 
}-*/;

/**
 * Boolean indicating if focus should be set to the first/last descendant when the end or beginning of the descendants has been reached.Default: true
 * @param val
 * @return this - for setter chaining
 */
public native final NodeFocusManagerConfig circular(boolean val) /*-{
this.circular = val; 
return this; 
}-*/;
/**
 * String representing the CSS selector used to define the descendant Nodes whose focus should be managed.
 * @return
 */
public native final String descendants() /*-{
return this.descendants; 
}-*/;

/**
 * String representing the CSS selector used to define the descendant Nodes whose focus should be managed.
 * @param val
 * @return this - for setter chaining
 */
public native final NodeFocusManagerConfig descendants(String val) /*-{
this.descendants = val; 
return this; 
}-*/;
/**
 * String representing the name of class applied to the focused active descendant Node. Can also be an object literal used to define both the class name, and the Node to which the class should be applied. If using an object literal, the format is: { className: "focus", fn: myFunction }. The function referenced by the fn property in the object literal will be passed a reference to the currently focused active descendant Node.
 * @return
 */
public native final String focusClass() /*-{
return this.focusClass; 
}-*/;

/**
 * String representing the name of class applied to the focused active descendant Node. Can also be an object literal used to define both the class name, and the Node to which the class should be applied. If using an object literal, the format is: { className: "focus", fn: myFunction }. The function referenced by the fn property in the object literal will be passed a reference to the currently focused active descendant Node.
 * @param val
 * @return this - for setter chaining
 */
public native final NodeFocusManagerConfig focusClass(String val) /*-{
this.focusClass = val; 
return this; 
}-*/;
/**
 * 
 * @return
 */
public native final NodeFocusManager.Keys keys() /*-{
return this.keys; 
}-*/;

/**
 * 
 * @param val
 * @return this - for setter chaining
 */
public native final NodeFocusManagerConfig keys(NodeFocusManager.Keys val) /*-{
this.keys = val; 
return this; 
}-*/;

public native final NodeFocusManagerConfig keys(String next, String previous) /*-{
this.keys = {"next": next, "previous": previous}; 
return this; 
}-*/;
}
