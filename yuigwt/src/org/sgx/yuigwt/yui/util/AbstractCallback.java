package org.sgx.yuigwt.yui.util;
/**
 * abstract callback class with single param of type P and return value of type R  
 * @author sg
 *
 */
public interface AbstractCallback<R,P> {
R call(P p); 
}
