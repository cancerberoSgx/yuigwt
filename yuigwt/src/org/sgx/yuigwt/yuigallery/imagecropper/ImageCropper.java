package org.sgx.yuigwt.yuigallery.imagecropper;

import org.sgx.yuigwt.yui.node.Node;
import org.sgx.yuigwt.yui.widget.ext.WidgetExt;
/**
 * An Image Cropper control. Unofficial port of the ImageCropper from YUI2.x.

Main differences are:

    Keys only work when the resize element is focused<br/>
    'ratio' attribute is now 'preserveRatio'<br/>

 * @see http://juandopazo.github.com/yui3-gallery/src/gallery-imagecropper/api/classes/ImageCropper.html
 * @see http://yuilibrary.com/gallery/show/imagecropper
 * @author sg
 *
 */
public class ImageCropper extends WidgetExt {
protected ImageCropper(){}

/**
 * Fires every time the crop area changes. Unifies drag:drag and resize:resize.
 */
public static final String EVENT_CROPCROP="crop:crop"; 

/**
 * Fires at the end of a crop operation. Unifies drag:end and resize:end.
 */
public static final String EVENT_CROPEND="crop:end";

/**
 * Fires at the start of a crop operation. Unifies drag:start and and resize:start.
 */
public static final String EVENT_CROPSTART="crop:start"; 

/**
 * Relay of the Drag utility event.
 */
public static final String EVENT_DRAGEND="drag:end"; 
/**
 * Relay of the Drag utility event.
 */
public static final String EVENT_DRAGRESIZE="drag:resize"; 
/**
 * Relay of the Drag utility event.
 */
public static final String EVENT_DRAGSTART="drag:start"; 
/**
 * Relay of the Resize utility event.
 */
public static final String EVENT_RESIZEEND="resize:end";
/**
 * Relay of the Resize utility event.
 */
public static final String EVENT_RESIZERESIZE="resize:resize";
/**
 * Relay of the Resize utility event.
 */
public static final String EVENT_RESIZESTART="resize:start"; 

/**
 * @return Returns the coordinates needed to crop the image
 */
public native final CropCoord getCropCoords() /*-{
return this.getCropCoords(); 
}-*/;

/**
 * Resets the crop element back to it's original position
 * @return self for method chaining
 */
public native final ImageCropper reset() /*-{
this.reset(); 
return this; 
}-*/;


//attributes
/**
 * Element used to shadow the part of the image we're not cropping
 * @return the attribute
 */
public final native Node cropMask()/*-{
return this.get("cropMask");
}-*/;

/**
 * Element used to shadow the part of the image we're not cropping
 * @param val
 * @return self for method chaining
 */
public final native ImageCropper cropMask(Node val)/*-{
this.set("cropMask", val);
return this; 
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
public native final ImageCropper initHeight(double val) /*-{
this.initHeight = val; 
return this; 
}-*/;
/**
 * MinHeight of the crop area
 * @return the attribute
 */
public final native double minHeight()/*-{
return this.get("minHeight");
}-*/;
/**
 * The pixel tick for the arrow keys. default 1
 * @return the attribute
 */
public final native double keyTick()/*-{
return this.get("keyTick");
}-*/;

/**
 * The pixel tick for the arrow keys. default 1
 * @param val
 * @return self for method chaining
 */
public final native ImageCropper keyTick(double val)/*-{
this.set("keyTick", val);
return this; 
}-*/;
/**
 * MinHeight of the crop area
 * @param val
 * @return self for method chaining
 */
public final native ImageCropper minHeight(double val)/*-{
this.set("minHeight", val);
return this; 
}-*/;
/**
 * MinWidth of the crop area. Default: 50
 * @return the attribute
 */
public final native double minWidth()/*-{
return this.get("minWidth");
}-*/;

/**
 * MinWidth of the crop area. Default: 50
 * @param val
 * @return self for method chaining
 */
public final native ImageCropper minWidth(double val)/*-{
this.set("minWidth", val);
return this; 
}-*/;

/**
 * Set the preserveRatio config option of the Resize Utlility
 * @return the attribute
 */
public final native boolean preserveRatio()/*-{
return this.get("preserveRatio");
}-*/;

/**
 * Set the preserveRatio config option of the Resize Utlility
 * @param val
 * @return self for method chaining
 */
public final native ImageCropper preserveRatio(boolean val)/*-{
this.set("preserveRatio", val);
return this; 
}-*/;

/**
 *  The resized element
 * @return the attribute
 */
public final native Node resizeKnob()/*-{
return this.get("resizeKnob");
}-*/;

/**
 * The resized element
 * @param val
 * @return self for method chaining
 */
public final native ImageCropper resizeKnob(Node val)/*-{
this.set("resizeKnob", val);
return this; 
}-*/;

/**
 * The resize mask used to highlight the crop area
 * @return the attribute
 */
public final native Node resizeMask()/*-{
return this.get("resizeMask");
}-*/;

/**
 * The resize mask used to highlight the crop area
 * @param val
 * @return self for method chaining
 */
public final native ImageCropper resizeMask(Node val)/*-{
this.set("resizeMask", val);
return this; 
}-*/;

/**
 * The pixel tick for shift + the arrow keys. Default: 10
 * @return the attribute
 */
public final native int shiftKeyTick()/*-{
return this.get("shiftKeyTick");
}-*/;

/**
 * The pixel tick for shift + the arrow keys. Default: 10
 * @param val
 * @return self for method chaining
 */
public final native ImageCropper shiftKeyTick(int val)/*-{
this.set("shiftKeyTick", val);
return this; 
}-*/;

/**
 * The source attribute of the image we are cropping
 * @return the attribute
 */
public final native String source()/*-{
return this.get("source");
}-*/;

/**
 * The source attribute of the image we are cropping
 * @param val
 * @return self for method chaining
 */
public final native ImageCropper source(String val)/*-{
this.set("source", val);
return this; 
}-*/;

/**
 * Show the Resize and Drag utilities statu
 * @return the attribute
 */
public final native boolean status()/*-{
return this.get("status");
}-*/;

/**
 * Show the Resize and Drag utilities statu
 * @param val
 * @return self for method chaining
 */
public final native ImageCropper status(boolean val)/*-{
this.set("status", val);
return this; 
}-*/;

/**
 * Should we use the Arrow keys to position the crop element. Default: true
 * @return the attribute
 */
public final native boolean useKeys()/*-{
return this.get("useKeys");
}-*/;

/**
 * Should we use the Arrow keys to position the crop element. Default: true
 * @param val
 * @return self for method chaining
 */
public final native ImageCropper useKeys(boolean val)/*-{
this.set("useKeys", val);
return this; 
}-*/;
}
