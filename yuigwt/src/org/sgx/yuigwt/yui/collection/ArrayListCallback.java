package org.sgx.yuigwt.yui.collection;

import com.google.gwt.core.client.JavaScriptObject;

public interface ArrayListCallback<T extends JavaScriptObject> {
boolean call(JavaScriptObject item, int index); 
}
