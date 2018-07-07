package org.sgx.yuigwt.yuitest1.gallery.test;

import static org.sgx.yuigwt.yuitest1.gallery.GalleryConstants.TAG_AUTOCOMPLETE;
import static org.sgx.yuigwt.yuitest1.gallery.GalleryConstants.TAG_WIDGET;

import org.sgx.yuigwt.yui.YUI;
import org.sgx.yuigwt.yui.YUICallback;
import org.sgx.yuigwt.yui.YuiContext;
import org.sgx.yuigwt.yui.event.EventCallback;
import org.sgx.yuigwt.yui.node.Node;
import org.sgx.yuigwt.yui.widget.autocomplete.AutoComplete;
import org.sgx.yuigwt.yui.widget.autocomplete.AutoCompleteConfig;
import org.sgx.yuigwt.yui.widget.autocomplete.AutoCompleteEvent;

import com.google.gwt.user.client.Window;
/**
 * This shows how to instantiate 2 autocomplete, one using plugin and other usng the class. 
 * @author sg
 *
 */
public class AutoCompleteTest1 extends AbstractTest {

public AutoCompleteTest1() {
	super("autocomplete1", "This shows how to instantiate 2 autocomplete, one using plugin and other usng the class. ", 
		new String[]{TAG_WIDGET, TAG_AUTOCOMPLETE}, 
		TestResources.instance.AutoCompleteTest1());
}

@Override
public void test(final Node parent) {
YUI.Use(new String[]{"autocomplete", "autocomplete-filters", "autocomplete-highlighters"}, new YUICallback() {
	@Override
	public void ready(final YuiContext Y) {
		
		/* Note we say Y.one(parent.getDOMNode()) and not only parent because we need the parent 
		node to load the new YUI sandbox with AC: */
		
		String[] source1 = new String[]{"ab", "abc", "abcd", "abc dfgh", "abcdfg"}; 		
		
		Node inputEl2 = Y.one(parent.getDOMNode()).
			appendChild("<input type=\"text\" id=\"ac-input\" value=\"someval\"></input>");
		
		inputEl2.plug(Y.Plugin().AutoComplete(), AutoCompleteConfig.create().
			resultHighlighter("phraseMatch").resultFilters("phraseMatch").
			source(source1)
		); 
		
		Node inputEl = Y.one(parent.getDOMNode()).
				appendChild("<input type=\"text\" id=\"ac-input\" value=\"a\"></input>");

		inputEl.plug(Y.Plugin().AutoComplete(), AutoCompleteConfig.create().
			resultHighlighter("phraseMatch").resultFilters("phraseMatch").
			source(new String[]{"ab", "abc", "abcd", "abc dfgh", "abcdfg"}).render(true)); 
		
		AutoComplete ac = Y.newAutoComplete(AutoCompleteConfig.create().
			resultHighlighter("phraseMatch").resultFilters("phraseMatch").
			inputNode(inputEl).
			source(source1).render(true)
		); 		
		
		ac.on(AutoComplete.EVENT_SELECT, new EventCallback<AutoCompleteEvent>() {
			@Override
			public void call(AutoCompleteEvent e) {
				Window.alert("selected "+e.itemNode().get("innerHTML")); 
			}
		}); 
		
		ac.on(AutoComplete.EVENT_RESULTS, new EventCallback<AutoCompleteEvent>() {
			@Override
			public void call(AutoCompleteEvent e) {				
				Window.alert("results: "+e.results().length()); 
			}
		});
	}
}); 
}


}
