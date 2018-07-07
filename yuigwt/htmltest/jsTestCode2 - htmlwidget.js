/*
 * html widget - my first widget
 */

YUI.add('htmlwidget', function(Y, moduleName) {
	function HTMLWidget(config) {		
      HTMLWidget.superclass.constructor.apply(this, arguments);
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
			contentBox.append(this.get("html"));
          //Y.one("#foo").set("text", "hello1"); 
          //alert(this.get("html"))
		},
        /*syncUI : function() {
            var contentBox = this.get("contentBox");
          contentBox.empty(); 
			contentBox.append(this.get("html"));
        },*/
      bindUI : function() {
        this.after("htmlChange", function(){
          var contentBox = this.get("contentBox");
          contentBox.empty(); 
			contentBox.append(this.get("html"));
        })
        },
	});
	Y.namespace("HTMLWidget").HTMLWidget = HTMLWidget;

}, "3.6.0", {
	requires : [ "node", "widget" ]
});

YUI().use("htmlwidget", function(Y) {
	var me1 = new Y.HTMLWidget.HTMLWidget({
		html : "<span>hello<b> htmlwidget</b></span>"
	});
	me1.render(document.body);
  me1.on("htmlChange", function(){
    alert("html changed"); 
  })
    me1.set("html", "<b>bla</b>"); 
  
});