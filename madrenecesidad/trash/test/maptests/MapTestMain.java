package org.sgx.madrenecesidad.client.trash.test.maptests;

import org.sgx.madrenecesidad.client.trash.ui_old.AbstractUi;
import org.sgx.madrenecesidad.client.trash.ui_old.UIUtils;
import org.sgx.madrenecesidad.client.trash.ui_old.Ui;
import org.sgx.yuigwt.yui.YuiContext;
import org.sgx.yuigwt.yui.event.NodeEventCallback;
import org.sgx.yuigwt.yui.event.YuiEvent;
import org.sgx.yuigwt.yui.node.Node;
import org.sgx.yuigwt.yui.util.Style;
import org.sgx.yuigwt.yui.util.HTMLUtil;

import com.google.gwt.dom.client.Element;
import com.google.gwt.maps.client.MapImpl;
import com.google.gwt.user.client.DOM;
/**
 * a panel that include all map test launchers. 
 * @author sg
 *
 */
public class MapTestMain extends AbstractUi {

	private Node col1;
	private Node col2;

	public MapTestMain(YuiContext y) {
		super(y);
	}
	
	@Override
	public void render(Node parent) {
		HTMLUtil HTMLUtil = new HTMLUtil(y); 
		Node table = HTMLUtil.newTable(parent);
		HTMLUtil.appendRow(table, "<div class=\"col1\"></div>", "<div class=\"col2\"></div>");
		col1 = table.one(".col1"); 
		col2 = table.one(".col2"); 
		col1.setStyles(Style.create().margin("20px")); 
		
		UIUtils.appendLinkButton(col1, "Map test 1", new NodeEventCallback() {			
			@Override
			public void call(YuiEvent e) {
				launchTest(new MapTest1(y)); 
			}
		}); 
		col1.append("</br>"); 
		UIUtils.appendLinkButton(col1, "GMapsYuiControlsTest1", new NodeEventCallback() {			
			@Override
			public void call(YuiEvent e) {
				launchTest(new GMapsYuiControlsTest1(y)); 
			}
		}); 
		col1.append("</br>"); 
	}

	protected void launchTest(Ui mapTest1) {
		col2.empty(); 
		mapTest1.render(col2);
	}

}
