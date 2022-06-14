package com.partone;

import java.awt.*;
import java.util.Arrays;
import java.util.Date;
import java.util.Locale;

public class Main {

    public static void main(String[] args) {
        int myAge = 25;

        int herAge = myAge;
        long viewCount = 3_123_456_789L;
        float price = 10.99F;
        char letter = 'S';
        boolean isEligible = false;
        Date now = new Date();

        Point point1 = new Point(1, 1);
        Point point2 = point1;
        point1.x = 2;

        // point1 and point2 are referencing the exact same point object in memory
        // reference types are copied by the references whereas primitive types are copied by their value
        // and these values are completely independent of each other

        String message = "       Hello World" + "!!";

        message.endsWith("!!");
        message.startsWith("H");
        message.indexOf("H");
        message.indexOf("sky");
        message.length();
        message.replace("!", "*"); // does not modify original string returns a new string
        message.toLowerCase();                   // in java strings are immutable
        message.toUpperCase();
        message.trim();
        System.out.println(message.trim());
        System.out.println(message);

        String str = "Hello \"Mubashir\"";
        String dir = "c:\tWindows\\...";

        System.out.println(str);
        System.out.println(dir);
        System.out.println("////////////////////////////////////////////////////////////////////////////////////");
        int[] numbers = {1, 2, 3, 4, 5, 1};
        int len = numbers.length;

        System.out.println(len);

        Arrays.sort(numbers);

        Arrays.toString(numbers);

        int[][] numbers2 = {{1, 2, 3}, {4, 5, 6}};

        System.out.println(Arrays.deepToString(numbers2));

        System.out.println("////////////////////////////////////////////////////////////////////////////////////");



        final float PI =3.14F;
        double result = (double) 10 / (double)3;

        int x=1;
        x+=2;
        int y =++x;

        System.out.println(x);
        System.out.println(y);
        int z = (10 + 3) * 2;
        // () > */ , > +-
        System.out.println(z);
        short a =1;
        int b = a+2;
        double c =1.1;
        int  d = (int)c +2; // 2.0

                    // implicit casting || automatic casting || automatic conversion
                    // whenever we have value and that value can be converted to data type that is bigger, casting or conversion
                    // happens implicitly or automatically
                    // so byte> short > int > long > float > double
                    // implicit casting happens whenever we are not going to lose data,

        String e ="1.1";
        //int f= Integer.parseInt(e) +2;
        double g = Double.parseDouble(e)+2;
        System.out.println(b +" "+ d +" "+ " "+ g);

    }

}
