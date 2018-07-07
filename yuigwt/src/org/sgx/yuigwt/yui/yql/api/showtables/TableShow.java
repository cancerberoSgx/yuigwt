package org.sgx.yuigwt.yui.yql.api.showtables;

import org.sgx.yuigwt.yui.util.JsObject;
/**
 * represents a single table. Note that in the returned plain json, I can be represented by a string. 
 * @author sebastian
 *
 */
public class TableShow extends JsObject {
	protected TableShow(){}
/**
 * 
 * @return
 */
public native final String content() /*-{
if(typeof(this)=="string")
	return this; 
else return this.content || null; 
}-*/;

/**
 * 
 * @return
 */
public native final String src() /*-{
	return ( (typeof(this)=="string") ? null : (this.src || null) );   
}-*/;

///**
// * 
// * @param val
// * @return this - for setter chaining
// */
//public native final TableShow src(String val) /*-{
//this.src = val; 
//return this; 
//}-*/;

///**
// * 
// * @param val
// * @return this - for setter chaining
// */
//public native final TableShow content(String val) /*-{
//this.content = val; 
//return this; 
//}-*/;

/**
 * 
 * @return
 */
public native final String security() /*-{
return this.security || null; 
}-*/;

///**
// * 
// * @param val
// * @return this - for setter chaining
// */
//public native final TableShow security(String val) /*-{
//this.security = val; 
//return this; 
//}-*/;
}
