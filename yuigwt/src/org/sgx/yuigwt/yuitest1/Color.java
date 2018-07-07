package org.sgx.yuigwt.yuitest1;

import com.google.gwt.core.client.JsArrayInteger;
import com.google.gwt.core.client.JsArrayNumber;

/**
 * A simple base Color class - that store values in r,g,b format. It also
 * contains method utilities to transform from rgb to HASL and HEx color
 * notations. Code taken from
 * http://mjijackson.com/2008/02/rgb-to-hsl-and-rgb-to
 * -hsv-color-model-conversion-algorithms-in-javascript
 * 
 * @author sg
 * 
 */
public class Color {
	private static final String NONE = "none";
	int red = 0, green = 0, blue = 0, alpha = 0;
	/**
	 * a "none" or "transparent" color for indicating an object color property
	 * that can be null
	 */
	boolean none;

	/**
	 * 
	 * @param hex
	 *            - an 6 digit hex color - without the # prefix.
	 * @throws Exception
	 */
	public Color(String hex) {
		setHex(hex);
	}

	public Color(int red, int green, int blue) {
		super();
		this.red = red;
		this.green = green;
		this.blue = blue;
	}

	public Color(int red, int green, int blue, int alpha) {
		super();
		this.red = red;
		this.green = green;
		this.blue = blue;
		this.alpha = alpha;
	}

	public int getRed() {
		return red;
	}

	public void setRed(int red) {
		this.red = red;
	}

	public int getGreen() {
		return green;
	}

	public void setGreen(int green) {
		this.green = green;
	}

	public boolean isNone() {
		return none;
	}

	public void setNone(boolean none) {
		this.none = none;
	}

	public int getBlue() {
		return blue;
	}

	public void setBlue(int blue) {
		this.blue = blue;
	}

	public int getAlpha() {
		return alpha;
	}

	public void setAlpha(int alpha) {
		this.alpha = alpha;
	}

	/**
	 * Converts an RGB color value to HSL. Conversion formula adapted from
	 * http://en.wikipedia.org/wiki/HSL_color_space. Assumes r, g, and b are
	 * contained in the set [0, 255] and returns h, s, and l in the set [0, 1].
	 * 
	 * @param Number
	 *            r The red color value
	 * @param Number
	 *            g The green color value
	 * @param Number
	 *            b The blue color value
	 * @return Array The HSL representation
	 */
	public static final native JsArrayNumber rgbToHsl(int r, int g, int b)/*-{
		r /= 255, g /= 255, b /= 255;
		var max = Math.max(r, g, b), min = Math.min(r, g, b);
		var h, s, l = (max + min) / 2;

		if (max == min) {
			h = s = 0; // achromatic
		} else {
			var d = max - min;
			s = l > 0.5 ? d / (2 - max - min) : d / (max + min);
			switch (max) {
			case r:
				h = (g - b) / d + (g < b ? 6 : 0);
				break;
			case g:
				h = (b - r) / d + 2;
				break;
			case b:
				h = (r - g) / d + 4;
				break;
			}
			h /= 6;
		}
		return [ h, s, l ];
	}-*/;

	/**
	 * Converts an HSL color value to RGB. Conversion formula adapted from
	 * http://en.wikipedia.org/wiki/HSL_color_space. Assumes h, s, and l are
	 * contained in the set [0, 1] and returns r, g, and b in the set [0, 255].
	 * 
	 * @param Number
	 *            h The hue
	 * @param Number
	 *            s The saturation
	 * @param Number
	 *            l The lightness
	 * @return Array The RGB representation
	 */
	public static final native JsArrayNumber hslToRgb(int h, int s, int l)/*-{
		var r, g, b;

		if (s == 0) {
			r = g = b = l; // achromatic
		} else {
			function hue2rgb(p, q, t) {
				if (t < 0)
					t += 1;
				if (t > 1)
					t -= 1;
				if (t < 1 / 6)
					return p + (q - p) * 6 * t;
				if (t < 1 / 2)
					return q;
				if (t < 2 / 3)
					return p + (q - p) * (2 / 3 - t) * 6;
				return p;
			}

			var q = l < 0.5 ? l * (1 + s) : l + s - l * s;
			var p = 2 * l - q;
			r = hue2rgb(p, q, h + 1 / 3);
			g = hue2rgb(p, q, h);
			b = hue2rgb(p, q, h - 1 / 3);
		}

		return [ r * 255, g * 255, b * 255 ];
	}-*/;

