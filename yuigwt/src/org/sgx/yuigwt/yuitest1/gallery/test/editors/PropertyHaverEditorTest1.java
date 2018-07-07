package org.sgx.yuigwt.yuitest1.gallery.test.editors;

import org.sgx.yuigwt.editors.event.EditorValueChangeEvent;
import org.sgx.yuigwt.editors.event.ValueChangeListener;
import org.sgx.yuigwt.editors.impl.EditorFramework1;
import org.sgx.yuigwt.editors.impl.complex.PropertyHaverEditor2;
import org.sgx.yuigwt.editors.props.PropertyHaver;
import org.sgx.yuigwt.editors.props.PropertyHaverUtil;
import org.sgx.yuigwt.editors.props.PropertyInfo;
import org.sgx.yuigwt.yui.YUI;
import org.sgx.yuigwt.yui.YUICallback;
import org.sgx.yuigwt.yui.YuiContext;
import org.sgx.yuigwt.yui.console.Console;
import org.sgx.yuigwt.yui.node.Node;
import org.sgx.yuigwt.yui.util.LWOMap;
import org.sgx.yuigwt.yuitest1.gallery.GalleryConstants;
import org.sgx.yuigwt.yuitest1.gallery.test.AbstractTest;
import org.sgx.yuigwt.yuitest1.gallery.test.TestResources;

import com.google.gwt.user.client.Window;
/**
 * PropertyHaverEditorTest1
 * @author sg
 *
 */
public class PropertyHaverEditorTest1 extends AbstractTest {

protected Console console;

public PropertyHaverEditorTest1() {
	super("propertyHaverEditorTest1", "propertyHaverEditorTest1", 
		new String[]{GalleryConstants.TAG_EXT, GalleryConstants.TAG_EDITOR}, 
		TestResources.instance.editors_PropertyHaverEditorTest1());
}


/** the java class (a PropertyHaver) to be edited in this test. 
 * @author sg
 */
public static class Person implements PropertyHaver {		

	//what follows is a common java bean definition
	
	String name;
	Integer age;
	Boolean male;
	
	//getters & setters, not neccesary...
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
	public Boolean getMale() {
		return male;
	}
	public void setMale(Boolean male) {
		this.male = male;
	}		
	
	@Override
	public String toString() {
		return "Person "+name; 
	}
	//what follows is the part we need to implement PropertyHaver for the neccesary reflection info
	// property types definition
	static private LWOMap<String, PropertyInfo> _props = 
			PropertyHaverUtil.buildPropMap(new PropertyInfo[]{
					new PropertyInfo("age", EditorFramework1.TYPE_INTEGER),
					new PropertyInfo("name", EditorFramework1.TYPE_STRING),
					new PropertyInfo("male", EditorFramework1.TYPE_BOOLEAN)
			});
	
			
	public LWOMap<String, PropertyInfo> getProperties() {
		return _props;
	}		
	
	//property accessors
	@Override
	public Object getProperty(String prop) {			
		if(prop.equals("age"))
			return age;
		else 
			if(prop.equals("name"))
			return name;
		else if(prop.equals("male"))
			return male;
		else return null;
	}
	
	@Override
	public void setProperty(String prop, Object val) {
		if(prop.equals("age"))
			setAge((Integer) val);
		else 
			if(prop.equals("name"))
			setName((String)val);
		else if(prop.equals("male"))
			setMale((Boolean)val);
	}	
}


@Override
public void test(final Node parent) {
YUI.Use(new String[]{"node", "button", "console"}, new YUICallback() {
	
	@Override
	public void ready(final YuiContext Y) {
		EditorFramework1 edf = new EditorFramework1();
		edf.start(Y); 
		
		Person p1 = new Person();		
		p1.setName("mephistos"); 
		p1.setMale(true);
		p1.setAge(22); 
		
		PropertyHaverEditor2<Person> ed1 = new PropertyHaverEditor2<PropertyHaverEditorTest1.Person>(Y);
		
		ed1.render(parent); 
		ed1.load(p1); 
		
		ed1.addValueChangeListener(new ValueChangeListener<PropertyHaverEditorTest1.Person>() {

			@Override
			public void notifyValueChange(EditorValueChangeEvent<Person> evt) {
				Window.alert("changed:_ "+evt.getValue()); 
			}
		}); 
		
		
	}
}); 
}

}
