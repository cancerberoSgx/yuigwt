package org.sgx.gwtjavatools.overlay.tmpl;

import java.io.InputStream;
import java.io.StringWriter;
import java.net.URL;

import org.apache.velocity.VelocityContext;
import org.apache.velocity.app.Velocity;
import org.sgx.gwtjavatools.overlay.model.JsTypes;
import org.sgx.gwtjavatools.overlay.model.JsValue;


public class OverlayRenderer {
	
//	private JsTypes typesUtil;
//
//	public OverlayRenderer(){
//		typesUtil = new JsTypes(); 
//	}
	
	
public void renderClass(JsValue jsonObjectIn, JavaClassInfo classInfo, 
		StringWriter out) throws Exception {
	
	if(!jsonObjectIn.getType().equals(JsTypes.TYPE_OBJECT))
		throw new Exception("renderClass must pass a js object. "); 
	
	 VelocityContext context = new VelocityContext();

     context.put("class", classInfo);
     context.put("val", jsonObjectIn);
     context.put("typesUtil",  JsTypes.getInstance());
    
     
     String tmplResourceName = "org/sgx/gwtjavatools/overlay/tmpl/tmpls/javaClass.tmpl"; 
     InputStream tmplis = OverlayRenderer.class.getClassLoader().getResourceAsStream(tmplResourceName); 
     Velocity.evaluate( context, out, "mystring", tmplis );
     System.out.println(" string : " + out );
}
}