	/**
	 * Converts an RGB color value to HSV. Conversion formula adapted from
	 * http://en.wikipedia.org/wiki/HSV_color_space. Assumes r, g, and b are
	 * contained in the set [0, 255] and returns h, s, and v in the set [0, 1].
	 * 
	 * @param Number
	 *            r The red color value
	 * @param Number
	 *            g The green color value
	 * @param Number
	 *            b The blue color value
	 * @return Array The HSV representation
	 */
	public static final native JsArrayNumber rgbToHsv(int r, int g, int b)/*-{
		r = r / 255, g = g / 255, b = b / 255;
		var max = Math.max(r, g, b), min = Math.min(r, g, b);
		var h, s, v = max;

		var d = max - min;
		s = max == 0 ? 0 : d / max;

		if (max == min) {
			h = 0; // achromatic
		} else {
			switch (max) {
			case r:
				h = (g - b) / d + (g < b ? 6 : 0);
				break;
			case g:
				h = (b - r) / d + 2;
				break;
			case b:
				h = (r - g) / d + 4;
				break;
			}
			h /= 6;
		}

		return [ h, s, v ];
	}-*/;

	/**
	 * Converts an HSV color value to RGB. Conversion formula adapted from
	 * http://en.wikipedia.org/wiki/HSV_color_space. Assumes h, s, and v are
	 * contained in the set [0, 1] and returns r, g, and b in the set [0, 255].
	 * 
	 * @param Number
	 *            h The hue
	 * @param Number
	 *            s The saturation
	 * @param Number
	 *            v The value
	 * @return Array The RGB representation
	 */
	public static final native JsArrayNumber hsvToRgb(int h, int s, int v)/*-{
		var r, g, b;

		var i = Math.floor(h * 6);
		var f = h * 6 - i;
		var p = v * (1 - s);
		var q = v * (1 - f * s);
		var t = v * (1 - (1 - f) * s);

		switch (i % 6) {
		case 0:
			r = v, g = t, b = p;
			break;
		case 1:
			r = q, g = v, b = p;
			break;
		case 2:
			r = p, g = v, b = t;
			break;
		case 3:
			r = p, g = q, b = v;
			break;
		case 4:
			r = t, g = p, b = v;
			break;
		case 5:
			r = v, g = p, b = q;
			break;
		}

		return [ r * 255, g * 255, b * 255 ];
	}-*/;

	/**
	 * convert the given rgb color to an hex string (without the prefix #) taken
	 * from http://bgrins.github.com/TinyColor/docs/tinycolor.html
	 * 
	 * @param r
	 * @param g
	 * @param b
	 * @return
	 */
	public static final native String rgbToHex(int r, int g, int b)/*-{
		function pad2(c) {
			return c.length == 1 ? '0' + c : '' + c;
		}
		;
		var hex = [ pad2(Math.round(r).toString(16)),
				pad2(Math.round(g).toString(16)),
				pad2(Math.round(b).toString(16)) ];

		// Return a 3 character hex if possible
		//    if (hex[0][0] == hex[0][1] && hex[1][0] == hex[1][1] && hex[2][0] == hex[2][1]) {
		//        return hex[0][0] + hex[1][0] + hex[2][0];
		//    }

		return hex.join("");
	}-*/;

	/**
	 * convert an hex color format to rgb format
	 * 
	 * @param hex
	 * @return
	 */
	public static final native JsArrayInteger hexToRgb(String hex)/*-{
		return [ parseInt(hex.substring(0, 2), 16),
				parseInt(hex.substring(2, 4), 16),
				parseInt(hex.substring(4, 6), 16), ];
	}-*/;

	public String getHex() {
		return rgbToHex(red, green, blue);
	}

	@Override
	public String toString() {
		return "rgb(" + red + "," + green + "," + blue + ")";
	}

	public void setHex(String hexColor) {
		JsArrayInteger rgb = hexToRgb(hexColor);
		this.red = rgb.get(0);
		this.green = rgb.get(1);
		this.blue = rgb.get(2);
	}

}
