package org.sgx.yuigwt.yui.util;

import org.sgx.yuigwt.yui.YuiContext;
import org.sgx.yuigwt.yui.node.Node;

/**
 * 		
 * @author sg
 *
 */
public class HTMLUtil {
YuiContext y;
/**
 * 
 * @param y must have "node" module loaded
 */
public HTMLUtil(YuiContext y) {
	super();
	this.y = y;
} 
/**
 * YUI node based utility for building tables with java. Example: 
 * 
<pre>
Node arrowsTable = tableutil.newTable(arrowsContainer);
tableutil.appendRow(arrowsTable, "", "&lt;div class=\"north\">&lt;/div>", "");
tableutil.appendRow(arrowsTable, "&lt;div class=\"west\">&lt;/div>", "", "&lt;div class=\"east\">&lt;/div>"); 
tableutil.appendRow(arrowsTable, "", "&lt;div class=\"south\">&lt;/div>", ""); 

y.newButton(ButtonConfig.create().label("north").render(arrowsTable.one(".north")).
	on("click", new EventCallback&lt;ButtonEvent>() {				
		
		public void call(ButtonEvent e) {
			mapCenterCoords = LatLng.newInstance(mapCenterCoords.getLatitude(), mapCenterCoords.getLatitude()+1.0);
			gmap1.getMapImpl().setCenter(mapCenterCoords); 
		}
	})
); 
</pre> 
		
 * @param parent
 * @return
 */
public Node newTable(Node parent) {
	return parent.appendChild(getOpenCloseTag("table")); 
}
/**
 * creates and append a new &lt;tr> to the give table and add give tdHtml html strings as &td> elements. 
 * @param table the table in which to add the new tr
 * @param tdHtml the tds html strings 
 * @return the new &lt;tr> element 
 */
public Node appendRow(Node table, String ... tdHtml) {
	Node tr = table.appendChild(getOpenCloseTag("tr")); 
	for (int i = 0; i < tdHtml.length; i++) {
		tr.appendChild(getOpenCloseTag("td", tdHtml[i]));//"<td>"+tdHtml[i]+"</td>"); 
	}
	return tr; 
}

public String getOpenTag(String tagName) {
	return "<"+tagName+">"; 
}
public String getCloseTag(String tagName) {
	return "</"+tagName+">"; 
}
public String getOpenCloseTag(String tagName) {
	return getOpenTag(tagName)+getCloseTag(tagName); 
}
public String getOpenCloseTag(String tagName, String content) {
	return getOpenTag(tagName)+content+getCloseTag(tagName); 
}
}
