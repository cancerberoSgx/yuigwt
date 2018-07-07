package org.sgx.yuigwt.yui.node;

import org.sgx.yuigwt.yui.event.EventTargetConfig;

/**
 * A class for constructing transition instances. Adds the "transition" method to Node.
 * 
 * transition is not a class but a configuration object
 * @see http://yuilibrary.com/yui/docs/transition/ , http://yuilibrary.com/yui/docs/api/classes/TransitionVal.html
 * @author sg
 *
 * TODO: make string only setters like left, top, right have for all the other props.  
 */
public class Transition extends EventTargetConfig {
	public static final String EASING_EASE = "ease", 
			EASING_LINEAR="linear", 
			EASING_EASE_IN="ease-in", 
			EASING_EASE_OUT="ease-out",
			EASING_EASE_IN_OUT="ease-in-out";
protected Transition(){}



public static final native  Transition create()/*-{
return {}; 
}-*/;



/**
 * 
 * @return
 */
public native final String easing() /*-{
return this.easing; 
}-*/;

/**
 * 
 * @param val
 * @return this - for setter chaining
 */
public native final Transition easing(String val) /*-{
this.easing = val; 
return this; 
}-*/;

/**
 * 
 * @return
 */
public native final double duration() /*-{
return this.duration; 
}-*/;

/**
 * 
 * @param val
 * @return this - for setter chaining
 */
public native final Transition duration(double val) /*-{
this.duration = val; 
return this; 
}-*/;


/**
 * 
 * @return
 */
public native final double delay() /*-{
return this.delay; 
}-*/;

/**
 * 
 * @param val
 * @return this - for setter chaining
 */
public native final Transition delay(double val) /*-{
this.delay = val; 
return this; 
}-*/;


//css properties
public final native Transition backgroundRepeat(TransitionVal val)/*-{
this.backgroundRepeat = val; return this; 
}-*/;
public final native Transition font(TransitionVal val)/*-{
this.font = val; return this; 
}-*/;
public final native Transition width(TransitionVal val)/*-{
this.width = val; return this; 
}-*/;
public final native Transition width(String val)/*-{
this.width = {"value": val}; return this; 
}-*/;
public final native Transition letterSpacing(TransitionVal val)/*-{
this.letterSpacing = val; return this; 
}-*/;
public final native Transition marginTop(TransitionVal val)/*-{
this.marginTop = val; return this; 
}-*/;
public final native Transition paddingTop(TransitionVal val)/*-{
this.paddingTop = val; return this; 
}-*/;
public final native Transition listStylePosition(TransitionVal val)/*-{
this.listStylePosition = val; return this; 
}-*/;
public final native Transition paddingLeft(TransitionVal val)/*-{
this.paddingLeft = val; return this; 
}-*/;
public final native Transition fontSize(TransitionVal val)/*-{
this.fontSize = val; return this; 
}-*/;
public final native Transition fontSize(String val)/*-{
this.fontSize = {"value": val}; return this; 
}-*/;
public final native Transition borderBottom(TransitionVal val)/*-{
this.borderBottom = val; return this; 
}-*/;
public final native Transition display(TransitionVal val)/*-{
this.display = val; return this; 
}-*/;
public final native Transition backgroundImage(TransitionVal val)/*-{
this.backgroundImage = val; return this; 
}-*/;
public final native Transition borderWidth(TransitionVal val)/*-{
this.borderWidth = val; return this; 
}-*/;
public final native Transition borderLeftColor(TransitionVal val)/*-{
this.borderLeftColor = val; return this; 
}-*/;
public final native Transition overflow(TransitionVal val)/*-{
this.overflow = val; return this; 
}-*/;
public final native Transition borderTop(TransitionVal val)/*-{
this.borderTop = val; return this; 
}-*/;
public final native Transition fontWeight(TransitionVal val)/*-{
this.fontWeight = val; return this; 
}-*/;
public final native Transition filter(TransitionVal val)/*-{
this.filter = val; return this; 
}-*/;
public final native Transition listStyleType(TransitionVal val)/*-{
this.listStyleType = val; return this; 
}-*/;
public final native Transition borderLeftStyle(TransitionVal val)/*-{
this.borderLeftStyle = val; return this; 
}-*/;
public final native Transition borderTopStyle(TransitionVal val)/*-{
this.borderTopStyle = val; return this; 
}-*/;
public final native Transition visibility(TransitionVal val)/*-{
this.visibility = val; return this; 
}-*/;
public final native Transition backgroundColor(TransitionVal val)/*-{
this.backgroundColor = val; return this; 
}-*/;
public final native Transition marginLeft(TransitionVal val)/*-{
this.marginLeft = val; return this; 
}-*/;
public final native Transition borderBottomStyle(TransitionVal val)/*-{
this.borderBottomStyle = val; return this; 
}-*/;
public final native Transition lineHeight(TransitionVal val)/*-{
this.lineHeight = val; return this; 
}-*/;
public final native Transition cursor(TransitionVal val)/*-{
this.cursor = val; return this; 
}-*/;
public final native Transition borderLeft(TransitionVal val)/*-{
this.borderLeft = val; return this; 
}-*/;
public final native Transition padding(TransitionVal val)/*-{
this.padding = val; return this; 
}-*/;
public final native Transition backgroundAttachment(TransitionVal val)/*-{
this.backgroundAttachment = val; return this; 
}-*/;
public final native Transition fontVariant(TransitionVal val)/*-{
this.fontVariant = val; return this; 
}-*/;
public final native Transition textDecorationOverline(TransitionVal val)/*-{
this.textDecorationOverline = val; return this; 
}-*/;
public final native Transition textDecoration(TransitionVal val)/*-{
this.textDecoration = val; return this; 
}-*/;
public final native Transition height(TransitionVal val)/*-{
this.height = val; return this; 
}-*/;
public final native Transition height(String val)/*-{
this.height = {"value": val}; return this; 
}-*/;
public final native Transition border(TransitionVal val)/*-{
this.border = val; return this; 
}-*/;
public final native Transition margin(TransitionVal val)/*-{
this.margin = val; return this; 
}-*/;
public final native Transition textDecorationLineThrough(TransitionVal val)/*-{
this.textDecorationLineThrough = val; return this; 
}-*/;
public final native Transition marginRight(TransitionVal val)/*-{
this.marginRight = val; return this; 
}-*/;
public final native Transition textDecorationUnderline(TransitionVal val)/*-{
this.textDecorationUnderline = val; return this; 
}-*/;
public final native Transition clip(TransitionVal val)/*-{
this.clip = val; return this; 
}-*/;
public final native Transition listStyle(TransitionVal val)/*-{
this.listStyle = val; return this; 
}-*/;
public final native Transition paddingRight(TransitionVal val)/*-{
this.paddingRight = val; return this; 
}-*/;
public final native Transition pageBreakBefore(TransitionVal val)/*-{
this.pageBreakBefore = val; return this; 
}-*/;
public final native Transition borderTopColor(TransitionVal val)/*-{
this.borderTopColor = val; return this; 
}-*/;
public final native Transition background(TransitionVal val)/*-{
this.background = val; return this; 
}-*/;
public final native Transition color(TransitionVal val)/*-{
this.color = val; return this; 
}-*/;
public final native Transition styleFloat(TransitionVal val)/*-{
this.styleFloat = val; return this; 
}-*/;
public final native Transition marginBottom(TransitionVal val)/*-{
this.marginBottom = val; return this; 
}-*/;
public final native Transition listStyleImage(TransitionVal val)/*-{
this.listStyleImage = val; return this; 
}-*/;
public final native Transition pageBreakAfter(TransitionVal val)/*-{
this.pageBreakAfter = val; return this; 
}-*/;
public final native Transition textDecorationBlink(TransitionVal val)/*-{
this.textDecorationBlink = val; return this; 
}-*/;
public final native Transition borderBottomWidth(TransitionVal val)/*-{
this.borderBottomWidth = val; return this; 
}-*/;
public final native Transition borderStyle(TransitionVal val)/*-{
this.borderStyle = val; return this; 
}-*/;
public final native Transition zIndex(TransitionVal val)/*-{
this.zIndex = val; return this; 
}-*/;
public final native Transition borderBottomColor(TransitionVal val)/*-{
this.borderBottomColor = val; return this; 
}-*/;
public final native Transition borderColor(TransitionVal val)/*-{
this.borderColor = val; return this; 
}-*/;
public final native Transition position(TransitionVal val)/*-{
this.position = val; return this; 
}-*/;
public final native Transition verticalAlign(TransitionVal val)/*-{
this.verticalAlign = val; return this; 
}-*/;
public final native Transition textIndent(TransitionVal val)/*-{
this.textIndent = val; return this; 
}-*/;
public final native Transition backgroundPosition(TransitionVal val)/*-{
this.backgroundPosition = val; return this; 
}-*/;
public final native Transition clear(TransitionVal val)/*-{
this.clear = val; return this; 
}-*/;
public final native Transition borderTopWidth(TransitionVal val)/*-{
this.borderTopWidth = val; return this; 
}-*/;
public final native Transition paddingBottom(TransitionVal val)/*-{
this.paddingBottom = val; return this; 
}-*/;
public final native Transition top(TransitionVal val)/*-{
this.top = val; return this; 
}-*/;
public final native Transition top(String val)/*-{
this.top = {"value": val}; return this; 
}-*/;
public final native Transition textAlign(TransitionVal val)/*-{
this.textAlign = val; return this; 
}-*/;
public final native Transition left(TransitionVal val)/*-{
this.left = val; return this; 
}-*/;
public final native Transition left(String val)/*-{
this.left = {"value": val}; return this; 
}-*/;
public final native Transition fontFamily(TransitionVal val)/*-{
this.fontFamily = val; return this; 
}-*/;
public final native Transition borderLeftWidth(TransitionVal val)/*-{
this.borderLeftWidth = val; return this; 
}-*/;
public final native Transition textTransform(TransitionVal val)/*-{
this.textTransform = val; return this; 
}-*/;



}



