package org.sgx.yuigwt.editors.event;

import java.util.HashMap;
import java.util.LinkedList;
import java.util.List;
import java.util.Map;
import java.util.logging.Level;
import java.util.logging.Logger;

import org.sgx.yuigwt.editors.Editor;

/**
 * for not populating editor classes, here are some utilities, for example,
 * registering valuechangelisteners and firing events notification helpers.
 * 
 * I have information about Editors -> valuechangelisteners and also backwards
 * for
 * 
 * because it cannot exists an AbstractEditor class we put this functionality in
 * this helper class
 * 
 * @author sg
 * 
 */
public class EditorEventManager<T> {
	static Logger logger = Logger.getLogger(EditorEventManager.class + "");
	private static EditorEventManager instance;

	private EditorEventManager() {
		valueChangeListeners = new HashMap<Editor<T>, List<ValueChangeListener<T>>>();
	}

	public static <F> EditorEventManager<F> getInstance() {
		if (null == instance) {
			instance = new EditorEventManager<F>();
		}
		return instance;
	}

	Map<Editor<T>, List<ValueChangeListener<T>>> valueChangeListeners;

	public void addValueChangeListener(Editor<T> ed, ValueChangeListener<T> l) {

		if (!valueChangeListeners.containsKey(ed)) {
			valueChangeListeners.put(ed, new LinkedList<ValueChangeListener<T>>());
		}
		valueChangeListeners.get(ed).add(l);

		// logger.log(Level.INFO,
		// "addValueChangeListener for ed: "+ed.getClass()+", listenerCount: "+valueChangeListeners.get(ed).size());
	}

	/**
	 * removes the listener l of the listener queue of editor ed.
	 * 
	 * @param ed
	 * @param l
	 */
	public void removeValueChangeListener(Editor<T> ed, ValueChangeListener<T> l) {
		if (!valueChangeListeners.containsKey(ed)) {
			valueChangeListeners.put(ed, new LinkedList<ValueChangeListener<T>>());
		}
		valueChangeListeners.get(ed).remove(l);
	}

	public void fireValueChangeEvent(Editor<T> ed, EditorValueChangeEvent<T> evt) {
		if (!valueChangeListeners.containsKey(ed)) {
			valueChangeListeners.put(ed, new LinkedList<ValueChangeListener<T>>());
		}
		// logger.log(Level.INFO,
		// "fireValueChangeEvent: "+valueChangeListeners.get(ed).size());
		// System.out.println("fireValueChangeEvent: "+valueChangeListeners.get(ed).size());
		for (ValueChangeListener<T> listener : valueChangeListeners.get(ed)) {
			listener.notifyValueChange(evt);
		}
	}

	public void fireValueChangeEvent(Editor<T> ed) {

		EditorValueChangeEvent<T> evt = new EditorValueChangeEvent<T>(ed, ed.flush());

		fireValueChangeEvent(ed, evt);
	}

	// public void fireValueChangeGwtEvent(Editor<T> ed,
	// com.google.gwt.event.logical.shared.ValueChangeEvent<T> event) {
	//
	// EditorValueChangeEvent<T> evt =
	// new EditorValueChangeEvent<T>(ed, event.getValue());
	//
	// fireValueChangeEvent(ed, evt);
	// }

}
