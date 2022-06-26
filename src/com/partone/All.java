package com.partone;

import java.lang.Math;
//////////////////////////////////////////////////////////////////////////////
// Square Sum
class SquareSum {

    // Method to sum the squares of three numbers
    double squareSum(double num1, double num2, double num3) {
        double sum = 0;

        num1 = num1 * num1;
        num2 = num2 * num2;
        num3 = num3 * num3;
        sum = num1 + num2 + num3;

        return sum;
    }
}

class Demo1 {

    public static void main(String args[]) {
        SquareSum sum = new SquareSum();
        System.out.println(sum.squareSum(2, 3, 4));
    }
}

///////////////////////////////////////////////////////////////////////
// Calling a Constructor from a Constructor
// Car class
class Car {

    // Private Fields
    private String carName;
    private String carModel;
    private String carCapacity;

    // Default Constructor
    public Car() {
        this.carName = "";
        this.carModel = "";
        this.carCapacity = "";
    }

    // Parameterized Constructor 1
    public Car(String name, String model) {
        this.carName = name;
        this.carModel = model;
    }

    // Parameterized Constructor 2
    public Car(String name, String model, String capacity) {
        this(name, model); // calling parameterized Constructor
        this.carCapacity = capacity; // Assigning capacity
    }

    // Method to return car details
    public String getDetails() {
        return this.carName + ", " + this.carModel + ", " + this.carCapacity;
    }

}

class Demo2 {

    public static void main(String args[]) {
        Car car = new Car("Ferrari", "F8", "100");
        System.out.println(car.getDetails());
    }

}

///////////////////////////////////////////////////////////////////////
class Student {

    // Private fields
    private String name;
    private double mark1;
    private double mark2;

    // Default Constructor
    public Student() {
        name = "";
        mark1 = 0;
        mark2 = 0;
    }

    // Parameterized Constructor
    public Student(String name, double mark1, double mark2) {
        this.name = name;
        this.mark1 = mark1;
        this.mark2 = mark2;
    }

    // Getter Function
    public double getMarks(int markNumber) {

        if (markNumber == 1)
            return mark1;
        return mark2;

    }

    public double calcTotal() {
        // Write definition here
        double totalMarks = mark1 + mark2;
        return totalMarks;
    }
}

class Demo3 {

    public static void main(String args[]) {
        Student student = new Student("Jack", 60, 70);
        System.out.println(student.calcTotal());
    }

}

///////////////////////////////////////////////////////////////////////

class Point {

    // Private fields
    private int x;
    private int y;

    // Default Constructor
    public Point() {
        x = 0;
        y = 0;
    }

    // Parameterized Constructor
    public Point(int x, int y) {
        this.x = x;
        this.y = y;
    }

    // Distance from origin
    public double distance() {
        double distance = Math.sqrt(x*x + y*y);
        return distance;
    }

    // Distance from (x2, y2)
    public double distance(int x2, int y2) {
        double distance = Math.sqrt(((x2-x)*(x2-x))+((y2-y)*(y2-y)));
        return distance;
    }

}

class Demo4 {

    public static void main(String args[]) {
        Point p1 = new Point(5, 5);
        System.out.println(p1.distance());
        System.out.println(p1.distance(2, 1));
    }

}
///////////////////////////////////////////////////////////////////////


class Calculator {

    // Class fields
    private double num1;
    private double num2;

    // Default Constructor
    public Calculator(double num1, double num2) {
        this.num1 = num1;
        this.num2 = num2;
    }

    // Addition Method
    double add() {
        return this.num1 + this.num2;
    }

    // Subtraction Method
    double subtract() {
        return this.num2 - this.num1;
    }

    // Multiplication Method
    double multiply() {
        return this.num1 * this.num2;
    }

    // Divison Method
    double divide() {
        return this.num2 / this.num1;
    }

}

class Demo5 {

    public static void main(String args[]) {
        Calculator obj = new Calculator(10, 94);

        System.out.println(obj.add());
        System.out.println(obj.subtract());
        System.out.println(obj.multiply());
        System.out.println(obj.divide());
    }

}



///////////////////////////////////////////////////////////////////////
// Class Rectangle
class Rectangle {

    // Private Fields
    private int length;
    private int width;

    // Default Constructor
    public Rectangle() {
        this.length = 0;
        this.width = 0;
    }

    // Parameterized Constructor
    public Rectangle(int length, int width) {
        this.length = length;
        this.width = width;

    }

    // Method to calculate Area of a rectangle
    public int getArea() {
        return this.length * this.width;
    }

}

class Demo6 {

    public static void main(String args[]) {

        Rectangle obj = new Rectangle(2, 2);
        System.out.println(obj.getArea());

    }

}
///////////////////////////////////////////////////////////////////////


// Student Class
class Student2 {

    // Private Fields
    private String name;
    private String rollNumber;
    public Student2(){
        name = "Unknown";
        rollNumber = "N/A";
    }


    // getter function for name
    public String getName() {
        return name;
    }

    // setter function for name
    public void setName(String x) {
        this.name = x;
    }

    // getter function for roll number
    public String getRollNumber() {
        return this.rollNumber;
    }

    // setter function for roll number
    public void setRollNumber(String x) {
        this.rollNumber = x;
    }

}

 class demo7 {
    public static void main(String[] args) {
        Student2 x = new Student2();
        System.out.println(x.getName());
        x.setName("Samantha");
        String student_name = x.getName();
        System.out.println(student_name);

        System.out.println(x.getRollNumber());
        x.setRollNumber("2211");
        String student_rollnum = x.getRollNumber();
        System.out.println(student_rollnum);


    }
}



///////////////////////////////////////////////////////////////////////




///////////////////////////////////////////////////////////////////////




///////////////////////////////////////////////////////////////////////

public class All {

}
