package com.example.test;

public class Main {

    public static void main(String[] args) {
	StaticTest firstInstance = new StaticTest("1st Instance");
        System.out.println(firstInstance.getName() +" is inst number " + StaticTest.getNumInstances());
        StaticTest secondInstance = new StaticTest("2nd Instance");
        System.out.println(secondInstance.getName() +" is inst number " + StaticTest.getNumInstances());
    }
}
