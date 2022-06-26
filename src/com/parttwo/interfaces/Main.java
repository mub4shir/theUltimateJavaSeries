package com.parttwo.interfaces;

public class Main {
    public static void main(String[] args) {

        // poor mans dependency injection
        var calculator = new TaxCalculator2018(100_000);
        var report = new TaxReport();
        report.show(calculator);
        report.show(new TacCalculator2019());

    }





}
