package org.sgx.yuigwt.yuitest1.gallery.test;


import org.sgx.yuigwt.yui.YUI;
import org.sgx.yuigwt.yui.YUICallback;
import org.sgx.yuigwt.yui.YuiContext;
import org.sgx.yuigwt.yui.node.Node;
import org.sgx.yuigwt.yui.node.Transition;
import org.sgx.yuigwt.yui.node.TransitionVal;
import org.sgx.yuigwt.yui.util.Style;
import org.sgx.yuigwt.yuitest1.gallery.GalleryConstants;
/**
 * transition
 * @author sg
 *
 */
public class TransitionTest1 extends AbstractTest {

public TransitionTest1() {
	super("transition1", "transition test", 
		new String[]{GalleryConstants.TAG_TRANSITION, GalleryConstants.TAG_NODE}, 
		TestResources.instance.TransitionTest1());
}


public void test(final Node parent) {
YUI.Use(new String[]{"transition"}, new YUICallback() {
	
	public void ready(final YuiContext Y) {
		
		//rebuilding parent node with Y.one(parent.getDOMNode()) so poblate is available in this yui sandbox
		Node node1 = Y.one(parent.getDOMNode()).appendChild("<p>The online cache tester: </p>");
		node1.setStyles(Style.create().backgroundColor("red").display("block").
			height("300px").width("100px")); 
		
		node1.transition(Transition.create().
			duration(1).easing("ease-out").delay(1).
			width(TransitionVal.create("300px").easing(Transition.EASING_EASE_IN)).
			height(TransitionVal.create("100px").easing(Transition.EASING_EASE_OUT))
		); 
	}
}); 
}

}
