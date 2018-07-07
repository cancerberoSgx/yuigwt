package org.sgx.yuigwt.yuitest1.gallery.test.uibinder.userguide;

import org.sgx.yuigwt.yui.YUI;
import org.sgx.yuigwt.yui.YUICallback;
import org.sgx.yuigwt.yui.YuiContext;
import org.sgx.yuigwt.yui.node.Node;
import org.sgx.yuigwt.yui.util.Style;
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

public class UIBinderUserGuideTest extends AbstractTest {

	// testing stuff - ignore this constructor
	public UIBinderUserGuideTest() {
		super(
				"uibinderuserguide",
				"using yui grid layout, tabview and buttons in uibinder. Also mixing of some GWT buttons in there. ",
				new String[] { GalleryConstants.TAG_WIDGET, GalleryConstants.TAG_EXT, GalleryConstants.TAG_WIDGET,
						GalleryConstants.TAG_CSSGRIDS, GalleryConstants.TAG_TABVIEW, GalleryConstants.TAG_AUTOCOMPLETE,
						GalleryConstants.TAG_GWT, GalleryConstants.TAG_UIBINDER },

				new GalleryResource[] {
						new GalleryResource(TestResources.instance.uibinderuserguide_UIBinderUserGuideTest(), "UIBinderUserGuideTest.java"),
						new GalleryResource(TestResources.instance.uibinderuserguide_UIBinderUserGuide(),	"UIBinderUserGuide.java"),
						new GalleryResource(TestResources.instance.uibinderuserguide_UIBinderUserGuideUI(), "UIBinderUserGuide.ui.xml"), 
						
						new GalleryResource(TestResources.instance.uibinderuserguide_SourceCodeViewer(), "SourceCodeViewer.java"),
						new GalleryResource(TestResources.instance.uibinderuserguide_SourceCodeViewerUI(), "SourceCodeViewer.ui.xml"),
						
						new GalleryResource(TestResources.instance.uibinderuserguide_MainMenu(), "MainMenu.java"),
						new GalleryResource(TestResources.instance.uibinderuserguide_MainMenuUI(), "MainMenu.ui.xml"),
						
		});
	}


public void test(final Node parent) {
YUI.YUI().use(new String[] { "escape", "tabview","node-menunav", "button", "panel", "cssgrids"
		}, new YUICallback() {

	
	public void ready(final YuiContext Y) {

		// create a GWT Widget Panel that wrapps our yui widget parent.
		HTMLPanel gwtParent = parent.asHTMLPanel(); // GWTUtil.YUI2GWT(Y,
													// parent);

		UIBinderUserGuide comp1 = new UIBinderUserGuide(Y);
		gwtParent.add(comp1);
		
		if(parent.get("id").equals("main-example-panel"))
			parent.setStyles(Style.create().overflow("scroll")); 
	}
});
}
}