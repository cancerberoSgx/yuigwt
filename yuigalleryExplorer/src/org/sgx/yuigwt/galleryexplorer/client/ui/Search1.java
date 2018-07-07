package org.sgx.yuigwt.galleryexplorer.client.ui;

import org.sgx.yuigwt.galleryexplorer.client.api.Module;
import org.sgx.yuigwt.galleryexplorer.client.search.ByNameSearcher;
import org.sgx.yuigwt.galleryexplorer.client.search.ByRequiresSearcher;
import org.sgx.yuigwt.galleryexplorer.client.search.ByTagsSearcher;
import org.sgx.yuigwt.galleryexplorer.client.search.SearchUtil;
import org.sgx.yuigwt.yui.YUI;
import org.sgx.yuigwt.yui.console.Console;
import org.sgx.yuigwt.yui.event.EventCallback;
import org.sgx.yuigwt.yui.node.Node;
import org.sgx.yuigwt.yui.util.Style;
import org.sgx.yuigwt.yui.widget.autocomplete.AutoComplete;
import org.sgx.yuigwt.yui.widget.autocomplete.AutoCompleteConfig;
import org.sgx.yuigwt.yui.widget.button.ButtonConfig;
import org.sgx.yuigwt.yui.widget.button.ButtonEvent;
import org.sgx.yuigwt.yui.widget.datatable.DataTable;
import org.sgx.yuigwt.yui.widget.datatable.DataTableConfig;
import org.sgx.yuigwt.yui.widget.scrollview.ScrollViewConfig;
import org.sgx.yuigwt.yui.widget.scrollview.ScrollView.Flick;
import org.sgx.yuigwt.yui.widget.tabview.TabConfig;
import org.sgx.yuigwt.yui.widget.tabview.TabView;
import org.sgx.yuigwt.yui.widget.tabview.TabViewConfig;
import org.sgx.yuigwt.yuigallery.YuiGalleryContext;

import com.google.gwt.core.client.JsArray;
import com.google.gwt.core.client.JsArrayString;
import com.google.gwt.user.client.Window;

/**
 * implements a search page. Supported: 
 *  - by module name, 
 *  - by module tags 
 *  - by module
 *  
 *  with autocomplete and datatable results
 * @author sg
 *
 */
