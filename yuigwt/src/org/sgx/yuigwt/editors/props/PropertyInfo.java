package org.sgx.yuigwt.editors.props;

/**
 * 
 * This class represents a Property in the PropertyHaver hierrarchy. It can be
 * configured using java annotation
 * org.sgx.gwteditors.client.impl1.edbean.UseEditor and reflect the information
 * runtime
 * 
 * attributes: name: the property name (ie. the property's bean name) type: the
 * property type name declared or detected, for example "integer" - values
 * defined at fram impl description: the property description label: the
 * property label (nice internationalied name for show.) editorId: editor id to
 * use - can be null and auto assigned by the framework impl - see
 * newEditorNamed editor params
 * 
 * @author sg
 */
public class PropertyInfo {
	String name, type, description, label, editorId, editorParams;

	public PropertyInfo(String name, String type, String description, String label, String editorId, String editorParams) {
		super();
		this.name = name;
		this.type = type;
		this.description = description;
		this.label = label;
		this.editorId = editorId;
		this.editorParams = editorParams;
	}

	@Override
	public String toString() {
		return "PropertyInfo(" + name + ", type: " + type + ", editorId: " + editorId + ")";
	}

	public PropertyInfo(String name, String type) {
		this(name, type, "", name, null, null);
	}

	public String getType() {
		return type;
	}

	public void setType(String type) {
		this.type = type;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getDescription() {
		return description;
	}

	public void setDescription(String description) {
		this.description = description;
	}

	public String getLabel() {
		return label;
	}

	public void setLabel(String label) {
		this.label = label;
	}

	public String getEditorId() {
		return editorId;
	}

	public void setEditorId(String editorId) {
		this.editorId = editorId;
	}

}
