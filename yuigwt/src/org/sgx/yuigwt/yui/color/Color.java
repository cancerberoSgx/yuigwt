package org.sgx.yuigwt.yui.color;

import com.google.gwt.core.client.JavaScriptObject;
import com.google.gwt.core.client.JsArrayMixed;
import com.google.gwt.core.client.JsArrayString;
/**
 * This class contains methods for all color module classes like Color.Base, Color.Harmony, etc
 * @see http://stage.yuilibrary.com/yui/docs/color/
 * 
 * TODO: not finished - wait for more elaborated yuidocs. 
 * 
 * @author sg
 *
 */
public class Color extends JavaScriptObject{
protected Color(){}


//Color.Base

/**
 * 
 * @param str - a color string
 * @param to - can be one of "hex", "rgb", "rgba", "hsl", "hsv"
 * @return
 */
public native final String convert(String str, String to)/*-{
	return this.convert(str, to); 
}-*/;
 /**
  * Finds the value type based on the str value provided.
  * @param str
  * @return
  */
public native final String findType(String str)/*-{
return this.findType(str); 
}-*/;
/**
 * Converts the array of values to a string based on the provided template.
 * @param arr
 * @param template
 * @return
 */
public native final String fromArray(JsArrayString arr, String template)/*-{
return this.fromArray(arr, template); 
}-*/;
/**
 * Converts the array of values to a string based on the provided template.
 * @param arr
 * @param template
 * @return
 */
public native final String fromArray(String[] arr, String template)/*-{
return this.fromArray(@org.sgx.yuigwt.yui.util.JsUtil::toJsArrayString([Ljava/lang/String;)(arr), template); 
}-*/;

/**
 * Converts the provided color string to an array of values. Will return an empty array if the provided string is not able to be parsed.
 * @param s
 * @return
 */
public native final JsArrayString toArray(String s)/*-{
return this.toArray(s); 
}-*/;
}
