package org.sgx.madrenecesidad.client.trash.ui_old.crud;

import java.util.List;

public interface Crud<T> {
void add(T t); 
void update(T t); 
void delete(T t); 
List<T> search(String keywords); 
}
