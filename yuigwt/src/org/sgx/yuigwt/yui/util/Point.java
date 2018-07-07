package org.sgx.yuigwt.yui.util;

import com.google.gwt.core.client.JsArrayNumber;
/**
 * YUI often represents a point in a 2 number array, like Node.getXY and we overlay that in this class.
 * @author sg
 *
 */
public class Point extends JsArrayNumber {
	protected Point(){}; 
	public static final native Point create()/*-{
		return [0,0]; 
	}-*/;
	public static final native Point create(double x, double y)/*-{
		return [x, y]; 
	}-*/;

/**
 * 
 * @return
 */
public native final double x() /*-{
return this[0]; 
}-*/;

/**
 * 
 * @param val
 * @return this - for setter chaining
 */
public native final Point x(double val) /*-{
this[0] = val; 
return this; 
}-*/;

/**
 * 
 * @return
 */
public native final double y() /*-{
return this[1]; 
}-*/;

/**
 * 
 * @param val
 * @return this - for setter chaining
 */
public native final Point y(double val) /*-{
this[1] = val; 
return this; 
}-*/;

public native final String print()/*-{
	return "Point("+this[0]+", "+this[1]+")";  
}-*/;

}
