package org.sgx.madrenecesidad.client.ui.editor;
/**
 * an editor is a visual object that is able to display to the user and let the user edit
 * the state of some object. This editor interface is totally independent of any underline GUI infrastructure.   
 * @author sg
 *
 * @param <T> the type this editors knows how to edit
 */
public interface MNEditor<T> {
T flush(); 
void load(T t); 
}
