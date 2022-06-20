# Java, OO Design...

````
1- What is the difference between a class and an object? 
>> A class is a blueprint or template for creating objects. An object is an 
instance of a class.
````

````
2- What does instantiating mean? 
>> Instantiating means creating an instance of a class: new 
Customer()
````

````
3- What is the difference between stack and heap memory? How are 
they managed?
>>  Stack is used for storing primitive types (numbers, boolean and 
character) and variables that store references to objects in the heap. 
Variables stored in the stack are immediately cleared when they go out 
of scope (eg when a method finishes execution). Objects stored in the 
heap get removed later on when they’re no longer references. This is 
done by Java’s garbage collector.
````

````
4- What are the problems of procedural code? How does object-oriented 
programming help solve these problems? 
>> Big classes with several unrelated methods focusing on different 
concerns and responsibilities. These methods often have several 
parameters. You often see the same group of parameters repeated 
across these methods. All you see is procedures calling each other 
passing arguments around.


By applying object-oriented programming techniques, we extract these 
repetitive parameters and declare them as fields in our classes. Our 
classes will then encapsulate both the data and the operations on the 
data (methods). As a result, our methods will have fewer parameters 
and our code will be cleaner and more reusable.

````

````
5- What is encapsulation? 

>> Encapsulation is the first principle of object-oriented programming. 
It suggests that we should bundle the data and operations on the data 
inside a single unit (class).
````

````
6- Why should we declare fields as private? 
>>  How we store data in an object is considered an implementation 
detail. We may change how we store the data internally. Plus, we don’t 
want our objects to go into a bad state (hold bad data). That’s why we 
should declare fields as private and provide getters and or setters only if 
required. These setters can ensure our objects don’t go into a bad state 
by validating the values that are passed to them.
````

````
7- What is abstraction?
>>  Abstraction is the second principle of object-oriented programming. 
It suggests that we should reduce complexity by hiding the unnecessary 
implementation details. As a metaphor, think of the remote control of 
your TV. All the complexity inside the remote control is hidden from 
you. It’s abstracted away. You just work with a simple interface to 
control your TV. We want our objects to be like our remote controls.
````

````
8- What is coupling? 
>>  Coupling represents the level of dependency between software 
entities (eg classes). The more our classes are dependent on each other, 
the harder it is to change them. Changing one class may result in several 
cascading and breaking changes.
````

````
9- How does the abstraction principle help reduce coupling? 
>>  By hiding the implementation details, we prevent other classes from 
getting affected when we change these details. For example, if the logic 
board and transistors inside a remote control change from one model to 
another, we’re not affected. We still use the same interface to work with 
our TV. Also, reducing these details and exposing fewer methods makes 
our classes easier to use. For example, remote controls with fewer 
buttons are easier to use.
````

````
10- What are constructors? 
>> Constructors are called when we instantiate our class. We use them 
to initialize our objects. Initialization means putting an object into an 
early or initial state (eg giving it initial values).
````

````
11- What is method overloading? 
>>  Method overloading means declaring a method with the same name 
but with different signatures. The number, type and order of its 
parameters will be different.
````

````
12- What are static methods?
>>  Static methods are accessible via classes, not objects.
````

````
1- How can we have ClassA inherit from ClassB? 
a) class ClassA inherits ClassB 
b) class ClassA extends ClassB 
c) class ClassA : ClassB 
d) class ClassA implements ClassB 
2- What will be printed on the console and why? 
var point1 = new Point(1, 2);
var point2 = new Point(1, 2); 
System.out.println(point1.equals(point2));
3- What does hashCode() method of the Object class return? 
4- What is a default constructor? 
5- How can we add a constructor to the Customer class? 
a) public Customer(String name) { } 
b) public void Customer(String name) {} 
c) public Constructor(String name) {} 
d) public void Constructor(String name) {} 
6- What is the super keyword? 
7- What is the difference between private and protected access 
modifiers? 
8- How accessible is a field or method if it’s declared without an access 
modifier? 
9- What is method overriding? How is it different from method 
overloading? 
10- What is the benefit of applying the @Override annotation when 
overriding a method? 
11- The Customer class inherits from the User class. Can we pass a 
Customer object to this method? Why? 
public void print(User user) {} 
12- What is the usage of the instanceof operator? 
13- What are the four principles of object-oriented programming? 
14- When do we use abstract classes? 
15- Can we have an abstract class without any abstract methods? 
16- When do we use final classes? 
17- What is the diamond problem? 
18- Does Java support multiple inheritance? 
Answers
1- B 
2- False - even though point1 and point2 have the same coordinates, the 
default implementation of the equals() method compares objects for 
reference equality. These two objects are in two different locations in 
memory, that’s why the equals() method returns false. 
3- The hashCode() methods returns a numeric value that is calculated 
based on the address of the object in memory. 
4- A constructor without any parameters. If we don’t create it, the Java 
compiler will automatically add one to our classes. 
5- A - constructors don’t have a return type, not even void. 
6- The super keyword is a reference to the base or parent class. We can 
use it to access the members (fields and methods) or call the 
constructors of the base class. In contrast, the this keyword returns a 
reference to the current object. 
7- Members marked with protected or private access modifiers are 
only accessible inside of a class. Protected members are inherited and 
are accessible by child (derived) classes. Private members are not. 
8- If we omit the access modifier, the member will have the default 
access modifier which makes that member public in package. In other 
words, that member will be public in the package but private outside of 
the package. 
9- Method overriding means changing the implementation of an 
inherited method in a subclass. For example, we can override the 
equals() or hashCode() methods of the Object class. Method 
overloading means declaring a method with different signatures 
(different number, type and order of parameters). 
10- It signals the Java compiler that we’re overriding a method in the 
base class and this helps the compiler check our code for correctness. It 
will ensure the signature of the method in the subclass matches the on 
declared in the base class. Also, if we remove this method from the base 
class, the compiler will let us know and we can remove the method in 
the subclass as well. 
11- Yes. We can pass an instance of any classes that inherit directly or 
indirectly from the User class. In this case, the customer object will get 
automatically upcast (meaning it’ll get converted to its base type - User). 
If we need to work with members of the customer object in this method, 
we need to explicitly downcast it by prefixing the object with 
(Customer). 
12- It tells us if an object is an instance of a class. We use it before 
casting an object to a different type to make sure we don’t get a casting 
exception. 
13- The four principles of object-oriented programming are: 
- Encapsulation: bundling the data and operations on the data inside 
a single unit (class). 
- Abstraction: reducing complexity by hiding unnecessary details 
(metaphor: the implementation detail of a remote control is hidden 
from us. We only work with its public interface.) 
- Inheritance: a mechanism for reusing code. 
- Polymorphism: a mechanism that allows an object to take many 
forms and behave differently. This will help us build extensible 
applications. 
14- An abstract class is a partially-implemented (half-cooked) class. We 
cannot instantiate them. But we use them to share some common code 
across their subclasses. 
15- Yes! An abstract class does not need abstract methods. But if we 
mark a method as abstract, we should mark the class as abstract as well. 
16- Final classes cannot be inherited. We use them when we’ve made 
certain assumptions about a class and we want to prevent other classes 
extending our class and break those assumptions. 
17- The diamond problem happens in languages that support multiple 
inheritance. If two classes (B, C) derive from A and are also the parents 
of another class (D), we see a diamond. If the top class (A) declares a 
method (eg toString) and its children (B and C) override this method, 
it’s not clear which implementation will be inherited by D.
18- No

