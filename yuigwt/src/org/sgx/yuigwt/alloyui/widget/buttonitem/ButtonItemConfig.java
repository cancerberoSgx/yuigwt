package org.sgx.yuigwt.alloyui.widget.buttonitem;

import org.sgx.yuigwt.alloyui.widget.component.ComponentConfig;
/**
 * A base class for ButtonItem, providing:
 * 
 * <br/>
 * Widget Lifecycle (initializer, renderUI, bindUI, syncUI, destructor)
 * 
 * <br/>
 * An optional icon or label
 * 
 * <br/>
 * Managed user interaction states (default, active, hover)
 * 
 * <br/>
 * Keyboard accessible
 * 
 * <br/>
 * Quick Example:
 * 
 * <pre>
 * var instance = new A.ButtonItem({
 * icon: 'gear',
 * label: 'Configuration'
 * }).render();
 * </pre>
 * 
 * @author sg
 * 
 */
public class ButtonItemConfig extends ComponentConfig {
protected ButtonItemConfig(){}
public static final native ButtonItemConfig create()/*-{
	return {}; 
}-*/;
/**
 * Whether to track the active state of the button. 
 * @return
 */
public native final boolean activeState() /*-{
return this.activeState; 
}-*/;

/**
 * Whether to track the active state of the button. 
 * @param val
 * @return this - for setter chaining
 */
public native final ButtonItemConfig activeState(boolean val) /*-{
this.activeState = val; 
return this; 
}-*/;

//TODO: AUI classNames() collides with widgetExt.classNames()
///**
// * An object map of the CSS class names to use for the different interaction states. 
// * @return
// */
//public native final JavaScriptObject classNames() /*-{
//return this.classNames; 
//}-*/;
//
///**
// * 
// * @param val
// * @return this - for setter chaining
// */
//public native final ButtonItemConfig classNames(JavaScriptObject val) /*-{
//this.classNames = val; 
//return this; 
//}-*/;

/**
 * Whether to apply the default interaction state to the button 
 * @return
 */
public native final boolean defaultState() /*-{
return this.defaultState; 
}-*/;

/**
 * Whether to apply the default interaction state to the button 
 * @param val
 * @return this - for setter chaining
 */
public native final ButtonItemConfig defaultState(boolean val) /*-{
this.defaultState = val; 
return this; 
}-*/;

//TODO: handler: why handler ? and not on, after, etc..

/**
 * Whether to track the hover interaction state of the button. 
 * @return
 */
public native final boolean hoverState() /*-{
return this.hoverState; 
}-*/;

/**
 * Whether to track the hover interaction state of the button. 
 * @param val
 * @return this - for setter chaining
 */
public native final ButtonItemConfig hoverState(boolean val) /*-{
this.hoverState = val; 
return this; 
}-*/;
/**
 * The icon to use inside of the button
 * @return
 */
public native final String icon() /*-{
return this.icon; 
}-*/;

/**
 * The icon to use inside of the button
 * @param val
 * @return this - for setter chaining
 */
public native final ButtonItemConfig icon(String val) /*-{
this.icon = val; 
return this; 
}-*/;

/**
 * DOM Node to display the icon of the ButtonItem. If not specified try to query using HTML_PARSER an element inside boundingBox which matches aui-button-icon. 
 * @return
 */
public native final String iconNode() /*-{
return this.iconNode; 
}-*/;

/**
 * DOM Node to display the icon of the ButtonItem. If not specified try to query using HTML_PARSER an element inside boundingBox which matches aui-button-icon. 
 * @param val
 * @return this - for setter chaining
 */
public native final ButtonItemConfig iconNode(String val) /*-{
this.iconNode = val; 
return this; 
}-*/;

/**
 * Text to use inside of the button. 
 * @return
 */
public native final String label() /*-{
return this.label; 
}-*/;

/**
 * Text to use inside of the button. 
 * @param val
 * @return this - for setter chaining
 */
public native final ButtonItemConfig label(String val) /*-{
this.label = val; 
return this; 
}-*/;

/**
 * DOM Node to display the text of the ButtonItem. If not specified try to query using HTML_PARSER an element inside boundingBox which matches aui-button-label. 
 * @return
 */
public native final String labelNode() /*-{
return this.labelNode; 
}-*/;

/**
 * DOM Node to display the text of the ButtonItem. If not specified try to query using HTML_PARSER an element inside boundingBox which matches aui-button-label. 
 * @param val
 * @return this - for setter chaining
 */
public native final ButtonItemConfig labelNode(String val) /*-{
this.labelNode = val; 
return this; 
}-*/;

/**
 * Text to use as the title attribute of the button. 
 * @return
 */
public native final String title() /*-{
return this.title; 
}-*/;

/**
 * Text to use as the title attribute of the button. 
 * @param val
 * @return this - for setter chaining
 */
public native final ButtonItemConfig title(String val) /*-{
this.title = val; 
return this; 
}-*/;
}
