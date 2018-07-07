package org.sgx.madrenecesidad.client.ui.mymaps;

import org.sgx.madrenecesidad.client.model.MapView;
import org.sgx.madrenecesidad.client.ui.MNView;
import org.sgx.madrenecesidad.client.ui.editor.MNEditor;
import org.sgx.madrenecesidad.client.ui.misc.AcceptCancelPanel;

public interface MyMaps extends MNView {
	
	MNEditor<MapView> getMapViewEditor();

	void doEditMapView(MapView mv);

	void undoEditMapView(); 
	
//	AcceptCancelPanel getSaveMapViewPanel() ;

//	/**
//	 * notify mapview selection by mapview id. 
//	 * @return
//	 */
//	ActionNotificator<String> getSelectMapActionNotificator(); 
//	ActionNotificator<Void> getSaveMapActionNotificator();
//
//	ActionNotificator<Void> getDeleteMapActionNotificator();
}
