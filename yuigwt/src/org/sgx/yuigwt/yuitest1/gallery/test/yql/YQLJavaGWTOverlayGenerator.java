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
 * using handlebars template for generating java GWT overlay classes source code from json plain objects
 * 
 * @author sg
 *
 */
public class YQLJavaGWTOverlayGenerator extends AbstractTest implements YUICallback {

protected Node parent; //, ownerlist, ownerdescr, ownerInput; //, input, descriptionContainer;
protected Console console;
protected YuiContext Y;
//protected JsArrayString  owners;
//protected JsArray<YuiGalleryAllModule> allModules;
private YQLParams yqlParams;

public YQLJavaGWTOverlayGenerator() {
	super("YQLJavaGWTOverlayGenerator", "using handlebars template for generating java GWT overlay classes source code from json plain objects", 
		new String[]{GalleryConstants.TAG_YQL, GalleryConstants.TAG_HANDLEBARS, GalleryConstants.TAG_JSON}, 
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
	
	String json = "{prop1: 'hehe'}"; 
	JavaScriptObject jsobj = Y.JSON().parse(json);	
}


public static class JsValue {
	String type; 
}
}
