package org.sgx.yuigwt.galleryexplorer.client.ui;

import java.util.Map;

import org.sgx.yuigwt.galleryexplorer.client.api.Module;
import org.sgx.yuigwt.yui.console.Console;
import org.sgx.yuigwt.yui.event.YuiEvent;
import org.sgx.yuigwt.yui.node.Node;
import org.sgx.yuigwt.yui.node.NodeEventDelegateCallback;
import org.sgx.yuigwt.yui.util.Style;
import org.sgx.yuigwt.yuigallery.YuiGalleryContext;

import com.google.gwt.user.client.Window;


/**
 * this class is reponsible of showing big listing in alphabetic order, separated by first letters
 * @author sg
 *
 */
public class ABCModuleListing {
public void render(Node parent, Gallery gallery) {
	YuiGalleryContext Y = gallery.Y;
	final Console console = gallery.console;
	GalleryUtil util = gallery.util; 
	Map<String, Module> modules = util.getModulesByName(); 
	parent.setStyle("columnCount", "3");
	parent.setStyle("columnGap", "20px"); 
	Node list = parent.appendChild("<ul></ul>"); 
	console.log("ABCModuleListing module count: "+modules.keySet().size()); 
	for(String moduleName : modules.keySet()) {
		Module module = modules.get(moduleName); 
		list.append("<li class=\"\" ><a href=\""+module.url()+
			"\" id=\"module-"+moduleName+"\">"+moduleName+"</a></li>"); 
	}
	list.delegate("click", new NodeEventDelegateCallback() {		
		@Override
		public void call(Node n, YuiEvent evt, Object arg) {
			evt.preventDefault(); 
			console.log(n+""); 
		}
	}, "a", null); 
}
}
