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
 * show an example on how to "Apply different XML templates to the same widget".
 * @author sg
 * 
 */

public class ApplyDifferentXMLTest extends AbstractTest {
	
	// testing stuff - ignore this constructor
	public ApplyDifferentXMLTest() {
		super(
			"ApplyDifferentXMLTest",
			"show an example on how to Apply different XML templates to the same widget",
			new String[] { 
				GalleryConstants.TAG_WIDGET, GalleryConstants.TAG_EXT, GalleryConstants.TAG_WIDGET,
				GalleryConstants.TAG_CSSGRIDS, GalleryConstants.TAG_TABVIEW, GalleryConstants.TAG_AUTOCOMPLETE,
				GalleryConstants.TAG_GWT, GalleryConstants.TAG_UIBINDER 
			},

			new GalleryResource[] {
				new GalleryResource(TestResources.instance.ApplyDifferentXMLTest(), "ApplyDifferentXMLTest.java"),
				new GalleryResource(TestResources.instance.ApplyDifferentXML(),"ApplyDifferentXML.java"),
				new GalleryResource(TestResources.instance.ApplyDifferentXMLLoggedInUI(), "ApplyDifferentXMLLoggedIn.ui.xml"), 
				new GalleryResource(TestResources.instance.ApplyDifferentXMLNotLoggedInUI(), "ApplyDifferentXMLNotLoggedIn.ui.xml"),
			}
		);
	}

	
	public void test(final Node parent) {
		YUI.Use(new String[] { "button", "node-menunav" }, new YUICallback() {

			
			public void ready(final YuiContext Y) {

				// create a GWT Widget Panel that wrapps our yui widget parent.
				HTMLPanel gwtParent = parent.asHTMLPanel(); 

				ApplyDifferentXML comp1 = new ApplyDifferentXML(Y, "Sebastián Gurin");
				gwtParent.add(comp1);
				
				ApplyDifferentXML comp2 = new ApplyDifferentXML(Y, null);
				gwtParent.add(comp2);
				
			}
		});
	}
}