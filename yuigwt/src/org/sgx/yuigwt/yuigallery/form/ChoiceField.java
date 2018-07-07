package org.sgx.yuigwt.yuigallery.form;
/**
 * A form field which allows one or multiple values from a selection of choices 
 * @author sg
 *
 */
public class ChoiceField extends FormField {
protected ChoiceField(){}

/**
 * Set to true to allow multiple values to be selected. Default Value: false
 * @return
 */
public native final boolean multi() /*-{
return this.get("multi"); 
}-*/;

/**
 * Set to true to allow multiple values to be selected. Default Value: false
 * @param val
 * @return this - for setter chaining
 */
public native final ChoiceField multi(boolean val) /*-{
this.set("multi", val); 
return this; 
}-*/;
}
