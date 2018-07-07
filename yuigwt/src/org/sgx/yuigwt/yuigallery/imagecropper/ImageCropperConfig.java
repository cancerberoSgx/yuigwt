package org.sgx.yuigwt.yuigallery.imagecropper;

import org.sgx.yuigwt.yui.node.Node;
import org.sgx.yuigwt.yui.util.Point;
import org.sgx.yuigwt.yui.widget.ext.WidgetExtConfig;
/**
 * @see http://juandopazo.github.com/yui3-gallery/src/gallery-imagecropper/api/classes/ImageCropperTest1.html
 * @author sg
 *
 */
public class ImageCropperConfig extends WidgetExtConfig {
protected ImageCropperConfig(){}
public static final native ImageCropperConfig create()/*-{
	return {}; 
}-*/;

/**
 * Set the initlal height of the crop area, defaults to minHeight
 * @return
 */
public native final double initHeight() /*-{
return this.initHeight; 
}-*/;

/**
 * Set the initlal height of the crop area, defaults to minHeight
 * @param val
 * @return this - for setter chaining
 */
public native final ImageCropperConfig initHeight(double val) /*-{
this.initHeight = val; 
return this; 
}-*/;

/**
 * Array of the XY position that we need to set the crop element to when we build it
 * @return
 */
public native final Point initialXY() /*-{
return this.initialXY; 
}-*/;

/**
 * Array of the XY position that we need to set the crop element to when we build it
 * @param val
 * @return this - for setter chaining
 */
public native final ImageCropperConfig initialXY(Point val) /*-{
this.initialXY = val; 
return this; 
}-*/;

/**
 * Set the initlal width of the crop area, defaults to minWidth
 * @return
 */
public native final double initWidth() /*-{
return this.initWidth; 
}-*/;

/**
 * Set the initlal width of the crop area, defaults to minWidth
 * @param val
 * @return this - for setter chaining
 */
public native final ImageCropperConfig initWidth(double val) /*-{
this.initWidth = val; 
return this; 
}-*/;

/**
 * The pixel tick for the arrow keys. Default: 1
 * @return
 */
public native final double keyTick() /*-{
return this.keyTick; 
}-*/;

/**
 * The pixel tick for the arrow keys. Default: 1
 * @param val
 * @return this - for setter chaining
 */
public native final ImageCropperConfig keyTick(double val) /*-{
this.keyTick = val; 
return this; 
}-*/;
/**
 * MinHeight of the crop area. default 50
 * @return
 */
public native final double minHeight() /*-{
return this.minHeight; 
}-*/;

/**
 * MinHeight of the crop area. default 50
 * @param val
 * @return this - for setter chaining
 */
public native final ImageCropperConfig minHeight(double val) /*-{
this.minHeight = val; 
return this; 
}-*/;

/**
 * MinWidth of the crop area. Default: 50
 * @return
 */
public native final double minWidth() /*-{
return this.minWidth; 
}-*/;

/**
 * MinWidth of the crop area. Default: 50
 * @param val
 * @return this - for setter chaining
 */
public native final ImageCropperConfig minWidth(double val) /*-{
this.minWidth = val; 
return this; 
}-*/;
/**
 * The resized element
 * @return
 */
public native final Node resizeKnob() /*-{
return this.resizeKnob; 
}-*/;

/**
 * The resized element
 * @param val
 * @return this - for setter chaining
 */
public native final ImageCropperConfig resizeKnob(Node val) /*-{
this.resizeKnob = val; 
return this; 
}-*/;
/**
 *  The resize mask used to highlight the crop area
 * @return
 */
public native final Node ResizeMask() /*-{
return this.ResizeMask; 
}-*/;

/**
 *  The resize mask used to highlight the crop area
 * @param val
 * @return this - for setter chaining
 */
public native final ImageCropperConfig ResizeMask(Node val) /*-{
this.ResizeMask = val; 
return this; 
}-*/;

/**
 * The pixel tick for shift + the arrow keys. Default: 10
 * @return
 */
public native final int shiftKeyTick() /*-{
return this.shiftKeyTick; 
}-*/;

/**
 * The pixel tick for shift + the arrow keys. Default: 10
 * @param val
 * @return this - for setter chaining
 */
public native final ImageCropperConfig shiftKeyTick(int val) /*-{
this.shiftKeyTick = val; 
return this; 
}-*/;

/**
 * The source attribute of the image we are cropping
 * @return
 */
public native final String source() /*-{
return this.source; 
}-*/;

/**
 * The source attribute of the image we are cropping
 * @param val
 * @return this - for setter chaining
 */
public native final ImageCropperConfig source(String val) /*-{
this.source = val; 
return this; 
}-*/;

/**
 * Show the Resize and Drag utilities statu
 * @return
 */
public native final boolean status() /*-{
return this.status; 
}-*/;

/**
 * Show the Resize and Drag utilities statu
 * @param val
 * @return this - for setter chaining
 */
public native final ImageCropperConfig status(boolean val) /*-{
this.status = val; 
return this; 
}-*/;

/**
 * Should we use the Arrow keys to position the crop element. Default: true
 * @return
 */
public native final boolean useKeys() /*-{
return this.useKeys; 
}-*/;

/**
 * Should we use the Arrow keys to position the crop element. Default: true
 * @param val
 * @return this - for setter chaining
 */
public native final ImageCropperConfig useKeys(boolean val) /*-{
this.useKeys = val; 
return this; 
}-*/;
}
