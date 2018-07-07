package org.sgx.yuigwt.editors.impl;

import org.sgx.yuigwt.editors.Editor;
import org.sgx.yuigwt.editors.EditorCreator;
import org.sgx.yuigwt.editors.Types;
import org.sgx.yuigwt.editors.basetypes.Color;
import org.sgx.yuigwt.editors.impl.complex.PropertyHaverEditor2;
import org.sgx.yuigwt.editors.impl.simple.BooleanEditor1;
import org.sgx.yuigwt.editors.impl.simple.ColorEditor;
import org.sgx.yuigwt.editors.impl.simple.IntegerEditor1;
import org.sgx.yuigwt.editors.impl.simple.StringEditor1;
import org.sgx.yuigwt.editors.props.PropertyHaver;
import org.sgx.yuigwt.editors.util.Util;
import org.sgx.yuigwt.yui.YuiContext;

public class EditorFramework1
// implements EditorFramework
{

	public static final String TYPE_INTEGER = "integer", TYPE_DOUBLE = "double", TYPE_DATE = "date", TYPE_DATETIME = "datetime", TYPE_BOOLEAN = "boolean", TYPE_STRING = "string",
			TYPE_LISTSINGLE = "list single", TYPE_LISTMULTIPLE = "list multple", TYPE_PROPERTYHAVER = "property haver", TYPE_COLOR = "color",
			TYPE_INRANGEDOUBLE = "double in range", TYPE_INRANGEINTEGER = "integer in range";

	public static final String[] EDITOR_ALL = { TYPE_INTEGER, TYPE_DOUBLE, TYPE_DATE, TYPE_DATETIME, TYPE_BOOLEAN, TYPE_STRING, TYPE_LISTSINGLE, TYPE_LISTMULTIPLE,
			TYPE_PROPERTYHAVER, TYPE_COLOR, TYPE_INRANGEINTEGER, TYPE_INRANGEDOUBLE };

	private boolean started = false;

	private YuiContext y;

	public void restart(YuiContext y) {
		started = false;
		start(y);
	}

	// 
	public void start(final YuiContext y) {

		if (started)
			return;

		this.y = y;

		started = true;
		Types types = Types.getInstance();

		types.registerEditor("BooleanEditor1", TYPE_BOOLEAN, Boolean.class, new EditorCreator<Boolean>() {
			
			public Editor<Boolean> create() {
				return new BooleanEditor1(y);
			}
		});

		types.registerEditor("StringEditor1", TYPE_STRING, String.class, new EditorCreator<String>() {
			
			public Editor<String> create() {
				return new StringEditor1(y);
			}
		});

		types.registerEditor("IntegerEditor1", TYPE_INTEGER, Integer.class, new EditorCreator<Integer>() {
			
			public Editor<Integer> create() {
				return new IntegerEditor1(y);
			}
		});

		types.registerEditor("IntegerEditor1", TYPE_COLOR, Color.class, new EditorCreator<Color>() {
			
			public Editor<Color> create() {
				return new ColorEditor(y);
			}
		});

		types.registerEditor("IntegerEditor1", TYPE_PROPERTYHAVER, PropertyHaver.class, new EditorCreator<PropertyHaver>() {
			
			public Editor<PropertyHaver> create() {
				return new PropertyHaverEditor2<PropertyHaver>(y);
			}
		});

	}

	public static boolean isValidEditorName(String editorName) {
		return Util.contains(EDITOR_ALL, editorName);
	}

}
