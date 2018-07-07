package org.sgx.madrenecesidad.client.app.router;

import org.sgx.madrenecesidad.client.MNConstants;
import org.sgx.madrenecesidad.client.app.AppController;
import org.sgx.madrenecesidad.client.presenter.PresenterConfig;
import org.sgx.madrenecesidad.client.presenter.mymaps.MyMapsPresenterConfig;
import org.sgx.madrenecesidad.client.usecase.UseCase;
import org.sgx.madrenecesidad.client.usecase.UseCaseHome;
import org.sgx.madrenecesidad.client.util.MNUtil;
import org.sgx.yuigwt.yui.YuiContext;
import org.sgx.yuigwt.yui.event.EventCallback;
import org.sgx.yuigwt.yui.history.HistoryBase;
import org.sgx.yuigwt.yui.history.HistoryEvent;
import org.sgx.yuigwt.yui.util.JsObject;
import org.sgx.yuigwt.yui.util.JsUtil;
import org.sgx.yuigwt.yui.util.Util;
/**
 * Based on Y:History
 * @author sg
 *
 */
public class MNRouter2 implements MNRouter {
	
	private static final String HISTORY_USECASE = "usecase";
	private static final String HISTORY_ACTION = "action", HISTORY_TARGET_ID="targetId";
	private HistoryBase history;
	private YuiContext Y;
	
	public MNRouter2(){
		Y = AppController.getInstance().getY();
//		Y.HistoryHash().hashPrefix("!"); 
		history = Y.newHistoryHash(); 
		history.after("change", new EventCallback<HistoryEvent>() {
			@Override
			public void call(HistoryEvent e) {
				System.out.println("HISTORY, src: "+e.src()+" - "+JsUtil.dumpObj(e.changed()));
//				String useCaseName = e.changed().objGetString(HISTORY_USECASE);
				if(e.src().equals("hash")) {
//					UseCase uc = getUseCaseFor(MNUtil.getCurrentAddressUrl()); 
//					if(uc!=null) {
					AppController.getInstance().performCurrentUrlUseCase(); 
//					}
				}
//				if(useCaseName==null)
//					return; 
			}
		}); 
	}

	@Override
	public void push(UseCase u) {
		
		JsObject state = JsObject.createObject().cast(); 
		
		state.objPut(HISTORY_USECASE, MNConstants.USECASE_MAPVIEW);
		PresenterConfig config = u.getPresenterConfig();
		
		if(config!=null){
			MyMapsPresenterConfig c = (MyMapsPresenterConfig) u.getPresenterConfig();
			state.objPut(HISTORY_ACTION, c.getAction());
			state.objPut(HISTORY_TARGET_ID, c.getTargetMapViewId());		
		}
		
		//TODO: others
		history.add(state); 
//		history.addValue("tab", "1"); 

//		System.out.println(state.objGetString(HISTORY_ACTION)+" - "+history.get(HISTORY_ACTION));
		
		
		
//		String url = _getUrlFor(u); 
		// TODO Auto-generated method stub
		
	}

//	private String _getUrlFor(UseCase u) {
//		if(u.getName().equals(MNConstants.USECASE_MAPVIEW)) {
//			return "MNConstants.USECASE_MAPVIEW"
//		}
//		// TODO Auto-generated method stub
//		return null;
//	}

	@Override
	public UseCase getUseCaseFor(String url) {
//		JsObject parsed2 = history.get().cast(); 
		JsObject parsed = history.get().cast(); //Y.HistoryHash().parseHash(url);
//		String s = JsUtil.dumpObj(parsed, true); 
//		System.out.println(s);
		UseCaseHome home = AppController.getInstance().getUseCaseHome();
		String usecaseName = parsed.objGetString(HISTORY_USECASE); 
		if(usecaseName == null)
			return null; 
		if(usecaseName.equals(MNConstants.USECASE_MAPVIEW)) {
			String action = parsed.objGetString(HISTORY_ACTION); 
			long targetIdStr = MNUtil.parseLong(parsed.objGetString(HISTORY_TARGET_ID), 0); 
			UseCase u = home.getUseCaseNamed(usecaseName);
			MyMapsPresenterConfig config = (MyMapsPresenterConfig) u.getPresenterConfig();
			if(action!=null) {
				config.setAction(action);
				config.setTargetMapViewId(targetIdStr); 
			}
			return u; 
		}
		else {
			return null;	
		}
	}


}
