package org.sgx.madrenecesidad.client.usecase;

import org.sgx.madrenecesidad.client.app.AppController;
import org.sgx.madrenecesidad.client.presenter.Presenter;
import org.sgx.madrenecesidad.client.presenter.PresenterConfig;
import org.sgx.madrenecesidad.client.ui.MNView;

import com.google.gwt.user.client.ui.Panel;

public abstract class AbstractUseCase implements UseCase {
	Presenter presenter;
	MNView view;
	PresenterConfig presenterConfig;

	@Override
	public void install(Panel useCaseParent) {
		if(AppController.getInstance().getUseCaseHome().getCurrentUseCase()!=this)
			useCaseParent.add(view.asWidget()); 
		getPresenter().updateView(); 
		AppController.getInstance().getUseCaseHome().setCurrentUseCase(this); 
	}
	@Override
	public void uninstall(Panel useCaseParent) {
		useCaseParent.remove(view.asWidget());  		
	}
	public Presenter getPresenter() {
		return presenter;
	}

	public void setPresenter(Presenter presenter) {
		this.presenter = presenter;
	}

	public MNView getView() {
		return view;
	}

	public void setView(MNView view) {
		this.view = view;
	}

	public PresenterConfig getPresenterConfig() {
		return presenterConfig;
	}

	public void setPresenterConfig(PresenterConfig presenterConfig) {
		this.presenterConfig = presenterConfig;
	}

}
