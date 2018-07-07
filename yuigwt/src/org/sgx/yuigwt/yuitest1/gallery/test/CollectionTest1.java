package org.sgx.yuigwt.yuitest1.gallery.test;

import static org.sgx.yuigwt.yuitest1.gallery.GalleryConstants.TAG_ANIM;
import static org.sgx.yuigwt.yuitest1.gallery.GalleryConstants.TAG_BUTTON;
import static org.sgx.yuigwt.yuitest1.gallery.GalleryConstants.TAG_EVENT;

import org.sgx.yuigwt.yui.YUI;
import org.sgx.yuigwt.yui.YUICallback;
import org.sgx.yuigwt.yui.YuiContext;
import org.sgx.yuigwt.yui.collection.Queue;
import org.sgx.yuigwt.yui.node.Node;
import org.sgx.yuigwt.yuitest1.gallery.GalleryConstants;

import com.google.gwt.user.client.Window;

/**
 * some test on YUI collection java APIS like Y.Queue, Y.ArrayList, etc in package yui.collection
 * @author sg
 *
 */
public class CollectionTest1 extends AbstractTest {

public CollectionTest1() {
	super("collection1", "some test on YUI collection java APIS like Y.Queue, Y.ArrayList, etc in package yui.collection", 
		new String[]{GalleryConstants.TAG_YUI, GalleryConstants.TAG_UTILS}, 
		TestResources.instance.CollectionTest1());
}


public void test(final Node parent) {
YUI.Use(new String[]{"yui-base"}, new YUICallback() {
	
	public void ready(final YuiContext Y) {
		Queue<String> q1 = Y.newQueue().cast();
		q1.add("hello");
		q1.add("world"); 
//		q1.promote("world"); 
		q1.last(); 		
		Window.alert(q1.last()); 
	}
}); 
}

}
