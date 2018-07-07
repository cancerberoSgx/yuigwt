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
import org.sgx.yuigwt.yuigallery.YuiGalleryContext;
import org.sgx.yuigwt.yuigallery.form.Form;
import org.sgx.yuigwt.yuigallery.form.FormConfig;
import org.sgx.yuigwt.yuigallery.form.FormField;
import org.sgx.yuigwt.yuigallery.form.FormFieldConfig;
import org.sgx.yuigwt.yuigallery.imagecropper.ImageCropper;
import org.sgx.yuigwt.yuigallery.imagecropper.ImageCropperConfig;
import org.sgx.yuigwt.yuigallery.imagecropper.ImageCropperEvent;
import org.sgx.yuigwt.yuitest1.gallery.test.AbstractTest;
import org.sgx.yuigwt.yuitest1.gallery.test.TestResources;

import com.google.gwt.user.client.Window;
/**
 *
 * @author sg
 *
 */
public class ImageCropperTest1 extends AbstractTest {

public ImageCropperTest1() {
	super("imageCropper1", "accordion tests", new String[]{TAG_WIDGET, TAG_GALLERY}, 
		TestResources.instance.gal_ImageCropperTest1());
}


public void test(final Node parent) {
YUI.YUI(YuiConfig.create().gallery("gallery-2012.08.15-20-00")).use(
new String[]{"console", "gallery-imagecropper"}, new YUICallback() {
	
	public void ready(YuiContext Y_) {
		//cast to YuiGalleryContext for using the yui gallery java api.
		final YuiGalleryContext Y = Y_.cast();
		
final Console console = Y.newConsole(ConsoleConfig.create()); 
console.render(); 

String src1 = "http://cabopolonio.com/ovejasenelcabo.jpg";
ImageCropper ic1 = Y.newImageCropper(ImageCropperConfig.create().source(src1).
	width("743px").height("517px"));
ic1.render(parent); 

ic1.on(ImageCropper.EVENT_CROPEND, new EventCallback<ImageCropperEvent>() {
	
	public void call(ImageCropperEvent e) {
		console.log(e.left()+", "+e.top()+", "+e.width()+", "+e.height()); 
	}
}); 
	}
}); 
}

}
