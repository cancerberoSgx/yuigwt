package org.sgx.yuigwt.yui.widget.ext;

import org.sgx.yuigwt.yui.event.NodeEventCallback;
import org.sgx.yuigwt.yui.widget.button.ButtonConfig;

import com.google.gwt.core.client.JavaScriptObject;
import com.google.gwt.core.client.JsArrayString;
/**
 * the config object for defining buttons at http://yuilibrary.com/yui/docs/api/classes/WidgetButtons.html#method_addButton
 * 
 * @author sg
 *
 */
public class WidgetButtonsConfig extends ButtonConfig {
protected WidgetButtonsConfig(){}
/**
 * 
 * @return
 */
public native final NodeEventCallback action() /*-{
return this.action; 
}-*/;

/**
 * 
 * @param val
 * @return this - for setter chaining
 */
public native final WidgetButtonsConfig action(NodeEventCallback val) /*-{
this.action = $entry(function(e){val.@org.sgx.yuigwt.yui.event.NodeEventCallback::call(Lorg/sgx/yuigwt/yui/event/YuiEvent;)(e)}); 
return this; 
}-*/;

/**
 * 
 * @return
 */
public native final JsArrayString classNames() /*-{
return this.classNames; 
}-*/;

/**
 * 
 * @param val
 * @return this - for setter chaining
 */
public native final WidgetButtonsConfig classNames(String []val) /*-{
this.classNames = @org.sgx.yuigwt.yui.util.JsUtil::toJsArrayString([Ljava/lang/String;)(val);  
return this; 
}-*/;
//
///**
// * Whether the button should be disabled.
// * @return
// */
//public native final boolean disabled() /*-{
//return this.disabled; 
//}-*/;
//
///**
// * Whether the button should be disabled.
// * @param val
// * @return this - for setter chaining
// */
//public native final WidgetButtonsConfig disabled(boolean val) /*-{
//this.disabled = val; 
//return this; 
//}-*/;

/**
 * Event name, or set of events and handlers to bind to the button node. See: Y.Node.on(), this value is passed as the first argument to on().
 * @return
 */
public native final String events() /*-{
return this.events; 
}-*/;

/**
 * Event name, or set of events and handlers to bind to the button node. See: Y.Node.on(), this value is passed as the first argument to on().
 * @param val
 * @return this - for setter chaining
 */
public native final WidgetButtonsConfig events(String val) /*-{
this.events = val; 
return this; 
}-*/;

/**
 * A name which can later be used to reference this button. If a button is defined on the BUTTONS property with this same name, its configuration properties will be merged in as defaults.
 * @return
 */
public native final String name() /*-{
return this.name; 
}-*/;

/**
 * A name which can later be used to reference this button. If a button is defined on the BUTTONS property with this same name, its configuration properties will be merged in as defaults.
 * @param val
 * @return this - for setter chaining
 */
public native final WidgetButtonsConfig name(String val) /*-{
this.name = val; 
return this; 
}-*/;

/**
 * The WidgetStdMod section (header, body, footer) where the button should be added.
 * @return
 */
public native final String section() /*-{
return this.section; 
}-*/;

/**
 * The WidgetStdMod section (header, body, footer) where the button should be added.
 * @param val
 * @return this - for setter chaining
 */
public native final WidgetButtonsConfig section(String val) /*-{
this.section = val; 
return this; 
}-*/;

/**
 * The index at which the button should be inserted. If not specified, the button will be added to the end of the section. This value is passed to the Array splice() method, therefore a negative value will insert the button that many items from the end.
 * @return
 */
public native final String template() /*-{
return this.template; 
}-*/;

/**
 * The index at which the button should be inserted. If not specified, the button will be added to the end of the section. This value is passed to the Array splice() method, therefore a negative value will insert the button that many items from the end.
 * @param val
 * @return this - for setter chaining
 */
public native final WidgetButtonsConfig template(String val) /*-{
this.template = val; 
return this; 
}-*/;
}
