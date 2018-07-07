package org.sgx.madrenecesidad.client.trash.ui_old;

import java.util.Collections;
import java.util.Comparator;
import java.util.List;

import org.sgx.madrenecesidad.client.model.Tag;
import org.sgx.yuigwt.yui.YuiContext;
import org.sgx.yuigwt.yui.node.Node;
import org.sgx.yuigwt.yui.widget.autocomplete.AutoComplete;
import org.sgx.yuigwt.yui.widget.autocomplete.AutoCompleteConfig;
import org.sgx.yuigwt.yui.widget.scrollview.ScrollView;
import org.sgx.yuigwt.yui.widget.scrollview.ScrollViewConfig;
import org.sgx.yuigwt.yui.widget.scrollview.ScrollViewPaginatorConfig;
import org.sgx.yuigwt.yui.widget.scrollview.ScrollView.Flick;

import com.google.gwt.core.client.JsArrayString;

/**
 * autocomplete - scrollview selection list
 * 
 * @author sg
 * 
 */
public class ACSVSelectList<T> {
	JsArrayString acNames;
	List<T> items;
	Renderer<T> itemRenderer;
	private YuiContext y;
	private ScrollView sv1;
	private Node input;
	private AutoComplete ac;
	private Node ul;
	private Node p;
	private Comparator<T> comparator;

	/**
	 * 
	 * @param y
	 *            must have autocomplete and scrollview loaded.
	 * @param acNames
	 * @param items
	 * @param itemRenderer
	 */
	public ACSVSelectList(YuiContext y, JsArrayString acNames, List<T> items, Renderer<T> itemRenderer, Comparator<T> comparator) {
		super();
		this.comparator = comparator;
		this.y = y;
		this.acNames = acNames;
		this.items = items;
		this.itemRenderer = itemRenderer != null ? itemRenderer : new Renderer<T>() {
			@Override
			public void render(T t, Node parent) {
				parent.append("<li>" + t + "</li>");
			}
		};
	}

	public void render(Node parent) {
		p = parent.appendChild("<div></div>");

		input = p.appendChild("<input type=\"text\"></input>");
		ac = y.newAutoComplete(AutoCompleteConfig.create().resultHighlighter("phraseMatch").resultFilters("phraseMatch").inputNode(input).render(true));

		ul = p.appendChild("<ul></ul>");

		sv1 = y.newScrollView(ScrollViewConfig.create().flick(Flick.create().minDistance(8).minVelocity(0.3).axis("y")).srcNode(ul).height("60px"));

		sv1.plug(y.Plugin().ScrollViewPaginator(), ScrollViewPaginatorConfig.create().selector("li"));

		update(acNames, items);
	}

	public void update(JsArrayString acNames, List<T> items) {

		this.acNames = acNames;
		this.items = items;
		if (acNames == null || items == null)
			return;
		ac.source(acNames);
		ul.empty();
		if (comparator != null)
			Collections.sort(items, comparator);
		for (T t : items) {
			itemRenderer.render(t, ul);
		}
		sv1.render();
	}
}
