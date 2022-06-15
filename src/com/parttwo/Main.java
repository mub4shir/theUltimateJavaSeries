package com.parttwo;

import java.util.Locale;

public class Main {
    public static void main(String[] args) {
//        var textBox1 = new TextBox();
//        var textBox2 =textBox1;
//        textBox2.setText("Hello World");
//        System.out.println(textBox1.text);


        var employee= new Employee();
        employee.setBaseSalary(10_000);
        employee.setHourlyRate(20);
        int wage = employee.calculateWage(10);

        System.out.println(wage);



    }
}
