package org.sgx.madrenecesidad.client.trash.place;

import java.util.HashMap;
import java.util.Map;

import org.sgx.yuigwt.yui.YuiConfig;
import org.sgx.yuigwt.yui.YuiContext;
import org.sgx.yuigwt.yui.event.EventCallback;
import org.sgx.yuigwt.yui.history.History;
import org.sgx.yuigwt.yui.history.HistoryEvent;
import org.sgx.yuigwt.yui.util.JsObject;
import org.sgx.yuigwt.yui.util.JsUtil;

import com.google.gwt.core.client.JavaScriptObject;

/**
 * 
 * @author sg
 * 
 */
public class StateManager {

	public static final String HISTORY_STATE_NAME = "stateName", HISTORY_STATE_DATA = "stateData";

	Map<String, State> states;
	String currentStateName;
	protected YuiContext y;
	History history;

	public StateManager(final YuiContext y) {
		this.y = y;
		states = new HashMap<String, State>();
		history = y.newHistoryHash(); // y.newHistory();

		registerAllStates();
		y.on(History.EVENT_HISTORYCHANGE, new EventCallback<HistoryEvent>() {
			@Override
			public void call(HistoryEvent e) {
				// Ignore changes we make ourselves, since we don't need
				// to update the selection state for those. We're only
				// interested in outside changes, such as the ones generated
				// when the user clicks the browser's back or forward buttons.
				if (e.src().equals(y.HistoryHash().SRC_HASH())) {

					String removedStateName = e.removed().objGetString(HISTORY_STATE_NAME);
					if (removedStateName != null & states.containsKey(removedStateName)) {
						State removedState = states.get(removedStateName);
						removedState.stop();
					}

					String newStateName = e.changed().objGetString(HISTORY_STATE_NAME);
					if (newStateName != null & states.containsKey(newStateName)) {
						State newState = states.get(newStateName);
						newState.start();
					}
				}
			}
		});

	}

	private void registerAllStates() {
		ChannelListUi ui = new ChannelListUi(y);
		ChannelListState s = new ChannelListState(y, JavaScriptObject.createObject(), ui);
		states.put(s.getName(), s);
	}

	public State getState(String name) {
		return states.get(name);
	}

	public void changeToState(String stateName, JavaScriptObject data) {
		if (currentStateName != null && currentStateName.equals(stateName))
			return;
		if (states.containsKey(stateName)) {
			currentStateName = stateName;
			State s = states.get(stateName);
			loadStateIntoHistory(history, s);
			s.start();
		} else
			throw new RuntimeException("State " + stateName + " not found. ");
	}

	public static void loadStateIntoHistory(History h, State s) {
		JsObject data = JsUtil.cloneObject(s.getData()).cast();
		JsObject ret = JsObject.one(HISTORY_STATE_NAME, s.getName()).objPut(HISTORY_STATE_DATA, data);
		h.add(ret);
	}

	public static String fromHistoryStateName(History h) {
		JsObject stateData = h.get().cast();
		return stateData.objGetString(HISTORY_STATE_NAME);
	}

	public static JavaScriptObject fromHistoryStateData(History h) {
		return h.get();
	}

}
