package org.sgx.yuigwt.yuitest1.gallery.test;

import static org.sgx.yuigwt.yuitest1.gallery.GalleryConstants.*;

import org.sgx.yuigwt.yui.YUI;
import org.sgx.yuigwt.yui.YUICallback;
import org.sgx.yuigwt.yui.YuiContext;
import org.sgx.yuigwt.yui.dd.DragConfig;
import org.sgx.yuigwt.yui.event.EventCallback;
import org.sgx.yuigwt.yui.event.EventFacade;
import org.sgx.yuigwt.yui.node.Node;
import org.sgx.yuigwt.yui.util.Point;
import org.sgx.yuigwt.yui.widget.button.Button;
import org.sgx.yuigwt.yui.widget.ext.Align;
import org.sgx.yuigwt.yui.widget.ext.WidgetButtonsConfig;
import org.sgx.yuigwt.yui.widget.panel.Panel;
import org.sgx.yuigwt.yui.widget.panel.PanelConfig;

import com.google.gwt.user.client.Window;

public class PanelTest1 extends AbstractTest {

public PanelTest1() {
	super("panel1", "panel widget tests - two panels differently created - the first with a button and the last one is draggable by its title and resiable", new String[] {
			TAG_PANEL, TAG_WIDGET }, TestResources.instance.PanelTest1());
}

@Override
public void test(final Node parent) {

YUI.YUI().use(new String[] { "panel", "button", "dd-plugin", "resize", "resize-plugin" }, new YUICallback() {

	@Override
	public void ready(YuiContext Y) {
		// a panel with a button which content is taken from markup
		Node parentBody = parent.appendChild("<p>This is the content of the <b>panel</b><i>jhalllll</i>. Well good day...</p>");
		final Panel panel1 = Y.newPanel((PanelConfig) PanelConfig.create().centered(true).srcNode(parentBody).width("400px").render(true));

		Button acceptButton = Y.newButton((WidgetButtonsConfig) WidgetButtonsConfig.create().label("Accept").on("click", new EventCallback<EventFacade>() {
			@Override
			public void call(EventFacade e) {
				Window.alert("clicked");
				panel1.hide();

			}
		}));
		acceptButton.render();
		panel1.addButton(acceptButton.srcNode());

		// a panel initially empty but being poblated using the panel
		// api
		Panel panel2 = Y.newPanel((PanelConfig) PanelConfig.create().xy(10, 10).srcNode(parent.appendChild("<p></p>")).width("400px").render(true));
		panel2.headerContent("<h1>Panel header string</h1>");
		panel2.bodyContent(parent.appendChild("<p>Body <b>content</b> from an other node. Sl asdkljlksajd lfklaj serfjkjd slfj klajsdk fj klaj dsf. </p>"));
		panel2.footerContent("<i>small</i>");
		panel2.align(Align.create().node(parent).points(new Point[] { Point.create(0, 0), Point.create(0, 0) }));
		panel2.render(); // apply the align

		// now make this panel draggable by its header
		panel2.plug(Y.Plugin().Drag(), DragConfig.create().handles(new String[] { ".yui3-widget-hd" }));

		// and resizable
		panel2.plug(Y.Plugin().Resize());

	}
});

}

}
