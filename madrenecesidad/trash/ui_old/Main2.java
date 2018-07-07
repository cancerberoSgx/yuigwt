package org.sgx.madrenecesidad.client.trash.ui_old;

import org.sgx.madrenecesidad.client.MNConstants;
import org.sgx.madrenecesidad.client.trash.place.StateManager;
import org.sgx.yuigwt.yui.YUI;
import org.sgx.yuigwt.yui.YUICallback;
import org.sgx.yuigwt.yui.YuiContext;
import org.sgx.yuigwt.yui.console.Console;
import org.sgx.yuigwt.yui.node.Node;

import com.google.gwt.core.client.JavaScriptObject;

public class Main2 {
	private static Main2 instance;

	private Main2() {
	}

	public static Main2 getInstance() {
		if (null == instance) {
			instance = new Main2();
		}
		return instance;
	}

	protected static YuiContext y;
	protected Node parent;
	private Console console;
	private StateManager stateManager;

	public void start() {

		YUI.Use(UIUtils.getInstance().initialModules(), new YUICallback() {
			@Override
			public void ready(final YuiContext Y) {
				Main2.y = Y;
				test1();
			}
		});

	}

	private void test1() {
		y.one("body").addClass("yui3-skin-sam");
		console = y.newConsole();
		if (MNConstants.develmode) {
			console.render();
		}

		stateManager = new StateManager(y);
		stateManager.changeToState("channelList", JavaScriptObject.createObject());
	}

	public Console getConsole() {
		return console;
	}
}
