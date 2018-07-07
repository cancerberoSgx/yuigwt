package org.sgx.yuigwt.yui.gwt;

import org.sgx.yuigwt.yui.YuiContext;
import org.sgx.yuigwt.yui.node.Node;

import com.google.gwt.dom.client.Document;
import com.google.gwt.dom.client.Element;
import com.google.gwt.event.logical.shared.AttachEvent;
import com.google.gwt.user.client.ui.HTMLPanel;

/**
 * utilities for interacting between YUI widgets and GWT widgets and viceversa
 * 
 * @author sg
 * 
 */
public class GWTUtil {

	// public static org.sgx.yuigwt.yui.widget.Widget GWT2YUI(Widget gwtWidget)
	// {
	//
	// }
	/**
	 * Given a non rendered YUI widget, it returns a GWT Panel wrapping it
	 * inside so you can work with the YUI widgets as if it were a GWT widget.
	 * The user is responsible of calling render.
	 */
	public static HTMLPanel YUI2GWT(final YuiContext Y, final org.sgx.yuigwt.yui.widget.Widget yuiWidget) {
		Element yn1 = yuiWidget.contentBox().getDOMNode();
		Document.get().getBody().appendChild(yn1);
		final HTMLPanel gwtWidget = HTMLPanel.wrap(yn1);
		gwtWidget.addAttachHandler(new AttachEvent.Handler() {
			@Override
			public void onAttachOrDetach(AttachEvent event) {
				// System.out.println(event.isAttached()+": "+);
				if (event.isAttached())
					yuiWidget.render();
				else {
					yuiWidget.destroy();
				}
			}
		});
		return gwtWidget;
	}

	public static HTMLPanel YUI2GWT(Node node) {
		return node.asHTMLPanel();
	}

}
