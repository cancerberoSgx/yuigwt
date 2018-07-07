package org.sgx.madrenecesidad.client.presenter.mymaps;

import org.sgx.madrenecesidad.client.MNConstants;
import org.sgx.madrenecesidad.client.app.AppController;
import org.sgx.madrenecesidad.client.model.MapView;
import org.sgx.madrenecesidad.client.model.UserStateModel;
import org.sgx.madrenecesidad.client.presenter.AbstractPresenter;
import org.sgx.madrenecesidad.client.service.MNServiceFactory;
import org.sgx.madrenecesidad.client.ui.MNView;
import org.sgx.madrenecesidad.client.ui.MNViewReadyListener;
//import org.sgx.madrenecesidad.client.ui.editor.ActionListener;
import org.sgx.madrenecesidad.client.ui.mymaps.MyMaps;
import org.sgx.madrenecesidad.client.ui.mymaps.MyMaps1;
import org.sgx.madrenecesidad.client.usecase.UseCase;
import org.sgx.madrenecesidad.client.util.MNUtil;

import com.google.gwt.user.client.Window;
import com.google.gwt.user.client.rpc.AsyncCallback;

public class MyMapsPresenter1 extends AbstractPresenter implements MyMapsPresenter {

	// private IMyMaps view;
	private MapView selectedMapView;

	public MyMapsPresenter1() {
		// super((MNView) view);
		// view = new MyMaps1(ClientContext.getInstance().getY());
		// view.setPresenter(this);
		// view.getSaveMapActionNotificator().addActionListener(new ActionListener<Void>() {
		//
		// @Override
		// public void notifyAction(Void param) {
		// saveMapView();
		// }
		// });
		// view.getDeleteMapActionNotificator().addActionListener(new ActionListener<Void>() {
		// @Override
		// public void notifyAction(Void param) {
		// deleteMapView();
		// }
		// });
		// view.getSelectMapActionNotificator().addActionListener(new ActionListener<String>() {
		// @Override
		// public void notifyAction(String param) {
		// selectMapView(param);
		// }
		// });
	}

	public void selectMapView(String mapViewId) {
		UserStateModel userState = AppController.getInstance().getUserState().getModel();
		selectedMapView = userState.getById(mapViewId);
	}

	public void deleteMapView() {
		Window.alert("Are you sure you want to delete " + selectedMapView.getId());
	}

	// public void saveMapView(final MapView mv) {

	@Override
	public void doEditMapView(long mapViewId) {
		// String url = "/"+MNConstants.USECASE_MAPVIEW+"/"+mapViewId+"/"+MNConstants.ACTION_EDIT;
		// url = MNUtil.fixRouteUrl(url );
		// if(MNConstants.develmode) {
		// // url+="?gwt.codesvr=127.0.0.1:9997";
		// }
		// AppController.getInstance().getRouter().saveUrl(url);

		AppController app = AppController.getInstance();
		UseCase uc = app.getUseCaseHome().getUseCaseNamed(MNConstants.USECASE_MAPVIEW);
		MyMapsPresenterConfig presenterConfig = (MyMapsPresenterConfig) uc.getPresenterConfig();
		presenterConfig.setAction(MNConstants.ACTION_EDIT);
		presenterConfig.setTargetMapViewId(mapViewId);

		app.performUseCaseNamed(MNConstants.USECASE_MAPVIEW);

		// uc.p
		// AppController.getInstance().getRouter().push(uc);
		// uc.getPresenterConfig().set
	}

	@Override
	public void saveMapView() {
		final MapView mv = getMyMapsView().getMapViewEditor().flush();
//		System.out.println("SAVING mapview "+mv.getName());
		MNServiceFactory.getInstance().getMapViewService().add(mv, new AsyncCallback<Boolean>() {

			@Override
			public void onSuccess(Boolean result) {
				// Window.alert("mapview added: "+result);
				if (result) {
					AppController.getInstance().getUserState().getModel().getMapViews().add(mv);
					AppController.getInstance().getUserState().notifyModelChange(); 
				} else {
					dispatchNonSuccessfullOp("Save Map View", "Map view cannot be saved. Are your registered?");
				}
			}

			@Override
			public void onFailure(Throwable caught) {
				dispatchRPCFailure(caught, "Controller1 saveMapView");
			}
		});
	}

	private MyMaps getMyMapsView() {
		return (MyMaps) getView();
	}

	@Override
	public void updateView() {
		// final MyMaps mmview = (MyMaps)getView();
		getView().addReadyListener(new MNViewReadyListener() {

			@Override
			public void ready(MNView mmview) {
				MyMapsPresenterConfig c = (MyMapsPresenterConfig) getConfig();
				if (c != null && c.getAction() != null && 
						c.getAction().equals(MNConstants.ACTION_EDIT)) {

					if (c.getTargetMapViewId() == 0)
						((MyMaps) mmview).doEditMapView(null);
					else {
						// TODO
					}
				}
				else {
					((MyMaps) mmview).undoEditMapView();
				}
			}
		});
		// AppController.getInstance().getRouter().saveUrl(url)

	}
}
