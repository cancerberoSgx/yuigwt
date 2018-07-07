package org.sgx.yuigwt.yui.widget.ext;

import org.sgx.yuigwt.yui.widget.WidgetClass;

/**
 * overlay static properties of all the YUI classes implemented in WidgetExt
 * @author sg
 *
 */
public class WidgetExtClass extends WidgetClass {
protected WidgetExtClass(){}


//WidgetPositionAlign
/**
 * Constant used to specify the bottom edge, center point for alignment
 * @return
 */
public native final String BC() /*-{
return this.BC; 
}-*/;

/**
 * Constant used to specify the bottom-left corner for alignment
 * @return
 */
public native final String BL() /*-{
return this.BL; 
}-*/;

/**
 * Constant used to specify the bottom-right corner for alignment
 * @return
 */
public native final String BR() /*-{
return this.BR; 
}-*/;

/**
 * Constant used to specify the center of widget/node/viewport for alignment
 * @return
 */
public native final String CC() /*-{
return this.CC; 
}-*/;

/**
 * Constant used to specify the left edge, center point for alignment
 * @return
 */
public native final String RC() /*-{
return this.RC; 
}-*/;

/**
 * Constant used to specify the top edge-center point for alignment
 * @return
 */
public native final String TC() /*-{
return this.TC; 
}-*/;


/**
 * Constant used to specify the top-left corner for alignment
 * @return
 */
public native final String TL() /*-{
return this.TL; 
}-*/;

/**
 * Constant used to specify the top-right corner for alignment
 * @return
 */
public native final String TR() /*-{
return this.TR; 
}-*/;






//WidgetStdMod 


/**
 * Inserts new content before the sections existing content. 
 * @return
 */
public native final String AFTER()/*-{
return this.AFTER; 
}-*/;
/**
 * Inserts new content before the sections existing content. 
 * @return
 */
public native final String BEFORE()/*-{
return this.BEFORE; 
}-*/;
/**
 * Constant used to refer the the standard module body, in methods which expect a section specifier
 * @return
 */
public native final String BODY()/*-{
return this.BODY; 
}-*/;
public native final String HEADER()/*-{
return this.HEADER; 
}-*/;
public native final String FOOTER()/*-{
return this.FOOTER; 
}-*/;


//public native final String AFTER()/*-{
//	return this.AFTER; 
//}-*/;
//public native final String BEFORE()/*-{
//return this.BEFORE; 
//}-*/;
}
