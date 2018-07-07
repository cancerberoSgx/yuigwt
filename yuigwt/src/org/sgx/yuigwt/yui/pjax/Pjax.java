package org.sgx.yuigwt.yui.pjax;

public class Pjax extends PjaxBase{
protected Pjax(){}

/**
 * Extracts and returns the relevant HTML content from an Ajax response. The content is extracted using the contentSelector attribute as a CSS selector. If contentSelector is null, the entire response will be returned.
 * @param responseText Raw Ajax response text.
 * @return Content object
 */
public native final PjaxContent getContent(String responseText) /*-{
return this.getContent(responseText); 
}-*/;


}
