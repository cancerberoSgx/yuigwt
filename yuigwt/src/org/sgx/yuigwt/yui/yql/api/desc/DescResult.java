package org.sgx.yuigwt.yui.yql.api.desc;

import org.sgx.yuigwt.yui.util.JsObject;

public class DescResult extends JsObject {
	protected DescResult(){}
	
/**
 * 
 * @return
 */
public native final TableDesc table() /*-{
return this.table; 
}-*/;

/**
 * 
 * @param val
 * @return this - for setter chaining
 */
public native final DescResult table(TableDesc val) /*-{
this.table = val; 
return this; 
}-*/;

}
