package org.sgx.yuigwt.yuigallery.cssmatrix2d;

import com.google.gwt.core.client.JavaScriptObject;
/**
 * This represents the matrix used by 2d CSS transforms. It helps perform all of the necessary matrix calculations. This is sort of an implementation of the CSSMatrix object defined in this spec: http://www.w3.org/TR/css3-2d-transforms/#cssmatrix-interface The matrix defined in the spec is a 3x2 matrix. I'm not exactly an expert at matrix math, but most of the operations required by the spec only work with square matrices. The spec doesn't explain how a 3x2 matrix is supposed to do these things. In order to make the math work correctly, this object internally treats it as the 4x4 matrix defined in the 3d CSS transforms spec here: http://www.w3.org/TR/css3-3d-transforms/#cssmatrix-interface and it converts the 3x2 matrix into a 4x4 matrix by following the examples provided in this spec: http://www.w3.org/TR/2012/WD-css3-transforms-20120403/ Other implementations of these specs, like the WebKitCSSMatrix object and others that have copied it, attempt to combine both the 2d and 3d versions of CSSMatrix into the same object. This implementation only borrows ideas from the 3d version to make the math make sense, but only the 2d functionality is implemented. Since only the 6 2d matrix items out of the total 16 3d matrix items are mutable, and the remaining 3d matrix items are known to be either 0 or 1, most of the complicated 4x4 matrix math is factored down and reduced, becoming much more efficient.
 * <br/>
 * The matrix values are stored in properties a, b, c, d, e, and f.
<br/>
These methods perform an operation and return a new matrix object without modifying this one: inverse, multiply, rotate, rotateRad, scale, skewX, skewXRad, skewY, skewYRad, and translate.
<br/>
The toString method returns a string that can be used to set a CSS transform.
<br/>
The setMatrixValue method accepts a CSS transform string and updates this matrix object's properties.

 * @see http://yuilibrary.com/gallery/show/cssmatrix2d
 * @see http://solmsted.github.com/yui3-gallery/api/classes/CSSMatrix2d.htm
 * @author sg
 *
 */
public class CSSMatrix2d extends JavaScriptObject {
protected CSSMatrix2d(){}

//props

/**
 * 
 * @return the attribute
 */
public final native double a()/*-{
return this.get("a");
}-*/;

/**
 * 
 * @param val
 * @return self for method chaining
 */
public final native CSSMatrix2d a(double val)/*-{
this.set("a", val);
return this; 
}-*/;



/**
 * @return a new matrix, the inverse of this one. This matrix is not modified. This method will throw if the matrix can not be inverted.
 * 
 */
public native final CSSMatrix2d invert() /*-{
return this.invert();
}-*/;
/**
 * Returns a new matrix, the product of this one multiplied by another one. Neither this matrix nor the other one is modified.
 * @param other
 * @return
 */
public native final CSSMatrix2d multiply(CSSMatrix2d other) /*-{
return this.multiply(other);
}-*/;
/**
 * Returns a new matrix, rotated the given angle clockwise. This matrix is not modified.
 * @param angle The angle specified in degrees.
 * @return
 */
public native final CSSMatrix2d rotate(double angle) /*-{
return this.rotate(angle);
}-*/;
/**
 * Returns a new matrix, rotated the given angle clockwise. This matrix is not modified.
 * @param angle The angle specified in radians.
 * @return
 */
public native final CSSMatrix2d rotateRad(double angle) /*-{
return this.rotateRad(angle);
}-*/;
/**
 * Returns a new matrix, scaled horizontally and vertically. This matrix is not modified.
 * @param x The horizontal scale factor.
 * @param y The vertical scale factor.
 * @return
 */
public native final CSSMatrix2d scale(double x, double y) /*-{
return this.scale(x, y);
}-*/;
/**
 * Returns a new matrix, scaled horizontally and vertically. This matrix is not modified.
 * @return
 */
public native final CSSMatrix2d scale(double factor) /*-{
return this.scale(factor);
}-*/;

/**
 * Sets the matrix based on a matrix string provided by the DOM. The string is expected to be like 'matrix(a, b, c, d, e, f)'. This format isn't specifically checked for, so other similar strings might be accepted. If 6 values can not be read from from the string, this method will do nothing. Invalid values could result in NaN being assigned to matrix items.
 * @return self for method chaining
 */
public native final CSSMatrix2d setMatrixValue(String v) /*-{
this.setMatrixValue(v); 
return this; 
}-*/;
/**
 * Returns a new matrix, skewed horizontally. This matrix is not modified.
 * @param angle The horizontal skew angle specified in degrees.
 * @return
 */
public native final CSSMatrix2d skewX(double angle) /*-{
return this.skewX(angle);
}-*/;
/**
 * Returns a new matrix, skewed horizontally. This matrix is not modified.
 * @param angle The horizontal skew angle specified in rads.
 * @return
 */
public native final CSSMatrix2d skewXRad(double angle) /*-{
return this.skewXRad(angle);
}-*/;

/**
 * Returns a new matrix, skewed vertically. This matrix is not modified.
 * @param angle The horizontal skew angle specified in degrees.
 * @return
 */
public native final CSSMatrix2d skewY(double angle) /*-{
return this.skewY(angle);
}-*/;
/**
 * Returns a new matrix, skewed vertically. This matrix is not modified.
 * @param angle The horizontal skew angle specified in rads.
 * @return
 */
public native final CSSMatrix2d skewYRad(double angle) /*-{
return this.skewYRad(angle);
}-*/;

/**
 * @return Returns a string 'matrix(a, b, c, d, e, f)' which can be used by the DOM for 2d CSS transforms.
 */
public native final String toString_() /*-{
return this.toString();
}-*/;
/**
 * Returns a new matrix, translated horizontally and vertically. This matrix is not modified.
 * @param x The horizontal translation amount.
 * @param y The vert translation amount.
 * @return
 */
public native final CSSMatrix2d translate(double x, double y) /*-{
return this.translate(x, y);
}-*/;
}
