package org.sgx.yuigwt.ui;

public class YUIBinderFactory {
/**
 * The shared instance.
 * @author sg
 */
private static YUIBinderFactory instance = new YUIBinderFactory();

/**
 * Private constructor.
 */
private YUIBinderFactory() {
	super();
}

/**
 * Returns this shared instance.
 *
 * @returns The shared instance
 */
public static YUIBinderFactory getInstance() {
	return instance;
}

public YUIBinder newYUIBinder() {
	return new YUIBinder1(); 
}
}
