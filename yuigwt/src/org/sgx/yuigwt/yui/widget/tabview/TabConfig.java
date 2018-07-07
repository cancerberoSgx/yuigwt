package org.sgx.yuigwt.yui.widget.tabview;

import org.sgx.yuigwt.yui.node.Node;
import org.sgx.yuigwt.yui.widget.ext.WidgetExtConfig;

public class TabConfig extends WidgetExtConfig {
protected TabConfig(){}
public static native final TabConfig create()/*-{
	return {}; 
}-*/;
/**
 * 
 * @return
 */
public native final String contentString() /*-{
return this.content; 
}-*/;
/**
 * 
 * @return
 */
public native final Node contentNode() /*-{
return this.content; 
}-*/;
/**
 * 
 * @param val
 * @return this - for setter chaining
 */
public native final TabConfig content(String val) /*-{
this.content = val; 
return this; 
}-*/;
/**
 * 
 * @param val
 * @return this - for setter chaining
 */
public native final TabConfig content(Node val) /*-{
this.content = val; 
return this; 
}-*/;
/**
 * 
 * @return
 */
public native final Node panelNode() /*-{
return this.panelNode; 
}-*/;

/**
 * @param val
 * @return this - for setter chaining
 */
public native final TabConfig panelNode(Node val) /*-{
this.panelNode = val; 
return this; 
}-*/;

/**
 * 
 * @return
 */
public native final String label() /*-{
return this.label; 
}-*/;

/**
 * 
 * @param val
 * @return this - for setter chaining
 */
public native final TabConfig label(String val) /*-{
this.label = val; 
return this; 
}-*/;

/**
 * Default: "click"
 * @return
 */
public native final String triggerEvent() /*-{
return this.triggerEvent; 
}-*/;

/**
 * Default: "click"
 * @param val
 * @return this - for setter chaining
 */
public native final TabConfig triggerEvent(String val) /*-{
this.triggerEvent = val; 
return this; 
}-*/;
}
