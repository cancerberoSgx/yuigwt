package org.sgx.yuigwt.yuigallery.form;

import org.sgx.yuigwt.yui.widget.WidgetConfig;
import org.sgx.yuigwt.yui.widget.ext.WidgetExtConfig;

/**
 * These are the configuration properties for Form. 
 * The Form module allows for the programmatic creation of form and form field nodes. The available field nodes are TextField, HiddenField, CheckboxField, SelectField, ChoiceField, TextAreaField, and Buttons (a much less robust version than YUI 2's Button module). Fields can be manually instantiated and added to your Form, or configuration parameters may be passed directly when creating the Form and it will generate your Fields for you. There is also limited HTML parsing ability to pull in your Form data, but it is not yet fully baked.
 *
 * @see http://yuilibrary.com/gallery/show/form
 * @author sg
 *
 */
public class FormConfig extends WidgetExtConfig {
protected FormConfig(){}

public static final native FormConfig create()/*-{
	return {}; 
}-*/;

/**
 * A url to which the validated form is to be sent 
 * @return
 */
public native final String formAction() /*-{
return this.action; 
}-*/;

/**
 * A url to which the validated form is to be sent 
 * @param val
 * @return this - for setter chaining
 */
public native final FormConfig action(String val) /*-{
this.action = val; 
return this; 
}-*/;

/**
 * Set to Form.MULTIPART_ENCODED in order to use the FileField for uploads. Default Value: Form.URL_ENCODED 
 * @return
 */
public native final int encodingType() /*-{
return this.encodingType; 
}-*/;

/**
 * Set to Form.MULTIPART_ENCODED in order to use the FileField for uploads. Default Value: Form.URL_ENCODED 
 * @param val
 * @return this - for setter chaining
 */
public native final FormConfig encodingType(int val) /*-{
this.encodingType = val; 
return this; 
}-*/;

/**
 * Set to true to validate fields "on the fly", where they will validate themselves any time the value attribute is changed. Default Value: false  
 * @return
 */
public native final boolean inlineValidation() /*-{
return this.inlineValidation; 
}-*/;

/**
 * Set to true to validate fields "on the fly", where they will validate themselves any time the value attribute is changed. Default Value: false 
 * @param val
 * @return this - for setter chaining
 */
public native final FormConfig inlineValidation(boolean val) /*-{
this.inlineValidation = val; 
return this; 
}-*/;

/**
 * The method by which the form should be transmitted. Valid values are 'get' and 'post' . Default Value: 'post' 
 * @return
 */
public native final String method() /*-{
return this.method; 
}-*/;

/**
 * The method by which the form should be transmitted. Valid values are 'get' and 'post' . Default Value: 'post' 
 * @param val
 * @return this - for setter chaining
 */
public native final FormConfig method(String val) /*-{
this.method = val; 
return this; 
}-*/;

/**
 * If true, the form is reset following a successful submit event. Default Value: true
 * @return
 */
public native final boolean resetAfterSubmit() /*-{
return this.resetAfterSubmit; 
}-*/;

/**
 * If true, the form is reset following a successful submit event. Default Value: true
 * @param val
 * @return this - for setter chaining
 */
public native final FormConfig resetAfterSubmit(boolean val) /*-{
this.resetAfterSubmit = val; 
return this; 
}-*/;

/**
 * Set to true to skip the validation step when submitting 
 * @return
 */
public native final boolean skipValidationBeforeSubmit() /*-{
return this.skipValidationBeforeSubmit; 
}-*/;

/**
 * Set to true to skip the validation step when submitting 
 * @param val
 * @return this - for setter chaining
 */
public native final FormConfig skipValidationBeforeSubmit(boolean val) /*-{
this.skipValidationBeforeSubmit = val; 
return this; 
}-*/;
}
