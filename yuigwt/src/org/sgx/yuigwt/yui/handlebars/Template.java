package org.sgx.yuigwt.yui.handlebars;

import org.sgx.yuigwt.yui.util.JsFunction;

import com.google.gwt.core.client.JavaScriptObject;

/**
 * I represent the js function returned by Y.Handlerbars.compile()
 * 
 * @author sg
 * 
 */
public class Template extends JsFunction {
	protected Template() {
	}

	/**
	 * apply this templaqte to some data object.
	 * 
	 * @return the result string of applying this temple using the given data as
	 *         template context.
	 */
	public native final String render(JavaScriptObject o) /*-{
		return this(o);
	}-*/;

}
