package org.sgx.yuigwt.editors.impl.complex;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

import org.sgx.yuigwt.editors.Editor;
import org.sgx.yuigwt.editors.error.AbstractEditorError;
import org.sgx.yuigwt.editors.error.EditorError;
import org.sgx.yuigwt.editors.props.PropertyHaver;

//import org.sgx.gwteditors.client.editor.Editor;
//import org.sgx.gwteditors.client.editor.error.AbstractEditorError;
//import org.sgx.gwteditors.client.editor.error.EditorError;
//import org.sgx.gwteditors.client.editor.props.PropertyHaver;

public class PropertyHaverEditorError<T extends PropertyHaver> extends AbstractEditorError<T>{

	private Map<String, List<EditorError>> fieldErrors;
	
	public PropertyHaverEditorError(Editor<T> source) {
		super("", source);
		fieldErrors=new HashMap<String, List<EditorError>>();
	}
	
	public void putFieldError(String fieldName,  List<EditorError> er) {
		setMessage(toString());
		fieldErrors.put(fieldName, er);
	};
	public Map<String, List<EditorError>> getFieldErrors() {
		setMessage(toString());
		return fieldErrors;
	}
	
	public String toString() {
		String s = this.getClass()+" nested errors: ";
		for(String fn : fieldErrors.keySet()) {
			s+="------ "+fn+": "; 
			for(EditorError fe : fieldErrors.get(fn)) {
				s+=fe.getClass()+", ";
			}
			
		}
		return s;
	}

}
