package org.sgx.madrenecesidad.client.trash.test;

import com.google.gwt.user.server.rpc.RemoteServiceServlet;
/**
 * Use this tool only for testing never for production !
 * @author sg
 *
 */
public class WaitUtil {	
	
//	public static void _waitUntil(WaitUntilFlag f) {
//		while(f.isOn()) {			
//			sleep(500); 
//		}
//	}
	
//	public static native final void _waitUntil(WaitUntilFlag f)/*-{
//	(function(){
//		var condition = f.@org.sgx.madrenecesidad.client.test.WaitUtil.WaitUntilFlag::isOn(); 
//		if (!condition){
//	    	setTimeout(arguments.callee, 100      );
//	    }
//	})(); 
//	}-*/;


	public static final native void sleep(int milliseconds)/*-{
 		var start = new Date().getTime();
		  for (var i = 0; i < 1e7; i++) {
		    if ((new Date().getTime() - start) > milliseconds){
		      break;
		    }
		  }
	}-*/;


	
	
//	public static class WaitUntilFlag {
//		boolean on; 
//		public WaitUntilFlag() {
//			on=true; 
//		}
//		public void setFlag() {
//			this.on = true;
//		}
//		public boolean isOn() {
//			return on;
//		}
//		public void setOn(boolean on) {
//			this.on = on;
//		}
//		public void turnOff() {
//			setOn(false); 
//		}
//	}	
	
//	RemoteServiceServlet service; 	
//	public RPCSync(RemoteServiceServlet service) {
//		this.service = service; 
//	}
	
}
