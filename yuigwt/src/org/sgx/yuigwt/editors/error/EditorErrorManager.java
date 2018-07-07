package org.sgx.yuigwt.editors.error;

import java.util.*;

import org.sgx.yuigwt.editors.Editor;

//import org.sgx.gwteditors.client.editor.Editor;
/**
 * because it cannot exists an AbstractEditor class we put this functionality in
 * this helper class
 * 
 * @author sg
 * 
 */
public class EditorErrorManager<T> {
	private static EditorErrorManager instance;

	private EditorErrorManager() {
		editorErrors = new HashMap<Editor<T>, List<EditorError<T>>>();
	}

	public static <T> EditorErrorManager<T> getInstance() {
		if (null == instance) {
			instance = new EditorErrorManager<T>();
		}
		return instance;
	}

	Map<Editor<T>, List<EditorError<T>>> editorErrors;

	public void setErrors(Editor<T> ed, List<EditorError<T>> errors) {
		editorErrors.put(ed, errors);
	}

	public void setError(Editor ed, EditorError er) {
		LinkedList<EditorError<T>> l = new LinkedList<EditorError<T>>();
		l.add(er);
		editorErrors.put(ed, l);
	}

	public void clearErrors(Editor<T> ed) {
		if (!editorErrors.containsKey(ed))
			editorErrors.put(ed, new LinkedList<EditorError<T>>());
		else
			editorErrors.get(ed).clear();
	}

	/**
	 * @param ed
	 * @return it will never return null
	 */
	public List<EditorError<T>> getErrors(Editor<T> ed) {
		if (!editorErrors.containsKey(ed))
			editorErrors.put(ed, new LinkedList<EditorError<T>>());
		return editorErrors.get(ed);
	}
}
