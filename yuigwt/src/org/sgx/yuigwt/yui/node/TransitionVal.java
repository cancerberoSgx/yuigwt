package org.sgx.yuigwt.yui.node;

import org.sgx.yuigwt.yui.util.JsObject;

public class TransitionVal extends JsObject {
protected TransitionVal(){}
/**
 * sg
 * @return
 */
public static final native TransitionVal create()/*-{
return {}; 
}-*/;
/**
 * sg
 * @return
 */
public static final native TransitionVal create(double value)/*-{
return {"value": value}; 
}-*/;
/**
 * sg
 * @return
 */
public static final native TransitionVal create(String value)/*-{
return {"value": value}; 
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
public native final TransitionVal easing(String val) /*-{
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
public native final TransitionVal duration(double val) /*-{
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
public native final TransitionVal delay(double val) /*-{
this.delay = val; 
return this; 
}-*/;

/**
 * 
 * @param val
 * @return this - for setter chaining
 */
public native final TransitionVal value(double val) /*-{
this.delay = val; 
return this; 
}-*/;
/**
 * 
 * @param val
 * @return this - for setter chaining
 */
public native final TransitionVal value(String val) /*-{
this.delay = val; 
return this; 
}-*/;
}
