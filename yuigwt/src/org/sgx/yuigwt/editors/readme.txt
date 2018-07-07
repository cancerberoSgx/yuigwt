a Java editors framework based on YUI Node and YUI widgets. 
(similar to gwteditors or Gwt editors. )

Use case code: 

Editor<Person> ed = new PropertyHaverEditor<Person>(); 
ed.render(Y.one("body")); //render the UI
ed.load(person1);  //later load some model object in the editor 
...
Person editedPerson = ed.flush(); //later, the edited calue can be retrieved with flush

 

TODO: 
This should be in a different project / .jar

@author: sebastián Gurin