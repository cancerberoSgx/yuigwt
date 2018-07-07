package org.sgx.madrenecesidad.client.trash.ui_old.channel;
//package org.sgx.madrenecesidad.client.ui_old.channel;
//
//import java.util.Comparator;
//import java.util.List;
//
////import org.sgx.madrenecesidad.client.control.MainController;
//import org.sgx.madrenecesidad.client.model.Channel;
//import org.sgx.madrenecesidad.client.system.SystemListener;
//import org.sgx.madrenecesidad.client.system.TheSystem;
//import org.sgx.madrenecesidad.client.ui_old.ACSVSelectList2;
//import org.sgx.madrenecesidad.client.ui_old.AbstractUi;
//import org.sgx.madrenecesidad.client.ui_old.ACSVSelectList2.Namer;
//import org.sgx.yuigwt.yui.YuiContext;
//import org.sgx.yuigwt.yui.node.Node;
///**
// * channel search facility using autocomplete and scrollview. 
// * @author sg
// *
// */
//public class ChannelSearch extends AbstractUi implements SystemListener {
//	public ChannelSearch(YuiContext y
////			, MainController mainController
//			) {
//		super(y);
////		this.mainController = mainController;		
//	}
//
////	private MainController mainController;
//	private Node parentNode, srcNode;
//	ACSVSelectList2<Channel> list;
//	private ACSVSelectList2.Namer<Channel> listNamer;
//	private ACSVSelectList2.Renderer<Channel> channelListRenderer; 
//	
////	public ChannelSearch(MainController mainController) {
////		this.mainController = mainController;
////	}
//
//	@Override
//	public void render(Node parent) {
//		super.render(parent); 
//		this.parentNode = parent; 		
//		listNamer = new ACSVSelectList2.Namer<Channel>() {
//			@Override
//			public String getName(Channel t) {
//				// TODO Auto-generated method stub
//				return null;
//			}
//		}; 
//		
//		channelListRenderer = new ACSVSelectList2.Renderer<Channel>() {
//			@Override
//			public void render(Channel t, Node parent) {
//				parent.append("<li></li>"); 
//			}
//		};
//		
//		TheSystem.getInstance().getChannelSystem().addListener2(this); 
//	}
//
//	@Override
//	public void changed() {
//		
////		ACSVSelectList2(YuiContext y, List<T> items, Namer<T> namer,
////				Renderer<T> itemRenderer, Comparator<T> comparator) 
//		List<Channel> items = TheSystem.getInstance().getChannelSystem().getChannels(); 
//		list = new ACSVSelectList2<Channel>(y, items, listNamer, 
//			channelListRenderer, null); 
//		srcNode = list.getSrcNode(); 
//	}
//
//}
