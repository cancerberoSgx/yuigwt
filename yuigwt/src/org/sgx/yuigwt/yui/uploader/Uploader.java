package org.sgx.yuigwt.yui.uploader;

import org.sgx.yuigwt.yui.node.Node;
import org.sgx.yuigwt.yui.uploader.file.File;
import org.sgx.yuigwt.yui.uploader.queue.UploaderQueue;
import org.sgx.yuigwt.yui.widget.Widget;

import com.google.gwt.core.client.JavaScriptObject;
import com.google.gwt.core.client.JsArray;

/**
 * <p>
 * Provides UI for selecting multiple files and functionality for uploading
 * multiple files to the server with support for either html5 or Flash transport
 * mechanisms, automatic queue management, upload progress monitoring, and error
 * events.
 * </p>
 * 
 * 
 * <p>
 * <strong>The YUI Uploader leverages HTML5+XMLHttpRequest 2 or Flash to provide
 * file upload functionality beyond the basic HTTP
 * <code>&lt;input type='file'&gt;</code> capabilities.</strong> Specifically,
 * the Uploader allows for:
 * </p>
 * 
 * <ol>
 * 
 * <li><strong>Multiple file selection</strong> in a single "Open File" dialog.</li>
 * 
 * <li><strong>Dragging-and-dropping files</strong> into the browser (when used
 * in HTML5 mode).</li>
 * 
 * <li><strong>Automatic upload queue management</strong> with fine-grained
 * control.</li>
 * 
 * <li><strong>Upload progress tracking</strong>, both on a per-file and a
 * per-queue basis.</li>
 * 
 * <li><strong>A range of available file metadata</strong>: filename, size, date
 * created, and date modified.</li>
 * 
 * <li>A set of <strong>events dispatched on various aspects of the file upload
 * process</strong>: file selection, upload progress, upload completion, data
 * return, and upload errors.</li>
 * 
 * <li>Inclusion of <strong>additional data in the file upload POST
 * request</strong>, on a file-by-file basis.</li>
 * 
 * <li><strong>Keyboard accessibility</strong> both in HTML5 and in Flash modes.
 * </li>
 * 
 * </ol>
 * 
 * @see http://yuilibrary.com/yui/docs/api/classes/Uploader.html
 * @see http://yuilibrary.com/yui/docs/uploader/
 * @author sg
 * 
 */
public class Uploader extends Widget {
	protected Uploader() {
	}

	public static final String EVENT_ALLUPLOADSCOMPLETE = "alluploadscomplete", 
			EVENT_FILSESELECT="fileselect", EVENT_FILEUPLOADSTART="fileuploadstart", 
			EVENT_TOTALUPLOADPROGRESS="totaluploadprogress", 
			EVENT_UPLOADCOMPLETE="uploadcomplete", EVENT_UPLOADERROR="uploaderror", 
			EVENT_UPLOADPROGRESS="uploadprogress", EVENT_UPLOADSTART="uploadstart";   
	/**
	 * Starts the upload of a specific file.
	 * 
	 * @param file
	 *            Reference to the instance of the file to be uploaded.
	 * @param url
	 *            The URL to upload the file to.
	 * @param postVars
	 *            (optional) A set of key-value pairs to send as variables along
	 *            with the file upload HTTP request. If not specified, the
	 *            values from the attribute postVarsPerFile are used instead.
	 * @return
	 */
	public native final Uploader upload(File file, String url, JavaScriptObject postVars) /*-{
		this.upload(file, url, postVars);
		return this;
	}-*/;

	/**
	 * Starts the upload of a specific file.
	 * 
	 * @param file
	 *            Reference to the instance of the file to be uploaded.
	 * @param url
	 *            The URL to upload the file to.
	 * 
	 * @return
	 */
	public native final Uploader upload(File file, String url) /*-{
		this.upload(file, url);
		return this;
	}-*/;

	/**
	 * Starts the upload of all files on the file list, using an automated
	 * queue.
	 * 
	 * @param url
	 *            The URL to upload the files to.
	 * @param postVars
	 *            (optional) A set of key-value pairs to send as variables along
	 *            with the file upload HTTP request. If not specified, the
	 *            values from the attribute postVarsPerFile are used instead.
	 * @return
	 */
	public native final Uploader uploadAll(String url, JavaScriptObject postVars) /*-{
		this.uploadAll(url, postVars);
		return this;
	}-*/;

	/**
	 * Starts the upload of all files on the file list, using an automated
	 * queue.
	 * 
	 * @param url
	 *            The URL to upload the files to.
	 * @param postVars
	 *            (optional) A set of key-value pairs to send as variables along
	 *            with the file upload HTTP request. If not specified, the
	 *            values from the attribute postVarsPerFile are used instead.
	 * @return
	 */
	public native final Uploader uploadAll(String url) /*-{
		this.uploadAll(url);
		return this;
	}-*/;

