package org.sgx.madrenecesidad.client.trash.ui_old;

import org.sgx.madrenecesidad.client.MNConstants;
import org.sgx.madrenecesidad.client.trash.test.maptests.MapTestMain;
import org.sgx.madrenecesidad.client.trash.ui_old.admin.AdminPanel1;
import org.sgx.madrenecesidad.client.trash.ui_old.tag.TagCrud;
import org.sgx.yuigwt.yui.YUI;
import org.sgx.yuigwt.yui.YUICallback;
import org.sgx.yuigwt.yui.YuiContext;
import org.sgx.yuigwt.yui.console.Console;
import org.sgx.yuigwt.yui.event.EventCallback;
import org.sgx.yuigwt.yui.node.Node;
import org.sgx.yuigwt.yui.widget.button.ButtonConfig;
import org.sgx.yuigwt.yui.widget.button.ButtonEvent;

public class Main {
	private static Main instance;

	private Main() {
	}

	public static Main getInstance() {
		if (null == instance) {
			instance = new Main();
		}
		return instance;
	}

	protected static YuiContext y;
	protected Node parent;
	protected Node leftCol;
	protected Node rightCol;
	// protected MainController mainController;
	private TagCrud tagsCrud;
	private AdminPanel1 adminPanel1;
	private Console console;
	private MapTestMain mapTestMain;

	public void start() {

		YUI.Use(UIUtils.getInstance().initialModules(), new YUICallback() {
			@Override
			public void ready(final YuiContext Y) {
				Main.y = Y;
				test1();
			}
		});

	}

	private void test1() {
		console = y.newConsole();
		if (MNConstants.develmode) {
			console.render();
		}

		// mainController = new MainController(y);

		parent = y.one("body");
		parent.addClass("yui3-skin-sam");
		parent.append("<div class=\"yui3-g\">" + "<div class=\"yui3-u-1-5\" id=\"tableCrudCol1\"></div>"
				+ "<div class=\"yui3-u-4-5\" id=\"tableCrudCol2\"></div>" + "</div>");
		leftCol = parent.one("#tableCrudCol1");
		y.newButton(ButtonConfig.create().label("Tags admin").render(leftCol)
				.on("click", new EventCallback<ButtonEvent>() {
					@Override
					public void call(ButtonEvent e) {
						showTagsPanel();
					}
				}));
		y.newButton(ButtonConfig.create().label("ADMIN (only for testing)").render(leftCol)
				.on("click", new EventCallback<ButtonEvent>() {
					@Override
					public void call(ButtonEvent e) {
						doAdminTestingPanel1();
					}
				}));

		y.newButton(ButtonConfig.create().label("map tests").render(leftCol)
				.on("click", new EventCallback<ButtonEvent>() {
					@Override
					public void call(ButtonEvent e) {
						doMapTest1();
					}
				}));

		// y.newButton(ButtonConfig.create().label("rpcsync1").render(leftCol).
		// on("click", new EventCallback<ButtonEvent>() {
		// @Override
		// public void call(ButtonEvent e) {
		// new ChannelRpcSyncTest1(y).test();
		// }
		// })
		// );

		rightCol = parent.one("#tableCrudCol2");
	}

	protected void doMapTest1() {
		rightCol.empty();
		if (mapTestMain == null)
			mapTestMain = new MapTestMain(y);
		mapTestMain.render(rightCol);
	}

	protected void doAdminTestingPanel1() {
		rightCol.empty();
		if (adminPanel1 == null)
			adminPanel1 = new AdminPanel1(y);
		adminPanel1.render(rightCol);
	}

	protected void showTagsPanel() {
		rightCol.empty();
		if (tagsCrud == null)
			tagsCrud = new TagCrud(y);
		tagsCrud.render(rightCol);
	}

	public Console getConsole() {
		return console;
	}
}
