
YUI.add('sgx', function(Y, moduleName) {

	
	/**
	 * A GridRow contains list of GridEntries. This is not supposed to be instantiated by the user. Please use appendRow()
	 * @class GridRow
	 * @extends Base
	 * @author Sebastián Gurin
	 */
	function GridRow(config) {
		GridRow.superclass.constructor.apply(this, arguments);		
	}
	GridRow.ATTRS = {}; 	
	/**
	 * The source node for this grid row
	 * 
	 * @attribute srcNode
	 * @type {Node}
	 * @required
	 */
	GridRow.ATTRS["srcNode"]={}; 		
	/**
	 * number of initial items on this row 
	 * @optional
	 * @attribute itemCount
	 * @type {Integer}
	 */
	GridRow.ATTRS["itemCount"] = {}; 
	Y.extend(GridRow, Y.Base, {
		initializer : function() {
			var srcNode = this.get("srcNode"); 
			if(!srcNode)
				Y.Assert.fail("a srcNode configuration properties are required!");
			srcNode.addClass("yui3-g");
			this._gridEntries = []; 
			var itemCount = this.get("itemCount");
			for ( var i = 0; i < itemCount; i++) {
				this.appendEntry(); 
			}
		},
		destructor : function() {
			this.get("srcNode").remove(); //.removeClass("yui3-g");
		}, 
		/**
		 * adds a new GridEntry at the end of this row. 
		 * @method appendEntry
		 * @return {GridEntry} the new GridEntry created.
		 */		
		appendEntry : function(entryConfig) {
			if(!entryConfig)
				entryConfig={}; 
			entryConfig["gridRow"]=this; 
			var entry = new Y.sgx.GridEntry(entryConfig);		
			this._gridEntries.push(entry);
			return entry; 			
		}, 
//		/**
//		 * removes an entry from this row.
//		 * @method removeEntry
//		 */		
//		removeEntry : function(entryConfig) {
//			//TODO	
//		}
	});
	Y.namespace("sgx").GridRow = GridRow;
	
	
	
	
	
	
	
	
	
	
	
	

	/**
	 * A GridEntry contains represents an item in a GridRow, and contains a 
	 * node and some configuration for displaying it on the grid. 
	 * @class GridEntry
	 * @extends Base
	 * @author Sebastián Gurin
	 */
	function GridEntry(config) {	
		GridEntry.superclass.constructor.apply(this, arguments);
	}
	GridEntry.ATTRS = {}; 
	/**
	 * The source node for this grid entry
	 * 
	 * @attribute srcNode
	 * @type {Node}
	 * @required
	 */
	GridRow.ATTRS["srcNode"]={}; 
	/**
	 * The parent GridRow containing this GridEntry
	 * 
	 * @attribute gridRow
	 * @type {GridRow}
	 * @required
	 */
	GridEntry.ATTRS["gridRow"] = {			
	}; 
	/**
	 * The unit size, can be "u", "u-1", "u-1-2". See http://yuilibrary.com/yui/docs/cssgrids/#unit-sizes for all the possible values. 
	 *  
	 * @attribute unitSize
	 * @type String
	 * @default: "u"
	 */	
	GridEntry.ATTRS["unitSize"] = {
			value: "u"
	}; 
	/**
	 * the node contained by the GridEntry 
	 *  
	 * @attribute contentNode
	 * @type Node
	 */	
	GridEntry.ATTRS["contentNode"] = {
	}; 
	Y.extend(GridEntry, Y.Base, {
		initializer : function() {
			GridEntry.superclass.constructor.apply(this, arguments);
			var row = this.get("gridRow"); 
			if(!row)
				Y.Assert.fail("gridRow configuration property is mandatory!"); 
			var rowNode = this.get("gridRow").get("srcNode"); 
			
			var entryNode = rowNode.appendChild("<div></div>");		
			this.set("srcNode", entryNode);
			if(this.get("unitSize"))
				entryNode.addClass("yui3-u-"+this.get("unitSize")); 
		},
		destructor : function() {
			this.get("srcNode").remove(); 
		}, 
		getItems: function() {			
		}
	});
	Y.namespace("sgx").GridEntry = GridEntry;
	
		
	
	
	
	
	
	
	
	
	

	/**
	 * HTMLWidget A widget for displaying html content. Usage:
	 * 
	 * <pre>
	 * YUI().use(&quot;gridwidget&quot;, function(Y) {
	 * 	var me1 = new Y.GridWidget.HTMLWidget({
	 * 		html : &quot;&lt;span&gt;hello&lt;b&gt; htmlwidget&lt;/b&gt;&lt;/span&gt;&quot;
	 * 	});
	 * 	me1.render(document.body);
	 * 	me1.on(&quot;htmlChange&quot;, function() {
	 * 		alert(&quot;html changed&quot;);
	 * 	})
	 * 	me1.set(&quot;html&quot;, &quot;&lt;&lt;b&gt;bla&lt;/b&gt;&quot;);
	 * });
	 * </pre>
	 * 
	 * @class HTMLWidget
	 * @extends Widget
	 * @param config -
	 *            accept a property html - a html string content
	 * @constructor
	 * @author Sebastián Gurin
	 */
	function HTMLWidget(config) {
		HTMLWidget.superclass.constructor.apply(this, arguments);
	}
	function HTMLWidget(config) {
		HTMLWidget.superclass.constructor.apply(this, arguments);
	}
	HTMLWidget.ATTRS = {
		html : {
			value : "<p></p>"
		}
	};
	HTMLWidget.NAME = "gridwidget";
	Y.extend(HTMLWidget, Y.Widget, {
		initializer : function() {
		},
		destructor : function() {
		},
		renderUI : function() {
			var contentBox = this.get("contentBox");
			contentBox.append(this.get("html"));
		},
		bindUI : function() {
			this.after("htmlChange", function() {
				var contentBox = this.get("contentBox");
				contentBox.empty();
				contentBox.append(this.get("html"));
			})
		},
	});
	Y.namespace("sgx").HTMLWidget = HTMLWidget;
	
	
	
	

}, "3.6.0", {
	requires : [ "node", "cssgrids", "base" ]
});
