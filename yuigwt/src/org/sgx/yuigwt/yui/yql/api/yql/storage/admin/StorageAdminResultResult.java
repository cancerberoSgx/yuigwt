package org.sgx.yuigwt.yui.yql.api.yql.storage.admin;

import org.sgx.yuigwt.yui.util.JsObject;

public class StorageAdminResultResult extends JsObject {
	protected StorageAdminResultResult() {
	}

	/**
	 * 
	 * 
	 * @return
	 */
	public native final String value() /*-{
		return this.value||null;
	}-*/;

	/**
	 * 
	 * 
	 * @param val
	 * @return this - for setter chaining
	 */
	public native final StorageAdminResultResult value(String val) /*-{
		this.value = val;
		return this;
	}-*/;

}
