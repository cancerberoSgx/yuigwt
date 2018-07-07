package org.sgx.yuigwt.yuigallery.colorpicker;

import org.sgx.yuigwt.yui.widget.Widget;
/**
 * ColorPicker is a widget that provides a HTML5 based canvas interface to selecting colors using the HSL format. It provides a thumb from which to select colors as well as sliders and text areas for manually entering values. You can retrieve the currently selected color through a variety of properties, allowing you to select colors in HSL, RGB and Hex formats. 
 * @see http://benjamind.github.com/yui3-gallery/colorpicker/Y.ColorPicker.html
 * @see http://yuilibrary.com/gallery/show/colorpicker
 * @author sg
 *
 */
public class ColorPicker extends Widget {
protected ColorPicker(){}

//attributes
/**
 * The height of the color bars in pixels. Default Value: 150
 * @return the attribute
 */
public final native int barHeight()/*-{
return this.get("barHeight");
}-*/;

/**
 * The height of the color bars in pixels. Default Value: 150
 * @param val
 * @return self for method chaining
 */
public final native ColorPicker barHeight(int val)/*-{
this.set("barHeight", val);
return this; 
}-*/;

/**
 * The width of the color bars in pixels. Default Value: 20
 * @return the attribute
 */
public final native int barWidth()/*-{
return this.get("barWidth");
}-*/;

/**
 * The width of the color bars in pixels. Default Value: 20
 * @param val
 * @return self for method chaining
 */
public final native ColorPicker barWidth(int val)/*-{
this.set("barWidth", val);
return this; 
}-*/;

/**
 * Controls if the color bars should be cached in memory. New color bars are generated as the Hue and Saturation values change, these generated images will be saved in memory if cacheBars is enabled. This may marginally increase performance at the cost of memory usage. Disabled by default. Default Value: false
 * @return the attribute
 */
public final native boolean cacheBars()/*-{
return this.get("cacheBars");
}-*/;

/**
 * Controls if the color bars should be cached in memory. New color bars are generated as the Hue and Saturation values change, these generated images will be saved in memory if cacheBars is enabled. This may marginally increase performance at the cost of memory usage. Disabled by default. Default Value: false
 * @param val
 * @return self for method chaining
 */
public final native ColorPicker cacheBars(boolean val)/*-{
this.set("cacheBars", val);
return this; 
}-*/;

/**
 * Gets or sets the selected color of the picker using HEX notation, e.g. FFFFFF. Default Value: 'FF0000' 
 * @return the attribute
 */
public final native String hex()/*-{
return this.get("hex");
}-*/;

/**
 * Gets or sets the selected color of the picker using HEX notation, e.g. FFFFFF. Default Value: 'FF0000'
 * @param val
 * @return self for method chaining
 */
public final native ColorPicker hex(String val)/*-{
this.set("hex", val);
return this; 
}-*/;

/**
 * Gets or sets the selected color of the picker using HSL floating point object notation, { h: 1.0, s: 0, l: 1.0 }. All values are normalized in the range 0 - 1. Default Value: {h: 0, s: 1, l: 0.5}
 * @return the attribute
 */
public final native HSL hsl()/*-{
return this.get("hsl");
}-*/;

/**
 * Gets or sets the selected color of the picker using HSL floating point object notation, { h: 1.0, s: 0, l: 1.0 }. All values are normalized in the range 0 - 1. Default Value: {h: 0, s: 1, l: 0.5}
 * @param val
 * @return self for method chaining
 */
public final native ColorPicker hsl(HSL val)/*-{
this.set("hsl", val);
return this; 
}-*/;

/**
 * Gets or sets the selected color of the picker using HSL integer object notation, { h: 360, s: 0, l: 100 }. Hue is represented in the range 0 - 360, saturation and lightness are in the range 0 - 100. Default Value: {h: 0, s: 100, l: 50}
 * @return the attribute
 */
public final native HSL hslInt()/*-{
return this.get("hslInt");
}-*/;

/**
 * Gets or sets the selected color of the picker using HSL integer object notation, { h: 360, s: 0, l: 100 }. Hue is represented in the range 0 - 360, saturation and lightness are in the range 0 - 100. Default Value: {h: 0, s: 100, l: 50}
 * @param val
 * @return self for method chaining
 */
public final native ColorPicker hslInt(HSL val)/*-{
this.set("hslInt", val);
return this; 
}-*/;

/**
 * Gets or sets the selected color of the picker using RGB object notation, { r: 255, g: 0, b: 255 }. Default Value: {r: 255, g: 0, b: 0}
 * @return the attribute
 */
public final native RGB rgb()/*-{
return this.get("rgb");
}-*/;

/**
 * Gets or sets the selected color of the picker using RGB object notation, { r: 255, g: 0, b: 255 }. Default Value: {r: 255, g: 0, b: 0} 
 * @param val
 * @return self for method chaining
 */
public final native ColorPicker rgb(RGB val)/*-{
this.set("rgb", val);
return this; 
}-*/;
/**
 * Controls visibility of the HEX text box.Default Value: true
 * @return the attribute
 */
public final native boolean showHEX()/*-{
return this.get("showHEX");
}-*/;

/**
 * Controls visibility of the HEX text box.Default Value: true
 * @param val
 * @return self for method chaining
 */
public final native ColorPicker showHEX(boolean val)/*-{
this.set("showHEX", val);
return this; 
}-*/;
/**
 * Controls visibility of the Hue, Saturation and Lightness text boxes, allowing manual selection of specific values. Default Value: true 
 * @return the attribute
 */
public final native boolean showHSL()/*-{
return this.get("showHSL");
}-*/;

/**
 * Controls visibility of the Hue, Saturation and Lightness text boxes, allowing manual selection of specific values. Default Value: true
 * @param val
 * @return self for method chaining
 */
public final native ColorPicker showHSL(boolean val)/*-{
this.set("showHSL", val);
return this; 
}-*/;
/**
 * Controls visibility of the Hue, Saturation and Lightness color bars from which colors can be selected. Default Value: true 
 * @return the attribute
 */
public final native boolean showHSLBars()/*-{
return this.get("showHSLBars");
}-*/;

/**
 * Controls visibility of the Hue, Saturation and Lightness color bars from which colors can be selected. Default Value: true
 * @param val
 * @return self for method chaining
 */
public final native ColorPicker showHSLBars(boolean val)/*-{
this.set("showHSLBars", val);
return this; 
}-*/;
/**
 * Controls visibility of the Red, Green and Blue text boxes, allowing manual selection of specific values.Default Value: true
 * @return the attribute
 */
public final native boolean showRGB()/*-{
return this.get("showRGB");
}-*/;

/**
 * Controls visibility of the Red, Green and Blue text boxes, allowing manual selection of specific values.Default Value: true
 * @param val
 * @return self for method chaining
 */
public final native ColorPicker showRGB(boolean val)/*-{
this.set("showRGB", val);
return this; 
}-*/;

/**
 * Controls visibility of the color swatch area which displays the current color. Default Value: true 
 * @return the attribute
 */
public final native boolean showSwatch()/*-{
return this.get("showSwatch");
}-*/;

/**
 * Controls visibility of the color swatch area which displays the current color. Default Value: true
 * @param val
 * @return self for method chaining
 */
public final native ColorPicker showSwatch(boolean val)/*-{
this.set("showSwatch", val);
return this; 
}-*/;
/**
 * The height of the color selector area in pixels. Default Value: 150 
 * @return the attribute
 */
public final native double squareHeight()/*-{
return this.get("squareHeight");
}-*/;

/**
 * The height of the color selector area in pixels. Default Value: 150
 * @param val
 * @return self for method chaining
 */
public final native ColorPicker squareHeight(double val)/*-{
this.set("squareHeight", val);
return this; 
}-*/;

/**
 * The width of the color selector area in pixels. Default Value: 150 
 * @return the attribute
 */
public final native double squareWidth()/*-{
return this.get("squareWidth");
}-*/;

/**
 * The width of the color selector area in pixels. Default Value: 150
 * @param val
 * @return self for method chaining
 */
public final native ColorPicker squareWidth(double val)/*-{
this.set("squareWidth", val);
return this; 
}-*/;

/**
 * The height of the color swatch in pixels. Default Value: 34
 * @return the attribute
 */
public final native double swatchHeight()/*-{
return this.get("swatchHeight");
}-*/;

/**
 * The height of the color swatch in pixels. Default Value: 34
 * @param val
 * @return self for method chaining
 */
public final native ColorPicker swatchHeight(double val)/*-{
this.set("swatchHeight", val);
return this; 
}-*/;
/**
 * The width of the color swatch in pixels. Default Value: 110 
 * @return the attribute
 */
public final native double swatchWidth()/*-{
return this.get("swatchWidth");
}-*/;

/**
 * The width of the color swatch in pixels. Default Value: 110	
 * @param val
 * @return self for method chaining
 */
public final native ColorPicker swatchWidth(double val)/*-{
this.set("swatchWidth", val);
return this; 
}-*/;
}
