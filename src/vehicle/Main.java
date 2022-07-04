package vehicle;

class Main {

    public static void main(String[] args) {
        var elantraSedan = new Car("Hyundai", "Red", 2019, "Elantra", "Sedan"); //creation of car Object
        elantraSedan.carDetails(); //calling method to print details
        elantraSedan.display();
    }

}
