package com.example.test;

public class Main {

    public static void main(String[] args) {
Account account = new Account("Tim");
account.deposit(1000);
account.withdrawal(500);
account.withdrawal(-200);
account.deposit(-20);
account.calculateBalance();
        //account.balance =5000;
        System.out.println("Balance is " + account.getBalance());
//account.transactions.add(4500);
account.calculateBalance();
    }
}
