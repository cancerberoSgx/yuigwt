package org.sgx.yuigwt.galleryexplorer.client.ui;

import java.util.HashMap;
import java.util.HashSet;
import java.util.List;
import java.util.Map;
import java.util.Set;

import org.sgx.yuigwt.galleryexplorer.client.api.Module;
import org.sgx.yuigwt.galleryexplorer.client.res.TestResources;
import org.sgx.yuigwt.yui.console.Console;
import org.sgx.yuigwt.yui.event.EventCallback;
import org.sgx.yuigwt.yui.io.IO;
import org.sgx.yuigwt.yui.io.IOConfig;
import org.sgx.yuigwt.yui.io.IOEvent;
import org.sgx.yuigwt.yui.io.Response;
import org.sgx.yuigwt.yui.node.Node;
import org.sgx.yuigwt.yui.util.JsObject;
import org.sgx.yuigwt.yui.util.JsUtil;
import org.sgx.yuigwt.yui.yql.YQL;
import org.sgx.yuigwt.yui.yql.YQLCallback;
import org.sgx.yuigwt.yui.yql.YQLResult;
import org.sgx.yuigwt.yuigallery.YuiGalleryContext;

import com.google.gwt.core.client.JsArray;
import com.google.gwt.core.client.JsArrayString;
import com.google.gwt.core.client.JsonUtils;
/**
 * this class keeps module information in a more java way
 * @author sg
 * 
 */
public class GalleryUtil {
	

	static boolean debug = false; 
	
	public static final String[] INITIALMODULES = new String[]{
		"button", "yql", "console", "cssreset", "cssgrids", "node-screen", 
		"autocomplete", "autocomplete-filters", "autocomplete-highlighters", 
		"stylesheet", "scrollview", "scrollview-scrollbars", "datatable", "tabview"
	};

	
	
	private Console console;
	
	Map<String, Module> modulesByName; 
	Map<String, JsArray<Module>> modulesByTag;
	Map<String, JsArray<Module>> modulesByRequires;
	Set<String> 
//	moduleNames, 
	moduleTags; 
	JsArrayString moduleNamesArr, moduleTagsArr; 
	Gallery gallery;

	YuiGalleryContext Y;

	private JsArray<Module> modules; 
	
	public GalleryUtil(Gallery gallery){
		this.gallery=gallery;
		this.console=gallery.console; 
		this.Y=gallery.Y; 
		loadGalleryModulesAndDraw(); 		
	}

	private void loadGalleryModulesAndDraw() {
		
		//load all gallery modules using datatables.org, this time yui.gallery.all for information about yui gallery modules. 
		
		if(!debug) {
		String query2 = "select * from yui.gallery.all";
		YQLCallback yqlCallback2 = new YQLCallback() {			
			@Override
			public void call(YQLResult r) {
				JsObject o = r.query().results().objGetObj("json"); //type, count, modules, } 
				JsArray<Module> modules = o.objGetObj("modules").cast(); 
				loadModules(modules); 
				gallery.render(); 	 
			}
		}; 
		JsObject yqlParams2 = JsObject.one("env", "http://datatables.org/alltables.env"); 	
		yqlParams2.objPut("format", "json"); 
		YQL yql2 = Y.newYQL(query2, yqlCallback2, yqlParams2); 
		}
		else {
			//only for devel/testing - load a local copy
			String text = TestResources.instance.data1().getText();
			console.log("data length: "+text.length()); 
			YQLResult r = JsonUtils.unsafeEval(text); 
			JsObject json = r.query().results().objGetObj("json"); 
			JsArray<Module> data = json.objGetObj("modules").cast(); 
			loadModules(data);
			gallery.render(); 	
		}
	}


	public void loadModules(JsArray<Module> modules) {
		console.log("module: "+JsUtil.dumpObj(modules.get(0))); 
		
		this.modules=modules; 

		modulesByName = new HashMap<String, Module>(); 
		modulesByTag = new HashMap<String, JsArray<Module>>(); 
		modulesByRequires = new HashMap<String, JsArray<Module>>(); 
//		moduleNames=new HashSet<String>(); 
		moduleTags = new HashSet<String>(); 
		
		moduleNamesArr = JsArrayString.createArray().cast(); 
		moduleTagsArr = JsArrayString.createArray().cast();
//		console.log(JsUtil.typeof(modules.get(0)._("tags"))); 
		for (int i = 0; i < modules.length(); i++) {
			Module module = modules.get(i); 
			moduleNamesArr.push(module.module());		
			modulesByName.put(module.module(), module); 
			String[] tags = module.tags().split(",");
			for (int j = 0; j < tags.length; j++) {
				moduleTags.add(tags[j]); 
			}	
			
			String[] requires = module.requires().split(",");
			for (int j = 0; j < requires.length; j++) {
				String r = requires[j]; 
				JsArray<Module> reqs = modulesByRequires.get(r); //
				if(reqs==null) {
					reqs = JsArray.createArray().cast(); 
					modulesByRequires.put(r, reqs);
				}
				reqs.push(module);  
			}
		}
		moduleTagsArr = org.sgx.yuigwt.galleryexplorer.client.util.JsUtil.toJsArrayString(moduleTags); 
		console.log(modules.length()+" modules loaded. tags: "+moduleTagsArr.length()); 
	}

	public Map<String, Module> getModulesByName() {
		return modulesByName;
	}

	public Map<String, JsArray<Module>> getModulesByTag() {
		return modulesByTag;
	}

	public JsArrayString getModuleNames() {
		return moduleNamesArr;
	}

	public JsArrayString getModuleTags() {
		return moduleTagsArr;
	}

	public JsArray<Module> getModules() {
		return modules;
	}

//	public void setConsole(Console console) {
//		this.console=console; 
//	}
	
	
	
}
