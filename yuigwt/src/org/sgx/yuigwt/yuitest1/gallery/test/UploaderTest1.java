package org.sgx.yuigwt.yuitest1.gallery.test;

import org.sgx.yuigwt.yui.YUI;
import org.sgx.yuigwt.yui.YUICallback;
import org.sgx.yuigwt.yui.YuiContext;
import org.sgx.yuigwt.yui.console.Console;
import org.sgx.yuigwt.yui.event.EventCallback;
import org.sgx.yuigwt.yui.node.Node;
import org.sgx.yuigwt.yui.uploader.Uploader;
import org.sgx.yuigwt.yui.uploader.UploaderConfig;
import org.sgx.yuigwt.yui.uploader.UploaderEvent;
import org.sgx.yuigwt.yui.uploader.UploaderHTML5;
import org.sgx.yuigwt.yui.uploader.file.File;
import org.sgx.yuigwt.yuitest1.gallery.GalleryConstants;

import com.google.gwt.core.client.JsArray;
/**
 * simple test for the uploader widget
 * @author sg
 *
 */
public class UploaderTest1 extends AbstractTest {

public UploaderTest1() {
	super("uploader1", "simple test for the uploader widget", 
			new String[]{GalleryConstants.TAG_UPLOADER, GalleryConstants.TAG_WIDGET}, 
			TestResources.instance.UploaderTest1());
}

@Override
public void test(final Node parent) {
YUI.Use(new String[]{"uploader", "console"}, new YUICallback() {

	@Override
	public void ready(final YuiContext Y) {
		final Uploader uploader1 = Y.newUploader(UploaderConfig.create()
			.multipleFiles(true)
			.swfURL("http://yui.yahooapis.com/3.7.3/build/uploader/assets/flashuploader.swf?t=" + Math.random())
			.uploadURL("http://www.yswfblog.com/upload/simpleupload.php")
			.simLimit(2)
			.withCredentials(false)
			.width("200px")
			.height("100px")
		); 
//		uploader1.render(parent); 
		final Console console = Y.newConsole().render().cast();
		
		final Node selectFilesButtonContainer = parent.appendChild("<div></div>");
		
		
		//if html5 add support from drag&drop files from desktop. see http://yuilibrary.com/yui/docs/uploader/uploader-dd.html
		if(Y.Uploader().TYPE().equals("html5")) {
			
			final Node uploaderMessage = parent.appendChild("<div>Drag and drop files</div>");
			final Node ddarea = parent.appendChild("<div>on this BOX</div>");
			uploader1.set("dragAndDropArea", ddarea); 
			console.log("html5 uploader"); 
			
			uploader1.on(new String[]{UploaderHTML5.EVENT_DRAGENTER, UploaderHTML5.EVENT_DRAGOVER}, new EventCallback<UploaderEvent>() {
				@Override
				public void call(UploaderEvent e) {
					uploaderMessage.text("Files detected, drop them here!"); 
				}
			});
			
			uploader1.on(new String[]{UploaderHTML5.EVENT_DRAGLEAVE, UploaderHTML5.EVENT_DROP}, new EventCallback<UploaderEvent>() {
				@Override
				public void call(UploaderEvent e) {
					uploaderMessage.text("Drag and drop files here"); 
				}
			}); 
			
		}
		else if(Y.Uploader().TYPE().equals("flash")) {
			console.log("flash uploader"); 
		}
		else {
			console.log("file uploader not supported - "+"No Flash or HTML5 capabilities detected.");
			return; 
		}
		
		
		uploader1.render(selectFilesButtonContainer);
		
		uploader1.after("fileselect", new EventCallback<UploaderEvent>() {
			@Override
			public void call(UploaderEvent e) {
				JsArray<File> fl = e.fileList(); //uploader1.fileList()	
				console.log("fileselect: "+fl.length()); 
			}
		}); 
		
	}
}); 
}

}
