package org.sgx.yuigwt.yuitest1.gallery.test;

import static org.sgx.yuigwt.yuitest1.gallery.GalleryConstants.*;

import org.sgx.yuigwt.yui.YUI;
import org.sgx.yuigwt.yui.YUICallback;
import org.sgx.yuigwt.yui.YuiContext;
import org.sgx.yuigwt.yui.event.EventCallback;
import org.sgx.yuigwt.yui.node.Node;
import org.sgx.yuigwt.yui.widget.button.ButtonConfig;
import org.sgx.yuigwt.yui.widget.button.ButtonEvent;
import org.sgx.yuigwt.yui.widget.tabview.TabConfig;
import org.sgx.yuigwt.yui.widget.tabview.TabView;
import org.sgx.yuigwt.yui.widget.tabview.TabViewConfig;

import com.google.gwt.user.client.Window;
/**
 * this is the equivalent of 
 * <pre>
YUI().use('button', function (Y) {
    new Y.Button({
        label: 'a simple button'
    }).render(parent);
});
</pre>

 * @author sg
 *
 */
public class TabViewTest1 extends AbstractTest {

public TabViewTest1() {
	super("tabview1", "tabview test1", new String[]{TAG_TABVIEW, TAG_WIDGET}, 
		TestResources.instance.TabViewTest1());
}

@Override
public void test(final Node parent) {
YUI.Use(new String[]{"tabview", "button"}, new YUICallback() {
	@Override
	public void ready(final YuiContext Y) {
		
		parent.append("<p id=\"sometabcontent\">I will be a tab content some day</p>"); 
		
		final TabView tb = Y.newTabView(TabViewConfig.create(new TabConfig[]{
			TabConfig.create().label("foo").content("<p>foo content</p>"),
			TabConfig.create().label("bar").content("<p><b>Hello</b>foo <i>content</i></p>"),
			TabConfig.create().label("ben").content("<p><b>ben parker</b>foo <i>holla dooba do</i></p>"),
			TabConfig.create().label("from markup").content(Y.one("#sometabcontent")),
		})); 
		
		tb.render(parent); 
		
		tb.selectChild(1); 
		
//		Y.newButton(ButtonConfig.create().label("add new tab").render(parent).
//			on("click", new EventCallback<ButtonEvent>() {				
//				@Override
//				public void call(ButtonEvent e) {
//					String tabName = Window.prompt("Tab name: ", "tab123234");  
//					String contentHTML = Window.prompt("Content HTML: ", "<p>some content <b>for the tab</b></p>");
//					tb.add(tb.size(), TabConfig.create().label(tabName).content(contentHTML)); 
//				}
//			})
//		); 	
	}
}); 
}

}
