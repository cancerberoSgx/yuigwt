package org.sgx.yuigwt.yuitest1;

//import org.sgx.yuigwt.yui.Style;
//import org.sgx.yuigwt.yui.YUI;
//import org.sgx.yuigwt.yui.YUICallback;
//import org.sgx.yuigwt.yui.YuiConfig;
//import org.sgx.yuigwt.yui.YuiContext;
//import org.sgx.yuigwt.yui.anim.Anim;
//import org.sgx.yuigwt.yui.anim.AnimConfig;
//import org.sgx.yuigwt.yui.event.EventHandle;
//import org.sgx.yuigwt.yui.event.NodeEventCallback;
//import org.sgx.yuigwt.yui.event.YuiEvent;
//import org.sgx.yuigwt.yui.graphic.Stroke;
//import org.sgx.yuigwt.yui.node.Node;
//import org.sgx.yuigwt.yui.node.NodeBase;
//import org.sgx.yuigwt.yui.node.NodeEventDelegateCallback;
//import org.sgx.yuigwt.yui.util.JsUtil;
//import org.sgx.yuigwt.yui.widget.Widget;
//import org.sgx.yuigwt.yui.widget.WidgetConfig;
//import org.sgx.yuigwt.yui.widget.button.Button;
//import org.sgx.yuigwt.yui.widget.button.ButtonConfig;
//import org.sgx.yuigwt.yui.widget.slider.Slider;
//import org.sgx.yuigwt.yui.widget.slider.SliderConfig;
//import org.sgx.yuigwt.yuitest1.gallery.Gallery;
//import org.sgx.yuigwt.yuitest1.gallery.GalleryConstants;

import org.sgx.yuigwt.yuitest1.gallery.Gallery;

import com.google.gwt.core.client.EntryPoint;
import com.google.gwt.dom.client.Document;
//import com.google.gwt.user.client.Window;

public class Yui4GwtGalleryLocalOld implements EntryPoint {
	
	public void onModuleLoad() {

		Document.get().getBody().addClassName("yui3-skin-sam"); 
		doGallery(); 
//		nodeTest1(); 
//		buttonTest1();
//		sliderTest1(); 
//		graphicTest1(); 
//		nodeEventDelegationTest1(); 
//		animTest1(); 
	}

