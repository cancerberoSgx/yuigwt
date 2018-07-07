package org.sgx.yuigwt.editors.impl.simple;

import java.util.List;

import org.sgx.yuigwt.editors.basetypes.Color;
import org.sgx.yuigwt.editors.error.EditorError;
import org.sgx.yuigwt.editors.impl.AbstractEditor;
import org.sgx.yuigwt.yui.YuiContext;
import org.sgx.yuigwt.yui.event.EventCallback;
import org.sgx.yuigwt.yui.event.EventFacade;
import org.sgx.yuigwt.yui.node.Node;
import org.sgx.yuigwt.yuigallery.YuiGalleryContext;
import org.sgx.yuigwt.yuigallery.colorpicker.ColorPicker;

/**
 * a simple color editor that shows a clickable color label that will show the
 * gallery-colorpicker widget for color choosing.
 * 
 * @author sg
 * 
 */
public class ColorEditor extends AbstractEditor<Color> {
	public ColorEditor(YuiContext y) {
		super(y, true);
	}
	@Override
	public void render(Node parent) {
		super.render(parent);
		srcNode = parent.appendChild("<span></span>"); 
	}
	@Override
	public void load(Color model) {
		super.load(model);
		String htmlColor = "#"+model.getHex(); 
		srcNode.text(htmlColor); 
		srcNode.setStyle("background-color", htmlColor);
		srcNode.on("click", new EventCallback<EventFacade>() {
			@Override
			public void call(EventFacade e) {
				ColorPicker cp1 = getColorPicker(); 
				cp1.show(); 
			}
		}); 
	}
	protected ColorPicker getColorPicker() {		
		ColorPicker cp = getGalleryContext().newColorPicker();
		cp.render(getGalleryContext().one("body"));
		cp.hide(); 
		return cp; 
	}
	@Override
	public Color flush() {
		// TODO Auto-generated method stub
		return null;
	}

}
