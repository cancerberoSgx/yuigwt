package org.sgx.yuigwt.yuitest1.gallery.test.jyui;

import java.util.LinkedList;
import java.util.List;

import org.sgx.yuigwt.jyui.widget.YWidget;
import org.sgx.yuigwt.jyui.widget.button.YButton;
import org.sgx.yuigwt.yui.YUI;
import org.sgx.yuigwt.yui.YUICallback;
import org.sgx.yuigwt.yui.YuiContext;
import org.sgx.yuigwt.yui.cssgrids.GridEntry;
import org.sgx.yuigwt.yui.cssgrids.GridRow;
import org.sgx.yuigwt.yui.node.Node;
import org.sgx.yuigwt.yui.widget.Widget;
import org.sgx.yuigwt.yui.widget.button.Button;
import org.sgx.yuigwt.yui.widget.button.ButtonConfig;
import org.sgx.yuigwt.yui.widget.slider.Slider;
import org.sgx.yuigwt.yui.widget.slider.SliderConfig;
import org.sgx.yuigwt.yuitest1.gallery.GalleryConstants;
import org.sgx.yuigwt.yuitest1.gallery.test.AbstractTest;
import org.sgx.yuigwt.yuitest1.gallery.test.TestResources;

/**
 * in this exmaple, we build a custom widget container, extending YWidget,
 * GridPanel that lay out its children using cssgrids
 * 
 * @author sg
 * 
 */
public class JYuiTest2 extends AbstractTest {

	public JYuiTest2() {
		super("jyui2", "in this exmaple, we build a custom widget container, extending YWidget, GridPanel that lay out its children using cssgrids", new String[] {
				GalleryConstants.TAG_EXT, GalleryConstants.TAG_GWT, GalleryConstants.TAG_CSSGRIDS }, 
				TestResources.instance.jyui_JYuiTest2());
	}

	@Override
	public void test(final Node parent) {
		YUI.Use(new String[] { "button", "cssgrids", "slider" }, new YUICallback() {
			@Override
			public void ready(final YuiContext Y) {
				Button button1 = Y.newButton(ButtonConfig.create().label("Button1"));
				YButton button2 = new YButton(Y, "button2");
				Slider slider1 = Y.newSlider(SliderConfig.create().axis("x").min(1).max(5).value(3).length(200)).cast();

				GridPanel panel1 = new GridPanel(Y);

				panel1.addChild("u-1-5", button1);
				panel1.addChild("u-1-5", button2);
				panel1.addChild("u-3-5", slider1);

				panel1.render(parent);
			}
		});
	}

	/**
	 * a custom widget that try to be a widget container laying out its childs
	 * cssgrids
	 */
	public static class GridPanel extends YWidget {
		private GridRow gridRow;
		List<Object> childs;

		public GridPanel(YuiContext y) {
			super(y);
			gridRow = new GridRow();
			childs = new LinkedList<Object>();
			setWrapped(y.newWidget());
		}

		@Override
		public void afterRender() {
			gridRow.render(getContext(), srcNode());
			int i = 0;
			for (Object child : childs) {
				if (child instanceof Widget) {
					((Widget) child).render(gridRow.get(i).getSource());
				} else if (child instanceof YWidget) {
					((YWidget) child).render(gridRow.get(i).getSource());
				} else if (child instanceof Node) {
					gridRow.get(i).getSource().append(((Node) child));
				}
				i++;
			}
		}

		/**
		 * @param unitSize
		 *            cssgrids unitsizes for this grid entry @see
		 *            http://yuilibrary.com/yui/docs/cssgrids/#unit-sizes
		 * @param child
		 *            could be a Widget, an YWidget or a Node
		 */
		public void addChild(String unitSize, Object child) {
			childs.add(child);
			GridEntry gridEntry = new GridEntry(unitSize, null);
			gridRow.add(gridEntry);
		}
	}

}