	/**
	 * 
	 Starts the upload of the files specified in the first argument, using an
	 * automated queue.
	 * 
	 * @param files
	 *            The list of files to upload.
	 * @param url
	 *            The URL to upload the files to.
	 * @param postVars
	 *            (optional) A set of key-value pairs to send as variables along
	 *            with the file upload HTTP request. If not specified, the
	 *            values from the attribute postVarsPerFile are used instead.
	 * @return
	 */
	public native final Uploader uploadThese(JsArray<File> files, String url, JavaScriptObject postVars) /*-{
		this.uploadThese(files, url, postVars);
		return this;
	}-*/;

	/**
	 * 
	 Starts the upload of the files specified in the first argument, using an
	 * automated queue.
	 * 
	 * @param files
	 *            The list of files to upload.
	 * @param url
	 *            The URL to upload the files to.
	 * @return
	 */
	public native final Uploader uploadThese(JsArray<File> files, String url) /*-{
		this.uploadThese(files, url);
		return this;
	}-*/;

	// properties

	/**
	 * Stored reference to the instance of Uploader.Queue used to manage the
	 * upload process. This is a read-only property that only exists during an
	 * active upload process. Only one queue can be active at a time; if an
	 * upload start is attempted while a queue is active, it will be ignored.
	 * 
	 * @return
	 */
	public native final UploaderQueue queue() /*-{
		return this.queue;
	}-*/;

	/**
	 * Stored reference to the instance of Uploader.Queue used to manage the
	 * upload process. This is a read-only property that only exists during an
	 * active upload process. Only one queue can be active at a time; if an
	 * upload start is attempted while a queue is active, it will be ignored.
	 * 
	 * @param val
	 * @return this - for setter chaining
	 */
	public native final Uploader queue(UploaderQueue val) /*-{
		this.queue = val;
		return this;
	}-*/;

	// attributes
	/**
	 * 
	 A Boolean indicating whether newly selected files should be appended to
	 * the existing file list, or whether they should replace it.
	 * 
	 * Default: true
	 * 
	 * @return
	 */
	public native final boolean appendNewFiles() /*-{
		return this.get("appendNewFiles");
	}-*/;

	/**
	 * 
	 A Boolean indicating whether newly selected files should be appended to
	 * the existing file list, or whether they should replace it.
	 * 
	 * Default: true
	 * 
	 * @param val
	 * @return this - for method chaining
	 */
	public native final Uploader appendNewFiles(boolean val) /*-{
		this.set("appendNewFiles", val);
		return this;
	}-*/;

	/**
	 * <p>
	 * The names of CSS classes that correspond to different button states of
	 * the "Select Files" control. These classes are assigned to the
	 * "Select Files" control based on the configuration of the uploader.
	 * Currently, the only class name used is that corresponding to the disabled
	 * state of the uploader. Other button states should be managed directly via
	 * CSS selectors.
	 * </p>
	 * 
	 * <p>
	 * disabled: the class corresponding to the disabled state of the
	 * "Select Files" button.
	 * </p>
	 * 
	 * Default: { disabled: "yui3-button-disabled" }
	 * 
	 * @return
	 */
	public native final JavaScriptObject buttonClassNames() /*-{
		return this.get("buttonClassNames");
	}-*/;

	/**
	 * <p>
	 * The names of CSS classes that correspond to different button states of
	 * the "Select Files" control. These classes are assigned to the
	 * "Select Files" control based on the configuration of the uploader.
	 * Currently, the only class name used is that corresponding to the disabled
	 * state of the uploader. Other button states should be managed directly via
	 * CSS selectors.
	 * </p>
	 * 
	 * <p>
	 * disabled: the class corresponding to the disabled state of the
	 * "Select Files" button.
	 * </p>
	 * 
	 * Default: { disabled: "yui3-button-disabled" }
	 * 
	 * @param val
	 * @return this - for method chaining
	 */
	public native final Uploader buttonClassNames(JavaScriptObject val) /*-{
		this.set("buttonClassNames", val);
		return this;
	}-*/;

	/**
	 * 
	 A Boolean indicating whether the uploader is enabled or disabled for user
	 * input.
	 * 
	 * Default: true
	 * 
	 * @return
	 */
	public native final boolean enabled() /*-{
		return this.get("enabled");
	}-*/;

	/**
	 * 
	 A Boolean indicating whether the uploader is enabled or disabled for user
	 * input.
	 * 
	 * Default: true
	 * 
	 * @param val
	 * @return this - for method chaining
	 */
	public native final Uploader enabled(boolean val) /*-{
		this.set("enabled", val);
		return this;
	}-*/;

