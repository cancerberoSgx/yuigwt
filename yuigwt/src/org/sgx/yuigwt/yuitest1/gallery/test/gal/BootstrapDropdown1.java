//package org.sgx.yuigwt.yuitest1.gallery.test.gal;
//
//import static org.sgx.yuigwt.yuitest1.gallery.GalleryConstants.*;
//
//import org.sgx.yuigwt.yui.YUI;
//import org.sgx.yuigwt.yui.YUICallback;
//import org.sgx.yuigwt.yui.YuiConfig;
//import org.sgx.yuigwt.yui.YuiContext;
//import org.sgx.yuigwt.yui.YuiConfig.Module;
//import org.sgx.yuigwt.yui.get.GetConfig;
//import org.sgx.yuigwt.yui.get.GetOptionsCallback;
//import org.sgx.yuigwt.yui.get.Transaction;
//import org.sgx.yuigwt.yui.node.Node;
//import org.sgx.yuigwt.yui.util.HTMLUtil;
//import org.sgx.yuigwt.yuigallery.YuiGalleryContext;
//import org.sgx.yuigwt.yuigallery.accordion.Accordion;
//import org.sgx.yuigwt.yuigallery.accordion.AccordionConfig;
//import org.sgx.yuigwt.yuigallery.accordion.AccordionItem;
//import org.sgx.yuigwt.yuigallery.accordion.AccordionItemConfig;
//import org.sgx.yuigwt.yuigallery.bootstrap.dropdown.DropDown;
//import org.sgx.yuigwt.yuitest1.gallery.GalleryConstants;
//import org.sgx.yuigwt.yuitest1.gallery.test.AbstractTest;
//import org.sgx.yuigwt.yuitest1.gallery.test.TestResources;
//
//import com.google.gwt.user.client.Window;
//
///**
// * @author sg
// * 
// */
//public class BootstrapDropdown1 extends AbstractTest {
//
//	public BootstrapDropdown1() {
//		super("BootstrapDropdown1", "BootstrapDropdown1", 
//			new String[] { TAG_ACCORDION, TAG_WIDGET, TAG_GALLERY, TAG_GET }, 
//			TestResources.instance.gal_AccordionTest1());
//	}
//
//	
//	public void test(final Node parent) {
//		YUI.YUI(
////				YuiConfig.create().gallery(GalleryConstants.LATEST_BUILD)
//			).use(
//
//		new String[] { "gallery-bootstrap-dropdown" }, new YUICallback() {
//			
//			public void ready(YuiContext Y_) {
//
//				// cast to YuiGalleryContext for using the yui gallery java api.
//				final YuiGalleryContext Y = Y_.cast();
//
////				HTMLUtil util = new HTMLUtil(Y);
//				parent.append(
//				" <li class=\"dropdown\" id=\"menu1\">\n"+
//					"<a class=\"dropdown-toggle\" data-toggle=\"dropdown\" href=\"#menu1\">\n"+
//						"Dropdown\n"+"<b class=\"caret\"></b>\n"+"</a>\n"+
//					"<ul class=\"dropdown-menu\">\n"+
//						"<li><a href=\"#\">Action</a></li>\n"+
//						"<li><a href=\"#\">Another action</a></li>\n"+
//						"<li><a href=\"#\">Something else here</a></li>\n"+
//						"<li class=\"divider\"></li>\n"+
//						"<li><a href=\"#\">Separated link</a></li>\n"+
//					"</ul>\n"+
//				"</li>"); 
//				Node list = parent.one(".dropdown-toggle");
//				list.plug(Y.BootstrapDropdown()); 
//				DropDown dd = DropDown.from(list);
//				dd.open(); 
//				
//				Window.alert("theend"); 
//			}
//		});
//	}
//
//}
