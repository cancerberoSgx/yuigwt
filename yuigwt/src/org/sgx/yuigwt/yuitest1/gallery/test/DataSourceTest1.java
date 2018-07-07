package org.sgx.yuigwt.yuitest1.gallery.test;


import org.sgx.yuigwt.yui.YUI;
import org.sgx.yuigwt.yui.YUICallback;
import org.sgx.yuigwt.yui.YuiContext;
import org.sgx.yuigwt.yui.console.Console;
import org.sgx.yuigwt.yui.console.ConsoleConfig;
import org.sgx.yuigwt.yui.datasource.DataSource;
import org.sgx.yuigwt.yui.datasource.DataSourceCallbackAdapter;
import org.sgx.yuigwt.yui.datasource.DataSourceConfig;
import org.sgx.yuigwt.yui.datasource.DataSourceEvent;
import org.sgx.yuigwt.yui.datasource.DataSourceRequest;
import org.sgx.yuigwt.yui.node.Node;
import org.sgx.yuigwt.yui.stylesheet.StyleSheet;
import org.sgx.yuigwt.yui.util.JsUtil;
import org.sgx.yuigwt.yuitest1.gallery.GalleryConstants;

import com.google.gwt.core.client.JavaScriptObject;
import com.google.gwt.user.client.Window;
/**
 * simple exmples of using datasource
 * @author sg
 *
 */
public class DataSourceTest1 extends AbstractTest {

protected StyleSheet sty1;
protected Node ta1, ta2, renderBox;
protected YuiContext Y;

public DataSourceTest1() {
	super("dataSource1", "simple exmples of using datasource",
		new String[]{GalleryConstants.TAG_DATASOURCE}, 
		TestResources.instance.DataSourceTest1()); 
}


public void test(final Node parent) {
YUI.Use(new String[]{"datasource", "console", "dump", "json"}, new YUICallback() {
	
	public void ready(final YuiContext Y) {	
		final Console console1 = Y.newConsole(ConsoleConfig.create().collapsed(true)).render().cast();
		
		//test 1 : Using DataSource.Local
		JavaScriptObject data1 = data1(); 
		DataSource ds1 = Y.newDataSourceLocal(DataSourceConfig.create().source(data1)); 
		ds1.sendRequest(DataSourceRequest.create().callback(new DataSourceCallbackAdapter() {
			
			public void success(DataSourceEvent e) {
				console1.log("success1: "+JsUtil.dumpObj(e.response().meta())+
					" - "+JsUtil.dumpObj(e.response().results(), true)); 
			}
			
			public void failure(DataSourceEvent e) {
				Window.alert("failure1: "+JsUtil.dumpObj(e));
			}
		})); 
		
		//test2: use DataSource.Get for getting data from datatables.org:
		String ds2url =  "http://query.yahooapis.com/v1/public/yql?format=json&", 
			yqlQuery = "show tables"; 
		DataSource ds2 = Y.newDataSourceGet(DataSourceConfig.create().source(ds2url)); 
		ds2.sendRequest(DataSourceRequest.create()
			.request("q="+yqlQuery)
			.callback(new DataSourceCallbackAdapter() {
			
			public void success(DataSourceEvent e) {
//				JsArray<Result> results = e.response().results().cast(); 
//				Result result = results.get(0);
//				if(result.error()!=null) {
//					console1.log("test2, YQL returned ERROR: "+result.error()); 
//					return; 
//				}
//				result.query().
				
//				console1.log("success2: "+JsUtil.dumpObj(e.response().meta())+
//					" - "+JsUtil.dumpObj(results.get(0).objGetObj("error"), true)); 
				
//				console1.log("success2: "+Y.dump(results.get(0), 10));
				
				console1.log("success2: "+Y.JSON().stringify(e.response().results()));
			}
			
			public void failure(DataSourceEvent e) {
				Window.alert("failure2: "+JsUtil.dumpObj(e));
			}
		})); 
		
		
	}
}); 
}

protected native final JavaScriptObject data1()/*-{
	return [
        {name:"abc",id:123,extra:"foo"},
        {name:"def",id:456,extra:"bar"},
        {name:"ghi",id:789,extra:"baz"}
    ]; 
}-*/;

}
