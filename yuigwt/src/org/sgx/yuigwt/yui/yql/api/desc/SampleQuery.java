package org.sgx.yuigwt.yui.yql.api.desc;

import org.sgx.yuigwt.yui.util.JsObject;

public class SampleQuery extends JsObject{
protected SampleQuery(){}

/**
 * 
 * @return
 */
public native final String description() /*-{
return this.description; 
}-*/;

/**
 * 
 * @param val
 * @return this - for setter chaining
 */
public native final SampleQuery description(String val) /*-{
this.description = val; 
return this; 
}-*/;

/**
 * 
 * @return
 */
public native final String content() /*-{
return this.content; 
}-*/;

/**
 * 
 * @param val
 * @return this - for setter chaining
 */
public native final SampleQuery content(String val) /*-{
this.content = val; 
return this; 
}-*/;
}
