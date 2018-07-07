package org.sgx.yuigwt.yuigallery.itsaselectlist;

import org.sgx.yuigwt.yui.event.EventFacade;
import org.sgx.yuigwt.yui.node.Node;
import org.sgx.yuigwt.yui.widget.Widget;

/**
 * dget that creates a button-like selectlist/combobox. Doesn't use progressive
 * enhancement yet, because the main reason for developing was it's use in the
 * Itsa-Toolbar.<br/>
 * 
 * After defining, you need to listen for the selectChange event with the
 * following fields:<br/>
 * e.currentTarget: the selected li-Node<br/>
 * e.value: returnvalue of the selected item<br/>
 * e.index: index of the selected item<br/>
 * 
 * If you want another selection-image, you could do this by changing css. The
 * module has a lot of images and changing would involve something like:
 * 
 * <pre>
 * &lt;style type="text/css">
 * #yourselectdiv .yui3-itsaselectlist.itsa-leftalign li {background-position: left -4501px;}
 * &lt;/style>
 * </pre>
 * 
 * Or if you want to use a backgroundimage of your own:<br/>
 * 
 * <pre>
 * &lt;style type="text/css">
 * #yourselectdiv .yui3-itsaselectlist.itsa-leftalign li {background-position: left -4501px;}
 * #yourselectdiv .itsa-selectlist-selected {background-image: url('...');}
 * &lt;/style>
 * </pre>
 * 
 * Change the y-position in steps of approximately 30px.
 * 
 * ToDo:<br/>
 * enabale progressive enhancement<br/>
 * enable scrolling with fixed height<br/>
 * enable open box (combobox with more than 1 visible item)<br/>
 * enable multiple selections<br/>
 * 
 * There is an easy way to realize a simple scrolling list for the time being,
 * using custom css:<br/>
 * 
 * <pre>
 * &lt;style type="text/css">
 * #yourselectdiv .itsa-selectlist-ullist {height: 100px; overflow-y: scroll;}
 * &lt;/style>
 * </pre>
 * 
 * @author sg
 * 
 */
public class ITSASelectlist extends Widget {
	protected ITSASelectlist() {
	}

	/**
	 * In case of a valuechange, valueChange will be fired. No matter whether the change is done by userinteraction, or by a functioncall like selectItem()
	 */
	public static final String EVENT_ITEMSCHANGE = "itemsChange";
	
	/**
	 * In case of a valuechange triggered by userinteraction, selectChange will be fired. This way you can use functioncalls like selectItem() and prevent double programmaction (which might occur when you listen to the valueChange event)
<br/>Event Payload: <br/>
    - e.currentTarget: the selected li-Node<br/>
    - e.value: returnvalue of the selected item <br/>
    - e.index: index of the selected item<br/>
	 */
	public static final String EVENT_SELECTCHANGE = "selectChange";

	/**
	 * Returns the index of the actual selected listitemnode.
	 * 
	 * @return index of the current selected listitem, or -1 if none is
	 *         selected.
	 */
	public final native int currentIndex()/*-{
		return this.currentIndex();
	}-*/;

	/**
	 * Will hide the listitems. Will also fire a hide event.
	 */
	public final native Node currentSelected()/*-{
		return this.currentSelected();
	}-*/;

	/**
	 * 
	 * @return the current selected listitemnode, or null if none is selected.
	 */
	public final native ITSASelectlist hideListbox()/*-{
		this.hideListbox();
		return this;
	}-*/;

	/**
	 * Selects the items at a specified index. When softMatch is set to true,
	 * the selected value will return to the default, even when there is no
	 * match. When softMatch is false, or not specified, there has to be a match
	 * in order to change.
	 * 
	 * @param index
	 *            index to be selected
	 * @return Fires a valueChange, NO selectChange event, because there is no
	 *         userinteraction. - e.currentTarget: the selected li-Node -
	 *         e.value: returnvalue of the selected item - e.index: index of the
	 *         selected item
	 */
	public final native EventFacade selectItem(int index)/*-{
		return this.selectItem(index);
	}-*/;

	/**
	 * Selects the items at a specified index. When softMatch is set to true,
	 * the selected value will return to the default, even when there is no
	 * match. When softMatch is false, or not specified, there has to be a match
	 * in order to change.
	 * 
	 * @param index
	 *            index to be selected
	 * @param softMatch
	 *            Optional. When set to true will always make a selectchange,
	 *            even when the listitem is not available
	 * @param softButtonText
	 *            Optional. Whether to use the attribute defaultButtonText in
	 *            case softMatch is true and there is no match. When set to
	 *            false, itemText will be used when there is no match.
	 * @return Fires a valueChange, NO selectChange event, because there is no
	 *         userinteraction. - e.currentTarget: the selected li-Node -
	 *         e.value: returnvalue of the selected item - e.index: index of the
	 *         selected item
	 */
	public final native EventFacade selectItem(int index, boolean softMatch, String softButtonText)/*-{
		return this.selectItem(index, softMatch, softButtonText);
	}-*/;

	/**
	 * Will show the listitems. Will also fire a show event.
	 * 
	 * @param index
	 *            index to be selected
	 * @return
	 */
	public final native EventFacade showListbox()/*-{
		this.showListbox();
		return this;
	}-*/;

}
