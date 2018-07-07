package org.sgx.yuigwt.yuitest1.gallery.test;

import org.sgx.yuigwt.yui.YUI;
import org.sgx.yuigwt.yui.YUICallback;
import org.sgx.yuigwt.yui.YuiContext;
import org.sgx.yuigwt.yui.cssgrids.GridEntry;
import org.sgx.yuigwt.yui.cssgrids.GridRow;
import org.sgx.yuigwt.yui.node.Node;
import org.sgx.yuigwt.yui.node.NodeList;
import org.sgx.yuigwt.yui.node.NodeList.NodeListIterator;
import org.sgx.yuigwt.yui.util.Style;
import org.sgx.yuigwt.yuitest1.TestUtil;
import org.sgx.yuigwt.yuitest1.gallery.GalleryConstants;

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
public class CssGridsTest1 extends AbstractTest {

public CssGridsTest1() {
	super("cssgrids1", "cssgrids tests", new String[]{GalleryConstants.TAG_CSSGRIDS, GalleryConstants.TAG_NODE}, 
			TestResources.instance.CssGridsTest1());
}

@Override
public void test(final Node parent) {
YUI.Use(new String[]{"cssgrids", "node"}, new YUICallback() {
	
	@Override
	public void ready(final YuiContext Y) {
		
		//first showing markup
		
		parent.append(
			"<div class=\"yui3-g\">" +
				"<div class=\"yui3-u-1-5\" id=\"col1\"></div>"+
				"<div class=\"yui3-u-1-5\" id=\"col2\"></div>"+
				"<div class=\"yui3-u-3-5\" id=\"col3\"></div>"+
			"</div>"
		); 		
		
		parent.one("#col1").set("text", TestUtil.getInstance().randomWords(20));
		parent.one("#col2").set("text", TestUtil.getInstance().randomWords(20));
		parent.one("#col3").set("text", TestUtil.getInstance().randomWords(30));		
		
		//now using Grid utility
		parent.append("<br/><br/>"); 
		
		GridRow row1 = new GridRow(); 
		row1.add(new GridEntry("u-1-6", "left"));
		row1.add(new GridEntry("u-5-6", "right"));
		row1.render(Y, parent); 
		
		row1.getSource().one(".left").text(TestUtil.getInstance().randomWords(20));
		row1.getSource().one(".right").text(TestUtil.getInstance().randomWords(20)); 
		
		//anidated
		
		GridRow row11 = new GridRow(); 
		row11.add(new GridEntry("u-7-12", "left"));
		row11.add(new GridEntry("u-5-12", "right"));
		row11.render(Y, row1.getSource().one(".right")); //render in existing grid entry
		
		row11.getSource().one(".left").text(TestUtil.getInstance().randomWords(20));
		row11.getSource().one(".right").text(TestUtil.getInstance().randomWords(20)); 
		
		parent.all("div").each(new NodeListIterator() {
			
			@Override
			public void next(Node n, int index, NodeList instance) {
				n.setStyles(Style.create()
						.backgroundColor(TestUtil.getInstance().randomColor().toString())
						.color(TestUtil.getInstance().randomColor().toString())
					); 
			}
		}); 
	}
}); 
}

}
