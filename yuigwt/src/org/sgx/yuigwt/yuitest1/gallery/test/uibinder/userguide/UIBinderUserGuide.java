package org.sgx.yuigwt.yuitest1.gallery.test.uibinder.userguide;

import org.sgx.yuigwt.ui.YUIBinded;
import org.sgx.yuigwt.yui.YuiContext;
import org.sgx.yuigwt.yui.event.EventCallback;
import org.sgx.yuigwt.yui.event.EventFacade;
import org.sgx.yuigwt.yui.node.Node;
import org.sgx.yuigwt.yui.util.JsUtil;
import org.sgx.yuigwt.yui.util.Style;

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
public class UIBinderUserGuide extends YUIBinded {

	interface MyUiBinder extends UiBinder<Widget, UIBinderUserGuide> {
	}

	private static MyUiBinder uiBinder = GWT.create(MyUiBinder.class);
	

	public UIBinderUserGuide(YuiContext y) {
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

/**
 * Will be used for creating AvailableYUIWidgets instances of this UIBinder widget. 
 * @return a new AvailableYUIWidgets
 */
@UiFactory
AvailableYUIWidgets makeAvailableYUIWidgets() {
	return new AvailableYUIWidgets(y);
}

//	@UiFactory MainMenu makeMainMenu() {
//		return new MainMenu(y); 
//	}
public static native final void prettyPrint()/*-{
$wnd.prettyPrint();
}-*/;


}
