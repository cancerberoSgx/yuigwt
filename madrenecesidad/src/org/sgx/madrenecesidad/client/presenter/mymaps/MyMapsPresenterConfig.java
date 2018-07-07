package org.sgx.madrenecesidad.client.presenter.mymaps;

import org.sgx.madrenecesidad.client.MNConstants;
import org.sgx.madrenecesidad.client.presenter.PresenterConfig;


public class MyMapsPresenterConfig implements PresenterConfig {

	String action; //showEditMapView; 
	long targetMapViewId; 
	
	@Override
	public String getName() {
		return MNConstants.USECASE_MAPVIEW;
	}

//	public boolean isShowEditMapView() {
//		return showEditMapView;
//	}
//
//	public void setShowEditMapView(boolean showEditMapView) {
//		this.showEditMapView = showEditMapView;
//	}

	public String getAction() {
		return action;
	}

	public void setAction(String action) {
		this.action = action;
	}

	public long getTargetMapViewId() {
		return targetMapViewId;
	}

	public void setTargetMapViewId(long targetMapViewId) {
		this.targetMapViewId = targetMapViewId;
	}

	
//	@Override
//	public void perform() {
//		
//	}

//	@Override
//	public String getUrl() {
//		// TODO Auto-generated method stub
//		return null;
//	}

}
