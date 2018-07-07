package org.sgx.yuigwt.jyui;

import com.google.gwt.core.client.JavaScriptObject;

/**
 * @author sg
 *
 */
public abstract class AbstractYObject implements YObject {
	public AbstractYObject() {
		super(); 
	}
	protected JavaScriptObject _wrapped; 
	
	
	public JavaScriptObject getWrapped() {
		return _wrapped; 
	}
	public void setWrapped(JavaScriptObject _wrapped) {
		this._wrapped = _wrapped;
	}
	
}
