package org.sgx.yuigwt.yuitest1.gallery.test;

import static org.sgx.yuigwt.yuitest1.gallery.GalleryConstants.*;

import org.sgx.yuigwt.yui.YUI;
import org.sgx.yuigwt.yui.YUICallback;
import org.sgx.yuigwt.yui.YuiContext;
import org.sgx.yuigwt.yui.imageloader.ImgLoadGroup;
import org.sgx.yuigwt.yui.imageloader.ImgLoadGroupConfig;
import org.sgx.yuigwt.yui.imageloader.ImgLoadImgObjConfig;
import org.sgx.yuigwt.yui.node.Node;
/**
 * imgloader
<pre>
var myFirstGroup = new Y.ImgLoadGroup({ timeLimit: 2 });
myFirstGroup.addTrigger('#someDivId', 'mouseover');
myFirstGroup.registerImage({
    domId: 'idOfDivWaitingForImage',
    bgUrl: 'http://www.example.com/image/url'
});
</pre>
 * @author sg
 *
 */
public class ImageLoaderTest1 extends AbstractTest {

public ImageLoaderTest1() {
	super("imgloader1", "imgloader tests", 
			new String[]{TAG_IMGLOADER, TAG_UTILS}, 
			TestResources.instance.ImageLoaderTest1());
}

@Override
public void test(final Node parent) {
YUI.Use(new String[]{"button", "imageloader"}, new YUICallback() {
	@Override
	public void ready(final YuiContext Y) {
		Node trigger = parent.appendChild("<p id=\"trigger1\">clickme will trigger or wait 5s</p>");
		Node img = parent.appendChild("<p id=\"delayedImg\">this is a<br/>delayed img</p>");
		ImgLoadGroup myFirstGroup = Y.newImgLoadGroup(ImgLoadGroupConfig.create().timeLimit(5)); 
		myFirstGroup.registerImage(ImgLoadImgObjConfig.create().
			domId("delayedImg").
			bgUrl("http://code.google.com/p/yuigwt/logo")); 

		myFirstGroup.addTrigger("#trigger1", "click");
	}
}); 
}

}
