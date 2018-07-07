package org.sgx.yuigwt.yuitest1.gallery.test;

import static org.sgx.yuigwt.yuitest1.gallery.GalleryConstants.TAG_PJAX;
import static org.sgx.yuigwt.yuitest1.gallery.GalleryConstants.TAG_UTILS;

import org.sgx.yuigwt.yui.YUI;
import org.sgx.yuigwt.yui.YUICallback;
import org.sgx.yuigwt.yui.YuiContext;
import org.sgx.yuigwt.yui.event.EventCallback;
import org.sgx.yuigwt.yui.node.Node;
import org.sgx.yuigwt.yui.pjax.Pjax;
import org.sgx.yuigwt.yui.pjax.PjaxConfig;
import org.sgx.yuigwt.yui.pjax.PjaxEvent;

import com.google.gwt.core.client.GWT;
import com.google.gwt.user.client.Window;
/**
 * shows how to use the pjax utility - requires html 5 - if not links behaves normal. 
 * NOTABUG: in my free website http://cancerbero.vacau.com/yuigwt/org.sgx.yuigwt.YuiGwtTestOnline/testfiles/page4donotexits.html
 * do not seemt to be returning 404 therefore no error is risen....
 * @author sg
 *
 */
public class PJaxTest1 extends AbstractTest {

public PJaxTest1() {
	super("pjax1", "shows how to use the PJax utility, requires html 5, http://yuilibrary.com/yui/docs/pjax/", 
		new String[]{TAG_UTILS, TAG_PJAX}, 
		TestResources.instance.PJaxTest1());
}

@Override
public void test(final Node parent) {
YUI.Use(new String[]{"pjax"}, new YUICallback() {	
		
	@Override
	public void ready(final YuiContext Y) {
		String base = GWT.getModuleBaseURL()+"testfiles/"; 
		parent.appendChild(
			"<p>these are links opened by pjax (html5 required): "+
			"<a class=\"yui3-pjax\" href=\""+base+"page1.html\">page1</a>&nbsp;"+
			"<a class=\"yui3-pjax\" href=\""+base+"page2.html\">page2</a>&nbsp;"+
			"<a class=\"yui3-pjax\" href=\""+base+"page3.html\">page3</a>&nbsp;"+
			"<a class=\"yui3-pjax\" href=\""+base+"page4donotexits.html\">page4 - do not exists</a>&nbsp;"+
			"<div id=\"pjaxcontent\" style=\"\">original content</div>");		
		
		Pjax pj1 = Y.newPjax(PjaxConfig.create().container("#pjaxcontent")); 
		
//note for not casting EventFacade to subclass PjaxEvent 
pj1.on("error", new EventCallback<PjaxEvent>() {			
	@Override
	public void call(PjaxEvent e) {
		Window.alert("PJAX ERROR: node: "+e.content().node()); 
	}
}); 
		
		
	}
}); 
}

}
