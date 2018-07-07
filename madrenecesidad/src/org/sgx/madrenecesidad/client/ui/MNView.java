package org.sgx.madrenecesidad.client.ui;

import org.sgx.madrenecesidad.client.presenter.Presenter;

import com.google.gwt.dom.client.Element;
import com.google.gwt.user.client.ui.IsWidget;

public interface MNView extends IsWidget {
Presenter getPresenter(); 
void setPresenter(Presenter p);
//Widget getElement(); 
void addReadyListener(MNViewReadyListener l); 
}
