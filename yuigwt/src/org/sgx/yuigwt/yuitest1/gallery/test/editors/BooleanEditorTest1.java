package org.sgx.yuigwt.yuitest1.gallery.test.editors;

import org.sgx.yuigwt.editors.event.EditorValueChangeEvent;
import org.sgx.yuigwt.editors.event.ValueChangeListener;
import org.sgx.yuigwt.editors.impl.simple.BooleanEditor1;
import org.sgx.yuigwt.yui.YUI;
import org.sgx.yuigwt.yui.YUICallback;
import org.sgx.yuigwt.yui.YuiContext;
import org.sgx.yuigwt.yui.console.Console;
import org.sgx.yuigwt.yui.event.EventCallback;
import org.sgx.yuigwt.yui.node.Node;
import org.sgx.yuigwt.yui.widget.button.ButtonConfig;
import org.sgx.yuigwt.yui.widget.button.ButtonEvent;
import org.sgx.yuigwt.yuitest1.gallery.GalleryConstants;
import org.sgx.yuigwt.yuitest1.gallery.test.AbstractTest;
import org.sgx.yuigwt.yuitest1.gallery.test.TestResources;
/**
 * anim
 * @author sg
 *
 */
public class BooleanEditorTest1 extends AbstractTest {

protected Console console;

public BooleanEditorTest1() {
	super("booleanEditor1", "booleanEditor1", 
		new String[]{GalleryConstants.TAG_EXT, GalleryConstants.TAG_EDITOR}, 
		TestResources.instance.editors_BooleanEditorTest1());
}


public void test(final Node parent) {
YUI.Use(new String[]{"node", "button", "console"}, new YUICallback() {
	private BooleanEditor1 ed1;

	
	public void ready(final YuiContext Y) {
		ed1 = new BooleanEditor1(Y);
		ed1.render(parent); 
		console = Y.newConsole(); 
		console.render(); 
		
		ed1.load(new Boolean(true)); 
		
		Y.newButton(ButtonConfig.create().label("flush").render(parent).
			on("click", new EventCallback<ButtonEvent>() {				
				
				public void call(ButtonEvent e) {
					ed1.flush(); 
					if(ed1.flush()) {
						console.log("checked"); 
					}
					else {
						console.log("unchecked");
					}
				}
			})
		); 	
		
		ed1.addValueChangeListener(new ValueChangeListener<Boolean>() {			
			
			public void notifyValueChange(EditorValueChangeEvent<Boolean> evt) {
				console.log("event "+evt.getSrc().flush());
			}
		}); 
	}
}); 
}

}
