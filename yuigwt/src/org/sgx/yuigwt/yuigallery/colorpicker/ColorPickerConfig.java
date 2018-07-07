package org.sgx.yuigwt.yuigallery.colorpicker;

import org.sgx.yuigwt.yui.widget.WidgetConfig;

/**
 * ColorPicker is a widget that provides a HTML5 based canvas interface to selecting colors using the HSL format. It provides a thumb from which to select colors as well as sliders and text areas for manually entering values. You can retrieve the currently selected color through a variety of properties, allowing you to select colors in HSL, RGB and Hex formats. 
 * @see http://benjamind.github.com/yui3-gallery/colorpicker/Y.ColorPicker.html
 * @see http://yuilibrary.com/gallery/show/colorpicker
 * @author sg
 *
 */
public class ColorPickerConfig extends WidgetConfig {
protected ColorPickerConfig(){}
public static final native ColorPickerConfig create()/*-{
return {}; 
}-*/;

/**
 * The height of the color bars in pixels. Default Value: 150 
 * @return
 */
public native final int barHeight() /*-{
return this.barHeight; 
}-*/;

/**
 * The height of the color bars in pixels. Default Value: 150
 * @param val
 * @return this - for setter chaining
 */
public native final ColorPickerConfig barHeight(int val) /*-{
this.barHeight = val; 
return this; 
}-*/;

/**
 * The width of the color bars in pixels. Default Value: 20 
 * @return
 */
public native final int barWidth() /*-{
return this.barWidth; 
}-*/;

/**
 * The width of the color bars in pixels. Default Value: 20
 * @param val
 * @return this - for setter chaining
 */
public native final ColorPickerConfig barWidth(int val) /*-{
this.barWidth = val; 
return this; 
}-*/;

/**
 * Controls if the color bars should be cached in memory. New color bars are generated as the Hue and Saturation values change, these generated images will be saved in memory if cacheBars is enabled. This may marginally increase performance at the cost of memory usage. Disabled by default. Default Value: false 
 * @return
 */
public native final boolean cacheBars() /*-{
return this.cacheBars; 
}-*/;

/**
 * Controls if the color bars should be cached in memory. New color bars are generated as the Hue and Saturation values change, these generated images will be saved in memory if cacheBars is enabled. This may marginally increase performance at the cost of memory usage. Disabled by default. Default Value: false
 * @param val
 * @return this - for setter chaining
 */
public native final ColorPickerConfig cacheBars(boolean val) /*-{
this.cacheBars = val; 
return this; 
}-*/;

/**
 * Gets or sets the selected color of the picker using HEX notation, e.g. FFFFFF. Default Value: 'FF0000'
 * @return
 */
public native final String hex() /*-{
return this.hex; 
}-*/;

/**
 * Gets or sets the selected color of the picker using HEX notation, e.g. FFFFFF. Default Value: 'FF0000'
 * @param val
 * @return this - for setter chaining
 */
public native final ColorPickerConfig hex(String val) /*-{
this.hex = val; 
return this; 
}-*/;

/**
 * Gets or sets the selected color of the picker using HSL floating point object notation, { h: 1.0, s: 0, l: 1.0 }. All values are normalized in the range 0 - 1. Default Value: {h: 0, s: 1, l: 0.5}
 * @return
 */
public native final HSL hsl() /*-{
return this.hsl; 
}-*/;

/**
 * Gets or sets the selected color of the picker using HSL floating point object notation, { h: 1.0, s: 0, l: 1.0 }. All values are normalized in the range 0 - 1. Default Value: {h: 0, s: 1, l: 0.5} 
 * @param val
 * @return this - for setter chaining
 */
public native final ColorPickerConfig hsl(HSL val) /*-{
this.hsl = val; 
return this; 
}-*/;

/**
 * Gets or sets the selected color of the picker using HSL integer object notation, { h: 360, s: 0, l: 100 }. Hue is represented in the range 0 - 360, saturation and lightness are in the range 0 - 100. Default Value: {h: 0, s: 100, l: 50} 
 * @return
 */
public native final HSL hslInt() /*-{
return this.hslInt; 
}-*/;

/**
 * Gets or sets the selected color of the picker using HSL integer object notation, { h: 360, s: 0, l: 100 }. Hue is represented in the range 0 - 360, saturation and lightness are in the range 0 - 100. Default Value: {h: 0, s: 100, l: 50}
 * @param val
 * @return this - for setter chaining
 */
public native final ColorPickerConfig hslInt(HSL val) /*-{
this.hslInt = val; 
return this; 
}-*/;

/**
 * Gets or sets the selected color of the picker using RGB object notation, { r: 255, g: 0, b: 255 }. Default Value: {r: 255, g: 0, b: 0} 
 * @return
 */
public native final RGB rgb() /*-{
return this.rgb; 
}-*/;

/**
 * Gets or sets the selected color of the picker using RGB object notation, { r: 255, g: 0, b: 255 }. Default Value: {r: 255, g: 0, b: 0} 
 * @param val
 * @return this - for setter chaining
 */
public native final ColorPickerConfig rgb(RGB val) /*-{
this.rgb = val; 
return this; 
}-*/;

/**
 * Controls visibility of the HEX text box.Default Value: true
 * @return
 */
public native final boolean showHEX() /*-{
return this.showHEX; 
}-*/;

/**
 * Controls visibility of the HEX text box.Default Value: true 
 * @param val
 * @return this - for setter chaining
 */
public native final ColorPickerConfig showHEX(boolean val) /*-{
this.showHEX = val; 
return this; 
}-*/;
/**
 * Controls visibility of the Hue, Saturation and Lightness text boxes, allowing manual selection of specific values. Default Value: true
 * @return
 */
public native final boolean showHSL() /*-{
return this.showHSL; 
}-*/;

/**
 * Controls visibility of the Hue, Saturation and Lightness text boxes, allowing manual selection of specific values. Default Value: true
 * @param val
 * @return this - for setter chaining
 */
public native final ColorPickerConfig showHSL(boolean val) /*-{
this.showHSL = val; 
return this; 
}-*/;
/**
 * Controls visibility of the Hue, Saturation and Lightness color bars from which colors can be selected. Default Value: true
 * @return
 */
public native final boolean showHSLBars() /*-{
return this.showHSLBars; 
}-*/;

/**
 * Controls visibility of the Hue, Saturation and Lightness color bars from which colors can be selected. Default Value: true
 * @param val
 * @return this - for setter chaining
 */
public native final ColorPickerConfig showHSLBars(boolean val) /*-{
this.showHSLBars = val; 
return this; 
}-*/;
/**
 * Controls visibility of the Red, Green and Blue text boxes, allowing manual selection of specific values.Default Value: true
 * @return
 */
public native final boolean showRGB() /*-{
return this.showRGB; 
}-*/;

/**
 * Controls visibility of the Red, Green and Blue text boxes, allowing manual selection of specific values.Default Value: true 
 * @param val
 * @return this - for setter chaining
 */
public native final ColorPickerConfig showRGB(boolean val) /*-{
this.showRGB = val; 
return this; 
}-*/;
/**
 * Controls visibility of the color swatch area which displays the current color. Default Value: true
 * @return
 */
public native final boolean showSwatch() /*-{
return this.showSwatch; 
}-*/;

/**
 * Controls visibility of the color swatch area which displays the current color. Default Value: true
 * @param val
 * @return this - for setter chaining
 */
public native final ColorPickerConfig showSwatch(boolean val) /*-{
this.showSwatch = val; 
return this; 
}-*/;

/**
 * The height of the color selector area in pixels. Default Value: 150
 * @return
 */
public native final double squareHeight() /*-{
return this.squareHeight; 
}-*/;

/**
 * The height of the color selector area in pixels. Default Value: 150
 * @param val
 * @return this - for setter chaining
 */
public native final ColorPickerConfig squareHeight(double val) /*-{
this.squareHeight = val; 
return this; 
}-*/;

/**
 * The width of the color selector area in pixels. Default Value: 150
 * @return
 */
public native final double squareWidth() /*-{
return this.squareWidth; 
}-*/;

/**
 * The width of the color selector area in pixels. Default Value: 150
 * @param val
 * @return this - for setter chaining
 */
public native final ColorPickerConfig squareWidth(double val) /*-{
this.squareWidth = val; 
return this; 
}-*/;

/**
 * The height of the color swatch in pixels. Default Value: 34 
 * @return
 */
public native final double swatchHeight() /*-{
return this.swatchHeight; 
}-*/;

/**
 * The height of the color swatch in pixels. Default Value: 34
 * @param val
 * @return this - for setter chaining
 */
public native final ColorPickerConfig swatchHeight(double val) /*-{
this.swatchHeight = val; 
return this; 
}-*/;


/**
 * The width of the color swatch in pixels. Default Value: 110 
 * @return
 */
public native final double swatchWidth() /*-{
return this.swatchWidth; 
}-*/;

/**
 * The width of the color swatch in pixels. Default Value: 110
 * @param val
 * @return this - for setter chaining
 */
public native final ColorPickerConfig swatchWidth(double val) /*-{
this.swatchWidth = val; 
return this; 
}-*/;
}
