package org.sgx.yuigwt.yui.graphic;

import org.sgx.yuigwt.yui.util.JsObject;

import com.google.gwt.core.client.JsArrayString;

public class ShapeSet extends JsObject {
	protected ShapeSet() {
	}

	public native final Shape get(String id)/*-{
		return this[id];
	}-*/;

	public native final JsArrayString getAllIds()/*-{
		return @org.sgx.yuigwt.yui.util.JsUtil::props(Lcom/google/gwt/core/client/JavaScriptObject;)(this);
	}-*/;

	public native final JsArrayString getAllShapes()/*-{
		return @org.sgx.yuigwt.yui.util.JsUtil::valuesObj(Lcom/google/gwt/core/client/JavaScriptObject;)(this);
	}-*/;

}
