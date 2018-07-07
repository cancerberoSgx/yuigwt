Reusing YUI widget markup in GWT UIBinder
-----------------------------------------

UiBinder main mission is separation of markup - structure - style using XML 
(declarative language) in one place, and the logic implementaiton in Java in another place, 
so this separation of concerns in different language be able web designers not knoing java to
participate in the developmentof markup and style (design). 
 
And YUI proposes a very similar thing. All YUI widgets can be created from 
and define a markup structure. This is somehow related to yui philosophy's 
of "Progressive Enhancement" @see http://yuilibrary.com/yui/docs/tutorials/gbs/ 

Examples: is the same with all: YUI widgets can be instantiated from markup: 

TabView - http://yuilibrary.com/yui/docs/tabview/

html markup: 

{{{
<div id="demo">
    <ul>
        <li><a href="#foo">foo</a></li>
        <li><a href="#bar">bar</a></li>
        <li><a href="#baz">baz</a></li>
    </ul>
    <div>
        <div id="foo">foo content</div>
        <div id="bar">bar content</div>
        <div id="baz">baz content</div>
    </div>
</div>
}}}

javascript: 

{{{
YUI().use('tabview', function(Y) {
    var tabview = new Y.TabView({
        srcNode: '#demo'
    });
    tabview.render();
});
}}}

So the idea in this solution is using YUI pure HTML markup directly in GWT UIBinder XML files. 
UIBinder allows to put HTML markup directly in the ui.xml files taking a little care when 
mixing pure html markup with GWT widgets markup. 

The idea is very simple, just write your YUI HTML markup indicating the YUI widgets you are
rendering in the view using the class attribute. For example, in the following code, we compose
a GUI using yui cssgrids for layouting, a tabview with a YUI button and a GWT button inside:






Some History, Context and Comments... 
------------------

uibinder markup can be of two main types: gwt widget markup (not HTML), like
<g:TabLayoutPanel> and of pure HTML markup, like <table><tr>... 

Both of these types, Widgets and dom.Element can be "binded". 

A simpler and nice solution for integrate YUI is explained in this document and it 
is based on pure HTML element markup and element binding, not GWT widgets. 

However should be said that a GWT widget based solution was also explored, and in 
fact was the first solution to be tried. A new widget class hierarchy was created. 
@see org.sgx.yuigwt.ui.UIWidget was created and it will try to be developed. 

Nevertheless, It result difficult to develop expressive markup for complex YUI widgets like tabview, panel and others. 
@see https://groups.google.com/forum/?fromgroups=#!topic/google-web-toolkit/-Ed_fnqeFTU 
@see https://groups.google.com/forum/?fromgroups=#!topic/google-web-toolkit/reVTRusNsi8

So I thought on a second sollution, explained in this document, that uses only pure HTML markup and HTMl elements
for writing the YUI components in an UIBinder XML document. 


Role of markup in YUI
---------------------



UIBinder integration solution: Reuse YUI Markup
-----------------------------------------------






and finnaly this imply a very simple implementation, that it is: TODO: paste code of UTil






old: 


need to "XML import" with a namespace and always 



First and simpler approach. 



User is resonsible of providing / installing the YUIContext object with all the UI required modules loaded. 

For example, if we put an <y:AutoComplete> in UIBinder markup and have not loaded the module autocomplete 
then the following exception will be thrown: 

[ERROR] [org.sgx.yuigwt.YuiGwtTestOnline] - Failed to create an instance of 'org.sgx.yuigwt.ui.AutoComplete' via deferred binding 
(TypeError): this.AutoComplete is not a constructor

@see https://groups.google.com/forum/?fromgroups=#!topic/google-web-toolkit/reVTRusNsi8 