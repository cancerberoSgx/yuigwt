package org.sgx.yuigwt.yuitest1.gallery.test;


import org.sgx.yuigwt.yui.YUI;
import org.sgx.yuigwt.yui.YUICallback;
import org.sgx.yuigwt.yui.YuiContext;
import org.sgx.yuigwt.yui.console.Console;
import org.sgx.yuigwt.yui.console.ConsoleConfig;
import org.sgx.yuigwt.yui.event.EventCallback;
import org.sgx.yuigwt.yui.history.HistoryBase;
import org.sgx.yuigwt.yui.history.HistoryEvent;
import org.sgx.yuigwt.yui.node.Node;
import org.sgx.yuigwt.yui.widget.Widget;
import org.sgx.yuigwt.yui.widget.tabview.TabConfig;
import org.sgx.yuigwt.yui.widget.tabview.TabView;
import org.sgx.yuigwt.yui.widget.tabview.TabViewConfig;
import org.sgx.yuigwt.yui.widget.tabview.TabViewEvent;
import org.sgx.yuigwt.yuitest1.gallery.GalleryConstants;
/**
 * history test 1 - history and tabview example the same as 
 * http://yuilibrary.com/yui/docs/history/history-tabview.html
 * @author sg
 *
 */
public class HistoryTest1 extends AbstractTest {

public HistoryTest1() {
	super("history1", "history test 1 - history and tabview example the same as http://yuilibrary.com/yui/docs/history/history-tabview.html", 
		new String[]{GalleryConstants.TAG_HISTORY,GalleryConstants.TAG_EVENT,  GalleryConstants.TAG_WIDGET, GalleryConstants.TAG_TABVIEW, GalleryConstants.TAG_UTILS}, 
		TestResources.instance.HistoryTest1());
}

@Override
public void test(final Node parent) {
YUI.Use(new String[]{"history", "tabview", "console"}, new YUICallback() {
	@Override
	public void ready(final YuiContext Y) {
		
		final Console console = Y.newConsole(ConsoleConfig.create() );
		console.render(); 
		
		final HistoryBase history = Y.newHistoryHash(); 
		
		final TabView tb = Y.newTabView(TabViewConfig.create(new TabConfig[]{
			TabConfig.create().label("tab1").content("<p>11111111111 foo content</p>"),
			TabConfig.create().label("tab2").content("<p>2222222222222222<b>Hello</b>foo <i>content</i></p>"),
			TabConfig.create().label("tab3").content("<p>3333333333333<b>ben parker</b>foo <i>holla dooba do</i></p>"),
		})); 
		tb.render(parent); 
		
		tb.after("selectionChange", new EventCallback<TabViewEvent>() {

			@Override
			public void call(TabViewEvent e) {
				
				/* note e.newVal is the selected child widget - we cast directly. 
				 * @see http://yuilibrary.com/yui/docs/api/classes/WidgetParent.html#attr_selection
				 */
				Widget selChild = e.newValObj().cast();
				
				int newTabIndex = selChild.getInt("index"); 
				
				console.log("tabview selectionChange: "+newTabIndex); 
				
				history.addValue("tab", newTabIndex==0 ? null : newTabIndex+""); 
			}
		}); 		
		
		tb.selectChild(parseInt(history.get("tab"), 0));
		Y.on("history:change", new EventCallback<HistoryEvent>() {
			@Override
			public void call(HistoryEvent e) {
				// Ignore changes we make ourselves, since we don't need
			    // to update the selection state for those. We're only
			    // interested in outside changes, such as the ones generated
			    // when the user clicks the browser's back or forward buttons.
				if(e.src().equals(Y.HistoryHash().SRC_HASH())) {
					if(e.changed().objGetObj("tab")!=null) {
						//e.changed.tab.newVal is a string containing the tab index
						int i = parseInt(e.changed().objGetObj("tab").objGetString("newVal"), 0);					
						tb.selectChild(i); 
					}
					else if(e.removed().objGetString("tab")!=null) {
						// The tab selection was removed in the new state, so
					    // select the first tab by default.
						tb.selectChild(0); 
					}
					else {
					}
				}
			}
		}); 
	}
}); 
}

protected int parseInt(String s, int def) {
	try {
		return Integer.parseInt(s); 
	} catch (Exception e) {
		return def; 
	}
}

}
