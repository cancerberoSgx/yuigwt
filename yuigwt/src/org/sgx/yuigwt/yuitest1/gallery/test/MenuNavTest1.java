package org.sgx.yuigwt.yuitest1.gallery.test;

import static org.sgx.yuigwt.yuitest1.gallery.GalleryConstants.*;

import org.sgx.yuigwt.yui.YUI;
import org.sgx.yuigwt.yui.YUICallback;
import org.sgx.yuigwt.yui.YuiContext;
import org.sgx.yuigwt.yui.event.YuiEvent;
import org.sgx.yuigwt.yui.node.Node;
import org.sgx.yuigwt.yui.node.NodeBase;
import org.sgx.yuigwt.yui.node.NodeEventDelegateCallback;
import org.sgx.yuigwt.yui.util.YUIUtil;

import com.google.gwt.user.client.Window;


public class MenuNavTest1 extends AbstractTest {

public MenuNavTest1() {
	super("MenuNavTest1", "MenuNavTest1", new String[]{TAG_MENUNAV, TAG_WIDGET, TAG_NODE}, 
			TestResources.instance.EventDelegateTest1());
}


public void test(final Node parent) {
	YUI.YUI().use(new String[]{"node-menunav"}, new YUICallback() {
	
		
		public void ready(YuiContext Y) {
			
			parent.append("<p>these are two menus, the markup created using YUIUtil.makeMenu* and using YUI NodeMenuNav plugin for the menues. The first is a horizontal menu and the last is a vertical menu</p>"); 
			//generate a simple horizontal menu bar and use event delegation for getting who menuitem was clicked
			Node menu1 = YUIUtil.makeMenu(Y, true, new Node[]{
				YUIUtil.makeMenuItem(Y, "File", new Node[]{
					YUIUtil.makeMenuItem(Y, "Open..."),
					YUIUtil.makeMenuItem(Y, "Save..."),					
					YUIUtil.makeMenuItem(Y, "Export", new Node[]{
						YUIUtil.makeMenuItem(Y, "to PNG", null),
						YUIUtil.makeMenuItem(Y, "to PDF", null)
					}),
					YUIUtil.makeMenuItem(Y, "Exit"),
				}), 
				
				YUIUtil.makeMenuItem(Y, "Help", new Node[]{
					YUIUtil.makeMenuItem(Y, "About", null), 
					YUIUtil.makeMenuItem(Y, "Use manual")
				})					
			}); 
			parent.append(menu1); 
			
			menu1.plug(Y.Plugin().NodeMenuNav()); 
			
			parent.append("<p>and now the vertical menu...</p>");
			
			//now create another menu but vertical
			
			NodeBase vMenuParent = parent.appendChild(YUIUtil.NODE(Y, "tag: 'div'", "width: '80px'"));
			parent.append(vMenuParent); 
			Node menu2 = YUIUtil.makeMenu(Y, false, new Node[]{
				YUIUtil.makeMenuItem(Y, "YAHOO", new Node[]{
					YUIUtil.makeMenuItem(Y, "Search..."),
					YUIUtil.makeMenuItem(Y, "Mail..."),					
					YUIUtil.makeMenuItem(Y, "News", new Node[]{
						YUIUtil.makeMenuItem(Y, "London 2012", null),
						YUIUtil.makeMenuItem(Y, "Uruguay football champion", null)
					}),
					YUIUtil.makeMenuItem(Y, "Other"),
				}), 
				
				YUIUtil.makeMenuItem(Y, "Google", new Node[]{
					YUIUtil.makeMenuItem(Y, "News", null), 
					YUIUtil.makeMenuItem(Y, "Docs")
				})					
			}); 
			vMenuParent.append(menu2); 
			menu2.plug(Y.Plugin().NodeMenuNav()); 
			
			for(Node n : new Node[]{menu1, menu2}) {
				n. delegate("click", new NodeEventDelegateCallback() {					
					
					public void call(Node n, YuiEvent evt, Object arg) {
						Window.alert("clicked node: "+n); 
						evt.preventDefault(); 
					}
				}, ".yui3-menuitem-content", null); 
			}
//			Y.newNodeList(new Node[]{menu1, menu2}).
			//use event delegate for listening to clicks only in menu leafs (filter by .yui3-menuitem-content) 
			
		}
	}); 
}

}
