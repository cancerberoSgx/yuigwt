package org.sgx.yuigwt.yui.editor;

import org.sgx.yuigwt.yui.base.BaseClass;

import com.google.gwt.core.client.JavaScriptObject;
import com.google.gwt.core.client.JsArrayString;

/**
 * EditorBase static properties and methods
 * 
 * @author sg
 * 
 */
public class EditorBaseClass extends BaseClass {
	protected EditorBaseClass() {
	}

	/**
	 * css The CSS string containing rgb(#,#,#);
	 * 
	 * @return self for method chaining
	 */
	public native final String FILTER_RGB(String rgb) /*-{
		return this.FILTER_RGB(rgb);
	}-*/;

	/**
	 * Pulls the fontSize from a node, then checks for string values (x-large,
	 * x-small) and converts them to pixel sizes. If the parsed size is
	 * different from the original, it calls node.setStyle to update the node
	 * with a pixel size for normalization.
	 * 
	 * @return
	 */
	public native final String NORMALIZE_FONTSIZE() /*-{
		return this.NORMALIZE_FONTSIZE();
	}-*/;

	/**
	 * Hash table of keys to fire a nodeChange event for.
	 * 
	 * @return
	 */
	public native final JavaScriptObject NC_KEYS() /*-{
		return this.NC_KEYS;
	}-*/;

	/**
	 * Hash table of keys to fire a nodeChange event for.
	 * 
	 * @param val
	 * @return this - for setter chaining
	 */
	public native final EditorBaseClass NC_KEYS(JavaScriptObject val) /*-{
		this.NC_KEYS = val;
		return this;
	}-*/;

	/**
	 * Editor Strings. By default contains only the title property for the Title
	 * of frame document (default "Rich Text Editor").
	 * 
	 * @return
	 */
	public native final JavaScriptObject STRINGS() /*-{
		return this.STRINGS;
	}-*/;

	/**
	 * Editor Strings. By default contains only the title property for the Title
	 * of frame document (default "Rich Text Editor").
	 * 
	 * @param val
	 * @return this - for setter chaining
	 */
	public native final EditorBaseClass STRINGS(JavaScriptObject val) /*-{
		this.STRINGS = val;
		return this;
	}-*/;

	/**
	 * The HTML markup to use for the tabkey
	 * 
	 * @return
	 */
	public native final String TABKEY() /*-{
		return this.TABKEY;
	}-*/;

	/**
	 * The HTML markup to use for the tabkey
	 * 
	 * @param val
	 * @return this - for setter chaining
	 */
	public native final EditorBaseClass TABKEY(String val) /*-{
		this.TABKEY = val;
		return this;
	}-*/;

	/**
	 * A hash table of tags to their execcomand's
	 * 
	 * @return
	 */
	public native final JavaScriptObject TAG2CMD() /*-{
		return this.TAG2CMD;
	}-*/;

	/**
	 * A hash table of tags to their execcomand's
	 * 
	 * @param val
	 * @return this - for setter chaining
	 */
	public native final EditorBaseClass TAG2CMD(JavaScriptObject val) /*-{
		this.TAG2CMD = val;
		return this;
	}-*/;

	/**
	 * The default modules to use inside the Frame
	 * 
	 * @return
	 */
	public native final JsArrayString USE() /*-{
		return this.USE;
	}-*/;

	/**
	 * The default modules to use inside the Frame
	 * 
	 * @param val
	 * @return this - for setter chaining
	 */
	public native final EditorBaseClass USE(JsArrayString val) /*-{
		this.USE = val;
		return this;
	}-*/;
}