	/**
	 * <p>
	 * The action performed when an upload error occurs for a specific file
	 * being uploaded. The possible values are:
	 * </p>
	 * <ul>
	 * <li><strong><code>UploaderQueue.CONTINUE</code></strong>: the error is
	 * ignored and the upload process is continued.</li>
	 * <li><strong><code>UploaderQueue.STOP</code></strong>: the upload process
	 * is stopped as soon as any other parallel file uploads are finished.</li>
	 * <li><strong><code>UploaderQueue.RESTART_ASAP</code></strong>: the file is
	 * added back to the front of the queue.</li>
	 * <li><strong><code>UploaderQueue.RESTART_AFTER</code></strong>: the file
	 * is added to the back of the queue.</li>
	 * </ul>
	 * <p>
	 * <strong>Default:</strong> UploaderQueue.CONTINUE
	 * </p>
	 * 
	 * @return
	 */
	public native final String errorAction() /*-{
		return this.get("errorAction");
	}-*/;

	/**
	 * <p>
	 * The action performed when an upload error occurs for a specific file
	 * being uploaded. The possible values are:
	 * </p>
	 * <ul>
	 * <li><strong><code>UploaderQueue.CONTINUE</code></strong>: the error is
	 * ignored and the upload process is continued.</li>
	 * <li><strong><code>UploaderQueue.STOP</code></strong>: the upload process
	 * is stopped as soon as any other parallel file uploads are finished.</li>
	 * <li><strong><code>UploaderQueue.RESTART_ASAP</code></strong>: the file is
	 * added back to the front of the queue.</li>
	 * <li><strong><code>UploaderQueue.RESTART_AFTER</code></strong>: the file
	 * is added to the back of the queue.</li>
	 * </ul>
	 * <p>
	 * <strong>Default:</strong> UploaderQueue.CONTINUE
	 * </p>
	 * 
	 * @param val
	 * @return this - for method chaining
	 */
	public native final Uploader errorAction(String val) /*-{
		this.set("errorAction", val);
		return this;
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
		return this.get("fileFieldName");
	}-*/;

	/**
	 * A String specifying what should be the POST field name for the file
	 * content in the upload request.
	 * 
	 * Default: Filedata
	 * 
	 * @param val
	 * @return this - for method chaining
	 */
	public native final Uploader fileFieldName(String val) /*-{
		this.set("fileFieldName", val);
		return this;
	}-*/;

	/**
	 * 
	 A filtering function that is applied to every file selected by the user.
	 * The function receives the Y.File object and must return a Boolean value.
	 * If a false value is returned, the file in question is not added to the
	 * list of files to be uploaded. Use this function to put limits on file
	 * sizes or check the file names for correct extension, but make sure that a
	 * server-side check is also performed, since any client-side restrictions
	 * are only advisory and can be circumvented.
	 * 
	 * Default: null
	 * 
	 * @return
	 */
	public native final JavaScriptObject fileFilterFunction() /*-{
		return this.get("fileFilterFunction");
	}-*/;

	/**
	 * 
	 A filtering function that is applied to every file selected by the user.
	 * The function receives the Y.File object and must return a Boolean value.
	 * If a false value is returned, the file in question is not added to the
	 * list of files to be uploaded. Use this function to put limits on file
	 * sizes or check the file names for correct extension, but make sure that a
	 * server-side check is also performed, since any client-side restrictions
	 * are only advisory and can be circumvented.
	 * 
	 * Default: null
	 * 
	 * @param val
	 * @return this - for method chaining
	 */
	public native final Uploader fileFilterFunction(JavaScriptObject val) /*-{
		this.set("fileFilterFunction", val);
		return this;
	}-*/;

	/**
	 * 
	 The array of files to be uploaded. All elements in the array must be
	 * instances of Y.FileFlash and be instantiated with a fileId retrieved from
	 * an instance of the uploader.
	 * 
	 * Default: []
	 * 
	 * @return
	 */
	public native final JsArray<File> fileList() /*-{
		return this.get("fileList");
	}-*/;

	/**
	 * 
	 The array of files to be uploaded. All elements in the array must be
	 * instances of Y.FileFlash and be instantiated with a fileId retrieved from
	 * an instance of the uploader.
	 * 
	 * Default: []
	 * 
	 * @param val
	 * @return this - for method chaining
	 */
	public native final Uploader fileList(JsArray<File> val) /*-{
		this.set("fileList", val);
		return this;
	}-*/;

	/**
	 * 
	 A Boolean indicating whether multiple file selection is enabled.
	 * 
	 * Default: false
	 * 
	 * @return
	 */
	public native final boolean multipleFiles() /*-{
		return this.get("multipleFiles");
	}-*/;

