package org.sgx.madrenecesidad.client.ui.mymaps;

import org.sgx.madrenecesidad.client.model.MapView;
import org.sgx.madrenecesidad.client.ui.editor.MNEditor;
import org.sgx.yuigwt.ui.YUIBinded;
import org.sgx.yuigwt.yui.YuiContext;

import com.google.gwt.core.client.GWT;
import com.google.gwt.dom.client.Element;
import com.google.gwt.dom.client.InputElement;
import com.google.gwt.event.shared.GwtEvent.Type;
import com.google.gwt.maps.client.MapOptions;
import com.google.gwt.maps.client.MapTypeId;
import com.google.gwt.maps.client.MapWidget;
import com.google.gwt.maps.client.base.LatLng;
import com.google.gwt.maps.client.events.center.CenterChangeMapEvent;
import com.google.gwt.maps.client.events.center.CenterChangeMapHandler;
import com.google.gwt.maps.client.events.maptypeid.MapTypeIdChangeMapEvent;
import com.google.gwt.maps.client.events.maptypeid.MapTypeIdChangeMapHandler;
import com.google.gwt.uibinder.client.UiBinder;
import com.google.gwt.uibinder.client.UiFactory;
import com.google.gwt.uibinder.client.UiField;
import com.google.gwt.user.client.Window;
import com.google.gwt.user.client.ui.Widget;
import com.sun.java.swing.plaf.windows.resources.windows;

/**
 * @author sg
 * 
 */
