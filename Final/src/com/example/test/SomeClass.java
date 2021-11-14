package com.example.test;

public class SomeClass {
    public final int instanceNumber;
    private static int classCounter =0;
    private final String name;

    public SomeClass(String name) {
        classCounter++;
        this.name =name;
        instanceNumber = classCounter;
        System.out.println(name + " created,instance is " + instanceNumber);
    }
    public int getInstanceNumber(){
        return instanceNumber;
    }
}
