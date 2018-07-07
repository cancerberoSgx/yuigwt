package org.sgx.yuigwt.yui.util;

/**
 * A datatype for indicating a node or other visual object bounds. 
 * left, top, right, bottom, width, height, 
 * @author sg
 *
 */
public class Region extends JsObject{
protected Region(){}
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
public native final Region left(double val) /*-{
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
public native final Region top(double val) /*-{
this.top = val; 
return this; 
}-*/;

/**
 * 
 * @return
 */
public native final double right() /*-{
return this.right; 
}-*/;

/**
 * 
 * @param val
 * @return this - for setter chaining
 */
public native final Region right(double val) /*-{
this.right = val; 
return this; 
}-*/;
/**
 * 
 * @return
 */
public native final double bottom() /*-{
return this.bottom; 
}-*/;

/**
 * 
 * @param val
 * @return this - for setter chaining
 */
public native final Region bottom(double val) /*-{
this.bottom = val; 
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
public native final Region width(double val) /*-{
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
public native final Region height(double val) /*-{
this.height = val; 
return this; 
}-*/;
public native final String print()/*-{
	return "{left: "+this.left+", top: "+this.top+", right: "+this.right+", bottom: "+this.bottom+", width: "+this.width+", height: "+this.height+"}"; 
}-*/;

}
