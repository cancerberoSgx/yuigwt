package org.sgx.yuigwt.yui.router;

import org.sgx.yuigwt.yui.base.BaseClass;

/**
 * @see http://yuilibrary.com/yui/docs/router/#to-dispatch-or-not-to-dispatch
 * @see http://yuilibrary.com/yui/docs/api/classes/Router.html
 * @author sg
 * 
 */
public class RouterClass extends BaseClass {
	protected RouterClass() {
	}

	/**
	 * Dispatches to the first route handler that matches the specified path for all active router instances.
	 * 
	 * This provides a mechanism to cause all active router instances to dispatch to their route handlers without needing to change the URL or fire the history:change or hashchange
	 * event.
	 * 
	 * @return self for method chaining
	 */
	public native final Router dispatch() /*-{
		this.dispatch();
		return this;
	}-*/;
}
