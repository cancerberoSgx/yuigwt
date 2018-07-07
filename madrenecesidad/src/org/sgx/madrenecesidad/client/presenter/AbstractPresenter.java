package org.sgx.madrenecesidad.client.presenter;

import org.sgx.madrenecesidad.client.app.AppController;
import org.sgx.madrenecesidad.client.model.MapView;
import org.sgx.madrenecesidad.client.service.MNServiceFactory;
import org.sgx.madrenecesidad.client.service.MapViewService;
import org.sgx.madrenecesidad.client.service.MapViewServiceAsync;
import org.sgx.madrenecesidad.client.ui.MNView;

import com.google.gwt.core.client.GWT;
import com.google.gwt.user.client.Window;
import com.google.gwt.user.client.rpc.AsyncCallback;

/**
 * The controller is responsible of handling all remote operations but also at the visual level for alerting errors, etc to the user. The Widgets provide with the model classes
 * edited by the user to the controller and from there the controller perform the operation entirely. This is why controller operations do not throw exceptions.
 * 
 * The controller is also responsible of updating the ClientContext when operations that change relevant model are done.
 * 
 * @author sg
 * 
 */
public abstract class AbstractPresenter implements Presenter {
	// public Controller1
	// private MapViewServiceAsync mapViewService = GWT.create(MapViewService.class);

	MNView view;
	PresenterConfig config; 
//	protected  AbstractPresenter(MNView view) {
//		super();
//		this.view = view;
//	}

	
	public MNView getView() {
		return  view;
	}

	public PresenterConfig getConfig() {
		return config;
	}

	public void setConfig(PresenterConfig config) {
		this.config = config;
	}

	public void setView(MNView view) {
		this.view = view;
	}

	protected void dispatchNonSuccessfullOp(String actionName, String msg) {
		dispatchCommonError("Action '" + actionName + "' could not be done. Reason: " + msg);
	}

	// @Override
	public void dispatchRPCFailure(Throwable caught, String msg) {
		dispatchCommonError("Comunication with the server failed. \nError message was: " + msg);
	}
//
	private void dispatchCommonError(String string) {
		Window.alert(string);
	}
	
	public void dispatchDevelError(String msg) {
		dispatchCommonError(msg); 
	}
	
	public void dispatchUserError(String msg) {
		dispatchCommonError(msg); 
	}
	
	
}
