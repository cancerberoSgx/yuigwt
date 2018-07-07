package org.sgx.madrenecesidad.client.presenter.mymaps;

import org.sgx.madrenecesidad.client.model.MapView;
import org.sgx.madrenecesidad.client.presenter.Presenter;

public interface MyMapsPresenter extends Presenter {
	void saveMapView();
	void selectMapView(String mapViewId);
	void deleteMapView();
	void doEditMapView(long mapViewId);
}
