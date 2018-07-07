package org.sgx.madrenecesidad.client.presenter;

import org.sgx.madrenecesidad.client.ui.MNView;

/**
 * 
 * @author sg
 * 
 * @param <T>
 *            the type of the View associated with this presenter.
 */
public interface Presenter {
	/**
	 * loads a presenter configuration. The view / rendering must be consistent and possible updated with the given configuration
	 * 
	 * @param config
	 */
	void setConfig(PresenterConfig config);

	/**
	 * actors can get this presenter config, modify it and then call updateView() so the presenter updates de view to impact the given config. 
	 * @return
	 */
	PresenterConfig getConfig();
	
	/**
	 * updates the view according to the presenter's config. 
	 */
	void updateView(); 
	
	// void dispatchRPCFailure(Throwable caught, String msg);
	/**
	 * @return this Presenter's View
	 */
	MNView getView();

	void setView(MNView view);

	void dispatchDevelError(String msg);

	void dispatchUserError(String msg);

}
