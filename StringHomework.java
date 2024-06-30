package com.telran.org.lessonthree;

import java.util.Scanner;

public class StringHomework {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Enter first word ");
        String fistWord = scanner.nextLine();
        System.out.println("Your first word is " + fistWord);

        System.out.println("Enter second word");
        String secondWord = scanner.nextLine();
        System.out.println("Your second word " + secondWord);

        char wordFirst = fistWord.charAt(0);
        char wordFirstTwo = fistWord.charAt(1);
        char wordSecond = secondWord.charAt(0);
        char wordSecondTwo = secondWord.charAt(1);

        System.out.println("Result is " + wordFirst + wordFirstTwo + wordSecond + wordSecondTwo);
    }
}
