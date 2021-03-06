package org.sgx.yuigwt.editors.impl.simple;

import java.util.List;

import org.sgx.yuigwt.editors.error.EditorError;
import org.sgx.yuigwt.editors.error.EditorErrorManager;
import org.sgx.yuigwt.editors.event.EditorEventManager;
import org.sgx.yuigwt.editors.impl.AbstractEditor;
import org.sgx.yuigwt.editors.impl.EditorFramework1;
import org.sgx.yuigwt.yui.YuiContext;
import org.sgx.yuigwt.yui.node.Node;
import org.sgx.yuigwt.yui.util.Callback;

import com.google.gwt.core.client.JsArrayMixed;

public class BooleanEditor1 extends AbstractEditor<Boolean> {

	
	public BooleanEditor1(YuiContext y) {
		super(y, true);
//		this.node = 
		
	}

	
	public void render(Node parent) {
		super.render(parent);
		srcNode = parent.appendChild("<input type=\"checkbox\"></input>"); 
		this.getSrcNode().on("click", new Callback() {			
			
			public void call(JsArrayMixed args) {
				EditorEventManager.<Boolean>getInstance().fireValueChangeEvent(BooleanEditor1.this); 
//				EditorValueChangeEvent<Boolean> evt = 
//						new EditorValueChangeEvent<Boolean>(BooleanEditor.this, BooleanEditor.this.node.getBoolean("checked"));
//				.fireValueChangeGwtEvent(this, evt);	
			}
		}); 
	}

	
	public Boolean flush() {
		boolean s = this.getSrcNode().getBoolean("checked");
//		Window.alert(s); 
		return s; 
	}

	
	public void load(Boolean t) {
		super.load(t); 
//		this.model = t;
//		setValue(t);
	}
	
//	
//	public Node getWidget() {
//		return this.node;
//	}
	
//	
//	public List<EditorError<Boolean>> getErrors() {
//		return EditorErrorManager.<Boolean>getInstance().getErrors(this);
//	}

//	
//	public String getEditorId() {
//		return EditorManager1.getInstance().getEditorName(this);		
//	}

//	
//	public String[] getEditorTypesSupported() {
//		return new String[]{EditorFramework1.TYPE_BOOLEAN}; 
//	}
}
