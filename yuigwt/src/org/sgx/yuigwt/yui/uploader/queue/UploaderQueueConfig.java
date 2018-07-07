package org.sgx.yuigwt.yui.uploader.queue;

import org.sgx.yuigwt.yui.base.BaseConfig;

import com.google.gwt.core.client.JavaScriptObject;

/**
 * @see http://yuilibrary.com/yui/docs/api/classes/Uploader.Queue.html
 * @author sg
 * 
 */
public class UploaderQueueConfig extends BaseConfig {
	protected UploaderQueueConfig() {
	}

	public static final native UploaderQueueConfig create()/*-{
		return {};
	}-*/;

	/**
	 * 
	 A String specifying what should be the POST field name for the file
	 * content in the upload request.
	 * 
	 * Default: Filedata
	 * 
	 * @return
	 */
	public native final String fileFieldName() /*-{
		return this.fileFieldName;
	}-*/;

	/**
	 * 
	 A String specifying what should be the POST field name for the file
	 * content in the upload request.
	 * 
	 * Default: Filedata
	 * 
	 * @param val
	 * @return this - for setter chaining
	 */
	public native final UploaderQueueConfig fileFieldName(String val) /*-{
		this.fileFieldName = val;
		return this;
	}-*/;

	/**
	 * 
	 An object, keyed by fileId, containing sets of key-value pairs that
	 * should be passed as POST variables along with each corresponding file.
	 * 
	 * Default: {}
	 * 
	 * @return
	 */
	public native final JavaScriptObject perFileParameters() /*-{
		return this.perFileParameters;
	}-*/;

	/**
	 * 
	 An object, keyed by fileId, containing sets of key-value pairs that
	 * should be passed as POST variables along with each corresponding file.
	 * 
	 * Default: {}
	 * 
	 * @param val
	 * @return this - for setter chaining
	 */
	public native final UploaderQueueConfig perFileParameters(JavaScriptObject val) /*-{
		this.perFileParameters = val;
		return this;
	}-*/;

	/**
	 * 
	 The number of times to try re-uploading a file that failed to upload
	 * before cancelling its upload.
	 * 
	 * Default: 3
	 * 
	 * @return
	 */
	public native final int retryCount() /*-{
		return this.retryCount;
	}-*/;

	/**
	 * 
	 The number of times to try re-uploading a file that failed to upload
	 * before cancelling its upload.
	 * 
	 * Default: 3
	 * 
	 * @param val
	 * @return this - for setter chaining
	 */
	public native final UploaderQueueConfig retryCount(int val) /*-{
		this.retryCount = val;
		return this;
	}-*/;

	/**
	 * 
	 The URL to POST the file upload requests to.
	 * 
	 * Default: ""
	 * 
	 * @return
	 */
	public native final JavaScriptObject uploadHeaders() /*-{
		return this.uploadHeaders;
	}-*/;

	/**
	 * 
	 The URL to POST the file upload requests to.
	 * 
	 * Default: ""
	 * 
	 * @param val
	 * @return this - for setter chaining
	 */
	public native final UploaderQueueConfig uploadHeaders(JavaScriptObject val) /*-{
		this.uploadHeaders = val;
		return this;
	}-*/;

	/**
	 * 
	 A Boolean that specifies whether the file should be uploaded with the
	 * appropriate user credentials for the domain. Due to Flash Player security
	 * restrictions, this attribute is only honored in the HTML5 Uploader.
	 * 
	 * Default: true
	 * 
	 * @return
	 */
	public native final boolean withCredentials() /*-{
		return this.withCredentials;
	}-*/;

	/**
	 * 
	 A Boolean that specifies whether the file should be uploaded with the
	 * appropriate user credentials for the domain. Due to Flash Player security
	 * restrictions, this attribute is only honored in the HTML5 Uploader.
	 * 
	 * Default: true
	 * 
	 * @param val
	 * @return this - for setter chaining
	 */
	public native final UploaderQueueConfig withCredentials(boolean val) /*-{
		this.withCredentials = val;
		return this;
	}-*/;

}
