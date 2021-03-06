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

public class IntegerEditor1 extends AbstractEditor<Integer> {

	
	public IntegerEditor1(YuiContext y) {
		super(y, true);
//		setSrcNodeTag(srcNodeTag)
		
	}
	
	
	public void render(Node parent) {		
		super.render(parent);
		Node src = parent.appendChild("<input type=\"text\"></input>"); 
		src.on("click", new Callback() {			
			
			public void call(JsArrayMixed args) {
				EditorEventManager.<Integer>getInstance().fireValueChangeEvent(IntegerEditor1.this); 
			}
		}); 
		this.setSrcNode(src); 
	}

//	
//	public boolean isSimple() {
//		return true;
//	}

	
	public Integer flush() {
		String s = getSrcNode().getString("value");
		try {
			return Integer.parseInt(s);	
		} catch (Exception e) {
			return null; 
		} 
	}

	
	public void load(Integer t) {
		super.load(t);
		getSrcNode().set("value", t+""); 
	}
	
//	
//	public Node getWidget() {
//		return this.node;
//	}
//	
//	
//	public List<EditorError<Integer>> getErrors() {
//		return EditorErrorManager.<Integer>getInstance().getErrors(this);
//	}

}
