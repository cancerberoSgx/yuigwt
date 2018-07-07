package org.sgx.yuigwt.editors.bean;

import java.lang.annotation.*;

/**
 * <p> object writers can annotate POJOS getters or setters of properties with this
 * annotation for specifying the class name of the desired editor to edit the
 * property, for example</p>
 * 
 * <pre>
 * &#064;UseEditor(description = &quot;description1&quot;, editorName = &quot;org.sgx.gwteditors.client.impl1.simple.IntegerEditorEntry2&quot;, label = &quot;Coeficiente intelectual de la luna&quot;)
 * public Integer getMeasureOne() {
 * 	return measureOne;
 * }
 * </pre>
 * 
 * @author sg
 * 
 */
@Retention(RetentionPolicy.RUNTIME)
@Target(ElementType.METHOD)
public @interface UseEditor {
	/**
	 * optional, specify a custom editor, must correspond to an editor id in the
	 * framework.
	 * 
	 * @return
	 */
	String editorName() default "";

	String description() default "";

	/**
	 * for putting an internationalized bean property name.
	 * 
	 * @return
	 */
	String label() default "";

	/**
	 * some editors accept config params in json objectformat {param1: "val1",
	 * param2: 123}
	 * 
	 * @return
	 */
	String params() default "";
}
