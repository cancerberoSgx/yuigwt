package org.sgx.yuigwt.yuigallery.accordion;

import com.google.gwt.core.client.JavaScriptObject;
/**
 * Describe the method, which will be used when expanding/collapsing the item. The value should be an object with at least one property ("method"): 
 * @author sg
 *
 */
public class AccordionItemContentHeight extends JavaScriptObject {
	protected AccordionItemContentHeight(){}

public static native final AccordionItemContentHeight create()/*-{
	return {}; 
}-*/;
/**
 * The method can be one of these: "auto", "fixed" and "stretch"
 * @return
 */
public native final String method() /*-{
return this.method; 
}-*/;

/**
 * The method can be one of these: "auto", "fixed" and "stretch"
 * @param val
 * @return this - for setter chaining
 */
public native final AccordionItemContentHeight method(String val) /*-{
this.method = val; 
return this; 
}-*/;

/**
 * Must be set only if method's value is "fixed"
 * @return
 */
public native final String height() /*-{
return this.height+""; 
}-*/;

/**Must be set only if method's value is "fixed"
 * @param val
 * @return this - for setter chaining
 */
public native final AccordionItemContentHeight height(String val) /*-{
this.height = val; 
return this; 
}-*/;
}
