package org.sgx.yuigwt.yui.datasource;

import com.google.gwt.core.client.JavaScriptObject;

/**
 * java user handly utility.
 * @author sg
 *
 */
public abstract class DataSourceCallbackAdapter implements DataSourceCallback {
	@Override
	public void success(DataSourceEvent e) {		
	}

	@Override
	public void failure(DataSourceEvent e) {		
	}

	@Override
	public JavaScriptObject argument() {		
		return null;
	}
//void success(DataSourceEvent e); 
//void failure(DataSourceEvent e);
//JavaScriptObject argument(); 
}
