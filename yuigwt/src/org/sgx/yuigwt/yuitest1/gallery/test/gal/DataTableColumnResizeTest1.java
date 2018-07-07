//package org.sgx.yuigwt.yuitest1.gallery.test.gal;
//
//import static org.sgx.yuigwt.yuitest1.gallery.GalleryConstants.TAG_GALLERY;
//import static org.sgx.yuigwt.yuitest1.gallery.GalleryConstants.TAG_WIDGET;
//
//import org.sgx.yuigwt.yui.YUI;
//import org.sgx.yuigwt.yui.YUICallback;
//import org.sgx.yuigwt.yui.YuiConfig;
//import org.sgx.yuigwt.yui.YuiContext;
//import org.sgx.yuigwt.yui.YuiConfig.Module;
//import org.sgx.yuigwt.yui.console.Console;
//import org.sgx.yuigwt.yui.console.ConsoleConfig;
//import org.sgx.yuigwt.yui.event.EventCallback;
//import org.sgx.yuigwt.yui.node.Node;
//import org.sgx.yuigwt.yui.widget.datatable.Column;
//import org.sgx.yuigwt.yui.widget.datatable.DataTable;
//import org.sgx.yuigwt.yui.widget.datatable.DataTableConfig;
//import org.sgx.yuigwt.yuigallery.YuiGalleryContext;
//import org.sgx.yuigwt.yuigallery.form.Form;
//import org.sgx.yuigwt.yuigallery.form.FormConfig;
//import org.sgx.yuigwt.yuigallery.form.FormField;
//import org.sgx.yuigwt.yuigallery.form.FormFieldConfig;
//import org.sgx.yuigwt.yuigallery.imagecropper.ImageCropper;
//import org.sgx.yuigwt.yuigallery.imagecropper.ImageCropperConfig;
//import org.sgx.yuigwt.yuigallery.imagecropper.ImageCropperEvent;
//import org.sgx.yuigwt.yuigallery.itsaselectlist.ITSASelectlist;
//import org.sgx.yuigwt.yuigallery.itsaselectlist.ITSASelectlistConfig;
//import org.sgx.yuigwt.yuigallery.itsaselectlist.ITSASelectlistEvent;
//import org.sgx.yuigwt.yuitest1.gallery.GalleryConstants;
//import org.sgx.yuigwt.yuitest1.gallery.test.AbstractTest;
//import org.sgx.yuigwt.yuitest1.gallery.test.DataTableTest2;
//import org.sgx.yuigwt.yuitest1.gallery.test.DataTableTest3;
//import org.sgx.yuigwt.yuitest1.gallery.test.TestResources;
//
//import com.google.gwt.core.client.JavaScriptObject;
//import com.google.gwt.core.client.JsArray;
//import com.google.gwt.user.client.Window;
///**
// * @see http://yuilibrary.com/gallery/show/datatable-col-resize
// * @author sg
// *
// */
//public class DataTableColumnResizeTest1 extends AbstractTest {
//
//public DataTableColumnResizeTest1() {
//	super("DataTableColumnResize1", "tests for ITSASelectlist like the ones in http://yuilibrary.com/gallery/show/664", new String[]{TAG_WIDGET, TAG_GALLERY}, 
//		TestResources.instance.gal_ImageCropperTest1());
//}
//public static final String MISSING_CSS = "https://raw.github.com/benediktarnold/yui3-gallery/master/src/gallery-datatable-col-resize/assets/gallery-datatable-col-resize-core.css";
//
//
//public void test(final Node parent) {
//YUI.YUI(
////		YuiConfig.create().gallery("gallery-2012.10.17-20-00")
//		YuiConfig.create().gallery(GalleryConstants.LATEST_BUILD)
//		.module("gallery-datatable-col-resize-missing-css", Module.create()
//				.async(true).fullpath(MISSING_CSS).type("css")
//		)	
//).use(
//new String[]{"gallery-datatable-col-resize", 
//		"gallery-datatable-col-resize-missing-css", 
//		"datatable", "datatable-sort", "datatable-scroll"}, new YUICallback() {
//	
//	public void ready(YuiContext Y_) {
//		final YuiGalleryContext Y = Y_.cast(); 		
//		JsArray<JavaScriptObject> data = DataTableTest3.getData();
//		
//		Column[] table1Columns = new Column[]{
//			Column.create().key("port").label("Port Number"), 
//			Column.create().key("pname").label("Protocol"),
//			Column.create().key("ptitle").label("Common name"), 
//		}; 
//		DataTable table1 = Y.newDataTable(DataTableConfig.create()
//			.columns(table1Columns)
//			.data(data)
//			.scrollable("y")				
//			.sortable(new String[]{"port", "pname"})
//			.sortBy("port")
//			.recordType(new String[]{"select", "port", "pname", "ptitle"})
//			.height("250px")				
//		); 
//		Window.alert(Y.DatatableColResizePlugin()+""); 
//		table1.plug(Y.DatatableColResizePlugin()); 
//		table1.render(parent); 
//			
//	}
//}); 
//}
//
//}
