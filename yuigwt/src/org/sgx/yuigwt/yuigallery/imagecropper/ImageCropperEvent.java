package org.sgx.yuigwt.yuigallery.imagecropper;

import org.sgx.yuigwt.yui.widget.ext.WidgetExtEvent;

public class ImageCropperEvent extends WidgetExtEvent {
protected ImageCropperEvent(){}

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
public native final ImageCropperEvent left(double val) /*-{
this.left = val; 
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
public native final ImageCropperEvent top(double val) /*-{
this.top = val; 
return this; 
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
public native final ImageCropperEvent width(double val) /*-{
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
public native final ImageCropperEvent height(double val) /*-{
this.height = val; 
return this; 
}-*/;
}
