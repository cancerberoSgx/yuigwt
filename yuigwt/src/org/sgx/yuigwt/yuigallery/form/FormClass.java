package org.sgx.yuigwt.yuigallery.form;

import org.sgx.yuigwt.yui.widget.WidgetClass;

import com.google.gwt.core.client.JavaScriptObject;

public class FormClass extends WidgetClass {
protected FormClass(){}
/**
 * The HTML used to create the form Node 
 * @return
 */
public native final String FORM_TEMPLATE() /*-{
return this.FORM_TEMPLATE; 
}-*/;

///**
// * The HTML used to create the form Node 
// * @return
// */
//public native final JavaScriptObject HTML_PARSER() /*-{
//return this.HTML_PARSER; 
//}-*/;
}
