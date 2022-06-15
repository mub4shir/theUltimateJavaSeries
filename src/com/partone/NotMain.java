package com.partone;

import java.text.NumberFormat;
import java.util.*;

public class NotMain {

    public static void main(String[] args) {
//        int myAge = 25;
//
//        int herAge = myAge;
//        long viewCount = 3_123_456_789L;
//        float price = 10.99F;
//        char letter = 'S';
//        boolean isEligible = false;
//        Date now = new Date();
//
//        Point point1 = new Point(1, 1);
//        Point point2 = point1;
//        point1.x = 2;
//
//        // point1 and point2 are referencing the exact same point object in memory
//        // reference types are copied by the references whereas primitive types are copied by their value
//        // and these values are completely independent of each other
//
//        String message = "       Hello World" + "!!";
//
//        message.endsWith("!!");
//        message.startsWith("H");
//        message.indexOf("H");
//        message.indexOf("sky");
//        message.length();
//        message.replace("!", "*"); // does not modify original string returns a new string
//        message.toLowerCase();                   // in java strings are immutable
//        message.toUpperCase();
//        message.trim();
//        System.out.println(message.trim());
//        System.out.println(message);
//
//        String str = "Hello \"Mubashir\"";
//        String dir = "c:\tWindows\\...";
//
//        System.out.println(str);
//        System.out.println(dir);
//        System.out.println("////////////////////////////////////////////////////////////////////////////////////");
//        int[] numbers = {1, 2, 3, 4, 5, 1};
//        int len = numbers.length;
//
//        System.out.println(len);
//
//        Arrays.sort(numbers);
//
//        Arrays.toString(numbers);
//
//        int[][] numbers2 = {{1, 2, 3}, {4, 5, 6}};
//
//        System.out.println(Arrays.deepToString(numbers2));
//
//        System.out.println("////////////////////////////////////////////////////////////////////////////////////");
//
//
//
//        final float PI =3.14F;
//        double result = (double) 10 / (double)3;
//
//        int x=1;
//        x+=2;
//        int y =++x;
//
//        System.out.println(x);
//        System.out.println(y);
//        int z = (10 + 3) * 2;
//        // () > */ , > +-
//        System.out.println(z);
//        short a =1;
//        int b = a+2;
//        double c =1.1;
//        int  d = (int)c +2; // 2.0
//
//                    // implicit casting || automatic casting || automatic conversion
//                    // whenever we have value and that value can be converted to data type that is bigger, casting or conversion
//                    // happens implicitly or automatically
//                    // so byte> short > int > long > float > double
//                    // implicit casting happens whenever we are not going to lose data,
//
//        String e ="1.1";
//        //int f= Integer.parseInt(e) +2;
//        double g = Double.parseDouble(e)+2;
//        System.out.println(b +" "+ d +" "+ " "+ g);
//
//
//        System.out.println("////////////////////////////////////////////////////////////////////////////////////");
//        int result1= Math.round(1.1F);
//            result1 = (int)Math.ceil(1.1F);
//            result1 = (int)Math.floor(1.1F);
//            result1 = Math.max(1,2);
//            result1=Math.min(1,2);
//            result1=(int)Math.random() *100;
//            result1= (int)Math.round(Math.random() *100);
//            result1 =(int)Math.random() *100; // applying casting to result of 'Math.random()' method call not entire expression so fix is below
//            result1 = (int) (Math.random() *100);
//
//        // NumberFormat currecny = new NumberFormat() ;
//        // we cannot create an instance of the NumberFormat class because its abstract
//
//         // creates an instance of NumberFormat class and return it ,  a factory method, because like a factory it creates new objects
//        String result3=NumberFormat.getCurrencyInstance(Locale.US).format(1234567.891);
//
//        String result4 =NumberFormat.getPercentInstance().format(0.1);
//
//        System.out.println(result3 + " "+result4);
//        Scanner sc = new Scanner(System.in);
//        System.out.print("Name: ");
//        String name =sc.nextLine().trim();
//        System.out.println("You are "+ name);
//
//        System.out.println("////////////////////////////////////////////////////////////////////////////////////");
//        final byte MONTHS_IN_YEAR = 12;
//        final byte PERCENT = 100;
//
//        Scanner scanner = new Scanner(System.in);
//
//        System.out.print("Principal: ");
//        int principal = scanner.nextInt();
//
//        System.out.print("Annual Interest Rate: ");
//        float annualInterest = scanner.nextFloat();
//        float monthlyInterest = annualInterest / PERCENT / MONTHS_IN_YEAR;
//
//        System.out.print("Period (Years): ");
//        byte years = scanner.nextByte();
//        int numberOfPayments = years * MONTHS_IN_YEAR;
//
//        double mortgage = principal
//                * (monthlyInterest * Math.pow(1 + monthlyInterest, numberOfPayments))
//                / (Math.pow(1 + monthlyInterest, numberOfPayments) - 1);
//
//        String mortgageFormatted = NumberFormat.getCurrencyInstance(Locale.US).format(mortgage);
//
//        System.out.println("Mortgage: " + mortgageFormatted);
//
//        System.out.println("////////////////////////////////////////////////////////////////////////////////////");

//        int x = 1;
//        int y = 1;
//        System.out.println(x==y);
//        System.out.println(x!=y);
//        System.out.println(x>y);
//        System.out.println(x<y);
//        System.out.println(x<=y);
//        System.out.println(x>=y);

//        int temperature = 12;
//        boolean isWarm = temperature > 20 && temperature < 30;
//        //System.out.println(isWarm);
//
//        boolean hasHighIncome = false;
//        boolean hasGoodCredit = true;
//        boolean hasCriminalRecord = false;
//        boolean isEligible = (hasHighIncome || hasGoodCredit) && !hasCriminalRecord;
//
//        int income = 100_000;
//        String className = (income > 100_000) ? "First" : "Economy";
//
//        String role = "admin";
//
//        switch (role) {
//            case "admin":
//                System.out.println("You're an admin");
//                break;
//            case "moderator":
//                System.out.println("You're a moderator");
//                break;
//            default:
//                System.out.println("You're a guest");
//        }

//        String input = "";
//        Scanner sc = new Scanner(System.in);
//        while (true) {
//            System.out.print("Input: ");
//            input = sc.next().toLowerCase();
//            if (input.equals("pass"))
//                continue;
//            if (input.equals("quit"))
//                break;
//            System.out.println(input);
//        }
//        do{
//            System.out.print("Input: ");
//            input=sc.next().toLowerCase();
//            System.out.println(input);
//
//        }while(!input.equals("quit"));

//        System.out.println(className);
//        while(true){
//            System.out.println("checking mem");
//        }
        final byte MONTHS_IN_YEAR = 12;
        final byte PERCENT = 100;

        int principal = 0;
        float monthlyInterest = 0;
        int numberOfPayments = 0;

        Scanner scanner = new Scanner(System.in);

        while (true) {
            System.out.print("Principal: ");
            principal = scanner.nextInt();
            if (principal >= 1000 && principal <= 1_000_000)
                break;
            System.out.println("Enter a value between 1000 and 1000000");
        }

        while (true) {
            System.out.print("Annual Interest Rate: ");
            float annualInterest = scanner.nextFloat();
            if (annualInterest >= 1 && annualInterest <= 30) {
                monthlyInterest = annualInterest / PERCENT / MONTHS_IN_YEAR;
                break;
            }
            System.out.println("Enter a value between 1 and 30");
        }

        while (true) {
            System.out.print("Period (Years): ");
            byte years = scanner.nextByte();
            if (years >= 1 && years <= 30) {
                numberOfPayments = years * MONTHS_IN_YEAR;
                break;
            }
            System.out.println("Enter a value between 1 and 30.");
        }

        double mortgage = principal
                * (monthlyInterest * Math.pow(1 + monthlyInterest, numberOfPayments))
                / (Math.pow(1 + monthlyInterest, numberOfPayments) - 1);

        String mortgageFormatted = NumberFormat.getCurrencyInstance().format(mortgage);
        System.out.println("Mortgage: " + mortgageFormatted);


    }
}

