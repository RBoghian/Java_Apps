package com.Adventure;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Main {

    public static void main(String[] args) {

        String string = "I am a string. Yes, I am.";
        System.out.println(string);
        String yourString = string.replaceAll("I","You");
        System.out.println(yourString);

        String alphaNumeric = "abcDeeeF12Ghhiiiijkl99z";
        System.out.println(alphaNumeric.replaceAll(".","Y"));
        System.out.println(alphaNumeric.replaceAll("^abcDeee","YYY"));
        String secondString = "abcDeeeF12abcDeeeGhhiiiijkl99z";
        System.out.println(secondString.replaceAll("^abcDeee","YYY"));

        System.out.println(alphaNumeric.matches("^hello"));
        System.out.println(alphaNumeric.matches("^abcDeee"));

        System.out.println(alphaNumeric.replaceAll("jkl99z$","THE END"));
        System.out.println(alphaNumeric.replaceAll("[aei]","X"));
        System.out.println(alphaNumeric.replaceAll("[aei][Fj]","X"));

        System.out.println("harry".replaceAll("[Hh]arry","Harry"));

        String newAlphanumeric="abcDeeeF12Ghhiiiijkl99z";
        System.out.println(newAlphanumeric.replaceAll("[^ej]","X"));
        System.out.println(newAlphanumeric.replaceAll("[a-f1-8]","X"));
        System.out.println(newAlphanumeric.replaceAll("(?i)[a-f3-8]","X"));
        System.out.println(newAlphanumeric.replaceAll("[0-9]","X"));
        System.out.println(newAlphanumeric.replaceAll("\\d","X"));

        String hasWhitespace = "I have blanks and\ta tab, and also a new line\n";
        System.out.println(hasWhitespace);
        System.out.println(hasWhitespace.replaceAll("\\s",""));
        System.out.println(hasWhitespace.replaceAll("\\b","X"));
String thirdAlphaNumericString="abcDeeeF12Ghhiiiijkl99z";
        System.out.println(thirdAlphaNumericString.replaceAll("^abcDe{3}","YYY"));
        System.out.println(thirdAlphaNumericString.replaceAll("^abcDe+","Y"));
        System.out.println(thirdAlphaNumericString.replaceAll("^abcDe{2,5}","YYYY"));
        System.out.println(thirdAlphaNumericString.replaceAll("h+i*j","Y"));

        StringBuilder htmlText = new StringBuilder("<h1>My Heading</h1>");
        htmlText.append("<h2> Sub-Heading</h2>");
        htmlText.append("<p> This is a paragraph about something.</p>");
        htmlText.append("<p> This is another paragraph about something else.</p>");
        htmlText.append("<h2>Summary</h2>");
        htmlText.append("<p>Here is the summary.</p>");

        String h2Pattern = "<h2>";
        Pattern pattern = Pattern.compile(h2Pattern);
        Matcher matcher = pattern.matcher(htmlText);
        System.out.println(matcher.matches());
matcher.reset();
        int count=0;
        while (matcher.find()){
            count++;
            System.out.println("occurence " + count + " : " + matcher.start() + " to " + matcher.end());
        }

        String h2GroupPattern = "(<h2>.*? </h2>)";
        Pattern groupPattern = Pattern.compile(h2GroupPattern);
        Matcher groupMatcher = groupPattern.matcher(htmlText);
        System.out.println(groupMatcher.matches());
        groupMatcher.reset();

        while(groupMatcher.find()){
            System.out.println("Occurence " + groupMatcher.group(1));
        }

        String h2TextGroups = "(<h2>)(.+?)(</h2>)";
        Pattern h2TextPattern = Pattern.compile(h2TextGroups);
        Matcher h2TextMatcher = h2TextPattern.matcher(htmlText);

        while (h2TextMatcher.find()){
            System.out.println("Occurrence " + h2TextMatcher.group(2));
        }

        String tvTest="tstvtkt";
        String tNotVRegExp ="t(?!v)";
        Pattern tNotVPattern = Pattern.compile(tNotVRegExp);
        Matcher tNotVMatcher = tNotVPattern.matcher(tvTest);
        count = 0;
        while(tNotVMatcher.find()){
            count++;
            System.out.println("occurrence " + count + " : " + tNotVMatcher.start() + " to " + tNotVMatcher.end());
        }
    }

}
