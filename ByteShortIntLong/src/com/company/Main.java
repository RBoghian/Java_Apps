package com.company;

public class Main {

    public static void main(String[] args) {

        int myValue = 10000;
        int myMinIntValue = Integer.MIN_VALUE;
        int myMaxIntValue = Integer.MAX_VALUE;
        System.out.println("Integer max value = " + myMaxIntValue);
        System.out.println("Integer min value = " + myMinIntValue);
        System.out.println("Busted MAX value = " + (myMaxIntValue+1));
        System.out.println("Busted MIN value = " + (myMinIntValue-1));
        int myMaxIntTest = 2_147_483_647;

        byte myMinByteValue = Byte.MIN_VALUE;
        byte myMaxByteValue = Byte.MAX_VALUE;
        System.out.println("Byte min value = " + myMinByteValue);
        System.out.println("Byte max value = " + myMaxByteValue);

        short myMinShortValue = Short.MIN_VALUE;
        short myMaxShortValue = Short.MAX_VALUE;
        System.out.println("Short min value = " + myMinShortValue);
        System.out.println("Short max value = " + myMaxShortValue);

        long myLongValue = 100L;
        long myMinLongValue = Long.MIN_VALUE;
        long myMaxLongValue = Long.MAX_VALUE;
        System.out.println("Long min value = " + myMinLongValue);
        System.out.println("Long max value = " + myMaxLongValue);

        long bigLongLiteralValue = 2_147_483_647_234L;
        System.out.println(bigLongLiteralValue);

        short bigShortLiteralValue = 32767;

        int myTotal = (myMinIntValue/2);
        byte myNewByteValue = (byte)(myMinByteValue/2);
        short MyNewShortValue = (short)(myMinShortValue/2);

        byte a = Byte.MAX_VALUE - 50;
        short b = Short.MAX_VALUE-10000;
        int c = 500;

        long exercise = 50000 + 10*(a+b+c);
        System.out.println(exercise);
    }
}
