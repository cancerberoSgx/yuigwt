package org.sgx.yuigwt.yuitest1.gallery.test;

import org.sgx.yuigwt.yui.YUI;
import org.sgx.yuigwt.yui.YUICallback;
import org.sgx.yuigwt.yui.YuiContext;
import org.sgx.yuigwt.yui.event.EventCallback;
import org.sgx.yuigwt.yui.node.Node;
import org.sgx.yuigwt.yui.sortable.Sortable;
import org.sgx.yuigwt.yui.sortable.SortableConfig;
import org.sgx.yuigwt.yui.stylesheet.StyleSheet;
import org.sgx.yuigwt.yui.util.Style;
import org.sgx.yuigwt.yui.widget.button.ButtonConfig;
import org.sgx.yuigwt.yui.widget.button.ButtonEvent;
import org.sgx.yuigwt.yuitest1.gallery.GalleryConstants;

import com.google.gwt.user.client.Window;
/**
 * @author sg
 *
 */
public class SortableTest1 extends AbstractTest {

protected StyleSheet sty1;

public SortableTest1() {
	super("sortable1", "sortable1", new String[]{GalleryConstants.TAG_SORTABLE}, 
			TestResources.instance.SortableTest1());
}


public void test(final Node parent) {
YUI.Use(new String[]{"sortable", "stylesheet", "button"}, new YUICallback() {

	
	public void ready(final YuiContext Y) {
		parent.append(
		"<p>try to drag and drop items from one select list to another and reorder them</p>" +
		"<table><tr><td>" +

		"<span id=\"demo1\">"+
		"    <ul>"+
		"        <li>Item #1</li>"+
		"        <li>Item #2</li>"+
		"        <li>Item #3</li>"+
		"        <li>Item #4</li>"+
		"        <li>Item #5</li>"+
		"        <li>Item #6</li>"+
		"        <li>Item #7</li>"+
		"        <li>Item #8</li>"+
		"        <li>Item #9</li>"+
		"        <li>Item #10</li>"+
		"    </ul>"+
		"</span>" +
		
		"</td><td>"+
		"<span id=\"demo2\">"+
		"    <ul>"+
		"        <li>Item #1</li>"+
		"		 <li>Item #2</li>"+
		"        <li>Item #3</li>"+
		"    </ul>"+
		"</span>"+
		
		"</td></tr></table>"); 
		
		Sortable sortable1 = Y.newSortable(SortableConfig.create()
			.container("#demo1").nodes("li").opacity("0.1")); 
		
		Sortable sortable2 = Y.newSortable(SortableConfig.create()
				.container("#demo2").nodes("li").opacity("0.1")); 
		
		sortable1.join(sortable2, Sortable.JOIN_FULL);
		
		sty1 = Y.newStyleSheet();
		sty1.set("#demo1 li", Style.create().border("1px solid #ededed").backgroundColor("#ffaaaa"));
		sty1.set("#demo2 li", Style.create().border("1px solid yellow").backgroundColor("#22ffaa"));
		
		Y.newButton(ButtonConfig.create().label("check sort lists").render(parent).
			on("click", new EventCallback<ButtonEvent>() {				
				
				public void call(ButtonEvent e) {
					Window.alert("Now green list has "+Y.one("#demo2").all("li").size()+" items. "); 
				}
			})
		); 		
	}
}); 
}

}
