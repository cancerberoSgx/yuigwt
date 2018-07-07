package org.sgx.yuigwt.yuigallery.form;

import com.google.gwt.core.client.JavaScriptObject;
import com.google.gwt.core.client.JsArray;

/**
 * this class should extend WidgetExtConfig but due to inconsistencies (method
 * overriding) it will not
 * 
 * @author sg
 * 
 */
public class FormFieldConfig extends JavaScriptObject {
	protected FormFieldConfig() {
	}

	public static final native FormFieldConfig create()/*-{
		return {};
	}-*/;

	public static final native FormFieldConfig create(String type)/*-{
		return {
			"type" : type
		};
	}-*/;

	/**
	 * 
	 * @return
	 */
	public native final String name() /*-{
		return this.name;
	}-*/;

	/**
	 * 
	 * @param val
	 * @return this - for setter chaining
	 */
	public native final FormFieldConfig name(String val) /*-{
		this.name = val;
		return this;
	}-*/;

	/**
	 * 
	 * @return
	 */
	public native final String type() /*-{
		return this.type;
	}-*/;

	/**
	 * 
	 * @param val
	 * @return this - for setter chaining
	 */
	public native final FormFieldConfig type(String val) /*-{
		this.type = val;
		return this;
	}-*/;

	/**
	 * 
	 * @return
	 */
	public native final String label() /*-{
		return this.label;
	}-*/;

	/**
	 * 
	 * @param val
	 * @return this - for setter chaining
	 */
	public native final FormFieldConfig label(String val) /*-{
		this.label = val;
		return this;
	}-*/;

	/**
	 * 
	 * @return
	 */
	public native final String validator() /*-{
		return this.validator;
	}-*/;

	/**
	 * 
	 * @param val
	 * @return this - for setter chaining
	 */
	public native final FormFieldConfig validator(String val) /*-{
		this.validator = val;
		return this;
	}-*/;

	/**
	 * 
	 * @return
	 */
	public native final String value() /*-{
		return this.value;
	}-*/;

	/**
	 * 
	 * @param val
	 * @return this - for setter chaining
	 */
	public native final FormFieldConfig value(String val) /*-{
		this.value = val;
		return this;
	}-*/;

	/**
	 * The choices to render into this field 
	 * @return
	 */
	public native final JsArray<FormFieldConfig> choices() /*-{
		return this.choices;
	}-*/;

	/**
	 * The choices to render into this field 
	 * @param val
	 * @return this - for setter chaining
	 */
	public native final FormFieldConfig choices(JsArray<FormFieldConfig> val) /*-{
		this.choices = val;
		return this;
	}-*/;

	/**
	 * 
	 * @param val
	 * @return this - for setter chaining
	 */
	public native final FormFieldConfig choices(FormFieldConfig... val) /*-{
		this.choices = @org.sgx.yuigwt.yui.util.JsUtil::toJsArray([Lcom/google/gwt/core/client/JavaScriptObject;)(val);
		return this;
	}-*/;

	/**
	 * Set to true to allow multiple values to be selected. Default Value: false
	 * 
	 * @return
	 */
	public native final boolean multi() /*-{
		return this.multi;
	}-*/;

	/**
	 * Set to true to allow multiple values to be selected. Default Value: false
	 * 
	 * @param val
	 * @return this - for setter chaining
	 */
	public native final FormFieldConfig multi(boolean val) /*-{
		this.multi = val;
		return this;
	}-*/;

/**
 * Set to true to disable the field. Default Value: false
 * @return
 */
public native final boolean disabled() /*-{
return this.disabled; 
}-*/;

/**
 * Set to true to disable the field. Default Value: false
 * @param val
 * @return this - for setter chaining
 */
public native final FormFieldConfig disabled(boolean val) /*-{
this.disabled = val; 
return this; 
}-*/;
/**
 * An error message associated with this field. Setting this will cause validation to fail until a new value is entered 
 * @return
 */
public native final String error() /*-{
return this.error; 
}-*/;

/**
 * An error message associated with this field. Setting this will cause validation to fail until a new value is entered 
 * @param val
 * @return this - for setter chaining
 */
public native final FormFieldConfig error(String val) /*-{
this.error = val; 
return this; 
}-*/;

/**
 * Set true if this field must be filled out when submitted. Default Value: false
 * @return
 */
public native final boolean required() /*-{
return this.required; 
}-*/;

/**
 * Set true if this field must be filled out when submitted. Default Value: false
 * @param val
 * @return this - for setter chaining
 */
public native final FormFieldConfig required(boolean val) /*-{
this.required = val; 
return this; 
}-*/;
}
