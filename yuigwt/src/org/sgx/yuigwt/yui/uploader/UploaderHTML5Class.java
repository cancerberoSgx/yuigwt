package org.sgx.yuigwt.yui.uploader;

/**
 * 
 * @author sg
 * 
 */
public class UploaderHTML5Class extends UploaderClass {
	protected UploaderHTML5Class() {
	}

	/**
	 * The template for the hidden file input field container. The file input
	 * field will only accept clicks if its visibility is set to hidden (and
	 * will not if it's display value is set to none)
	 * 
	 * @return
	 */
	public native final String HTML5FILEFIELD_TEMPLATE() /*-{
		return this.HTML5FILEFIELD_TEMPLATE;
	}-*/;

	/**
	 * The template for the hidden file input field container. The file input
	 * field will only accept clicks if its visibility is set to hidden (and
	 * will not if it's display value is set to none)
	 * 
	 * @param val
	 * @return this - for setter chaining
	 */
	public native final UploaderHTML5Class HTML5FILEFIELD_TEMPLATE(String val) /*-{
		this.HTML5FILEFIELD_TEMPLATE = val;
		return this;
	}-*/;
}
