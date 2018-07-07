package org.sgx.yuigwt.yuitest1.gallery.test.uibinder.gwt;

import static org.sgx.yuigwt.yuitest1.gallery.GalleryConstants.TAG_ANIM;
import static org.sgx.yuigwt.yuitest1.gallery.GalleryConstants.TAG_BUTTON;
import static org.sgx.yuigwt.yuitest1.gallery.GalleryConstants.TAG_EVENT;
import static org.sgx.yuigwt.yuitest1.gallery.GalleryConstants.TAG_NODE;

import org.sgx.yuigwt.yui.YUI;
import org.sgx.yuigwt.yui.YUICallback;
import org.sgx.yuigwt.yui.YuiContext;
import org.sgx.yuigwt.yui.anim.Anim;
import org.sgx.yuigwt.yui.anim.AnimConfig;
import org.sgx.yuigwt.yui.anim.AnimEvent;
import org.sgx.yuigwt.yui.event.EventCallback;
import org.sgx.yuigwt.yui.node.Node;
import org.sgx.yuigwt.yui.util.Style;
import org.sgx.yuigwt.yui.widget.Widget;
import org.sgx.yuigwt.yui.widget.button.ButtonConfig;
import org.sgx.yuigwt.yui.widget.button.ButtonEvent;
import org.sgx.yuigwt.yuitest1.gallery.test.AbstractTest;
import org.sgx.yuigwt.yuitest1.gallery.test.TestResources;

import com.google.gwt.user.client.Window;
import com.google.gwt.user.client.ui.HTMLPanel;
import com.google.gwt.user.client.ui.RootPanel;
/**
 * anim
 * @author sg
 *
 */
public class GwtWidgetsTest2 extends AbstractTest {

public GwtWidgetsTest2() {
	super("GwtWidgetsTest2", "GwtWidgetsTest2", 
		new String[]{TAG_ANIM, TAG_EVENT, TAG_BUTTON, TAG_NODE}, 
		TestResources.instance.AnimTest1());
}


public void test(final Node parent) {	
	parent.asHTMLPanel().add(new TestWidget1()); 
}

}
