package com.company;

import org.w3c.dom.ls.LSOutput;

import java.sql.SQLOutput;

public class Main {

    public static void main(String[] args) {

        int result = 1 + 2; // 1 + 2 = 3
        System.out.println(result);
        int previousResult = result;
        System.out.println("previous result " + previousResult);
        result = result - 1; // 3 - 1 = 2
        System.out.println("3 - 1 = " + result);
        System.out.println("previous result " + previousResult);

        result = result * 10; // 2 * 10 = 20

        System.out.println("2*10 = " + result);
        result = result / 5; //20 / 5 = 4

        System.out.println("20 / 5 = " + result);

        result = result % 3; // remainder of (4%3) = 1
        System.out.println("4 % 3 = " + result);

        // result = reslut + 1;
        result++; // equals 2;
        System.out.println(result);
        result--; // equals 1
        System.out.println(result);
        result += 2; // equals 3
        System.out.println(result);
        //result = result *10
        result *= 10;
        System.out.println(result);

        //result = result / 3

        result /= 3;
        System.out.println(result);

        boolean isAlien = false;
        if (!isAlien) {
            System.out.println("It is not an alien!");
            System.out.println("And I am scared of aliens");
        }
        int topScore = 90;
        if(topScore < 100){
            System.out.println("You got the highscore!");
        }
        int secondTopScore = 91;
        if((topScore>secondTopScore) && (topScore<100)){
            System.out.println("Greater than second top score and less than 100");
        }
        if((topScore>90) || (secondTopScore<=90)){
            System.out.println("Either or both conditions are true");
        }
        boolean isCar = false;
        if(isCar){
            System.out.println("test message");
        }
        isCar = true;
        boolean wasCar = isCar ? true : false;
        if(wasCar){
            System.out.println("wasCar is true");
        }
    }
}
