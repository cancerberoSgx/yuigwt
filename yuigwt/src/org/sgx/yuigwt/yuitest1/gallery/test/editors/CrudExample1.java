package org.sgx.yuigwt.yuitest1.gallery.test.editors;

import java.util.Collection;
import java.util.LinkedList;
import java.util.List;

import org.sgx.yuigwt.editors.bean.EditableBean;
import org.sgx.yuigwt.editors.impl.EditorFramework1;
import org.sgx.yuigwt.editors.impl.complex.PropertyHaverEditor2;
import org.sgx.yuigwt.editors.props.PropertyHaver;
import org.sgx.yuigwt.yui.YUI;
import org.sgx.yuigwt.yui.YUICallback;
import org.sgx.yuigwt.yui.YuiContext;
import org.sgx.yuigwt.yui.console.Console;
import org.sgx.yuigwt.yui.cssgrids.GridEntry;
import org.sgx.yuigwt.yui.cssgrids.GridRow;
import org.sgx.yuigwt.yui.event.EventCallback;
import org.sgx.yuigwt.yui.node.Node;
import org.sgx.yuigwt.yui.util.JsArr;
import org.sgx.yuigwt.yui.util.JsObject;
import org.sgx.yuigwt.yui.util.JsUtil;
import org.sgx.yuigwt.yui.util.Style;
import org.sgx.yuigwt.yui.widget.autocomplete.AutoComplete;
import org.sgx.yuigwt.yui.widget.autocomplete.AutoCompleteConfig;
import org.sgx.yuigwt.yui.widget.autocomplete.AutoCompleteEvent;
import org.sgx.yuigwt.yui.widget.button.Button;
import org.sgx.yuigwt.yui.widget.button.ButtonConfig;
import org.sgx.yuigwt.yui.widget.button.ButtonEvent;
import org.sgx.yuigwt.yui.widget.datatable.Column;
import org.sgx.yuigwt.yui.widget.datatable.DataTable;
import org.sgx.yuigwt.yui.widget.datatable.DataTableConfig;
import org.sgx.yuigwt.yui.widget.datatable.DataTableEvent;
import org.sgx.yuigwt.yui.widget.panel.Panel;
import org.sgx.yuigwt.yui.widget.panel.PanelConfig;
import org.sgx.yuigwt.yuitest1.TestUtil;
import org.sgx.yuigwt.yuitest1.gallery.GalleryConstants;
import org.sgx.yuigwt.yuitest1.gallery.test.AbstractTest;
import org.sgx.yuigwt.yuitest1.gallery.test.TestResources;

import com.google.gwt.core.client.GWT;
import com.google.gwt.core.client.JavaScriptObject;
import com.google.gwt.core.client.JsArray;
import com.google.gwt.core.client.JsArrayString;
import com.google.gwt.user.client.Window;

/**
 * in this test we developed a small general CRUD GUI that uses datatable,
 * autocomplete and bean editor for doing CRUD operations over a certain set of
 * entities. This is a fully contained example, it contains model and the crud
 * infrastructure inside for documentation porpuses.
 * 
 * @author sg
 * 
 */
public class CrudExample1 extends AbstractTest {

	protected Console console;
	public Node acInput;

