package org.sgx.madrenecesidad.client.ui.mymaps;

import java.util.List;

import org.sgx.madrenecesidad.client.app.AppController;
import org.sgx.madrenecesidad.client.model.MapView;
import org.sgx.madrenecesidad.client.ui.MNView;
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
import com.google.gwt.dom.client.InputElement;
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
import com.google.gwt.user.client.ui.Widget;

/**
 * @author sg
 * 
 */
public class MapEditorForm extends YUIBinded implements MNEditor<MapView>
//implements Editor<MapView> 
{

	interface MyUiBinder extends UiBinder<Widget, MapEditorForm> {
	}

	private static UiBinder<YUIBinded, Widget> uiBinder = GWT.create(MyUiBinder.class);
	private MapView model;

	@UiField InputElement nameInputEl, descriptionInputEl, latInputEl, longInputEl, privateInputEl; 
	
	
//	private GMap gmap1; 
	public MapEditorForm(YuiContext y) {
		super(y); 
//		System.out.println("MapEditor constr ");
	}

	@Override
	public void yuiBinded() {
//		System.out.println("MapEditor yuiBinded ");
		y.one(getElement()).all("input").on("click", new EventCallback<EventFacade>() {
			@Override
			public void call(EventFacade e) {
				Node target = e.getTarget().cast();
				InputElement targetEl = target.getDOMNode().cast();
				targetEl.select(); 
				
			}
		}); 
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
		return  new Element[] {}; 
	}

	@Override
	public MapView flush() {
		if(model==null) //TODO error: first load() then flush()
			return null;
		model.setName(nameInputEl.getValue()); 
		model.setDescription(descriptionInputEl.getValue()); 
		model.setPrivate(privateInputEl.isChecked()); 
		return model; 
	}

	@Override
	public void load(MapView t) {
		model = t; 
		nameInputEl.setAttribute("value", model.getName());
		descriptionInputEl.setAttribute("value", model.getDescription()); 
		latInputEl.setAttribute("value", model.getLatitude()+"");
		longInputEl.setAttribute("value", model.getLongitude()+"");
		privateInputEl.setChecked(model.isPrivate()); 
	}

}
