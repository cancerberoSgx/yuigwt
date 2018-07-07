package org.sgx.yuigwt.editors.impl.complex;

import java.util.HashMap;
import java.util.LinkedList;
import java.util.List;
import java.util.Map;
import java.util.logging.Level;
import java.util.logging.Logger;

import org.sgx.yuigwt.editors.Editor;
import org.sgx.yuigwt.editors.EditorNotFound;
import org.sgx.yuigwt.editors.Types;
import org.sgx.yuigwt.editors.error.EditorError;
import org.sgx.yuigwt.editors.error.EditorErrorManager;
import org.sgx.yuigwt.editors.event.EditorEventManager;
import org.sgx.yuigwt.editors.event.EditorValueChangeEvent;
import org.sgx.yuigwt.editors.event.ValueChangeListener;
import org.sgx.yuigwt.editors.impl.AbstractEditor;
import org.sgx.yuigwt.editors.props.PropertyHaver;
import org.sgx.yuigwt.yui.YuiContext;
import org.sgx.yuigwt.yui.event.EventCallback;
import org.sgx.yuigwt.yui.event.EventFacade;
import org.sgx.yuigwt.yui.node.Node;
import org.sgx.yuigwt.yui.util.HTMLUtil;
import org.sgx.yuigwt.yui.widget.button.Button;
import org.sgx.yuigwt.yui.widget.button.ButtonConfig;
import org.sgx.yuigwt.yui.widget.button.ButtonEvent;
import org.sgx.yuigwt.yui.widget.panel.Panel;
import org.sgx.yuigwt.yui.widget.panel.PanelConfig;

/**
 * just like PHE1 but supporting anidated complex editors. complex properties
 * will be showed in a label, than when clicked will render the sub-complex
 * editor in a dialog.
 * 
 * @author sg
 * 
 * @param <T>
 *            the PropertyHaver class to edit
 */
public class PropertyHaverEditor2<T extends PropertyHaver> extends AbstractEditor<T> implements ValueChangeListener<Object> {

	// private YuiContext y;
	private HTMLUtil htmlutil;
	private Map<String, Editor<Object>> editors;

	// protected T model = null;
	// private Node table = null;

	public PropertyHaverEditor2(YuiContext y) {
		super(y, false);
		// this.y = y;
		htmlutil = new HTMLUtil(y);
		editors = new HashMap<String, Editor<Object>>();
	}

	static Logger logger = Logger.getLogger(PropertyHaverEditor2.class + "");

	@Override
	public void render(Node parent) {
		super.render(parent);
		srcNode = htmlutil.newTable(parent);
		// htmlutil.appendRow(srcNode, )
	}

	@Override
	public boolean isSimple() {
		return false;
	}

	@Override
	public T flush() {
		if (model == null) {
			logger.log(Level.WARNING, "first load() must be called and then flush()");
			return null;
		}
		T obj = model; // we modify the passed PH !
		PropertyHaverEditorError errors = new PropertyHaverEditorError(this);
		boolean error = false;
		for (String propName : editors.keySet()) {
			Editor ed = editors.get(propName);

			if (ed != null) {
				Object val = ed.flush();
				if (val == null && ed.getErrors().size() > 0) {
					error = true;
					errors.putFieldError(propName, ed.getErrors());
				} else {
					obj.setProperty(propName, val);
				}
			}
		}
		if (error) {
			EditorErrorManager.<PropertyHaver> getInstance().setError(this, errors);
			return null;
		} else {
			return obj;
		}
	}

	@Override
	public void load(final T model) {
		super.load(model);
		srcNode.empty();
		editors.clear();
		removeMySelfAsListener();

		List<String> props = model.getProperties().keys();
		for (final String name : props) {
			final Object val = model.getProperty(name);

			Node row = htmlutil.appendRow(srcNode, "<div class=\"left\"></div>", "<div class=\"right\"></div>");
			Node labelParent = row.one(".left"), valueParent = row.one(".right");

			Editor<Object> ed = null;
			try {
				ed = (Editor<Object>) Types.getInstance().newPropertyEditor(model, name);
			} catch (EditorNotFound e) {
				// logger.log(Level.WARNING,
				// " exception building editor for prop " + name + " of class "
				// + model.getClass() + " value: " + val + ". Exception cause: "
				// + e.getCause());
				// e.printStackTrace();
				// throw new RuntimeException(e);
			}
			/* if editor not found then perhaps the model is a property haver ? */
			if (ed == null && model instanceof PropertyHaver) {
				ed = new PropertyHaverEditor2(y);
			}
			if (ed == null) {
				String msg = "Couldn't create editor for propery " + name + ". ";
				logger.log(Level.SEVERE, msg);
				continue;
			}

			final Editor<Object> finalEd = ed;

			EditorEventManager.getInstance().addValueChangeListener(ed, this);

			editors.put(name, ed);

			labelParent.append(name + ":");
			if (!ed.isSimple()) {

				Node tb = valueParent.appendChild("<input type=\"text\"></input>");

				tb.set("value", val + "");
				tb.set("title", name);

				tb.on("click", new EventCallback<EventFacade>() {

					@Override
					public void call(EventFacade e) {

						final Panel panel = y.newPanel((PanelConfig) PanelConfig.create().centered(true).width("400px"));
						panel.headerContent("<h1>" + name + "</h1>");
						panel.bodyContent("<div class=\"bodyContent\"></div>");
						panel.footerContent("<i>small</i>");

						Button acceptButton = getContext().newButton(ButtonConfig.create().label("Accept").on("click", new EventCallback<ButtonEvent>() {
							@Override
							public void call(ButtonEvent e) {
								panel.hide();
							}
						})).render().cast();
						panel.addButton(acceptButton);

						panel.render(y.one("body"));
//						Node bodyNode = (Node) panel.bodyContent();
						Node bodyNode2 = panel.srcNode().one(".bodyContent"); 
						finalEd.render(bodyNode2);
						finalEd.load(val);

					}
				});
			} else {
				ed.render(valueParent);
				ed.load(val);
			}
		}
	}

	protected PropertyHaver getModel() {
		return model;
	}

	@Override
	public List<EditorError<T>> getErrors() {
		// TODO Auto-generated method stub
		return new LinkedList<EditorError<T>>();
	}

	@Override
	public void notifyValueChange(EditorValueChangeEvent<Object> evt) {
		// TODO: here we do not flush the value to the event. Pass null, the
		// user must explicitly flush this editor.
		// TODO: search whilch property is the editor evt.getSrc() and pass its
		// name in a data attr in svt object
		EditorValueChangeEvent<T> e_ = new EditorValueChangeEvent<T>(this, null, evt);
		EditorEventManager.<T> getInstance().fireValueChangeEvent(this, e_);
		model = flush(); // update the model! user passed object modified!
	}

	private void removeMySelfAsListener() {
		for (Editor e : editors.values()) {
			EditorEventManager.getInstance().removeValueChangeListener(e, (ValueChangeListener<Object>) this);
		}
	}

}
