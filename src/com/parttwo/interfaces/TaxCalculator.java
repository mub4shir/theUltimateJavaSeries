package com.parttwo.interfaces;

public interface TaxCalculator {

    float minimumTax =100; // public, static, final fields
    // public keyword is redundant because every method we declare here has to be implemented by class and these methods should be public their so that
    // they can be accessed by other classes because this interface determines the public interface of the class, the public contract
     double calculateTax(); // abstract method / only having method declaration



}
