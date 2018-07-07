package org.sgx.yuigwt.yui.datasource;

import com.google.gwt.core.client.JavaScriptObject;

/**
 * java user handly utility.
 * @author sg
 *
 */
public abstract class DataSourceCallbackAdapter implements DataSourceCallback {
	
	public void success(DataSourceEvent e) {		
	}

	
	public void failure(DataSourceEvent e) {		
	}

	
	public JavaScriptObject argument() {		
		return null;
	}
//void success(DataSourceEvent e); 
//void failure(DataSourceEvent e);
//JavaScriptObject argument(); 
}
