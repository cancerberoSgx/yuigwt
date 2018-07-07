package org.sgx.yuigwt.yuitest1.gallery.test.gal;

import static org.sgx.yuigwt.yuitest1.gallery.GalleryConstants.TAG_GALLERY;
import static org.sgx.yuigwt.yuitest1.gallery.GalleryConstants.TAG_TREEVIEW;
import static org.sgx.yuigwt.yuitest1.gallery.GalleryConstants.TAG_WIDGET;

import org.sgx.yuigwt.yui.YUI;
import org.sgx.yuigwt.yui.YUICallback;
import org.sgx.yuigwt.yui.YuiContext;
import org.sgx.yuigwt.yui.node.Node;
import org.sgx.yuigwt.yuigallery.YuiGalleryContext;
import org.sgx.yuigwt.yuigallery.yui3treeviewng.TreeNodeConfig;
import org.sgx.yuigwt.yuigallery.yui3treeviewng.TreeView;
import org.sgx.yuigwt.yuigallery.yui3treeviewng.TreeViewConfig;
import org.sgx.yuigwt.yuitest1.gallery.test.AbstractTest;
import org.sgx.yuigwt.yuitest1.gallery.test.TestResources;

/**
 * Use yui3rteeview_ng gallery module -
 * E
 * @author sg
 *
 */
public class TreeViewTest3_yui3treeviewng extends AbstractTest {

protected YuiGalleryContext Y;
protected TreeView treeView1;

public TreeViewTest3_yui3treeviewng() {
	super("treeview3", "Use yui3rteeview_ng gallery module - http://haizaar.github.com/yui3-gallery/gallery-yui3treeview-ng", 
		new String[]{TAG_TREEVIEW, TAG_WIDGET, TAG_GALLERY}, 
		TestResources.instance.gal_TreeViewTest3_yui3treeviewng());
}


public void test(final Node parent) {
YUI.YUI().use(	
new String[]{"gallery-yui3treeview-ng", "css3-selectors"}, new YUICallback() {
	
	public void ready(YuiContext Y_) {		
		Y = Y_.cast(); 		
		
		treeView1 = Y.newTreeViewNg(TreeViewConfig.create().children(
			TreeNodeConfig.create().label("Fruits").children(
				TreeNodeConfig.create().label("Apple"),
				TreeNodeConfig.create().label("Orange")
			), 
			TreeNodeConfig.create().label("Football players").children(
				TreeNodeConfig.create().label("Attack").children(
					TreeNodeConfig.create().label("<a href=\"\">Diego Forlán</a>"),
					TreeNodeConfig.create().label("Luis Suarez"),
					TreeNodeConfig.create().label("Edison Cavani") 
				),
				TreeNodeConfig.create().label("Defense").children(
					TreeNodeConfig.create().label("Diego Godín"),
					TreeNodeConfig.create().label("Egidio Arévalo"),
					TreeNodeConfig.create().label("El Ratón Perez") 
				)
			)
		)); 
		treeView1.render(parent); 
		
		
//		//now build a tree from html markup getting the data from headers h1, h2, h3, etc
//		
//		parent.append("<h1>Title1</h1><h2>Title12</h2><h1>Title2</h1>"); 
//		TreeView treeView2 = makeTreeViewFromHeaders(parent); 
	}
}); 
}

//protected static TreeView makeTreeViewFromHeaders(Node n) {
//	final List<String> headers = new LinkedList<String>(); 
//	NodeList nl = n.all("h1, h2, h3, h4, h5, h6");
//	
//	
////	JsArray<TreeNodeConfig> treeNodeChildren = 
//	
//	nl.each(new NodeListIterator() {		
//		
//		public void next(Node n, int index, NodeList instance) {
//			headers.add(n.get("tagName")); 
//		}
//	}); 
//	
//
//	Map<String,List<HeaderNode>> nodes = new HashMap<String, List<HeaderNode>>(); 
//
//	List<HeaderNode> rootList = new LinkedList<HeaderNode>();
//	
//	HeaderNode node = new HeaderNode(); 
//	
//	String currentTag=null, oldTag = null; 
//	
//	for(String tag : headers) {
//		
//		oldTag=tag; 
//	}
//	
//	return null; 
//}
//
//
//public static class HeaderNode {
//	String content; 
//	HeaderNode parent; 
//	List<HeaderNode> childs;
//	public String getContent() {
//		return content;
//	}
//	public void setContent(String content) {
//		this.content = content;
//	}
//	public HeaderNode getParent() {
//		return parent;
//	}
//	public void setParent(HeaderNode parent) {
//		this.parent = parent;
//	}
//	public List<HeaderNode> getChilds() {
//		return childs;
//	}
//	public void setChilds(List<HeaderNode> childs) {
//		this.childs = childs;
//	} 	
//}


}
