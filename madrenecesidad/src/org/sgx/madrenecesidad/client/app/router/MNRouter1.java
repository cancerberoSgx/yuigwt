//package org.sgx.madrenecesidad.client.app.router;
//
//import org.sgx.madrenecesidad.client.MNConstants;
//import org.sgx.madrenecesidad.client.app.AppController;
//import org.sgx.madrenecesidad.client.presenter.mymaps.MyMapsPresenter;
//import org.sgx.madrenecesidad.client.presenter.mymaps.MyMapsPresenterConfig;
//import org.sgx.madrenecesidad.client.usecase.UseCase;
//import org.sgx.madrenecesidad.client.util.MNUtil;
//import org.sgx.yuigwt.yui.router.Route;
//import org.sgx.yuigwt.yui.router.RouteCallback;
//import org.sgx.yuigwt.yui.router.RouteRequest;
//import org.sgx.yuigwt.yui.router.RouteResponse;
//import org.sgx.yuigwt.yui.router.Router;
//import org.sgx.yuigwt.yui.router.RouterConfig;
//import org.sgx.yuigwt.yui.util.SimpleCallback;
//import org.sgx.yuigwt.yui.util.Util;
//
//import com.google.gwt.core.client.JsArray;
//import com.google.gwt.user.client.Window;
//
///**
// * an impl based on Y.Route
// * 
// * @author sg
// * 
// */
//public class MNRouter1 implements MNRouter {
////	private MNAction[] actions;
////	private LWMap<String, PresenterConfig> actions;
////	private LWMap<String, PresenterConfig> actionsByUrl;
////	private LWMap<String, Router> routers;
//	Router router; 
//	
//	protected MNRouter1() {
//		
////		actions = MNAction.values();
////		routers = LWMap.<String, Router>create();
////		actions = LWMap.<String, PresenterConfig>create();
////		actionsByUrl = LWMap.<String, PresenterConfig>create(); 
//		initRouter(); 
//	}
//
//	private void initRouter() {
////		for(MNAction a : MNAction.values()) {
////			actions.put(a.getName(), a); 
////			actionsByUrl.put(a.getUrl(), a);
////		}
////		router.match("").get(0).save(); 
//		AppController ctx = AppController.getInstance();
//		RouterConfig rconfig = RouterConfig.create().html5(false);
////		rconfig.s
//		if(MNConstants.develmode) {
//			rconfig.root("/index.jsp?gwt.codesvr=127.0.0.1:9997");
//		}
////		else {			
////		}
//		router = ctx.getY().newRouter(rconfig);
////		router.on(Router., c)
//		String mvRouteStr = MNUtil.fixRouteUrl("/"+MNConstants.USECASE_MAPVIEW+"/:targetMapViewId/:action"); 
//
////		mvRouteStr = "/index.jsp?gwt.codesvr=127.0.0.1:9997"+mvRouteStr; 
//				
//		router.route(mvRouteStr, new RouteCallback() {			
//			@Override
//			public void call(RouteRequest req, RouteResponse res, SimpleCallback next) {
//				String targetMapViewId = req.params().objGetString("targetMapViewId");
//				String action = req.params().objGetString("action"); 
//				Window.alert("targetMapViewId: "+targetMapViewId+", action: "+action);
//				
//				MyMapsPresenterConfig config = new MyMapsPresenterConfig(); 
//				config.setTargetMapViewId(MNUtil.parseLong(targetMapViewId, 0)); 
//				config.setAction(action);
//				MyMapsPresenter presenter = (MyMapsPresenter) AppController.getInstance()
//					.getUseCaseHome().getUseCaseNamed(MNConstants.USECASE_MAPVIEW).getPresenter();
//				presenter.setConfig(config); 
//				presenter.updateView(); 
//			}
//		}); 
////		}
//	}
//
//	@Override
//	public void saveUrl(String url) {
//		router.save(url); 
//	}
//
//	@Override
//	public void dispatchCurrentUrl() {
////		JsArray<Route> match = router.match(Util.getCurrentAddressUrl());
////		if(match!=null&&match.length()>0) {
//		
//		System.out.println(router.get("root")+" - "+router.routes().get(0).path()+" - "+
//				Util.getCurrentAddressUrl()+" - "+
//				router.hasRoute(Util.getCurrentAddressUrl()));
//		if(router.hasRoute(Util.getCurrentAddressUrl())) {
//			router.dispatch(); 
//		}
//		else {
//			String useCaseName = MNConstants.USECASE_DEFAULT;
//			AppController.getInstance().performUseCaseNamed(useCaseName); 
//		}
//	}
//
////	private UseCase getUseCase(String usecaseDefault) {
////		// TODO Auto-generated method stub
////		return null;
////	}
//
//
////	public void registerRoute(PresenterConfig a) {
////		actions.put(a.getName(), a); 
//////		actionsByUrl.put(a.getUrl(), a);
////	}
////
////	@Override
////	public UseCase createUseCaseFromUrl(String url) {
////		// TODO Auto-generated method stub
////		return null;
////	}	
////	@Override
////	public void perform(String actionName) {
////		if(actionName==null)
////			return;
//////		Router r = routers.get(actionName);
//////		if(r==null) {
//////			//TODO: log error
//////			return;
//////		}		
////		MNAction a = actions.get(actionName);
////		if(a==null) {
////			//TODO: log error
////			return;
////		}
//////		router.save(a.getUrl());
////	}
////	@Override
////	public void createActionFromUrl(String actionName) {
////		// TODO Auto-generated method stub
////		
////	}
//	
//}
