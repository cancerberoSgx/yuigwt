package org.sgx.yuigwt.yui.datasource;

import org.sgx.yuigwt.yui.base.BaseConfig;
import org.sgx.yuigwt.yui.util.JsFunction;

import com.google.gwt.core.client.JavaScriptObject;
import com.google.gwt.core.client.JsArrayString;
/**
 * contains the api of A>ll Datasources implementations. 
 * 
 * @see http://yuilibrary.com/yui/docs/api/classes/DataSource.Local.html
 * @author sg
 *
 */
public class DataSourceConfig extends BaseConfig {
protected DataSourceConfig(){}
public static native final DataSourceConfig create()/*-{
return {}; 
}-*/;

/**
 * 
 * @return
 */
public native final String sourceString() /*-{
return this.source; 
}-*/;

/**
 * 
 * @param val
 * @return this - for setter chaining
 */
public native final DataSourceConfig source(String val) /*-{
this.source = val; 
return this; 
}-*/;
/**
 * 
 * @param val
 * @return this - for setter chaining
 */
public native final DataSourceConfig source(JavaScriptObject val) /*-{
this.source = val; 
return this; 
}-*/;
/**
 * 
 * @param val
 * @return this - for setter chaining
 */
public native final DataSourceConfig source(JsArrayString val) /*-{
this.source = val; 
return this; 
}-*/;
/**
 * 
 * @param val
 * @return this - for setter chaining
 */
public native final DataSourceConfig source(String[] val) /*-{
this.source = @org.sgx.yuigwt.yui.util.JsUtil::toJsArrayString([Ljava/lang/String;)(val); 
return this; 
}-*/;

/**
 * 
 * @return
 */
public native final JsFunction sourceFunction() /*-{
return this.source; 
}-*/;

/**
 * 
 * @param val
 * @return this - for setter chaining
 */
public native final DataSourceConfig source(JsFunction val) /*-{
this.source = val; 
return this; 
}-*/;
}
