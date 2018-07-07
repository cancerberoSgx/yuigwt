package org.sgx.yuigwt.editors.util;

import com.google.gwt.user.client.ui.DialogBox;
/**
 * 
 * @author sg
 *
 */
public interface AcceptCancelDialogListener {
	void notifyAccept(DialogBox db);

	void notifyCancel(DialogBox db);
}