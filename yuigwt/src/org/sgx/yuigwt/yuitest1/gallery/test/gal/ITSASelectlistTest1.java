package org.sgx.yuigwt.yuitest1.gallery.test.gal;

import static org.sgx.yuigwt.yuitest1.gallery.GalleryConstants.TAG_GALLERY;
import static org.sgx.yuigwt.yuitest1.gallery.GalleryConstants.TAG_WIDGET;

import org.sgx.yuigwt.yui.YUI;
import org.sgx.yuigwt.yui.YUICallback;
import org.sgx.yuigwt.yui.YuiConfig;
import org.sgx.yuigwt.yui.YuiContext;
import org.sgx.yuigwt.yui.console.Console;
import org.sgx.yuigwt.yui.console.ConsoleConfig;
import org.sgx.yuigwt.yui.event.EventCallback;
import org.sgx.yuigwt.yui.node.Node;
import org.sgx.yuigwt.yui.stylesheet.StyleSheet;
import org.sgx.yuigwt.yui.util.Style;
import org.sgx.yuigwt.yuigallery.YuiGalleryContext;
import org.sgx.yuigwt.yuigallery.form.Form;
import org.sgx.yuigwt.yuigallery.form.FormConfig;
import org.sgx.yuigwt.yuigallery.form.FormField;
import org.sgx.yuigwt.yuigallery.form.FormFieldConfig;
import org.sgx.yuigwt.yuigallery.imagecropper.ImageCropper;
import org.sgx.yuigwt.yuigallery.imagecropper.ImageCropperConfig;
import org.sgx.yuigwt.yuigallery.imagecropper.ImageCropperEvent;
import org.sgx.yuigwt.yuigallery.itsaselectlist.ITSASelectlist;
import org.sgx.yuigwt.yuigallery.itsaselectlist.ITSASelectlistConfig;
import org.sgx.yuigwt.yuigallery.itsaselectlist.ITSASelectlistEvent;
import org.sgx.yuigwt.yuigallery.itsaselectlist.ITSASelectlistItem;
import org.sgx.yuigwt.yuitest1.gallery.GalleryConstants;
import org.sgx.yuigwt.yuitest1.gallery.test.AbstractTest;
import org.sgx.yuigwt.yuitest1.gallery.test.TestResources;

import com.google.gwt.core.client.JsArray;
import com.google.gwt.user.client.Window;
/**
 * @see http://yuilibrary.com/gallery/show/664
 * @see http://projects.itsasbreuk.nl/apidocs/classes/ITSASelectlist.html
 * @author sg
 *
 */
public class ITSASelectlistTest1 extends AbstractTest {

public ITSASelectlistTest1() {
	super("ITSASelectlist1", "tests for ITSASelectlist like the ones in http://yuilibrary.com/gallery/show/664", 
		new String[]{TAG_WIDGET, TAG_GALLERY}, 
		TestResources.instance.gal_ITSASelectlistTest1());
}

@Override
public void test(final Node parent) {
YUI.YUI().use(
new String[]{"gallery-itsaselectlist", "console", "stylesheet"}, new YUICallback() {
	@Override
	public void ready(YuiContext Y_) {
		
		//cast to YuiGalleryContext for using the yui gallery java api.
		final YuiGalleryContext Y = Y_.cast();
		
		final Console console = Y.newConsole();
		console.render(); 
		
		String[] months = new String[]{
			"Januar", "Februar", "March", "April", "May", "June", "July", "August", "September", "October", "November", "December"
		}; 
		
		ITSASelectlist selectlist = Y.newITSASelectlist(ITSASelectlistConfig.create().items(months));
		selectlist.on(ITSASelectlist.EVENT_SELECTCHANGE, new EventCallback<ITSASelectlistEvent>() {
			@Override
			public void call(ITSASelectlistEvent e) {
				console.log("selected item index "+e.index()+" - value: "+e.value()); 
			}
		}); 
		selectlist.render(parent);
		
		
		//now another select list using custom items
		
//		String[] colors = new String[]{
//			"#FF0000", "#ff6600", "#ff77ee", "#66ff66", "#00ff66", "#66000ff"
//		};  
		
		JsArray<ITSASelectlistItem> items = JsArray.createArray().cast(); 
		for (int i = 0; i < 20; i++) {
			String color = "#"+testUtil.randomColor().getHex();//colors[i]; 
			ITSASelectlistItem item = ITSASelectlistItem.create()
				.text("<div style='background-color:"+color+";'></div>")
				.returnValue(color);
			items.push(item); 
		}
		ITSASelectlist selList2 = Y.newITSASelectlist(ITSASelectlistConfig.create()
			.items(items)
			.className("mycolors")
			.listWidth(256)
			.btnSize(2)
			.iconClassName("itsa-icon-textcolor")
			.defaultButtonText("")
		); 
		selList2.on(ITSASelectlist.EVENT_SELECTCHANGE, new EventCallback<ITSASelectlistEvent>() {
			@Override
			public void call(ITSASelectlistEvent e) {
				console.log("selected color: "+e.value()); 
			}
		}); 
		selList2.render(parent.appendChild("<div id=\"divcolorpicker\"></div>")); 
		
		StyleSheet sty = Y.newStyleSheet();
		
		//the main color label
		sty.set("#divcolorpicker .itsa-selectlist-selectedmain div", 
				Style.create().width("12px").height("10px").marginLeft("18px")); 
		
		sty.set("#divcolorpicker .itsa-selectlist-ullist div", 
				Style.create().width("15px").height("15px"));
		
		//the main icon
		sty.set("#divcolorpicker .itsa-icon-textcolor", 
				Style.create().backgroundPosition("1px -215px").width("16px"));
		
		sty.set("#divcolorpicker .itsa-selectlist-ullist li", 
				Style.create().display("inline-block")
				.padding("2px").border("solid 1px #FFF"));
	}
}); 
}

}
