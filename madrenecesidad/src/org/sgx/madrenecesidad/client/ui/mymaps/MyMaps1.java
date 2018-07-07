package org.sgx.madrenecesidad.client.ui.mymaps;

import java.util.List;

import org.sgx.madrenecesidad.client.app.AppController;
import org.sgx.madrenecesidad.client.app.state.UserStateChangeListener;
import org.sgx.madrenecesidad.client.model.MapView;
import org.sgx.madrenecesidad.client.model.ModelUtil;
import org.sgx.madrenecesidad.client.presenter.Presenter;
import org.sgx.madrenecesidad.client.presenter.mymaps.MyMapsPresenter;
import org.sgx.madrenecesidad.client.presenter.mymaps.MyMapsPresenter1;
import org.sgx.madrenecesidad.client.presenter.mymaps.MyMapsPresenterConfig;
import org.sgx.madrenecesidad.client.ui.MNViewReadyListener;
import org.sgx.madrenecesidad.client.ui.editor.MNEditor;
import org.sgx.madrenecesidad.client.ui.misc.AcceptCancelPanel;
import org.sgx.madrenecesidad.client.ui.misc.AcceptCancelPanelListener;
import org.sgx.madrenecesidad.client.util.gmapsmissingapi.GMap;
import org.sgx.yuigwt.ui.YUIBinded;
import org.sgx.yuigwt.yui.event.EventCallback;
import org.sgx.yuigwt.yui.util.JsObject;
import org.sgx.yuigwt.yui.widget.autocomplete.AutoComplete;
import org.sgx.yuigwt.yui.widget.autocomplete.AutoCompleteEvent;
import org.sgx.yuigwt.yui.widget.button.Button;
import org.sgx.yuigwt.yui.widget.button.ButtonEvent;
import org.sgx.yuigwt.yuigallery.itsaselectlist.ITSASelectlist;
import org.sgx.yuigwt.yuigallery.itsaselectlist.ITSASelectlistConfig;
import org.sgx.yuigwt.yuigallery.itsaselectlist.ITSASelectlistEvent;

import com.google.gwt.core.client.GWT;
import com.google.gwt.core.client.JavaScriptObject;
import com.google.gwt.core.client.JsArray;
import com.google.gwt.dom.client.Element;
import com.google.gwt.maps.client.MapOptions;
import com.google.gwt.maps.client.MapTypeId;
import com.google.gwt.maps.client.base.LatLng;
import com.google.gwt.maps.client.events.click.ClickMapEvent;
import com.google.gwt.maps.client.events.click.ClickMapHandler;
import com.google.gwt.maps.client.overlays.Marker;
import com.google.gwt.maps.client.overlays.MarkerOptions;
import com.google.gwt.uibinder.client.UiBinder;
import com.google.gwt.uibinder.client.UiFactory;
import com.google.gwt.uibinder.client.UiField;
import com.google.gwt.user.cellview.client.CellTable;
import com.google.gwt.user.cellview.client.TextColumn;
import com.google.gwt.user.client.Window;
import com.google.gwt.user.client.ui.Widget;

/**
 * @author sg
 * 
 */
public class MyMaps1 extends YUIBinded implements UserStateChangeListener, MyMaps {

	interface MyUiBinder extends UiBinder<Widget, MyMaps1> {
	}

	private static UiBinder<YUIBinded, Widget> uiBinder = GWT.create(MyUiBinder.class);

	@UiField
	Element 
//	mapContainerEl, 
	saveMapButtonEl, mapsACEl, myMapViewsSelectEl, deleteMapButtonEl
//	, list2El
	;

	@UiField
	AcceptCancelPanel saveMapViewPanel;
	@UiField
	MapEditorForm mapEditor;

	Button saveMapButton, deleteMapButton;

	private GMap gmap1;

	private AutoComplete mapsAC;

	// private ActionNotificator<Void> saveMapActionNotificator, deleteMapActionNotificator;
	//
	// private ActionNotificator<String> selectMapActionNotificator;

	public MyMaps1() {
		super(AppController.getInstance().getY());
		AppController.getInstance().getUserState().addListener(this);
	}

