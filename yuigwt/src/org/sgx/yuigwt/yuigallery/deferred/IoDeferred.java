package org.sgx.yuigwt.yuigallery.deferred;

import com.google.gwt.core.client.JavaScriptObject;

public class IoDeferred extends JavaScriptObject {
protected IoDeferred(){}
public native final Promise get(String url)/*-{
	return this.get(url); 
}-*/;
public native final Promise getJSON(String url)/*-{
return this.getJSON(url); 
}-*/;
}
