package org.sgx.yuigwt.yui.yql.api.desc;

import org.sgx.yuigwt.yui.util.JsObject;

import com.google.gwt.core.client.JavaScriptObject;
import com.google.gwt.core.client.JsArray;
/**
 * 
 * @author sg
 *
 */
public class TableDescMeta extends JsObject {
protected TableDescMeta(){}
/**
 * 
 * @return
 */
public native final String author() /*-{
return this.author; 
}-*/;

/**
 * 
 * @param val
 * @return this - for setter chaining
 */
public native final TableDescMeta author(String val) /*-{
this.author = val; 
return this; 
}-*/;

/**
 * 
 * @return
 */
public native final String documentationURL() /*-{
return this.documentationURL; 
}-*/;

/**
 * 
 * @param val
 * @return this - for setter chaining
 */
public native final TableDescMeta documentationURL(String val) /*-{
this.documentationURL = val; 
return this; 
}-*/;

/**
 * 
 * @return
 */
public native final JsArray<SampleQuery> sampleQuery() /*-{
	if(typeof(this.sampleQuery)=="string")
		return [{"description": "", "content": this.sampleQuery}];
	else 
		return this.sampleQuery; 
}-*/;

///**
// * 
// * @return
// */
//public native final JavaScriptObject sampleQueryObj() /*-{
//return this.sampleQuery; 
//}-*/;

/**
 * 
 * @param val
 * @return this - for setter chaining
 */
public native final TableDescMeta sampleQuery(String val) /*-{
this.sampleQuery = val; 
return this; 
}-*/;
}
