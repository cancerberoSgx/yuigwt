package org.sgx.yuigwt.yui.yql.api.yql.storage.admin;

import org.sgx.yuigwt.yui.util.JsObject;

public class StorageAdminResult extends JsObject {
	protected StorageAdminResult() {
	}

	/**
	 * 
	 * 
	 * @return
	 */
	public native final StorageAdminResultInserted inserted() /*-{
		return this.inserted || null;
	}-*/;

	/**
	 * 
	 * 
	 * @param val
	 * @return this - for setter chaining
	 */
	public native final StorageAdminResult inserted(
			StorageAdminResultInserted val) /*-{
		this.inserted = val;
		return this;
	}-*/;

	/**
	 * 
	 * @return
	 */
	public native final StorageAdminResultResult result() /*-{
		return this.result;
	}-*/;

	/**
	 * 
	 * @param val
	 * @return this - for setter chaining
	 */
	public native final StorageAdminResult result(StorageAdminResultResult val) /*-{
		this.result = val;
		return this;
	}-*/;

}
