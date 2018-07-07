package org.sgx.yuigwt.yuitest1.gallery.test;


import org.sgx.yuigwt.yui.YUI;
import org.sgx.yuigwt.yui.YUICallback;
import org.sgx.yuigwt.yui.YuiContext;
import org.sgx.yuigwt.yui.cache.Cache;
import org.sgx.yuigwt.yui.cache.CacheConfig;
import org.sgx.yuigwt.yui.cache.CacheOfflineConfig;
import org.sgx.yuigwt.yui.event.EventCallback;
import org.sgx.yuigwt.yui.event.EventFacade;
import org.sgx.yuigwt.yui.node.Node;
import org.sgx.yuigwt.yui.widget.button.ButtonConfig;
import org.sgx.yuigwt.yuitest1.gallery.GalleryConstants;
/**
 * cache
 * @author sg
 *
 */
public class CacheTest1 extends AbstractTest {

public CacheTest1() {
	super("cache1", "cache test", 
		new String[]{GalleryConstants.TAG_CACHE, GalleryConstants.TAG_UTILS}, 
		TestResources.instance.CacheTest1());
}

@Override
public void test(final Node parent) {
YUI.Use(new String[]{"button", "cache", "cache-offline"}, new YUICallback() {
	@Override
	public void ready(final YuiContext Y) {
		final String cacheKey1 = "cachetestkey1", cacheKey2 = "cachetestkey2";	
		parent.append("<p>The online cache tester: </p>");
		final Node p = parent.appendChild(
			"<input type=\"text\" value=\"value to store\"></input>");
		final Cache cache1 = Y.newCache(CacheConfig.create().max(5).expires(3600000)); 
		Y.newButton(ButtonConfig.create().label("Save").render(parent).on("click", new EventCallback() {			
			@Override
			public void call(EventFacade e) {
				cache1.add(cacheKey1, p.get("value")); 
			}
		})); 
		Y.newButton(ButtonConfig.create().label("Load").render(parent).on("click", new EventCallback() {			
			@Override
			public void call(EventFacade e) {
				p.set("value", cache1.retrieve(cacheKey1).responseString()); 
			}
		})); 
		
		parent.append("<p>and the offline cache tester (html5): </p>"); 
		final Node p2 = parent.appendChild(
			"<input type=\"text\" value=\"value to store\"></input>");
		CacheOfflineConfig occ = (CacheOfflineConfig)CacheOfflineConfig.create(); 
		final Cache cache2 = Y.newCacheOffline(occ.sandbox("foobar4455z").max(5).expires(3600000)); 
		Y.newButton(ButtonConfig.create().label("Save").render(parent).on("click", new EventCallback() {			
			@Override
			public void call(EventFacade e) {
				cache2.add(cacheKey2, p2.get("value")); 
			}
		})); 
		Y.newButton(ButtonConfig.create().label("Load").render(parent).on("click", new EventCallback() {			
			@Override
			public void call(EventFacade e) {
				p2.set("value", cache2.retrieve(cacheKey2).responseString()); 
			}
		})); 
	}
}); 
}

}
