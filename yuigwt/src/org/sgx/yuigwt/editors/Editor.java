package org.sgx.yuigwt.editors;

import java.util.List;

import org.sgx.yuigwt.editors.error.EditorError;
import org.sgx.yuigwt.editors.event.ValueChangeListener;

/**
 * an editor is responsible for letting the user view and manipulate an object.
 * Then the programmer can flush the current object state back.
 * 
 * @author sg
 * 
 * @param <T>
 *            the type being edited by this editor
 */
public interface Editor<T> extends Ui {

	/**
	 * "the value was modified by the user" notification. For example, if you
	 * wan to bt notified when user type, or clicks or select something..
	 */
	void addValueChangeListener(ValueChangeListener<T> l);

	void removeValueChangeListener(ValueChangeListener<T> l);

	/**
	 * load current editor status to the model object and returns it. The same
	 * object passed in load() will be written on flush(), so be careful to be
	 * careful with objects Also flush() is responsible of validating the editor
	 * state (@see getErrors())
	 * 
	 * @return the edited version of the object or null if an error occurrs
	 */
	T flush();

	/**
	 * 
	 * @return never return null.
	 */
	List<EditorError<T>> getErrors();

	/**
	 * sets the model object and load it to this editor. calling load() should
	 * not imply calling this editor value change listeners.
	 * 
	 * @param model
	 */
	void load(T model);

	// Node getWidget();
	/**
	 * Complex editors have other editors inside and should return false here.
	 * Other definition is, editors of inmutable types should return true here
	 * and editors for collection, objects and other complex datatypes should
	 * return false here.
	 * 
	 * @return
	 */
	boolean isSimple();

	// String getEditorId();
	// String[]getEditorTypesSupported();

}
