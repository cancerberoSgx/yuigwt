package org.sgx.yuigwt.yuitest1.gallery.test.yql;

import org.sgx.yuigwt.yui.YUI;
import org.sgx.yuigwt.yui.YUICallback;
import org.sgx.yuigwt.yui.YuiContext;
import org.sgx.yuigwt.yui.console.Console;
import org.sgx.yuigwt.yui.event.EventCallback;
import org.sgx.yuigwt.yui.event.YuiEvent;
import org.sgx.yuigwt.yui.io.IO;
import org.sgx.yuigwt.yui.io.IOConfig;
import org.sgx.yuigwt.yui.io.IOEvent;
import org.sgx.yuigwt.yui.io.Response;
import org.sgx.yuigwt.yui.node.Node;
import org.sgx.yuigwt.yui.node.NodeEventDelegateCallback;
import org.sgx.yuigwt.yui.util.JsUtil;
import org.sgx.yuigwt.yui.util.Point;
import org.sgx.yuigwt.yui.widget.autocomplete.AutoComplete;
import org.sgx.yuigwt.yui.widget.autocomplete.AutoCompleteConfig;
import org.sgx.yuigwt.yui.widget.button.ButtonConfig;
import org.sgx.yuigwt.yui.widget.button.ButtonEvent;
import org.sgx.yuigwt.yui.widget.ext.Align;
import org.sgx.yuigwt.yui.widget.panel.Panel;
import org.sgx.yuigwt.yui.widget.panel.PanelConfig;
import org.sgx.yuigwt.yui.yql.YQL;
import org.sgx.yuigwt.yui.yql.YQLCallback;
import org.sgx.yuigwt.yui.yql.YQLParams;
import org.sgx.yuigwt.yui.yql.api.YQLResult;
import org.sgx.yuigwt.yui.yql.api.desc.DescResult;
import org.sgx.yuigwt.yui.yql.api.desc.SampleQuery;
import org.sgx.yuigwt.yui.yql.api.desc.TableDesc;
import org.sgx.yuigwt.yui.yql.api.showtables.ShowTablesResult;
import org.sgx.yuigwt.yui.yql.api.showtables.TableShow;
import org.sgx.yuigwt.yui.yql.api.yui.gallery.all.YuiGalleryAllModule;
import org.sgx.yuigwt.yui.yql.api.yui.gallery.all.YuiGalleryAllResult;
import org.sgx.yuigwt.yui.yql.api.yui.gallery.user.YuiGalleryUserResult;
import org.sgx.yuigwt.yuitest1.gallery.GalleryConstants;
import org.sgx.yuigwt.yuitest1.gallery.test.AbstractTest;
import org.sgx.yuigwt.yuitest1.gallery.test.TestResources;

import com.google.gwt.core.client.GWT;
import com.google.gwt.core.client.JavaScriptObject;
import com.google.gwt.core.client.JsArray;
import com.google.gwt.core.client.JsArrayString;
/**
 * usage of tables yui.gallery.*
 * @author sg
 *
 */
public class YQLYuiGalleryTest1 extends AbstractTest implements YUICallback {

protected Node parent, ownerlist, ownerdescr, ownerInput; //, input, descriptionContainer;
protected Console console;
protected YuiContext Y;
protected JsArrayString  owners;
protected JsArray<YuiGalleryAllModule> allModules;
private YQLParams yqlParams;

public YQLYuiGalleryTest1() {
	super("yqlYuiGallery", "usage of tables yui.gallery.*", 
		new String[]{GalleryConstants.TAG_BUTTON, GalleryConstants.TAG_YQL}, 
		TestResources.instance.YQLYuiGalleryTest1());
}


@Override
public void test(Node parent) {
	this.parent=parent; 
	//load yui usng this as the YUI callback, see ready() method
	YUI.Use(new String[]{"yql", "console", "button","dump", "json", "io", "panel",
		"autocomplete", "autocomplete-filters", "autocomplete-highlighters"}, this); 
}
@Override
public void ready(YuiContext Y_) {
	this.Y=Y_;
	this.console = Y.newConsole().collapsed(true).render().cast();
	console.contentBox().setX(200); 
	
	parent.append("<table></tr><td id=\"ownerlist\"></td><td id=\"ownerdescr\"></td></tr></table>"); 
	ownerlist = parent.one("#ownerlist");
	ownerdescr = parent.one("#ownerdescr"); 
	
	/* first gwt all gallery module owners using "select owner from yui.gallery.all", and display links. When links are clicked, 
	 * owner user information is read using "select * from yui.gallery.user where..."
	 */
	yqlParams = YQLParams.create()
		.env("http://datatables.org/alltables.env")
		.format("json").diagnostics("true"); 
	
	final String query1 = "select * from yui.gallery.all";
	YQL yql1 = Y.newYQL(query1, new YQLCallback() {			
		@Override
		public void call(YQLResult r) {				
			if(r.error()!=null) {
				console.log("YQL ERROR while requesting show tables"+r.error().description()); 
				return ; 
			}
//			JsUtil.collect(res.json().modules())
			YuiGalleryAllResult res = r.query().results().cast();
			allModules = res.json().modules(); 
			
			
			doOwnerList(); 
			
			console.log(query1+" modules: "+res.json().modules().length());//Y.JSON().stringify(r.query().results()));
			
		}
	}, yqlParams); 
	
	

		
}


protected void doOwnerList() {
	ownerlist.append("<h3>Module Owner List. Please search or select one</h3>"); 
	ownerInput = parent.appendChild("<input type=\"text\"></input>"); 
	
//	console.log(Y.dump(allModules.get(0).ownerObj(), 10)); 
	owners = JsArrayString.createArray().cast(); 
	for (int i = 0; i < allModules.length(); i++) {
		YuiGalleryAllModule module = allModules.get(i);
		owners.push(module.owner().username());
	}			
	
	AutoComplete ac = Y.newAutoComplete(AutoCompleteConfig.create().
		resultHighlighter("phraseMatch").resultFilters("phraseMatch").
		inputNode(ownerInput)
		.source(owners)
		.render(true)
	); 
	ac.render(); 
//	console.log("AC: "+owners.length()+" - "+Y.dump(owners.get(0))); 
	Y.newButton(ButtonConfig.create().label("describe table!").render(ownerlist).
		on("click", new EventCallback<ButtonEvent>() {				
			@Override
			public void call(ButtonEvent e) {
				doShowOwnerDescription(ownerInput.get("value")); 
			}				
		})
	); 
			
}


protected void doShowOwnerDescription(String owner) {
	final String query2 = "select * from yui.gallery.user where username='"+owner+"'";
//final String query2 = "select * from yui.gallery.user";// where username='davglass'"; 
YQL yql2 = Y.newYQL(query2, new YQLCallback() {			
	@Override
	public void call(YQLResult r) {				
		if(r.error()!=null) {
			console.log("YQL ERROR while requesting show tables"+r.error().description()); 
			return ; 
		}					
//		console.log(query2+" returned: "+Y.JSON().stringify(r.query().results()));
		YuiGalleryUserResult res = r.query().results().cast(); 
		ownerdescr.append("<p>owner email: "+res.json().userinfo().email()+"</p>"); 
		
	}
}, yqlParams); 
}


}
