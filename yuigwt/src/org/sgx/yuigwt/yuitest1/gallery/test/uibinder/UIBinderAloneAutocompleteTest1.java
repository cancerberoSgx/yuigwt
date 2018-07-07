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
 * UIBinderAloneAutocompleteTest1
 * @author sg
 * 
 */

public class UIBinderAloneAutocompleteTest1 extends AbstractTest {

	// testing stuff - ignore this constructor
	public UIBinderAloneAutocompleteTest1() {
		super(
			"UIBinderAloneAutocompleteTest1",
			"UIBinderAloneAutocompleteTest1 ",
			new String[] { GalleryConstants.TAG_WIDGET, GalleryConstants.TAG_EXT, GalleryConstants.TAG_WIDGET,
					GalleryConstants.TAG_GWT, GalleryConstants.TAG_UIBINDER },

			new GalleryResource[] {
					new GalleryResource(TestResources.instance.UIBinderAloneAutocompleteTest1(), "UIBinderAloneAutocompleteTest1.java"),
					new GalleryResource(TestResources.instance.UIBinderAloneAutocomplete(), "UIBinderAloneAutocomplete.java"),
					new GalleryResource(TestResources.instance.UIBinderAloneAutocompleteUI(), "UIBinderAloneAutocomplete.ui.xml"), });
	}

	@Override
	public void test(final Node parent) {
		YUI.Use(new String[] {				
				"autocomplete", "autocomplete-filters", "autocomplete-highlighters"
				}, new YUICallback() {

			@Override
			public void ready(final YuiContext Y) {

				// create a GWT Widget Panel that wraps our yui widget parent.
				HTMLPanel gwtParent = parent.asHTMLPanel(); 

				UIBinderAloneAutocomplete comp1 = new UIBinderAloneAutocomplete(Y);
				gwtParent.add(comp1);
			}
		});
	}
}