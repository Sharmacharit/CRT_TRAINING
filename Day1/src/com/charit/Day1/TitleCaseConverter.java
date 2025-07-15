package com.charit.Day1;
// Title Case Conversion in a Sentence
import java.util.*;

public class TitleCaseConverter {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Enter the sentence:");
        String sent = input.nextLine();

        char[] chars = sent.toCharArray();
        boolean isStartOfWord = true;

        for (int i = 0; i < chars.length; i++) {
            if (Character.isWhitespace(chars[i])) {
                isStartOfWord = true;
            } else {
                if (isStartOfWord) {
                    chars[i] = Character.toUpperCase(chars[i]);
                    isStartOfWord = false;
                } else {
                    chars[i] = Character.toLowerCase(chars[i]);
                }
            }
        }

        System.out.println(new String(chars));
    }
}

/*
Test Cases:
1) Input: "hello world from java"
   Output: "Hello World From Java"

2) Input: "tHIS is A TeST"
   Output: "This Is A Test"

3) Input: "   leading spaces here"
   Output: "   Leading Spaces Here"
*/