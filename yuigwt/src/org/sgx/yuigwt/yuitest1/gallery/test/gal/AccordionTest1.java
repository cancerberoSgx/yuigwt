package org.sgx.yuigwt.yuitest1.gallery.test.gal;

import static org.sgx.yuigwt.yuitest1.gallery.GalleryConstants.TAG_ACCORDION;
import static org.sgx.yuigwt.yuitest1.gallery.GalleryConstants.TAG_GALLERY;
import static org.sgx.yuigwt.yuitest1.gallery.GalleryConstants.TAG_GET;
import static org.sgx.yuigwt.yuitest1.gallery.GalleryConstants.TAG_WIDGET;

import org.sgx.yuigwt.yui.YUI;
import org.sgx.yuigwt.yui.YUICallback;
import org.sgx.yuigwt.yui.YuiConfig;
import org.sgx.yuigwt.yui.YuiContext;
import org.sgx.yuigwt.yui.node.Node;
import org.sgx.yuigwt.yuigallery.YuiGalleryContext;
import org.sgx.yuigwt.yuigallery.accordion.Accordion;
import org.sgx.yuigwt.yuigallery.accordion.AccordionConfig;
import org.sgx.yuigwt.yuigallery.accordion.AccordionItem;
import org.sgx.yuigwt.yuigallery.accordion.AccordionItemConfig;
import org.sgx.yuigwt.yuitest1.gallery.GalleryConstants;
import org.sgx.yuigwt.yuitest1.gallery.test.AbstractTest;
import org.sgx.yuigwt.yuitest1.gallery.test.TestResources;

/**
 * native example url at
 * http://ipeychev.github.com/yui3-gallery/gallery-accordion
 * /3.3.0_1.14/index.html <link rel="stylesheet" type="text/css" href=
 * "http://yui.yahooapis.com/combo?3.3.0/build/cssreset/reset-min.css&3.3.0/build/cssfonts/fonts-min.
 * c s s &
 * gallery-2011.03.23-22-20/build/gallery-accordion/assets/skins/sam/gallery-
 * accordion.css"> this is the equivalent of
 * 
 * <pre>
 </pre>
 * 
 * @author sg
 * 
 */
public class AccordionTest1 extends AbstractTest {

	public AccordionTest1() {
		super("accordion1", "accordion tests", new String[] { TAG_ACCORDION, TAG_WIDGET, TAG_GALLERY, TAG_GET }, TestResources.instance.gal_AccordionTest1());
	}

	@Override
	public void test(final Node parent) {
		YUI.YUI(YuiConfig.create().gallery(GalleryConstants.LATEST_BUILD)).use(

		new String[] { "dd-constrain", "dd-proxy", "dd-drop", "gallery-accordion"
//				, "gallery-accordion-missing-css"
				}, new YUICallback() {
			@Override
			public void ready(YuiContext Y_) {

				// cast to YuiGalleryContext for using the yui gallery java api.
				final YuiGalleryContext Y = Y_.cast();

				Accordion acc1 = Y.newAccordion(AccordionConfig.create().useAnimation(true).reorderItems(true));
				acc1.render(parent);

				AccordionItem item1 = Y.newAccordionItem(AccordionItemConfig.create().label("Item1, added from script").contentHeight("fixed", 80));

				item1.set("bodyContent", "This is the body of the item, added dynamically to accordion.<br>Content height has been set as \"fixed, 80px\".");

				acc1.addItem(item1);

				AccordionItem item2 = Y.newAccordionItem(AccordionItemConfig.create().label("Item2, added from script").expanded(true).contentHeight("stretch").id("dinnode2"));

				item2.set("bodyContent", "This is the body of the item, added dynamically to accordion, before item1.<br>Content height has been set as \"stretch\".");

				acc1.addItem(item2);

				AccordionItem item3 = Y.newAccordionItem(AccordionItemConfig.create().label("Item2, added from script").expanded(true).alwaysVisible(true).contentHeight("auto")
						.id("dinnode3"));

				item3.set("bodyContent",
						"<div style='position:relative;'>This is the body of the item, added dynamically to accordion.<br>Content height has been set as \"auto\".</div>");

				acc1.addItem(item3);
			}
		});
	}

}
