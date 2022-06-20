package com.parttwo.inheritance;

public class Main {

    public static void main(String[] args) {
//        var box1 = new TextBox();
//        var box2 = box1;
//        var box3= new TextBox();


        // box1.hashCode() // get an integer and is calculated based on the address of the object in memory it's not the address of the obj in memory
        // the address of the object goes to a special function called a hash function and the job of this function is to get a value and map it to a numeric value
        // which we call a hash so this the hashCode of this object used in a lot of situations like comparing objects for equality
        // protected is like public in their package, but they are also accessible by child classes in different packages
        // and default access modifier which is called package private and that means this field is public anywhere in this package but private outside this package even class in other package will not be able to access this field

//        System.out.println(box1.hashCode());
//        System.out.println(box2.hashCode());
//        System.out.println(box2.equals(box1));
//        System.out.println(box2.equals(box3));
//        System.out.println(box1.toString());
//////////////////////////////////////////////////////////////////////
//        var textBox = new TextBox();
//        textBox.setText("Hello World");
//        System.out.println(textBox.toString()); // we don't need to call toString() method because println method automatically calls toString() method on any objects that are passed


        // upcasting example => casting an object to one of its super types or parents
//        var control = new UIControl(true);
//        var textBox = new TextBox();
//        show(textBox);  // because textBox object inherits all the members of the control object
        // so every textBox object is also a control object that is why we say inheritance represents an is a relationship
        // a textBox is a control
        // and we pass textBox object here and this objects gets automatically cast to UI control this is what we called upcasting , so this object is getting cast to its parent we could also change parameter type to Object and
        // once again we have upcasting because evey textBox is also an Object


//    }
//    public  static void show(UIControl control){
//        if(control instanceof TextBox) {
//            var textBox = (TextBox) control;  // down-casting => casting an object one of its subtypes
//            textBox.setText("Hello World");
//        }
//        System.out.println("casting: "+control);
//    }
// comparing objects   //////////////////////////////////////////////////////////////////////////

//  var point1 = new Point(1,2);
//  var point2 = new Point(1,2);
//        System.out.println(point1.equals(new TextBox()));
//        System.out.println(point1.equals(point1));
//        System.out.println(point1.hashCode());
//        System.out.println(point2.hashCode());

        // polymorphism in action control object taking many form , calling override  different methods in their respective classes
        // at compile time we declared array of UIControl , controls , at runtime we are inserting , different objects inside this array
        // each object had its own render method
        // control object is taking many forms
        UIControl[] controls= {new TextBox(), new CheckBox()};
        for(var control : controls)
            control.render();

        // if class is final it can't be extended like String class because in java strings are immutable if u do toLowerCase() it returns a new string
        // if a method is final it can't be overridden


        //don't create deep inheritance hierarchies

        // abstract classes cannot be instantiated and their sole purpose is to provide some common code to their subclasses

    }

}
