package com.Adventure;

import jdk.swing.interop.SwingInterOpUtils;
import org.w3c.dom.ls.LSOutput;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Main {

    public static void main(String[] args) {

        String challenge1 = "I want a bike.";
        String challenge2 = "I want a ball.";
        System.out.println(challenge1.matches("I want a bike."));

        String regExp="I want a \\w+.";
        System.out.println(challenge1.matches(regExp));
        System.out.println(challenge2.matches(regExp));

        String regExp3 = "I want a \\w+.";
        Pattern pattern = Pattern.compile(regExp3);
        Matcher matcher = pattern.matcher(challenge1);
        System.out.println(matcher.matches());
        matcher = pattern.matcher(challenge2);
        System.out.println(matcher.matches());

        String challenge4= "Replace all blanks with undescores.";
        System.out.println(challenge4.replaceAll(" ", "_"));

        String challenge5 = "aaabbbcccddd";
        System.out.println(challenge5.matches("[abcd]+"));
        System.out.println(challenge5.matches("^a{3}b{3}c{3}d{3}$"));

        String challenge7="abcd.135";
        System.out.println(challenge7.matches("^[A-z][a-z]+\\.\\d+$"));



    }
}
