package org.sgx.yuigwt.yuitest1.gallery.test;

import org.sgx.yuigwt.yui.YUI;
import org.sgx.yuigwt.yui.YUICallback;
import org.sgx.yuigwt.yui.YuiContext;
import org.sgx.yuigwt.yui.console.Console;
import org.sgx.yuigwt.yui.console.ConsoleConfig;
import org.sgx.yuigwt.yui.editor.EditorBase;
import org.sgx.yuigwt.yui.editor.EditorBaseConfig;
import org.sgx.yuigwt.yui.editor.EditorBaseEvent;
import org.sgx.yuigwt.yui.event.EventCallback;
import org.sgx.yuigwt.yui.node.Node;
import org.sgx.yuigwt.yuitest1.gallery.GalleryConstants;
/**
 * rich editor base test 1. same example as in http://yuilibrary.com/yui/docs/editor/
 * @author sg
 *
 */
public class EditorBaseTest1 extends AbstractTest {

public EditorBaseTest1() {
	super("editor1", "crich editor base test 1. same example as in http://yuilibrary.com/yui/docs/editor/", 
		new String[]{GalleryConstants.TAG_WIDGET, GalleryConstants.TAG_EDITOR, 
			GalleryConstants.TAG_CONSOLE, GalleryConstants.TAG_EVENT, 
			GalleryConstants.TAG_PLUGIN, GalleryConstants.TAG_WIDGET}, 
		TestResources.instance.ConsoleTest1());
}

@Override
public void test(final Node parent) {
YUI.Use(new String[]{"console", "editor"}, new YUICallback() {
	@Override
	public void ready(final YuiContext Y) {
		final Console console1 = Y.newConsole(ConsoleConfig.create().width("50%"));
		console1.render(); 
		
		EditorBase editor = Y.newEditorBase(EditorBaseConfig.create().
			content("<strong class=\"foo\">This is <em>a test</em></strong>. Please edit me. <strong>This is <em>a test</em></strong>")
		);
		
		 //Add the BiDi plugin
	    editor.plug(Y.Plugin().EditorBidi());
	    	    
	    editor.on(EditorBase.EVENT_NODECHANGE, new EventCallback<EditorBaseEvent>() {
			@Override
			public void call(EditorBaseEvent e) {
				console1.log("node changed: "+e.changedType()); 
			}			
		}); 	    
	    
	    editor.on("dom:keydown", new EventCallback<EditorBaseEvent>() {
			@Override
			public void call(EditorBaseEvent e) {
				console1.log("dom:keydown: target: "+e.frameTarget().get("id")+
					" - keycode: "+e.frameEvent().keyCode()); 
			}			
		}); 	    
	    
	    editor.render(parent); 
	}
	
}); 
}

}
