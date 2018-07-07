//package org.sgx.yuigwt.yuitest1.gallery.test.uibinder;
//
//import org.sgx.yuigwt.yui.YUI;
//import org.sgx.yuigwt.yui.YUICallback;
//import org.sgx.yuigwt.yui.YuiContext;
//import org.sgx.yuigwt.yui.node.Node;
//import org.sgx.yuigwt.yuitest1.gallery.GalleryConstants;
//import org.sgx.yuigwt.yuitest1.gallery.test.AbstractTest;
//import org.sgx.yuigwt.yuitest1.gallery.test.GalleryResource;
//import org.sgx.yuigwt.yuitest1.gallery.test.TestResources;
//
//import com.google.gwt.user.client.ui.HTMLPanel;
//
///**
// * 
// * @author sg
// * 
// */
//
//public class UIBinderTest3 extends AbstractTest {
//
//	//testing stuff - ignore this constructor
//	public UIBinderTest3() {
//		super("uibinder1", "using yui overlay, charts and treeview with uibinder", new String[] { GalleryConstants.TAG_WIDGET,
//				GalleryConstants.TAG_EXT, GalleryConstants.TAG_WIDGET, GalleryConstants.TAG_CSSGRIDS, GalleryConstants.TAG_TABVIEW, GalleryConstants.TAG_AUTOCOMPLETE, GalleryConstants.TAG_GWT, GalleryConstants.TAG_UIBINDER}, 
//				
//			new GalleryResource[]{
//				new GalleryResource(TestResources.instance.UIBinderTest2(), "UIBinderTest1.java"),
//				new GalleryResource(TestResources.instance.UIBinderTest2CompositeJava(), "UIBinderTest1Composite.java"), 
//				new GalleryResource(TestResources.instance.UIBinderTest2UI(), "UIBinderTest1Composite.ui.xml"), 
//			}		
//		);
//	}
//
//	
//	public void test(final Node parent) {
//		YUI.Use(new String[] { "overlay", "charts"
//			}, new YUICallback() {
//
//			
//			public void ready(final YuiContext Y) {
//				
//				//create a GWT Widget Panel that wrapps our yui widget parent. 
//				HTMLPanel gwtParent = parent.asHTMLPanel(); //GWTUtil.YUI2GWT(Y, parent);
//				
//				UIBinderTest1Composite comp1 = new UIBinderTest1Composite(Y); 
//				gwtParent.add(comp1);				
//			}
//		});
//	}
//}