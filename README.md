# Design-Patterns-In-Java
The design patterns used to create applications efficiently and fulfilling user needs accordingly.

## Strategy_pattern
 It defines a family of algorithms, encapsulates each one, and makes them interchangeable. Strategy lets the algorithm vary independently from clients that use it.
   # Duck class
    This is the abstract class in which all basic duck methods are present. Like performFly(), performQuack() etc. Its constructor creates interfaces variables(specififc quality of duck).
   # MallardDuck,RubberDuck,SilentDuck class
    Different types of Duck class which extends abstract Duck class. The Constructor of every class initializes interfaces from the abstract duck class. They also implements the abstract methods.
   # Interface -  Flybehavior, Quackbehavior class
    They creates fly and quack methods for every duck objects.
   # Flynoway, Flywithwings class 
    They implements Flybehavior and overrides the fly method, which are Duck specific.
   # Mutequack, Quack, Squeak class
    They implements Quackbehavior and overrides the quack method, which are Duck specific.
   # Ducksim class
    It creates Duck objects and invokes the methods of all kinds of Duck available.
     
    
      
    



# Source
 Head First Design Pattern By O'reilly.

 