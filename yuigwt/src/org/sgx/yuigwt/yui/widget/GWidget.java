package org.sgx.yuigwt.yui.widget;

import org.sgx.yuigwt.yui.YuiContext;
import org.sgx.yuigwt.yui.gwt.GWTUtil;

import com.google.gwt.core.client.JavaScriptObject;
import com.google.gwt.user.client.ui.Composite;
import com.google.gwt.user.client.ui.HTMLPanel;

/**
 * GWT abstract widget for wrapping YUI widgets.
 * 
 * @author sg
 * 
 */
public abstract class GWidget extends Composite {

	org.sgx.yuigwt.yui.widget.Widget yuiWidget;

	public GWidget(YuiContext y, JavaScriptObject config) {
		yuiWidget = newYuiWidget(y, config);
		HTMLPanel panel = GWTUtil.YUI2GWT(y, yuiWidget);
		initWidget(panel);
		setStyleName(getYuiStyleName());
	}

	protected String getYuiStyleName() {
		return "yuiwidget-" + this.getClass().getName();
	}

	/**
	 * subclasses must override this method
	 * 
	 * @param y
	 * @param config
	 * @return
	 */
	protected abstract org.sgx.yuigwt.yui.widget.Widget newYuiWidget(YuiContext y, JavaScriptObject config);

	public org.sgx.yuigwt.yui.widget.Widget getYuiWidget() {
		return yuiWidget;
	}
}
