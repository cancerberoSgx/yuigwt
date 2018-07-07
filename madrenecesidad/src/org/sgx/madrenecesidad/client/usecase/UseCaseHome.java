package org.sgx.madrenecesidad.client.usecase;

import java.util.HashMap;
import java.util.Map;

import org.sgx.madrenecesidad.client.MNConstants;
import org.sgx.madrenecesidad.client.app.AppController;
import org.sgx.madrenecesidad.client.presenter.mymaps.MyMapsPresenterConfig;
import org.sgx.madrenecesidad.client.usecase.mymaps.MyMapsUseCase;

public class UseCaseHome {

	private Map<String, UseCase> useCases;
	UseCase currentUseCase;

	public UseCaseHome() {
		useCases = new HashMap<String, UseCase>();
		currentUseCase = null;
		init();
	}

	public UseCase getUseCaseNamed(String name) {
		return useCases.get(name);
	}

	public UseCase getDefaultUseCase() {
		UseCase uc = useCases.get(MNConstants.USECASE_DEFAULT);
		MyMapsPresenterConfig config = (MyMapsPresenterConfig) uc.getPresenterConfig();
		config.setAction(null);
		config.setTargetMapViewId(0);
		return uc;
	}

	private void init() {
		useCases.put(MNConstants.USECASE_MAPVIEW, new MyMapsUseCase());
	}

	public UseCase getCurrentUseCase() {
		return currentUseCase;
	}

	public void setCurrentUseCase(UseCase currentUseCase) {
		this.currentUseCase = currentUseCase;
	}

	public void updateCurrentUseCase() {
		if (currentUseCase == null)
			return;
		AppController.getInstance().getRouter().push(currentUseCase);
		currentUseCase.getPresenter().updateView();
	}

}
