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

>> 1- B 
````

````
2- What will be printed on the console and why? 
var point1 = new Point(1, 2);
var point2 = new Point(1, 2); 
System.out.println(point1.equals(point2));

>> 2- False - even though point1 and point2 have the same coordinates, the 
default implementation of the equals() method compares objects for 
reference equality. These two objects are in two different locations in 
memory, that’s why the equals() method returns false.  

````

````
3- What does hashCode() method of the Object class return? 
>> 3- The hashCode() methods returns a numeric value that is calculated 
based on the address of the object in memory. 
````

````
4- What is a default constructor? 

>> 4- A constructor without any parameters. If we don’t create it, the Java 
compiler will automatically add one to our classes.
````

````
5- How can we add a constructor to the Customer class? 
a) public Customer(String name) { } 
b) public void Customer(String name) {} 
c) public Constructor(String name) {} 
d) public void Constructor(String name) {} 

>> 5- A - constructors don’t have a return type, not even void.
````

````
6- What is the super keyword? 

>> 6- The super keyword is a reference to the base or parent class. We can 
use it to access the members (fields and methods) or call the 
constructors of the base class. In contrast, the this keyword returns a 
reference to the current object. 
````

````
7- What is the difference between private and protected access 
modifiers? 

>> 7- Members marked with protected or private access modifiers are 
only accessible inside of a class. Protected members are inherited and 
are accessible by child (derived) classes. Private members are not. 
````

````
8- How accessible is a field or method if it’s declared without an access 
modifier? 

>> 8- If we omit the access modifier, the member will have the default 
access modifier which makes that member public in package. In other 
words, that member will be public in the package but private outside of 
the package. 
````

````
9- What is method overriding? How is it different from method 
overloading?

>>  9- Method overriding means changing the implementation of an 
inherited method in a subclass. For example, we can override the 
equals() or hashCode() methods of the Object class. Method 
overloading means declaring a method with different signatures 
(different number, type and order of parameters). 
````

````
10- What is the benefit of applying the @Override annotation when 
overriding a method? 

>> 10- It signals the Java compiler that we’re overriding a method in the 
base class and this helps the compiler check our code for correctness. It 
will ensure the signature of the method in the subclass matches the on 
declared in the base class. Also, if we remove this method from the base 
class, the compiler will let us know and we can remove the method in 
the subclass as well. 
````

````
11- The Customer class inherits from the User class. Can we pass a 
Customer object to this method? Why? 
public void print(User user) {} 

>> 11- Yes. We can pass an instance of any classes that inherit directly or 
indirectly from the User class. In this case, the customer object will get 
automatically upcast (meaning it’ll get converted to its base type - User). 
If we need to work with members of the customer object in this method, 
we need to explicitly downcast it by prefixing the object with (Customer). 
````

````
12- What is the usage of the instanceof operator? 

>> 12- It tells us if an object is an instance of a class. We use it before 
casting an object to a different type to make sure we don’t get a casting 
exception. 
````

````
13- What are the four principles of object-oriented programming? 

>> 13- The four principles of object-oriented programming are: 
- Encapsulation: bundling the data and operations on the data inside 
a single unit (class). 

- Abstraction: reducing complexity by hiding unnecessary details 
(metaphor: the implementation detail of a remote control is hidden 
from us. We only work with its public interface.)
 
- Inheritance: a mechanism for reusing code. 

- Polymorphism: a mechanism that allows an object to take many 
forms and behave differently. This will help us build extensible 
applications. 

````

````
14- When do we use abstract classes? 

>> 14- An abstract class is a partially-implemented (half-cooked) class. We 
cannot instantiate them. But we use them to share some common code 
across their subclasses. 
````

````
15- Can we have an abstract class without any abstract methods? 

15- Yes! An abstract class does not need abstract methods. But if we 
mark a method as abstract, we should mark the class as abstract as well. 

````

````
16- When do we use final classes? 

16- Final classes cannot be inherited. We use them when we’ve made 
certain assumptions about a class and we want to prevent other classes 
extending our class and break those assumptions.

````

````
17- What is the diamond problem? 

>> 17- The diamond problem happens in languages that support multiple 
inheritance. If two classes (B, C) derive from A and are also the parents 
of another class (D), we see a diamond. If the top class (A) declares a 
method (eg toString) and its children (B and C) override this method, 
it’s not clear which implementation will be inherited by D.
````