	public CrudExample1() {
		super(
				"editorcrud1",
				"in this test we developed a small general CRUD GUI that uses datatable, autocomplete and bean editor for doing CRUD operations over a certain set of entities. This is a fully contained example, it contains model and the crud infrastructure inside for documentation porpuses.",
				new String[] { GalleryConstants.TAG_EXT, GalleryConstants.TAG_EDITOR, 
						GalleryConstants.TAG_DATATABLE, GalleryConstants.TAG_AUTOCOMPLETE, 
						GalleryConstants.TAG_PANEL, GalleryConstants.TAG_CSSGRIDS },
				TestResources.instance.editors_CrudExample1());
	}

	
	public void test(final Node parent) {
		YUI.Use(new String[] { "node", "button", "console", "panel", 
				"datatable", 
				"autocomplete", "autocomplete-filters", "autocomplete-highlighters" }, new YUICallback() {

			
			public void ready(final YuiContext Y) {
				EditorFramework1 edf = new EditorFramework1();
				edf.start(Y);
				// build some people and a crudUtil with them
				List<Person1> all = new LinkedList<Person1>();
				for (int i = 0; i < 40; i++) {
					all.add(Person1.random());
				}
				TextExtractor<Person1> person1NameExtractor = new TextExtractor<Person1>() {
					
					public String extractText(Person1 t) {
						return t.getName();
					}
				};
				JSOnizer<Person1> jsonizer = new JSOnizer<Person1>() {
					
					public JavaScriptObject jsonize(Person1 t) {
						JsObject jso = JsObject.one("name", t.getName()).objPut("age", t.getAge()).objPut("female", t.getFemale());
						return jso;
					}
				};
				CrudTestUtil<Person1> crudUtil = new CrudTestUtil<Person1>(Y, all, "Person", Person1.random());
//				crudUtil.addChangeListener(new ChangeListener<CrudExample1.Person1>() {					
//					
//					public void notifyChange(CrudTestUtil<Person1> src) {
//						// TODO Auto-generated method stub
//						
//					}
//				}); 
				crudUtil.setJsonizer(jsonizer);
				crudUtil.setNamesExtractor(person1NameExtractor);

				crudUtil.render(parent);

			}
		});
	}

	/**
	 * the java bean we want to edit
	 * 
	 * @author sg
	 * 
	 */
	public static abstract class Person1 implements EditableBean {
		String name;
		Integer age;
		Boolean female;

		public Person1() {
			super();
		}
		public String getName() {
			return name;
		}
		public void setName(String name) {
			this.name = name;
		}
		public Integer getAge() {
			return age;
		}
		public void setAge(Integer age) {
			this.age = age;
		}
		public Boolean getFemale() {
			return female;
		}
		public void setFemale(Boolean female) {
			this.female = female;
		}
		public static Person1 random() {
			Person1 p1 = GWT.create(Person1.class);
			p1.setName(TestUtil.getInstance().randomLetters(TestUtil.getInstance().randomBetween(15, 30)));
			p1.setFemale(TestUtil.getInstance().randomBoolean());
			p1.setAge(TestUtil.getInstance().randomBetween(0, 99));
			return p1;
		}
	}

	// some test crud general utils

	public interface TextExtractor<T extends PropertyHaver> {
		String extractText(T t);
	}

	public interface CrudUtil<T extends PropertyHaver> {
		void render(Node parent);
		List<T> search(String k);
		void delete(T t);
		void add(T t);
	}

	public interface JSOnizer<T extends PropertyHaver> {
		JavaScriptObject jsonize(T t);
	}

	public interface ChangeListener<T extends PropertyHaver> {
		void notifyChange(CrudTestUtil<T> src);
	}

	

	
	
	
	
	
	
	
	
	public class CrudTestUtil<T extends PropertyHaver> implements CrudUtil<T>, ChangeListener<T> {
		Collection<T> all;
		private YuiContext y;
		private String entityName;
		private TextExtractor<T> searchTextExtractor;
		private TextExtractor<T> namesExtractor;
		private AutoComplete ac;
		private Node datatablePanel;
		private Node editorPanel;
		private JsArray<Column> datatableColumns;
		private T sampleEntity;
		private DataTable resultTable;
		private JSOnizer<T> jsonizer;
		List<ChangeListener<T>> listeners;
		
	
		public CrudTestUtil(YuiContext y, Collection<T> all, String entityName, T sampleEntity) {
			this(y, all, entityName, sampleEntity, null, null, null, null);
		}

