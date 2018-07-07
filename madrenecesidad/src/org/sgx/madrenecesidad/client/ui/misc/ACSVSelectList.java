//package org.sgx.madrenecesidad.client.ui.misc;
//
//import java.util.Collections;
//import java.util.Comparator;
//import java.util.HashMap;
//import java.util.LinkedList;
//import java.util.List;
//
//import org.sgx.yuigwt.yui.YuiContext;
//import org.sgx.yuigwt.yui.event.EventCallback;
//import org.sgx.yuigwt.yui.node.Node;
//import org.sgx.yuigwt.yui.widget.autocomplete.AutoComplete;
//import org.sgx.yuigwt.yui.widget.autocomplete.AutoCompleteConfig;
//import org.sgx.yuigwt.yui.widget.autocomplete.AutoCompleteEvent;
//import org.sgx.yuigwt.yui.widget.scrollview.ScrollView;
//import org.sgx.yuigwt.yui.widget.scrollview.ScrollView.Flick;
//import org.sgx.yuigwt.yui.widget.scrollview.ScrollViewConfig;
//import org.sgx.yuigwt.yui.widget.scrollview.ScrollViewPaginatorConfig;
//
//import com.google.gwt.core.client.JsArrayString;
//
///**
// * autocomplete - scrollview selection list - support for selection event
// * 
// * @author sg
// * 
// */
//public class ACSVSelectList<T> {
//	
//
//	public static interface Renderer<T> {
//		void render(T t, Node parent); 
//	}
//	public static interface SelectionListener<T> {
//		void notifySelection(String name, T model); 
//	}
//
//	JsArrayString acNames;
//	List<T> items;
//	Renderer<T> itemRenderer;
//	private YuiContext y;
//	private ScrollView sv1;
//	private Node input;
//	private AutoComplete ac;
//	private Node ul;
////	private Node p;
//	private Comparator<T> comparator;
//	private HashMap<String, T> itemMap;
//	String listContainerTag = "ul", listItemTag = "li"; 
//	List<SelectionListener<T>> listeners;
//	private Namer<T> namer; 
//	
//
//	/**
//	 * 
//	 * @param y must have autocomplete and scrollview loaded.
//	 * @param namer - an object responsbile of knowing how to put a name to an item for the autocomplete
//	 * @param items the object in the same order as the names.
//	 * @param itemRenderer - optional - an object responsible of adding content in the list item, inside &lt;li> - do not include &lt;li>... If null, toString will be used against the model
//	 * @param comparator - optional - an object responsible of knowing the order of items to be showed in the list. If null - the given order is respected. 
//	 */
//	public ACSVSelectList(YuiContext y, List<T> items, Namer<T> namer,
//			Renderer<T> itemRenderer, Comparator<T> comparator) {
////		super(y);
//		
//		listeners=new LinkedList<ACSVSelectList.SelectionListener<T>>(); 
//		this.itemMap = new HashMap<String, T>(); 
//		this.acNames = JsArrayString.createArray().cast();
//		this.comparator = comparator;
//		this.y = y;
//		this.namer = namer; 
//		this.items = items;
//		this.itemRenderer = itemRenderer != null ? itemRenderer : new Renderer<T>() {
//			@Override
//			public void render(T t, Node parent) {
//				parent.append("<li>" + t + "</li>");
//			}
//		};
//		
//		
//	}
//	
//	
//	public void render(Node parent) {
////		super.render(parent); 
//		
//		input = parent.appendChild("<input type=\"text\"></input>");
//		ac = y.newAutoComplete(AutoCompleteConfig.create().resultHighlighter("phraseMatch").resultFilters("phraseMatch").inputNode(input).render(true));
//		ac.on(AutoComplete.EVENT_SELECT, new EventCallback<AutoCompleteEvent>() {
//
//			@Override
//			public void call(AutoCompleteEvent e) {
//				String name = input.get("value");
//				T model = itemMap.get(name);
//				for(SelectionListener<T> l : listeners) {
//					l.notifySelection(name, model); 
//				}
//			}
//		}); 
//		ul = parent.appendChild("<ul></ul>");
//		
////		for(T t : items) {
////			itemRenderer.render(t, ul); 
////		}
//
//		sv1 = y.newScrollView(ScrollViewConfig.create().flick(Flick.create().minDistance(8).minVelocity(0.3).axis("y")).srcNode(ul).height("60px"));
//
//		sv1.plug(y.Plugin().ScrollViewPaginator(), ScrollViewPaginatorConfig.create().selector("li"));
//
//		update(items);
//	}
//
//	public void update(List<T> items) {
////		if(ac==null||sv1==null) {
////			
////		}
//		this.items = items;
//		acNames = JsArrayString.createArray().cast(); 
//		for(T t : items) {
//			String name = namer.getName(t); 
//			acNames.push(name); 
//			itemMap.put(name, t); 
//		}
//		ac.source(acNames);
//		ul.empty();
//		if (comparator != null)
//			Collections.sort(items, comparator);
//		for (T t : items) {
//			itemRenderer.render(t, ul);
//		}
//		sv1.render();
//	}
//	
//	
//	public boolean addSelectionListener(SelectionListener<T> e) {
//		return listeners.add(e);
//	}
//	
//
//	public static interface Namer<T> {
//		String getName(T t);
//	}	
//
//
//	public static class SelectionEvent<T> {
//		String name; 
//		T model; 
//		ACSVSelectList<T> target;
//		public SelectionEvent(String name, T model, ACSVSelectList<T> target) {
//			super();
//			this.name = name;
//			this.model = model;
//			this.target = target;
//		}
//		public String getName() {
//			return name;
//		}
//		public void setName(String name) {
//			this.name = name;
//		}
//		public T getModel() {
//			return model;
//		}
//		public void setModel(T model) {
//			this.model = model;
//		}
//		public ACSVSelectList<T> getTarget() {
//			return target;
//		}
//		public void setTarget(ACSVSelectList<T> target) {
//			this.target = target;
//		} 
//		
//	}
//}
