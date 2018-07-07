package org.sgx.madrenecesidad.client.trash.place;

import org.sgx.madrenecesidad.client.trash.ui_old.Ui;
import org.sgx.madrenecesidad.client.util.NodeUtil;
import org.sgx.yuigwt.yui.YuiContext;
import org.sgx.yuigwt.yui.history.History;
import org.sgx.yuigwt.yui.node.Node;

import com.google.gwt.core.client.JavaScriptObject;
import com.google.gwt.place.shared.Place;
/**
 * data : channelId (optional) - the channel to select
 * 
 * @author sg
 *
 */
public class ChannelListState extends AbstractState {

	private static final String STATE_NAME = "channelList";

	public ChannelListState(YuiContext y, JavaScriptObject data, Ui ui) {		
		super(y, STATE_NAME, data, ui);
	}

	@Override
	public void start() {
		Node parent = y.one("body"); 
		if(!getUi().isRendered()) {
			getUi().render(parent); 
		}
		else {
			NodeUtil.show(getUi().getSrcNode()); 
		}
		getUi().render(parent); 
	}
	@Override
	public void stop() { 
		if(getUi().isRendered()) {
			NodeUtil.hide(getUi().getSrcNode());  
		} 
	}
}
