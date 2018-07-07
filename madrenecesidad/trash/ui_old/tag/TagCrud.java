package org.sgx.madrenecesidad.client.trash.ui_old.tag;

import java.util.Comparator;

import org.sgx.madrenecesidad.client.model.Tag;
import org.sgx.madrenecesidad.client.system.SystemListener;
import org.sgx.madrenecesidad.client.system.TagSystem;
import org.sgx.madrenecesidad.client.trash.ui_old.ACSVSelectList;
import org.sgx.madrenecesidad.client.trash.ui_old.AbstractUi;
import org.sgx.madrenecesidad.client.trash.ui_old.Main;
import org.sgx.madrenecesidad.client.trash.ui_old.Renderer;
import org.sgx.yuigwt.yui.YuiContext;
import org.sgx.yuigwt.yui.event.EventCallback;
import org.sgx.yuigwt.yui.event.EventFacade;
import org.sgx.yuigwt.yui.node.Node;
import org.sgx.yuigwt.yui.util.HTMLUtil;
import org.sgx.yuigwt.yui.util.JsArr;
import org.sgx.yuigwt.yui.util.Style;
import org.sgx.yuigwt.yui.widget.button.ButtonConfig;
import org.sgx.yuigwt.yui.widget.button.ButtonEvent;
import org.sgx.yuigwt.yui.widget.datatable.Column;
import org.sgx.yuigwt.yui.widget.datatable.DataTable;
import org.sgx.yuigwt.yui.widget.datatable.DataTableConfig;
import org.sgx.yuigwt.yui.widget.panel.Panel;
import org.sgx.yuigwt.yui.widget.panel.PanelConfig;

import com.google.gwt.core.client.JavaScriptObject;
import com.google.gwt.core.client.JsArray;
/**
 * small tags crud operations
 * @author sg
 *
 */
public class TagCrud extends AbstractUi implements SystemListener {

//	private Node inputEl;
	private TagSystem tagSystem;
	private Node parent;
//	private Panel createTagPanel = null;
//	private TagEditor tagEditor;
	private DataTable resultTable;
	private ACSVSelectList<Tag> list1;
//	private AutoComplete ac1;
//	private Panel editTagPanel;
	private TagEditorPanel createTagPanel;
	private TagEditorPanel editTagPanel;

	public TagCrud(YuiContext y) {
		super(y);
		tagSystem = TagSystem.getInstance();
	}

	@Override
	public void render(Node parent) {
		this.parent = parent;

		y.newButton(ButtonConfig.create().label("Create new tag").render(parent).on("click", new EventCallback<ButtonEvent>() {
			@Override
			public void call(ButtonEvent e) {
				doCreateNewTag();
			}
		}));
//		inputEl = parent.appendChild("<input type=\"text\" id=\"ac-input\" value=\"a\"></input>");

//		ac1 = y.newAutoComplete(AutoCompleteConfig.create().resultHighlighter("phraseMatch").resultFilters("phraseMatch").inputNode(inputEl).render(true));
		// inputEl.plug(y.Plugin().AutoComplete(), );

		

		// a result datatable
		JsArray<Column> resultTableCols = (JsArray<Column>) JsArr.create(Column.create().key("name").label("Name").sortable(true),
				Column.create().key("description").label("Description")).cast();
		resultTable = y.newDataTable(DataTableConfig.create().columns(resultTableCols).caption("All YUIGWT tests"));
		resultTable.caption("Tags");
		resultTable.render(parent);
		resultTable.delegate("click", new EventCallback<EventFacade>() {
			@Override
			public void call(EventFacade e) {
				Node td = e.target().cast();
				String clickedTagName = td.text();
				// Window.alert("target: "+td.text());
				Tag clickedTag = tagSystem.getTag(clickedTagName);
//				Main.getInstance().getConsole().log(clickedTag.getName()); 
				editTagPanel.getEditor().load(clickedTag); 
				editTagPanel.getPanel().show(); 
			}
		}, "td:first-of-type");

		Renderer<Tag> tagRenderer = new Renderer<Tag>() {
			@Override
			public void render(Tag t, Node parent) {
				parent.append("<li><b>" + t.getName() + "</b> - (<small>" + t.getDescription() + "</small>)</li>");
			}
		};
		Comparator<Tag> tagComparator = new Comparator<Tag>() {
			@Override
			public int compare(Tag o1, Tag o2) {
				return o1.getName().compareTo(o2.getName());
			}
		};
		list1 = new ACSVSelectList<Tag>(y, tagSystem.getTagNames(), tagSystem.getTags(), tagRenderer, tagComparator);
		list1.render(parent);
		
		createTagPanel = buildPanel("Create new Tag", new Runnable() {			
			@Override
			public void run() {
				Tag editedTag = createTagPanel.getEditor().flush();
				Main.getInstance().getConsole().log(editedTag.getName()); 
				tagSystem.addTag(editedTag, null);
			}
		}); 
		
		editTagPanel = buildPanel("Edit Tag", new Runnable() {			
			@Override
			public void run() {
				Tag editedTag = editTagPanel.getEditor().flush();
				tagSystem.updateTag(editedTag, null);
			}
		}); 
		//disable name entry input - the name cannot be edited.
		editTagPanel.getPanel().srcNode().one("table .tagNameEntry").set("disabled", true); 

		if (tagSystem.getTagNames() == null) {
			tagSystem.addListener(this);
		} else {
//			loaded(); // loadAutocomplete1();
			changed(); 
		}
	}

