package org.sgx.yuigwt.yuitest1.gallery.test;

import org.sgx.yuigwt.yui.YUI;
import org.sgx.yuigwt.yui.YUICallback;
import org.sgx.yuigwt.yui.YuiContext;
import org.sgx.yuigwt.yui.event.EventCallback;
import org.sgx.yuigwt.yui.node.Node;
import org.sgx.yuigwt.yui.router.Route;
import org.sgx.yuigwt.yui.router.RouteCallback;
import org.sgx.yuigwt.yui.router.RouteRequest;
import org.sgx.yuigwt.yui.router.RouteResponse;
import org.sgx.yuigwt.yui.router.Router;
import org.sgx.yuigwt.yui.router.RouterConfig;
import org.sgx.yuigwt.yui.util.SimpleCallback;
import org.sgx.yuigwt.yui.widget.button.Button;
import org.sgx.yuigwt.yui.widget.button.ButtonConfig;
import org.sgx.yuigwt.yui.widget.button.ButtonEvent;
import org.sgx.yuigwt.yuitest1.gallery.GalleryConstants;

/**
 * Y.Router test - press the buttons to change route, and test back-forward browser buttons.
 * 
 * @author sg
 * 
 */
public class RouterTest1 extends AbstractTest {

	protected Node content;
	protected Router router;

	public RouterTest1() {
		super("router1", "Y.Router test - press the buttons to change route, and test back-forward browser buttons.",
				new String[] { GalleryConstants.TAG_ROUTER }, TestResources.instance.RouterTest1());
	}

	@Override
	public void test(final Node parent) {
		YUI.YUI().use(new String[] { "router", "button" }, new YUICallback() {

			@Override
			public void ready(YuiContext Y) {
				Button b1 = Y.newButton(ButtonConfig.create().label("request /mysite/foo").render(parent)
						.on("click", new EventCallback<ButtonEvent>() {
							@Override
							public void call(ButtonEvent e) {
								router.save("/mysite/foo");
							}
						}));

				Button b2 = Y.newButton(ButtonConfig.create().label("request /mysite/user/sgurin/edit").render(parent)
						.on("click", new EventCallback<ButtonEvent>() {
							@Override
							public void call(ButtonEvent e) {
								router.save("/mysite/user/sgurin/edit");
							}
						}));
				parent.appendChild("<div>Y.Router test - press the buttons to change route, and test back-forward browser buttons.</div>");

				content = parent.appendChild("<div>initial content</div>");

				RouteCallback callback1 = new RouteCallback() {
					@Override
					public void call(RouteRequest req, RouteResponse res, SimpleCallback next) {
						content.empty();
						content.append("<div>route 1 sais hello. Path: " + req.path() + "</div>");
					}
				};

				RouteCallback callback2 = new RouteCallback() {
					@Override
					public void call(RouteRequest req, RouteResponse res, SimpleCallback next) {
						content.empty();
						content.append("<div " + "style='background-color: red; color: white; font-weight: bold'>"
								+ "route 2 sais hello. Path: " + req.path() + ". Editing user id: "
								+ req.params().objGetString("userId") + ", action : "
								+ req.params().objGetString("action") + "</div>");
					}
				};

				router = Y.newRouter(RouterConfig
						.create()
						.root("/mysite")
						.routes(Route.create().path("/foo").callback(callback1)));
				router.route("/user/:userId/:action", callback2); 
			}
		});

	}

}
