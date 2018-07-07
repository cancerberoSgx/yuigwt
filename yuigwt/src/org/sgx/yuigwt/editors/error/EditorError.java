package org.sgx.yuigwt.editors.error;

import org.sgx.yuigwt.editors.Editor;

public interface EditorError<T> {
	String getMessage();
	Editor<T> getSource();
}
