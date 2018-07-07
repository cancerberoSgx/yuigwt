package org.sgx.yuigwt.yuigallery.accordion;

import org.sgx.yuigwt.yui.anim.AnimConfig;
import org.sgx.yuigwt.yui.event.EventTarget;
import org.sgx.yuigwt.yui.widget.WidgetConfig;

import com.google.gwt.core.client.JsArray;

public class AccordionConfig extends WidgetConfig {
protected AccordionConfig(){}

public static native final AccordionConfig create()/*-{
	return {}; 
}-*/;


/**
 * Get/Set always visible status of the item. Default Value: false 
 * @return
 */
public native final boolean alwaysVisible() /*-{
return this.alwaysVisible; 
}-*/;

/**
 * Get/Set always visible status of the item. Default Value: false 
 * @param val
 * @return this - for setter chaining
 */
public native final AccordionConfig alwaysVisible(boolean val) /*-{
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
public native final AccordionConfig animation(AnimConfig val) /*-{
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
public native final AccordionConfig closable(boolean val) /*-{
this.closable = val; 
return this; 
}-*/;

/**
 * If true, on item expanding, all other expanded and not set as always visible items, will be collapsed Otherwise, they will stay open. Default Value: true
 * @return
 */
public native final boolean collapseOthersOnExpand() /*-{
return this.collapseOthersOnExpand; 
}-*/;

/**
 * If true, on item expanding, all other expanded and not set as always visible items, will be collapsed Otherwise, they will stay open. Default Value: true 
 * @param val
 * @return this - for setter chaining
 */
public native final AccordionConfig collapseOthersOnExpand(boolean val) /*-{
this.collapseOthersOnExpand = val; 
return this; 
}-*/;


/**
 * The event on which Accordion should listen for user interactions. The value can be also 'mousedown', 'mouseup' or ['mouseenter','click']. Mousedown event can be used if drag&drop is not enabled. Default: "click". 
 * @param val
 * @return this - for setter chaining
 */
public native final AccordionConfig itemChosen(String val) /*-{
this.itemChosen = val; 
return this; 
}-*/;

/**
 * The event on which Accordion should listen for user interactions. The value can be also 'mousedown', 'mouseup' or ['mouseenter','click']. Mousedown event can be used if drag&drop is not enabled. Default: "click". 
 * @param val
 * @return this - for setter chaining
 */
public native final AccordionConfig itemChosen(String[] val) /*-{
this.itemChosen = @org.sgx.yuigwt.yui.util.JsUtil::toJsArrayString([Ljava/lang/String;)(val); 
return this; 
}-*/;

/**
 * Contains the items, currently added to Accordion 
 * @return
 */
public native final JsArray<AccordionItem> items() /*-{
return this.items; 
}-*/;

/**
 * Contains the items, currently added to Accordion 
 * @param val
 * @return this - for setter chaining
 */
public native final AccordionConfig items(JsArray<AccordionItem> val) /*-{
this.items = val; 
return this; 
}-*/;

/**
 * 
Boolean indicating that items can be reordered via drag and drop.
Enabling items reordering requires also including the optional drag and drop modules in YUI instance:
'dd-constrain', 'dd-proxy', 'dd-drop', or just 'dd'. 
Default Value: false 
 * @return
 */
public native final boolean reorderItems() /*-{
return this.reorderItems; 
}-*/;

/**
Boolean indicating that items can be reordered via drag and drop.
Enabling items reordering requires also including the optional drag and drop modules in YUI instance:
'dd-constrain', 'dd-proxy', 'dd-drop', or just 'dd'. 
Default Value: false 
 * 
 * @param val
 * @return this - for setter chaining
 */
public native final AccordionConfig reorderItems(boolean val) /*-{
this.reorderItems = val; 
return this; 
}-*/;

/**
 * 
 * @return
 */
public native final String resizeEvent() /*-{
return this.resizeEvent; 
}-*/;

/**
 * 
 * @param val
 * @return this - for setter chaining
 */
public native final AccordionConfig resizeEvent(String val) /*-{
this.resizeEvent = val; 
return this; 
}-*/;
/**
 * resizeEvent - String or Object
The event on which Accordion should listen for resizing. The value must be one of these:

    String "default" - the Accordion will subscribe to Y.windowresize event
    An object in the following form: { sourceObject: some_javascript_object, resizeEvent: an_event_to_subscribe }

For example, if we are using LayoutManager's instance as sourceObject, we will have to use its "resize" event as resizeEvent
Default Value: "default" 
 * @param val
 * @return this - for setter chaining
 */
public native final AccordionConfig resizeEvent(EventTarget sourceObject, String resizeEvent) /*-{
this.resizeEvent = {"sourceObject": sourceObject, "resizeEvent":resizeEvent}; 
return this; 
}-*/;

/**
 * Boolean indicating that Accordion should use animation when expanding or collapsing items. Default Value: true 
 * @return
 */
public native final boolean useAnimation() /*-{
return this.useAnimation; 
}-*/;

/**
 * Boolean indicating that Accordion should use animation when expanding or collapsing items.Default Value: true 
 * @param val
 * @return this - for setter chaining
 */
public native final AccordionConfig useAnimation(boolean val) /*-{
this.useAnimation = val; 
return this; 
}-*/;


}
