package org.sgx.yuigwt.yui.uploader;

import com.google.gwt.core.client.JavaScriptObject;
import com.google.gwt.core.client.JsArray;

/**
 * provides a UI for file selection and multiple file upload capability using Flash as a transport engine.
 * 
 * @see http://yuilibrary.com/yui/docs/api/classes/UploaderFlash.html
 * @author sg
 */
public class UploaderFlash extends Uploader {
	protected UploaderFlash() {
	}

	public static class FileFilter extends JavaScriptObject {
		protected FileFilter() {
		}

		public static final native FileFilter create()/*-{
			return {};
		}-*/;

		public static final String EVENT_MOUSEDOWN = "mousedown", EVENT_MOUSEENTER = "mouseenter",
				EVENT_MOUSELEAVE = "mouseleave", EVENT_MOUSEUP = "mouseup";

		/**
		 * 
		 * @return
		 */
		public native final String description() /*-{
			return this.description;
		}-*/;

		/**
		 * 
		 * @param val
		 * @return this - for setter chaining
		 */
		public native final UploaderFlash.FileFilter description(String val) /*-{
			this.description = val;
			return this;
		}-*/;

		/**
		 * 
		 * @return
		 */
		public native final String extensions() /*-{
			return this.extensions;
		}-*/;

		/**
		 * 
		 * @param val
		 * @return this - for setter chaining
		 */
		public native final UploaderFlash.FileFilter extensions(String val) /*-{
			this.extensions = val;
			return this;
		}-*/;
	}

	/**
	 * 
	 An array indicating what fileFilters should be applied to the file selection dialog. Each element in the array should be an object with the following key-value pairs: {
	 * description : String extensions: String of the form ".ext1;.ext2;*.ext3;..." }
	 * 
	 * Default: []
	 * 
	 * @return
	 */
	public native final JsArray<FileFilter> fileFilters() /*-{
		return this.get("fileFilters");
	}-*/;

	/**
	 * 
	 An array indicating what fileFilters should be applied to the file selection dialog. Each element in the array should be an object with the following key-value pairs: {
	 * description : String extensions: String of the form ".ext1;.ext2;*.ext3;..." }
	 * 
	 * Default: []
	 * 
	 * @param val
	 * @return this - for method chaining
	 */
	public native final UploaderFlash fileFilters(JsArray<FileFilter> val) /*-{
		this.set("fileFilters", val);
		return this;
	}-*/;

	/**
	 * 
	 The URL to the SWF file of the flash uploader. A copy local to the server that hosts the page on which the uploader appears is recommended.
	 * 
	 * Default: "CDN Prefix + uploader/assets/flashuploader.swf" with a random GET parameter for IE (to prevent buggy behavior when the SWF is cached).
	 * 
	 * @return
	 */
	public native final String swfURL() /*-{
		return this.get("swfURL");
	}-*/;

	/**
	 * 
	 The URL to the SWF file of the flash uploader. A copy local to the server that hosts the page on which the uploader appears is recommended.
	 * 
	 * Default: "CDN Prefix + uploader/assets/flashuploader.swf" with a random GET parameter for IE (to prevent buggy behavior when the SWF is cached).
	 * 
	 * @param val
	 * @return this - for method chaining
	 */
	public native final UploaderFlash swfURL(String val) /*-{
		this.set("swfURL", val);
		return this;
	}-*/;

	/**
	 * 
	 <p>
	 * The id's or Node references of the DOM elements that precede and follow the Select Files button in the tab order. Specifying these allows keyboard navigation to and from the
	 * Flash player layer of the uploader. The two keys corresponding to the DOM elements are:
	 * </p>
	 * 
	 * <p>
	 * from: the id or the Node reference corresponding to the DOM element that precedes the Select Files button in the tab order.
	 * </p>
	 * <p>
	 * to: the id or the Node reference corresponding to the DOM element that follows the Select Files button in the tab order.
	 * </p>
	 * 
	 * Default: null
	 * 
	 * @return
	 */
	public native final JavaScriptObject tabElements() /*-{
		return this.get("tabElements");
	}-*/;

	/**
	 * 
	 <p>
	 * The id's or Node references of the DOM elements that precede and follow the Select Files button in the tab order. Specifying these allows keyboard navigation to and from the
	 * Flash player layer of the uploader. The two keys corresponding to the DOM elements are:
	 * </p>
	 * 
	 * <p>
	 * from: the id or the Node reference corresponding to the DOM element that precedes the Select Files button in the tab order.
	 * </p>
	 * <p>
	 * to: the id or the Node reference corresponding to the DOM element that follows the Select Files button in the tab order.
	 * </p>
	 * 
	 * Default: null
	 * 
	 * @param val
	 * @return this - for method chaining
	 */
	public native final UploaderFlash tabElements(JavaScriptObject val) /*-{
		this.set("tabElements", val);
		return this;
	}-*/;

}