	// public MyMaps1(YuiContext y) {
	// super(y);
	// AppController.getInstance().getUserState().addListener(this);
	// // saveMapActionNotificator = new ActionNotificator<Void>();
	// // deleteMapActionNotificator = new ActionNotificator<Void>();
	// // selectMapActionNotificator = new ActionNotificator<String>();
	// // Window.alert(saveMapButtonEl.getClassName());
	// }

	// @Override
	// public Widget asWidget() {
	// // TODO Auto-generated method stub
	// return super.asWidget();
	// }
	@Override
	public void yuiBinded() {
		
		
//		initMap();
		saveMapButton = yuiBinder.getWidget(saveMapButtonEl).cast();
		saveMapButton.on("click", new EventCallback<ButtonEvent>() {
			@Override
			public void call(ButtonEvent e) {

				MyMapsPresenter pp = (MyMapsPresenter) presenter;
				pp.doEditMapView(0); // .saveMapView()
				// saveMapActionNotificator.notifyAction(null);
				// presenter.getc
				// presenter.saveMapView();

				// doEditMapView(null);

				// AppController.getInstance().getRouter().s

				// MyMapsPresenterConfig pconfig = (MyMapsPresenterConfig) presenter.getConfig();
				// pconfig.setAction(MyMapsPresenterConfig.ACTION_EDIT);
				// pconfig.setTargetMapViewId(0);
				// presenter.updateView();
			}
		});

		deleteMapButton = yuiBinder.getWidget(deleteMapButtonEl).cast();
		deleteMapButton.on("click", new EventCallback<ButtonEvent>() {
			@Override
			public void call(ButtonEvent e) {
				presenter.deleteMapView();
				// deleteMapActionNotificator.notifyAction(null);
			}
		});

		List<MapView> mapsViewCollection = AppController.getInstance().getUserState().getModel().getMapViews();
		JsArray<JavaScriptObject> acSource = ModelUtil.toJSO(mapsViewCollection);

		mapsAC = yuiBinder.getWidget(mapsACEl).cast();
		mapsAC.source(acSource);
		mapsAC.resultTextLocator("name");

		mapsAC.on(AutoComplete.EVENT_SELECT, new EventCallback<AutoCompleteEvent>() {
			@Override
			public void call(AutoCompleteEvent e) {
				JsObject obj = e.result().rawObj();
				// String name = obj.objGetString("name");
				String id = obj.objGetString("id");
				presenter.selectMapView(id);
				// selectMapActionNotificator.notifyAction(id);
			}
		});
		// Window.alert(mapsViewCollection.size() + "");
		// y.one(myMapViewsSelectEl).text(ClientContext.getInstance().getUserState().getModel()
		// .getMapViews().size()+" getMapViews().size()");

//		String[] months = new String[] { "Januar", "Februar", "March", "April", "May", "June", "July", "August",
//				"September", "October", "November", "December" };
//		ITSASelectlist selectlist = YGAL().newITSASelectlist(ITSASelectlistConfig.create().items(months));
//		selectlist.on(ITSASelectlist.EVENT_SELECTCHANGE, new EventCallback<ITSASelectlistEvent>() {
//			@Override
//			public void call(ITSASelectlistEvent e) {
//				// console.log("selected item index "+e.index()+" - value: "+e.value());
//			}
//		});
//		selectlist.render(y.one(myMapViewsSelectEl));
		
		
		
		//other list test
		
//		ACSVSelectList.Namer<MapView> list2Namer = new ACSVSelectList.Namer<MapView>() {
//			@Override
//			public String getName(MapView t) {
//				return t.getName();
//			}
//		}; 		
//		ACSVSelectList.Renderer<MapView> list2Renderer = new ACSVSelectList.Renderer<MapView>() {
//			@Override
//			public void render(MapView t, Node parent) {
//				parent.append("<li>"+t.getName()+"</li>"); 
//			}			
//		};
//		List<MapView> mvlist = AppController.getInstance().getUserState().getModel().getMapViews(); 
//		ACSVSelectList<MapView> list = new ACSVSelectList<MapView>(y, mvlist, list2Namer, 
//				list2Renderer, null); 
//		list.render(y.one(list2El)); 

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
		return new Element[] { saveMapButtonEl, deleteMapButtonEl, mapsACEl
		// , panel1El
		};
	}

