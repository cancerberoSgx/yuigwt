package org.sgx.yuigwt.yui.yql.api.desc;

import org.sgx.yuigwt.yui.util.JsObject;
/**
 * 
 * @author sg
 *
 */
public class TableDesc extends JsObject {
protected TableDesc(){}
/**
 * 
 * @return
 */
public native final String hash() /*-{
return this.hash; 
}-*/;

/**
 * 
 * @param val
 * @return this - for setter chaining
 */
public native final TableDesc hash(String val) /*-{
this.hash = val; 
return this; 
}-*/;
/**
 * 
 * @return
 */
public native final String name() /*-{
return this.name; 
}-*/;

/**
 * 
 * @param val
 * @return this - for setter chaining
 */
public native final TableDesc name(String val) /*-{
this.name = val; 
return this; 
}-*/;

/**
 * 
 * @return
 */
public native final String security() /*-{
return this.security; 
}-*/;

/**
 * 
 * @param val
 * @return this - for setter chaining
 */
public native final TableDesc security(String val) /*-{
this.security = val; 
return this; 
}-*/;

/**
 * 
 * @return
 */
public native final TableDescMeta meta() /*-{
return this.meta; 
}-*/;

/**
 * 
 * @param val
 * @return this - for setter chaining
 */
public native final TableDesc meta(TableDescMeta val) /*-{
this.meta = val; 
return this; 
}-*/;
}
