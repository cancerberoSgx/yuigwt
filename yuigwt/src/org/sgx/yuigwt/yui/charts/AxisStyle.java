package org.sgx.yuigwt.yui.charts;

import org.sgx.yuigwt.yui.util.JsObject;
/**
 * Style properties used for drawing an axis. This attribute is inherited from Json2JavaUtil.
 * @see http://yuilibrary.com/yui/docs/api/classes/Axis.html#attr_styles
 * @author sg
 *
 */
public class AxisStyle extends JsObject{
	protected AxisStyle(){}
	public static final native AxisStyle create()/*-{
		return {}; 
	}-*/;
	
/**
 * Properties used for drawing ticks. 
 * @return
 */
public native final MajorTicks majorTicks() /*-{
return this.majorTicks; 
}-*/;

/**
 * Properties used for drawing ticks. 
 * @param val
 * @return this - for setter chaining
 */
public native final AxisStyle majorTicks(MajorTicks val) /*-{
this.majorTicks = val; 
return this; 
}-*/;

/**
 * Properties used for drawing the axis line. 
 * @return
 */
public native final Line line() /*-{
return this.line; 
}-*/;

/**
 * Properties used for drawing the axis line. 
 * @param val
 * @return this - for setter chaining
 */
public native final AxisStyle line(Line val) /*-{
this.line = val; 
return this; 
}-*/;

/**
 * Properties used to calculate the majorUnit for the axis. 
 * @return
 */
public native final MajorUnit majorUnit() /*-{
return this.majorUnit; 
}-*/;

/**
 * Properties used to calculate the majorUnit for the axis. 
 * @param val
 * @return this - for setter chaining
 */
public native final AxisStyle majorUnit(MajorUnit val) /*-{
this.majorUnit = val; 
return this; 
}-*/;

/**
 * Properties and styles applied to the axis labels. 
 * @return
 */
public native final Label label() /*-{
return this.label; 
}-*/;

/**
 * Properties and styles applied to the axis labels. 
 * @param val
 * @return this - for setter chaining
 */
public native final AxisStyle label(Label val) /*-{
this.label = val; 
return this; 
}-*/;


	/**
	 * Properties used for drawing ticks. 
	 * @author sg
	 *
	 */
	public static class MajorTicks extends JsObject {
		protected MajorTicks(){}
		public static final native MajorTicks create()/*-{
		return {}; 
		}-*/;
		/**
		 * Position of the tick. Possible values are inside, outside, cross and none. The default value is inside
		 * @return
		 */
		public native final String display() /*-{
		return this.display; 
		}-*/;
		
		/**
		 * Position of the tick. Possible values are inside, outside, cross and none. The default value is inside
		 * @param val
		 * @return this - for setter chaining
		 */
		public native final AxisStyle.MajorTicks display(String val) /*-{
		this.display = val; 
		return this; 
		}-*/;
		/**
		 * the length (in pixels) of the tick. The default value is 4.
		 * @return
		 */
		public native final int length() /*-{
		return this.length; 
		}-*/;
		
		/**
		 * the length (in pixels) of the tick. The default value is 4.
		 * @param val
		 * @return this - for setter chaining
		 */
		public native final AxisStyle.MajorTicks length(int val) /*-{
		this.length = val; 
		return this; 
		}-*/;
		/**
		 * The color of the tick. The default value is #dad8c9
		 * @return
		 */
		public native final String color() /*-{
		return this.color; 
		}-*/;
		
		/**
		 * The color of the tick. The default value is #dad8c9
		 * @param val
		 * @return this - for setter chaining
		 */
		public native final AxisStyle.MajorTicks color(String val) /*-{
		this.color = val; 
		return this; 
		}-*/;
		/**
		 * Number indicating the width of the tick. The default value is 1.
		 * @return
		 */
		public native final int weight() /*-{
		return this.weight; 
		}-*/;
		
