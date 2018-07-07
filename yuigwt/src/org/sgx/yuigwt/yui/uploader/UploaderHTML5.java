package org.sgx.yuigwt.yui.uploader;

import org.sgx.yuigwt.yui.node.Node;
import org.sgx.yuigwt.yui.uploader.queue.UploaderQueue;

import com.google.gwt.core.client.JsArrayString;

/**
 * provides a UI for file selection and multiple file upload capability using HTML5 XMLHTTPRequest Level 2 as a transport engine.
 * 
 * @see http://yuilibrary.com/yui/docs/api/classes/UploaderHTML5.html
 * @author sg
 * 
 */
public class UploaderHTML5 extends Uploader {
	protected UploaderHTML5() {
	}

	public static final String EVENT_DRAGENTER = "dragenter", EVENT_DRAGLEAVE = "dragleave",
			EVENT_DRAGOVER = "dragover", EVENT_DROP = "drop", EVENT_FILESELECT = "fileselect",
			EVENT_FILEUPLOADSTART = "fileuploadstart";

	/**
	 * Opens the File Selection dialog by simulating a click on the file input field.
	 * 
	 * @return
	 */
	public native final UploaderQueue openFileSelectDialog() /*-{
		this.openFileSelectDialog();
		return this;
	}-*/;

	// attributes
	/**
	 * The node that serves as the drop target for files.
	 * 
	 * Default: null
	 * 
	 * @return
	 */
	public native final Node dragAndDropArea() /*-{
		return this.get("dragAndDropArea");
	}-*/;

	/**
	 * The node that serves as the drop target for files.
	 * 
	 * Default: null
	 * 
	 * @param val
	 * @return this - for method chaining
	 */
	public native final UploaderHTML5 dragAndDropArea(Node val) /*-{
		this.set("dragAndDropArea", val);
		return this;
	}-*/;

	/**
	 * 
	 An array indicating what fileFilters should be applied to the file selection dialog. Each element in the array should be a string indicating the Media (MIME) type for the
	 * files that should be supported for selection. The Media type strings should be properly formatted or this parameter will be ignored. Examples of valid strings include:
	 * "audio/", "video/", "application/pdf", etc. More information on valid Media type strings is available here: http://www.iana.org/assignments/media-types/index.html
	 * 
	 * Default: []
	 * 
	 * @return
	 */
	public native final JsArrayString fileFilters() /*-{
		return this.get("fileFilters");
	}-*/;

	/**
	 * 
	 An array indicating what fileFilters should be applied to the file selection dialog. Each element in the array should be a string indicating the Media (MIME) type for the
	 * files that should be supported for selection. The Media type strings should be properly formatted or this parameter will be ignored. Examples of valid strings include:
	 * "audio/", "video/", "application/pdf", etc. More information on valid Media type strings is available here: http://www.iana.org/assignments/media-types/index.html
	 * 
	 * Default: []
	 * 
	 * @param val
	 * @return this - for method chaining
	 */
	public native final UploaderHTML5 fileFilters(JsArrayString val) /*-{
		this.set("fileFilters", val);
		return this;
	}-*/;

	/**
	 * 
	 A Boolean that specifies whether the file should be uploaded with the appropriate user credentials for the domain.
	 * 
	 * Default: true
	 * 
	 * @return
	 */
	public native final boolean withCredentials() /*-{
		return this.get("withCredentials");
	}-*/;

	/**
	 * 
	 A Boolean that specifies whether the file should be uploaded with the appropriate user credentials for the domain.
	 * 
	 * Default: true
	 * 
	 * @param val
	 * @return this - for method chaining
	 */
	public native final UploaderHTML5 withCredentials(boolean val) /*-{
		this.set("withCredentials", val);
		return this;
	}-*/;

}