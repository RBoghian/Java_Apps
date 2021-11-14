package com.Adventure;

import java.util.Arrays;
import java.util.HashSet;
import java.util.Set;

public class SetMain {
    public static void main(String[] args) {
        Set<Integer> squares = new HashSet<>();
        Set<Integer> cubes = new HashSet<>();

        for(int i =1; i<=100;i++){
            squares.add(i*i);
            cubes.add(i*i*i);
        }
        System.out.println("There are " + squares.size() + " squares " + cubes.size() + " cubes");
        Set<Integer> union = new HashSet<>(squares);
        union.addAll(cubes);
        System.out.println("There are " + union.size()+ " elements");

        Set<Integer> intersection = new HashSet<>(squares);
        intersection.retainAll(cubes);
        System.out.println(" There are " + intersection.size() + " elements");
        for(int i : intersection){
            System.out.println(i);
        }
        Set<String> words = new HashSet<>();
        String sentence = "one day in the year of the fox";
        String[] arrayWords = sentence.split(" ");
        words.addAll(Arrays.asList(arrayWords));

        for(String i : words){
            System.out.println(i);
        }

        Set<String> nature = new HashSet<>();
        Set<String> divine = new HashSet<>();
        System.out.println("***********************");
        String[] natureWords = {"all","noi","is"};
        nature.addAll(Arrays.asList(natureWords));
        String[] divineWords = {"noi","voi","ei"};
        divine.addAll(Arrays.asList(divineWords));
        nature.addAll(divine);
        for(String s: nature){
            System.out.println(s);
        }
    }
}
