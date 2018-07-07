package org.sgx.madrenecesidad.client.app.router;

public class MNRouterFactory {
	
private static MNRouterFactory instance = new MNRouterFactory();

private MNRouterFactory() {
	super();
}
public static MNRouterFactory getInstance() {
	return instance;
}

private MNRouter defaultRouter=null;

public MNRouter getDefault() {
	if(defaultRouter==null) {
		defaultRouter = new MNRouter2(); //new MNRouter1(); 
//		initMNRouter(defaultRouter); 
	}
	return defaultRouter;
}
//private void initMNRouter(MNRouter r) {
//
//}
}
