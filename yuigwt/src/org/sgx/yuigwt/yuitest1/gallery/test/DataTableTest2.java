package org.sgx.yuigwt.yuitest1.gallery.test;

import static org.sgx.yuigwt.yuitest1.gallery.GalleryConstants.TAG_AUTOCOMPLETE;
import static org.sgx.yuigwt.yuitest1.gallery.GalleryConstants.TAG_DATATABLE;
import static org.sgx.yuigwt.yuitest1.gallery.GalleryConstants.TAG_WIDGET;

import java.util.Set;

import org.sgx.yuigwt.yui.YUI;
import org.sgx.yuigwt.yui.YUICallback;
import org.sgx.yuigwt.yui.YuiContext;
import org.sgx.yuigwt.yui.event.EventCallback;
import org.sgx.yuigwt.yui.event.YuiEvent;
import org.sgx.yuigwt.yui.node.Node;
import org.sgx.yuigwt.yui.node.NodeEventDelegateCallback;
import org.sgx.yuigwt.yui.util.JsArr;
import org.sgx.yuigwt.yui.util.JsObject;
import org.sgx.yuigwt.yui.util.JsUtil;
import org.sgx.yuigwt.yui.util.Style;
import org.sgx.yuigwt.yui.widget.autocomplete.AutoComplete;
import org.sgx.yuigwt.yui.widget.autocomplete.AutoCompleteConfig;
import org.sgx.yuigwt.yui.widget.button.ButtonConfig;
import org.sgx.yuigwt.yui.widget.button.ButtonEvent;
import org.sgx.yuigwt.yui.widget.datatable.Column;
import org.sgx.yuigwt.yui.widget.datatable.DataTable;
import org.sgx.yuigwt.yui.widget.datatable.DataTableConfig;
import org.sgx.yuigwt.yuitest1.gallery.Gallery;
import org.sgx.yuigwt.yuitest1.gallery.GalleryUtil;

import com.google.gwt.core.client.JavaScriptObject;
import com.google.gwt.core.client.JsArray;
import com.google.gwt.core.client.JsArrayString;

/**
 * we present all these tests metainformation in a yui datatable and
 * autocomplete.
 * 
 * @author sg
 * 
 */
public class DataTableTest2 extends AbstractTest {

	protected DataTable resultTable;
	protected YuiContext Y;
	protected GalleryUtil util;

	public DataTableTest2() {
		super("dataTable2", "we present all these tests metainformation in a yui datatable and autocomplete", new String[] { TAG_DATATABLE, TAG_WIDGET, TAG_AUTOCOMPLETE },
				TestResources.instance.DataTableTest2());
	}

	
	public void test(final Node parent) {

		String[] modules = { "datatable", "autocomplete", "autocomplete-filters", "autocomplete-highlighters", "button", "selector-css3" };
		YUI.Use(modules, new YUICallback() {

			
			public void ready(YuiContext Y) {
				DataTableTest2.this.Y = Y;
				/* first recreate neccesary data */
				util = Gallery.instance().getUtil();
				final Set<Test> tests = util.getTests();

				JsArray<JavaScriptObject> testsArr = JsArray.createArray().cast();
				JsArrayString testNames = JsArrayString.createArray().cast();

				for (Test test : tests) {
					JsObject testObj = testToJsObject(test);
					testsArr.push(testObj);
					testNames.push(test.getName());
				}

				// an autocomplete and button search box
				final Node byNameInput = parent.appendChild("<input type=\"\"></input>");
				AutoComplete ac = Y
						.newAutoComplete(AutoCompleteConfig.create().resultHighlighter("phraseMatch").resultFilters("phraseMatch").inputNode(byNameInput).source(testNames))
						.render(parent).cast();

				Y.newButton(ButtonConfig.create().label("search").render(parent).on("click", new EventCallback<ButtonEvent>() {
					
					public void call(ButtonEvent e) {
						String keywords = byNameInput.get("value");
						JsArray<JsObject> results = JsArray.createArray().cast();
						for (Test test : tests) {
							if (test.getName().contains(keywords))
								results.push(testToJsObject(test));
						}
						renderResultTable("found " + results.length() + " results with name matching \"" + keywords + "\"", parent, results);
					}
				}));

				// a result datatable
				JsArray<Column> columns4 = (JsArray<Column>) JsArr.create(
					Column.create().key("name").label("Name").sortable(true),
					Column.create().key("description").label("Description"), 
					Column.create().key("tags").label("Tags")
				).cast();
				resultTable = Y.newDataTable(DataTableConfig.create().columns(columns4).caption("All YUIGWT tests"));
				renderResultTable("All YUIGWT tests", parent, testsArr);
			}
		});

	}

	protected void renderResultTable(String caption, final Node parent, JsArray results) {

		resultTable.caption(caption);
		resultTable.data(results);
		resultTable.render(parent);

		String sel = "td:first-of-type";

		resultTable.srcNode().all(sel).setStyles(Style.create().cursor("pointer").textDecoration("underline"));
		resultTable.srcNode().delegate("click", new NodeEventDelegateCallback() {
			
			public void call(Node n, YuiEvent evt, Object arg) {
				showTest(parent, util.getTestByName(n.text()));
			}
		}, sel, null);
	}

	protected void showTest(Node parent, Test test) {
		util.getGallery().setCurrentTest(test);
	}

	protected JsObject testToJsObject(Test test) {
		return JsObject.one("name", test.getName())._("description", test.getDescription())._("tags", JsUtil.print(test.getTags()));
	}

}
