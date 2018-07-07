package org.sgx.yuigwt.yui.cssgrids;

import org.sgx.yuigwt.yui.YuiContext;
import org.sgx.yuigwt.yui.node.Node;
import org.sgx.yuigwt.yui.util.renderable.YuiNodeRenderable;
/**
 * Markup example: 
 * 
<pre>
&lt;div class="yui3-g">
    &lt;div class="yui3-u-5-24">

    &lt;/div>
    &lt;div class="yui3-u-19-24">

    &lt;/div>
&lt;/div>
</pre>
    
    
 * @author sg
 *
 */
public class GridEntry implements YuiNodeRenderable {

	private static final String DEFAULT_TAGNAME = "div";

	/**
	 * The unit size, can be "u", "u-1", "u-1-2". 
	 * 
	 * If it not starts with "u" then using pizel units (http://yuilibrary.com/yui/docs/cssgrids/#pixels) it is assumed, for example, "300px". 
	 * 
	 * See http://yuilibrary.com/yui/docs/cssgrids/#unit-sizes for all the possible values. 
	 * 
	 * @type String
	 * @default: "u"
	 */	
	String unitSize;
	
	/**
	 * tagname to use default "div"
	 */
	String tagName; 
	
	private Node srcNode;

	private String className; 
	
	public GridEntry() {
		this("u", null, DEFAULT_TAGNAME);
	}
	
	public GridEntry(String unitSize) {
		this(unitSize, null, DEFAULT_TAGNAME); 
	}
	public GridEntry(String unitSize, String className) {
		this(unitSize, className, DEFAULT_TAGNAME); 
	}
	public GridEntry(String unitSize, String className, String tagName) {
		this.unitSize = unitSize;
		this.className = className; 
		this.tagName = tagName; 
	}
	public String getUnitSize() {
		return unitSize;
	}

	public void setUnitSize(String unitSize) {
		this.unitSize = unitSize;
	}

	
	public void render(YuiContext Y, Node parent) {		
		srcNode = parent.appendChild("<"+tagName+"></"+tagName+">");		
		if(unitSize.startsWith("u")) {
			srcNode.addClass("yui3-"+unitSize); 
		}
		else {
			srcNode.setStyle("width", unitSize); 
		}
		
		if(className!=null && !className.equals("")) {
			srcNode.addClass(className); 
		}
	}

	
	public Node getSource() {
		return srcNode; 
	}

	public String getTagName() {
		return tagName;
	}

	public void setTagName(String tagName) {
		this.tagName = tagName;
	}

	public String getClassName() {
		return className;
	}

	public void setClassName(String className) {
		this.className = className;
	}

	

}