		/**
		 * Number indicating the width of the tick. The default value is 1.
		 * @param val
		 * @return this - for setter chaining
		 */
		public native final AxisStyle.MajorTicks weight(int val) /*-{
		this.weight = val; 
		return this; 
		}-*/;
		/**
		 * Number from 0 to 1 indicating the opacity of the tick. The default value is 1.
		 * @return
		 */
		public native final double alpha() /*-{
		return this.alpha; 
		}-*/;
		
		/**
		 * Number from 0 to 1 indicating the opacity of the tick. The default value is 1.
		 * @param val
		 * @return this - for setter chaining
		 */
		public native final AxisStyle.MajorTicks alpha(double val) /*-{
		this.alpha = val; 
		return this; 
		}-*/;
	}
	
	/**
	 * Properties used for drawing the axis line.
	 * @author sg
	 *
	 */
	public static class Line extends JsObject {
		protected Line(){}
		public static final native Line create()/*-{
		return {}; 
		}-*/;
		/**
		 * The color of the axis line. The default value is #dad8c9.
		 * @return
		 */
		public native final String color() /*-{
		return this.color; 
		}-*/;
		
		/**
		 * The color of the axis line. The default value is #dad8c9.
		 * @param val
		 * @return this - for setter chaining
		 */
		public native final AxisStyle.Line color(String val) /*-{
		this.color = val; 
		return this; 
		}-*/;
		/**
		 * Number indicating the width of the axis line. The default value is 1.
		 * @return
		 */
		public native final int weight() /*-{
		return this.weight; 
		}-*/;
		
		/**
		 * Number indicating the width of the axis line. The default value is 1.
		 * @param val
		 * @return this - for setter chaining
		 */
		public native final AxisStyle.Line weight(int val) /*-{
		this.weight = val; 
		return this; 
		}-*/;
		/**
		 * Number from 0 to 1 indicating the opacity of the tick. The default value is 1.
		 * @return
		 */
		public native final double alpha() /*-{
		return this.alpha; 
		}-*/;
		
		/**
		 * Number from 0 to 1 indicating the opacity of the tick. The default value is 1.
		 * @param val
		 * @return this - for setter chaining
		 */
		public native final AxisStyle.Line alpha(double val) /*-{
		this.alpha = val; 
		return this; 
		}-*/;
	}
	
	/**
	 * Properties used to calculate the majorUnit for the axis. 
	 * @author sg
	 *
	 */
	public static class MajorUnit extends JsObject {
		protected MajorUnit(){}
		public static final native MajorUnit create()/*-{
		return {}; 
		}-*/;
		
		/**
		 *     The algorithm used for calculating distance between ticks. The possible options are count and distance. If the determinant is count, the axis ticks will spaced so that a specified number of ticks appear on the axis. If the determinant is distance, the axis ticks will spaced out according to the specified distance. The default value is count.
		 * @return
		 */
		public native final String determinant() /*-{
		return this.determinant; 
		}-*/;
		
		/**
		 *     The algorithm used for calculating distance between ticks. The possible options are count and distance. If the determinant is count, the axis ticks will spaced so that a specified number of ticks appear on the axis. If the determinant is distance, the axis ticks will spaced out according to the specified distance. The default value is count.
		 * @param val
		 * @return this - for setter chaining
		 */
		public native final AxisStyle.MajorUnit determinant(String val) /*-{
		this.determinant = val; 
		return this; 
		}-*/;
		/**
		 * Number of ticks to appear on the axis when the determinant is count. The default value is 11.
		 * @return
		 */
		public native final int count() /*-{
		return this.count; 
		}-*/;
		
		/**
		 * Number of ticks to appear on the axis when the determinant is count. The default value is 11.
		 * @param val
		 * @return this - for setter chaining
		 */
		public native final AxisStyle.MajorUnit count(int val) /*-{
		this.count = val; 
		return this; 
		}-*/;
		/**
		 * The distance (in pixels) between ticks when the determinant is distance. The default value is 75.
		 * @return
		 */
		public native final int distance() /*-{
		return this.distance; 
		}-*/;
		
		/**
		 * The distance (in pixels) between ticks when the determinant is distance. The default value is 75.
		 * @param val
		 * @return this - for setter chaining
		 */
		public native final AxisStyle.MajorUnit distance(int val) /*-{
		this.distance = val; 
		return this; 
		}-*/;


	}
	