	// UserState change listener stuff

	@Override
	public void mapViewsChanged() {
		
		List<MapView> mapsViewCollection = AppController.getInstance().getUserState().getModel().getMapViews();
		JsArray<JavaScriptObject> acSource = ModelUtil.toJSO(mapsViewCollection);
		
//		String s = ""; 
//		for(MapView m : mapsViewCollection) {
//			s+=", "+m.getName(); 
//		}
//		System.out.println(s);
		mapsAC.set("source", acSource); 
		
		
//		String text = AppController.getInstance().getUserState().getModel().getMapViews().size()
//				+ " getMapViews().size()";
//		y.one(myMapViewsSelectEl).empty().text(text);
	}

	// uibinder factory methods

	/**
	 * Will be used for creating MapEditor instances of this UIBinder widget.
	 * 
	 * @return a new MapEditor
	 */
	@UiFactory
	MapEditorForm makeMapEditorForm() {
		return new MapEditorForm(y);
	}
	@UiFactory
	MapEditorVisual makeMapEditorVisual() {
		return new MapEditorVisual(y);
	}
	/**
	 * Will be used for creating AcceptCancelPanel instances of this UIBinder widget.
	 * 
	 * @return a new AcceptCancelPanel
	 */
	@UiFactory
	AcceptCancelPanel makeAcceptCancelPanel() {
		return new AcceptCancelPanel(y);
	}

	// @Override
	// public void doEditMapView(long id) {
	//
	// }

	@Override
	public MNEditor<MapView> getMapViewEditor() {
		return mapEditor;
	}

	// @Override
	// public ActionNotificator getSaveMapActionNotificator() {
	// return saveMapActionNotificator;
	// }
	// @Override
	// public ActionNotificator<String> getSelectMapActionNotificator() {
	// return selectMapActionNotificator;
	// }
	// @Override
	// public ActionNotificator getDeleteMapActionNotificator() {
	// return deleteMapActionNotificator;
	// }
	//
	// public AcceptCancelPanel getSaveMapViewPanel() {
	// return saveMapViewPanel;
	// }

	// public void doShowSaveMapView(
	// final ActionListener acceptListener, final ActionListener cancelListener
	// ) {

	@Override
	public void undoEditMapView() {
		saveMapViewPanel.getYUIPanel().hide();
	}
	
	@Override
	public void doEditMapView(MapView mv) {
		if (mv == null) {
			mv = new MapView();
			mv.setName("Enter a name for this map view");
			mv.setDescription("Enter a description for this map view");
			mv.setLatitude(gmap1.getMapImpl().getCenter().getLatitude());
			mv.setLongitude(gmap1.getMapImpl().getCenter().getLongitude());
		}
		// else {
		mapEditor.load(mv);
		// }
		saveMapViewPanel.getYUIPanel().show();

		saveMapViewPanel.setListener(new AcceptCancelPanelListener() {

			@Override
			public void cancel() {
				saveMapViewPanel.getYUIPanel().hide();
				MyMapsPresenterConfig config = (MyMapsPresenterConfig) presenter.getConfig();
				config.setAction(null); 
				AppController.getInstance().getUseCaseHome().updateCurrentUseCase(); //.getRouter().push(u)
				
			}

			@Override
			public void accept() {
				// MapView mapview = mapEditor.flush();
				// ClientContext.getInstance().getPresenterfaFactory()
				// .newMyMapsPresenter().saveMapView();
				saveMapViewPanel.getYUIPanel().hide();
				// acceptListener.notifyAction(null);

				presenter.saveMapView();
			}
		});
	}

	MyMapsPresenter presenter = null;

	private boolean viewReady = false;

	@Override
	public Presenter getPresenter() {
		return presenter;
	}

	@Override
	public void setPresenter(Presenter p) {
		if (p instanceof MyMapsPresenter1)
			presenter = (MyMapsPresenter) p;
		else if (p != null) {
			p.dispatchDevelError("MyMaps1 view requires MyMapsPresenter1 presenter. ");
		}
	}

