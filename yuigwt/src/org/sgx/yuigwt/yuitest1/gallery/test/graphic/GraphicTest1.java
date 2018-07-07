package org.sgx.yuigwt.yuitest1.gallery.test.graphic;

import static org.sgx.yuigwt.yuitest1.gallery.GalleryConstants.*;

import org.sgx.yuigwt.yui.YUI;
import org.sgx.yuigwt.yui.YUICallback;
import org.sgx.yuigwt.yui.YuiContext;
import org.sgx.yuigwt.yui.dd.Drag;
import org.sgx.yuigwt.yui.dd.DragConfig;
import org.sgx.yuigwt.yui.event.EventCallback;
import org.sgx.yuigwt.yui.event.EventFacade;
import org.sgx.yuigwt.yui.graphic.Graphic;
import org.sgx.yuigwt.yui.graphic.GraphicConfig;
import org.sgx.yuigwt.yui.graphic.Shape;
import org.sgx.yuigwt.yui.graphic.ShapeConfig;
import org.sgx.yuigwt.yui.graphic.fill.Fill;
import org.sgx.yuigwt.yui.graphic.fill.FillStop;
import org.sgx.yuigwt.yui.node.Node;
import org.sgx.yuigwt.yuitest1.gallery.test.AbstractTest;
import org.sgx.yuigwt.yuitest1.gallery.test.TestResources;

import com.google.gwt.user.client.Window;
/**
 * basic example of using yui graphics
 * @author sg
 */
public class GraphicTest1 extends AbstractTest {

public GraphicTest1() {
	super("graphic1", "graphics simple test", new String[]{TAG_GRAPHIC, TAG_EVENT}, 
			TestResources.instance.graphic_GraphicTest1());
}


public void test(final Node parent) {
YUI.Use(new String[]{"graphics", "dd-drag"}, new YUICallback() {
	
	public void ready(final YuiContext Y) {
		
		Graphic g1 = Y.newGraphic(GraphicConfig.create().render(parent)); 
		
		//move the graphic to parent's position
		g1.x(parent.getX()).y(parent.getY());
		
		Shape rect1 = g1.addShape(ShapeConfig.createRect().
			width(200).height(120).x(100).y(50).
			fill(Fill.create().color("red").opacity(0.7))
		);
		
		Shape circle1 = g1.addShape(ShapeConfig.createCircle().
			x(100).y(50).radius(70).
			fill(Fill.create().color("blue").opacity(0.5))
		);
		
		Shape ellipse1 = g1.addShape(ShapeConfig.createEllipse().
			x(0).y(0).height(70).width(220).		
			fill(Fill.create().
				type(Fill.TYPE_LINEAR).
				rotation(271).stops(new FillStop[]{
					FillStop.create("#ff6666").opacity(0.8).offset(0),
					FillStop.create("#00ffff").opacity(0.8).offset(0.5),
					FillStop.create("#000000").opacity(0.6).offset(1)
				})
			)
		);
		
		//make the ellipse draggable
		Drag mydrag = Y.newDDDrag(DragConfig.create().node(ellipse1)); 
		
		//draw a path
		Shape diamond1 = g1.addShape(ShapeConfig.createPath().
			fill(Fill.create().color("blue").opacity(0.5))
		);
		diamond1.moveTo(60, 60);
		diamond1.lineTo(80, 40);
		diamond1.lineTo(100, 60);
		diamond1.lineTo(80, 80);
		diamond1.lineTo(60, 60);
		diamond1.end();
		
		//register a clicl listener
		Y.one(diamond1.node()).on("click", new EventCallback() {			
			
			public void call(EventFacade e) {
				Window.alert("clicked"); 
			}
		});		
	}
}); 
}

}
