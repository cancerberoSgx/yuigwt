package org.sgx.yuigwt.yuigallery.colorpicker;

import com.google.gwt.core.client.JavaScriptObject;
/**
 * Represents a RGB color. RGB object notation, { r: 255, g: 0, b: 255 }. Default Value: {r: 255, g: 0, b: 0} 
 * @author sebastian
 *
 */
public class RGB extends JavaScriptObject {
	
protected RGB(){}
public static final native ColorPickerConfig create(double r, double g, double b)/*-{
return {"r": r, "g": g, "b": b}; 
}-*/;
public static final native ColorPickerConfig create()/*-{
return {"r": 255, "g": 0, "b": 0}; 
}-*/;

/**
 * 
 * @return
 */
public native final double r() /*-{
return this.r; 
}-*/;

/**
 * 
 * @param val
 * @return this - for setter chaining
 */
public native final RGB r(double val) /*-{
this.r = val; 
return this; 
}-*/;

/**
 * 
 * @return
 */
public native final double g() /*-{
return this.g; 
}-*/;

/**
 * 
 * @param val
 * @return this - for setter chaining
 */
public native final RGB g(double val) /*-{
this.g = val; 
return this; 
}-*/;

/**
 * 
 * @return
 */
public native final double b() /*-{
return this.b; 
}-*/;

/**
 * 
 * @param val
 * @return this - for setter chaining
 */
public native final RGB b(double val) /*-{
this.b = val; 
return this; 
}-*/;
}
