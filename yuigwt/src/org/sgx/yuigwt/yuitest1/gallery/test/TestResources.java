package org.sgx.yuigwt.yuitest1.gallery.test;

import com.google.gwt.core.client.GWT;
import com.google.gwt.resources.client.ClientBundle;
import com.google.gwt.resources.client.TextResource;
import com.google.gwt.resources.client.TextResource;

public interface TestResources extends ClientBundle {
	public static TestResources instance = GWT.create(TestResources.class);

	// java sources - some resource needed by test - non sources - all on res package. 
	
	@Source("res/handlebars/javaClassGwtOverlay.handlebars")
	public TextResource res_handlebars_javaClassGwtOverlay();
	
	
	//java sources resources. 

	@Source("../Gallery.java")
	public TextResource Gallery();

	@Source("ButtonTest1.java")
	public TextResource ButtonTest1();

	@Source("YUIUtilTest1.java")
	public TextResource YUIUtilTest1();

	@Source("EventDelegateTest1.java")
	public TextResource EventDelegateTest1();

	@Source("SliderTest1.java")
	public TextResource SliderTest1();

	@Source("PanelTest1.java")
	public TextResource PanelTest1();

	@Source("OverlayTest1.java")
	public TextResource OverlayTest1();

	@Source("GetTest1.java")
	public TextResource GetTest1();

	@Source("DataTableTest1.java")
	public TextResource DataTableTest1();

	@Source("TabViewTest1.java")
	public TextResource TabViewTest1();

	@Source("ConfigObjectsTest1.java")
	public TextResource ConfigObjectsTest1();

	@Source("EventSimulateTest1.java")
	public TextResource EventSimulateTest1();

	@Source("PJaxTest1.java")
	public TextResource PJaxTest1();

	@Source("AnimTest1.java")
	public TextResource AnimTest1();

	@Source("ConsoleTest1.java")
	public TextResource ConsoleTest1();

	@Source("StyleSheetTest1.java")
	public TextResource StyleSheetTest1();

	@Source("SubstituteTest1.java")
	public TextResource SubstituteTest1();

	@Source("CacheTest1.java")
	public TextResource CacheTest1();

	@Source("CookieTest1.java")
	public TextResource CookieTest1();

	@Source("ImageLoaderTest1.java")
	public TextResource ImageLoaderTest1();

	@Source("CalendarTest1.java")
	public TextResource CalendarTest1();

	@Source("AutoCompleteTest1.java")
	public TextResource AutoCompleteTest1();

	@Source("DataSchemaArrayTest1.java")
	public TextResource DataSchemaTest1();

	@Source("DataTypeTest1.java")
	public TextResource DataTypeTest1();

	@Source("AyncQueueTest1.java")
	public TextResource AyncQueueTest1();

	@Source("IOTest1.java")
	public TextResource IOTest1();

	@Source("CollectionTest1.java")
	public TextResource CollectionTest1();

	@Source("TransitionTest1.java")
	public TextResource TransitionTest1();

	@Source("HistoryTest1.java")
	public TextResource HistoryTest1();

	@Source("ChartsTest1.java")
	public TextResource ChartTest1();

	@Source("ChartsTest2.java")
	public TextResource ChartsTest2();

	@Source("NodeFocusManagerTest1.java")
	public TextResource NodeFocusManagerTest1();

	@Source("ScrollViewTest.java")
	public TextResource ScrollViewTest();

	@Source("ScrollViewTest2.java")
	public TextResource ScrollViewTest2();

	@Source("ResizeTest1.java")
	public TextResource ResizeTest1();

	@Source("JSONTest1.java")
	public TextResource JSONTest1();

	@Source("JSONTest1.java")
	public TextResource FunctionsInJavaTest();

	@Source("DataTableTest2.java")
	public TextResource DataTableTest2();

	@Source("HandlebarsTest1.java")
	public TextResource HandlebarsTest1();

	@Source("DataSourceTest1.java")
	public TextResource DataSourceTest1();

	@Source("IntlTest1.java")
	public TextResource IntlTest1();
	
	@Source("SortableTest1.java")
	public TextResource SortableTest1();
	
	@Source("DragAndDropTest1.java")
	public TextResource DragAndDropTest1();
	
	@Source("GWTWidgetTest1.java")
	public TextResource GWTWidgetTest1();
	
	@Source("CssGridsTest1.java")
	public TextResource CssGridsTest1();
	
	@Source("DataTableTest3.java")
	public TextResource DataTableTest3();
	
	@Source("DataSchemaXMLTable1.java")
	public TextResource DataSchemaXMLTable1();
	
	@Source("RouterTest1.java")
	public TextResource RouterTest1();
	
	@Source("UploaderTest1.java")
	public TextResource UploaderTest1();
	
	
	
	
	// graphic examples

	@Source("graphic/GraphicTest1.java")
	public TextResource graphic_GraphicTest1();

	
	
	
	
	
	
	// yui gallery examples

	@Source("gal/AccordionTest1.java")
	public TextResource gal_AccordionTest1();

	@Source("gal/TreeViewTest1.java")
	public TextResource gal_TreeViewTest1();

	@Source("gal/FormTest1.java")
	public TextResource gal_FormTest1();

	@Source("gal/TokenInputPluginTest1.java")
	public TextResource gal_TokenInputPluginTest1();

	@Source("gal/NodeTransform2dTest1.java")
	public TextResource gal_NodeTransform2dTest1();

