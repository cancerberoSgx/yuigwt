package org.sgx.yuigwt.yui.stylesheet;

import org.sgx.yuigwt.yui.util.Style;

import com.google.gwt.core.client.JavaScriptObject;
/**
 * overlay for static Y.StyleSheet
 * @author sg
 *
 */
public class StyleSheetClass extends JavaScriptObject {
protected StyleSheetClass(){}

/**
 * @return if a selector string is safe to use. Used internally in set to prevent IE from locking up when attempting to add a rule for a "bad selector". Bad selectors are considered to be any string containing unescaped `~!@$%^&()+=|{}[];'"?< or space. Also forbidden are . or # followed by anything other than an alphanumeric. Additionally -abc or .-abc or #_abc or '# ' all fail. There are likely more failure cases, so please file a bug if you encounter one.
 */
public native final boolean isValidSelector(String sel) /*-{
return this.isValidSelector(sel);
}-*/;
/** Registers a StyleSheet instance in the static registry by the given name *  
 * @param name the name to assign the StyleSheet in the registry
 * @param sheet The StyleSheet instance
 * @return false if no name or sheet is not a StyleSheet instance. true otherwise. 
 */
public native final boolean register(String name, StyleSheet sheet) /*-{
return this.register(name, sheet);
}-*/;
/**
 * Converts an object literal of style properties and values into a string of css text. This can then be assigned to el.style.cssText.The optional second parameter is a cssText string representing the starting state of the style prior to alterations. This is most often extracted from the eventual target's current el.style.cssText.
 * @param css object literal of style properties and values
 * @param cssText (optional) starting cssText value
 * @return the resulting cssText string 
 */
public native final String toCssText(JavaScriptObject css, String cssText) /*-{
return this.toCssText(css, cssText);
}-*/;
/**
 * Converts an object literal of style properties and values into a string of css text. This can then be assigned to el.style.cssText.The optional second parameter is a cssText string representing the starting state of the style prior to alterations. This is most often extracted from the eventual target's current el.style.cssText.
 * @param css object literal of style properties and values
 * @param cssText (optional) starting cssText value
 * @return the resulting cssText string 
 */
public native final String toCssText(Style css, String cssText) /*-{
return this.toCssText(css, cssText);
}-*/;
}
