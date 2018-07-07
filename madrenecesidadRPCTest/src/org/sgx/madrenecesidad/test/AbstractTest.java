package org.sgx.madrenecesidad.test;

import org.sgx.madrenecesidad.client.service.ChannelService;
import org.sgx.madrenecesidad.client.service.TagService;

import com.gdevelop.gwt.syncrpc.SyncProxy;

public abstract class AbstractTest {
	
	protected static final String MODULE_BASE_URL = "http://127.0.0.1:8888/appenginetest1/"; 
	
	//on appengine
//	protected static final String MODULE_BASE_URL = "http://madrenecesidad.appspot.com/appenginetest1/";	
//	http://madrenecesidad.appspot.com/appenginetest1/tagService
	
	protected static ChannelService channelService = (ChannelService) SyncProxy
		.newProxyInstance(ChannelService.class, MODULE_BASE_URL, "channelService");	

	protected static TagService tagService = (TagService) SyncProxy
		.newProxyInstance(TagService.class, MODULE_BASE_URL, "tagService");

	
	protected void deleteAllChannels() {
		channelService.cleanAll(); 
		
	}
	protected void deleteAllTags() {
		tagService.cleanAll(); 
//		try {
//			Thread.sleep(timeout1 );
//		} catch (InterruptedException e) {
//			e.printStackTrace();
//		} 	
	}
}
