package org.sgx.yuigwt.yuitest1.gallery.test;

import static org.sgx.yuigwt.yuitest1.gallery.GalleryConstants.TAG_NODE;
import static org.sgx.yuigwt.yuitest1.gallery.GalleryConstants.TAG_SCROLLVIEW;

import org.sgx.yuigwt.yui.YUI;
import org.sgx.yuigwt.yui.YUICallback;
import org.sgx.yuigwt.yui.YuiContext;
import org.sgx.yuigwt.yui.attr.AttributeEvent;
import org.sgx.yuigwt.yui.console.Console;
import org.sgx.yuigwt.yui.console.ConsoleConfig;
import org.sgx.yuigwt.yui.event.EventCallback;
import org.sgx.yuigwt.yui.event.EventFacade;
import org.sgx.yuigwt.yui.node.Node;
import org.sgx.yuigwt.yui.node.Transition;
import org.sgx.yuigwt.yui.util.Style;
import org.sgx.yuigwt.yui.widget.Widget;
import org.sgx.yuigwt.yui.widget.button.ButtonConfig;
import org.sgx.yuigwt.yui.widget.scrollview.ScrollView;
import org.sgx.yuigwt.yui.widget.scrollview.ScrollViewConfig;
import org.sgx.yuigwt.yui.widget.scrollview.ScrollViewPaginator;
import org.sgx.yuigwt.yui.widget.scrollview.ScrollViewPaginatorConfig;
import org.sgx.yuigwt.yui.widget.scrollview.ScrollView.Flick;
/**
 * scrollView2. @see http://yuilibrary.com/yui/docs/scrollview/scrollview-paging.html
 * @author sg
 *
 */
public class ScrollViewTest2 extends AbstractTest {

protected ScrollView sv1;
protected int currentIndex = 0; 

public ScrollViewTest2() {
	super("scrollView2", "scrollView2. @see http://yuilibrary.com/yui/docs/scrollview/scrollview-paging.html", 
		new String[]{TAG_NODE, TAG_SCROLLVIEW}, 
		TestResources.instance.ScrollViewTest2());
}

@Override
public void test(final Node parent) {
YUI.Use(new String[]{"scrollview", "button", "console", "scrollview-paginator"}, new YUICallback() {
	private ScrollViewPaginator pages;

	@Override
	public void ready(final YuiContext Y) {

		final Console console1 = Y.newConsole(ConsoleConfig.create());
		console1.render(); 
		
		//install some html list markup to scroll with paginator
		Node sv1Node = parent.appendChild("<ul id=\"scrollview1\"></ul>"); 		
		
		StringBuffer sb = new StringBuffer(); 
		for (int i = 0; i < 100; i++) {
			sb.append("<li>This is a long line "+i+" </li>"); 
		}
		sv1Node.set("innerHTML", sb.toString()); 
		
		parent.all("li").setStyles(Style.create().width("100px").display("inline"));  
		
		sv1 = Y.newScrollView(ScrollViewConfig.create().
			flick(Flick.create().minDistance(8).minVelocity(0.3).axis("x")).
			srcNode(sv1Node).height("100px")); 
		sv1.render(); 
		
		sv1.plug(Y.Plugin().ScrollViewPaginator(), 
			ScrollViewPaginatorConfig.create().selector("li")); 
		
		sv1.on(ScrollViewPaginator.EVENT_INDEXCHANGE, new EventCallback<AttributeEvent>() {
			@Override
			public void call(AttributeEvent e) {
				console1.log("index changed changed: "+e.newValInt()); 
			}
		}); 
		pages = sv1.pages(); 
		
		Y.newButton(
			ButtonConfig.create().label("prev").
			on("click", new EventCallback<EventFacade>() {
				@Override
				public void call(EventFacade e) {
					currentIndex--; 
					pages.scrollTo(currentIndex, 400, "easy"); 
				}
			})
		).render(parent);
		
		Y.newButton(
			ButtonConfig.create().label("next").
			on("click", new EventCallback<EventFacade>() {
				

				@Override
				public void call(EventFacade e) {
					currentIndex++; 
					pages.scrollTo(currentIndex, 400, "easy");  
				}
			})
		).render(parent);
		
		
	}
}); 
}

}
