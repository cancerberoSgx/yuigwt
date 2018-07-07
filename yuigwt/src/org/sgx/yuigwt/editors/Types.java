package org.sgx.yuigwt.editors;

import java.util.LinkedList;
import java.util.List;
import java.util.logging.Logger;

import org.sgx.yuigwt.editors.props.PropertyHaver;
import org.sgx.yuigwt.editors.props.PropertyInfo;
import org.sgx.yuigwt.editors.util.Util;
import org.sgx.yuigwt.yui.node.Node;
import org.sgx.yuigwt.yui.util.LWMap;

import com.google.gwt.user.client.Window;

/**
 * a knowledge expert class about types. EditorFramework implementations are
 * responsible of registering its editor classes using this Types class see
 * EditorFramework1.
 * 
 * @author sg
 */
public class Types {
	static Logger logger = Logger.getLogger(Types.class + "");
	private static Types instance;

	private LWMap<String, Class<? extends Object>> typeToClass;
	/** types reversed */
	// private LWMap<Class<? extends Object>, String> classTypes;
	private LWMap<String, List<EditorCreator>> typeToEds;
	private LWMap<String, EditorCreator> editorNames;
	private LWMap<String, EditorCreator> typeToEd;

	private Types() {
		typeToClass = LWMap.create();
		typeToEds = LWMap.create();
		editorNames = LWMap.create();
		typeToEd = LWMap.create();
		// classTypes=LWMap.create();
	}

	public static Types getInstance() {
		if (null == instance) {
			instance = new Types();
		}
		return instance;
	}
	public void registerEditor(String editorName, String typeName, Class<? extends Object> typeClass, EditorCreator ed) {
		typeToClass.put(typeName, typeClass);
		// editorNames.put(ed.create().getEditorId(), ed);

		editorNames.put(editorName, ed);
		// classTypes.put(typeClass, typeName);
		if (typeToEds.get(typeName) == null) {
			typeToEds.put(typeName, new LinkedList<EditorCreator>());
		}
		typeToEds.get(typeName).add(ed);
	}

	/**
	 * creates an editor for editing a value of type type
	 * 
	 * @param type
	 *            the value type name to be edited
	 * @return
	 * @throws EditorNotFound
	 */
	public Editor newEditor(String type) throws EditorNotFound {
		// logger.log(Level.INFO, "requested editor of type "+type);
		if (typeToEds.get(type) == null || typeToEds.get(type).size() == 0)
			throw new EditorNotFound(type);
		else {
			// logger.log(Level.INFO,
			// "requested editor sussessfully of type "+type);
			return typeToEds.get(type).get(0).create();
		}
	}

	public Editor<?> newEditorNamed(String editorName) {
		if (editorNames.get(editorName) != null)
			return (Editor<?>) editorNames.get(editorName).create();
		else
			return null;
	}

	public Editor<?> newPropertyEditor(PropertyHaver ph, String propName) throws EditorNotFound {
		Editor<?> ed = null;
		PropertyInfo prop = ph.getProperties().get(propName);

		// Window.alert("ajjaja: "+prop.getEditorId());
		if (prop != null && Util.notNull(prop.getEditorId())) {
			ed = newEditorNamed(prop.getEditorId());
		}

		if (prop != null && prop.getType() != null && ed == null)
			ed = newEditor(prop.getType());

		return ed;
	}

	public boolean isValidEditorName(String editorName) {
		return typeToClass.get(editorName) != null;
	}

	public List<EditorCreator> getEditorsForType(String typeName) {
		return typeToEds.get(typeName);
	}

}