public class Search1 {
//private Node byName;
//private Node byTag;
private Node resultContainer;
private YuiGalleryContext Y;
private GalleryUtil util;
private DataTable resultTable;
private Console console;

public void render(Node parent, Gallery gallery) {
	Y=gallery.Y; 
	util=gallery.util; 
	console=gallery.console; 
	parent.empty(); 
	parent.append(
		"<h2>Search Modules </h2>"+
		"<ul class=\"search1-search-box\">" +
			"<li id=\"search1-by-name\"><b class=\"label\">by name: </b><br/></li>" +
			"<li id=\"search1-by-tag\"><b class=\"label\">by tags: </b><br/></li>" +
			"<li id=\"search1-by-requires\"><b class=\"label\">by required modules: </b><br/></li>" +
		"</ul>"+
		"<div id=\"search1-result-container\"></div>"
	); 
	Node byName = parent.one("#search1-by-name");  
	Node byTag = parent.one("#search1-by-tag");
	Node byRequires = parent.one("#search1-by-requires");  
	resultContainer = parent.one("#search1-result-container");
	
	//search by name: 
	final ByNameSearcher byNameSearcher = new ByNameSearcher(util, ""); 
	final Node byNameInput = byName.appendChild("<input type=\"text\" value=\"\"></input>");
	
	AutoComplete ac = Y.newAutoComplete(AutoCompleteConfig.create().
		resultHighlighter("phraseMatch").
		inputNode(byNameInput).
		source(byNameSearcher.autocompleteData()).
		render(true)
	); 	
	Y.newButton(ButtonConfig.create().label("Search").
		on("click", new EventCallback<ButtonEvent>() {
		@Override
		public void call(ButtonEvent e) {
			String keyword = byNameInput.get("value"); 
			byNameSearcher.setName(keyword); 
			JsArray<Module> results = SearchUtil.search(util.getModules(), byNameSearcher); 
			console.log("search by name keyword: "+keyword+", results: "+results.length()); 
			resultTable.data(results); 
			resultTable.render(); 
		}
	})).render(byName); 
	
	//search by tags
	final ByTagsSearcher byTagsSearcher = new ByTagsSearcher(util, ""); 
	final Node byTagsInput = byTag.appendChild("<input type=\"text\" value=\"\"></input>");
	
	AutoComplete acTags = Y.newAutoComplete(AutoCompleteConfig.create().
		resultHighlighter("phraseMatch").
		inputNode(byTagsInput).
		source(byTagsSearcher.autocompleteData()).
		render(true)
	); 	
	Y.newButton(ButtonConfig.create().label("Search").
		on("click", new EventCallback<ButtonEvent>() {
		@Override
		public void call(ButtonEvent e) {
			String keyword = byTagsInput.get("value"); 
			byTagsSearcher.setTag(keyword); 
			JsArray<Module> results = SearchUtil.search(util.getModules(), byTagsSearcher); 
			console.log("search by tag keyword: "+keyword+", results: "+results.length()); 
			resultTable.data(results); 
			resultTable.render(); 
		}
	})).render(byTag); 
	
	//search by requires
	final ByRequiresSearcher byRequiresSearcher = new ByRequiresSearcher(util, ""); 
	final Node byRequiresInput = byRequires.appendChild("<input type=\"text\" value=\"\"></input>");
	
	AutoComplete acRequires = Y.newAutoComplete(AutoCompleteConfig.create().
		resultHighlighter("phraseMatch").
		inputNode(byRequiresInput).
		source(byRequiresSearcher.autocompleteData()).
		render(true)
	); 	
	Y.newButton(ButtonConfig.create().label("Search").
		on("click", new EventCallback<ButtonEvent>() {
		@Override
		public void call(ButtonEvent e) {
			String keyword = byRequiresInput.get("value"); 
			byRequiresSearcher.setRequire(keyword); 
			JsArray<Module> results = SearchUtil.search(util.getModules(), byRequiresSearcher); 
			console.log("search by Requires keyword: "+keyword+", results: "+results.length()); 
			resultTable.data(results); 
			resultTable.render(); 
		}
	})).render(byRequires); 
	
	
	
	//results data table
	resultTable = Y.newDataTable(DataTableConfig.create().
		columns(new String[]{"module", "title", /*"description", "url",*/ "requires", "summary", /*"cdn", "buildtag"*/}).
//		data(JsArray.createArray().cast()).
		caption("Example table with simple columns from java model").
		summary("Price sheet for inventory parts"));
	resultTable.render(resultContainer); 
	
	
//	TabView tb = Y.newTabView(TabViewConfig.create(new TabConfig[]{
//		TabConfig.create().label("foo").content("<p>foo content</p>"),
//		TabConfig.create().label("bar").content("<p><b>Hello</b>foo <i>content</i></p>"),
//		TabConfig.create().label("ben").content("<p><b>ben parker</b>foo <i>holla dooba do</i></p>"),
//		TabConfig.create().label("from markup").content(Y.one("#sometabcontent")),
//	})); 	
//	tb.render(parent); 	
//	tb.selectChild(1); 
		
		
//	gallery.getStyleSheet().set(".yui3-skin-sam .yui-ac-content", Style.create().overflow("auto")); 
	
//	.yui-skin-sam .yui-ac-content { /* set scrolling */ 
//6	    max-height:18em;overflow:auto;overflow-x:hidden; /* set scrolling */ 
//7	    _height:18em; /* ie6 */ 
//8	} 
	
	
//	ac.plug(Y.Plugin().AutoComplete(), AutoCompleteConfig.create().scrollIntoView(true).
//			resultHighlighter("phraseMatch").
//			resultHighlighter("phraseMatch").
//			source(byNameSearcher.autocompleteData()).height("300px")
//		); 
	
//	sv1 = Y.newScrollView(ScrollViewConfig.create().
//			flick(Flick.create().minDistance(8).minVelocity(0.3).axis("y")).
//			srcNode(sv1Node).height("100px")); 
//		sv1.render(); 
		
		
//	ac.plug(Y.Plugin().ScrollViewScrollbars()); 
	
}

}
