package org.sgx.yuigwt.yuigallery.itsaselectlist;

import org.sgx.yuigwt.yui.widget.WidgetConfig;
import org.sgx.yuigwt.yuigallery.imagecropper.ImageCropperConfig;

import com.google.gwt.core.client.JsArray;
import com.google.gwt.core.client.JsArrayInteger;
import com.google.gwt.core.client.JsArrayString;
/**
 * 
 * @author sg
 *
 */
public class ITSASelectlistConfig extends WidgetConfig {
	protected ITSASelectlistConfig() {
	}

	public static final native ITSASelectlistConfig create()/*-{
		return {}; 
	}-*/;
	
	/**
	 * Listitems in the selectbox. Fires event itemsChange
	 * 
	 * @return
	 */
	public native final JsArrayString itemsString() /*-{
		return this.items;
	}-*/;

	/**
	 * Listitems in the selectbox. Fires event itemsChange
	 * 
	 * @return
	 */
	public native final JsArrayInteger itemsInt() /*-{
		return this.items;
	}-*/;

	/**
	 * Listitems in the selectbox. Fires event itemsChange
	 * 
	 * @param val
	 * @return this - for setter chaining
	 */
	public native final ITSASelectlistConfig items(JsArrayString val) /*-{
		this.items = val;
		return this;
	}-*/;

	/**
	 * Listitems in the selectbox. Fires event itemsChange
	 * 
	 * @param val
	 * @return this - for setter chaining
	 */
	public native final ITSASelectlistConfig items(String[] val) /*-{
		this.items = @org.sgx.yuigwt.yui.util.JsUtil::toJsArrayString([Ljava/lang/String;)(val);
		return this;
	}-*/;

	/**
	 * Listitems in the selectbox. Fires event itemsChange
	 * 
	 * @param val
	 * @return this - for setter chaining
	 */
	public native final ITSASelectlistConfig items(JsArrayInteger val) /*-{
		this.items = val;
		return this;
	}-*/;
	
	/**
	 * Listitems in the selectbox. Fires event itemsChange
	 * 
	 * @param val
	 * @return this - for setter chaining
	 */
	public native final ITSASelectlistConfig items(JsArray<ITSASelectlistItem> val) /*-{
		this.items = val;
		return this;
	}-*/;

	/**
	 * Listitems in the selectbox. Fires event itemsChange
	 * 
	 * @param val
	 * @return this - for setter chaining
	 */
	public native final ITSASelectlistConfig items(ITSASelectlistItem[] val) /*-{
		this.items = @org.sgx.yuigwt.yui.util.JsUtil::toJsArray([Lcom/google/gwt/core/client/JavaScriptObject;)(val);
		return this;
	}-*/;
	
	/**
	 * Listitems in the selectbox. Fires event itemsChange
	 * 
	 * @param val
	 * @return this - for setter chaining
	 */
	public native final ITSASelectlistConfig items(int[] val) /*-{
		this.items = @org.sgx.yuigwt.yui.util.JsUtil::toJsArrayInt([I)(val);
		return this;
	}-*/;

	/**
	 * The size of the buttons Should be a value 1, 2 or 3 (the higher, the
	 * bigger the buttonsize) Default = 2. Fires event btnSizeChange
	 * 
	 * @return
	 */
	public native final int btnSize() /*-{
		return this.btnSize;
	}-*/;

	/**
	 * The size of the buttons Should be a value 1, 2 or 3 (the higher, the
	 * bigger the buttonsize) Default = 2. Fires event btnSizeChange
	 * 
	 * @param val
	 * @return this - for setter chaining
	 */
	public native final ITSASelectlistConfig btnSize(int val) /*-{
		this.btnSize = val;
		return this;
	}-*/;

	/**
	 * Defines the buttonWidth Default = null, which means automaticly sizeing.
	 * Fires event buttonWidthChange
	 * 
	 * @return
	 */
	public native final int buttonWidth() /*-{
		return this.buttonWidth;
	}-*/;

	/**
	 * Defines the buttonWidth Default = null, which means automaticly sizeing.
	 * Fires event buttonWidthChange
	 * 
	 * @param val
	 * @return this - for setter chaining
	 */
	public native final ITSASelectlistConfig buttonWidth(int val) /*-{
		this.buttonWidth = val;
		return this;
	}-*/;

	/**
	 * Additional className that can be added to the boundingBox
	 * 
	 * @return
	 */
	public native final String className() /*-{
		return this.className;
	}-*/;

