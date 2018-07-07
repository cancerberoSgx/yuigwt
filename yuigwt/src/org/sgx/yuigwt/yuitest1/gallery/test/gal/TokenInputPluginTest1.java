package org.sgx.yuigwt.yuitest1.gallery.test.gal;

import static org.sgx.yuigwt.yuitest1.gallery.GalleryConstants.TAG_GALLERY;
import static org.sgx.yuigwt.yuitest1.gallery.GalleryConstants.TAG_PLUGIN;
import static org.sgx.yuigwt.yuitest1.gallery.GalleryConstants.TAG_WIDGET;

import org.sgx.yuigwt.yui.YUI;
import org.sgx.yuigwt.yui.YUICallback;
import org.sgx.yuigwt.yui.YuiConfig;
import org.sgx.yuigwt.yui.YuiContext;
import org.sgx.yuigwt.yui.event.EventCallback;
import org.sgx.yuigwt.yui.event.EventFacade;
import org.sgx.yuigwt.yui.node.Node;
import org.sgx.yuigwt.yui.util.JsUtil;
import org.sgx.yuigwt.yui.widget.autocomplete.AutoCompleteConfig;
import org.sgx.yuigwt.yui.widget.button.ButtonConfig;
import org.sgx.yuigwt.yuigallery.YuiGalleryContext;
import org.sgx.yuigwt.yuigallery.tokenInput.TokenInputPlugin;
import org.sgx.yuigwt.yuigallery.tokenInput.TokenInputPluginConfig;
import org.sgx.yuigwt.yuitest1.gallery.test.AbstractTest;
import org.sgx.yuigwt.yuitest1.gallery.test.TestResources;

import com.google.gwt.user.client.Window;
/**
 * a test for the Java Api of YUI Gallery module tokenInputplugin : http://yuilibrary.com/gallery/show/node-tokeninput
 * @author sg
 *
 */
public class TokenInputPluginTest1 extends AbstractTest {

public TokenInputPluginTest1() {

	super("tokenInputPlugin1", 
		"a test for the Java Api of YUI Gallery module tokenInputplugin : http://yuilibrary.com/gallery/show/node-tokeninput", 
		new String[]{TAG_WIDGET, TAG_GALLERY, TAG_PLUGIN}, 
		TestResources.instance.gal_TokenInputPluginTest1()
	);
}


public void test(final Node parent) {
YUI.YUI(YuiConfig.create().
		gallery("gallery-2011.08.24-23-44")		
	).use(
new String[]{"gallery-node-tokeninput", "button", "autocomplete", 
	"autocomplete-filters", "autocomplete-highlighters"}, new YUICallback() {
	
	public void ready(YuiContext Y_) {		
		//cast to YuiGalleryContext for using the yui gallery java api.
		final YuiGalleryContext Y = Y_.cast(); 
		//redefine parent loading the new Y sandbox.
		Node p = Y.one(parent.getDOMNode());
		p.append("<p>Write some tags, comma separated: </p>" ); 
		Node input1 = p.appendChild("<input type=\"text\"></input>");
		input1.plug(Y.GalleryPlugin().TokenInput(), TokenInputPluginConfig.create().removeButton(true)); 
		final TokenInputPlugin tiPlugin = input1.getPlugin("tokenInput").cast(); 
		Y.newButton(ButtonConfig.create().label("Accept").render(parent).on("click", new EventCallback<EventFacade>() {
			
			public void call(EventFacade e) {
				String[] selection = JsUtil.toJavaStringArray(tiPlugin.tokens()); 
				String s = "selection is : "; 
				for (int i = 0; i < selection.length; i++) {
					s+=selection[i]; 
				}
				Window.alert(s);  
			}			
		})); 
		
		p.append("<p>Now an input with token and autocomplete plugins installed. " +
			"This time '.' (point) separated tags. <a href=\"http://rgrove.github.com/node-tokeninput/examples/example-autocomplete.html\">This is a similar example</a>. </p>"); 
		Node input2 = p.appendChild("<input type=\"text\"></input>");
		String[] tags = {"apple", "banana", "cherry", "date", "fig", "grapefruit", "jujube",
	            "kumquat", "lemon", "mango", "nectarine", "orange", "pineapple",
	            "raspberry", "strawberry", "tangerine", "watermelon"}; 
		input2.
			plug(Y.GalleryPlugin().TokenInput(), TokenInputPluginConfig.create().
				delimiter(".")).
			plug(Y.GalleryPlugin().AutoComplete(), AutoCompleteConfig.create().
				resultFilters("charMatch").resultHighlighter("charMatch").source(tags));
		final TokenInputPlugin tiPlugin2 = input2.getPlugin("tokenInput").cast();
		Y.newButton(ButtonConfig.create().label("Set defaults").render(parent).on("click", new EventCallback<EventFacade>() {
			
			public void call(EventFacade e) {
				tiPlugin2.tokens("adan", "eve", "nietzsche"); 
			}			
		})); 
	}
}); 
}

}
