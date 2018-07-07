package org.sgx.yuigwt.yui.uploader;

import org.sgx.yuigwt.yui.node.Node;
import org.sgx.yuigwt.yui.uploader.UploaderFlash.FileFilter;
import org.sgx.yuigwt.yui.uploader.file.File;
import org.sgx.yuigwt.yui.widget.Widget;
import org.sgx.yuigwt.yui.widget.WidgetConfig;

import com.google.gwt.core.client.JavaScriptObject;
import com.google.gwt.core.client.JsArray;
import com.google.gwt.core.client.JsArrayString;

/**
 * 
 * @author sg
 * 
 */
public class UploaderConfig extends WidgetConfig {
	protected UploaderConfig() {
	}

	public static final native UploaderConfig create()/*-{
		return {};
	}-*/;

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
		return this.appendNewFiles;
	}-*/;

	/**
	 * 
	 A Boolean indicating whether newly selected files should be appended to
	 * the existing file list, or whether they should replace it.
	 * 
	 * Default: true
	 * 
	 * @param val
	 * @return this - for setter chaining
	 */
	public native final UploaderConfig appendNewFiles(boolean val) /*-{
		this.appendNewFiles = val;
		return this;
	}-*/;

	/**
	 * 
	 <p>
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
		return this.buttonClassNames;
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
	 * @return this - for setter chaining
	 */
	public native final UploaderConfig buttonClassNames(JavaScriptObject val) /*-{
		this.buttonClassNames = val;
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
		return this.enabled;
	}-*/;

	/**
	 * 
	 A Boolean indicating whether the uploader is enabled or disabled for user
	 * input.
	 * 
	 * Default: true
	 * 
	 * @param val
	 * @return this - for setter chaining
	 */
	public native final UploaderConfig enabled(boolean val) /*-{
		this.enabled = val;
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
		return this.errorAction;
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
	 * @return this - for setter chaining
	 */
	public native final UploaderConfig errorAction(String val) /*-{
		this.errorAction = val;
		return this;
	}-*/;

	/**
	 * 
	 * @return
	 */
	public native final String fileFieldName() /*-{
		return this.fileFieldName;
	}-*/;

	/**
	 * 
	 * @param val
	 * @return this - for setter chaining
	 */
	public native final UploaderConfig fileFieldName(String val) /*-{
		this.fileFieldName = val;
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
		return this.fileFilterFunction;
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
	 * @return this - for setter chaining
	 */
	public native final UploaderConfig fileFilterFunction(JavaScriptObject val) /*-{
		this.fileFilterFunction = val;
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
		return this.fileList;
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
	 * @return this - for setter chaining
	 */
	public native final UploaderConfig fileList(JsArray<File> val) /*-{
		this.fileList = val;
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
		return this.multipleFiles;
	}-*/;

	/**
	 * 
	 A Boolean indicating whether multiple file selection is enabled.
	 * 
	 * Default: false
	 * 
	 * @param val
	 * @return this - for setter chaining
	 */
	public native final UploaderConfig multipleFiles(boolean val) /*-{
		this.multipleFiles = val;
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
		return this.postVarsPerFile;
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
	 * @return this - for setter chaining
	 */
	public native final UploaderConfig postVarsPerFile(JavaScriptObject val) /*-{
		this.postVarsPerFile = val;
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
	public native final UploaderConfig retryCount(int val) /*-{
		this.retryCount = val;
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
		return this.selectButtonLabel;
	}-*/;

	/**
	 * 
	 The label for the "Select Files" widget. This is the value that replaces
	 * the {selectButtonLabel} token in the SELECT_FILES_BUTTON template.
	 * 
	 * Default: "Select Files"
	 * 
	 * @param val
	 * @return this - for setter chaining
	 */
	public native final UploaderConfig selectButtonLabel(String val) /*-{
		this.selectButtonLabel = val;
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
	public native final Node selectFilesButtonnode() /*-{
		return this.selectFilesButton;
	}-*/;

	/**
	 * 
	 The widget that serves as the "Select Files control for the file uploader
	 * 
	 * Default: A standard HTML button with YUI CSS Button skin.
	 * 
	 * @param val
	 * @return this - for setter chaining
	 */
	public native final UploaderConfig selectFilesButton(Node val) /*-{
		this.selectFilesButton = val;
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
		return this.selectFilesButton;
	}-*/;

	/**
	 * 
	 The widget that serves as the "Select Files control for the file uploader
	 * 
	 * Default: A standard HTML button with YUI CSS Button skin.
	 * 
	 * @param val
	 * @return this - for setter chaining
	 */
	public native final UploaderConfig selectFilesButton(Widget val) /*-{
		this.selectFilesButton = val;
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
		return this.simLimit;
	}-*/;

	/**
	 * 
	 The number of files that can be uploaded simultaneously if the automatic
	 * queue management is used. This value can be in the range between 2 and 5.
	 * 
	 * Default: 2
	 * 
	 * @param val
	 * @return this - for setter chaining
	 */
	public native final UploaderConfig simLimit(int val) /*-{
		this.simLimit = val;
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
		return this.uploadURL;
	}-*/;

	/**
	 * 
	 The URL to which file upload requested are POSTed. Only used if a
	 * different url is not passed to the upload method call.
	 * 
	 * Default: ""
	 * 
	 * @param val
	 * @return this - for setter chaining
	 */
	public native final UploaderConfig uploadURL(String val) /*-{
		this.uploadURL = val;
		return this;
	}-*/;
	
	
	
	/**
	 An array indicating what fileFilters should be applied to the file
	 * selection dialog. Each element in the array should be a string indicating
	 * the Media (MIME) type for the files that should be supported for
	 * selection. The Media type strings should be properly formatted or this
	 * parameter will be ignored. Examples of valid strings include: "audio/",
	 * "video/", "application/pdf", etc. More information on valid Media type
	 * strings is available here:
	 * http://www.iana.org/assignments/media-types/index.html
	 * 
	 * Default: []
	 * 
	 * @return
	 */
	public native final JsArrayString fileFilters() /*-{
		return this.fileFilters;
	}-*/;

	/**
	 An array indicating what fileFilters should be applied to the file
	 * selection dialog. Each element in the array should be a string indicating
	 * the Media (MIME) type for the files that should be supported for
	 * selection. The Media type strings should be properly formatted or this
	 * parameter will be ignored. Examples of valid strings include: "audio/",
	 * "video/", "application/pdf", etc. More information on valid Media type
	 * strings is available here:
	 * http://www.iana.org/assignments/media-types/index.html
	 * 
	 * Default: []
	 * 
	 * @param val
	 * @return this - for setter chaining
	 */
	public native final UploaderConfig fileFilters(JsArrayString val) /*-{
		this.fileFilters = val;
		return this;
	}-*/;
	
	
	
	
	
	//html5
	
	/**
	 * 
	 The node that serves as the drop target for files. HTML5 only
	 * 
	 * Default: null
	 * 
	 * @return
	 */
	public native final Node dragAndDropArea() /*-{
		return this.dragAndDropArea;
	}-*/;

	/**
	 * 
	 The node that serves as the drop target for files.. HTML5 only
	 * 
	 * Default: null
	 * 
	 * @param val
	 * @return this - for setter chaining
	 */
	public native final UploaderConfig dragAndDropArea(Node val) /*-{
		this.dragAndDropArea = val;
		return this;
	}-*/;



	/**
	 * HTML5 only. 
	 A Boolean that specifies whether the file should be uploaded with the
	 * appropriate user credentials for the domain.
	 * 
	 * Default: true
	 * 
	 * @return
	 */
	public native final boolean withCredentials() /*-{
		return this.withCredentials;
	}-*/;

	/**
	 * HTML5 only. 
	 A Boolean that specifies whether the file should be uploaded with the
	 * appropriate user credentials for the domain.
	 * 
	 * Default: true
	 * 
	 * @param val
	 * @return this - for setter chaining
	 */
	public native final UploaderConfig withCredentials(boolean val) /*-{
		this.withCredentials = val;
		return this;
	}-*/;
	


	
	//flash
	