	/**
	 * 
	 A Boolean indicating whether multiple file selection is enabled.
	 * 
	 * Default: false
	 * 
	 * @param val
	 * @return this - for method chaining
	 */
	public native final Uploader multipleFiles(boolean val) /*-{
		this.set("multipleFiles", val);
		return this;
	}-*/;

	/**
	 * 
	 An object, keyed by fileId, containing sets of key-value pairs that
	 * should be passed as POST variables along with each corresponding file.
	 * This attribute is only used if no POST variables are specifed in the
	 * upload method call.
	 * 
	 * Default: {}
	 * 
	 * @return
	 */
	public native final JavaScriptObject postVarsPerFile() /*-{
		return this.get("postVarsPerFile");
	}-*/;

	/**
	 * 
	 An object, keyed by fileId, containing sets of key-value pairs that
	 * should be passed as POST variables along with each corresponding file.
	 * This attribute is only used if no POST variables are specifed in the
	 * upload method call.
	 * 
	 * Default: {}
	 * 
	 * @param val
	 * @return this - for method chaining
	 */
	public native final Uploader postVarsPerFile(JavaScriptObject val) /*-{
		this.set("postVarsPerFile", val);
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
	public native final Uploader retryCount(int val) /*-{
		this.set("retryCount", val);
		return this;
	}-*/;

	/**
	 * 
	 The label for the "Select Files" widget. This is the value that replaces
	 * the {selectButtonLabel} token in the SELECT_FILES_BUTTON template.
	 * 
	 * Default: "Select Files"
	 * 
	 * @return
	 */
	public native final String selectButtonLabel() /*-{
		return this.get("selectButtonLabel");
	}-*/;

	/**
	 * 
	 The label for the "Select Files" widget. This is the value that replaces
	 * the {selectButtonLabel} token in the SELECT_FILES_BUTTON template.
	 * 
	 * Default: "Select Files"
	 * 
	 * @param val
	 * @return this - for method chaining
	 */
	public native final Uploader selectButtonLabel(String val) /*-{
		this.set("selectButtonLabel", val);
		return this;
	}-*/;

	/**
	 * 
	 The widget that serves as the "Select Files control for the file uploader
	 * 
	 * Default: A standard HTML button with YUI CSS Button skin.
	 * 
	 * @return
	 */
	public native final Node selectFilesButtonNode() /*-{
		return this.get("selectFilesButton");
	}-*/;

	/**
	 * 
	 The widget that serves as the "Select Files control for the file uploader
	 * 
	 * Default: A standard HTML button with YUI CSS Button skin.
	 * 
	 * @param val
	 * @return this - for method chaining
	 */
	public native final Uploader selectFilesButton(Node val) /*-{
		this.set("selectFilesButton", val);
		return this;
	}-*/;

	/**
	 * 
	 The widget that serves as the "Select Files control for the file uploader
	 * 
	 * Default: A standard HTML button with YUI CSS Button skin.
	 * 
	 * @return
	 */
	public native final Widget selectFilesButtonWidget() /*-{
		return this.get("selectFilesButton");
	}-*/;

	/**
	 * 
	 The widget that serves as the "Select Files control for the file uploader
	 * 
	 * Default: A standard HTML button with YUI CSS Button skin.
	 * 
	 * @param val
	 * @return this - for method chaining
	 */
	public native final Uploader selectFilesButton(Widget val) /*-{
		this.set("selectFilesButton", val);
		return this;
	}-*/;

	/**
	 * 
	 The number of files that can be uploaded simultaneously if the automatic
	 * queue management is used. This value can be in the range between 2 and 5.
	 * 
	 * Default: 2
	 * 
	 * @return
	 */
	public native final int simLimit() /*-{
		return this.get("simLimit");
	}-*/;

	/**
	 * 
	 The number of files that can be uploaded simultaneously if the automatic
	 * queue management is used. This value can be in the range between 2 and 5.
	 * 
	 * Default: 2
	 * 
	 * @param val
	 * @return this - for method chaining
	 */
	public native final Uploader simLimit(int val) /*-{
		this.set("simLimit", val);
		return this;
	}-*/;

	/**
	 * 
	 The URL to which file upload requested are POSTed. Only used if a
	 * different url is not passed to the upload method call.
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
	 The URL to which file upload requested are POSTed. Only used if a
	 * different url is not passed to the upload method call.
	 * 
	 * Default: ""
	 * 
	 * @param val
	 * @return this - for method chaining
	 */
	public native final Uploader uploadURL(String val) /*-{
		this.set("uploadURL", val);
		return this;
	}-*/;
}
