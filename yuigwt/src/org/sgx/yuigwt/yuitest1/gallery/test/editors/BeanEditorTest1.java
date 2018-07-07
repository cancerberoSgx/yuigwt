package org.sgx.yuigwt.yuitest1.gallery.test.editors;

import org.sgx.yuigwt.editors.basetypes.Color;
import org.sgx.yuigwt.editors.bean.EditableBean;
import org.sgx.yuigwt.editors.event.EditorValueChangeEvent;
import org.sgx.yuigwt.editors.event.ValueChangeListener;
import org.sgx.yuigwt.editors.impl.EditorFramework1;
import org.sgx.yuigwt.editors.impl.complex.PropertyHaverEditor2;
import org.sgx.yuigwt.editors.props.PropertyHaverUtil;
import org.sgx.yuigwt.yui.YUI;
import org.sgx.yuigwt.yui.YUICallback;
import org.sgx.yuigwt.yui.YuiContext;
import org.sgx.yuigwt.yui.console.Console;
import org.sgx.yuigwt.yui.node.Node;
import org.sgx.yuigwt.yuitest1.gallery.GalleryConstants;
import org.sgx.yuigwt.yuitest1.gallery.test.AbstractTest;
import org.sgx.yuigwt.yuitest1.gallery.test.TestResources;

import com.google.gwt.core.client.GWT;
import com.google.gwt.user.client.Window;
/**
 * BeanEditorTest1
 * @author sg
 *
 */
public class BeanEditorTest1 extends AbstractTest {

protected Console console;

public BeanEditorTest1() {
	super("beaneditor1", "beaneditor1", 
		new String[]{GalleryConstants.TAG_EXT, GalleryConstants.TAG_EDITOR}, 
		TestResources.instance.editors_BeanEditorTest1());
}


public void test(final Node parent) {
YUI.Use(new String[]{"node", "button", "console", "panel"}, new YUICallback() {
	
	
	public void ready(final YuiContext Y) {
		EditorFramework1 edf = new EditorFramework1();
		edf.start(Y); 
		
		Person1 p1 = GWT.create(Person1.class); 
		p1.setName("mephistos"); 
		p1.setFemale(true);
		p1.setAge(22);  
		
		Car c1 = GWT.create(Car.class); 
		c1.setBrand("Fiat"); 
		c1.setColor(new Color("ff2244")); 
		
		p1.setCar(c1); 
		
//		System.out.println(PropertyHaverUtil.dump(p1));
//		System.out.println(PropertyHaverUtil.dump(c1));
		
		
		PropertyHaverEditor2<Person1> ed1 = new PropertyHaverEditor2<Person1>(Y);
		ed1.render(parent); 
		ed1.load(p1); 
		
		ed1.addValueChangeListener(new ValueChangeListener<Person1>() {
			
			public void notifyValueChange(EditorValueChangeEvent<Person1> evt) {
				Window.alert("changed:_ "+evt.getValue()); 
			}
		}); 
	}
}); 
}


/**
 * the java bean we want to edit
 * @author sg
 *
 */
public static abstract class Person1 implements EditableBean {
	String name; 
	Integer age; 
	Boolean female;
	Car car; 
	public Person1() {
		super();
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public Integer getAge() {
		return age;
	}
	public void setAge(Integer age) {
		this.age = age;
	}
	public Boolean getFemale() {
		return female;
	}
	public void setFemale(Boolean female) {
		this.female = female;
	}
	public Car getCar() {
		return car;
	}
	public void setCar(Car car) {
		this.car = car;
	}
}

public static abstract class Car  implements EditableBean{
	Color color; 
	String brand; 
	Boolean motorcycle;
	public Color getColor() {
		return color;
	}
	public void setColor(Color color) {
		this.color = color;
	}
	public String getBrand() {
		return brand;
	}
	public void setBrand(String brand) {
		this.brand = brand;
	}
	public Boolean getMotorcycle() {
		return motorcycle;
	}
	public void setMotorcycle(Boolean motorcycle) {
		this.motorcycle = motorcycle;
	}	
	
//	
//	public String toString() {
//		String s = "PropertyHaver("; 
//		props = getProperties()
//		return s+")"; 
//	}
}
}
