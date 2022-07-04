package vehicle;

// Derived Class Car
class Car extends Vehicle {

    // Private field
    private String bodyStyle;
    int fuelCap = 50; //fuelCap field inside SubClass

    // Parameterized Constructor
    public Car(String make, String color, int year, String model, String bodyStyle) {
        super(make, color, year, model);  //calling parent class constructor
        this.bodyStyle = bodyStyle;
    }

    public void carDetails() {  //details of car
        printDetails();         //calling method from parent class
        System.out.println("Body Style: " + bodyStyle);
    }
    public void display() {
        //accessing the field of parent class using super*/
        System.out.println("Fuel Capacity from the Vehicle class: " + super.fuelCap);
        //without using super the field of current class shadows the field of parant class*/
        System.out.println("Fuel Capacity from the Car class: " + fuelCap);

    }

}
