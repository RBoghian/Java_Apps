package com.company;

public class Main {

    public static void main(String[] args) {
        //byte
        //short
        //int
        //long
        //float
        //double
        //char
        //boolean
String myString = "This is a string";
        System.out.println("my String is equal to "  + myString);
        myString = myString + ", and this is more.";
        System.out.println(myString);
        myString = myString + "\u00A9 2020";
        System.out.println(myString);

        String numberString = "25055";
        numberString = numberString + "4995";
        System.out.println(numberString);
        int test = Integer.parseInt(numberString);
        int test2 = (int)(Integer.parseInt(numberString));
        System.out.println(test2);
        System.out.println(test);

        String lastString = "10";
        int myInt = 10;
        lastString = lastString + myInt;
        System.out.println(lastString);

        double doubleNumber = 120.47d;
        lastString = lastString + doubleNumber;
        System.out.println(lastString);



    }
}
