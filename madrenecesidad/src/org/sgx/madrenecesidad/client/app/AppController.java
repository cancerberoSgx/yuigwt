package org.sgx.madrenecesidad.client.app;

import org.sgx.madrenecesidad.client.MNConstants;
import org.sgx.madrenecesidad.client.UserInfo;
import org.sgx.madrenecesidad.client.app.router.MNRouter;
import org.sgx.madrenecesidad.client.app.state.UserState;
import org.sgx.madrenecesidad.client.ui.main.MainLayout;
import org.sgx.madrenecesidad.client.ui.main.MainLayout1;
import org.sgx.madrenecesidad.client.usecase.UseCase;
import org.sgx.madrenecesidad.client.usecase.UseCaseHome;
import org.sgx.yuigwt.yui.YuiContext;
import org.sgx.yuigwt.yui.node.Node;

import com.google.gwt.user.client.ui.HTMLPanel;
import com.google.gwt.user.client.ui.Panel;

/**
 * This is a singleton root object from wich we can access all the services and information related to the client. It contains all the necessary information for the UI, Controller,
 * etc like current user, mainLayout UI, current UIUtil instance, YUIContext instance, presenters, views, to work with it, state, router etc.
 * 
 * It is also responsible of starting all the services, initialization and linking components with eachother.
 * 
 * @author sg
 * 
 */
public class AppController {
	private static AppController instance = null;//new AppController();

	private AppController() {
		super();
	}

	public static AppController getInstance() {
		if(instance==null)
			instance = new AppController(); 
		return instance;
	}

	private UserInfo user;

	private YuiContext y;
	private MNRouter router;
	private UserState userState;
	private UseCaseHome useCaseHome;

	private MainLayout mainLayout;

//	private UseCase currentUseCase;

	/**
	 * Renders the main layout but any use case yet
	 */
	public void renderMainLayout() {
		YuiContext Y = getY();
		Node parent = Y.one("body");
		parent.addClass("yui3-skin-sam");
		// create a GWT Widget Panel that wraps our yui widget parent.
		HTMLPanel gwtParent = parent.asHTMLPanel();

		MainLayout1 ml = new MainLayout1(Y);
		gwtParent.add(ml);

		this.setMainLayout(ml);
	}

	public void performCurrentUrlUseCase() {
		String currentUrl = AppControllerUtil.getCurrentUrl();
		UseCase useCase = router.getUseCaseFor(currentUrl);
		if(useCase==null) {
			useCase = getUseCaseHome().getDefaultUseCase(); //.getUseCaseNamed(MNConstants.USECASE_DEFAULT); 
		}

		if (useCase != null) {
			Panel useCaseContainer = getMainLayout().getUseCaseContainer();
			useCase.install(useCaseContainer);
		}
	}

	public UserInfo getUser() {
		return user;
	}

	public void setUser(UserInfo user) {
		this.user = user;
	}

	public YuiContext getY() {
		return y;
	}

	public void setY(YuiContext y) {
		this.y = y;
	}

	public MNRouter getRouter() {
		return router;
	}

	public void setRouter(MNRouter router) {
		this.router = router;
	}

	public static void setInstance(AppController instance) {
		AppController.instance = instance;
	}

	public UseCaseHome getUseCaseHome() {
		return useCaseHome;
	}

	public void setUseCaseHome(UseCaseHome useCaseHome) {
		this.useCaseHome = useCaseHome;
	}

	public UserState getUserState() {
		return userState;
	}

	public void setUserState(UserState userState) {
		this.userState = userState;
	}

	public void setMainLayout(MainLayout ml) {
		this.mainLayout = ml;
	}

	public MainLayout getMainLayout() {
		return mainLayout;
	}

	public void performUseCaseNamed(String useCaseName) {
		UseCase useCase = getUseCaseHome().getUseCaseNamed(useCaseName);

		if(useCaseName==null || useCase==null)
			return; 

		useCase.getPresenter().updateView();
		router.push(useCase); 
	
//		Panel useCaseContainer = getMainLayout().getUseCaseContainer();
//		if(currentUseCase!=null)
//			currentUseCase.uninstall(useCaseContainer);
		
		// Element useCaseParentEl = getMainLayout().getUseCaseContainerEl();
//		useCaseContainer.clear(); //TODO: should not be here
//		useCase.install(useCaseContainer);		
//		currentUseCase = useCase; 
		// Window.alert(useCaseName+" - "+useCase);
	}

}
