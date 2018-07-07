package org.sgx.yuigwt.yuitest1.gallery.test.uibinder;

import org.sgx.yuigwt.ui.YUIBinded;
import org.sgx.yuigwt.yui.YuiContext;
import org.sgx.yuigwt.yui.event.YuiEvent;
import org.sgx.yuigwt.yui.node.Node;
import org.sgx.yuigwt.yui.node.NodeEventDelegateCallback;
import org.sgx.yuigwt.yuitest1.gallery.test.uibinder.userguide.MainMenu;

import com.google.gwt.core.client.GWT;
import com.google.gwt.dom.client.Element;
import com.google.gwt.uibinder.client.UiBinder;
import com.google.gwt.uibinder.client.UiFactory;
import com.google.gwt.uibinder.client.UiField;
import com.google.gwt.user.client.Window;
import com.google.gwt.user.client.ui.Widget;

/**
 * @author sg
 */
public class UIBinderComposing extends YUIBinded {

	interface MyUiBinder extends UiBinder<Widget, UIBinderComposing> {
	}

	private static UiBinder<YUIBinded, Widget> uiBinder = GWT.create(MyUiBinder.class);

	/**
	 * We bind mainMenu, but since it is a valid GWT Widget we do not bind the HMTL Element
	 * but the GWT Widget directly. This means we do not need to perform the "YUI Binding" stuff for this widget.  
	 */
	@UiField MainMenu mainMenu; 
	
	public UIBinderComposing(YuiContext y) {
		super(y); 
		//not yui binding required : we can start working with the MainMenu widget right away
		Node n = y.one(mainMenu.getElement());
		n.delegate("click", new NodeEventDelegateCallback() {
			
			@Override
			public void call(Node n, YuiEvent evt, Object arg) {
				Window.alert("anchor clicked"); 
			}
		}, "a"); 
	}
	
	/* and this is important - because the widget we want to add (MainMenu),  */
	/**
	 * Will be used for creating MainMenu instances of this UIBinder widget. 
	 * @return a new MainMenu
	 */
	@UiFactory
	MainMenu makeMainMenu() {
		return new MainMenu(y);
	}

	
	//following all the "YUI binding" stuff - in this case we do not nothing.

	@Override
	public void yuiBinded() {		
	}
	@Override
	public UiBinder<YUIBinded, Widget> getUIBinder() {
		return uiBinder;
	}	
	@Override
	public Element[] getYUIBindedEls() {
		//not yui binding required 
		return  new Element[] {}; 
	}

}
