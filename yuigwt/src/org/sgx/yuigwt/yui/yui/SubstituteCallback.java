package org.sgx.yuigwt.yui.yui;
/**
 * instances can be used to process each match of Y.substitute(). It receives the key, value, and any extra metadata included with the key inside of the braces.
 * @author sg
 *
 * @param <T>
 */
public interface SubstituteCallback<T> {
/**
 * this method can be used to process each match. It receives the key, value, and any extra 
 * metadata included with the key inside of the braces.
 * @param key
 * @param value - the value founded in passed context object to Y.substitute() or null if none
 * @param metadata - the data passed inside of the braces. 
 * @return
 */
String call(String key, String value, T metadata);
}
