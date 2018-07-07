package org.sgx.yuigwt.yui.charts;

import org.sgx.yuigwt.yui.graphic.Shape;
import org.sgx.yuigwt.yui.widget.Widget;
import org.sgx.yuigwt.yui.widget.ext.WidgetExt;

import com.google.gwt.core.client.JavaScriptObject;

public class ChartLegend extends Widget {
protected ChartLegend(){}


//attributes
/**
 * Background for the legend.
 * @return the attribute
 */
public final native Shape background()/*-{
return this.get("background");
}-*/;

/**
 * Background for the legend.
 * @param val
 * @return self for method chaining
 */
public final native ChartLegend background(Shape val)/*-{
this.set("background", val);
return this; 
}-*/;
}
