package org.sgx.yuigwt.yui.uploader.queue;

import org.sgx.yuigwt.yui.base.Base;
import org.sgx.yuigwt.yui.uploader.file.File;

import com.google.gwt.core.client.JavaScriptObject;
import com.google.gwt.core.client.JsArray;

/**
 * This class manages a queue of files to be uploaded to the server.
 * 
 * @see http://yuilibrary.com/yui/docs/api/classes/Uploader.Queue.html
 * 
 * @author sg
 * 
 */
public class UploaderQueue extends Base {
	protected UploaderQueue() {
	}

	// methods

	/**
	 * Add a new file to the bottom of the queue (the upload will be launched
	 * after all the other queued files are uploaded.)
	 * 
	 * @param file
	 *            The file to add to the bottom of the queue.
	 * @return
	 */
	public native final UploaderQueue addToQueueBottom(File file) /*-{
		this.addToQueueBottom(file);
		return this;
	}-*/;

	/**
	 * Add a new file to the top of the queue (the upload will be launched as
	 * soon as the current number of uploading files drops below the maximum
	 * permissible value).
	 * 
	 * @param file
	 *            The file to add to the top of the queue.
	 * @return
	 */
	public native final UploaderQueue addToQueueTop(File file) /*-{
		this.addToQueueTop(file);
		return this;
	}-*/;

	/**
	 * Cancels a specific file's upload. If no argument is passed, all ongoing
	 * uploads are cancelled and the upload process is stopped.
	 * 
	 * @param file
	 *            An optional parameter - the file whose upload should be
	 *            cancelled.
	 * @return
	 */
	public native final UploaderQueue cancelUpload(File file) /*-{
		this.cancelUpload(file);
		return this;
	}-*/;

	/**
	 * Cancels a specific file's upload. If no argument is passed, all ongoing
	 * uploads are cancelled and the upload process is stopped.
	 * 
	 * @return
	 */
	public native final UploaderQueue cancelUpload() /*-{
		this.cancelUpload();
		return this;
	}-*/;

	/**
	 * If a particular file is stuck in an ongoing upload without any progress
	 * events, this method allows to force its reupload by cancelling its upload
	 * and immediately relaunching it.
	 * 
	 * @param file
	 *            The file to force reupload on.
	 * @return
	 */
	public native final UploaderQueue forceReupload(File file) /*-{
		this.forceReupload(file);
		return this;
	}-*/;

	/**
	 * Restarts a paused upload process.
	 * 
	 * @param file
	 *            The file to force reupload on.
	 * @return
	 */
	public native final UploaderQueue pauseUpload() /*-{
		this.pauseUpload();
		return this;
	}-*/;

	/**
	 * Restarts a paused upload process.
	 * 
	 * @param file
	 *            The file to force reupload on.
	 * @return
	 */
	public native final UploaderQueue restartUpload() /*-{
		this.restartUpload();
		return this;
	}-*/;

	/**
	 * Starts uploading the queued up file list.
	 * 
	 * @return
	 */
	public native final UploaderQueue startUpload() /*-{
		this.startUpload();
		return this;
	}-*/;

	// properties

	/**
	 * The total number of bytes in the queue.
	 * 
	 * @return
	 */
	public native final int bytesTotal() /*-{
		return this.bytesTotal;
	}-*/;

	/**
	 * The total number of bytes in the queue.
	 * 
	 * @param val
	 * @return this - for setter chaining
	 */
	public native final UploaderQueue bytesTotal(int val) /*-{
		this.bytesTotal = val;
		return this;
	}-*/;

	/**
	 * The total number of bytes that has been uploaded.
	 * 
	 * @return
	 */
	public native final int bytesUploaded() /*-{
		return this.bytesUploaded;
	}-*/;

	/**
	 * The total number of bytes that has been uploaded.
	 * 
	 * @param val
	 * @return this - for setter chaining
	 */
	public native final UploaderQueue bytesUploaded(int val) /*-{
		this.bytesUploaded = val;
		return this;
	}-*/;

	/**
	 * 
	 The action to take in case of error. The valid values for this attribute
	 * are: Y.Uploader.Queue.CONTINUE (the upload process should continue on
	 * other files, ignoring the error), Y.Uploader.Queue.STOP (the upload
	 * process should stop completely), Y.Uploader.Queue.RESTART_ASAP (the
	 * upload should restart immediately on the errored out file and continue as
	 * planned), or Y.Uploader.Queue.RESTART_AFTER (the upload of the errored
	 * out file should restart after all other files have uploaded)
	 * 
	 * Default: Y.Uploader.Queue.CONTINUE
	 * 
	 * @return
	 */
	public native final String errorAction() /*-{
		return this.errorAction;
	}-*/;

