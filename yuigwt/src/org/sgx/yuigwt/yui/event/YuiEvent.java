package org.sgx.yuigwt.yui.event;

import com.google.gwt.core.client.JavaScriptObject;
/**
 * the EventTarget event object passed to the Node.on() handler... 
 * http://yuilibrary.com/yui/docs/event/#facade-properties. 
 * Also it can be use for creating an event object for simulate() - http://yuilibrary.com/yui/docs/event/simulate.html
 * @author sg
 *
 */
public class YuiEvent extends EventFacade {
protected YuiEvent(){}
public static native final YuiEvent create()/*-{
	return {}; 
}-*/;






///**
// * The name of the event. E.g. "click", "keyup", or "load". 
// * @return
// */
//public native final String getType()/*-{
//return this.type; 
//}-*/;
///**
// * The name of the event. E.g. "click", "keyup", or "load". 
// * @return
// */
//public native final String type()/*-{
//return this.type; 
//}-*/;
//public native final YuiEvent type(String type)/*-{
//	this.type=type; 
//	return this; 
//}-*/;



/**
 * Coordinates of the mouse event in relation to the entire screen (DOM-compliant browsers only). 
 * @return
 */
public native final double screenX() /*-{
return this.screenX; 
}-*/;

/**
 * Coordinates of the mouse event in relation to the entire screen (DOM-compliant browsers only). 
 * @param val
 * @return this - for setter chaining
 */
public native final YuiEvent screenX(double val) /*-{
this.screenX = val; 
return this; 
}-*/;

/**
 * Coordinates of the mouse event in relation to the entire screen (DOM-compliant browsers only). 
 * @return
 */
public native final double screenY() /*-{
return this.screenY; 
}-*/;

/**
 * Coordinates of the mouse event in relation to the entire screen (DOM-compliant browsers only). 
 * @param val
 * @return this - for setter chaining
 */
public native final YuiEvent screenY(double val) /*-{
this.screenY = val; 
return this; 
}-*/;


//keyboard 

/**The unicode value of a non-character key in a keypress event or any key in keydown or keyup */
public native final int getKeyCode()/*-{
return this.keyCode; 
}-*/;
/**The unicode value of a non-character key in a keypress event or any key in keydown or keyup */
public native final int keyCode()/*-{
return this.keyCode || -1; 
}-*/;
/**The unicode value of a non-character key in a keypress event or any key in keydown or keyup */
public native final YuiEvent keyCode(int code)/*-{
this.keyCode=code;
return this;  
}-*/;
/** The Unicode value of a character key pressed during a keypress event */
public native final int getCharCode()/*-{
return this.charCode; 
}-*/;
/** The Unicode value of a character key pressed during a keypress event */
public native final int charCode()/*-{
return this.charCode; 
}-*/;
/**true if the shift key was depressed during a key event. */
public native final boolean getShiftKey()/*-{
return this.shiftKey; 
}-*/;
/**true if the shift key was depressed during a key event. */
public native final boolean shiftKey()/*-{
return this.shiftKey; 
}-*/;
/**
 * true if the shift key was depressed during a key event.
 * @param val
 * @return this - for setter chaining
 */
public native final YuiEvent shiftKey(boolean val) /*-{
this.shiftKey = val; 
return this; 
}-*/;

/**true if the control key was depressed during a key event. */
public native final boolean getCtrlKey()/*-{
return this.ctrlKey; 
}-*/;
/**true if the control key was depressed during a key event. */
public native final boolean ctrlKey()/*-{
return this.ctrlKey; 
}-*/;
/**
 * true if the control key was depressed during a key event.
 * @param val
 * @return this - for setter chaining
 */
public native final YuiEvent ctrlKey(boolean val) /*-{
this.ctrlKey = val; 
return this; 
}-*/;
/**true if the alt/option key was depressed during a key event. */
public native final boolean getAltlKey()/*-{
return this.altKey; 
}-*/;
/**true if the alt/option key was depressed during a key event. */
public native final boolean altlKey()/*-{
return this.altKey; 
}-*/;
/**
 * true if the alt/option key was depressed during a key event.
 * @param val
 * @return this - for setter chaining
 */
public native final YuiEvent altlKey(boolean val) /*-{
this.altKey = val; 
return this; 
}-*/;
/**true if the "Windows" key on PCs or command key on Macs was depressed during a key event. */
public native final boolean getMetaKey()/*-{
return this.metaKey; 
}-*/;
/**true if the "Windows" key on PCs or command key on Macs was depressed during a key event. */
public native final boolean metaKey()/*-{
return this.metaKey; 
}-*/;
/**
 * true if the "Windows" key on PCs or command key on Mac key was depressed during a key event.
 * @param val
 * @return this - for setter chaining
 */
public native final YuiEvent metaKey(boolean val) /*-{
this.metaKey = val; 
return this; 
}-*/;



//mouse
/** For mouseup events (NOT click events), indicates which mouse button is pressed.
1 = left click, 2 = middle click, 3 = right click. */
public native final int getButton()/*-{
return this.button; 
}-*/;
/** For mouseup events (NOT click events), indicates which mouse button is pressed.
1 = left click, 2 = middle click, 3 = right click. */
public native final int button()/*-{
return this.button; 
}-*/;
/**
 * For mouseup events (NOT click events), indicates which mouse button is pressed.
1 = left click, 2 = middle click, 3 = right click.
 * @param val
 * @return this - for setter chaining
 */
public native final YuiEvent button(int val) /*-{
this.button = val; 
return this; 
}-*/;
/** alias for getButton() */
public native final int getWhich()/*-{
return this.which; 
}-*/;
/** alias for getButton() */
public native final int which()/*-{
return this.which; 
}-*/;

/** The horizontal coordinate of the event relative to whole document.  */
public native final double getPageX()/*-{
return this.pageX; 
}-*/;
/** The horizontal coordinate of the event relative to whole document.  */
public native final double pageX()/*-{
return this.pageX; 
}-*/;
/**The vertical coordinate of the event relative to whole document. */
public native final double getPageY()/*-{
return this.pageY; 
}-*/;
/**The vertical coordinate of the event relative to whole document. */
public native final double pageY()/*-{
return this.pageY; 
}-*/;
/**The horizontal coordinate of the event relative to viewport, regardless of scrolling. */
public native final double getClientX()/*-{
return this.clientX; 
}-*/;


///**
// * Coordinates of the mouse event in relation to the browser client area. 
// * @param val
// * @return this - for setter chaining
// */
//public native final YuiEvent clientX(double val) /*-{
//this.clientX = val; 
//return this; 
//}-*/;

/**
 * The vertical coordinate of the event relative to viewport, regardless of scrolling.
 * @return
 */
public native final double clientX() /*-{
return this.clientX; 
}-*/;

/**
 * The vertical coordinate of the event relative to viewport, regardless of scrolling.
 * @param val
 * @return this - for setter chaining
 */
public native final YuiEvent clientX(double val) /*-{
this.clientX = val; 
return this; 
}-*/;

///**The vertical coordinate of the event relative to viewport, regardless of scrolling. */
//public native final double clientY()/*-{
//return this.clientY; 
//}-*/;
/**
 * The vertical coordinate of the event relative to viewport, regardless of scrolling.
 * @return
 */
public native final double clientY() /*-{
return this.clientY; 
}-*/;

/**
 * The vertical coordinate of the event relative to viewport, regardless of scrolling.
 * @param val
 * @return this - for setter chaining
 */
public native final YuiEvent clientY(double val) /*-{
this.clientY = val; 
return this; 
}-*/;


/**For mousewheel or DOMMouseScroll events, the pixel distance of the scroll.  */
public native final double getWheelData()/*-{
return this.wheelDelta; 
}-*/;
/**For mousewheel or DOMMouseScroll events, the pixel distance of the scroll.  */
public native final double wheelData()/*-{
return this.wheelDelta; 
}-*/;
public native final Object getArgs()/*-{
	return this._args || null; 
}-*/;
public native final Object args()/*-{
return this._args || null; 
}-*/;

//TODO: touche and gesture
}
