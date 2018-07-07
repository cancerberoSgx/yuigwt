package org.sgx.madrenecesidad.client.trash.place;

import java.util.List;

import org.sgx.madrenecesidad.client.model.Channel;
import org.sgx.madrenecesidad.client.system.ChannelSystem;
import org.sgx.madrenecesidad.client.system.SystemFactory;
import org.sgx.madrenecesidad.client.system.SystemListener;
import org.sgx.madrenecesidad.client.trash.ui_old.ACSVSelectList2;
import org.sgx.madrenecesidad.client.trash.ui_old.AbstractUi;
import org.sgx.madrenecesidad.client.trash.ui_old.ACSVSelectList2.Namer;
import org.sgx.madrenecesidad.client.trash.ui_old.ACSVSelectList2.Renderer;
import org.sgx.yuigwt.yui.YuiContext;
import org.sgx.yuigwt.yui.node.Node;

public class ChannelListUi extends AbstractUi implements SystemListener {

	private ChannelSystem channelSystem=null;
//	private Node ul;
//	private Node input;
	ACSVSelectList2<Channel> list=null;
private Renderer<Channel> channelListRenderer=null;
private Namer<Channel> channelNamer=null; 
	public ChannelListUi(YuiContext y) {
		super(y);
	}
	
	@Override
	public void render(Node parent) {
		super.render(parent); 

		this.channelSystem = SystemFactory.getInstance().getChannelSystem();
		getSrcNode().append("<p>Search a channel by name or in the list below: </p>");
		
//		input = getSrcNode().appendChild("<input type=\"text\"></input>");
//		getSrcNode().append("<p>The list: </p>");
//		ul = getSrcNode().appendChild("<li></li>");
		
		channelListRenderer = new ACSVSelectList2.Renderer<Channel>() {
			@Override
			public void render(Channel t, Node parent) {
				parent.append("<li><b>"+t.getName()+"</b><p>"+t.getDescription()+"</p></li>"); 
			}
		};
		
		channelNamer = new ACSVSelectList2.Namer<Channel>() {
			@Override
			public String getName(Channel t) {
				return t.getName(); 
			}
		};
		this.channelSystem.addListener2(this);
		
	}

	@Override
	public void changed() {
		List<Channel> items = this.channelSystem.getChannels(); 
		if(list==null) {
			list=new ACSVSelectList2<Channel>(y, items, channelNamer, channelListRenderer, null); 
			list.render(y.one("body")); 
		}
		else 
			list.update(items); 
	}

}
