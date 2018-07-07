package org.sgx.yuigwt.yui.imageloader;

import org.sgx.yuigwt.yui.base.BaseConfig;

public class ImgLoadGroupConfig extends BaseConfig {
	protected ImgLoadGroupConfig() {
	}

	public static final native ImgLoadGroupConfig create()/*-{
		return {};
	}-*/;

	/**
	 * JsObject name that will identify images belonging to the group. This
	 * class name will be removed from each element in order to fetch images.
	 * This class should have, in its CSS style definition,
	 * "background:none !important;".
	 * 
	 * @return
	 */
	public native final String className() /*-{
		return this.className;
	}-*/;

	/**
	 * JsObject name that will identify images belonging to the group. This
	 * class name will be removed from each element in order to fetch images.
	 * This class should have, in its CSS style definition,
	 * "background:none !important;".
	 * 
	 * @param val
	 * @return this - for setter chaining
	 */
	public native final ImgLoadGroupConfig className(String val) /*-{
		this.className = val;
		return this;
	}-*/;

	/**
	 * 
	 * @return
	 */
	public native final String classNameAction() /*-{
		return this.classNameAction;
	}-*/;

	/**
	 * 
	 * @param val
	 * @return this - for setter chaining
	 */
	public native final ImgLoadGroupConfig classNameAction(String val) /*-{
		this.classNameAction = val;
		return this;
	}-*/;

	/**
	 * Distance below the fold for which images are loaded. Images are not
	 * loaded until they are at most this distance away from (or above) the
	 * fold. This check is performed at page load (domready) and after any
	 * window scroll or window resize event (until all images are loaded).
	 * 
	 * @return
	 */
	public native final double foldDistance() /*-{
		return this.foldDistance;
	}-*/;

	/**
	 * Distance below the fold for which images are loaded. Images are not
	 * loaded until they are at most this distance away from (or above) the
	 * fold. This check is performed at page load (domready) and after any
	 * window scroll or window resize event (until all images are loaded).
	 * 
	 * @param val
	 * @return this - for setter chaining
	 */
	public native final ImgLoadGroupConfig foldDistance(double val) /*-{
		this.foldDistance = val;
		return this;
	}-*/;

	/**
	 * Name for the group. Only used to identify the group in logging
	 * statements.
	 * 
	 * @return
	 */
	public native final String name() /*-{
		return this.name;
	}-*/;

	/**
	 * Name for the group. Only used to identify the group in logging
	 * statements.
	 * 
	 * @param val
	 * @return this - for setter chaining
	 */
	public native final ImgLoadGroupConfig name(String val) /*-{
		this.name = val;
		return this;
	}-*/;

	/**
	 * Time limit, in seconds, after which images are fetched regardless of
	 * trigger events.
	 * 
	 * @return
	 */
	public native final int timeLimit() /*-{
		return this.timeLimit;
	}-*/;

	/**
	 * Time limit, in seconds, after which images are fetched regardless of
	 * trigger events.
	 * 
	 * @param val
	 * @return this - for setter chaining
	 */
	public native final ImgLoadGroupConfig timeLimit(int val) /*-{
		this.timeLimit = val;
		return this;
	}-*/;
}
