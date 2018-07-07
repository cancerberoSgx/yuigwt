package org.sgx.yuigwt.yuigallery;
import org.sgx.yuigwt.yuigallery.form.*; 
import org.sgx.yuigwt.yui.YuiContext;
import org.sgx.yuigwt.yui.attr.AttributeConfig;
import org.sgx.yuigwt.yui.util.Callback;
import org.sgx.yuigwt.yui.yui.PluginBase;
import org.sgx.yuigwt.yuigallery.accordion.Accordion;
import org.sgx.yuigwt.yuigallery.accordion.AccordionConfig;
import org.sgx.yuigwt.yuigallery.accordion.AccordionItem;
import org.sgx.yuigwt.yuigallery.accordion.AccordionItemConfig;
import org.sgx.yuigwt.yuigallery.colorpicker.ColorPicker;
import org.sgx.yuigwt.yuigallery.cssmatrix2d.CSSMatrix2d;
import org.sgx.yuigwt.yuigallery.deferred.DeferCallback;
import org.sgx.yuigwt.yuigallery.deferred.IoDeferred;
import org.sgx.yuigwt.yuigallery.deferred.Promise;
import org.sgx.yuigwt.yuigallery.form.FormClass;
import org.sgx.yuigwt.yuigallery.form.FormConfig;
import org.sgx.yuigwt.yuigallery.form.FormFieldClass;
import org.sgx.yuigwt.yuigallery.form.FormFieldConfig;
import org.sgx.yuigwt.yuigallery.imagecropper.ImageCropper;
import org.sgx.yuigwt.yuigallery.imagecropper.ImageCropperConfig;
import org.sgx.yuigwt.yuigallery.itsaselectlist.ITSASelectlist;
import org.sgx.yuigwt.yuigallery.itsaselectlist.ITSASelectlistConfig;
import org.sgx.yuigwt.yuigallery.yui3treeviewng.TreeViewConfig;
import org.sgx.yuigwt.yuigallery.yui_treeview.TreeLeafConfig;
import org.sgx.yuigwt.yuigallery.yui_treeview.TreeView;

import com.google.gwt.core.client.JavaScriptObject;
import com.google.gwt.core.client.JsArray;
/**
 * extends YuiContext to add YUI gallery components here and not in YuiContext. 
 * @see org.sgx.yuigwt.yuitest1.gallery.test.gal.AccordionTest1 for example usage
 * @author sg
 *
 */
