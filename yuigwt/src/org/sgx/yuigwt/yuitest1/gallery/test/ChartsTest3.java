package org.sgx.yuigwt.yuitest1.gallery.test;

import static org.sgx.yuigwt.yuitest1.gallery.GalleryConstants.TAG_CHARTS;

import org.sgx.yuigwt.yui.YUI;
import org.sgx.yuigwt.yui.YUICallback;
import org.sgx.yuigwt.yui.YuiContext;
import org.sgx.yuigwt.yui.charts.AxisConfig;
import org.sgx.yuigwt.yui.charts.AxisStyle;
import org.sgx.yuigwt.yui.charts.CartesianChart;
import org.sgx.yuigwt.yui.charts.CartesianChartConfig;
import org.sgx.yuigwt.yui.charts.ChartBase;
import org.sgx.yuigwt.yui.charts.ChartLegendConfig;
import org.sgx.yuigwt.yui.node.Node;
import org.sgx.yuigwt.yui.util.JsObject;
import org.sgx.yuigwt.yui.util.JsUtil;
import org.sgx.yuigwt.yui.util.Style;

import com.google.gwt.core.client.JsArray;
/**
 * Reproduces http://yuilibrary.com/yui/docs/charts/charts-dualaxes.html. 
 * Data is provided using json object literal. 
 * @author sg
 *
 */
public class ChartsTest3 extends AbstractTest {

public ChartsTest3() {
	super("charts3", "Reproduces http://yuilibrary.com/yui/docs/charts/charts-dualaxes.html. Data is provided using json object literal. ", 
		new String[]{TAG_CHARTS}, 
		TestResources.instance.ChartsTest2());
}


public void test(final Node parent) {
YUI.Use(new String[]{"charts-legend"}, new YUICallback() {
	
	public void ready(final YuiContext Y) {
		//use a table to position charts. 
		JsObject axes = JsObject.one("percentage", AxisConfig.create().axisType("numeric")); 
		
	}
}); 
}
/**
 * simulates native json data 
 * @return
 */
protected native final JsArray<JsObject> getData()/*-{
	return [ 
        {month:"January", internetSales: 110000, percentOfRevenue: 25},
        {month:"February", internetSales: 333500, percentOfRevenue: 28},
        {month:"March", internetSales: 90500, percentOfRevenue: 15},
        {month:"April", internetSales: 255550, percentOfRevenue: 21},
        {month:"May", internetSales: 445000, percentOfRevenue: 33},
        {month:"June", internetSales: 580000, percentOfRevenue: 38}
    ]; 
}-*/;


}
