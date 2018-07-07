yuigwt - http://code.google.com/p/yuigwt/ - YUI3 for Java GWT

sgurin

LIBRARY OBJECTIVES

The main objectives for this first library development iteration are: 

* bring the attribute and event yui API to java

* do not focus on YUI extensions (custom extensions, custom events and custom attributes) or 
in YUI javascript helpes (Y.augment). Not just yet. For now only port existing javascript yui extensions, and not support extension definition from java yet. 

* do focus on bring good, 0 overhead (w overlays) java api for yui Node and main widgets

* bring yui3 usefull utilities like image loader, store, css, graphics, and other modules  

* bring best yui3 gallery components

* completly independent from gwt widgets or gwt xml / html dom. gwt xml dom Element class is ONLY referenced
for being possible to work with gwt xml/html dom impl, not based/dependant on it.

* do not focus on a heavy compatibility with gwt widgets, yet. Unite yui widgets and gwt widgets using common gwt xml/html dom api or strings.   

in summary, yui3 offer a lot of good apis for extending and very good javascript language helpers. 
But this library is for java programmers, and also bring the api to this extensible utilities
is very hard. So we will only bring a java API for the "concrete parts" of yui. The reasons are: 
1) it is hard 2) we dont need javascript stuff like Y.augment in java or it iwll be veryu confuse for java programmers 
(in java we have java classes and java inheritance 3) yui4gwt uses overlay types to overlay 
javascript native things so it does little sense to develop extensions using java code (what we wil be overlaying to?)  

If you want to extend yui4java with new yui3 modules, then first develop the yui3 module in javascript, like yui3 gallery modules, 
and then write the gwt overlays for that module.






**known issues: 

1) NO Event detach(callbackFunction). there is no support for unregistering event listeners 
using the function object, like this: 

var f = function(e){..}; 
aNode.on("click", f); 
...
aNode.detach(f): 

instead use the EventHandle: 
var handle = aNode.on("click", f);
...
handle.detach();  