		public CrudTestUtil(YuiContext y, Collection<T> all, String entityName, T sampleEntity, JSOnizer<T> jsonizer, TextExtractor<T> searchTextExtractor,
				TextExtractor<T> acNamesExtractor, JsArray<Column> datatableColumns) {
			super();
			listeners = new LinkedList<ChangeListener<T>>();
			this.y = y;
			this.all = all;
			this.entityName = entityName;
			this.sampleEntity = sampleEntity;
			this.jsonizer = jsonizer;
			this.searchTextExtractor = (TextExtractor<T>) (searchTextExtractor == null ? new TextExtractor<PropertyHaver>() {
				
				public String extractText(PropertyHaver t) {
					String s = "";
					for (String k : t.getProperties().keys()) {
						s += t.getProperty(k) + " ";
					}
					return s;
				}
			} : searchTextExtractor);
			this.namesExtractor = (TextExtractor<T>) (acNamesExtractor == null ? new TextExtractor<PropertyHaver>() {
				
				public String extractText(PropertyHaver t) {
					String s = "";
					for (String k : t.getProperties().keys()) {
						s += t.getProperty(k) + " ";
					}
					return s;
				}
			} : acNamesExtractor);

			this.datatableColumns = datatableColumns;
			if (this.datatableColumns == null) {
				this.datatableColumns = JsArr.create().cast();
				for (String p : sampleEntity.getProperties().keys()) {
					this.datatableColumns.push(Column.create().key(p).label(p).sortable(true));
				}
			}
			
			addChangeListener(this); 
		}

		public void render(Node parent) {
			GridRow row = new GridRow();
			row.add(new GridEntry("u-7-24", "left"));
			row.add(new GridEntry("u-17-24", "right"));
			row.render(y, parent);
			Node leftPanel = row.getSource().one(".left"), rightPanel = row.getSource().one(".right");

			editorPanel = rightPanel.appendChild("<div></div>");

			y.newButton(ButtonConfig.create().label("Add new " + entityName).render(leftPanel).on("click", new EventCallback<ButtonEvent>() {
				
				public void call(ButtonEvent e) {
					doAddNewEntity();
				}
			}));
			y.newButton(ButtonConfig.create().label("Show All " + entityName +"s").render(leftPanel).on("click", new EventCallback<ButtonEvent>() {
				
				public void call(ButtonEvent e) {
					JsArray<JavaScriptObject> data = getDataTableData(all);
					resultTable.data(data);
					resultTable.caption("All "+entityName+"s"); 
				}
			}));
			parent.append("<p></p>"); //separator
			y.newButton(ButtonConfig.create().label("Search " + entityName +"s").render(leftPanel).on("click", new EventCallback<ButtonEvent>() {
				
				public void call(ButtonEvent e) {
					String keywords = ac.value(); 
					List<T> results = search(keywords);
					JsArray dtResults = toDataTableSource(results); 
					resultTable.data(dtResults);
					resultTable.render();
					resultTable.caption("results for "+keywords); 
				}
			}));
			acInput = leftPanel.appendChild("<input type=\"text\"></input>");
			ac = y.newAutoComplete(AutoCompleteConfig.create()
				.resultHighlighter("phraseMatch").resultFilters("phraseMatch")
				.inputNode(acInput)
//				.source(getAllAutocompleteNames()
			); 
//			y.Widget().getByNode(n); 
			ac.render(parent);
			ac.on(AutoComplete.EVENT_SELECT, new EventCallback<AutoCompleteEvent>() {
				
				public void call(AutoCompleteEvent e) {
//					doEdit()
				}
			});
			ac.contentBox().setStyles(Style.create().width("100%").overflow("scroll").height("300px"));
			
			datatablePanel = rightPanel.appendChild("<div></div>");
			datatablePanel.setStyles(Style.create().height("500px").width("100%").overflow("scroll"));
			resultTable = y.newDataTable(DataTableConfig.create().columns(this.datatableColumns).caption("All "+entityName+"s"));
			resultTable.render(datatablePanel);
			updateDataTable(); 
			updateAC(); 
		}


		private void updateAC() {
			ac.source(getAllAutocompleteNames()).render(); 
		}

		public void updateDataTable() {
			JsArray<JavaScriptObject> data = getDataTableData(all);
			resultTable.data(data);
			resultTable.render(datatablePanel);
		}
		
		protected JsArray toDataTableSource(List<T> results) {
			JsArray a = JsArray.createArray().cast();
			for(T t : results) {
				a.push(getJsonizer().jsonize(t)); 
			}
			return a;
		}

