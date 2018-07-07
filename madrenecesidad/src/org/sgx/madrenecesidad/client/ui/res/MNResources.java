package org.sgx.madrenecesidad.client.ui.res;

import org.sgx.madrenecesidad.client.ui.res.css.MainStyle;

import com.google.gwt.resources.client.ClientBundle;
import com.google.gwt.resources.client.ImageResource;

/**
 * Resources used by the entire application.
 */
public interface MNResources extends ClientBundle {
	@Source("css/main.css")
	MainStyle style();

	@Source("icons/save_16x16.png")
	ImageResource saveIcon();

	@Source("icons/delete_16x16.png")
	ImageResource deleteIcon();

}