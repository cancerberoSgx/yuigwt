package org.sgx.yuigwt.ui;

import java.util.Iterator;

import org.sgx.yuigwt.yui.YuiContext;
import org.sgx.yuigwt.yuigallery.YuiGalleryContext;

import com.google.gwt.dom.client.Element;
import com.google.gwt.uibinder.client.UiBinder;
import com.google.gwt.user.client.ui.Composite;
import com.google.gwt.user.client.ui.HasWidgets;
import com.google.gwt.user.client.ui.Widget;

public abstract class YUIBinded extends Composite implements YUIBinderListener {

	protected YUIBinder yuiBinder;
	protected YuiContext y;
	public YUIBinder getYUIBinder() {
		return yuiBinder;
	}
	public YUIBinded(YuiContext y) {
		this.y=y; 
		initWidget((Widget) getUIBinder().createAndBindUi(this));

		yuiBinder = YUIBinderFactory.getInstance().newYUIBinder();
		/*
		 * bind YUI stuff manually passing this Element UIFields corresponding
		 * to YUI stuff and register myself as a listener to be notified when
		 * YUI binding is done
		 */

		yuiBinder.bindYUI(y, this, getYUIBindedEls(), this);

	}
	public YuiContext Y() {
		return y;
	}
	
	public YuiGalleryContext YGAL() {
		return y.cast();
	}
	
	
	public abstract UiBinder getUIBinder();
	public abstract Element[] getYUIBindedEls(); 
	
	/**
	 * must be overriden by subclasses and call super.yuiBinded(). 
	 * Notice that the only think this does now is handle the composition problem so parents automatically call yuiBInded on their non notified childrens. 
	 * @return
	 */
	public void yuiBinded() {
		if(this instanceof HasWidgets) {
			Iterator<Widget> it = ((HasWidgets)this).iterator();
			while (it.hasNext()) {
				Widget widget = (Widget) it.next();
				if(widget instanceof YUIBinded) {
					((YUIBinded)widget).yuiBinded(); 
				}
			}
		}
	}
}
