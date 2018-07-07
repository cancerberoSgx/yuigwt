package org.sgx.yuigwt.yui.io;

import org.sgx.yuigwt.yui.collection.Queue;

import com.google.gwt.core.client.JavaScriptObject;

public class IOQueue extends Queue<IOTask>{
protected IOQueue(){}
public native final IOQueue start()/*-{
	this.start(); 
	return this; 
}-*/;
public native final IOQueue stop()/*-{
this.stop(); 
return this; 
}-*/;
}
