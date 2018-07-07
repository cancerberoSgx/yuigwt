package org.sgx.yuigwt.yui.stylesheet;

import org.sgx.yuigwt.yui.util.Style;

import com.google.gwt.core.client.JavaScriptObject;
import com.google.gwt.core.client.JsArrayString;
/**
 * <p>The StyleSheet module normalizes the dynamic creation and modification of CSS stylesheets on a page. This makes it easy to manage the development, storage, and reapplication of personalized user stylesheets. Because it targets styles at the CSS level, it also allows you to modify styles applied to a CSS pseudo-element such as p::first-letter, or pseudo-class such as a:hover.</p>
 * <p>StyleSheet is capable of creating new stylesheets from scratch or modifying existing stylesheets held as properties of <link> or <style> elements. It should be noted that not all browsers support reading or modifying external stylesheets from other domains.</p>
 * 
 * @see http://yuilibrary.com/yui/docs/stylesheet/
 * @see http://yuilibrary.com/yui/docs/api/classes/StyleSheet.html
 * @author sg
 *
 */
public class StyleSheet extends JavaScriptObject {
protected StyleSheet(){}

/**
 * Disable all the rules in the sheet. Rules may be changed while the StyleSheet is disabled.
 * @return self for method chaining
 */
public native final StyleSheet disable() /*-{
this.disable(); 
return this; 
}-*/;

/**
 * Enable all the rules in the sheet
 * @return self for method chaining
 */
public native final StyleSheet enable() /*-{
this.enable(); 
return this; 
}-*/;
/**
 * @param sel Selector string 
 * @return the current cssText for a rule or the entire sheet. If the selector param is supplied, only the cssText for that rule will be returned, if found. If the selector string targets multiple selectors separated by commas, the cssText of the first rule only will be returned. If no selector string, the stylesheet's full cssText will be returned.
 */
public native final String getCssText(String sel) /*-{
return this.getCssText(sel);
}-*/;

/**
 * Get the unique stamp for this StyleSheet instance
 * @param sel
 * @return
 */
public native final int getId() /*-{
return this.getId();
}-*/;
/** 
 * @return false if the StyleSheet is disabled. Otherwise true.
 */
public native final boolean isEnabled() /*-{
return this.isEnabled();
}-*/;
/**
 * Set style properties for a provided selector string. If the selector includes commas, it will be split into individual selectors and applied accordingly. If the selector string does not have a corresponding rule in the sheet, it will be added. The object properties in the second parameter must be the JavaScript names of style properties. E.g. fontSize rather than font-size. The float style property will be set by any of "float", "styleFloat", or "cssFloat".
 * @param sel the selector string to apply the changes to
 * @param css Object literal of style properties and new values
 * @return
 */
public native final StyleSheet set(String sel, JavaScriptObject css) /*-{
this.set(sel, css);
return this; 
}-*/;
/**
 * Set style properties for a provided selector string. If the selector includes commas, it will be split into individual selectors and applied accordingly. If the selector string does not have a corresponding rule in the sheet, it will be added. The object properties in the second parameter must be the JavaScript names of style properties. E.g. fontSize rather than font-size. The float style property will be set by any of "float", "styleFloat", or "cssFloat".
 * @param sel the selector string to apply the changes to
 * @param css Object literal of style properties and new values
 * @return
 */
public native final StyleSheet set(String sel, Style css) /*-{
this.set(sel, css);
return this; 
}-*/;
/**
 *Unset style properties for a provided selector string, removing their effect from the style cascade.
<br/><br/>
If the selector includes commas, it will be split into individual selectors and applied accordingly. If there are no properties remaining in the rule after unsetting, the rule is removed.
<br/><br/>
The style property or properties in the second parameter must be the JavaScript style property names. E.g. fontSize rather than font-size.
<br/><br/>
The float style property will be unset by any of "float", "styleFloat", or "cssFloat".

 * @param sel the selector string to apply the changes to
 * @param css style property name or Array of names
 * @return
 */
public native final StyleSheet unset(String sel, String css) /*-{
this.unset(sel, css);
return this; 
}-*/;
/**
 *Unset style properties for a provided selector string, removing their effect from the style cascade.
<br/><br/>
If the selector includes commas, it will be split into individual selectors and applied accordingly. If there are no properties remaining in the rule after unsetting, the rule is removed.
<br/><br/>
The style property or properties in the second parameter must be the JavaScript style property names. E.g. fontSize rather than font-size.
<br/><br/>
The float style property will be unset by any of "float", "styleFloat", or "cssFloat".

 * @param sel the selector string to apply the changes to
 * @param css style property name or Array of names
 * @return
 */
public native final StyleSheet unset(String sel, String[] css) /*-{
this.unset(sel, @org.sgx.yuigwt.yui.util.JsUtil::toJsArrayString([Ljava/lang/String;)(css));
return this; 
}-*/;
/**
 *Unset style properties for a provided selector string, removing their effect from the style cascade.
<br/><br/>
If the selector includes commas, it will be split into individual selectors and applied accordingly. If there are no properties remaining in the rule after unsetting, the rule is removed.
<br/><br/>
The style property or properties in the second parameter must be the JavaScript style property names. E.g. fontSize rather than font-size.
<br/><br/>
The float style property will be unset by any of "float", "styleFloat", or "cssFloat".

 * @param sel the selector string to apply the changes to
 * @param css style property name or Array of names
 * @return
 */
public native final StyleSheet unset(String sel, JsArrayString css) /*-{
this.unset(sel, css);
return this; 
}-*/;

}
