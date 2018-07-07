package org.sgx.madrenecesidad.client.app.router;

import org.sgx.madrenecesidad.client.usecase.UseCase;


/**
 * The Router is responsible of presenting UseCases with bookmarkable URLs. 
 * Converts from and between UseCase and urls
 * 
 * 
 * @author sg
 * 
 */
public interface MNRouter {
	/**
	 * gets and configure the usecase corresponding to the given url. 
	 * @param url
	 * @return
	 */
	UseCase getUseCaseFor(String url); 
	void push(UseCase u); 
	
}
