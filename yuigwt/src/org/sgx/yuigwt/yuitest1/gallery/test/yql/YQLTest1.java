package org.sgx.yuigwt.yuitest1.gallery.test.yql;

import static org.sgx.yuigwt.yuitest1.gallery.GalleryConstants.TAG_BUTTON;
import static org.sgx.yuigwt.yuitest1.gallery.GalleryConstants.TAG_WIDGET;
import static org.sgx.yuigwt.yuitest1.gallery.GalleryConstants.TAG_YQL;

import org.sgx.yuigwt.yui.YUI;
import org.sgx.yuigwt.yui.YUICallback;
import org.sgx.yuigwt.yui.YuiContext;
import org.sgx.yuigwt.yui.console.Console;
import org.sgx.yuigwt.yui.node.Node;
import org.sgx.yuigwt.yui.util.JsObject;
import org.sgx.yuigwt.yui.yql.YQL;
import org.sgx.yuigwt.yui.yql.YQLCallback;
import org.sgx.yuigwt.yui.yql.YQLParams;
import org.sgx.yuigwt.yui.yql.api.YQLResult;
import org.sgx.yuigwt.yui.yql.api.weather.forecast.Channel;
import org.sgx.yuigwt.yui.yql.api.weather.forecast.WheatherForecastResult;
import org.sgx.yuigwt.yuitest1.gallery.test.AbstractTest;
import org.sgx.yuigwt.yuitest1.gallery.test.TestResources;

import com.google.gwt.core.client.JsArray;
/**
 * In this example we perform some YQL request and show the response using both the yql.api java API and plain javascript response objects. Three examples: 1) simple YQL query weather.forecast, pass diagnostics param and get some request dignostic info. 2) an example using datatables.org, this time yui.gallery.all for information about yui gallery modules. We use the parameter 'env'. 3) handle an yql request that gives error
 * @author sg
 *
 */
public class YQLTest1 extends AbstractTest {

public YQLTest1() {
	super("yql1", "In this example we perform some YQL request and show the response using both the yql.api java API and plain javascript response objects. Three examples: 1) simple YQL query weather.forecast, pass diagnostics param and get some request dignostic info. 2) an example using datatables.org, this time yui.gallery.all for information about yui gallery modules. We use the parameter 'env'. 3) handle an yql request that gives error", 
		new String[]{TAG_BUTTON, TAG_WIDGET, TAG_YQL}, 
		TestResources.instance.YQLTest1());
}


public void test(final Node parent) {
YUI.Use(new String[]{"yql", "console", "dump", "json"}, new YUICallback() {
	
	public void ready(final YuiContext Y) {

		final Console console = Y.newConsole()
//				.collapsed(true)
				.render().cast();			  
				
		/* simple YQL query weather.forecast */
		YQLParams params1 = YQLParams.create()
			.format("json").diagnostics("true"); 
		YQL yql1 = Y.newYQL("select * from weather.forecast where location=90210", new YQLCallback() {			
			
			public void call(YQLResult r) {
//				console.log(Y.JSON().stringify(r)); 
				WheatherForecastResult fresult = r.query().results().cast(); 
				Channel channel = fresult.channel(); 
				parent.append(
					"<a href=\""+channel.link()+"\">"+
						channel.title()+"</a> - Wind speed: "+channel.wind().speed()+" kph. " +
		
					//or not using any Java API at all, just the js object api	
					"Direction: "+r.query().results().objGetObj("channel").
						objGetObj("wind").objGetString("direction")+
						
					//and because we use diagnostics("true"),  we can access diagnostic info
					"<p>Diagnostic - servicetime: "+r.query().diagnostics().serviceTime()+" ms."
				);				 
			}
		}, params1); 
		
		
		/* an example using datatables.org, this time yui.gallery.all for information 
		 * about yui gallery modules. We use the parameter "env". */ 
		
		String query2 = "select * from yui.gallery.all";
		YQLCallback yqlCallback2 = new YQLCallback() {			
			
			public void call(YQLResult r) {
				JsObject o = r.query().results().objGetObj("json"); //type, count, modules, } 
				JsArray<JsObject> modules = o.objGetObj("modules").cast(); 
				JsObject module0 = modules.get(0); 
				console.log("first module title is "+module0.objGetString("title")); 				 
			}
		}; 
		YQLParams yqlParams2 = YQLParams.create().env("http://datatables.org/alltables.env"); 
		yqlParams2.format("json");  
		YQL yql2 = Y.newYQL(query2, yqlCallback2, yqlParams2); 

		
		/* handle an yql request that gives error */		
		YQL yql3 = Y.newYQL("select * from weather.nonexist123 where nonexists=90210", new YQLCallback() {			
			
			public void call(YQLResult r) {
				if(r.error()!=null) 
					console.log("ERROR (it is ok..):"+r.error().description()); 
			}
		}); 
	}
}); 
}
}
