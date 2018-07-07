package org.sgx.yuigwt.alloyui.widget.buttonitem;

import org.sgx.yuigwt.alloyui.widget.component.Component;

/**
 * A base class for ButtonItem, providing:
 * 
 * <br/>
 * Widget Lifecycle (initializer, renderUI, bindUI, syncUI, destructor)
 * 
 * <br/>
 * An optional icon or label
 * 
 * <br/>
 * Managed user interaction states (default, active, hover)
 * 
 * <br/>
 * Keyboard accessible
 * 
 * <br/>
 * Quick Example:
 * 
 * <pre>
 * var instance = new A.ButtonItem({
 * icon: 'gear',
 * label: 'Configuration'
 * }).render();
 * </pre>
 * 
 * @author sg
 * 
 */
public class ButtonItem extends Component {
	protected ButtonItem() {
	}
}
