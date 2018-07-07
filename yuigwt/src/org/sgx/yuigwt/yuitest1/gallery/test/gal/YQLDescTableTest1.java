package org.sgx.yuigwt.yuitest1.gallery.test.gal;

import static org.sgx.yuigwt.yuitest1.gallery.GalleryConstants.TAG_BUTTON;
import static org.sgx.yuigwt.yuitest1.gallery.GalleryConstants.TAG_EVENT;
import static org.sgx.yuigwt.yuitest1.gallery.GalleryConstants.TAG_WIDGET;

import org.sgx.yuigwt.yui.YUI;
import org.sgx.yuigwt.yui.YUICallback;
import org.sgx.yuigwt.yui.YuiConfig;
import org.sgx.yuigwt.yui.YuiContext;
import org.sgx.yuigwt.yui.console.Console;
import org.sgx.yuigwt.yui.node.Node;
import org.sgx.yuigwt.yui.util.JsObject;
import org.sgx.yuigwt.yui.yql.YQL;
import org.sgx.yuigwt.yui.yql.YQLCallback;
import org.sgx.yuigwt.yui.yql.YQLParams;
import org.sgx.yuigwt.yui.yql.api.YQLResult;
import org.sgx.yuigwt.yui.yql.api.desc.DescResult;
import org.sgx.yuigwt.yui.yql.api.desc.TableDesc;
import org.sgx.yuigwt.yui.yql.api.desc.TableDescMeta;
import org.sgx.yuigwt.yuitest1.gallery.GalleryConstants;
import org.sgx.yuigwt.yuitest1.gallery.test.AbstractTest;
import org.sgx.yuigwt.yuitest1.gallery.test.TestResources;

import com.google.gwt.core.client.JavaScriptObject;
import com.google.gwt.core.client.JsArray;
/**
 * @author sg
 *
 */
public class YQLDescTableTest1 extends AbstractTest {

public YQLDescTableTest1() {
	super("geo1", "use gallery-geo for getting web user location and then ask weather in that point using YQL wather datatable and show the weather using handlebars", 
		new String[]{GalleryConstants.TAG_BUTTON, GalleryConstants.TAG_YQL, GalleryConstants.TAG_STYLESHEET, GalleryConstants.TAG_HANDLEBARS}, 
		TestResources.instance.YQLTest2());
}



public void test(final Node parent) {
YUI.YUI(YuiConfig.create().gallery("gallery-2011.10.20-23-28"))
.use(new String[]{"yql", "gallery-geo", "handlebars"}, new YUICallback() {
	
	public void ready(final YuiContext Y) {

		final Console console = Y.newConsole().collapsed(true).render().cast();		
		
		String tableMetaTemplStr = 
		"<table>" +
		"	<tr><td class=\"title\">TableShow Name: </td><td></td></tr>" +
		"</table>"; 
		
		//yql desc answers.getquestion
		YQL yql1 = Y.newYQL("desc answers.getquestion", new YQLCallback() {			
			
			public void call(YQLResult r) {		
				
				if(r.error()!=null) {
					console.log("YQL ERROR:"+r.error().description()); 
					return ; 
				}				
				DescResult desc1 = r.query().results().cast(); 
				
				TableDesc t = desc1.table();
				parent.append(
				"<table>" +
				"	<tr><td>TableShow Name: </td><td>"+t.name()+"</td></tr>" +
				"	<tr><td>TableShow Hash: </td><td>"+t.hash()+"</td></tr>" +
				"	<tr><td>TableShow Security: </td><td>"+t.security()+"</td></tr>" +
				"	<tr><td>Author: </td><td>"+t.meta().author()+"</td></tr>" +
				"</table>"
				); 
			}
		}, YQLParams.create().env("http://datatables.org/alltables.env").
			format("json").diagnostics("true")); 
		
		
	}
}); 
}

}
