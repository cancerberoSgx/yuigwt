package org.sgx.yuigwt.yui.uploader.file;

import org.sgx.yuigwt.yui.base.Base;

import com.google.gwt.core.client.JavaScriptObject;

/**
 * Y.File serves as an alias for either Y.FileFlash or Y.FileHTML5, depending on
 * the feature set available in a specific browser.
 * 
 * @see http://yuilibrary.com/yui/docs/api/classes/File.html
 * @author sg
 * 
 */
public class File extends Base {
	protected File() {
	}

	/**
	 * Cancels the upload of a specific file, if currently in progress.
	 * 
	 * @return
	 */
	public native final FileHTML5 cancelUpload()/*-{
		this.cancelUpload();
		return this;
	}-*/;

	/**
	 * Starts the upload of a specific file.
	 * 
	 * @param url
	 *            The URL to upload the file to.
	 * @param parameters
	 *            (optional) A set of key-value pairs to send as variables along
	 *            with the file upload HTTP request.
	 * @param fileFieldName
	 *            (optional) The name of the POST variable that should contain
	 *            the uploaded file ('Filedata' by default)
	 * @return
	 */
	public native final FileHTML5 startUpload(String url, JavaScriptObject parameters, String fileFieldName)/*-{
		this.startUpload(url, parameters, fileFieldName);
		return this;
	}-*/;

	/**
	 * Starts the upload of a specific file.
	 * 
	 * @param url
	 *            The URL to upload the file to.
	 * @param parameters
	 *            (optional) A set of key-value pairs to send as variables along
	 *            with the file upload HTTP request.
	 * @return
	 */
	public native final FileHTML5 startUpload(String url, JavaScriptObject parameters)/*-{
		this.startUpload(url, parameters);
		return this;
	}-*/;

	/**
	 * Starts the upload of a specific file.
	 * 
	 * @param url
	 *            The URL to upload the file to.
	 * @return
	 */
	public native final FileHTML5 startUpload(String url)/*-{
		this.startUpload(url);
		return this;
	}-*/;

}
