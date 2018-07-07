package org.sgx.yuigwt.yuigallery.form;

import org.sgx.yuigwt.yui.widget.ext.WidgetExt;

/**
 * <p>
 * The Form module allows for the programmatic creation of form and form field
 * nodes. The available field nodes are TextField, HiddenField, CheckboxField,
 * SelectField, ChoiceField, TextAreaField, and Buttons (a much less robust
 * version than YUI 2's Button module). Fields can be manually instantiated and
 * added to your Form, or configuration parameters may be passed directly when
 * creating the Form and it will generate your Fields for you. There is also
 * limited HTML parsing ability to pull in your Form data, but it is not yet
 * fully baked.
 * </p>
 * 
 * <p>
 * Creates an form which contains fields, and does clientside validation, as
 * well as handling input from the server.
 * </p>
 * 
 * @see http://yuilibrary.com/gallery/show/form
 * @author sg
 * 
 */
public class Form extends WidgetExt {
	protected Form() {
	}

	public static final String FIELD_TEXT = "text", 
			FIELD_HIDDEN = "HiddenField", 
			FIELD_SELECT = "SelectField", 
			FIELD_CHOICE = "ChoiceField", 
			FIELD_CHECKBOX = "CheckboxField",
			FIELD_FILE = "FileField"; // TODO: others

	/**
	 * Get a form field by its name attribute or numerical index
	 */
	public native final Form getField(String sel) /*-{
		return this.getField(sel);
	}-*/;

	/**
	 * Get a form field by its name attribute or numerical index
	 */
	public native final FormField getField(int sel) /*-{
		return this.getField(sel);
	}-*/;

	/**
	 * Resets all form fields to their initial value
	 * 
	 * @return self for method chaining
	 */
	public native final Form reset() /*-{
		this.reset();
		return this;
	}-*/;

	/**
	 * Submits the form using the defined method to the URL defined in the
	 * action
	 * 
	 * @return self for method chaining
	 */
	public native final Form submit() /*-{
		this.reset();
		return this;
	}-*/;
	
	
	
	//attributes
	
/**
 * An url to which the validated form is to be sent. Default Value: '.' 
 * @return
 */
public native final String action() /*-{
return this.get("action"); 
}-*/;

/**
 * An url to which the validated form is to be sent. Default Value: '.'
 * @param val
 * @return this - for setter chaining
 */
public native final Form action(String val) /*-{
this.set("action", val); 
return this; 
}-*/;
/**
 * Set to Form.MULTIPART_ENCODED in order to use the FileField for uploads. Default Value: Form.URL_ENCODED
 * @return
 */
public native final int encodingType() /*-{
return this.get("encodingType"); 
}-*/;

/**
 * Set to Form.MULTIPART_ENCODED in order to use the FileField for uploads. Default Value: Form.URL_ENCODED
 * @param val
 * @return this - for setter chaining
 */
public native final Form encodingType(int val) /*-{
this.set("encodingType", val); 
return this; 
}-*/;

/**
 * Set to true to validate fields "on the fly", where they will validate themselves any time the value attribute is changed. Default Value: false
 * @return
 */
public native final boolean inlineValidation() /*-{
return this.get("inlineValidation"); 
}-*/;

/**
 * Set to true to validate fields "on the fly", where they will validate themselves any time the value attribute is changed. Default Value: false
 * @param val
 * @return this - for setter chaining
 */
public native final Form inlineValidation(boolean val) /*-{
this.set("inlineValidation", val); 
return this; 
}-*/;

/**
 * The method by which the form should be transmitted. Valid values are 'get' and 'post' . Default Value: 'post' 
 * @return
 */
public native final String method() /*-{
return this.get("method"); 
}-*/;

/**
 * The method by which the form should be transmitted. Valid values are 'get' and 'post' . Default Value: 'post' 
 * @param val
 * @return this - for setter chaining
 */
public native final Form method(String val) /*-{
this.set("method", val); 
return this; 
}-*/;

/**
 * If true, the form is reset following a successful submit event. Default Value: true 
 * @return
 */
public native final boolean resetAfterSubmit() /*-{
return this.get("resetAfterSubmit"); 
}-*/;

/**
 * If true, the form is reset following a successful submit event. Default Value: true
 * @param val
 * @return this - for setter chaining
 */
public native final Form resetAfterSubmit(boolean val) /*-{
this.set("resetAfterSubmit", val); 
return this; 
}-*/;

/**
 * Set to true to skip the validation step when submitting. Default Value: false 
 * @return
 */
public native final boolean skipValidationBeforeSubmit() /*-{
return this.get("skipValidationBeforeSubmit"); 
}-*/;

/**
 * Set to true to skip the validation step when submitting. Default Value: false
 * @param val
 * @return this - for setter chaining
 */
public native final Form skipValidationBeforeSubmit(boolean val) /*-{
this.set("skipValidationBeforeSubmit", val); 
return this; 
}-*/;
}
