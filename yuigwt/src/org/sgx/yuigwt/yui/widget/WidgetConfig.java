package org.sgx.yuigwt.yui.widget;

import org.sgx.yuigwt.yui.base.BaseConfig;
import org.sgx.yuigwt.yui.node.Node;

import com.google.gwt.core.client.JavaScriptObject;
import com.google.gwt.dom.client.Element;

public class WidgetConfig extends BaseConfig {
protected WidgetConfig(){}
/**
 * A DOM node that is a direct descendant of a Widget's bounding box that houses its content.
 * @return
 */
public native final Node boundingBox() /*-{
return this.boundingBox; 
}-*/;

/**
 * A DOM node that is a direct descendant of a Widget's bounding box that houses its content.
 * @param val
 * @return this - for setter chaining
 */
public native final WidgetConfig boundingBox(Node val) /*-{
this.boundingBox = val; 
return this; 
}-*/;

/**
 * A DOM node that is a direct descendant of a Widget's bounding box that houses its content.
 * @return
 */
public native final Node contentBox() /*-{
return this.contentBox; 
}-*/;

/**
 * A DOM node that is a direct descendant of a Widget's bounding box that houses its content.
 * @param val
 * @return this - for setter chaining
 */
public native final WidgetConfig contentBox(Node val) /*-{
this.contentBox = val; 
return this; 
}-*/;

/**
 * 
 * @return
 */
public native final Node srcNode() /*-{
return this.srcNode; 
}-*/;

/**
 * sets the srcNode attribute
 * @param val
 * @return this - for setter chaining
 */
public native final WidgetConfig srcNode(Node val) /*-{
this.srcNode = val; 
return this; 
}-*/;

/**
 * sets the srcNode attribute
 * @param val
 * @return this - for setter chaining
 */
public native final WidgetConfig srcNode(Element val) /*-{
this.srcNode = val; 
return this; 
}-*/;
/**
 * 
 * @return
 */
public native final String srcNodeString() /*-{
return this.srcNode; 
}-*/;

/**
 * 
 * @param val
 * @return this - for setter chaining
 */
public native final WidgetConfig srcNode(String val) /*-{
this.srcNode = val; 
return this; 
}-*/;

/**
 * 
 * @return
 */
public native final JavaScriptObject strings() /*-{
return this.strings; 
}-*/;

/**
 * 
 * @param val
 * @return this - for setter chaining
 */
public native final WidgetConfig strings(JavaScriptObject val) /*-{
this.strings = val; 
return this; 
}-*/;

/**
 * Default: Generated using guid()
 * @return
 */
public native final String id() /*-{
return this.id; 
}-*/;

/**
 * Default: Generated using guid()
 * @param val
 * @return this - for setter chaining
 */
public native final WidgetConfig id(String val) /*-{
this.id = val; 
return this; 
}-*/;



/**
 * Boolean indicating if the Widget should be disabled. The disabled implementation is left to the specific classes extending widget. Default: false
 * @return
 */
public native final boolean disabled() /*-{
return this.disabled; 
}-*/;

/**
 * Boolean indicating if the Widget should be disabled. The disabled implementation is left to the specific classes extending widget. v
 * @param val
 * @return this - for setter chaining
 */
public native final WidgetConfig disabled(boolean val) /*-{
this.disabled = val; 
return this; 
}-*/;

/**
 * Boolean indicating if the Widget, or one of its descendants, has focus.Default: false
 * @return
 */
public native final boolean focused() /*-{
return this.focused; 
}-*/;

/**
 * Boolean indicating if the Widget, or one of its descendants, has focus.Default: false
 * @param val
 * @return this - for setter chaining
 */
public native final WidgetConfig focused(boolean val) /*-{
this.focused = val; 
return this; 
}-*/;

/**
 * String with units, or number, representing the height of the Widget. If a number is provided, the default unit, defined by the Widgets DEF_UNIT, property is used. Default: EMPTY_STR
 * @return
 */
public native final String height() /*-{
return this.height; 
}-*/;

/**
 * String with units, or number, representing the height of the Widget. If a number is provided, the default unit, defined by the Widgets DEF_UNIT, property is used. Default: EMPTY_STR
 * @param val
 * @return this - for setter chaining
 */
public native final WidgetConfig height(String val) /*-{
this.height = val; 
return this; 
}-*/;

/**
 * String with units, or number, representing the width of the Widget. If a number is provided, the default unit, defined by the Widgets DEF_UNIT, property is used.
 * @return
 */
public native final String width() /*-{
return this.width; 
}-*/;

/**
 * String with units, or number, representing the width of the Widget. If a number is provided, the default unit, defined by the Widgets DEF_UNIT, property is used.
 * @param val
 * @return this - for setter chaining
 */
public native final WidgetConfig width(String val) /*-{
this.width = val; 
return this; 
}-*/;

/**
 * 
 * @return
 */
public native final Node render() /*-{
return this.render; 
}-*/;

/**
 * 
 * @param val
 * @return this - for setter chaining
 */
public native final WidgetConfig render(Node val) /*-{
this.render = val; 
return this; 
}-*/;
/**
 * 
 * @param val
 * @return this - for setter chaining
 */
public native final WidgetConfig render(String val) /*-{
this.render = val; 
return this; 
}-*/;
/**
 * 
 * @param val
 * @return this - for setter chaining
 */
public native final WidgetConfig render(boolean val) /*-{
this.render = val; 
return this; 
}-*/;
}
