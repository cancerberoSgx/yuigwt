a very simple gwt application that uses yuigwt. It is used for testing the yuigwt.jar and for documentation.

how to test it: 

edit gwt.sdk property in build.properties according to your system and then perform "ant". 
open file war/Yuigwtex.html in your browser  

You can build this from a *nix command line using: 

svn checkout http://yuigwt.googlecode.com/svn/trunk/gwtyuiex yuigwtExample

cd yuigwtExample

#edit gwt.sdk property in build.properties according to your system (points to GWT SDK folder)
cat > build.properties
gwt.sdk=/home/sebastian/programas/gwt-2.4.0
Ctrl-D

#compile the project
ant

#open the app
firefox war/Yuigwtex.html