````
18- Does Java support multiple inheritance? 

>> 18- No

````

# interfaces

````
                        A ---------> B
    # we interfaces to build loosely-coupled, extensible, testable applications.
    # abstraction says hide the impletations details of our classes and only expose what is necessary 
        so by hiding certian members using the private keyword calss A will know less about class B and this will loosen the relationship 
        between these two classes but that not enough but that is where interfaces come to the rescue with an interface we can completely decouple 
        A from B so it knows absloutely nothing about it like it does'nt even exist if we change B , A is not 
        going to be affected 

    # a interface is a type similar to a class but it only includes method declarations no implementation, it has no code ,
        it only defines capabilities a class should have  

    # so to minimize the impact of changes we put an interface in between these two classes and decouple them 
                
                    A------> INTERFACE <------B
    
                    public interface Draggable {
                            void drag();
                    }

    # so if we change the code in B, A will not be affected because it knows nothing about B this is what we call programming aganist interfaces 
    # so we code our classes to work with interfaces not concrete implementations and with this we can build applications that 
        are loosely-coupled and extensible so that we can easily replace B with another class that implements this interface this makes it relatively easy 
        to extend our applications 
    # for example lets say we use B to perform faical recognition , tomarrow we can replace B with another class like C that does a better job at face recognition, 
        its faster and more accurate this will not affect rest of our application , we simply replace one class with another one as long as both of these classes 
        follow our contract or interface everything will continue to work 

    # so interface gives idea what should be done and classes that implement that interface determine 
        how it should be done anywhere we need to have flexibility to swap how something is done, we can use an 
        interface to make our design loosely-coupled and extensible 

    # examples are 
        data compression 
        encryption 
        sorting 
        searching 

    # so interfaces are about whats and classes are about hows 
      we can easily exyend and replace various parts with minimal or zero 
       impact on our application we can also independently test these part and make sure they are working 
       this is what we call unit testing 
````

# dependency injection 

````
    # our classes should not instantiate their dependencies
    # we have various ways to inject these dependencies 
    # constructor injection : we pass dependency via the constructor of class (used most of the times beacuse with this approach we can quickly see dependencies of a class at glance )
    # setter injection: we can change the dependencies of class through out the life time of our applications 
    # method injection : we pass a dependency to the method that needs that dependency 
    
    
````

# interface segregation principle

````
   # divide big fat interfaces into smaller ones with this we can reduce the impact of changes 
   # each interface should be focused on single capability 
   # class cannot have multiple parents but interface can have multiple parents 
    
````

# features that have changed the meaning of interfaces / bad direction 

````
    # declaring fields in our interfaces ( public, static, final fields)
    # ability to define static methods in our interfaces (logic can change as interfaces were not made for implementation / code / logic, it can change )
    # so avoid static methods in interfaces whenever you are defining logic you are dealing with hows, hows dont belong to interfaces 
        they belong to classes
        
    # in java 9 ability to implement private methods in an interfaces
    
````


# benefits of interfaces 

````
    # swap implementations 
    # extend your applications with minimal impact 
    # test you classes in solation 
    
````

    

