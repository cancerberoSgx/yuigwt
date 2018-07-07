package org.sgx.madrenecesidad.client.ui.misc;

import java.util.Iterator;
import java.util.LinkedList;
import java.util.List;

import org.sgx.madrenecesidad.client.app.AppController;
import org.sgx.madrenecesidad.client.model.MapView;
import org.sgx.madrenecesidad.client.ui.editor.MNEditor;
import org.sgx.madrenecesidad.client.util.gmapsmissingapi.GMap;
//import org.sgx.yuigwt.editors.Editor;
//import org.sgx.yuigwt.editors.error.EditorError;
//import org.sgx.yuigwt.editors.event.ValueChangeListener;
import org.sgx.yuigwt.ui.YUIBinded;
import org.sgx.yuigwt.yui.YuiContext;
import org.sgx.yuigwt.yui.event.EventCallback;
import org.sgx.yuigwt.yui.event.EventFacade;
import org.sgx.yuigwt.yui.node.Node;
import org.sgx.yuigwt.yui.util.Style;
import org.sgx.yuigwt.yui.widget.button.Button;
import org.sgx.yuigwt.yui.widget.button.ButtonEvent;
import org.sgx.yuigwt.yui.widget.panel.Panel;

import com.google.gwt.core.client.GWT;
import com.google.gwt.core.client.JsArrayMixed;
import com.google.gwt.dom.client.Element;
import com.google.gwt.geolocation.client.Position.Coordinates;
import com.google.gwt.maps.client.MapOptions;
import com.google.gwt.maps.client.MapTypeId;
import com.google.gwt.maps.client.base.LatLng;
import com.google.gwt.maps.client.events.click.ClickMapEvent;
import com.google.gwt.maps.client.events.click.ClickMapHandler;
import com.google.gwt.uibinder.client.UiBinder;
import com.google.gwt.uibinder.client.UiConstructor;
import com.google.gwt.uibinder.client.UiFactory;
import com.google.gwt.uibinder.client.UiField;
import com.google.gwt.user.client.Window;
import com.google.gwt.user.client.ui.HasWidgets;
import com.google.gwt.user.client.ui.Widget;

/**
 * 
 * Usage example:
 * 
 * 
 * @author sg
 * 
 */
public class AcceptCancelPanel extends YUIBinded implements HasWidgets
// implements Editor<MapView>
{

	interface MyUiBinder extends UiBinder<Widget, AcceptCancelPanel> {
	}

	private static UiBinder<YUIBinded, Widget> uiBinder = GWT.create(MyUiBinder.class);

	@UiField
	Element panelBodyEl, acceptButtonEl, cancelButtonEl, panel1El;
	Panel panel;
	List<Widget> childs;
	AcceptCancelPanelListener listener;

	public AcceptCancelPanel(YuiContext y) {
		super(y);
		childs = new LinkedList<Widget>();
	}

	public AcceptCancelPanel(YuiContext y, AcceptCancelPanelListener listener) {
		this(y);
		this.listener = listener;
	}

	@Override
	public void yuiBinded() {
		super.yuiBinded();
		Button acceptButton = getYUIBinder().getWidget(acceptButtonEl).cast();
		acceptButton.after("click", new EventCallback<EventFacade>() {
			@Override
			public void call(EventFacade e) {
				if (listener != null)
					listener.accept();
			}
		});
		Button cancelButton = getYUIBinder().getWidget(cancelButtonEl).cast();
		cancelButton.after("click", new EventCallback<EventFacade>() {
			@Override
			public void call(EventFacade e) {
				if (listener != null)
					listener.cancel();
			}
		});
		panel = getYUIBinder().getWidget(panel1El).cast();
	}

	@Override
	public UiBinder<YUIBinded, Widget> getUIBinder() {
		return uiBinder;
	}

	/**
	 * tell the YUIBinder which are the fields corresponding to YUI widgets.
	 */
	@Override
	public Element[] getYUIBindedEls() {
		return new Element[] { acceptButtonEl, cancelButtonEl, panel1El };
	}

	public Panel getYUIPanel() {
		return panel;
	}

	// HasWidgets stuff:

	@Override
	public void add(Widget w) {
		childs.add(w);
		panelBodyEl.appendChild(w.getElement());
	}

	@Override
	public void clear() {
		childs.clear();
		y.one(panelBodyEl).empty();
	}

	@Override
	public Iterator<Widget> iterator() {
		return childs.iterator();
	}

	@Override
	public boolean remove(Widget w) {
		y.one(panelBodyEl).removeChild(w.getElement());
		return childs.remove(w);
	}

	public AcceptCancelPanelListener getListener() {
		return listener;
	}

	public void setListener(AcceptCancelPanelListener listener) {
		this.listener = listener;
	}

}
