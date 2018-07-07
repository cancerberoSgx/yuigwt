package org.sgx.madrenecesidad.client.trash.ui_old;

import java.util.Arrays;

import org.sgx.yuigwt.yui.event.NodeEventCallback;
import org.sgx.yuigwt.yui.node.Node;
import org.sgx.yuigwt.yui.util.SimpleCallback;

public class UIUtils {
	private static UIUtils instance;
	public static UIUtils getInstance() {
		if (null == instance) {
			instance = new UIUtils();
		}
		return instance;
	}
	
	private String[] _initialomdules;
	int counter = 0; 

	private UIUtils() {
		_initialomdules = new String[]{
			"cssreset", /*"cssbase", "cssfonts",*/
			"cssgrids", "node", "button", 
			"autocomplete", "autocomplete-filters", "autocomplete-highlighters", 
			"panel",
			"datatable", "selector-css3", 
			"scrollview", "scrollview-paginator", 
			"history", 
			"console", "dump", 
			"history"
//			"async-queue" //used for run rpc synchronically in tests
		}; 
	}
//	public static <T> T[] concatAll(T[] first, T[]... rest) {
//		  int totalLength = first.length;
//		  for (T[] array : rest) {
//		    totalLength += array.length;
//		  }
//		  T[] result = Arrays.copyOf(first, totalLength);
//		  int offset = first.length;
//		  for (T[] array : rest) {
//		    System.arraycopy(array, 0, result, offset, array.length);
//		    offset += array.length;
//		  }
//		  return result;
//		}

	public String[] initialModules() {
//		if(Main.getInstance().develmode) {
//			return concatAll(_initialomdules, new String[]{}); 
//		}
//		else 
			return _initialomdules; 
	}
	
	public int nextCounter() {
		counter++; 
		return counter; 
	}
	
	public static void appendLinkButton(Node parent, String text, NodeEventCallback onclick) {
		Node button = parent.appendChild("<span class=\"link-button\">"+text+"</span>");
		button.on("click", onclick); 
	}
}
