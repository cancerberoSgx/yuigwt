package org.sgx.yuigwt.yuitest1.gallery.test.gal;

import static org.sgx.yuigwt.yuitest1.gallery.GalleryConstants.TAG_GALLERY;
import static org.sgx.yuigwt.yuitest1.gallery.GalleryConstants.TAG_NODE;

import org.sgx.yuigwt.yui.YUI;
import org.sgx.yuigwt.yui.YUICallback;
import org.sgx.yuigwt.yui.YuiConfig;
import org.sgx.yuigwt.yui.YuiContext;
import org.sgx.yuigwt.yui.event.EventCallback;
import org.sgx.yuigwt.yui.event.YuiEvent;
import org.sgx.yuigwt.yui.node.Node;
import org.sgx.yuigwt.yui.node.TransitionVal;
import org.sgx.yuigwt.yui.util.Style;
import org.sgx.yuigwt.yuigallery.YuiGalleryContext;
import org.sgx.yuigwt.yuigallery.cssmatrix2d.CSSMatrix2d;
import org.sgx.yuigwt.yuigallery.nodeTransform2d.NodeTransform2d;
import org.sgx.yuigwt.yuigallery.yui_treeview.TreeView;
import org.sgx.yuigwt.yuitest1.gallery.test.AbstractTest;
import org.sgx.yuigwt.yuitest1.gallery.test.TestResources;
/**
 * 
 * @author sg
 *
 */
public class NodeTransform2dTest1 extends AbstractTest {

public NodeTransform2dTest1() {
	super("nodeTransform2d1", "accordion tests", 
			new String[]{TAG_NODE, TAG_GALLERY}, 
		TestResources.instance.gal_NodeTransform2dTest1());
}

@Override
public void test(final Node parent) {
YUI.YUI(YuiConfig.create().gallery("gallery-2012.05.02-20-10")).use(
new String[]{"gallery-node-transform2d", "gallery-cssmatrix2d", "transition"}, new YUICallback() {
	@Override
	public void ready(YuiContext Y_) {
		
		//cast to YuiGalleryContext for using the yui gallery java api.
		final YuiGalleryContext Y = Y_.cast(); 
		//redefine parent loading the new Y sandbox.
		Node p = Y.one(parent.getDOMNode());
		//we want to work with NodeTransform2d nod extension, so we simply cast the node to that class:		
		final NodeTransform2d n1 = p.appendChild("<p>click me first</p>").cast();
		
		//set fixed bounds
		n1.setStyles(Style.create().backgroundColor("red").fontSize("24px").
			width("100px").height("70px"));
		
		n1.on("click", new EventCallback<YuiEvent>() {

			@Override
			public void call(YuiEvent e) {
				n1.rotate(25, TransitionVal.create().duration(0.5).easing("linear")); 
			}
		}); 
		
		final NodeTransform2d n2 = p.appendChild("<p>and then click me also</p>").cast();
		
		//set fixed bounds
		n2.setStyles(Style.create().backgroundColor("blue").fontSize("18px").
			width("100px").height("140px"));
		
		n2.on("click", new EventCallback<YuiEvent>() {

			@Override
			public void call(YuiEvent e) {
				CSSMatrix2d matrix = n1.getMatrix().scale(2.5).skewX(1.5); 
				n2.transform(matrix, TransitionVal.create().duration(0.5).easing("linear")); 
			}
		}); 
		
		//AND NOW TRANSFORM A THIRD NODE, USING ONLY THE API OF gallery-cssmatrix2d		
		final NodeTransform2d n3 = p.appendChild("<p>mouse over me once</p>").cast();
		n3.setStyles(Style.create().left("200px").top("100px").backgroundColor("green")); 
		n3.once("mouseover", new EventCallback<YuiEvent>() {

			@Override
			public void call(YuiEvent e) {
				CSSMatrix2d m = Y.newCSSMatrix2d().setMatrixValue(n3.getString("transform")); 
				n3.setStyle("transform", m.rotate(20).translate(0, 20).toString_()); 
			}
		}); 
	}
}); 
}

}
