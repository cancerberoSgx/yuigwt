package org.sgx.madrenecesidad.client.app;

import org.sgx.madrenecesidad.client.UserInfo;
import org.sgx.madrenecesidad.client.app.router.MNRouter;
import org.sgx.madrenecesidad.client.app.router.MNRouterFactory;
import org.sgx.madrenecesidad.client.app.state.UserState;
import org.sgx.madrenecesidad.client.model.UserStateModel;
import org.sgx.madrenecesidad.client.service.MNServiceFactory;
import org.sgx.madrenecesidad.client.service.UserServiceAsync;
import org.sgx.madrenecesidad.client.ui.main.MainLayout1;
import org.sgx.madrenecesidad.client.usecase.UseCaseHome;
import org.sgx.madrenecesidad.client.util.MNUtil;
import org.sgx.yuigwt.yui.YuiContext;
import org.sgx.yuigwt.yui.node.Node;
import org.sgx.yuigwt.yui.util.Util;

import com.google.gwt.user.client.Window;
import com.google.gwt.user.client.rpc.AsyncCallback;
import com.google.gwt.user.client.ui.HTMLPanel;
/**
 * 
 * @author sg
 *
 */
public class AppControllerUtil {

	public static void initApp(YuiContext Y, final AppControllerListener listener) {
		final AppController app = AppController.getInstance();

		app.setY(Y);

		UserInfo user = MNUtil.getUser();
		MNUtil.fixUserUrls(user);
		app.setUser(user);
		

		MNRouter router = MNRouterFactory.getInstance().getDefault();
		app.setRouter(router);
//		System.out.println("RouterInit : "+app.hashCode());

		// uictx.setController(PresenterFactory.getInstance().getDefault());

		UserServiceAsync userService = MNServiceFactory.getInstance().getUserService(); // GWT.create(UserService.class);
		userService.getUserState(new AsyncCallback<UserStateModel>() {
			@Override
			public void onSuccess(UserStateModel result) {
				AppController.getInstance().setUserState(new UserState(result));
				userStateLoaded(); 
				listener.ready(AppController.getInstance());
			}

			@Override
			public void onFailure(Throwable caught) {
//				AppController.getInstance().getPresenterfaFactory().newMyMapsPresenter().dispatchRPCFailure(caught, "userService.getUserState()");
				Window.alert( "ERROR: userService.getUserState()"); 
				caught.printStackTrace(); 
			}
		});

		
	}


	protected static void userStateLoaded() {
		final AppController app = AppController.getInstance();
		UseCaseHome useCaseHome = new UseCaseHome();
		app.setUseCaseHome(useCaseHome); 
		
	}


	public static String getCurrentUrl() {
		return MNUtil.getCurrentAddressUrl(); 
	}

	
}
