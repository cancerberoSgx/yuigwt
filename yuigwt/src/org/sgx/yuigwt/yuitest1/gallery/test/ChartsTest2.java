package org.sgx.yuigwt.yuitest1.gallery.test;

import static org.sgx.yuigwt.yuitest1.gallery.GalleryConstants.TAG_CHARTS;

import org.sgx.yuigwt.yui.YUI;
import org.sgx.yuigwt.yui.YUICallback;
import org.sgx.yuigwt.yui.YuiContext;
import org.sgx.yuigwt.yui.charts.AxisConfig;
import org.sgx.yuigwt.yui.charts.AxisStyle;
import org.sgx.yuigwt.yui.charts.CartesianChart;
import org.sgx.yuigwt.yui.charts.CartesianChartConfig;
import org.sgx.yuigwt.yui.charts.CartesianSeries;
import org.sgx.yuigwt.yui.charts.ChartBase;
import org.sgx.yuigwt.yui.charts.ChartLegendConfig;
import org.sgx.yuigwt.yui.node.Node;
import org.sgx.yuigwt.yui.util.JsObject;
import org.sgx.yuigwt.yui.util.JsUtil;
import org.sgx.yuigwt.yui.util.Style;

import com.google.gwt.core.client.JsArray;
/**
 * in this example we show the same data represented in various char types with legends. 
 * The sample data is creating in java using JsAobject utility.
 * http://yuilibrary.com/yui/docs/charts/charts-legend.html 
 * @author sg
 *
 */
public class ChartsTest2 extends AbstractTest {

public ChartsTest2() {
	super("charts2", "in this example we show the same data represented in various chart types with legends. The sample data is creating in java using JsAobject utility. http://yuilibrary.com/yui/docs/charts/charts-legend.html", 
		new String[]{TAG_CHARTS}, 
		TestResources.instance.ChartsTest2());
}


public void test(final Node parent) {
YUI.Use(new String[]{"charts-legend"}, new YUICallback() {
	
	public void ready(final YuiContext Y) {
		//use a table to position charts. 
		parent.append(
			"<table>" +
				"<tr>" +
					"<td><div class=\"chartCont\" id=\"chart1\"></div></td>" +
					"<td><div class=\"chartCont\" id=\"chart2\"></div></td></tr>" +
				"</tr><tr><td><div class=\"chartCont\" id=\"chart3\"></div></td>" +
					"<td><div class=\"chartCont\" id=\"chart4\"></div></td>" +
				"</tr>" +
			"</table>"); 
		String width = "230px", height = "190px"; 
		parent.all(".chartCont").setStyles(Style.create().
				width(width).height(height)); 
		parent.setStyles(Style.create().overflow("scroll"));
		
		//the data javascript array created using Java JsUtil class. 		
		 JsArray<JsObject> data1 = JsUtil.<JsObject>jsArray (
			JsObject.one("date", "5/1/2010")._("miscellaneous", 2000)._("expenses", 3700)._("revenue", 2200), 
			JsObject.one("date", "5/2/2010")._("miscellaneous", 50)._("expenses", 9100)._("revenue", 100),
			JsObject.one("date", "5/3/2010")._("miscellaneous", 400)._("expenses", 1100)._("revenue", 1500),
			JsObject.one("date", "5/4/2010")._("miscellaneous", 200)._("expenses", 1900)._("revenue", 2800),
			JsObject.one("date", "5/5/2010")._("miscellaneous", 5000)._("expenses", 5000)._("revenue", 2650)
		).cast(); 
		 
		//a general legend configuration to use in all our charts. 
		ChartLegendConfig legendConfig1 = ChartLegendConfig.create();
		
		//a first cartesian chart. 
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

		chart1.boundingBox().getNode("parentNode").getNode("parentNode").
			append("<p>a default chart with custom axes</p>"); 
		
		//now a second chart of type columns and a custom legend style. use the same config object
		chartConfig.type(ChartBase.TYPE_COLUMN); 
		chartConfig.render("#chart2"); 
		chartConfig.legend(ChartLegendConfig.create().position("left")); 
		CartesianChart chart2 = Y.newChart(chartConfig).cast().cast();
		chart2.boundingBox().getNode("parentNode").getNode("parentNode").
			append("<p>A <b>column</b> chart with custom axes and legend style</p>"); 
		
		//now the same chart of type bar and custom bar colors
		chartConfig.type(ChartBase.TYPE_BAR); 
		chartConfig.render("#chart3"); 
		chartConfig.legend(ChartLegendConfig.create().position("bottom")); 
		chartConfig.seriesCollection(new CartesianSeries[]{
//			CartesianSeries.C
		}); 
		CartesianChart chart3 = Y.newChart(chartConfig).cast().cast();
		chart3.boundingBox().getNode("parentNode").getNode("parentNode").
			append("<p>the same as before but type <b>bar</b> and bottom legend and and custom bar colors.</p>"); 
		
		chartConfig.type(ChartBase.TYPE_MARKERSERIES); 
		chartConfig.render("#chart4"); 
		chartConfig.legend(ChartLegendConfig.create().position("bottom")); 
		CartesianChart chart4 = Y.newChart(chartConfig).cast().cast();
		chart4.boundingBox().getNode("parentNode").getNode("parentNode").
			append("<p>the same as before but type <b>markseries</b></p>"); 
		
	}
}); 
}

}