public class YuiGalleryContext extends YuiContext {
protected YuiGalleryContext(){}

public native final GalleryPluginHome GalleryPlugin()/*-{
	return this.Plugin; 
}-*/;


//classes references

public native final FormFieldClass FormField()/*-{
	return this.FormField; 
}-*/;
//public native final FormFieldClass CheckboxField()/*-{
//return this.CheckboxField; 
//}-*/;
public native final FormClass Form()/*-{
return this.Form; 
}-*/;


//constructors

public native final Form newForm(FormConfig config)/*-{
return new this.Form(config); 
}-*/;
public native final Form newForm(JavaScriptObject config)/*-{
return new this.Form(config); 
}-*/;
public native final FormField newCheckboxField(FormFieldConfig config)/*-{
return new this.CheckboxField(config); 
}-*/;


public native final Accordion newAccordion(AccordionConfig config)/*-{
	return new this.Accordion(config); 
}-*/;
public native final Accordion newAccordion(AttributeConfig config)/*-{
return new this.Accordion(config); 
}-*/;
public native final AccordionItem newAccordionItem(AccordionItemConfig config)/*-{
	return new this.AccordionItem(config); 
}-*/;
public native final AccordionItem newAccordionItem(AttributeConfig config)/*-{
return new this.AccordionItem(config); 
}-*/;

public native final TreeView newTreeView(TreeLeafConfig config)/*-{
return new this.TreeView(config); 
}-*/;

public native final TreeView newTreeView(JavaScriptObject config)/*-{
return new this.TreeView(config); 
}-*/;
//public native final TreeView newTreeView(TreeLeafConfig [] config)/*-{
//return new this.TreeView(@org.sgx.yuigwt.yui.util.JsUtil::toJsArray([Lcom/google/gwt/core/client/JavaScriptObject;)(config)); 
//}-*/;
//public native final TreeView newTreeView(JavaScriptObject [] config)/*-{
//return new this.TreeView(@org.sgx.yuigwt.yui.util.JsUtil::toJsArray([Lcom/google/gwt/core/client/JavaScriptObject;)(config)); 
//}-*/;
//public native final TreeView newTreeView(JsArray<TreeLeafConfig> config)/*-{
//return new this.TreeView(config); 
//}-*/;


public native final CSSMatrix2d newCSSMatrix2d()/*-{
return new this.CSSMatrix2d(); 
}-*/;

public native final ImageCropper newImageCropper(ImageCropperConfig config)/*-{
return new this.ImageCropper(config); 
}-*/;
public native final ImageCropper newImageCropper(JavaScriptObject config)/*-{
return new this.ImageCropper(config); 
}-*/;


public native final ColorPicker newColorPicker(JavaScriptObject config)/*-{
return new this.ColorPicker(config); 
}-*/;
public native final ColorPicker newColorPicker()/*-{
return new this.ColorPicker(); 
}-*/;


//gallery-deferred - http://juandopazo.github.com/yui3-gallery/src/gallery-deferred/api/classes/YUI.html

/**
 * Waits for a series of asynchronous calls to be completed
 * @see http://juandopazo.github.com/yui3-gallery/src/gallery-deferred/api/classes/YUI.html
 * @return a promise 
 */
public native final Promise when(Callback ...callbacks)/*-{
return this.when.apply(this, @org.sgx.yuigwt.yui.util.JsUtil::toJsFunction([Lorg/sgx/yuigwt/yui/util/Callback;)(callbacks)); 
}-*/;
/**
 * Waits for a series of asynchronous calls to be completed
 * @see http://juandopazo.github.com/yui3-gallery/src/gallery-deferred/api/classes/YUI.html
 * @return a promise 
 */
public native final Promise when(Promise ...callbacks)/*-{
return this.when.apply(this, @org.sgx.yuigwt.yui.util.JsUtil::toJsArray([Lcom/google/gwt/core/client/JavaScriptObject;)(callbacks)); 
}-*/;
/**
 * Returns a promise for a (possibly) asynchronous call. Calls a given function that receives the new promise as parameter and must call resolve() or reject() at a certain point
 * @param c A function that encloses an async call.
 * @see http://juandopazo.github.com/yui3-gallery/src/gallery-deferred/api/classes/YUI.html
 * @return a promise 
 */
public final native Promise defer(DeferCallback c)/*-{
var f = $entry(function(p){
	c.@org.sgx.yuigwt.yuigallery.deferred.DeferCallback::call(Lorg/sgx/yuigwt/yuigallery/deferred/Promise;)(p);
}); 
return this.defer(f);
}-*/;
/**
 * @return Y.Node.Deferred plugin
 */
public native final PluginBase NodeDeferred()/*-{
return this.Node.Deferred; 
}-*/;
public native final IoDeferred ioDeferred()/*-{
return this.io;  
}-*/;


//ITSASelectlist
public native final ITSASelectlist newITSASelectlist(ITSASelectlistConfig config)/*-{
return new this.ITSASelectList(config); 
}-*/;


/**
 * gallery-datatable-col-resize - 
 * http://yuilibrary.com/gallery/show/datatable-col-resize - DatatableColResizePlugin
 * @return
 */
public native final PluginBase DatatableColResizePlugin()/*-{
return this.DatatableColResizePlugin; 
}-*/;

//yui3treeviewng

public native final org.sgx.yuigwt.yuigallery.yui3treeviewng.TreeView newTreeViewNg(TreeViewConfig config)/*-{
return new this.TreeView(config);  
}-*/;
public native final org.sgx.yuigwt.yuigallery.yui3treeviewng.TreeView newTreeViewNg(JavaScriptObject config)/*-{
return new this.TreeView(config);  
}-*/;

//bootstrap
//public native final PluginBase BootstrapDropdown()/*-{
//return new this.Bootstrap.Dropdown; 
//}-*/;

}
