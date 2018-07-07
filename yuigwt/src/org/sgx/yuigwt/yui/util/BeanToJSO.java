package org.sgx.yuigwt.yui.util;

import com.google.gwt.core.client.JavaScriptObject;

public interface BeanToJSO {
JavaScriptObject toJSO(); 
void fromJSO(JavaScriptObject jso);
}