//	/**
//	 * Flash only. 
//	 * An array indicating what fileFilters should be applied to the file
//	 * selection dialog. Each element in the array should be an object with the
//	 * following key-value pairs: { description : String extensions: String of
//	 * the form ".ext1;.ext2;*.ext3;..." }.
//	 * 
//	 * Default: []
//	 * 
//	 * @return
//	 */
//	public native final JsArray<FileFilter> fileFilters() /*-{
//		return this.fileFilters;
//	}-*/;

	/**
	 * Flash only. 
	 * An array indicating what fileFilters should be applied to the file
	 * selection dialog. Each element in the array should be an object with the
	 * following key-value pairs: { description : String extensions: String of
	 * the form ".ext1;.ext2;*.ext3;..." }.
	 * 
	 * Default: []
	 * 
	 * @param val
	 * @return this - for setter chaining
	 */
	public native final UploaderConfig fileFilters(JsArray<FileFilter> val) /*-{
		this.fileFilters = val;
		return this;
	}-*/;

	/**
	 * Flash only. 
	 * @return
	 */
	public native final String swfURL() /*-{
		return this.swfURL;
	}-*/;

	/**
	 * Flash only. 
	 * @param val
	 * @return this - for setter chaining
	 */
	public native final UploaderConfig swfURL(String val) /*-{
		this.swfURL = val;
		return this;
	}-*/;

	/**
	 * Flash only. 
	 <p>
	 * The id's or Node references of the DOM elements that precede and follow
	 * the Select Files button in the tab order. Specifying these allows
	 * keyboard navigation to and from the Flash player layer of the uploader.
	 * The two keys corresponding to the DOM elements are:
	 * </p>
	 * 
	 * <p>
	 * from: the id or the Node reference corresponding to the DOM element that
	 * precedes the Select Files button in the tab order.
	 * </p>
	 * <p>
	 * to: the id or the Node reference corresponding to the DOM element that
	 * follows the Select Files button in the tab order.
	 * </p>
	 * 
	 * Default: null
	 * 
	 * @return
	 */
	public native final JavaScriptObject tabElements() /*-{
		return this.tabElements;
	}-*/;

	/**
	 * Flash only. 
	 <p>
	 * The id's or Node references of the DOM elements that precede and follow
	 * the Select Files button in the tab order. Specifying these allows
	 * keyboard navigation to and from the Flash player layer of the uploader.
	 * The two keys corresponding to the DOM elements are:
	 * </p>
	 * 
	 * <p>
	 * from: the id or the Node reference corresponding to the DOM element that
	 * precedes the Select Files button in the tab order.
	 * </p>
	 * <p>
	 * to: the id or the Node reference corresponding to the DOM element that
	 * follows the Select Files button in the tab order.
	 * </p>
	 * 
	 * Default: null
	 * 
	 * @param val
	 * @return this - for setter chaining
	 */
	public native final UploaderConfig tabElements(JavaScriptObject val) /*-{
		this.tabElements = val;
		return this;
	}-*/;


}