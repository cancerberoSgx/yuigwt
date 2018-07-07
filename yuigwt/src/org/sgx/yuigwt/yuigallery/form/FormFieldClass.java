package org.sgx.yuigwt.yuigallery.form;

import org.sgx.yuigwt.yui.widget.ext.WidgetExtClass;
/**
 * 
 * @author sg
 * 
 * //TODO: VALIDATE_*() methods
 *
 */
public class FormFieldClass extends WidgetExtClass {
protected FormFieldClass(){}

/**
 * 
 * @return
 */
public native final String FIELD_ID_SUFFIX() /*-{
return this.FIELD_ID_SUFFIX; 
}-*/;
/**
 * 
 * @return
 */
public native final FormFieldClass FIELD_ID_SUFFIX(String val) /*-{
this.FIELD_ID_SUFFIX=val; 
return this; 
}-*/;

/**
 * Template used to draw an input node
 * @return
 */
public native final String INPUT_TEMPLATE() /*-{
return this.INPUT_TEMPLATE; 
}-*/;
/**
 * Template used to draw an input node
 * @return
 */
public native final FormFieldClass INPUT_TEMPLATE(String val) /*-{
this.INPUT_TEMPLATE=val; 
return this; 
}-*/;

/**
 * Message to display when an invalid date is entered 
 * @return
 */
public native final String INVALID_DATE_MESSAGE() /*-{
return this.INVALID_DATE_MESSAGE; 
}-*/;

/**
 * Message to display when an invalid date is entered 
 * @return
 */
public native final FormFieldClass INVALID_DATE_MESSAGE(String val) /*-{
this.INVALID_DATE_MESSAGE=val; 
return this; 
}-*/;

/**
 *  Message to display when an invalid email address is entered 
 * @return
 */
public native final String INVALID_EMAIL_MESSAGE() /*-{
return this.INVALID_EMAIL_MESSAGE; 
}-*/;

/**
 *  Message to display when an invalid email address is entered 
 * @return
 */
public native final FormFieldClass INVALID_EMAIL_MESSAGE(String val) /*-{
this.INVALID_EMAIL_MESSAGE=val; 
return this; 
}-*/;

/**
 * Message to display when an invalid IP address is entered
 * @return
 */
public native final String INVALID_IP_MESSAGE() /*-{
return this.INVALID_IP_MESSAGE; 
}-*/;

/**
 * Message to display when an invalid IP address is entered
 * @return
 */
public native final FormFieldClass INVALID_IP_MESSAGE(String val) /*-{
this.INVALID_IP_MESSAGE=val; 
return this; 
}-*/;

/**
 * Message to display when an invalid phone number is entered 
 * @return
 */
public native final String INVALID_PHONE_NUMBER() /*-{
return this.INVALID_PHONE_NUMBER; 
}-*/;

/**
 * Message to display when an invalid phone number is entered 
 * @return
 */
public native final FormFieldClass INVALID_PHONE_NUMBER(String val) /*-{
this.INVALID_PHONE_NUMBER=val; 
return this; 
}-*/;

/**
 * Message to display when an invalid postal code is entered 
 * @return
 */
public native final String INVALID_POSTAL_CODE_MESSAGE() /*-{
return this.INVALID_POSTAL_CODE_MESSAGE; 
}-*/;

/**
 * Message to display when an invalid postal code is entered 
 * @return
 */
public native final FormFieldClass INVALID_POSTAL_CODE_MESSAGE(String val) /*-{
this.INVALID_POSTAL_CODE_MESSAGE=val; 
return this; 
}-*/;

/**
 * Message to display when invalid characters are entered 
 * @return
 */
public native final String INVALID_SPECIAL_CHARS() /*-{
return this.INVALID_SPECIAL_CHARS; 
}-*/;

/**
 * Message to display when invalid characters are entered 
 * @return
 */
public native final FormFieldClass INVALID_SPECIAL_CHARS(String val) /*-{
this.INVALID_SPECIAL_CHARS=val; 
return this; 
}-*/;
/**
 * Message to display when an invalid time is entered 
 * @return
 */
public native final String INVALID_TIME_MESSAGE() /*-{
return this.INVALID_TIME_MESSAGE; 
}-*/;

/**
 * Message to display when an invalid time is entered 
 * @return
 */
public native final FormFieldClass INVALID_TIME_MESSAGE(String val) /*-{
this.INVALID_TIME_MESSAGE=val; 
return this; 
}-*/;
 
/**
 * Template used to draw a label node 
 * @return
 */
public native final String LABEL_TEMPLATE() /*-{
return this.LABEL_TEMPLATE; 
}-*/;
/**
 * Template used to draw a label node 
 * @return
 */
public native final FormFieldClass LABEL_TEMPLATE(String val) /*-{
this.LABEL_TEMPLATE=val; 
return this; 
}-*/;

/**Error text to display for a required field 
 * @return
 */
public native final String REQUIRED_ERROR_TEXT() /*-{
return this.LABEL_TEMPLATE; 
}-*/;
/**Error text to display for a required field 
 * @return
 */
public native final FormFieldClass REQUIRED_ERROR_TEXT(String val) /*-{
this.LABEL_TEMPLATE=val; 
return this; 
}-*/;
}
