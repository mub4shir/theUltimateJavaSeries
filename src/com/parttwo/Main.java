package com.parttwo;

public class Main {
    public static void main(String[] args) { // java runtime to directly call this method without having to create a new object
//        var textBox1 = new TextBox();
//        var textBox2 =textBox1;
//        textBox2.setText("Hello World");
//        System.out.println(textBox1.text);

        var employeeWithoutHourlyRate =new Employee(10_000);
        var employee= new Employee(
                50_000,20);


        int wage = employee.calculateWage(20);
        int wageWithoutHourlyRate=employeeWithoutHourlyRate.calculateWage();
        Employee.printNumberOfEmployees();
        System.out.println(wage);
        System.out.println(wageWithoutHourlyRate);

//        var browser = new Browser();
//        browser.navigate("");


    }
}
