package org.sgx.yuigwt.yui.yql.api;

import org.sgx.yuigwt.yui.util.JsObject;
import org.sgx.yuigwt.yui.yql.api.yui.gallery.all.YuiGalleryAllJson;
import org.sgx.yuigwt.yui.yql.api.yui.gallery.user.YuiGalleryUserJson;

/**
 * may YQL query result object, for example yui.gallery.* tables, will return a
 * toor "json" object that this is. Each table should extend this for adding
 * concrete table methods.
 * 
 * @author sg
 * 
 */
public class YQLJson extends JsObject {
	protected YQLJson() {
	}

	/**
	 * 
	 * @return
	 */
	public native final String type() /*-{
		return this.type;
	}-*/;

	/**
	 * 
	 * @param val
	 * @return this - for setter chaining
	 */
	public native final YuiGalleryAllJson type(String val) /*-{
		this.type = val;
		return this;
	}-*/;

	/**
	 * an integer
	 * 
	 * @return
	 */
	public native final String count() /*-{
		return this.count;
	}-*/;

	/**
	 * an integer
	 * 
	 * @param val
	 * @return this - for setter chaining
	 */
	public native final YuiGalleryAllJson count(String val) /*-{
		this.count = val;
		return this;
	}-*/;

	/**
	 * 
	 * @return
	 */
	public native final String query() /*-{
		return this.query;
	}-*/;

	/**
	 * 
	 * @param val
	 * @return this - for setter chaining
	 */
	public native final YuiGalleryUserJson query(String val) /*-{
		this.query = val;
		return this;
	}-*/;
}
