package org.sgx.madrenecesidad.client.usecase;

import org.sgx.madrenecesidad.client.presenter.Presenter;
import org.sgx.madrenecesidad.client.presenter.PresenterConfig;
import org.sgx.madrenecesidad.client.ui.MNView;

import com.google.gwt.dom.client.Element;
import com.google.gwt.user.client.ui.Panel;

/**
 * An UseCase is the union of a Presenter, a View and a PresenterConfig objects. It is then fully defined and implemented use case ready to be perform()
 * 
 * @author sg
 * 
 */
public interface UseCase {
	String getName(); 
	Presenter getPresenter();
	void setPresenter(Presenter presenter);
	MNView getView();
	void setView(MNView view);
	PresenterConfig getPresenterConfig();
	void setPresenterConfig(PresenterConfig presenterConfig);
	void install(Panel useCaseParentEl);
	void uninstall(Panel useCaseParentEl);
}
