package org.sgx.yuigwt.yui.yui;

import com.google.gwt.core.client.JavaScriptObject;
/**
 * 
 * @author sg
 *
 */
public class Timer extends JavaScriptObject {
protected Timer(){}
/**
 * 
 * @return
 */
public native final void cancel() /*-{
	this.cancel(); 
}-*/;

}
