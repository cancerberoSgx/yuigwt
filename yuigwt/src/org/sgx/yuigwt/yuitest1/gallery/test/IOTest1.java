package org.sgx.yuigwt.yuitest1.gallery.test;

import static org.sgx.yuigwt.yuitest1.gallery.GalleryConstants.TAG_CONSOLE;
import static org.sgx.yuigwt.yuitest1.gallery.GalleryConstants.TAG_IO;
import static org.sgx.yuigwt.yuitest1.gallery.GalleryConstants.TAG_UTILS;

import org.sgx.yuigwt.yui.YUI;
import org.sgx.yuigwt.yui.YUICallback;
import org.sgx.yuigwt.yui.YuiContext;
import org.sgx.yuigwt.yui.console.Console;
import org.sgx.yuigwt.yui.console.ConsoleConfig;
import org.sgx.yuigwt.yui.event.EventCallback;
import org.sgx.yuigwt.yui.io.IO;
import org.sgx.yuigwt.yui.io.IOConfig;
import org.sgx.yuigwt.yui.io.IOEvent;
import org.sgx.yuigwt.yui.io.IOTask;
import org.sgx.yuigwt.yui.io.Response;
import org.sgx.yuigwt.yui.node.Node;
import org.sgx.yuigwt.yui.util.JsUtil;

import com.google.gwt.core.client.GWT;
import com.google.gwt.user.client.Window;
/**
 * shows how to use the Get utility  http://yuilibrary.com/yui/docs/get
 * I will load files that I left on a public folder of this demo (yuitest1/gallery-public/testfiles)
 * so I get the full path like this GWT.getModuleBaseURL()+"testfiles/script1.js". 
 * 
 * @author sg
 *
 */
public class IOTest1 extends AbstractTest {

public IOTest1() {
	super("io1", "io test 1. Some examples taken from http://yuilibrary.com/yui/docs/io/", 
		new String[]{TAG_IO, TAG_CONSOLE, TAG_UTILS}, 
		TestResources.instance.IOTest1());
}

@Override
public void test(final Node parent) {
YUI.Use(new String[]{"io-base", "io-queue", "console"}, new YUICallback() {	
		
@Override
public void ready(final YuiContext Y) {
	
	final Console console1 = Y.newConsole(ConsoleConfig.create());
	console1.render(); 
	
	String uri1 = GWT.getModuleBaseURL()+"testfiles/json1.json", 
		uri2 = GWT.getModuleBaseURL()+"testfiles/page2.html", 
		nonExistentUri = GWT.getModuleBaseURL()+"testfiles/notexistent.json";
	
	//create an io object for working that will notify us for some io events...
	IOConfig ioConfig = IOConfig.create().
			on(IO.EVENT_SUCCESS, new EventCallback<IOEvent>() {					
		@Override
		public void call(IOEvent e) {
			console1.log("SUCCESS, responseText: "+e.data().responseText()); 
		}
	}).on(IO.EVENT_FAILURE, new EventCallback<IOEvent>() {
		@Override
		public void call(IOEvent e) {
			console1.log("FAILURE. Status: "+e.data().status()+" - "+e.data().statusText(), "", ""); 
		}
	}).cast(); 
	IO io1 = Y.newIO(ioConfig);
	
	//send a request. 
	Response resp = io1.send(uri1, ioConfig);	
	
	//send an other - should trigger "failure" event
	io1.send(nonExistentUri, ioConfig);	
	
	
	//and now some test with io-queue - see http://yuilibrary.com/yui/docs/io/#queue
	
	// Stop the queue so transactions can be stored.
	Y.io().queue().stop(); 
	
	// Send four transactions into the queue. Each response will arrive
    // in synchronous order.
	IOTask task1 = Y.io().queue(uri1);
	IOTask task2 = Y.io().queue(uri2);
	
	
	Y.io().queue().start(); 
	Window.alert(JsUtil.dumpObj(Y.io())); 
	
}
}); 
}

}
