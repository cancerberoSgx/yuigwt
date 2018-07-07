package org.sgx.yuigwt.yuigallery.imagecropper;

import com.google.gwt.core.client.JavaScriptObject;
/**
 * The top, left, height, width and image url of the image being cropped 
 * @author sg
 *
 */
public class CropCoord extends JavaScriptObject {
protected CropCoord(){}
public static final native CropCoord create()/*-{
	return {}; 
}-*/;
/**
 * 
 * @return
 */
public native final double width() /*-{
return this.width; 
}-*/;

/**
 * 
 * @param val
 * @return this - for setter chaining
 */
public native final CropCoord width(double val) /*-{
this.width = val; 
return this; 
}-*/;

/**
 * 
 * @return
 */
public native final double height() /*-{
return this.height; 
}-*/;

/**
 * 
 * @param val
 * @return this - for setter chaining
 */
public native final CropCoord height(double val) /*-{
this.height = val; 
return this; 
}-*/;

/**
 * 
 * @return
 */
public native final double top() /*-{
return this.top; 
}-*/;

/**
 * 
 * @param val
 * @return this - for setter chaining
 */
public native final CropCoord top(double val) /*-{
this.top = val; 
return this; 
}-*/;

/**
 * 
 * @return
 */
public native final double left() /*-{
return this.left; 
}-*/;

/**
 * 
 * @param val
 * @return this - for setter chaining
 */
public native final CropCoord left(double val) /*-{
this.left = val; 
return this; 
}-*/;
}
