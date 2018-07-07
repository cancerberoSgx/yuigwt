package org.sgx.yuigwt.yui.uploader.file;

import org.sgx.yuigwt.yui.widget.WidgetClass;

import com.google.gwt.core.client.JavaScriptObject;

/**
 * @see http://yuilibrary.com/yui/docs/api/classes/FileHTML5.html
 * @author sg
 * 
 */
public class FileHTML5Class extends FileClass {
	protected FileHTML5Class() {
	}

	/**
	 * Checks whether a specific native file instance is valid
	 * 
	 * @param file
	 * @return
	 */
	public native final boolean isValidFile(JavaScriptObject file)/*-{
		return this.isValidFile(file);
	}-*/;

	/**
	 * Checks whether the browser has a native upload capability via
	 * XMLHttpRequest Level 2.
	 * 
	 * @return
	 */
	public native final boolean canUpload()/*-{
		return this.canUpload();
	}-*/;

}