	/**
	 * 
	 The action to take in case of error. The valid values for this attribute
	 * are: Y.Uploader.Queue.CONTINUE (the upload process should continue on
	 * other files, ignoring the error), Y.Uploader.Queue.STOP (the upload
	 * process should stop completely), Y.Uploader.Queue.RESTART_ASAP (the
	 * upload should restart immediately on the errored out file and continue as
	 * planned), or Y.Uploader.Queue.RESTART_AFTER (the upload of the errored
	 * out file should restart after all other files have uploaded)
	 * 
	 * Default: Y.Uploader.Queue.CONTINUE
	 * 
	 * @param val
	 * @return this - for setter chaining
	 */
	public native final UploaderQueue errorAction(String val) /*-{
		this.errorAction = val;
		return this;
	}-*/;

	/**
	 * The queue file list. This file list should only be modified before the
	 * upload has been started; modifying it after starting the upload has no
	 * effect, and addToQueueTop or addToQueueBottom methods should be used
	 * instead.
	 * 
	 * @return
	 */
	public native final JsArray fileList() /*-{
		return this.fileList;
	}-*/;

	/**
	 * The queue file list. This file list should only be modified before the
	 * upload has been started; modifying it after starting the upload has no
	 * effect, and addToQueueTop or addToQueueBottom methods should be used
	 * instead.
	 * 
	 * @param val
	 * @return this - for setter chaining
	 */
	public native final UploaderQueue fileList(JsArray val) /*-{
		this.fileList = val;
		return this;
	}-*/;

	/**
	 * 
	 Maximum number of simultaneous uploads; must be in the range between 1
	 * and 5. The value of 2 is default. It is recommended that this value does
	 * not exceed 3.
	 * 
	 * Default: 2
	 * 
	 * @return
	 */
	public native final int simUploads() /*-{
		return this.simUploads;
	}-*/;

	/**
	 * 
	 Maximum number of simultaneous uploads; must be in the range between 1
	 * and 5. The value of 2 is default. It is recommended that this value does
	 * not exceed 3.
	 * 
	 * Default: 2
	 * 
	 * @param val
	 * @return this - for setter chaining
	 */
	public native final UploaderQueue simUploads(int val) /*-{
		this.simUploads = val;
		return this;
	}-*/;

	// attributes
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
		return this.get("fileFieldName");
	}-*/;

	/**
	 * 
	 A String specifying what should be the POST field name for the file
	 * content in the upload request.
	 * 
	 * Default: Filedata
	 * 
	 * @param val
	 * @return this - for method chaining
	 */
	public native final UploaderQueue fileFieldName(String val) /*-{
		this.set("fileFieldName", val);
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
	public native final UploaderQueue perFileParameters(JavaScriptObject val) /*-{
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
		return this.get("retryCount");
	}-*/;

	/**
	 * 
	 The number of times to try re-uploading a file that failed to upload
	 * before cancelling its upload.
	 * 
	 * Default: 3
	 * 
	 * @param val
	 * @return this - for method chaining
	 */
	public native final UploaderQueue retryCount(int val) /*-{
		this.set("retryCount", val);
		return this;
	}-*/;

	/**
	 * 
	 Additional HTTP headers that should be included in the upload request.
	 * Due to Flash Player security restrictions, this attribute is only honored
	 * in the HTML5 Uploader.
	 * 
	 * Default: {}
	 * 
	 * @return
	 */
	public native final JavaScriptObject uploadHeaders() /*-{
		return this.get("uploadHeaders");
	}-*/;

	/**
	 * 
	 Additional HTTP headers that should be included in the upload request.
	 * Due to Flash Player security restrictions, this attribute is only honored
	 * in the HTML5 Uploader.
	 * 
	 * Default: {}
	 * 
	 * @param val
	 * @return this - for method chaining
	 */
	public native final UploaderQueue uploadHeaders(JavaScriptObject val) /*-{
		this.set("uploadHeaders", val);
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
	public native final String uploadURL() /*-{
		return this.get("uploadURL");
	}-*/;

	/**
	 * 
	 The URL to POST the file upload requests to.
	 * 
	 * Default: ""
	 * 
	 * @param val
	 * @return this - for method chaining
	 */
	public native final UploaderQueue uploadURL(String val) /*-{
		this.set("uploadURL", val);
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
		return this.get("withCredentials");
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
	 * @return this - for method chaining
	 */
	public native final UploaderQueue withCredentials(boolean val) /*-{
		this.set("withCredentials", val);
		return this;
	}-*/;
}
