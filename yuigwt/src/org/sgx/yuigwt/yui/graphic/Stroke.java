package org.sgx.yuigwt.yui.graphic;

import com.google.gwt.core.client.JavaScriptObject;

/**
 * GWT Overlay type for yui graphic stroke objects -
 * http://yuilibrary.com/yui/docs/api/classes/Circle.html#attr_stroke <div>
 * <p>
 * Contains information about the stroke of the shape.
 * </p>
 * <dl>
 * <dt>color</dt>
 * <dd>The color of the stroke.</dd>
 * <dt>weight</dt>
 * <dd>DataTypeNumber that indicates the width of the stroke.</dd>
 * <dt>opacity</dt>
 * <dd>DataTypeNumber between 0 and 1 that indicates the opacity of the stroke.
 * The default value is 1.</dd>
 * <dt>dashstyle</dt>Indicates whether to draw a dashed stroke. When set to
 * "none", a solid stroke is drawn. When set to an array, the first index
 * indicates the length of the dash. The second index indicates the length of
 * gap.
 * <dt>linecap</dt>
 * <dd>Specifies the linecap for the stroke. The following values can be
 * specified:
 * <dl>
 * <dt>butt (default)</dt>
 * <dd>Specifies a butt linecap.</dd>
 * <dt>square</dt>
 * <dd>Specifies a sqare linecap.</dd>
 * <dt>round</dt>
 * <dd>Specifies a round linecap.</dd>
 * </dl>
 * </dd>
 * <dt>linejoin</dt>
 * <dd>Specifies a linejoin for the stroke. The following values can be
 * specified:
 * <dl>
 * <dt>round (default)</dt>
 * <dd>Specifies that the linejoin will be round.</dd>
 * <dt>bevel</dt>
 * <dd>Specifies a bevel for the linejoin.</dd>
 * <dt>miter limit</dt>
 * <dd>An integer specifying the miter limit of a miter linejoin. If you want to
 * specify a linejoin of miter, you simply specify the limit as opposed to
 * having separate miter and miter limit values.</dd>
 * </dl>
 * </dd>
 * </dl>
 * </div>
 * 
 * @author sg
 * 
 */
public class Stroke extends JavaScriptObject {

	protected Stroke() {
	}

	public static final String LINECAP_BUTT = "butt", LINECAP_SQUARE = "square", LINECAP_ROUND = "round";

	public static final String DASHSTYPE_NONE = "none", DASHSTYPE_TODO = "...";

	/** static constructor */
	public static final native Stroke create()/*-{
		return {};
	}-*/;

	/**
	 * The color of the stroke.
	 * 
	 * @return
	 */
	public native final String color() /*-{
		return this.color;
	}-*/;

	/**
	 * The color of the stroke.
	 * 
	 * @param val
	 * @return this - for setter chaining
	 */
	public native final Stroke color(String val) /*-{
		this.color = val;
		return this;
	}-*/;

	/**
	 * DataTypeNumber that indicates the width of the stroke.
	 * 
	 * @return
	 */
	public native final double weight() /*-{
		return this.weight;
	}-*/;

	/**
	 * DataTypeNumber that indicates the width of the stroke.
	 * 
	 * @param val
	 * @return this - for setter chaining
	 */
	public native final Stroke weight(double val) /*-{
		this.weight = val;
		return this;
	}-*/;

	/**
	 * DataTypeNumber between 0 and 1 that indicates the opacity of the stroke.
	 * The default value is 1.
	 * 
	 * @return
	 */
	public native final double opacity() /*-{
		return this.opacity;
	}-*/;

	/**
	 * 
	 * @param val
	 * @return this - for setter chaining
	 */
	public native final Stroke opacity(double val) /*-{
		this.opacity = val;
		return this;
	}-*/;

	/**
	 * 
	 * @return
	 */
	public native final String dashStyle() /*-{
		return this.dashStyle;
	}-*/;

	/**
	 * 
	 * @param val
	 * @return this - for setter chaining
	 */
	public native final Stroke dashStyle(String val) /*-{
		this.dashStyle = val;
		return this;
	}-*/;
}
