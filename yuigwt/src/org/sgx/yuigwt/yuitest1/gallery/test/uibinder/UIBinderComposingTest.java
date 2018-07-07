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
 * This test shows a simple example of including a YUI+UIBinder defined Widget inside others.  
 * 
 * @author sg
 * 
 */

public class UIBinderComposingTest extends AbstractTest {

	// testing stuff - ignore this constructor
	public UIBinderComposingTest() {
		super(
				"UIBinderComposingTest",
				"This test shows a simple example of including a YUI+UIBinder defined Widget inside others. ",
				new String[] { GalleryConstants.TAG_WIDGET, GalleryConstants.TAG_EXT, GalleryConstants.TAG_WIDGET,
						GalleryConstants.TAG_GWT, GalleryConstants.TAG_UIBINDER },

				new GalleryResource[] {
					new GalleryResource(TestResources.instance.UIBinderComposingTest(), "UIBinderComposingTest.java"),
					new GalleryResource(TestResources.instance.UIBinderComposing(), "UIBinderComposing.java"),
					new GalleryResource(TestResources.instance.UIBinderComposingUI(), "UIBinderComposingUI.ui.xml"), });
	}

	
	public void test(final Node parent) {
		YUI.Use(new String[] {				
				"cssgrids", "node-menunav", "node"
				}, new YUICallback() {

			
			public void ready(final YuiContext Y) {

				// create a GWT Widget Panel that wrapps our yui widget parent.
				HTMLPanel gwtParent = parent.asHTMLPanel(); 

				UIBinderComposing comp1 = new UIBinderComposing(Y);
				gwtParent.add(comp1);
			}
		});
	}
}