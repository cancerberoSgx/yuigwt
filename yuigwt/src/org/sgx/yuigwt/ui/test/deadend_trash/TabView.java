//package org.sgx.yuigwt.ui.test.deadend_trash;
//
//import java.util.Iterator;
//import java.util.LinkedList;
//import java.util.List;
//
//import org.sgx.yuigwt.yui.gwt.GWTUtil;
//import org.sgx.yuigwt.yui.widget.button.ButtonConfig;
//import org.sgx.yuigwt.yui.widget.tabview.TabViewConfig;
//
//import com.google.gwt.core.client.JavaScriptObject;
//import com.google.gwt.uibinder.client.UiChild;
//import com.google.gwt.user.client.ui.HTMLPanel;
//import com.google.gwt.user.client.ui.HasWidgets;
//import com.google.gwt.user.client.ui.Widget;
//
//public class TabView extends UIWidget implements HasWidgets {
//	public TabView() {
//		initUIWidget(ButtonConfig.create());
//		tabs = new LinkedList<Widget>(); 
//	}	
//	List<Widget> tabs; 
//	String[] headers; 
//	protected void initUIWidget(JavaScriptObject config)	{
////		System.out.println("TabView initUIWidget()");
//		yuiWidget = Y().newTabView((TabViewConfig) config); 
//		HTMLPanel panel = GWTUtil.YUI2GWT(Y(), yuiWidget);
//		initWidget(panel);
//		setStyleName(getYuiStyleName());
//	}
//	public void setHeaders(String s) {
////		System.out.println("TabView setHeaders()");
//		headers = s.split(","); 
//	}
//	@UiChild(tagname="tab")	
//	public void addTab(Widget t) {
//		add(t); 
//	}
//	
//	public void add(Widget w) {		
//		tabs.add(w);
//		//TODO: UI
//	}
//	
//	public void clear() {
//		tabs.clear(); 
//		//TODO: UI
//	}
//	
//	public Iterator<Widget> iterator() {
//		return tabs.iterator(); 
//	}
//	
//	public boolean remove(Widget w) {
//		return tabs.remove(w); 
//		//TODO: UI
//	}
//}
