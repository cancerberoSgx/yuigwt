package org.sgx.yuigwt.yuitest1.gallery.test.uibinder;

import org.sgx.yuigwt.yui.YUI;
import org.sgx.yuigwt.yui.YUICallback;
import org.sgx.yuigwt.yui.YuiContext;
import org.sgx.yuigwt.yui.node.Node;
import org.sgx.yuigwt.yuitest1.gallery.GalleryConstants;
import org.sgx.yuigwt.yuitest1.gallery.test.AbstractTest;
import org.sgx.yuigwt.yuitest1.gallery.test.GalleryResource;
import org.sgx.yuigwt.yuitest1.gallery.test.TestResources;

import com.google.gwt.user.client.ui.HTMLPanel;

/**
 * This shows how Composite YUI Widgets, in this case TabView, can be nested one inside another forming complex parent-children relationshipts. The framework will handle the rendering automatically. 
 * 
 * @author sg
 * 
 */

public class NestedWidget1Test extends AbstractTest {

	// testing stuff - ignore this constructor
	public NestedWidget1Test() {
		super(
				"NesteWidget1Test",
				"This shows how Composited YUI Widgets, in this case TabView, can be nested one inside another forming complex parent-children relationshipts. The framework will handle the rendering automatically.  ",
				new String[] { GalleryConstants.TAG_WIDGET, GalleryConstants.TAG_EXT, GalleryConstants.TAG_WIDGET,
						GalleryConstants.TAG_GWT, GalleryConstants.TAG_UIBINDER },

				new GalleryResource[] {
					new GalleryResource(TestResources.instance.NestedWidget1Test(), "NestedWidget1Test.java"),
					new GalleryResource(TestResources.instance.NestedWidget1(), "NestedWidget1.java"),
					new GalleryResource(TestResources.instance.NestedWidget1UI(), "NestedWidget1.ui.xml"), });
	}

	
	public void test(final Node parent) {
		YUI.Use(new String[] {				
				"button", "tabview", "panel"
				}, new YUICallback() {

			
			public void ready(final YuiContext Y) {

				// create a GWT Widget Panel that wrapps our yui widget parent.
				HTMLPanel gwtParent = parent.asHTMLPanel(); 

				NestedWidget1 comp1 = new NestedWidget1(Y);
				gwtParent.add(comp1);
			}
		});
	}
}