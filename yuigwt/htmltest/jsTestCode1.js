/**
 * GridRow module - add javascript API for managing cssgrids in widgets.
 * Supported classes:
 * 
 * GridRow - a Widget class to be used as a container for other (child)
 * widgets, using csscrids for laying out its childs. contain a list of
 * GridColumns
 * 
 * GridRowPlugin - a Widget plugin that makes the target widget a GridRow -
 * a container widget that uses cssgrids for laying out its childrens.
 * 
 * GridConfig - both GridRow and GridRowPlugin configuration properties:
 * 
 * GridColumn contains GridEntrys
 * 
 * GridEntry - contains nodes.
 * 
 * @see http://yuilibrary.com/yui/docs/cssgrids/
 * 
 * @author sg
 */
YUI.add('gridwidget', function(Y, moduleName) {

    function HTMLWidget(config) {
      Y.one("#foo").set("text", "hello1"); 
    }
    HTMLWidget.ATTRS = {
        html : {
            value: "<p></p>"                     
        }
    };
    GridWidget.prototype = {
      myExtensionPublicMethod : function() {
    }
  };

  Y.extend(HTMLWidget, Y.Widget, {
	  initializer: function() {
      },       
      destructor : function() {
      },
      renderUI : function() {
    	  var contentBox = this.get("contentBox"); 
    	  contentBox.append(this.get("value")); 
      },
  }); 
  Y.namespace("GridWidget").HTMLWidget = HTMLWidget;
  
  // This AnchorPlugin is designed to be added to Node instances (the host will be a Node instance)
  function GridPlugin(config) {  
      // Hold onto the host instance (a Node in this case), 
      // for other plugin methods to use.  
      this._node = config.host;
  }
  
  // When plugged into a node instance, the plugin will be 
  // available on the "anchors" property.
  GridPlugin.NS = "grid"; 
  
  GridPlugin.prototype = {
      disable: function() {
          var node = this._node;
          var anchors = node.queryAll("a");
          anchors.addClass("disabled");
          anchors.setAttribute("disabled", true);
      }
  };
    
  

}, "3.6.0", {requires: ["node", "gridcss", "widget"]});


/*
 * html widget
 */

YUI.add('htmlwidget', function(Y, moduleName) {
	function HTMLWidget(config) {
		//	    Y.one("#foo").set("text", "hello1"); 
		Spinner.superclass.constructor.apply(this, arguments);
	}
	HTMLWidget.ATTRS = {
		html : {
			value : "<p></p>"
		}
	};
	HTMLWidget.NAME="htmlwidget"
	//	  HTMLWidget.prototype = {
	//	    myExtensionPublicMethod : function() {
	//	  }
	//	};	
	Y.extend(HTMLWidget, Y.Widget, {
		initializer : function() {
		},
		destructor : function() {
		},
		renderUI : function() {
			var contentBox = this.get("contentBox");
			contentBox.append(this.get("value"));
		},
		syncUI : function() {
            this._uiSetValue(this.get("value"));
        },
        bindUI : function() {
            this.after("valueChange", this._afterValueChange);

            var boundingBox = this.get("boundingBox");

            // Looking for a key event which will fire continuously across browsers while the key is held down. 38, 40 = arrow up/down, 33, 34 = page up/down
            var keyEventSpec = (!Y.UA.opera) ? "down:" : "press:";
            keyEventSpec += "38, 40, 33, 34";

            Y.on("key", Y.bind(this._onDirectionKey, this), boundingBox, keyEventSpec);
            Y.on("mousedown", Y.bind(this._onMouseDown, this), boundingBox);

            this._documentMouseUpHandle = Y.on("mouseup", Y.bind(this._onDocMouseUp, this), boundingBox.get("ownerDocument"));

            Y.on("change", Y.bind(this._onInputChange, this), this.inputNode);
        }
	});
	Y.namespace("HTMLWidget").HTMLWidget = HTMLWidget;

}, "3.6.0", {
	requires : [ "node", "widget" ]
});

YUI().use("htmlwidget", function(Y) {
	var me1 = new Y.HTMLWidget.HTMLWidget({
		html : "<span>hello<b>htmlwidget</b></span>"
	});
	me1.render(document.body);
});