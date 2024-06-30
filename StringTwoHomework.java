package com.telran.org.lessonthree;

public class StringTwoHomework {

    public static void main(String[] args) {

        String text = "I study Basic Java!";


        int string = text.length();

        char lastChar = text.charAt(text.length()-1);
        System.out.println("Last symbol: " + text.charAt(text.length()-1));

        System.out.println("Lower Case: " + text.toLowerCase());
        System.out.println("Upper Case: " + text.toUpperCase());

        boolean wordJava = text.contains("Java");
        System.out.println("Text contains Java = " + wordJava);

        String sub = text.substring(text.indexOf("Java"), text.indexOf("Java") + "Java".length());
        System.out.println("Cut substring Java: " + sub);
    }
}
