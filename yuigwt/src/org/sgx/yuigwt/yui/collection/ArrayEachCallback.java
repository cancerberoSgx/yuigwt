package org.sgx.yuigwt.yui.collection;

import com.google.gwt.core.client.JavaScriptObject;

public interface ArrayEachCallback<T> {
void call(JavaScriptObject item, int index, T array); 
}