	private void doGallery() {
		new Gallery().draw(); 
	}

//	private void nodeEventDelegationTest1() {
//		YUI.YUI(YuiConfig.create().base(AlloyuiGalleryConstants.YUI_BUILD_PATH)).
//			use(new String[]{"node", "node-event-delegate", "event-key"}, new AUICallback() {
//			
//			
//			public void ready(YuiContext Y) {
//				
//				Node body = Y.one("body"), 
//					newNode = body.create(
//					"<fieldset id=\"todo-example\">\n"+
//					"<legend>Todo List</legend>\n"+
//					"<ol>\n"+
//					"    <li><button class=\"delete-todo\">remove</button>Read YUI documentation</li>\n"+
//					"    <li><button class=\"delete-todo\">remove</button>Build awesome web app</li>\n"+
//					"    <li><button class=\"delete-todo\">remove</button>Profit!</li>\n"+
//					"</ol>\n"+
//					"<input id=\"todo\"> <button id=\"add-todo\" type=\"button\">add</button>\n"+
//					"</fieldset>");
//				body.append(newNode);
//				newNode.setStyle("backgroundColor", "pink"); 
////				Window.alert(newNode+" - "+newNode.getStyle("backgroundColor")); 
//				
//				final Node todoList = Y.one("#todo-example ol");
//				final Node newTask = Y.one("#todo");
//				
//				todoList.delegate("click", new NodeEventDelegateCallback() {
//					
//					
//					public void call(Node n, YuiEvent evt, Object arg) {
//						n.ancestor("li").remove(); 
//					}
//				}, "button", null); 
//				
//				NodeEventCallback addTodo = new NodeEventCallback() {
//					
//					
//					public void call(YuiEvent e) {
//						todoList.append(
//				            "<li><button class=\"delete-todo\">remove</button>" +
//				                newTask.get("value") +
//				            "</li>");
//
//				        newTask.set("value", "");
//					}
//				}; 
//				Y.one("#add-todo").on("click", addTodo); 
//				newTask.on("key", addTodo, "enter");  
//			}
//		}); 
//	}
//
//	private void buttonTest1() {
//		YUI.YUI(YuiConfig.create().base(AlloyuiGalleryConstants.YUI_BUILD_PATH)).
//			use(new String[]{"button"}, new AUICallback() {
//			
//			
//			public void ready(YuiContext Y) {				
//				Node buttonEl = Y.one("body").appendChild("<button id=\"foo1\">hello world</button>").cast(); 
//				
//				ButtonConfig bc1 = Button.config().label("heee").srcNode("#foo1").cast(); 
//				Button b1 = Y.newButton(bc1);
//				b1.render(); 
//			}
//		}); 
//	}
//	
//	private void sliderTest1() {
//		YUI.YUI(YuiConfig.create().base(AlloyuiGalleryConstants.YUI_BUILD_PATH)).
//			use(new String[]{"slider"}, new AUICallback() {
//			
//			
//			public void ready(YuiContext Y) {				
//				Node n1 = Y.one("body").appendChild("<span></span>").cast();
//				Widget slider1 = Y.newSlider().render(n1); 
//				
//				Node n2 = Y.one("body").appendChild("<span></span>").cast();
//				Y.newSlider(Slider.config().axis("y").min(1).max(5).value(3).length(200)).render(n2);
//				
//			}
//		}); 
//	}
//	
//	
// 
//	private void animTest1() {
//	YUI.YUI(YuiConfig.create().base(AlloyuiGalleryConstants.YUI_BUILD_PATH)).
//		use(new String[]{"anim"}, new AUICallback() {
//		
//		
//		public void ready(YuiContext Y) {
//			
//			Node body = Y.one("body"), 
//				newNode = body.create("<b>animated node hover his please</b>");
//			body.append(newNode);
//			newNode.setStyle("backgroundColor", "#ffffff"); 
//			Window.alert(newNode.getStyle("backgroundColor")); 
//			
//			final Anim anim = Y.newAnim(AnimConfig.create().
//				node(newNode).
//				from(Style.create().backgroundColor(newNode.getStyle("backgroundColor"))).
//				to(Style.create().backgroundColor("#FF8800")).
//				duration(1.5)
//			);  
////			anim.run();	
//			NodeEventCallback hover = new NodeEventCallback() {
//				
//				
//				public void call(YuiEvent e) {
//					boolean reverse = false; 
//					if(anim.getBoolean("running")) {
//						anim.pause(); 
//					}
//					if(e.getType().equals("mouseout")) {
//						reverse = true; 
//					}
//					anim.set("reverse", reverse); 
//					anim.run();					
//				}
//			};
//			
//			newNode.on("mouseover", hover); 
//			newNode.on("mouseout", hover); 
//		}
//	}); 
//	}
//
////	private void graphicTest1() {
////		YUI.use(new String[]{"graphics"}, new AUICallback() {
////			
////			
////			public void ready(YuiContext Y) {
////				
////				Stroke stroke1 = Stroke.create().color("#ededed").dashStyle("none"); 
////			}
////		}); 
////	}
//
//	private void nodeTest1() {
//		
////		YUI.YUI(YuiConfig.create().base(YUI_BUILD_PATH)).use("node", "button", new AUICallback() {
//		YUI.YUI(YuiConfig.create().base(AlloyuiGalleryConstants.YUI_BUILD_PATH)).use(new String[]{"node"}, new AUICallback() {
//			private EventHandle handle1;
//
//			
//			public void ready(YuiContext Y) {
////				Window.alert("ready"); 
//				Node body = Y.one("body"), newNode = body.create("<b>helloooooooooooo</b>"); 
//				body.append(newNode);
//				handle1 = newNode.on("click", new NodeEventCallback() {
//					
//					
//					public void call(YuiEvent e) {
//						Window.alert("clicked only once!: "+e.getClientX()); 
//						handle1.detach(); 
//					}
//				}); 
//			}
//		}); 
//	}

}