	// map code - TODO move this to MapUtil ?

//	private void initMap() {
//
//		// Coordinates coords = result.getCoordinates();
//		// col1.append("Geo location supported, you are at latitude: " + coords.getLatitude() + ", longitude: " + coords.getLongitude());
//		// vp.add(new HTML("Geo location supported, you are at latitude: " + coords.getLatitude() + ", longitude: " + coords.getLongitude()));
//		// showMap(coords);
//
//		// geop
//		LatLng center = LatLng.newInstance(9.837900929149729, 8.85351657867432);
//		MapOptions opts = MapOptions.newInstance();
//		// opts.setMapTypeControl(false);
//		// opts.setMapTypeId(MapTypeId.ROADMAP);
//		opts.setZoom(10);
//		opts.setCenter(center);
////		opts.setMapTypeId(MapTypeId.ROADMAP);
//		// opts.setMapMaker(false);
//		// opts.setMapTypeControl(false);
//		// opts.setDisableDefaultUi(true);
//		// opts.setZoomControl(false);
//		// opts.setPanControl(false);
//		// opts.setScaleControl(false);
////		 opts.setStreetViewControl(true);
//
//		// final MapWidget mapWidget = new MapWidget(opts);
//		// col1.add(mapWidget);
//
//		// getConsole().log(y.dump(opts));
//		// Node map1El = col2.appendChild("<div></div>");
//
//		// mapContainerNode = y.one(mapContainerEl);
//		// mapContainerNode.setStyles(Style.create().width("200px").height("200px").border("4px solid brown"));
//
//		gmap1 = new GMap(mapContainerEl, opts);
//		// map1 = createMap(map1El, opts);
//		// mapWidget.setSize("750px", "500px");
//
//		gmap1.getMapImpl().addClickHandler(new ClickMapHandler() {
//
//			@Override
//			public void onEvent(ClickMapEvent event) {
//				gmapClicked(event);
//
//			}
//		});
//
//		if (readyListener != null && !viewReady)
//			readyListener.ready(this);
//		viewReady = true;
//		// gmap1Initialized=true;
//
//	}

//	protected void gmapClicked(ClickMapEvent event) {
//		Window.alert("zoom: " + gmap1.getOptions().getZoom() + ", LatLng: " + gmap1.getOptions().getCenter() + " - "
//				+ gmap1.getMapImpl().getCenter());
//
//		// MarkerOptions markerOpts = MarkerOptions.newInstance();
//		// marker
//
//		MarkerOptions opts = MarkerOptions.newInstance();
//		opts.setClickable(true);
//		opts.setDraggable(true);
//		Marker marker1 = Marker.newInstance(opts);// event.getMouseEvent().getLatLng(), markerOpts);
//		marker1.addClickHandler(new ClickMapHandler() {
//			@Override
//			public void onEvent(ClickMapEvent event) {
//				// Marker m = event.getSource().cast();
//				Window.alert("marker clicked: " + event.getSource());
//			}
//		});

		// LatLng clickLocation = event.getMouseEvent().getLatLng();
		// PlaceSearchRequest req = PlaceSearchRequest.newInstance();
		// req.setLocation(clickLocation);
		// req.setRaidus(50000);
		// req.setTypes(PlaceSearchTypes.embassy);
		//
		// PlacesService placeService = gmap1.newPlacesService(); //PlacesService.newInstance(ma);
		// placeService.search(req, new PlaceSearchHandler() {
		// @Override
		// public void onCallback(JsArray<PlaceResult> results, PlacesServiceStatus status) {
		// Window.alert("embassies found in the area : " + results.length());
		// for (int i = 0; i < results.length(); i++) {
		// PlaceResult result = results.get(i);
		// }
		// }
		// });
//	}

	MNViewReadyListener readyListener = null;

	@Override
	public void addReadyListener(MNViewReadyListener l) {
		readyListener = l;
		if (viewReady)
			l.ready(this);
	}

	// public MapEditor getMapEditor() {
	// return mapEditor;
	// }
	// public Button getSaveMapButton() {
	//
	// }
}
