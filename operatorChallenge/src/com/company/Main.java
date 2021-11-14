package com.company;

public class Main {

    public static void main(String[] args) {

        double doubleVariable = 20.00d;
        double secondDoubleVariable = 80.00d;
        double operations = (doubleVariable + secondDoubleVariable)*100.00;
        double remainder = operations % 40.00;
        boolean booleanOp = (remainder == 0) ? true : false;
        System.out.println("Booleanul este  = " + booleanOp);
        if(!booleanOp){
            System.out.println("Got some remainder");
        }

    }
}
