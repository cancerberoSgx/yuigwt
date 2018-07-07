package org.sgx.yuigwt.yuigallery.accordion;

import org.sgx.yuigwt.yui.anim.Anim;
import org.sgx.yuigwt.yui.anim.AnimConfig;
import org.sgx.yuigwt.yui.node.Node;
import org.sgx.yuigwt.yui.widget.WidgetConfig;

import com.google.gwt.core.client.JavaScriptObject;
/**
 * 
 * @author sg
 *
 */
public class AccordionItemConfig extends WidgetConfig {
protected AccordionItemConfig(){}

public static native final AccordionItemConfig create()/*-{
	return {}; 
}-*/;
/**
 * Get/Set always visible status of the item . Default Value: false 
 * @return
 */
public native final boolean alwaysVisible() /*-{
return this.alwaysVisible; 
}-*/;

/**
 * Get/Set always visible status of the item . Default Value: false 
 * @param val
 * @return this - for setter chaining
 */
public native final AccordionItemConfig alwaysVisible(boolean val) /*-{
this.alwaysVisible = val; 
return this; 
}-*/;

/**
 * Get/Set the animaton specific settings. By default there are no any settings. If set, they will overwrite Accordion's animation settings 
 * @return
 */
public native final AnimConfig animation() /*-{
return this.animation; 
}-*/;

/**
 * Get/Set the animaton specific settings. By default there are no any settings. If set, they will overwrite Accordion's animation settings 
 * @param val
 * @return this - for setter chaining
 */
public native final AccordionItemConfig animation(AnimConfig val) /*-{
this.animation = val; 
return this; 
}-*/;

/**
 * Boolean indicating that the item can be closed by user. If true, there will be placed close icon, otherwise not 
 * @return
 */
public native final boolean closable() /*-{
return this.closable; 
}-*/;

/**
 * Boolean indicating that the item can be closed by user. If true, there will be placed close icon, otherwise not 
 * @param val
 * @return this - for setter chaining
 */
public native final AccordionItemConfig closable(boolean val) /*-{
this.closable = val; 
return this; 
}-*/;


/**
 * 
Describe the method, which will be used when expanding/collapsing the item. The value should be an object with at least one property ("method"):
</br>
method
    The method can be one of these: "auto", "fixed" and "stretch"
    </br>
height
    Must be set only if method's value is "fixed"
</br>
Default Value: auto 
 * @return
 */
public native final AccordionItemContentHeight contentHeight() /*-{
return this.contentHeight; 
}-*/;

/**
 * 
Describe the method, which will be used when expanding/collapsing the item. The value should be an object with at least one property ("method"):

method
    The method can be one of these: "auto", "fixed" and "stretch"
height
    Must be set only if method's value is "fixed"

Default Value: auto 
 * @param val
 * @return this - for setter chaining
 */
public native final AccordionItemConfig contentHeight(AccordionItemContentHeight val) /*-{
this.contentHeight = val; 
return this; 
}-*/;
public native final AccordionItemConfig contentHeight(String method, int height) /*-{
this.contentHeight = {"method": method, "height": height}; 
return this; 
}-*/;
public native final AccordionItemConfig contentHeight(String method) /*-{
this.contentHeight = {"method": method}; 
return this; 
}-*/;
public native final AccordionItemConfig contentHeight(String method, String height) /*-{
this.contentHeight = {"method": method, "height": height}; 
return this; 
}-*/;
/**
 * Get/Set expanded status of the item . Default Value: false 
 * @return
 */
public native final boolean expanded() /*-{
return this.expanded; 
}-*/;

/**
 * 
 * @param val
 * @return this - for setter chaining. Default Value: false 
 */
public native final AccordionItemConfig expanded(boolean val) /*-{
this.expanded = val; 
return this; 
}-*/;

/**
 * The Node, representing item's icon. Default Value: null 
 * @return
 */
public native final Node icon() /*-{
return this.icon; 
}-*/;

/**
 * The Node, representing item's icon. Default Value: null 
 * @param val
 * @return this - for setter chaining
 */
public native final AccordionItemConfig icon(Node val) /*-{
this.icon = val; 
return this; 
}-*/;

/**
 * The Node, representing icon always visible. Default Value: null 
 * @return
 */
public native final Node iconAlwaysVisible() /*-{
return this.iconAlwaysVisible; 
}-*/;

/**
 * The Node, representing icon always visible. Default Value: null 
 * @param val
 * @return this - for setter chaining
 */
public native final AccordionItemConfig iconAlwaysVisible(Node val) /*-{
this.iconAlwaysVisible = val; 
return this; 
}-*/;

/**
 * The Node, representing icon close, or null if the item is not closable. Default Value: null 
 * @return
 */
public native final Node iconClose() /*-{
return this.iconClose; 
}-*/;

/**
 * The Node, representing icon close, or null if the item is not closable. Default Value: null
 * @param val
 * @return this - for setter chaining
 */
public native final AccordionItemConfig iconClose(Node val) /*-{
this.iconClose = val; 
return this; 
}-*/;

/**The Node, representing icon expanded. Default Value: null 
 * 
 * @return
 */
public native final Node iconExpanded() /*-{
return this.iconExpanded; 
}-*/;

/**
 * The Node, representing icon expanded. Default Value: null
 * @param val
 * @return this - for setter chaining
 */
public native final AccordionItemConfig iconExpanded(Node val) /*-{
this.iconExpanded = val; 
return this; 
}-*/;

/**
 * The container of iconAlwaysVisible, iconExpanded and iconClose. Default Value: null 
 * @return
 */
public native final Node iconsContainer() /*-{
return this.iconsContainer; 
}-*/;

/**
 * The container of iconAlwaysVisible, iconExpanded and iconClose. Default Value: null
 * @param val
 * @return this - for setter chaining
 */
public native final AccordionItemConfig iconsContainer(Node val) /*-{
this.iconsContainer = val; 
return this; 
}-*/;

/**
 * The label of item. Default Value: " "
 * @return
 */
public native final String label() /*-{
return this.label; 
}-*/;

/**
 * The label of item. Default Value: " " 
 * @param val
 * @return this - for setter chaining
 */
public native final AccordionItemConfig label(String val) /*-{
this.label = val; 
return this; 
}-*/;

/**
 * The node, which contains item's label. Default Value: null
 * @return
 */
public native final Node nodeLabel() /*-{
return this.nodeLabel; 
}-*/;

/**
 * The node, which contains item's label. Default Value: null 
 * @param val
 * @return this - for setter chaining
 */
public native final AccordionItemConfig nodeLabel(Node val) /*-{
this.nodeLabel = val; 
return this; 
}-*/;
///**
// * Provides client side string localization support. Default Value: Object English messages 
// * @return
// */
//public native final JavaScriptObject strings() /*-{
//return this.strings; 
//}-*/;
//
///**
// * Provides client side string localization support. Default Value: Object English messages
// * @param val
// * @return this - for setter chaining
// */
//public native final AccordionItemConfig strings(JavaScriptObject val) /*-{
//this.strings = val; 
//return this; 
//}-*/;
}