	/**
	 * Properties and styles applied to the axis labels. 
	 * @author sg
	 *
	 */
	public static class Label extends JsObject {
		protected Label(){}
		public static final native Label create()/*-{
		return {}; 
		}-*/;
		/**
		 * The color of the labels. The default value is #808080.
		 * @return
		 */
		public native final String color() /*-{
		return this.color; 
		}-*/;
		
		/**
		 * The color of the labels. The default value is #808080.
		 * @param val
		 * @return this - for setter chaining
		 */
		public native final AxisStyle.Label color(String val) /*-{
		this.color = val; 
		return this; 
		}-*/;
		/**
		 * Number between 0 and 1 indicating the opacity of the labels. The default value is 1.
		 * @return
		 */
		public native final double alpha() /*-{
		return this.alpha; 
		}-*/;
		
		/**
		 * Number between 0 and 1 indicating the opacity of the labels. The default value is 1.
		 * @param val
		 * @return this - for setter chaining
		 */
		public native final AxisStyle.Label alpha(double val) /*-{
		this.alpha = val; 
		return this; 
		}-*/;
		/**
		 * The font-size of the labels. The default value is 85%
		 * @return
		 */
		public native final String fontSize() /*-{
		return this.fontSize; 
		}-*/;
		
		/**
		 * The font-size of the labels. The default value is 85%
		 * @param val
		 * @return this - for setter chaining
		 */
		public native final AxisStyle.Label fontSize(String val) /*-{
		this.fontSize = val; 
		return this; 
		}-*/;
		/**
		 * The rotation, in degrees (between -90 and 90) of the labels. The default value is 0.
		 * @return
		 */
		public native final double rotation() /*-{
		return this.rotation; 
		}-*/;
		
		/**
		 * The rotation, in degrees (between -90 and 90) of the labels. The default value is 0.
		 * @param val
		 * @return this - for setter chaining
		 */
		public native final AxisStyle.Label rotation(double val) /*-{
		this.rotation = val; 
		return this; 
		}-*/;
	}
	
	
	/**
	 * class for represeinting the datatype in axis - label - margin and others
	 */
	public static final class Margin extends JsObject  {
		protected Margin(){}
		public static final native Margin create()/*-{
		return {}; 
		}-*/;
		/**
		 * Pixel value used for an axis with a position of bottom. The default value is 4.
		 * @return
		 */
		public native final double top() /*-{
		return this.top; 
		}-*/;
		
		/**
		 * Pixel value used for an axis with a position of bottom. The default value is 4.
		 * @param val
		 * @return this - for setter chaining
		 */
		public native final AxisStyle.Margin top(double val) /*-{
		this.top = val; 
		return this; 
		}-*/;
		/**
		 * Pixel value used for an axis with a position of left. The default value is 4.
		 * @return
		 */
		public native final int right() /*-{
		return this.right; 
		}-*/;
		
		/**
		 * Pixel value used for an axis with a position of left. The default value is 4.
		 * @param val
		 * @return this - for setter chaining
		 */
		public native final AxisStyle.Margin right(int val) /*-{
		this.right = val; 
		return this; 
		}-*/;
		/**
		 * Pixel value used for an axis with a position of top. The default value is 4.
		 * @return
		 */
		public native final int bottom() /*-{
		return this.bottom; 
		}-*/;
		
		/**
		 * Pixel value used for an axis with a position of top. The default value is 4.
		 * @param val
		 * @return this - for setter chaining
		 */
		public native final AxisStyle.Margin bottom(int val) /*-{
		this.bottom = val; 
		return this; 
		}-*/;
		/**
		 * Pixel value used for an axis with a position of right. The default value is 4.
		 * @return
		 */
		public native final int left() /*-{
		return this.left; 
		}-*/;
		
		/**
		 * Pixel value used for an axis with a position of right. The default value is 4.
		 * @param val
		 * @return this - for setter chaining
		 */
		public native final AxisStyle.Margin left(int val) /*-{
		this.left = val; 
		return this; 
		}-*/;
	}
}
