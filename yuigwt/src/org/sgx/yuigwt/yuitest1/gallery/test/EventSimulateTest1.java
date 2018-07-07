package org.sgx.yuigwt.yuitest1.gallery.test;

import static org.sgx.yuigwt.yuitest1.gallery.GalleryConstants.TAG_EVENT;

import org.sgx.yuigwt.yui.YUI;
import org.sgx.yuigwt.yui.YUICallback;
import org.sgx.yuigwt.yui.YuiContext;
import org.sgx.yuigwt.yui.event.NodeEventCallback;
import org.sgx.yuigwt.yui.event.YuiEvent;
import org.sgx.yuigwt.yui.node.Node;

import com.google.gwt.user.client.Window;
/**http://yuilibrary.com/yui/docs/event/simulate.html
 * @author sg
 *
 */
public class EventSimulateTest1 extends AbstractTest {

public EventSimulateTest1() {
	super("eventSimulate1", "event simulate", new String[]{TAG_EVENT}, 
		TestResources.instance.EventSimulateTest1());
}


public void test(final Node parent) {
YUI.Use(new String[]{"node-event-simulate"}, new YUICallback() {
	
	public void ready(final YuiContext Y) {
		/* ahaha - we need to work with a new parent node instance so we use Y.one(parent.getDOMNode()). 
		 * This is because we are loading the module "node-event-simulate" in this new / inner YUI sandbox - 
		 * we need to recreate  another instance of the parent so this node plugin is loaded in the new element to work with. 
		 * @see http://yuilibrary.com/forum/viewtopic.php?f=92&t=10439&p=34110#p34110
		 * */
		Node el1 = Y.one(parent.getDOMNode()).appendChild("<b>SampleEl</b>");
		//now we are sure that el2 Node has the "node-event-simulate" plugin loaded 
		
		el1.on("click", new NodeEventCallback() {			
			
			public void call(YuiEvent e) {
				Window.alert("simulated click. AltKey is "+e.altlKey()+" - clientX is "+e.clientX()); 
			}
		}); 
		el1.on("keydown", new NodeEventCallback() {
			
			
			public void call(YuiEvent e) {
				Window.alert("keydown simulate keycode is "+e.keyCode()); 
			}
		}); 
		
		el1.simulate("click", YuiEvent.create().altlKey(true).clientX(22).clientY(23));
		el1.simulate("keydown", YuiEvent.create().keyCode(97)); 
		
	}
}); 
}

}
