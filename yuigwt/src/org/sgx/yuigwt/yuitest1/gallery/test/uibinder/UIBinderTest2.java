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
 * In this example we use some YUI widgets and utilities like cssgrids, calendar, panel and a menu nav. 
 * 
 * @author sg
 * 
 */

public class UIBinderTest2 extends AbstractTest {

	// testing stuff - ignore this constructor
	public UIBinderTest2() {
		super(
			"uibinder2",
			"In this example we use some YUI widgets and utilities like cssgrids, calendar, panel and a menu nav.",
			new String[] { GalleryConstants.TAG_WIDGET, GalleryConstants.TAG_EXT, GalleryConstants.TAG_WIDGET,
					GalleryConstants.TAG_CSSGRIDS, GalleryConstants.TAG_CALENDAR, GalleryConstants.TAG_MENUNAV,
					GalleryConstants.TAG_GWT, GalleryConstants.TAG_UIBINDER },

			new GalleryResource[] {
					new GalleryResource(TestResources.instance.UIBinderTest2(), "UIBinderTest2.java"),
					new GalleryResource(TestResources.instance.UIBinderTest2CompositeJava(),
							"UIBinderTest2Composite.java"),
					new GalleryResource(TestResources.instance.UIBinderTest2UI(), "UIBinderTest2Composite.ui.xml"), });
	}

	@Override
	public void test(final Node parent) {
		YUI.Use(new String[] { "node",
				
				"button", "button-plugin", "tabview", "node-menunav", "calendar", "panel","datatable"
				
			
			},
			new YUICallback() {

			@Override
			public void ready(final YuiContext Y) {

				// create a GWT Widget Panel that wrapps our yui widget parent.
				HTMLPanel gwtParent = parent.asHTMLPanel();

				UIBinderTest2Composite comp1 = new UIBinderTest2Composite(Y);
				gwtParent.add(comp1);
			}
		});
	}
}





/* A lie: we implicitly will use the following YUI modules, nevertheless, the YUIBinder
 * will do the job of loading them for us. However a little ugly flick can be
 * observed, of that is not desired, then put all the required modules here. 
 */