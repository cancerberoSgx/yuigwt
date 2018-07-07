package org.sgx.yuigwt.yuigallery.form;

import org.sgx.yuigwt.yui.widget.ext.WidgetExt;

/**
 * A representation of an individual form field.
 * 
 * @see http://www.greghinch.com/yui3-gallery/docs/FormField.html
 * @author sg
 * 
 */
public class FormField extends WidgetExt {
	protected FormField() {
	}

	public static final String EVENT_DISABLEDCHANGE = "disabledChange", EVENT_ERRORCHANGE = "errorChange", EVENT_IDCHANGE = "idChange", EVENT_LABELCHANGE = "labelChange";

	/**
	 * Runs the validation functions of this form field
	 */
	public final native boolean validateField()/*-{
		return this.validateField();
	}-*/;

	/**
	 * Clears the value AND the initial value of this field
	 */
	public final native void clear()/*-{
		this.clear();
	}-*/;

	// /**
	// * Get a form field by its name attribute or numerical index
	// */
	// public native final String INVALID_DATE_MESSAGE() /*-{
	// return this.INVALID_DATE_MESSAGE;
	// }-*/;

	/**
	 * 
	 * @return the attribute
	 */
	public final native String label()/*-{
		return this.get("label");
	}-*/;

	/**
	 * 
	 * @param val
	 * @return self for method chaining
	 */
	public final native FormField label(String val)/*-{
		this.set("label", val);
		return this;
	}-*/;
	
/**
 * An error message associated with this field. Setting this will cause validation to fail until a new value is entered 
 * @return
 */
public native final String error() /*-{
return this.get("error"); 
}-*/;

/**
 * An error message associated with this field. Setting this will cause validation to fail until a new value is entered 
 * @param val
 * @return this - for setter chaining
 */
public native final FormField error(String val) /*-{
this.set("error", val); 
return this; 
}-*/;
/**
 * The name attribute to use on the field. Default Value: ""
 * @return
 */
public native final String name() /*-{
return this.get("name"); 
}-*/;

/**
 * The name attribute to use on the field. Default Value: "" 
 * @param val
 * @return this - for setter chaining
 */
public native final FormField name(String val) /*-{
this.set("name", val); 
return this; 
}-*/;

/**
 * Set true if this field must be filled out when submitted. Default Value: false 
 * @return
 */
public native final boolean required() /*-{
return this.get("required"); 
}-*/;

/**
 * Set true if this field must be filled out when submitted. Default Value: false
 * @param val
 * @return this - for setter chaining
 */
public native final FormField required(boolean val) /*-{
this.set("required", val); 
return this; 
}-*/;
}
