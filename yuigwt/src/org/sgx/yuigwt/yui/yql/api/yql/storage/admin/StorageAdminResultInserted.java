package org.sgx.yuigwt.yui.yql.api.yql.storage.admin;

import org.sgx.yuigwt.yui.util.JsObject;

public class StorageAdminResultInserted extends JsObject {
	protected StorageAdminResultInserted() {
	}

	/**
	 * the execute url represenging the record
	 * 
	 * @return
	 */
	public native final String execute() /*-{
		return this.execute;
	}-*/;

	/**
	 * the execute url represenging the record
	 * 
	 * @param val
	 * @return this - for setter chaining
	 */
	public native final StorageAdminResultInserted execute(String val) /*-{
		this.execute = val;
		return this;
	}-*/;

	/**
	 * the select url representing the record
	 * 
	 * @return
	 */
	public native final String select() /*-{
		return this.select;
	}-*/;

	/**
	 * the select url representing the record
	 * 
	 * @param val
	 * @return this - for setter chaining
	 */
	public native final StorageAdminResultInserted select(String val) /*-{
		this.select = val;
		return this;
	}-*/;

	/**
	 * the update url representing the record
	 * 
	 * @return
	 */
	public native final String update() /*-{
		return this.update;
	}-*/;

	/**
	 * the update url representing the record
	 * 
	 * @param val
	 * @return this - for setter chaining
	 */
	public native final StorageAdminResultInserted update(String val) /*-{
		this.update = val;
		return this;
	}-*/;
}
