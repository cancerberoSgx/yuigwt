package org.sgx.madrenecesidad.client.trash.test.maptests;

import org.sgx.madrenecesidad.client.gmapsmissingapi.GMap;
import org.sgx.madrenecesidad.client.gmapsmissingapi.PlaceSearchTypes;
import org.sgx.madrenecesidad.client.gmapsmissingapi.PlaceTypes;
import org.sgx.madrenecesidad.client.trash.test.AbstractTest;
import org.sgx.madrenecesidad.client.trash.ui_old.AbstractUi;
import org.sgx.yuigwt.yui.YuiContext;
import org.sgx.yuigwt.yui.node.Node;
import org.sgx.yuigwt.yui.util.Style;
import org.sgx.yuigwt.yui.util.HTMLUtil;

import com.google.gwt.core.client.Callback;
import com.google.gwt.core.client.JsArray;
import com.google.gwt.dom.client.Element;
import com.google.gwt.event.dom.client.ClickEvent;
import com.google.gwt.event.dom.client.ClickHandler;
import com.google.gwt.geolocation.client.Geolocation;
import com.google.gwt.geolocation.client.Position;
import com.google.gwt.geolocation.client.Position.Coordinates;
import com.google.gwt.geolocation.client.PositionError;
import com.google.gwt.maps.client.*;
import com.google.gwt.maps.client.base.*;
import com.google.gwt.maps.client.events.click.ClickMapEvent;
import com.google.gwt.maps.client.events.click.ClickMapHandler;
import com.google.gwt.maps.client.placeslib.PlaceResult;
import com.google.gwt.maps.client.placeslib.PlaceSearchHandler;
import com.google.gwt.maps.client.placeslib.PlaceSearchRequest;
import com.google.gwt.maps.client.placeslib.PlacesService;
import com.google.gwt.maps.client.placeslib.PlacesServiceStatus;
import com.google.gwt.user.client.Window;
import com.google.gwt.user.client.ui.Panel;
import com.google.gwt.user.client.ui.Widget;

public class MapTest1 extends AbstractUi {

	private Node col1;
	private Node col2;
//	protected Node map1El;
	protected MapImpl map1;
	protected GMap gmap1;


	public MapTest1(YuiContext y) {
		super(y);
	}

	@Override
	public void render(Node parent) {	
		super.render(parent); 
		getParent().append("<b>the first test</b>"); 
		
		HTMLUtil HTMLUtil = new HTMLUtil(y); 
		Node table = HTMLUtil.newTable(parent);
		HTMLUtil.appendRow(table, "<div class=\"col1\"></div>");
		HTMLUtil.appendRow(table, "<div class=\"col2\"></div>");
		col1 = table.one(".col1"); 
		col2 = table.one(".col2"); 
		col1.setStyles(Style.create().margin("20px")); 
		
		showMap(); 
	}
	
	/**
	 * creates a new gmap inside given element. taken from MapWidget constructor
	 * @param e
	 */
	public static MapImpl createMap(Element e, MapOptions options) {
		MapImpl impl = MapImpl.newInstance(e, options);
		e.addClassName("gwt-map-MapWidget-div"); 
		return impl; 
	}
	/**
	 * creates a new gmap inside given element. taken from MapWidget constructor
	 * @param e
	 */
	public static MapImpl createMap(Node e, MapOptions options) {
		MapImpl impl = MapImpl.newInstance(e.getDOMNode(), options);
		e.addClass("gwt-map-MapWidget-div"); 
		return impl; 
	}
	protected void showMap() {
		Geolocation geoloc = Geolocation.getIfSupported();
		if (geoloc != null) {
			geoloc.getCurrentPosition(new Callback<Position, PositionError>() {
				@Override
				public void onSuccess(Position result) {
					Coordinates coords = result.getCoordinates();
					col1.append("Geo location supported, you are at latitude: " + coords.getLatitude() + ", longitude: " + coords.getLongitude()); 
//					vp.add(new HTML("Geo location supported, you are at latitude: " + coords.getLatitude() + ", longitude: " + coords.getLongitude()));
//					showMap(coords);
					
					LatLng center = LatLng.newInstance(coords.getLatitude(), coords.getLongitude());
					MapOptions opts = MapOptions.newInstance();
//					opts.setMapTypeControl(false);
//					opts.setMapTypeId(MapTypeId.ROADMAP); 
					opts.setZoom(16);
					opts.setCenter(center);
					opts.setMapTypeId(MapTypeId.ROADMAP);
					opts.setMapMaker(false); 
					opts.setMapTypeControl(false);
					opts.setDisableDefaultUi(true); 
					opts.setZoomControl(false);
					opts.setPanControl(false);
					opts.setScaleControl(false);
					opts.setStreetViewControl(false);
//					final MapWidget mapWidget = new MapWidget(opts);
//					col1.add(mapWidget); 

					getConsole().log(y.dump(opts)); 
					Node map1El = col2.appendChild("<div></div>");
					map1El.setStyles(Style.create().width("200px").height("200px").border("4px solid brown")); 
					
					gmap1 = new GMap(map1El.getDOMNode(), opts); 
//					map1 = createMap(map1El, opts); 
//					mapWidget.setSize("750px", "500px");
					
					gmap1.getMapImpl().addClickHandler(new ClickMapHandler() {
						
						@Override
						public void onEvent(ClickMapEvent event) {
//							LatLng clickLocation = event.getMouseEvent().getLatLng();
//							PlaceSearchRequest req = PlaceSearchRequest.newInstance();
//							req.setLocation(clickLocation);
//							req.setRaidus(50000);
//							req.setTypes(PlaceSearchTypes.embassy);
//
//							PlacesService placeService = gmap1.newPlacesService(); //PlacesService.newInstance(ma);
//							placeService.search(req, new PlaceSearchHandler() {
//								@Override
//								public void onCallback(JsArray<PlaceResult> results, PlacesServiceStatus status) {
//									Window.alert("embassies found in the area : " + results.length());
//									for (int i = 0; i < results.length(); i++) {
//										PlaceResult result = results.get(i);
//									}
//								}
//							});
						}
					}); 

				}

				@Override
				public void onFailure(PositionError reason) {
					col1.append("Geo location supported but failure occurs while getting position");
				}
			});
		} else {
			col1.append("Geo location not supported");
		}
		
		

	}
}
