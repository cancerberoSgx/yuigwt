package org.sgx.yuigwt.yuitest1.gallery.test;

import org.sgx.yuigwt.yui.YUI;
import org.sgx.yuigwt.yui.YUICallback;
import org.sgx.yuigwt.yui.YuiContext;
import org.sgx.yuigwt.yui.event.NodeEventCallback;
import org.sgx.yuigwt.yui.event.YuiEvent;
import org.sgx.yuigwt.yui.node.Node;
import org.sgx.yuigwt.yui.node.NodeEventDelegateCallback;
import org.sgx.yuigwt.yui.widget.button.Button;

import static org.sgx.yuigwt.yuitest1.gallery.GalleryConstants.*;
/**
 * a simple example of using event delegation
 * @author sg
 *
 */
public class EventDelegateTest1 extends AbstractTest {

public EventDelegateTest1() {
	super("eventDelegate1", "a simple example of using event delegation", new String[]{TAG_EVENT}, 
		TestResources.instance.EventDelegateTest1());
}


public void test(final Node parent) {
	YUI.YUI().use(new String[]{"node", "node-event-delegate", "event-key"}, new YUICallback() {

		
		public void ready(YuiContext Y) { 
			Node newNode = parent.appendChild(
				"<fieldset id=\"todo-example\">\n"+
				"<legend>Todo List</legend>\n"+
				"<ol>\n"+
				"    <li><button class=\"delete-todo\">remove</button>Read YUI documentation</li>\n"+
				"    <li><button class=\"delete-todo\">remove</button>Build awesome web app</li>\n"+
				"    <li><button class=\"delete-todo\">remove</button>Profit!</li>\n"+
				"</ol>\n"+
				"<input id=\"todo\"> <button id=\"add-todo\" type=\"button\">add</button>\n"+
				"</fieldset>");
			newNode.setStyle("backgroundColor", "pink"); 
				
			final Node todoList = Y.one("#todo-example ol");
			final Node newTask = Y.one("#todo");
			
			todoList.delegate("click", new NodeEventDelegateCallback() {
				
				
				public void call(Node n, YuiEvent evt, Object arg) {
					n.ancestor("li").remove(); 
				}
			}, "button", null); 
			
			NodeEventCallback addTodo = new NodeEventCallback() {
				
				
				public void call(YuiEvent e) {
					todoList.append(
			            "<li><button class=\"delete-todo\">remove</button>" +
			                newTask.getString("value") +
			            "</li>");

			        newTask.set("value", "");
				}
			}; 
			Y.one("#add-todo").on("click", addTodo); 
			newTask.on("key", addTodo, "enter");  
		}
	
		
	}); 
}

}
