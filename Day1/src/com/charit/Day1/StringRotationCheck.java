package com.charit.Day1;

// Rotation Check Between Strings
import java.util.*;

public class StringRotationCheck {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Enter the first string:");
        String str1 = input.nextLine();
        System.out.println("Enter the second string to check for rotation:");
        String str2 = input.nextLine();

        if (str1.length() != str2.length()) {
            System.out.println("Rotation not found (lengths differ).");
        } else {
            String rotatedStr = str1 + str1;
            if (rotatedStr.contains(str2)) {
                System.out.println("Rotation found.");
            } else {
                System.out.println("Rotation not found.");
            }
        }
    }
}

/*
Test Cases:
1) Input: str1="ABCD", str2="CDAB"
   Output: "Rotation found."

2) Input: str1="ABCD", str2="ACBD"
   Output: "Rotation not found."

3) Input: str1="hello", str2="llohe"
   Output: "Rotation found."
*/

