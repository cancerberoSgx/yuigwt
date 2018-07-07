//package org.sgx.yuigwt.yuitest1.gallery.test;
//
//import com.google.gwt.core.client.GWT;
//import com.google.gwt.resources.client.ClientBundle;
//import com.google.gwt.resources.client.ExternalTextResource;
//import com.google.gwt.resources.client.TextResource;
///**
// * this would be the ideal thing but it is failing on production (simulate slow connection - alerts on the handler never shoed.). 
// * TODO: bug report.
// * @author sg
// *
// */
//public interface TestResourcesExternal extends ClientBundle {
//	public static TestResourcesExternal instance = GWT.create(TestResourcesExternal.class);
//
//	// java sources - some resource needed by test - non sources - all on res package. 
//	
//	@Source("res/handlebars/javaClassGwtOverlay.handlebars")
//	public TextResource res_handlebars_javaClassGwtOverlay();
//	
//	
//	//java sources resources. 
//
//	@Source("../Gallery.java")
//	public ExternalTextResource Gallery();
//
//	@Source("ButtonTest1.java")
//	public ExternalTextResource ButtonTest1();
//
//	@Source("YUIUtilTest1.java")
//	public ExternalTextResource YUIUtilTest1();
//
//	@Source("EventDelegateTest1.java")
//	public ExternalTextResource EventDelegateTest1();
//
//	@Source("SliderTest1.java")
//	public ExternalTextResource SliderTest1();
//
//	@Source("PanelTest1.java")
//	public ExternalTextResource PanelTest1();
//
//	@Source("OverlayTest1.java")
//	public ExternalTextResource OverlayTest1();
//
//	@Source("GetTest1.java")
//	public ExternalTextResource GetTest1();
//
//	@Source("DataTableTest1.java")
//	public ExternalTextResource DataTableTest1();
//
//	@Source("TabViewTest1.java")
//	public ExternalTextResource TabViewTest1();
//
//	@Source("ConfigObjectsTest1.java")
//	public ExternalTextResource ConfigObjectsTest1();
//
//	@Source("EventSimulateTest1.java")
//	public ExternalTextResource EventSimulateTest1();
//
//	@Source("PJaxTest1.java")
//	public ExternalTextResource PJaxTest1();
//
//	@Source("AnimTest1.java")
//	public ExternalTextResource AnimTest1();
//
//	@Source("ConsoleTest1.java")
//	public ExternalTextResource ConsoleTest1();
//
//	@Source("StyleSheetTest1.java")
//	public ExternalTextResource StyleSheetTest1();
//
//	@Source("SubstituteTest1.java")
//	public ExternalTextResource SubstituteTest1();
//
//	@Source("CacheTest1.java")
//	public ExternalTextResource CacheTest1();
//
//	@Source("CookieTest1.java")
//	public ExternalTextResource CookieTest1();
//
//	@Source("ImageLoaderTest1.java")
//	public ExternalTextResource ImageLoaderTest1();
//
//	@Source("CalendarTest1.java")
//	public ExternalTextResource CalendarTest1();
//
//	@Source("AutoCompleteTest1.java")
//	public ExternalTextResource AutoCompleteTest1();
//
//	@Source("DataSchemaArrayTest1.java")
//	public ExternalTextResource DataSchemaTest1();
//
//	@Source("DataTypeTest1.java")
//	public ExternalTextResource DataTypeTest1();
//
//	@Source("AyncQueueTest1.java")
//	public ExternalTextResource AyncQueueTest1();
//
//	@Source("IOTest1.java")
//	public ExternalTextResource IOTest1();
//
//	@Source("CollectionTest1.java")
//	public ExternalTextResource CollectionTest1();
//
//	@Source("TransitionTest1.java")
//	public ExternalTextResource TransitionTest1();
//
//	@Source("HistoryTest1.java")
//	public ExternalTextResource HistoryTest1();
//
//	@Source("ChartsTest1.java")
//	public ExternalTextResource ChartTest1();
//
//	@Source("ChartsTest2.java")
//	public ExternalTextResource ChartsTest2();
//
//	@Source("NodeFocusManagerTest1.java")
//	public ExternalTextResource NodeFocusManagerTest1();
//
//	@Source("ScrollViewTest.java")
//	public ExternalTextResource ScrollViewTest();
//
//	@Source("ScrollViewTest2.java")
//	public ExternalTextResource ScrollViewTest2();
//
//	@Source("ResizeTest1.java")
//	public ExternalTextResource ResizeTest1();
//
//	@Source("JSONTest1.java")
//	public ExternalTextResource JSONTest1();
//
//	@Source("JSONTest1.java")
//	public ExternalTextResource FunctionsInJavaTest();
//
//	@Source("DataTableTest2.java")
//	public ExternalTextResource DataTableTest2();
//
//	@Source("HandlebarsTest1.java")
//	public ExternalTextResource HandlebarsTest1();
//
//	@Source("DataSourceTest1.java")
//	public ExternalTextResource DataSourceTest1();
//
//	@Source("IntlTest1.java")
//	public ExternalTextResource IntlTest1();
//	
//	@Source("SortableTest1.java")
//	public ExternalTextResource SortableTest1();
//	
//	@Source("DragAndDropTest1.java")
//	public ExternalTextResource DragAndDropTest1();
//	
//	@Source("GWTWidgetTest.java")
//	public ExternalTextResource GWTWidgetTest();
//	
//	@Source("CssGridsTest1.java")
//	public ExternalTextResource CssGridsTest1();
//	
//	
//	
//	
//	// graphic examples
//
//	@Source("graphic/GraphicTest1.java")
//	public ExternalTextResource graphic_GraphicTest1();
//
//	// yui gallery examples
//
//	@Source("gal/AccordionTest1.java")
//	public ExternalTextResource gal_AccordionTest1();
//
//	@Source("gal/TreeViewTest1.java")
//	public ExternalTextResource gal_TreeViewTest1();
//
//	@Source("gal/FormTest1.java")
//	public ExternalTextResource gal_FormTest1();
//
//	@Source("gal/TokenInputPluginTest1.java")
//	public ExternalTextResource gal_TokenInputPluginTest1();
//
//	@Source("gal/NodeTransform2dTest1.java")
//	public ExternalTextResource gal_NodeTransform2dTest1();
//
//	@Source("gal/ImageCropperTest1.java")
//	public ExternalTextResource gal_ImageCropperTest1();
//
//	@Source("gal/ColorPickerTest1.java")
//	public ExternalTextResource gal_ColorPickerTest1();
//
//	@Source("gal/DeferredTest1.java")
//	public ExternalTextResource gal_DeferredTest1();
//
//	@Source("gal/TreeViewTest2.java")
//	public ExternalTextResource gal_TreeViewTest2();
//
//	// YQL
//	@Source("yql/YQLTest1.java")
//	public ExternalTextResource YQLTest1();
//
//	@Source("yql/YQLDescTableTest1.java")
//	public ExternalTextResource YQLTest2();
//
//	@Source("yql/YQLYuiGalleryTest1.java")
//	public ExternalTextResource YQLYuiGalleryTest1();
//
//	// test resources - not source code
//	// @Source("res/yuimodulesMeta.json")
//	// public ExternalTextResource res_yuimodulesMeta();
//
//}
