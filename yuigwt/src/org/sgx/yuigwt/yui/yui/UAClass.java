package org.sgx.yuigwt.yui.yui;

import com.google.gwt.core.client.JavaScriptObject;
/**
 * YUI user agent detection. Do not fork for a browser if it can be avoided. Use feature detection when you can. Use the user agent as a last resort. For all fields listed as @type float, UAClass stores a version number for the browser engine, 0 otherwise. This value may or may not map to the version number of the browser using the engine. The value is presented as a float so that it can easily be used for boolean evaluation as well as for looking for a particular range of versions. Because of this, some of the granularity of the version info may be lost. The fields that are @type string default to null. The API docs list the values that these fields can have.
 * @see http://yuilibrary.com/yui/docs/api/classes/UAClass.html
 * @author sg
 *
 */
public class UAClass extends JavaScriptObject {
protected UAClass(){}
/**
 * Gecko engine revision number. Will evaluate to 1 if Gecko is detected but the revision could not be found. Other browsers will be 0. Example: 1.8
<br/>
Firefox 1.0.0.4: 1.7.8   <-- Reports 1.7<br/>
Firefox 1.5.0.9: 1.8.0.9 <-- 1.8<br/>
Firefox 2.0.0.3: 1.8.1.3 <-- 1.81<br/>
Firefox 3.0   <-- 1.9<br/>
Firefox 3.5   <-- 1.91<br/>

 * @return
 */
public native final double gecko() /*-{
return this.gecko; 
}-*/;

/**
 * Detects Kindle Silk Acceleration
 * @return
 */
public native final boolean accel() /*-{
return this.accel; 
}-*/;
/**
 * Adobe AIR version number or 0. Only populated if webkit is detected. Example: 1.0
 * @return
 */
public native final double air() /*-{
return this.air; 
}-*/;
/**
 * Detects Googles Android OS version
 * @return
 */
public native final double andriod() /*-{
return this.andriod; 
}-*/;
/**
 * Google Caja version number or 0.
 * @return
 */
public native final double caja() /*-{
return this.caja; 
}-*/;
/**
 * Chrome will be detected as webkit, but this property will also be populated with the Chrome version number
 * @return
 */
public native final double chrome() /*-{
return this.chrome; 
}-*/;
/**
 * Internet Explorer version number or 0. Example: 6
 * @return
 */
public native final double ie() /*-{
return this.ie; 
}-*/;
/**
 * General truthy check for iPad, iPhone or iPod
 * @return
 */
public native final boolean ios() /*-{
return this.ios||false; 
}-*/;
/**
 * Detects Apple iPad's OS version
 * @return
 */
public native final double ipad() /*-{
return this.ipad; 
}-*/;
/**
 * Detects Apple iPhone's OS version
 * @return
 */
public native final double iphone() /*-{
return this.iphone; 
}-*/;
/**
 * Detects Apples iPod's OS version
 * @return
 */
public native final double ipod() /*-{
return this.ipod; 
}-*/;

/**
 * Detects Apples iPod's OS version
 * @param val
 * @return this - for setter chaining
 */
public native final UAClass ipod(double val) /*-{
this.ipod = val; 
return this; 
}-*/;

/**
 * The mobile property will be set to a string containing any relevant user agent information when a modern mobile browser is detected. Currently limited to Safari on the iPhone/iPod Touch, Nokia N-series devices with the WebKit-based browser, and Opera Mini.Default: null
 * @return
 */
public native final String mobile() /*-{
return this.mobile; 
}-*/;
/**
 * The Nodejs Version
 * @return
 */
public native final double nodejs() /*-{
return this.nodejs; 
}-*/;
/**
 * Opera version number or 0. Example: 9.2
 * @return
 */
public native final double opera() /*-{
return this.opera; 
}-*/;
/**
 * The operating system. Currently only detecting windows or macintosh
 * @return
 */
public native final String os() /*-{
return this.os; 
}-*/;
/**
 * PhantomJS version number or 0. Only populated if webkit is detected. Example: 1.0
 * @return
 */
public native final double phantomjs() /*-{
return this.phantomjs; 
}-*/;
/**
 * Safari will be detected as webkit, but this property will also be populated with the Safari version number
 * @return
 */
public native final double safari() /*-{
return this.safari; 
}-*/;
/**
 * Set to true if the page appears to be in SSL
 * @return
 */
public native final boolean secure() /*-{
return this.secure; 
}-*/;
/**
 * Detects Kindle Silk
 * @return
 */
public native final double silk() /*-{
return this.silk; 
}-*/;
/**
 * The User Agent string that was parsed
 * @return
 */
public native final String userAgent() /*-{
return this.userAgent; 
}-*/;
/**
 * AppleWebKit version. KHTML browsers that are not WebKit browsers will evaluate to 1, other browsers 0. Example: 418.9<br/>

Safari 1.3.2 (312.6): 312.8.1 <-- Reports 312.8 -- currently the<br/>
                                  latest available for Mac OSX 10.3.<br/>
Safari 2.0.2:         416     <-- hasOwnProperty introduced<br/>
Safari 2.0.4:         418     <-- preventDefault fixed<br/>
Safari 2.0.4 (419.3): 418.9.1 <-- One version of Safari may run<br/>
                                  different versions of webkit<br/>
Safari 2.0.4 (419.3): 419     <-- Tiger installations that have been<br/>
                                  updated, but not updated<br/><br/>
                                  to the latest patch.<br/>
Webkit 212 nightly:   522+    <-- Safari 3.0 precursor (with native<br/>
SVG and many major issues fixed).<br/>
Safari 3.0.4 (523.12) 523.12  <-- First Tiger release - automatic<br/>
update from 2.x via the 10.4.11 OS patch.<br/>
Webkit nightly 1/2008:525+    <-- Supports DOMContentLoaded event.<br/>
                                  yahoo.com user agent hack removed.<br/>
<br/>
http://en.wikipedia.org/wiki/Safariversionhistory

 * @return
 */
public native final double webkit() /*-{
return this.webkit; 
}-*/;

/**
 * 
 * @param val
 * @return this - for setter chaining
 */
public native final UAClass webkit(double val) /*-{
this.webkit = val; 
return this; 
}-*/;
/**
 * Detects Palms WebOS version
 * @return
 */
public native final double webos() /*-{
return this.webos; 
}-*/;

}
