package org.sgx.madrenecesidad.client.trash.ui_old;
/**
 * 
 * @author sg
 *
 * @param <T> - the type to edit
 */
public interface Editor<T> extends Ui {
void load(T t); 
T flush(); 
}
