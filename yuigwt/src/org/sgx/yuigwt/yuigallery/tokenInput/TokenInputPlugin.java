package org.sgx.yuigwt.yuigallery.tokenInput;

import org.sgx.yuigwt.yui.node.Node;
import org.sgx.yuigwt.yui.node.NodeBase;
import org.sgx.yuigwt.yui.yui.PluginBase;

import com.google.gwt.core.client.JsArray;
import com.google.gwt.core.client.JsArrayString;

/**
 * Node plugin that turns a text input field into a tokenized input field similar to Cocoa's NSTokenField control. 
 * http://rgrove.github.com/node-tokeninput/api/Plugin.TokenInput.html
 * @author sg
 *
 */
public class TokenInputPlugin extends PluginBase {
protected TokenInputPlugin(){}

/**
 * Adds one or more tokens at the specified index, or at the end of the token list if no index is specified. 
 * @param tokens Token string or array of token strings.
 * @return self for method chaining
 */
public native final TokenInputPlugin add(String tokens) /*-{
this.add(tokens); 
return this; 
}-*/;

/**
 * Adds one or more tokens at the specified index, or at the end of the token list if no index is specified. 
 * @param tokens Token string or array of token strings.
 * @return self for method chaining
 */
public native final TokenInputPlugin add(String []tokens) /*-{
this.add(@org.sgx.yuigwt.yui.util.JsUtil::toJsArrayString([Ljava/lang/String;)(tokens)); 
return this; 
}-*/;

/**
 * Adds one or more tokens at the specified index, or at the end of the token list if no index is specified. 
 * @param tokens Token string or array of token strings.
 * @return self for method chaining
 */
public native final TokenInputPlugin add(JsArrayString tokens) /*-{
this.add(tokens); 
return this; 
}-*/;
/**
 * Adds one or more tokens at the specified index, or at the end of the token list if no index is specified. 
 * @param tokens Token string or array of token strings.
 * @parma index 0-based index at which to add the token.
 * @return self for method chaining
 */
public native final TokenInputPlugin add(String tokens, int index) /*-{
this.add(tokens, index); 
return this; 
}-*/;
/**
 * Adds one or more tokens at the specified index, or at the end of the token list if no index is specified. 
 * @param tokens Token string or array of token strings.
 * @parma index 0-based index at which to add the token.
 * @return self for method chaining
 */
public native final TokenInputPlugin add(JsArrayString []tokens, int index) /*-{
this.add(@org.sgx.yuigwt.yui.util.JsUtil::toJsArrayString([Ljava/lang/String;)(tokens), index); 
return this; 
}-*/;
/**
 * Adds one or more tokens at the specified index, or at the end of the token list if no index is specified. 
 * @param tokens Token string or array of token strings.
 * @parma index 0-based index at which to add the token.
 * @return self for method chaining
 */
public native final TokenInputPlugin add(JsArrayString tokens, int index) /*-{
this.add(tokens, index); 
return this; 
}-*/;
/**
 * Removes all tokens. 
 * @return
 */
public native final TokenInputPlugin clear() /*-{
this.clear(); 
return this; 
}-*/;
/**
 * Removes the token at the specified index. 
 * @þaram index  0-based index of the token to remove.
 * @return
 */
public native final TokenInputPlugin remove(int index) /*-{
this.remove(index); 
return this; 
}-*/;




//attributes
/**
 * Reference to the bounding box node. 
 * @return the attribute
 */
public final native Node boundingBox()/*-{
return this.get("boundingBox");
}-*/;

/**
 * Reference to the bounding box node. 
 * @param val
 * @return self for method chaining
 */
public final native TokenInputPlugin boundingBox(Node val)/*-{
this.set("boundingBox", val);
return this; 
}-*/;

/**
 * Reference to the content box node
 * @return
 */
public native final Node contentBox() /*-{
return this.contentBox; 
}-*/;

/**
 * Reference to the content box node
 * @param val
 * @return this - for setter chaining
 */
public native final TokenInputPlugin contentBox(Node val) /*-{
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
public native final TokenInputPlugin delimiter(String val) /*-{
this.delimiter = val; 
return this; 
}-*/;

/**
 * If true, the CSS class name yui3-tokeninput-fauxinput will be applied to the bounding box. When using the Sam skin, this will cause the TokenInput's styling to mimic a real input field.Note that this styling may not look entirely faithful to native control styling on all browsers and platforms.efault Value: false
 * @return the attribute
 */
public final native boolean fauxInput()/*-{
return this.get("fauxInput");
}-*/;

/**
 * If true, the CSS class name yui3-tokeninput-fauxinput will be applied to the bounding box. When using the Sam skin, this will cause the TokenInput's styling to mimic a real input field.Note that this styling may not look entirely faithful to native control styling on all browsers and platforms.efault Value: false 
 * @param val
 * @return self for method chaining
 */
public final native TokenInputPlugin fauxInput(boolean val)/*-{
this.set("fauxInput", val);
return this; 
}-*/;
 
/**
 * Reference to the token input node. This is the visible input node the user can type in to add tokens. 
 * @return the attribute
 */
public final native Node inputNode()/*-{
return this.get("inputNode");
}-*/;

/**
 * Reference to the token input node. This is the visible input node the user can type in to add tokens. 
 * @param val
 * @return self for method chaining
 */
public final native TokenInputPlugin inputNode(Node val)/*-{
this.set("inputNode", val);
return this; 
}-*/;

/**
 * Reference to the token list node.
 * @return the attribute
 */
public final native Node listNode()/*-{
return this.get("listNode");
}-*/;

/**
 * Reference to the token list node.
 * @param val
 * @return self for method chaining
 */
public final native TokenInputPlugin listNode(Node val)/*-{
this.set("listNode", val);
return this; 
}-*/;

/**
If true, each token will have a remove button (in the form of a small "x") which, when clicked, will remove the token.
Default Value: true for mobile devices, false elsewhere. 
 * 
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
public native final TokenInputPlugin removeButton(boolean val) /*-{
this.removeButton = val; 
return this; 
}-*/;

/**
If true, any text the user has entered in the token input field will be tokenized when the input field loses focus.
Default Value: true 
 * 
 * @return the attribute
 */
public final native boolean tokenizeOnBlur()/*-{
return this.get("tokenizeOnBlur");
}-*/;

/**
 * 
If true, any text the user has entered in the token input field will be tokenized when the input field loses focus.
Default Value: true 
 * @param val
 * @return self for method chaining
 */
public final native TokenInputPlugin tokenizeOnBlur(boolean val)/*-{
this.set("tokenizeOnBlur", val);
return this; 
}-*/;

/**
 * Current tokens. 
 * @return the attribute
 */
public final native JsArrayString tokens()/*-{
return this.get("tokens");
}-*/;

/**
 * Current tokens. 
 * @param val
 * @return self for method chaining
 */
public final native TokenInputPlugin tokens(JsArrayString val)/*-{
this.set("tokens", val);
return this; 
}-*/;

//public final native TokenInputPlugin tokens(String[] val)/*-{
//this.set("tokens", @org.sgx.yuigwt.yui.util.JsUtil::toJsArrayString([Ljava/lang/String;)(val));
//return this; 
//}-*/;
public final native TokenInputPlugin tokens(String...val)/*-{
this.set("tokens", @org.sgx.yuigwt.yui.util.JsUtil::toJsArrayString([Ljava/lang/String;)(val));
return this; 
}-*/;
}
