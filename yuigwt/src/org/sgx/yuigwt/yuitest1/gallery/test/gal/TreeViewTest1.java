package org.sgx.yuigwt.yuitest1.gallery.test.gal;

import static org.sgx.yuigwt.yuitest1.gallery.GalleryConstants.TAG_GALLERY;
import static org.sgx.yuigwt.yuitest1.gallery.GalleryConstants.TAG_TREEVIEW;
import static org.sgx.yuigwt.yuitest1.gallery.GalleryConstants.TAG_WIDGET;

import org.sgx.yuigwt.yui.YUI;
import org.sgx.yuigwt.yui.YUICallback;
import org.sgx.yuigwt.yui.YuiConfig;
import org.sgx.yuigwt.yui.YuiContext;
import org.sgx.yuigwt.yui.node.Node;
import org.sgx.yuigwt.yuigallery.YuiGalleryContext;
import org.sgx.yuigwt.yuigallery.yui_treeview.TreeLeafConfig;
import org.sgx.yuigwt.yuigallery.yui_treeview.TreeView;
import org.sgx.yuigwt.yuitest1.gallery.test.AbstractTest;
import org.sgx.yuigwt.yuitest1.gallery.test.TestResources;
/**
 * @see http://allenrabinovich.github.com/gallery-yui-treeview/apidocs/classes/TreeView.html
 * @see http://yuilibrary.com/gallery/show/yui-treeview
 * <pre>

</pre>

 * @author sg
 *
 */
public class TreeViewTest1 extends AbstractTest {

public TreeViewTest1() {
	super("treeview1", "treeview tests " +
			"@see http://allenrabinovich.github.com/gallery-yui-treeview/apidocs/classes/TreeView.html and @see " +
			"http://yuilibrary.com/gallery/show/yui-treeview", 
		new String[]{TAG_TREEVIEW, TAG_WIDGET, TAG_GALLERY}, 
		TestResources.instance.gal_TreeViewTest1());
}

@Override
public void test(final Node parent) {
	
YUI.YUI(YuiConfig.create().gallery("gallery-2012.07.18-13-22").debug(true).filter("DEBUG")).use(
new String[]{"gallery-yui-treeview"/*, "resetcss"*/}, new YUICallback() {
	@Override
	public void ready(YuiContext Y_) {		
		
		//cast to YuiGalleryContext for using the yui gallery java api.
		final YuiGalleryContext Y = Y_.cast(); 
		
		TreeView treeView1 = Y.newTreeView(TreeLeafConfig.create().label("haha").children(
			TreeLeafConfig.create().label("haha1").id("child1"),
			TreeLeafConfig.create().label("haha2").id("child2")
		).id("tree1")); 		
		
		//we need to "re-node" the parent to the new sandbox - this is not a bug
		Node treeViewParentNode = Y.one(parent.getDOMNode()); 
		treeView1.render(treeViewParentNode); 
	}
}); 
}

}
