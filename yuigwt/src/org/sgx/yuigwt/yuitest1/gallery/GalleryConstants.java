package org.sgx.yuigwt.yuitest1.gallery;

import java.util.HashMap;
import java.util.Map;

/**
 * 
 * @author sg
 *
 */
public class GalleryConstants {
	

//	public static final String YUI_BUILD_PATH = "org.sgx.yuigwt.YuiGwtTestLocal/"; 

	public static final String 
	
		TAG_WIDGET = "widget",
		TAG_BUTTON = "button",
		TAG_NODE = "node",
		TAG_EXT = "extensions",
		TAG_MENUNAV = "MenuNav",
		TAG_EVENT = "event",
		TAG_SLIDER = "slider",
		TAG_OVERLAY = "overlay",
		TAG_DATATABLE = "datatable",
		TAG_ANIM = "animation",
		TAG_PLUGIN = "plugin",
		TAG_DD = "drag&drop",
		TAG_CONSOLE = "console",
		TAG_STYLESHEET = "stylesheet",
		TAG_GRAPHIC = "graphics",
		TAG_YUI = "yuiGlobal",
		TAG_CACHE = "cache",
		TAG_COOKIE = "cookie",
		TAG_ACCORDION = "accordion", 
		TAG_PANEL = "panel",
		TAG_IMGLOADER = "imgloader",
		TAG_CALENDAR = "calendar",
		TAG_DATASCHEMA = "dataSchema",
		TAG_DATASOURCE = "dataSource", 
		TAG_DATATYPE = "datatype",
		TAG_GET = "get",
		TAG_ALL="all", //special
		TAG_ASYNCQUEUE = "asyncQueue",
		TAG_IO="io",
		TAG_TRANSITION = "transition",
		TAG_GALLERY = "yuiGallery",		
		TAG_TABVIEW = "tabview",
		TAG_AUTOCOMPLETE = "autocomplete", 
		TAG_EDITOR="editor",
		TAG_HISTORY="history",
		TAG_PJAX="pjax",
		TAG_UTILS="util",
		TAG_CHARTS="charts",
		TAG_ALLOYUI = "alloyui",
		TAG_NODEFOCUSMANAGER = "NodeFocusManager", 
		TAG_SCROLLVIEW = "scrollview",
		TAG_DEFERRED = "deferred", 
		TAG_RESIZE="resize", 
		TAG_JSINJAVA="jsInJava", 
		TAG_GWT = "gwt", 
		TAG_HANDLEBARS="handlebars", 
		TAG_TREEVIEW="treeview", 
		TAG_JSON="json", 
		TAG_YQL = "YQL", 
		TAG_INTL = "Intl", 
		TAG_SORTABLE="sortable", 
		TAG_CSSGRIDS="cssgrids", 
		TAG_MODEL="model", 
		TAG_DIAL="dial",
		TAG_ROUTER="router",
		TAG_UPLOADER="uplodaer", TAG_UIBINDER="UIBinder"; 		
	
	public static final String[] GALLERY_MODULES = { "button", "panel", "escape", "stylesheet",
			"cssreset", "cssfonts", "cssgrids", "event-resize", 
			
//			 "resize", "resize-plugin" ,
			 
			//accordion
			"gallery-accordion",  "dd-constrain", "dd-proxy",  "dd-plugin", "dd-drop", 
			
			"io-base", 
//			"get",
			//autocomplete
			"autocomplete", "autocomplete-filters", "autocomplete-highlighters", 
			"tabview"
		},

	ALL_TAGS = { TAG_WIDGET, TAG_BUTTON, TAG_NODE, TAG_EXT, 
			TAG_EVENT, TAG_PLUGIN, TAG_STYLESHEET, TAG_GRAPHIC,
			TAG_SLIDER,	TAG_ANIM, TAG_CONSOLE, TAG_DD, TAG_YUI, TAG_GALLERY, TAG_UTILS, 
			TAG_GET, TAG_ALL, TAG_TABVIEW, TAG_CHARTS, TAG_GWT, TAG_UIBINDER,
			
//			TAG_DATASCHEMA, TAG_DATASOURCE, TAG_DATATYPE, TAG_DD, 
//			  TAG_CACHE, TAG_COOKIE, TAG_MENUNAV, TAG_OVERLAY, TAG_DATATABLE, 
//			  TAG_ACCORDION, TAG_PANEL, TAG_ASYNCQUEUE, TAG_EDITOR, TAG_CHARTS, TAG_DEFERRED, 
//			  TAG_RESIZE, TAG_JSINJAVA,  TAG_HANDLEBARS, TAG_TREEVIEW, TAG_JSON, 
//			  TAG_YQL, TAG_INTL, TAG_SORTABLE, TAG_CSSGRIDS, TAG_DIAL, TAG_UIBINDER, TAG_ROUTER
	};


	///tags descriptions: 
	
	public static class Tag {
		String name, description;
		public Tag(String name, String description) {
			super();
			this.name = name;
			this.description = description;
		}
		public String getName() {
			return name;
		}
		public void setName(String name) {
			this.name = name;
		}
		public String getDescription() {
			return description;
		}
		public void setDescription(String description) {
			this.description = description;
		} 			
	}
	
	public static Map<String, Tag> tags; 
	static {
		tags=new HashMap<String, GalleryConstants.Tag>(); 
		tags.put(TAG_GWT, new Tag(TAG_GWT, "Using GWT tools and APIs along with YUI Java API. "));
		tags.put(TAG_JSINJAVA, new Tag(TAG_GWT, "Using JavaScript language helpers for Java - these tools are part of GWT and also of yuigwt. "));
		//TODO: other tags
//		for (int i = 0; i < ALL_TAGS.length; i++) {
//			String t = ALL_TAGS[i]; 
//			tags.put(t, new Tag(t, "")); 
//		}
	}
//	

	public static final String LATEST_BUILD = "gallery-2012.10.31-20-00";//gallery-2012.10.17-20-00";
}
