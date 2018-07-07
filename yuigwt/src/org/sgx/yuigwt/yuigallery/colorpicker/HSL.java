package org.sgx.yuigwt.yuigallery.colorpicker;

import com.google.gwt.core.client.JavaScriptObject;

/**
 * represents a HSL color. HSL floating point object notation, { h: 1.0, s: 0, l: 1.0 }. All values are normalized in the range 0 - 1. Default Value: {h: 0, s: 1, l: 0.5} 
 * @author sg
 *
 */
public class HSL extends JavaScriptObject {
protected HSL(){}
public static final native ColorPickerConfig create(double h, double s, double l)/*-{
return {"h": h, "s": s, "l": l}; 
}-*/;
public static final native ColorPickerConfig create()/*-{
return {"h": 0, "s": 1, "l": 0.5}; 
}-*/;

/**
 * 
 * @return
 */
public native final double h() /*-{
return this.h; 
}-*/;

/**
 * 
 * @param val
 * @return this - for setter chaining
 */
public native final HSL h(double val) /*-{
this.h = val; 
return this; 
}-*/;

/**
 * 
 * @return
 */
public native final double s() /*-{
return this.s; 
}-*/;

/**
 * 
 * @param val
 * @return this - for setter chaining
 */
public native final HSL s(double val) /*-{
this.s = val; 
return this; 
}-*/;

/**
 * 
 * @return
 */
public native final double l() /*-{
return this.l; 
}-*/;

/**
 * 
 * @param val
 * @return this - for setter chaining
 */
public native final HSL l(double val) /*-{
this.l = val; 
return this; 
}-*/;
}