public class MapEditorVisual extends YUIBinded implements MNEditor<MapView>
// implements Editor<MapView>
, CenterChangeMapHandler
{

	interface MyUiBinder extends UiBinder<Widget, MapEditorVisual> {
	}

	private static UiBinder<YUIBinded, Widget> uiBinder = GWT.create(MyUiBinder.class);

	@UiField
	Element mapContainer, controlsContainer;
	
	@UiField InputElement nameInputEl, descriptionInputEl, latInputEl, longInputEl, privateInputEl; 
	

	@UiField
	MapWidget mapWidget;

	private MapView model;

	private MapOptions mapOpts;

	public MapEditorVisual(YuiContext y) {
		super(y);
	}

	@Override
	public void yuiBinded() {

//		LatLng center = LatLng.newInstance(9.837900929149729, 8.85351657867432);
//		MapOptions opts = MapOptions.newInstance();
//		opts.setMapTypeId(MapTypeId.ROADMAP);
//		opts.setZoom(10);
//		opts.setCenter(center);
//		
//		mapWidget.setOptions(opts); //.setCenter(latlng)
//		mapWidget.setSize("500px", "400px"); 
	}
	
	/**
	 * Will be used for creating MapOptions instances of this UIBinder widget. 
	 * @return a new MapOptions
	 */
	@UiFactory
	MapWidget makeMapWidget() {
		model = new MapView(); 
		LatLng center = LatLng.newInstance(9.837900929149729, 8.85351657867432);
		mapOpts = MapOptions.newInstance();
		mapOpts.setMapTypeId(MapTypeId.ROADMAP);
		mapOpts.setZoom(10);
		mapOpts.setCenter(center);
		
		mapWidget = new MapWidget(mapOpts); 
		mapWidget.addCenterChangeHandler(this); 
		mapWidget.addMapTypeIdChangeHandler(new MapTypeIdChangeMapHandler() {
			
			@Override
			public void onEvent(MapTypeIdChangeMapEvent event) {
				Window.alert(mapWidget.getMapTypeId().value()); 
			}
		}); 
		
	//	mapWidget.setOptions(opts); //.setCenter(latlng)
		mapWidget.setSize("500px", "400px"); 
		return mapWidget; 
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
		return new Element[] {};
	}

	@Override
	public MapView flush() {
		if (model == null) // TODO error: first load() then flush()
			return null;
		// model.setName(nameInputEl.getValue());
		// model.setDescription(descriptionInputEl.getValue());
		// model.setPrivate(privateInputEl.isChecked());
		return model;
	}

	@Override
	public void load(MapView t) {
		model = t;
		// nameInputEl.setAttribute("value", model.getName());
		// descriptionInputEl.setAttribute("value", model.getDescription());
		// latInputEl.setAttribute("value", model.getLatitude()+"");
		// longInputEl.setAttribute("value", model.getLongitude()+"");
		// privateInputEl.setChecked(model.isPrivate());
	}

	@Override
	public void onEvent(CenterChangeMapEvent event) {
		LatLng center = mapWidget.getCenter(); 
		model.setLatitude(center.getLatitude());
		model.setLongitude(center.getLongitude()); 
		latInputEl.setValue(center.getLatitude()+"");
		longInputEl.setValue(center.getLongitude()+""); 
	}

	// private void initMap() {
	//
	// // Coordinates coords = result.getCoordinates();
	// // col1.append("Geo location supported, you are at latitude: " + coords.getLatitude() + ", longitude: " + coords.getLongitude());
	// // vp.add(new HTML("Geo location supported, you are at latitude: " + coords.getLatitude() + ", longitude: " + coords.getLongitude()));
	// // showMap(coords);
	//
	// // geop
	// LatLng center = LatLng.newInstance(9.837900929149729, 8.85351657867432);
	// MapOptions opts = MapOptions.newInstance();
	// // opts.setMapTypeControl(false);
	// // opts.setMapTypeId(MapTypeId.ROADMAP);
	// opts.setZoom(10);
	// opts.setCenter(center);
	// gmap1 = new GMap(mapContainer, opts);
	// // map1 = createMap(map1El, opts);
	// // mapWidget.setSize("750px", "500px");
	//
	// gmap1.getMapImpl().addClickHandler(new ClickMapHandler() {
	//
	// @Override
	// public void onEvent(ClickMapEvent event) {
	// gmapClicked(event);
	//
	// }
	// });
	//
	// if (readyListener != null && !viewReady)
	// readyListener.ready(this);
	// viewReady = true;
	// // gmap1Initialized=true;
	//
	// }
	//
	// protected void gmapClicked(ClickMapEvent event) {
	// Window.alert("zoom: " + gmap1.getOptions().getZoom() + ", LatLng: " + gmap1.getOptions().getCenter() + " - "
	// + gmap1.getMapImpl().getCenter());
	//
	// // MarkerOptions markerOpts = MarkerOptions.newInstance();
	// // marker
	//
	// MarkerOptions opts = MarkerOptions.newInstance();
	// opts.setClickable(true);
	// opts.setDraggable(true);
	// Marker marker1 = Marker.newInstance(opts);// event.getMouseEvent().getLatLng(), markerOpts);
	// marker1.addClickHandler(new ClickMapHandler() {
	// @Override
	// public void onEvent(ClickMapEvent event) {
	// // Marker m = event.getSource().cast();
	// Window.alert("marker clicked: " + event.getSource());
	// }
	// });
	//
	// // LatLng clickLocation = event.getMouseEvent().getLatLng();
	// // PlaceSearchRequest req = PlaceSearchRequest.newInstance();
	// // req.setLocation(clickLocation);
	// // req.setRaidus(50000);
	// // req.setTypes(PlaceSearchTypes.embassy);
	// //
	// // PlacesService placeService = gmap1.newPlacesService(); //PlacesService.newInstance(ma);
	// // placeService.search(req, new PlaceSearchHandler() {
	// // @Override
	// // public void onCallback(JsArray<PlaceResult> results, PlacesServiceStatus status) {
	// // Window.alert("embassies found in the area : " + results.length());
	// // for (int i = 0; i < results.length(); i++) {
	// // PlaceResult result = results.get(i);
	// // }
	// // }
	// // });
	// }
	//

}
