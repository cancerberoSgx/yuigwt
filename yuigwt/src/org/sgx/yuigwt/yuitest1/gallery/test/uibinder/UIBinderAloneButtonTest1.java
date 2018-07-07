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
 * using yui grid layout, tabview and buttons in uibinder. Also mixing of some
 * GWT buttons in there.
 * 
 * @author sg
 * 
 */

public class UIBinderAloneButtonTest1 extends AbstractTest {

	// testing stuff - ignore this constructor
	public UIBinderAloneButtonTest1() {
		super(
				"UIBinderAloneButtonTest1",
				"UIBinderAloneButtonTest1 ",
				new String[] { GalleryConstants.TAG_WIDGET, GalleryConstants.TAG_EXT, GalleryConstants.TAG_WIDGET,
						GalleryConstants.TAG_GWT, GalleryConstants.TAG_UIBINDER },

				new GalleryResource[] {
						new GalleryResource(TestResources.instance.UIBinderAloneButtonTest1(), "UIBinderAloneButtonTest1.java"),
						new GalleryResource(TestResources.instance.UIBinderAloneButton(),
								"UIBinderAloneButton.java"),
						new GalleryResource(TestResources.instance.UIBinderAloneButtonUI(), "UIBinderAloneButton.ui.xml"), });
	}

	@Override
	public void test(final Node parent) {
		YUI.Use(new String[] {				
				"button",
				}, new YUICallback() {

			@Override
			public void ready(final YuiContext Y) {

				// create a GWT Widget Panel that wrapps our yui widget parent.
				HTMLPanel gwtParent = parent.asHTMLPanel(); 

				UIBinderAloneButton comp1 = new UIBinderAloneButton(Y);
				gwtParent.add(comp1);
			}
		});
	}
}