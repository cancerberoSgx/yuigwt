package org.sgx.madrenecesidad.client.app.state;

import java.util.LinkedList;
import java.util.List;

import org.sgx.madrenecesidad.client.model.MapView;
import org.sgx.madrenecesidad.client.model.UserStateModel;

/**
 * a client object with all initial information and state about current user, like its owned channels, mapviews, etc. a ClientContext.getUserState() object will be mantained and
 * synch in the client.
 * 
 * @author sg
 * 
 */
public class UserState {
	UserStateModel model; 
	public UserState(UserStateModel model) {
		listeners = new LinkedList<UserStateChangeListener>();
		this.model=model; 
	}

	List<UserStateChangeListener> listeners;

	public void notifyModelChange() {
		for(UserStateChangeListener l : listeners) {
			l.mapViewsChanged(); 
		}
	}
	public boolean addListener(UserStateChangeListener e) {
		return listeners.add(e);
	}

	public boolean removeListener(UserStateChangeListener o) {
		return listeners.remove(o);
	}

	public UserStateModel getModel() {
		return model;
	}

	public void setModel(UserStateModel model) {
		this.model = model;
	}

	
}
