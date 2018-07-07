package org.sgx.yuigwt.yuigallery.tokenInput;

import org.sgx.yuigwt.yui.node.Node;
import org.sgx.yuigwt.yui.yui.PluginBaseConfig;

import com.google.gwt.core.client.JavaScriptObject;
import com.google.gwt.core.client.JsArray;
/**
 * @see http://rgrove.github.com/node-tokeninput/api/Plugin.TokenInput.html
 * @author sg
 *
 */
public class TokenInputPluginConfig extends PluginBaseConfig {
protected TokenInputPluginConfig(){}

public static native final TokenInputPluginConfig create()/*-{
	return {}; 
}-*/;

/**
 * Reference to the bounding box node. 
 * @return
 */
public native final Node boundingBox() /*-{
return this.boundingBox; 
}-*/;

/**
 * Reference to the bounding box node. 
 * @param val
 * @return this - for setter chaining
 */
public native final TokenInputPluginConfig boundingBox(Node val) /*-{
this.boundingBox = val; 
return this; 
}-*/;
/**
 * Reference to the content box node. 
 * @return
 */
public native final Node contentBox() /*-{
return this.contentBox; 
}-*/;

/**
 * Reference to the content box node. 
 * @param val
 * @return this - for setter chaining
 */
public native final TokenInputPluginConfig contentBox(Node val) /*-{
this.contentBox = val; 
return this; 
}-*/;

/**
 * Token delimiter string. May be a single character or multiple characters. User input will be split on this string as the user types, and the delimited values will be turned into tokens. 
 * @return
 */
public native final String delimiter() /*-{
return this.delimiter; 
}-*/;

/**
 * Token delimiter string. May be a single character or multiple characters. User input will be split on this string as the user types, and the delimited values will be turned into tokens. 
 * @param val
 * @return this - for setter chaining
 */
public native final TokenInputPluginConfig delimiter(String val) /*-{
this.delimiter = val; 
return this; 
}-*/;

/**
 * 

If true, the CSS class name yui3-tokeninput-fauxinput will be applied to the bounding box. When using the Sam skin, this will cause the TokenInput's styling to mimic a real input field.

Note that this styling may not look entirely faithful to native control styling on all browsers and platforms.

 * @return
 */
public native final boolean fauxInput() /*-{
return this.fauxInput; 
}-*/;

/**
 * 

If true, the CSS class name yui3-tokeninput-fauxinput will be applied to the bounding box. When using the Sam skin, this will cause the TokenInput's styling to mimic a real input field.

Note that this styling may not look entirely faithful to native control styling on all browsers and platforms.

 * @param val
 * @return this - for setter chaining
 */
public native final TokenInputPluginConfig fauxInput(boolean val) /*-{
this.fauxInput = val; 
return this; 
}-*/;

/**
 * 
Reference to the token input node. This is the visible input node the user can type in to add tokens.

 * @return
 */
public native final Node inputNode() /*-{
return this.inputNode; 
}-*/;

/**
 * 
Reference to the token input node. This is the visible input node the user can type in to add tokens.

 * @param val
 * @return this - for setter chaining
 */
public native final TokenInputPluginConfig inputNode(Node val) /*-{
this.inputNode = val; 
return this; 
}-*/;

/**
 * Reference to the token list node. 
 * @return
 */
public native final Node listNode() /*-{
return this.listNode; 
}-*/;

/**
 * Reference to the token list node. 
 * @param val
 * @return this - for setter chaining
 */
public native final TokenInputPluginConfig listNode(Node val) /*-{
this.listNode = val; 
return this; 
}-*/;

/**
 * 
If true, each token will have a remove button (in the form of a small "x") which, when clicked, will remove the token.
Default Value: true for mobile devices, false elsewhere. 
 * @return
 */
public native final boolean removeButton() /*-{
return this.removeButton; 
}-*/;

/**
 * 
If true, each token will have a remove button (in the form of a small "x") which, when clicked, will remove the token.
Default Value: true for mobile devices, false elsewhere. 
 * @param val
 * @return this - for setter chaining
 */
public native final TokenInputPluginConfig removeButton(boolean val) /*-{
this.removeButton = val; 
return this; 
}-*/;

/**
 * 
If true, any text the user has entered in the token input field will be tokenized when the input field loses focus.
Default Value: true 
 * @return
 */
public native final boolean tokenizeOnBlur() /*-{
return this.tokenizeOnBlur; 
}-*/;

/**
 * 
If true, any text the user has entered in the token input field will be tokenized when the input field loses focus.
Default Value: true 
 * @param val
 * @return this - for setter chaining
 */
public native final TokenInputPluginConfig tokenizeOnBlur(boolean val) /*-{
this.tokenizeOnBlur = val; 
return this; 
}-*/;

/**
 * 
If true, any text the user has entered in the token input field will be tokenized when the user presses the enter key while the input field has focus.
Default Value: true 
 * @return
 */
public native final boolean tokenizeOnEnter() /*-{
return this.tokenizeOnEnter; 
}-*/;

/**
 * 
If true, any text the user has entered in the token input field will be tokenized when the user presses the enter key while the input field has focus.
Default Value: true 
 * @param val
 * @return this - for setter chaining
 */
public native final TokenInputPluginConfig tokenizeOnEnter(boolean val) /*-{
this.tokenizeOnEnter = val; 
return this; 
}-*/;

/**
 * Current tokens.
 * @return
 */
public native final JsArray tokens() /*-{
return this.tokens; 
}-*/;

/**
 * Current tokens.
 * @param val
 * @return this - for setter chaining
 */
public native final TokenInputPluginConfig tokens(JsArray val) /*-{
this.tokens = val; 
return this; 
}-*/;
}
