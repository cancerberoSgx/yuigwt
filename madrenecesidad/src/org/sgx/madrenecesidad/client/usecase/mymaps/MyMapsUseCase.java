package org.sgx.madrenecesidad.client.usecase.mymaps;

import org.sgx.madrenecesidad.client.MNConstants;
import org.sgx.madrenecesidad.client.presenter.Presenter;
import org.sgx.madrenecesidad.client.presenter.mymaps.MyMapsPresenter1;
import org.sgx.madrenecesidad.client.presenter.mymaps.MyMapsPresenterConfig;
import org.sgx.madrenecesidad.client.ui.MNView;
import org.sgx.madrenecesidad.client.ui.mymaps.MyMaps1;
import org.sgx.madrenecesidad.client.usecase.AbstractUseCase;
import org.sgx.madrenecesidad.client.usecase.UseCase;

public class MyMapsUseCase extends AbstractUseCase {
	public MyMapsUseCase() {
		MyMapsPresenterConfig pc = new MyMapsPresenterConfig();
		this.setPresenterConfig(pc);
		Presenter p = new MyMapsPresenter1();
		p.setConfig(pc);
		MNView v = new MyMaps1();
		v.setPresenter(p);
		p.setView(v);
		this.setPresenter(p);
		this.setView(v);
	}

	@Override
	public String getName() {
		return MNConstants.USECASE_MAPVIEW;
	}

}
