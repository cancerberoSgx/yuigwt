package org.sgx.yuigwt.ui;

import org.sgx.yuigwt.yui.YuiContext;
import org.sgx.yuigwt.yui.node.Node;

import com.google.gwt.dom.client.Element;
import com.google.gwt.user.client.ui.Widget;

public interface YUIBinder {

	public abstract void bindYUI(final YuiContext y, Widget w, final Element[] els, YUIBinderListener listener);

	public abstract void registerWidget(String elId, org.sgx.yuigwt.yui.widget.Widget w);

	public abstract org.sgx.yuigwt.yui.widget.Widget getWidget(Element e);

	public abstract org.sgx.yuigwt.yui.widget.Widget getWidget(Node n);

}