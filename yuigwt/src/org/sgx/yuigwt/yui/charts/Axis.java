package org.sgx.yuigwt.yui.charts;

import org.sgx.yuigwt.yui.util.Region;
import org.sgx.yuigwt.yui.widget.ext.WidgetExt;

import com.google.gwt.user.client.Element;
/**
 * this java class contains both Axis and AxisType classes APIs
 * The Axis class. Generates axes for a chart.
 * @see http://yuilibrary.com/yui/docs/api/classes/Axis.html
 * AxisType is an abstract class that manages the data for an axis.
 * @see http://yuilibrary.com/yui/docs/api/classes/AxisType.html
 * @author sg
 *
 */
public class Axis extends WidgetExt {
protected Axis(){}

/**
 * Returns the coordinates (top, right, bottom, left) for the bounding box of the last label.
 * @return self for method chaining
 */
public native final Region getMaxLabelBounds() /*-{
return this.getMaxLabelBounds();
}-*/;
/**
 * Returns the coordinates (top, right, bottom, left) for the bounding box of the first label.
 * @return self for method chaining
 */
public native final Region getMinLabelBounds() /*-{
return this.getMinLabelBounds();
}-*/;




public static interface AppendLabelFunction {
	void call(Element textField, String val); 
}
/**
 * Function used to append an axis value to an axis label. 
 * 
 * @param fn
 * @return
 */
public native final Tooltip appendLabelFunction(AppendLabelFunction fn) /*-{
var f = $entry(function(textField, val){
	return fn.@org.sgx.yuigwt.yui.charts.Axis.AppendLabelFunction::call(Lcom/google/gwt/user/client/Element;Ljava/lang/String;)(textField, val);  
}); 
this.set("appendLabelFunction", f); 
//this.appendLabelFunction=f;
return this;  
}-*/;


}
