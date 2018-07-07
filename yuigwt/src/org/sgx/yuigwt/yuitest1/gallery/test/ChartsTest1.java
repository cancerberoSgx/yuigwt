package org.sgx.yuigwt.yuitest1.gallery.test;

import static org.sgx.yuigwt.yuitest1.gallery.GalleryConstants.TAG_CHARTS;
import static org.sgx.yuigwt.yuitest1.gallery.GalleryConstants.TAG_IO;
import static org.sgx.yuigwt.yuitest1.gallery.GalleryConstants.TAG_STYLESHEET;
import static org.sgx.yuigwt.yuitest1.gallery.GalleryConstants.TAG_TABVIEW;

import org.sgx.yuigwt.yui.YUI;
import org.sgx.yuigwt.yui.YUICallback;
import org.sgx.yuigwt.yui.YuiContext;
import org.sgx.yuigwt.yui.charts.ChartBase;
import org.sgx.yuigwt.yui.charts.ChartBaseConfig;
import org.sgx.yuigwt.yui.charts.Tooltip;
import org.sgx.yuigwt.yui.console.Console;
import org.sgx.yuigwt.yui.event.EventCallback;
import org.sgx.yuigwt.yui.io.IO;
import org.sgx.yuigwt.yui.io.IOConfig;
import org.sgx.yuigwt.yui.io.IOEvent;
import org.sgx.yuigwt.yui.io.Response;
import org.sgx.yuigwt.yui.node.Node;
import org.sgx.yuigwt.yui.stylesheet.StyleSheet;
import org.sgx.yuigwt.yui.util.Style;
import org.sgx.yuigwt.yui.widget.tabview.TabConfig;
import org.sgx.yuigwt.yui.widget.tabview.TabView;
import org.sgx.yuigwt.yui.widget.tabview.TabViewConfig;

import com.google.gwt.core.client.GWT;
import com.google.gwt.core.client.JsArray;
import com.google.gwt.core.client.JsonUtils;
import com.google.gwt.user.client.Window;
/**
 * chart example multiseries lines. In this example we first load two charts, 
 * in one using a native javascript array and in the other using IO for loading 
 * the data from public json file. When this last chart is read, we show all in a tabview widget. 
 * @author sg
 *
 */
public class ChartsTest1 extends AbstractTest {

//protected Console console;
protected StyleSheet ss1;
protected TabView tb;
protected Node mainParent;
protected Node chartContainer1;
protected Node chartContainer2;





public ChartsTest1() {
	super("charts1", "chart example multiseries lines. In this example we first load two charts, in one using a native javascript array and in the other using IO for loading the data from public json file. When this last chart is read, we show all in a tabview widget. Decorate the charts container using the stylesheet utility. ", 
		new String[]{TAG_CHARTS, TAG_IO, TAG_TABVIEW, TAG_STYLESHEET}, 
		TestResources.instance.ChartTest1());
}


public void test(final Node parent) {
YUI.Use(new String[]{"charts", "button", "io", "tabview", "stylesheet", "console"}, new YUICallback() {
	
	public void ready(final YuiContext Y) {
		mainParent=parent; 
		ss1 = Y.newStyleSheet(); 
		ss1.set(".chartcontainer", Style.create().display("block").
				width("300px").height("300px").border("2px solid green").margin("20px")); 
				
		//create and append the chart containers
		chartContainer1 = parent.appendChild("<div class=\"chartcontainer\" id=\"fromJsArray\"></div>");
		installChartFromJsArray(Y, chartContainer1);
		
		chartContainer2 = parent.appendChild("<div id=\"fromJsonIO\" class=\"chartcontainer\"></div>");
		installChartFromJsonIO(Y, chartContainer2);		
	}
}); 
}



protected void installChartFromJsArray(YuiContext Y, Node parent) {
	ChartBase chart1 = Y.newChart(ChartBaseConfig.create().dataProvider(getJsArrayData1()).tooltip(Tooltip.create().show(true).styles(Style.create().background("#333").color("#eee").borderColor("#fff").textAlign("center"))));
	chart1.render(parent); 
}
private final native JsArray getJsArrayData1()/*-{
	return [ 
        {category:"5/1/2010", miscellaneous:200, expenses:370, revenue:200}, 
        {category:"5/2/2010", miscellaneous:50, expenses:9100, revenue:100}, 
        {category:"5/3/2010", miscellaneous:400, expenses:1100, revenue:100}, 
        {category:"5/4/2010", miscellaneous:200, expenses:11900, revenue:200}, 
        {category:"5/5/2010", miscellaneous:5000, expenses:51000, revenue:2650}
    ]
}-*/;





protected void installChartFromJsonIO(final YuiContext Y, final Node p) {
	//in this case use get for loading the data from a file left in public folder GWT.getModuleBaseURL()+"testfiles/data1.json"
	String uri1 = GWT.getModuleBaseURL()+"testfiles/data1.json";
		
	//create an io object for working that will notify us for some io events...
	IOConfig ioConfig = IOConfig.create().
			on(IO.EVENT_SUCCESS, new EventCallback<IOEvent>() {					
		
		public void call(final IOEvent e) {
			JsArray data = JsonUtils.unsafeEval(e.data().responseText()); 
			ChartBase chart1 = Y.newChart(ChartBaseConfig.create().dataProvider(data).render(p)); 
			
			//now that the data of the second chart is 
			renderTabView(Y); 
		}
		
	}).on(IO.EVENT_FAILURE, new EventCallback<IOEvent>() {
		
		public void call(IOEvent e) {
			Window.alert("FAILURE. Status: "+e.data().status()+" - "+e.data().statusText()); 
		}
	}).cast(); 
	IO io1 = Y.newIO(ioConfig);
	Response resp = io1.send(uri1, ioConfig);
}

protected void renderTabView(YuiContext Y) {

	tb = Y.newTabView(TabViewConfig.create(new TabConfig[]{
		TabConfig.create().label("from javascript array").content(chartContainer1),
		TabConfig.create().label("bar").content(chartContainer2),
	})); 
	tb.render(mainParent);
	tb.selectChild(0); 
}

}
