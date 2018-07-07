package org.sgx.madrenecesidad.client.trash.test.maptests;

import org.sgx.madrenecesidad.client.gmapsmissingapi.GMap;
import org.sgx.madrenecesidad.client.trash.ui_old.AbstractUi;
import org.sgx.yuigwt.yui.YUI;
import org.sgx.yuigwt.yui.YUICallback;
import org.sgx.yuigwt.yui.YuiContext;
import org.sgx.yuigwt.yui.event.EventCallback;
import org.sgx.yuigwt.yui.node.Node;
import org.sgx.yuigwt.yui.util.Style;
import org.sgx.yuigwt.yui.util.HTMLUtil;
import org.sgx.yuigwt.yui.widget.button.ButtonConfig;
import org.sgx.yuigwt.yui.widget.button.ButtonEvent;
import org.sgx.yuigwt.yui.widget.slider.Slider;
import org.sgx.yuigwt.yui.widget.slider.SliderConfig;
import org.sgx.yuigwt.yui.widget.slider.SliderEvent;

import com.google.gwt.maps.client.MapOptions;
import com.google.gwt.maps.client.MapTypeId;
import com.google.gwt.maps.client.base.LatLng;

public class GMapsYuiControlsTest1 extends AbstractUi {

	private Slider zoomSlider;
	private GMap gmap1;
	private LatLng mapCenterCoords;

	@Override
	public void render(Node parent) {
		super.render(parent); 
		YUI.YUI().use(new String[]{"slider", "button"}, new YUICallback() {			
		@Override
		public void ready(YuiContext Y) {
			GMapsYuiControlsTest1.this.y=Y;
			beginTest1(); 
		}
	}); 
	}

	public GMapsYuiControlsTest1(YuiContext y) {
		super(y);
		// TODO Auto-generated constructor stub
	}

	protected void beginTest1() {
		double latitude = 10, longitude = -80; 
		mapCenterCoords = LatLng.newInstance(latitude, longitude);
		int initialZoom = 2; 
		
		MapOptions opts = MapOptions.newInstance();
//		opts.setMapTypeControl(false);
//		opts.setMapTypeId(MapTypeId.ROADMAP); 
		opts.setZoom(16);
		opts.setCenter(mapCenterCoords);
		opts.setMapTypeId(MapTypeId.ROADMAP);
		opts.setMapMaker(false); 
		opts.setMapTypeControl(false);
		opts.setDisableDefaultUi(true); 
		opts.setZoomControl(false);
		opts.setPanControl(false);
		opts.setScaleControl(false);
		opts.setStreetViewControl(false);
		opts.setZoom(initialZoom); 
//		final MapWidget mapWidget = new MapWidget(opts);
//		col1.add(mapWidget); 

		getConsole().log(y.dump(opts)); 

		//TODO: dirty table layout
		HTMLUtil HTMLUtil = new HTMLUtil(y); 
		Node table = HTMLUtil.newTable(getParent());		
		HTMLUtil.appendRow(table, "<div class=\"col1\"></div>", "<div class=\"col2\"></div>"); 
		Node col1 = table.one(".col1"); 
		Node col2 = table.one(".col2"); 
		
//		col1.setStyles(Style.create().margin("20px")); 
		
		Node map1El = col1.appendChild("<div></div>");
		
		map1El.setStyles(Style.create().width("200px").height("200px").border("4px solid brown")); 
		
		gmap1 = new GMap(map1El.getDOMNode(), opts); 
		
		

		Node controlsTable = HTMLUtil.newTable(col2);
		HTMLUtil.appendRow(controlsTable, "<div class=\"col1\"></div>", "<div class=\"col2\"></div>"); 
		Node sliderContainer = controlsTable.one(".col1"); 
		Node arrowsContainer = controlsTable.one(".col2"); 
		
		sliderContainer.append("<p>Zoom slider </p>");
		zoomSlider = y.newSlider(SliderConfig.create().axis("y").min(0).max(15).value(initialZoom).length(200))
			.render(sliderContainer).cast();
		zoomSlider.on(Slider.EVENT_SLIDEEND, new EventCallback<SliderEvent>() {
			@Override
			public void call(SliderEvent e) {
				getConsole().log("zoom : "+zoomSlider.get("value"));
				gmap1.getMapImpl().setZoom(zoomSlider.getInt("value")); 
			}
		}); 
		
		
		Node arrowsTable = HTMLUtil.newTable(arrowsContainer);
		HTMLUtil.appendRow(arrowsTable, "", "<div class=\"north\"></div>", "");
		HTMLUtil.appendRow(arrowsTable, "<div class=\"west\"></div>", "", "<div class=\"east\"></div>"); 
		HTMLUtil.appendRow(arrowsTable, "", "<div class=\"south\"></div>", ""); 
		
		y.newButton(ButtonConfig.create().label("north").render(arrowsTable.one(".north")).
			on("click", new EventCallback<ButtonEvent>() {				
				@Override
				public void call(ButtonEvent e) {
					mapCenterCoords = LatLng.newInstance(mapCenterCoords.getLatitude(), mapCenterCoords.getLatitude()+1.0);
					gmap1.getMapImpl().setCenter(mapCenterCoords); 
				}
			})
		); 
		
		y.newButton(ButtonConfig.create().label("south").render(arrowsTable.one(".south")).
			on("click", new EventCallback<ButtonEvent>() {				
				@Override
				public void call(ButtonEvent e) {
					mapCenterCoords = LatLng.newInstance(mapCenterCoords.getLatitude(), mapCenterCoords.getLatitude()-1.0);
					gmap1.getMapImpl().setCenter(mapCenterCoords); 
				}
			})
		); 
		
		y.newButton(ButtonConfig.create().label("east").render(arrowsTable.one(".east")).
			on("click", new EventCallback<ButtonEvent>() {				
				@Override
				public void call(ButtonEvent e) {
					mapCenterCoords = LatLng.newInstance(mapCenterCoords.getLatitude()+1.0, mapCenterCoords.getLatitude());
					gmap1.getMapImpl().setCenter(mapCenterCoords); 
				}
			})
		); 
		
		y.newButton(ButtonConfig.create().label("west").render(arrowsTable.one(".west")).
			on("click", new EventCallback<ButtonEvent>() {				
				@Override
				public void call(ButtonEvent e) {
					mapCenterCoords = LatLng.newInstance(mapCenterCoords.getLatitude()-1.0, mapCenterCoords.getLatitude());
					gmap1.getMapImpl().setCenter(mapCenterCoords); 
				}
			})
		); 
		
	}

	

}
