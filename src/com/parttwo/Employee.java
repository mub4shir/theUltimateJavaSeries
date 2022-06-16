package com.parttwo;

public class Employee {
    private int baseSalary;
    private int hourlyRate;


    public static int numberOfEmployees;

    // constructor overloading
    public Employee(int baseSalary){
        this(baseSalary,0);

    }
    public Employee(int baseSalary, int hourlyRate){
        setBaseSalary(baseSalary);
        setHourlyRate(hourlyRate);
        numberOfEmployees++;

    }
    // static methods can only see other static methods in this class for example we cannot access calculateWage method
    // because this method belongs to an employee object it's an instance method so we have to create an employee object
    // and then we will be able to access this method

    public static void printNumberOfEmployees(){
        System.out.println(numberOfEmployees);
    }


    // method overloading
    public int calculateWage(int extraHours){
        return  baseSalary + (hourlyRate *extraHours);
    }
    public int calculateWage(){
        return  calculateWage(0);
    }

    private void setBaseSalary(int baseSalary){
        if(baseSalary<=0)
            throw new IllegalArgumentException("Salary cannot be 0 or less.");
        this.baseSalary=baseSalary;
    }


    private void setHourlyRate(int hourlyRate){
        if(hourlyRate<0)
            throw new IllegalArgumentException("Hourly cannot be 0 or negative");
        this.hourlyRate=hourlyRate;
    }
    private int getBaseSalary(){
        return baseSalary;
    }
    private int getHourlyRate(){
        return hourlyRate;
    }
}
