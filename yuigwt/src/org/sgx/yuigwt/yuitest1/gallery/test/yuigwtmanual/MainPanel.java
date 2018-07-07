package org.sgx.yuigwt.yuitest1.gallery.test.yuigwtmanual;

import org.sgx.yuigwt.ui.YUIBinded;
import org.sgx.yuigwt.yui.YuiContext;
import org.sgx.yuigwt.yui.event.EventCallback;
import org.sgx.yuigwt.yui.event.EventFacade;
import org.sgx.yuigwt.yui.node.Node;
import org.sgx.yuigwt.yuitest1.gallery.test.uibinder.userguide.SourceCodeViewer;
import org.sgx.yuigwt.yuitest1.gallery.test.yuigwtmanual.sections.Features;
import org.sgx.yuigwt.yuitest1.gallery.test.yuigwtmanual.sections.GettingStarted;
import org.sgx.yuigwt.yuitest1.gallery.test.yuigwtmanual.sections.Introduction;
import org.sgx.yuigwt.yuitest1.gallery.test.yuigwtmanual.sections.YUIJavaAPI;

import com.google.gwt.core.client.GWT;
import com.google.gwt.dom.client.Element;
import com.google.gwt.uibinder.client.UiBinder;
import com.google.gwt.uibinder.client.UiFactory;
import com.google.gwt.uibinder.client.UiField;
import com.google.gwt.user.client.ui.Widget;

/**
 * this is a common UIBinder Composite class. Notes:
 * 
 * <p>
 * 1) for YUI, we are binding plain HTML Elements, like @UiField Element
 * tabViewEl1;
 * </p>
 * 
 * <p>
 * 2) then in the constructor, after this GWT widget is initialized with
 * initWidget(uiBinder.createAndBindUi(this));, we call YUIBinder.bindYUI
 * passing this Element UIFields corresponding to YUI stuff and register myself
 * as a listener to be notified when YUI binding is done to start working.
 * </p>
 * 
 * <p>
 * 3) in yuiBinded() callback we ask for YUI Widgets and start working with
 * them.
 * </p>
 * 
 * @author sg
 * 
 */
public class MainPanel extends YUIBinded {

	interface MyUiBinder extends UiBinder<Widget, MainPanel> {
	}

	private static MyUiBinder uiBinder = GWT.create(MyUiBinder.class);
	

	public MainPanel(YuiContext y) {
		super(y); 
	}

	@UiField MainMenu mainMenu; 
	
	
	public void yuiBinded() {
		prettyPrint(); 
//		y.one(".main-header").setStyles(Style.create().position("fixed")); 
		
		String [] sectionNames = {"sec-intro", "sec-gettingstarted"};
		for (int i = 0; i < sectionNames.length; i++) {
			final Node target = y.one("#"+sectionNames[i]);
			Node nav = y.one("#nav-"+sectionNames[i]);
			if(target!=null && nav!=null) {
				nav.on("click", new EventCallback<EventFacade>() {
					
					public void call(EventFacade e) {
						target.scrollIntoView(); 
					}
				}); 
			}
		}
	}

	
	public UiBinder getUIBinder() {
		return uiBinder;
	}

	
	public Element[] getYUIBindedEls() {
		return new Element[]{};
	}
	
/**
 * Will be used for creating MainMenu instances of this UIBinder widget. 
 * @return a new MainMenu
 */
@UiFactory
MainMenu makeMainMenu() {
	return new MainMenu(y);
}

/**
 * Will be used for creating SourceCodeViewer instances of this UIBinder widget. 
 * @return a new SourceCodeViewer
 */
@UiFactory
SourceCodeViewer makeSourceCodeViewer() {
	return new SourceCodeViewer(y);
}
//	@UiFactory MainMenu makeMainMenu() {
//		return new MainMenu(y); 
//	}
public static native final void prettyPrint()/*-{
$wnd.prettyPrint();
}-*/;

/**
 * Will be used for creating Introduction instances of this UIBinder widget. 
 * @return a new Introduction
 */
@UiFactory
Introduction makeIntroduction() {
	return new Introduction(y);
}


/**
 * Will be used for creating Features instances of this UIBinder widget. 
 * @return a new Features
 */
@UiFactory
Features makeFeatures() {
	return new Features(y);
}

/**
 * Will be used for creating GettingStarted instances of this UIBinder widget. 
 * @return a new GettingStarted
 */
@UiFactory
GettingStarted makeGettingStarted() {
	return new GettingStarted(y);
}

/**
 * Will be used for creating YUIJavaAPI instances of this UIBinder widget. 
 * @return a new YUIJavaAPI
 */
@UiFactory
YUIJavaAPI makeYUIJavaAPI() {
	return new YUIJavaAPI(y);
}
}
