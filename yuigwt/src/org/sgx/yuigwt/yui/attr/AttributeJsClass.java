package org.sgx.yuigwt.yui.attr;

import org.sgx.yuigwt.yui.event.EventTargetJsClass;

import com.google.gwt.core.client.JavaScriptObject;
/**
 * @author sg
 *
 */
public abstract class AttributeJsClass extends EventTargetJsClass {
	public static class Attrs extends JavaScriptObject {
		protected Attrs(){}
		public static final native Attrs create()/*-{
		return {}; 
		}-*/;
		/**
		 * 
		 * @return self for method chaining
		 */
		public native final Attrs add(String attrName, AttributeDefProp attrDef) /*-{
		this[attrName]=attrDef; 
		return this; 
		}-*/;
	}

	Attrs ATTRS;
	

	public Attrs getATTRS() {
		return ATTRS;
	}
	public void setATTRS(Attrs aTTRS) {
		ATTRS = aTTRS;
	} 
	
}
