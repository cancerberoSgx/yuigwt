package org.sgx.yuigwt.yui.graphic.stroke;

import org.sgx.yuigwt.yui.util.JsObject;

/**
 * <p>
 * Contains information about the stroke of the shape.
 * </p>
 * <dl>
 * <dt>color</dt>
 * <dd>The color of the stroke.</dd>
 * <dt>weight</dt>
 * <dd>DataTypeNumber that indicates the width of the stroke.</dd>
 * <dt>opacity</dt>
 * <dd>DataTypeNumber between 0 and 1 that indicates the opacity of the stroke. The
 * default value is 1.</dd>
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
 * having separate miter and miter limit values.</dd></dl></dd></dl>
 * 
 * @author sg
 * 
 */
public class Stroke extends JsObject {
protected Stroke(){}
}
