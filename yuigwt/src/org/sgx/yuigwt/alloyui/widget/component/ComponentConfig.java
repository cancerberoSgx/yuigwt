package org.sgx.yuigwt.alloyui.widget.component;

import org.sgx.yuigwt.yui.widget.ext.WidgetExtConfig;

public class ComponentConfig extends WidgetExtConfig {
protected ComponentConfig(){}
/**
 * CSS class to be automatically added to the boundingBox. Default: null
 * @return
 */
public native final String cssClass() /*-{
return this.cssClass; 
}-*/;

/**
 * CSS class to be automatically added to the boundingBox. Default: null
 * @param val
 * @return this - for setter chaining
 */
public native final ComponentConfig cssClass(String val) /*-{
this.cssClass = val; 
return this; 
}-*/;

/**
 * css class added to hide the boundingBox when visible is set to false. Default: 'aui-helper-hidden'
 * @return
 */
public native final String hideClass() /*-{
return this.hideClass; 
}-*/;

/**
 *  css class added to hide the boundingBox when visible is set to false. Default: 'aui-helper-hidden'
 * @param val
 * @return this - for setter chaining
 */
public native final ComponentConfig hideClass(String val) /*-{
this.hideClass = val; 
return this; 
}-*/;


}
