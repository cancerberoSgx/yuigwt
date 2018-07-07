package org.sgx.yuigwt.yui.router;

import org.sgx.yuigwt.yui.util.JsObject;

/**
 * Request object containing methods and information that relate to responding to a request
 * 
 * @author sg
 * 
 */
public class RouteResponse extends JsObject {
	protected RouteResponse() {
	}

	/**
	 * Reference to the request object.
	 * 
	 * @return
	 */
	public native final RouteRequest req() /*-{
		return this.req;
	}-*/;

	/**
	 * Reference to the request object.
	 * 
	 * @param val
	 * @return this - for setter chaining
	 */
	public native final RouteResponse req(RouteRequest val) /*-{
		this.req = val;
		return this;
	}-*/;
}
