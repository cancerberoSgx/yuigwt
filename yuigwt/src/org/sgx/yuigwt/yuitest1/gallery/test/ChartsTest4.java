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
 * pie chart with custom colors
 * 
 * <pre>
var data = [
        { gender : "male", percentage : 46 },
        { gender : "female", percentage : 54 }
    ],
    pie = new Y.PieChart({
        render : ".chart",
        dataProvider : data,
        categoryKey : "gender",
        seriesKeys : [ "percentage" ],
        seriesCollection : [ {
            categoryKey : "gender",
            valueKey : "percentage",
            styles: {
                fill: {
                    colors : [ "#C30B0B", "#000000" ]
                }
            }
        }]
    });
});
</pre>

 * @author sg
 *
 */
public class ChartsTest4 extends AbstractTest {

public ChartsTest4() {
	super("charts4", "pie chart with custom colors", 
		new String[]{TAG_CHARTS}, 
		TestResources.instance.ChartsTest2());
}


public void test(final Node parent) {
YUI.Use(new String[]{"charts-legend"}, new YUICallback() {
	
	public void ready(final YuiContext Y) {
		//the data javascript array created using Java JsUtil class. 		
		 JsArray<JsObject> data1 = JsUtil.<JsObject>jsArray (
			JsObject.one("date", "5/1/2010")._("miscellaneous", 2000)._("expenses", 3700)._("revenue", 2200), 
			JsObject.one("date", "5/2/2010")._("miscellaneous", 50)._("expenses", 9100)._("revenue", 100),
			JsObject.one("date", "5/3/2010")._("miscellaneous", 400)._("expenses", 1100)._("revenue", 1500),
			JsObject.one("date", "5/4/2010")._("miscellaneous", 200)._("expenses", 1900)._("revenue", 2800),
			JsObject.one("date", "5/5/2010")._("miscellaneous", 5000)._("expenses", 5000)._("revenue", 2650)
		).cast(); 
		 
		 parent.appendChild("<div id=\"chart1\"></div>").setStyles(Style.create().
			width("200px").height("200px")); 
		 
		//a general legend configuration to use in all our charts. 
		ChartLegendConfig legendConfig1 = ChartLegendConfig.create();
		
		//use a table to position charts. 
		JsObject axes = JsObject.one("percentage", AxisConfig.create().axisType("numeric")); 
		CartesianChartConfig chartConfig = CartesianChartConfig.create().cast(); 
		chartConfig.categoryKey("date"); 
		chartConfig.dataProvider(data1); 
		chartConfig.render("#chart1"); 
		chartConfig.legend(legendConfig1); 
		chartConfig.axe("category", AxisConfig.create().
			keys(new String[]{"date"}).
			styles(AxisStyle.create().
				label(AxisStyle.Label.create().rotation(45).fontSize("9px"))
			).
			type("category")
		); 
		CartesianChart chart1 = Y.newChart(chartConfig).cast();
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
