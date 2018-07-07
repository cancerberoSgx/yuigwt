yuigwt yui package Java friendly, see for context. 

"The main Question is do you want YUI users to use Java or do you want  to bring Java Devs to YUI ? 
I think you will get more traction by choosing the latter". Nino. 



this java package classes wrapps native org.sgx.yuigwt.yui native classes for easily introduce YUI to the Java programmer. 

IMPORTANT IDEA: 

while org.sgx.yuigwt.yui is appropiate to YUI users who know java and want to use YUI without overhead
using JSO objects directly. No/bad Java inheritance - "Do javascript in java". Nice for YUI users because is a mechanized translation between java code and js code. for ex, API comments directly copy&pasted from YUI js API docs.

On the other hand, org.sgx.yuigwt.jyui contains pure Java objects that wrapp a JSO YUI object from org.sgx.yuigwt.yiu. This imply a little overhead, but this way we have full java code flexibility because we do not manage native JSOs, and so the java programmer is free to extend, (J)YUI java classes.      