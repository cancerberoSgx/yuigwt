package org.sgx.yuigwt.yui.datasource;

import com.google.gwt.core.client.JavaScriptObject;

/**
 * interface to be inplemented for java users
 * @author sg
 *
 */
public interface DataSourceCallback {
void success(DataSourceEvent e); 
void failure(DataSourceEvent e);
JavaScriptObject argument(); 
}
