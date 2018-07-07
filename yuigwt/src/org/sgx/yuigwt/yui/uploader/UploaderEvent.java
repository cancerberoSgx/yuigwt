package org.sgx.yuigwt.yui.uploader;

import org.sgx.yuigwt.yui.event.EventFacade;
import org.sgx.yuigwt.yui.uploader.file.File;
import org.sgx.yuigwt.yui.widget.WidgetEvent;

import com.google.gwt.core.client.JsArray;

/**
 * 
 * @author sg
 * 
 */
public class UploaderEvent extends WidgetEvent {
	protected UploaderEvent() {
	}

	/**
	 * An Array of files selected by the user
	 * 
	 * @return
	 */
	public native final JsArray<File> fileList() /*-{
		return this.fileList;
	}-*/;

	/**
	 * An Array of files selected by the user
	 * 
	 * @param val
	 * @return this - for setter chaining
	 */
	public native final UploaderEvent fileList(JsArray<File> val) /*-{
		this.fileList = val;
		return this;
	}-*/;

	/**
	 * A reference to the Y.File that dispatched the event.
	 * 
	 * @return
	 */
	public native final File file() /*-{
		return this.file;
	}-*/;

	/**
	 * A reference to the Y.File that dispatched the event.
	 * 
	 * @param val
	 * @return this - for setter chaining
	 */
	public native final UploaderEvent file(File val) /*-{
		this.file = val;
		return this;
	}-*/;

	/**
	 * The original event dispatched by Y.File.
	 * 
	 * @return
	 */
	public native final EventFacade originEvent() /*-{
		return this.originEvent;
	}-*/;

	/**
	 * The original event dispatched by Y.File.
	 * 
	 * @param val
	 * @return this - for setter chaining
	 */
	public native final UploaderEvent originEvent(EventFacade val) /*-{
		this.originEvent = val;
		return this;
	}-*/;

	/**
	 * The number of bytes of the file list that has been uploaded
	 * 
	 * @return
	 */
	public native final int bytesLoaded() /*-{
		return this.bytesLoaded;
	}-*/;

	/**
	 * The number of bytes of the file list that has been uploaded
	 * 
	 * @param val
	 * @return this - for setter chaining
	 */
	public native final UploaderEvent bytesLoaded(int val) /*-{
		this.bytesLoaded = val;
		return this;
	}-*/;

	/**
	 * The total number of bytes in the file list
	 * 
	 * @return
	 */
	public native final int bytesTotal() /*-{
		return this.bytesTotal;
	}-*/;

	/**
	 * The total number of bytes in the file list
	 * 
	 * @param val
	 * @return this - for setter chaining
	 */
	public native final UploaderEvent bytesTotal(int val) /*-{
		this.bytesTotal = val;
		return this;
	}-*/;

	/**
	 * The fraction of the file list that has been uploaded, out of 100
	 * 
	 * @return
	 */
	public native final double percentLoaded() /*-{
		return this.percentLoaded;
	}-*/;

	/**
	 * The fraction of the file list that has been uploaded, out of 100
	 * 
	 * @param val
	 * @return this - for setter chaining
	 */
	public native final UploaderEvent percentLoaded(double val) /*-{
		this.percentLoaded = val;
		return this;
	}-*/;

	/**
	 * The source of the upload error, either "io" or "http"
	 * 
	 * @return
	 */
	public native final String source() /*-{
		return this.source;
	}-*/;

	/**
	 * The source of the upload error, either "io" or "http"
	 * 
	 * @param val
	 * @return this - for setter chaining
	 */
	public native final UploaderEvent source(String val) /*-{
		this.source = val;
		return this;
	}-*/;

	/**
	 * The message that accompanied the error. Corresponds to the text of the error in cases where source is "io", and to the HTTP status for cases where source is "http".
	 * 
	 * @return
	 */
	public native final String message() /*-{
		return this.message;
	}-*/;

	/**
	 * The message that accompanied the error. Corresponds to the text of the error in cases where source is "io", and to the HTTP status for cases where source is "http".
	 * 
	 * @param val
	 * @return this - for setter chaining
	 */
	public native final UploaderEvent message(String val) /*-{
		this.message = val;
		return this;
	}-*/;
}