	protected void doCreateNewTag() {
//		if (panel == null) {
//			panel = buildPanel();
//		}
		createTagPanel.getPanel().show();
	}

	
	private TagEditorPanel buildPanel(String title, final Runnable onaccept) {
		final Panel panel = y.newPanel((PanelConfig) PanelConfig.create().centered(true).srcNode(parent.appendChild("<p></p>")).width("400px"));
		panel.headerContent("<h1>"+title+"</h1>");
		Node panelBodyContent = parent.appendChild("<div></div>");
//		panelBodyContent.append("<h2>Create a new Tag</h2>");
		panel.bodyContent(panelBodyContent);
		panel.footerContent("<i>small</i>");
		TagEditor editor = new TagEditor(y, new Tag());

		editor.render(panelBodyContent);

		HTMLUtil HTMLUtil = new HTMLUtil(y);
		Node row1 = HTMLUtil.appendRow(editor.getTableNode(), "", "<div></div>");
		y.newButton(ButtonConfig.create().label("Accept").render(row1.one("div")).on("click", new EventCallback<ButtonEvent>() {
			@Override
			public void call(ButtonEvent e) {
				if(onaccept!=null)
					onaccept.run();  
				panel.hide();
			}
		}));
		y.newButton(ButtonConfig.create().label("Cancel").render(row1.one("div")).on("click", new EventCallback<ButtonEvent>() {
			@Override
			public void call(ButtonEvent e) {
				panel.hide();
			}
		}));

		panel.render();
		panel.hide(); 
		return new TagEditorPanel(panel, editor);
	}

//	protected void updateAutocomplete() {
//		ac1.source(tagSystem.getTagNames());
//	}

//	@Override
//	public void loaded() {
////		updateAutocomplete();
//		updateDataTable();
//		updateACSVList();
//	}

	private void updateACSVList() {
		list1.update(tagSystem.getTagNames(), tagSystem.getTags());
	}

	private void updateDataTable() {
		JsArray<JavaScriptObject> data = tagSystem.getTagsJSO();
		if (data == null || data.length() == 0)
			return;

		resultTable.data(tagSystem.getTagsJSO());
		resultTable.render();
		String sel = "td:first-of-type";
		resultTable.srcNode().all(sel).setStyles(Style.create().cursor("pointer").textDecoration("underline"));

	}

	@Override
	public void changed() {
		// Window.alert("tags: "+tagSystem.getTags().size());
//		loaded();
		updateDataTable();
		updateACSVList();
	}

}
