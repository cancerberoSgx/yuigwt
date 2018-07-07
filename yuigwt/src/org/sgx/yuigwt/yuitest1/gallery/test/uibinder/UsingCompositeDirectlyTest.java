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
 * This test shows an example of extending GWT Composite directly instead extending YUIBinded
 * 
 * @author sg
 * 
 */

public class UsingCompositeDirectlyTest extends AbstractTest {

	// testing stuff - ignore this constructor
	public UsingCompositeDirectlyTest() {
		super(
				"UsingCompositeDirectlyTest",
				"This test shows an example of extending GWT Composite directly instead extending YUIBinded  ",
				new String[] { GalleryConstants.TAG_WIDGET, GalleryConstants.TAG_EXT, GalleryConstants.TAG_WIDGET,
						GalleryConstants.TAG_CSSGRIDS, GalleryConstants.TAG_TABVIEW, GalleryConstants.TAG_AUTOCOMPLETE,
						GalleryConstants.TAG_GWT, GalleryConstants.TAG_UIBINDER },

				new GalleryResource[] {
						new GalleryResource(TestResources.instance.UsingCompositeDirectlyTest(), "UsingCompositeDirectlyTest.java"),
						new GalleryResource(TestResources.instance.UsingCompositeDirectly(),"UsingCompositeDirectly.java"),
						new GalleryResource(TestResources.instance.UsingCompositeDirectlyUI(), "UsingCompositeDirectly.ui.xml") });
	}

	@Override
	public void test(final Node parent) {
		YUI.Use(new String[] { "button", "button-plugin", "tabview", "autocomplete", "autocomplete-filters",
				"autocomplete-highlighters" }, new YUICallback() {

			@Override
			public void ready(final YuiContext Y) {

				// create a GWT Widget Panel that wrapps our yui widget parent.
				HTMLPanel gwtParent = parent.asHTMLPanel();

				UsingCompositeDirectly comp1 = new UsingCompositeDirectly(Y);
				gwtParent.add(comp1);
			}
		});
	}
}