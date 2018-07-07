package org.sgx.madrenecesidad.client.trash.ui_old.admin;

import org.sgx.madrenecesidad.client.system.TagSystem;
import org.sgx.madrenecesidad.client.trash.test.tests.ChannelServiceTest1;
import org.sgx.yuigwt.yui.YuiContext;
import org.sgx.yuigwt.yui.event.EventCallback;
import org.sgx.yuigwt.yui.node.Node;
import org.sgx.yuigwt.yui.widget.button.ButtonConfig;
import org.sgx.yuigwt.yui.widget.button.ButtonEvent;

public class AdminPanel1 {
private YuiContext y;
private TagSystem tagSystem;
public AdminPanel1(YuiContext y) {
	this.y=y;
	this.tagSystem = TagSystem.getInstance(); 
}
public void render(Node parent) {
	y.newButton(ButtonConfig.create().label("Clean all tags").render(parent).
		on("click", new EventCallback<ButtonEvent>() {				
			@Override
			public void call(ButtonEvent e) {
				doCleanAllTags(); 
			}
		})
	); 
	
	y.newButton(ButtonConfig.create().label("ChannelTest1").render(parent).
		on("click", new EventCallback<ButtonEvent>() {				
			@Override
			public void call(ButtonEvent e) {
				new ChannelServiceTest1(y).test(); 
			}
		})
	); 
}
protected void doCleanAllTags() {
	tagSystem.adminCleanAllTags(); 
}
}
