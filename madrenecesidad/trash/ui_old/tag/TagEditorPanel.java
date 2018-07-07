package org.sgx.madrenecesidad.client.trash.ui_old.tag;

import org.sgx.yuigwt.yui.widget.panel.Panel;
/**
 * Simple class for hosting a Panel and a Editor together. 
 * @author sg
 *
 */
public class TagEditorPanel {
Panel panel; 
TagEditor editor;
public TagEditorPanel(Panel panel, TagEditor editor) {
	super();
	this.panel = panel;
	this.editor = editor;
}
public Panel getPanel() {
	return panel;
}
public void setPanel(Panel panel) {
	this.panel = panel;
}
public TagEditor getEditor() {
	return editor;
}
public void setEditor(TagEditor editor) {
	this.editor = editor;
} 

}
