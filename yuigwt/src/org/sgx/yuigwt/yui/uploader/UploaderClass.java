package org.sgx.yuigwt.yui.uploader;

import org.sgx.yuigwt.yui.widget.WidgetClass;

public class UploaderClass extends WidgetClass {
	protected UploaderClass() {
	}

	/**
	 * <p>
	 * The static property reflecting the type of uploader that Y.Uploader
	 * aliases. The possible values are:
	 * </p>
	 * 
	 * <p>
	 * "html5": Y.Uploader is an alias for Y.UploaderHTML5
	 * </p>
	 * 
	 * <p>
	 * "flash": Y.Uploader is an alias for Y.UploaderFlash
	 * </p>
	 * 
	 * <p>
	 * "none": Neither Flash not HTML5 are available, and Y.Uploader does not
	 * reference an actual implementation.
	 * </p>
	 * 
	 * @return
	 */
	public final native String TYPE()/*-{
		return this.TYPE;
	}-*/;

	/**
	 * 
	 The template for the "Select Files" button.
	 * 
	 * <p>
	 * Default:
	 * "<button type='button' class='yui3-button' role='button' aria-label='{selectButtonLabel}' tabindex='{tabIndex}'>{selectButtonLabel}</button>"
	 * </p>
	 * 
	 * @return
	 */
	public final native String SELECT_FILES_BUTTON()/*-{
		return this.SELECT_FILES_BUTTON;
	}-*/;
}