	@Source("gal/ImageCropperTest1.java")
	public TextResource gal_ImageCropperTest1();

	@Source("gal/ColorPickerTest1.java")
	public TextResource gal_ColorPickerTest1();

	@Source("gal/DeferredTest1.java")
	public TextResource gal_DeferredTest1();

	@Source("gal/TreeViewTest2.java")
	public TextResource gal_TreeViewTest2();

	@Source("gal/ITSASelectlistTest1.java")
	public TextResource gal_ITSASelectlistTest1();
	
	@Source("gal/TreeViewTest3_yui3treeviewng.java")
	public TextResource gal_TreeViewTest3_yui3treeviewng();
	
	
	
	
	// YQL
	@Source("yql/YQLTest1.java")
	public TextResource YQLTest1();

	@Source("yql/YQLDescTableTest1.java")
	public TextResource YQLTest2();

	@Source("yql/YQLYuiGalleryTest1.java")
	public TextResource YQLYuiGalleryTest1();

	// test resources - not source code
	// @Source("res/yuimodulesMeta.json")
	// public TextResource res_yuimodulesMeta();
	
	
	
	
	//uibinder
	@Source("uibinder/UsingCompositeDirectlyTest.java")
	public TextResource UsingCompositeDirectlyTest();
	@Source("uibinder/UsingCompositeDirectly.java")
	public TextResource UsingCompositeDirectly();
	@Source("uibinder/UsingCompositeDirectly.ui.xml")
	public TextResource UsingCompositeDirectlyUI();
	
	@Source("uibinder/UIBinderTest2.java")
	public TextResource UIBinderTest2();
	@Source("uibinder/UIBinderTest2Composite.java")
	public TextResource UIBinderTest2CompositeJava();
	@Source("uibinder/UIBinderTest2Composite.ui.xml")
	public TextResource UIBinderTest2UI();	
	
	@Source("uibinder/UIBinderAloneButtonTest1.java")
	public TextResource UIBinderAloneButtonTest1();
	@Source("uibinder/UIBinderAloneButton.java")
	public TextResource UIBinderAloneButton();
	@Source("uibinder/UIBinderAloneButton.ui.xml")
	public TextResource UIBinderAloneButtonUI();	
	
	@Source("uibinder/UIBinderAloneAutocompleteTest1.java")
	public TextResource UIBinderAloneAutocompleteTest1();
	@Source("uibinder/UIBinderAloneAutocomplete.java")
	public TextResource UIBinderAloneAutocomplete();
	@Source("uibinder/UIBinderAloneAutocomplete.ui.xml")
	public TextResource UIBinderAloneAutocompleteUI();	
	
	@Source("uibinder/userguide/UIBinderUserGuideTest.java")
	public TextResource uibinderuserguide_UIBinderUserGuideTest();
	@Source("uibinder/userguide/UIBinderUserGuide.java")
	public TextResource uibinderuserguide_UIBinderUserGuide();
	@Source("uibinder/userguide/UIBinderUserGuide.ui.xml")
	public TextResource uibinderuserguide_UIBinderUserGuideUI();
	
	@Source("uibinder/NestedWidget1Test.java")
	public TextResource NestedWidget1Test();
	@Source("uibinder/NestedWidget1.java")
	public TextResource NestedWidget1();
	@Source("uibinder/NestedWidget1.ui.xml")
	public TextResource NestedWidget1UI();
	
	@Source("uibinder/userguide/SourceCodeViewer.java")
	public TextResource uibinderuserguide_SourceCodeViewer();
	@Source("uibinder/userguide/SourceCodeViewer.ui.xml")
	public TextResource uibinderuserguide_SourceCodeViewerUI();
	
	@Source("uibinder/userguide/MainMenu.java")
	public TextResource uibinderuserguide_MainMenu();
	@Source("uibinder/userguide/MainMenu.ui.xml")
	public TextResource uibinderuserguide_MainMenuUI();
	
	
	@Source("uibinder/UIBinderComposingTest.java")
	public TextResource UIBinderComposingTest();
	@Source("uibinder/UIBinderComposing.java")
	public TextResource UIBinderComposing();
	@Source("uibinder/UIBinderComposing.ui.xml")
	public TextResource UIBinderComposingUI();
	
	
	
	@Source("uibinder/ApplyDifferentXMLTest.java")
	public TextResource ApplyDifferentXMLTest();
	@Source("uibinder/ApplyDifferentXML.java")
	public TextResource ApplyDifferentXML();
	@Source("uibinder/ApplyDifferentXMLLoggedIn.ui.xml")
	public TextResource ApplyDifferentXMLLoggedInUI();
	@Source("uibinder/ApplyDifferentXMLNotLoggedIn.ui.xml")
	public TextResource ApplyDifferentXMLNotLoggedInUI();
	
	
	
	
	//jyui
	@Source("jyui/JYuiTest1.java")
	public TextResource jyui_JYuiTest1();
	
	@Source("jyui/JYuiTest2.java")
	public TextResource jyui_JYuiTest2();

	
	
	
	//editors
	@Source("editors/PropertyHaverEditorTest1.java")
	public TextResource editors_PropertyHaverEditorTest1();
	
	@Source("editors/BeanEditorTest1.java")
	public TextResource editors_BeanEditorTest1();
	
	@Source("editors/BooleanEditorTest1.java")
	public TextResource editors_BooleanEditorTest1();
	
	@Source("editors/CrudExample1.java")
	public TextResource editors_CrudExample1();
	
	
}
