package org.sgx.yuigwt.yuitest1.gallery.test;


import org.sgx.yuigwt.yui.YUI;
import org.sgx.yuigwt.yui.YUICallback;
import org.sgx.yuigwt.yui.YuiContext;
import org.sgx.yuigwt.yui.event.EventCallback;
import org.sgx.yuigwt.yui.handlebars.Template;
import org.sgx.yuigwt.yui.node.Node;
import org.sgx.yuigwt.yui.stylesheet.StyleSheet;
import org.sgx.yuigwt.yui.util.JsObject;
import org.sgx.yuigwt.yui.util.Style;
import org.sgx.yuigwt.yui.widget.button.ButtonConfig;
import org.sgx.yuigwt.yui.widget.button.ButtonEvent;
import org.sgx.yuigwt.yuitest1.gallery.GalleryConstants;

import com.google.gwt.core.client.JavaScriptObject;
import com.google.gwt.core.client.JsArray;
import com.google.gwt.user.client.Window;
/**
 * In this test we let the user modify both template code and json data and render the template multiple times for examining the effects.
 * @author sg
 *
 */
public class HandlebarsTest1 extends AbstractTest {

protected StyleSheet sty1;
protected Node ta1, ta2, renderBox;
protected YuiContext Y;

public HandlebarsTest1() {
	super("handlebars1", "In this test we let the user modify both template code and json data and render the template multiple times for examining the effects. ",
		new String[]{GalleryConstants.TAG_HANDLEBARS, GalleryConstants.TAG_BUTTON, 
			GalleryConstants.TAG_WIDGET, GalleryConstants.TAG_JSON, 
			GalleryConstants.TAG_STYLESHEET}, 
		TestResources.instance.HandlebarsTest1()); 
}

@Override
public void test(final Node parent) {
YUI.Use(new String[]{"handlebars", "button", "json", "stylesheet"}, new YUICallback() {

	@Override
	public void ready(final YuiContext Y) {		
		String template1Code = 
			"<p>YUI is brought to you by:</p>\n"+
			"<ul>\n"+
			"    {{#items}}\n"+
			"        <li><a href=\"{{url}}\">{{name}}</a></li>\n"+
			"    {{/items}}\n"+
			"</ul>"; 
		
		HandlebarsTest1.this.Y=Y; 
		sty1 = Y.newStyleSheet(); 
		sty1.set("textarea", Style.create().display("block").width("90%").height("90px")); 
		
		JsArray<JsObject> data = data1();  
		String dataStr = Y.JSON().stringify(data); 
		
		parent.appendChild("<p>Template code: </p>"); 
		ta1 = parent.appendChild("<textarea></textarea>").cast();		
		ta1.set("value", template1Code); //ta1.text(template1Code);
		
		parent.appendChild("<p>Data: </p>"); 
		ta2 = parent.appendChild("<textarea></textarea>").cast();		
		ta2.set("value", dataStr); //ta2.text(dataStr);
		
		Y.newButton(ButtonConfig.create().label("render").render(parent).
			on("click", new EventCallback<ButtonEvent>() {				
				@Override
				public void call(ButtonEvent e) {
					renderTemplate(); 
				}				
			})
		); 	
		
		renderBox = parent.appendChild("<div></div>"); 
	}
}); 
}
protected void renderTemplate() {
	String dataStr = ta2.get("value");
	JavaScriptObject data2 = Y.JSON().parse(dataStr); 
	String templCode = ta1.get("value"); 
	Template template1 = Y.Handlebars().compile(templCode); 
	String renderedText1 = template1.render(data2); 
	renderBox.empty(); 
	renderBox.append(renderedText1); 
}
protected native final JsArray<JsObject> data1()/*-{
	return {
        items: [
            {name: 'pie', url: 'http://pieisgood.org/'},
            {name: 'mountain dew', url: 'http://www.mountaindew.com/'},
            {name: 'kittens', url: 'http://www.flickr.com/search/?q=kittens'},
            {name: 'rainbows', url: 'http://www.youtube.com/watch?v=OQSNhk5ICTI'}
        ]
    }; 
}-*/;


}