		protected void doAddNewEntity() {
			final PropertyHaverEditor2<T> entityEditor = new PropertyHaverEditor2<T>(y);

			final Panel panel = y.newPanel((PanelConfig) PanelConfig.create().centered(true).width("400px"));
			panel.headerContent("<h1>Add new " + entityName + "</h1>");
			panel.bodyContent("<div class=\"bodyContent\"></div>");
			panel.footerContent("<i>small</i>");


			Button cancelButton = y.newButton(ButtonConfig.create().label("Cancel").on("click", new EventCallback<ButtonEvent>() {
				
				public void call(ButtonEvent e) {
					panel.hide();
					panel.contentBox().remove();
				}
			})).render().cast();
			panel.addButton(cancelButton);
			
			Button acceptButton = y.newButton(ButtonConfig.create().label("Accept").on("click", new EventCallback<ButtonEvent>() {
				
				public void call(ButtonEvent e) {
					T edited = entityEditor.flush();
					all.add(edited);
					notifyAllChange(); 
					// Person1 editedPerson = (Person1) edited;
					// Window.alert("edited person name : "+editedPerson.getName());
					panel.hide();
					panel.contentBox().remove();
				}
			})).render().cast();
			panel.addButton(acceptButton);
			

			panel.render(y.one("body"));
			Node bodyNode2 = panel.srcNode().one(".bodyContent");
			entityEditor.render(bodyNode2);
			entityEditor.load(sampleEntity);
		}

		public JsArray<JavaScriptObject> getDataTableData(Collection<T> l) {
			JsArray<JavaScriptObject> a = JsArray.createArray().cast();
			int i = 0; 
			for (T t : l) {
				JsObject jso = jsonizer.jsonize(t).cast();
				jso.objPut("___id", i); 
				a.push(jso);
				i++; 
			}
			return a;
		}

		public List<T> search(String k) {
			List<T> l = new LinkedList<T>();
			for (T t : all) {
				if (searchTextExtractor.extractText(t).contains(k))
					l.add(t);
			}
			return l;
		}

		public JsArrayString getAllAutocompleteNames() {
			JsArrayString a = JsArrayString.createArray().cast();
			for (T t : all)
				a.push(namesExtractor.extractText(t));
			return a;
		}

		
		public void delete(PropertyHaver t) {
			all.remove(t);
		}

		
		public void add(PropertyHaver t) {
			all.add((T) t);
		}

		public String getEntityName() {
			return entityName;
		}

		public void setEntityName(String entityName) {
			this.entityName = entityName;
		}

		public TextExtractor<T> getSearchTextExtractor() {
			return searchTextExtractor;
		}

		public void setSearchTextExtractor(TextExtractor<T> searchTextExtractor) {
			this.searchTextExtractor = searchTextExtractor;
		}

		public JsArray<Column> getDatatableColumns() {
			return datatableColumns;
		}

		public void setDatatableColumns(JsArray<Column> datatableColumns) {
			this.datatableColumns = datatableColumns;
		}

		public T getSampleEntity() {
			return sampleEntity;
		}

		public void setSampleEntity(T sampleEntity) {
			this.sampleEntity = sampleEntity;
		}

		public JSOnizer<T> getJsonizer() {
			return jsonizer;
		}

		public void setJsonizer(JSOnizer<T> jsonizer) {
			this.jsonizer = jsonizer;
		}

		public TextExtractor<T> getNamesExtractor() {
			return namesExtractor;
		}

		public void setNamesExtractor(TextExtractor<T> namesExtractor) {
			this.namesExtractor = namesExtractor;
		}
		
		protected void notifyAllChange() {
			for(ChangeListener<T> l : listeners) {
				l.notifyChange(this); 
			}
		}
		
		public boolean addChangeListener(ChangeListener<T> e) {
			return listeners.add(e);
		}


		
		public void notifyChange(CrudTestUtil<T> src) {
			
			//!!!!data changed notification

			updateDataTable(); 
			updateAC(); 
		}

	}

}
