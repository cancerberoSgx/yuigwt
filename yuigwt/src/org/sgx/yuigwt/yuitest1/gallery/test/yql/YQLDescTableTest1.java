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
import org.sgx.yuigwt.yuitest1.gallery.GalleryConstants;
import org.sgx.yuigwt.yuitest1.gallery.test.AbstractTest;
import org.sgx.yuigwt.yuitest1.gallery.test.TestResources;

import com.google.gwt.core.client.GWT;
import com.google.gwt.core.client.JsArray;
import com.google.gwt.core.client.JsArrayString;
/**
 * @author sg
 *
 */
public class YQLDescTableTest1 extends AbstractTest implements YUICallback {

protected Node parent, input, descriptionContainer;
protected Console console;
private YuiContext Y;
protected JsArray<TableShow> tables;
private Node listAllTablesContainer;


public YQLDescTableTest1() {
	super("yqlDescShowTables", "in this example we use YQL queries 'show tables' and 'desc tableName' for showing an input with autocomplete with all YQL tables and a button for showing a description of selected table name. ", 
		new String[]{GalleryConstants.TAG_BUTTON, GalleryConstants.TAG_YQL, 
			GalleryConstants.TAG_AUTOCOMPLETE}, 
		TestResources.instance.YQLTest2());
}


@Override
public void test(Node parent) {
	this.parent=parent; 
	//load yui usng this as the YUI callback, see ready() method
	YUI.Use(new String[]{"yql", "console", "button","dump", "json", "io", "panel",
		"autocomplete", "autocomplete-filters", "autocomplete-highlighters"}, this); 
}
@Override
public void ready(YuiContext Y) {
	this.console = Y.newConsole().collapsed(true).render().cast();
	console.contentBox().setX(200); 
	this.Y=Y; 
	parent.append("<p>Please select a datatable: </p>"); 
	input = parent.appendChild("<input type=\"text\"></input>");
	input.set("value", "answers.getquestion"); 
	Y.newButton(ButtonConfig.create().label("describe table!").render(parent).
		on("click", new EventCallback<ButtonEvent>() {				
			@Override
			public void call(ButtonEvent e) {
				describeDatatable(input.get("value")); 
			}				
		})
	); 
	Y.newButton(ButtonConfig.create().label("list all tables").render(parent).
		on("click", new EventCallback<ButtonEvent>() {				
			@Override
			public void call(ButtonEvent e) {
				doListAllTables(); 
			}				
		})
	); 
	descriptionContainer = parent.appendChild("<div></div>");
	listAllTablesContainer = parent.appendChild("<div></div>");	
	doShowTablesThenRenderAutocomplete(); 	
}

protected void doListAllTables() {
	StringBuffer sb = new StringBuffer(); 
	if(tables==null) 
		return;
	for (int i = 0; i < tables.length(); i++) {
		TableShow t = tables.get(i); 
		sb.append("<a href=\""+t.src()+"\">"+t.content()+"</a>, &nbsp;"); 
	}	
	listAllTablesContainer.empty().append(sb.toString());	
}


protected void doTableAutocomplete() {	
	JsArrayString  tableNames = JsArrayString.createArray().cast(); 
	for (int i = 0; i < tables.length(); i++) {
		TableShow table = tables.get(i);
		tableNames.push(table.content()); 
	}
	console.log("doTableAutocomplete: "+tables.length()+" - "+tableNames.length()); 
	AutoComplete ac = Y.newAutoComplete(AutoCompleteConfig.create().
		resultHighlighter("phraseMatch").resultFilters("phraseMatch").
		inputNode(input)
		.source(tableNames)
		.render(true)
	); 	
	ac.render(); 
}

protected void doShowTablesThenRenderAutocomplete() {
	console.log("doShowTables"); 
	String query = "show tables"; 
	YQLParams yqlParams = YQLParams.create()
		.env("http://datatables.org/alltables.env")
		.format("json").diagnostics("true"); 
	YQL yql1 = Y.newYQL(query, new YQLCallback() {			
		@Override
		public void call(YQLResult r) {				
			if(r.error()!=null) {
				console.log("YQL ERROR while requesting show tables"+r.error().description()); 
				return ; 
			}				
			ShowTablesResult res = ShowTablesResult.normalize(Y, r.query().results()); 
			console.log("show tables ok : "+res.table().length()+" tables received. "); 
			YQLDescTableTest1.this.tables = res.table(); 
			doTableAutocomplete(); 
		}
	}, yqlParams); 
}

private void describeDatatable(String datatableName) {
	final String query = "desc "+datatableName; 
	YQLParams yqlParams = YQLParams.create()
		.env("http://datatables.org/alltables.env")
		.format("json").diagnostics("true"); 
	YQL yql1 = Y.newYQL(query, new YQLCallback() {			
		@Override
		public void call(YQLResult r) {				
			if(r.error()!=null) {
				console.log("YQL ERROR while requesting: "+query+" : "+r.error().description()); 
				return ; 
			}				
			DescResult desc1 = r.query().results().cast(); 
			
			TableDesc t = desc1.table();
//			console.log("t.meta().sampleQuery(): "+Y.dump(t.meta().sampleQuery())); 
			
			String sapmleQueryHtml = "<ul>"; 
			JsArray<SampleQuery> sampleQUeries = t.meta().sampleQuery(); 
			for (int i = 0; i < sampleQUeries.length(); i++) {
				SampleQuery sq = sampleQUeries.get(i); 
				sapmleQueryHtml += "<li><p>Description: "+Y.Escape().html(sq.description())+"</p>" +
				"<pre>" + sq.content()+"</pre></li>"; 
			}
			sapmleQueryHtml += "<ul>"; 
			
			descriptionContainer.empty(); 
			descriptionContainer.append(
			"<table>" +
			"	<tr><td>TableShow Name: </td><td>"+t.name()+"</td></tr>" +
			"	<tr><td>TableShow Hash: </td><td>"+t.hash()+"</td></tr>" +
			"	<tr><td>TableShow Security: </td><td>"+t.security()+"</td></tr>" +
			"	<tr><td>Author: </td><td>"+t.meta().author()+"</td></tr>" +
			"	<tr><td>Documentation URL: </td><td><a href=\""+t.meta().documentationURL()+"\">link to docs</a></td></tr>" +
			"	<tr><td>sample query: </td><td>"+sapmleQueryHtml+"</td></tr>" +
			"</table>"
			); 
		}
	}, yqlParams); 
}

}