	/**
	 * Additional className that can be added to the boundingBox
	 * 
	 * @param val
	 * @return this - for setter chaining
	 */
	public native final ITSASelectlistConfig className(String val) /*-{
		this.className = val;
		return this;
	}-*/;

	/**
	 * Defines the defaultbuttontext when a softMatch with no hit has taken
	 * place. See selectItem() how to use a softMatch. Default = 'choose...'
	 * 
	 * @return
	 */
	public native final String defaultButtonText() /*-{
		return this.defaultButtonText;
	}-*/;

	/**
	 * Defines the defaultbuttontext when a softMatch with no hit has taken
	 * place. See selectItem() how to use a softMatch. Default = 'choose...'
	 * 
	 * @param val
	 * @return this - for setter chaining
	 */
	public native final ITSASelectlistConfig defaultButtonText(String val) /*-{
		this.defaultButtonText = val;
		return this;
	}-*/;

	/**
	 * The default listitem to be selected during rendering. Default = null
	 * 
	 * @return
	 */
	public native final String defaultItem() /*-{
		return this.defaultItem;
	}-*/;

	/**
	 * The default listitem to be selected during rendering. Default = null
	 * 
	 * @param val
	 * @return this - for setter chaining
	 */
	public native final ITSASelectlistConfig defaultItem(String val) /*-{
		this.defaultItem = val;
		return this;
	}-*/;

	/**
	 * Determines whether to show the selected item in the selectlist, or if it
	 * should disappear from the selectlist when selected. Default = false.
	 * 
	 * @return
	 */
	public native final boolean hideSelected() /*-{
		return this.hideSelected;
	}-*/;

	/**
	 * Determines whether to show the selected item in the selectlist, or if it
	 * should disappear from the selectlist when selected. Default = false.
	 * 
	 * @param val
	 * @return this - for setter chaining
	 */
	public native final ITSASelectlistConfig hideSelected(boolean val) /*-{
		this.hideSelected = val;
		return this;
	}-*/;

	/**
	 * Additional className that can be added to the selected text on the Button
	 * 
	 * @return
	 */
	public native final String iconClassName() /*-{
		return this.iconClassName;
	}-*/;

	/**
	 * Additional className that can be added to the selected text on the Button
	 * 
	 * @param val
	 * @return this - for setter chaining
	 */
	public native final ITSASelectlistConfig iconClassName(String val) /*-{
		this.iconClassName = val;
		return this;
	}-*/;

	/**
	 * Whether the listitems should be aligned left or right. Default = true.
	 * 
	 * @return
	 */
	public native final boolean listAlignLeft() /*-{
		return this.listAlignLeft;
	}-*/;

	/**
	 * Whether the listitems should be aligned left or right. Default = true.
	 * 
	 * @param val
	 * @return this - for setter chaining
	 */
	public native final ITSASelectlistConfig listAlignLeft(boolean val) /*-{
		this.listAlignLeft = val;
		return this;
	}-*/;

	/**
	 * Defines the width of the listbox. Default = null, which means automaticly
	 * sizeing.
	 * 
	 * @return
	 */
	public native final int listWidth() /*-{
		return this.listWidth;
	}-*/;

	/**
	 * Defines the width of the listbox. Default = null, which means automaticly
	 * sizeing.
	 * 
	 * @param val
	 * @return this - for setter chaining
	 */
	public native final ITSASelectlistConfig listWidth(int val) /*-{
		this.listWidth = val;
		return this;
	}-*/;

	/**
	 * Whether the selection should be displayed on the button. This is normal
	 * behaviour. Although in some cases you might not want this. For example
	 * when simulating a menubutton with static text and a dropdown with
	 * subbuttons Default = true When set to false, the buttontext will always
	 * remains the Attribute: defaultButtonText
	 * 
	 * @return
	 */
	public native final boolean selectionOnButton() /*-{
		return this.selectionOnButton;
	}-*/;

	/**
	 * Whether the selection should be displayed on the button. This is normal
	 * behaviour. Although in some cases you might not want this. For example
	 * when simulating a menubutton with static text and a dropdown with
	 * subbuttons Default = true When set to false, the buttontext will always
	 * remains the Attribute: defaultButtonText
	 * 
	 * @param val
	 * @return this - for setter chaining
	 */
	public native final ITSASelectlistConfig selectionOnButton(boolean val) /*-{
this.selectionOnButton = val; 
return this; 
}-*/;
}
