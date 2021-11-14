package com.example.test;

public class ScopeCheck{
    public int publicVar=0;
    private int varOne =1;

    public ScopeCheck() {
        System.out.println("Scope check created, publicVar = " + publicVar + "\n private var =  " + varOne);

    }

    public int getPrivateVar() {
        return varOne;
    }

    public void timesTwo(){
        int var2 =2;
        for(int i =0;i<10;i++){
            System.out.println(i + " times two is " +i*var2);
        }
    }
    public class InnerClass{
       public int var3 =3;

        public InnerClass() {
            System.out.println("InnerClass created, var1 is " + varOne +" var3 is " + var3);
        }
        public void timesTwo(){

            System.out.println("varOne is still available here " +varOne);

            for(int i =0;i<10;i++){
                System.out.println(i + " times two is " +i* var3);
            }
        }
    }
}