````
1- Why do we use interfaces? 
2- What is tightly-coupled code? 
3- Is this code loosely or tightly coupled and why? 
public interface TaxCalculator 
{}
public class TaxCalculator2018 implements TaxCalculator 
{}
public class TaxReport {
 private TaxCalculator calculator; 
 public TaxReport() {
 calculator = new TaxCalculator2018();
 }
}
4- What is dependency injection? 
5- What are the various types of dependency injection? 
6- What is the Interface Segregation Principle (ISP)? 
7- Why shouldn’t we declare fields, static or private methods in 
interfaces? 
8- What are the similarities and differences between interfaces and 
abstract classes? 
9- Should we extract an interface from every class? Why? 
Answers
1- We use interfaces to build loosely-coupled, extensible and testable 
applications. 
2- Tightly-coupled code is code that is hard to change because there is a 
strong dependency between the entities (eg classes) in the code. 
Changing one class may result in several cascading, breaking changes in 
the code. 
3- Even though the type of the calculator field in TaxReport is an 
interface, we’re initializing this field to an instance of 
TaxCalculator2018 in the constructor. So, TaxReport is tightly 
coupled to TaxCalculator2018, which is an implementation, not an 
interface. 
4- Dependency injection refers to passing or injecting dependencies of a 
class. 
5- We can inject dependencies via constructors, setters and regular 
methods. 
6- The Interface Segregation Principle (ISP) suggests that we should 
segregate or divide big, fat interfaces into smaller ones, each focusing on 
a single responsibility or capability. Smaller interfaces are less likely to 
change. Changes to one capability, will only affect a single interface and 
fewer classes that depend on that interface. 
7- Fields, static and private methods are all about implementation. 
Interfaces are contracts and should not have any implementation. 
8- Both are abstract concepts and we cannot instantiate them. 
Interfaces are contracts and should only have method declarations. 
Abstract classes are partially-implemented classes. We use them to 
share some common code across their derivates. The new features in 
Java allow writing code and logic in interfaces but this is a bad practice 
and should be avoided. 
9- Blindly extracting interfaces doesn’t solve any problems nor is it 
considered a best practice. If you extract an interface from every single 
class, you’ll end up with an explosion of interfaces that don’t necessarily 
add any values. You should use interfaces in situations where you want 
to decouple a class from its dependencies so you can swap these 
dependencies. This allows building applications that are extensible and 
testable
````

 

# exceptions
````
    # an exception is an object that contains information about an error 
    # in java we have three types of exceptions 
    # checked : are exceptions that we developer should anticipate and handle properly 
    for example we wanna read data from a file, what if the file does not exist 
    java compiler enforceses us handle these errors that is why they are called checked exceptions because they get checked at compile time 
    # unchecked / runtime exceptions : these expeptions are not checked by compiler at compile time they occur because of programming errors 
    NullPointerException is an example of runtime exception 
    ArithmeticException: gets thrown when we divide value by zero
    IllegalArgumentException: agrument we passed the method was not accepted 
    IndexOutOfBoundsException: gets thrown if we try to access an element in an array , string, or a list using an invalid index
    IllegalStateException: if we try to call a method but the underlying object is not in the right state 
    # errors: error external to an application for example stackoverflow error or out of memory error 
    jvm runs out of memory, infinite recursion , or problem in jvm itself 
    
    
    # exception hierarchy 
    
                throwable  // class  defines common charactristics for all exceptions and errors like an error message and the stack trace 
                
                
        exception // parent for all checked and unchecked exceptions            error  // errors that are external to appplication like out of memory error 
        
        
        runtimeException  represents runtime exceptions aka unchecked exceptions  
        
        # so if an exception class derives from the runtimeException its considered an unchecked exception 
        otherwise its an checked exception this is bit wired because when you think that in classes that derive from the exception class is checked exception
        so runtimeException should also be a checked exception but that is not how it works why honestly i have no clue u have to ask the developer of java 
        
        
        # we can have multiple catch blocks and each catch block can target specfic type of and exception 
        like 
        
        try {
           var reader = new FileReader("file.txt");
           var value = reader.read();
        }
        catch (FileNotFoundException e){
            e.printStackTrace();
        }
        catch (IOException e){
            System.out.println("Could not read data");
        }
        
        # sometimes the order of catch blocks matter  
        # so if u have an IOException it an catch IOExceptions or any of its derivatives 
        like FileNotFoundException and the classes that extend IOException class 
        
        IOException ex = new IOexception()
        or 
        IOException ex = new FileNotFoundException()
        this is ploymorphism an object taking different forms   
        
        catch(IOException | ParseException e){
            System.out.println("could no read data");
        }
        
        
       # try with resources statement 
       
       try (
            var reader = new FileReader("file.txt");
            var writer = new FileWriter("..."); 
            ) {
            var value = reader.read();
        }
        catch(IOException e){
            System.out.println("Could not read data");
        }
        
        try statement that has one or more resource with this structure we don't need to explicitly this resource inside the finally block the java compiler will do that for us 
        it will translate this code, it will add a finally block and explicitly close the reader object, now for to work the FileReader should implement AutoCloseable interface
        AutoCloseable interface declares a method called close() so the close method we have in FileReader actually comes from here 
         
        
````
 










 



