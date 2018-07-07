package org.sgx.yuigwt.yui.util;
/**
 * sometimes java classes callbacks are not sufficient for representing a javascript function (for example in the Y.JSON.parse() with a reviver function). 
 * With this class is it possible to define javascript functions natively in javascript inline in java code like this: 
 * <pre>
JsFunction reviver2 = new JsFunctionBuilder() {	
	public native final JsFunction buildFunction()/*-{
		return function(k, v) {
			if(k=="miscellaneous" && v>500)
				return 999999; 
			else
				return v; 
		}
	}-* /;
}.buildFunction();
JsObject obj2 = Y.JSON().parse(jsonStr2, reviver2).cast();		
</pre>
 * @author sg
 *
 */
public interface JsFunctionBuilder {
JsFunction buildFunction(); 
}
