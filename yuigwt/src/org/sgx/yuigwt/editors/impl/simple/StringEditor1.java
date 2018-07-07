package org.sgx.yuigwt.editors.impl.simple;

import java.util.List;

import org.sgx.yuigwt.editors.error.EditorError;
import org.sgx.yuigwt.editors.error.EditorErrorManager;
import org.sgx.yuigwt.editors.event.EditorEventManager;
import org.sgx.yuigwt.editors.impl.AbstractEditor;
import org.sgx.yuigwt.yui.YuiContext;
import org.sgx.yuigwt.yui.node.Node;
import org.sgx.yuigwt.yui.util.Callback;

import com.google.gwt.core.client.JsArrayMixed;

public class StringEditor1 extends AbstractEditor<String> {

	
	public StringEditor1(YuiContext y) {
		super(y, true);
		 
	}

//	
//	public boolean isSimple() {
//		return true;
//	}
	
	
	public void render(Node parent) {		
		super.render(parent);
		srcNode = parent.appendChild("<input type=\"text\"></input>"); 
		srcNode.on("click", new Callback() {			
			
			public void call(JsArrayMixed args) {
				EditorEventManager.<String>getInstance().fireValueChangeEvent(StringEditor1.this); 
			}
		});
	}
	

	
	public String flush() {
		String s = srcNode.getString("value");
		return s; 
	}

	
	public void load(String t) {
		super.load(t);
		srcNode.set("value", t); 
	}
	
//	
//	public Node getWidget() {
//		return this.node;
//	}
//	
//	
//	public List<EditorError<String>> getErrors() {
//		return EditorErrorManager.<String>getInstance().getErrors(this);
//	}

}
