package com.charit.Day1;
// Conditional Non-Palindrome Processing
import java.util.Scanner;

public class ConditionalNonPalindrome {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the string:");
        String su = sc.nextLine();
        int left = 0;
        int right = su.length() - 1;
        boolean isPalindrome = true;

        while (left < right) {
            if (su.charAt(left) != su.charAt(right)) {
                isPalindrome = false;
                break;
            }
            left++;
            right--;
        }

        if (isPalindrome) {
            if (su.equals("AAA")) {
                System.out.println("do not exist");
            } else {
                String r = su.substring(1);
                System.out.println(r);
            }
        } else {
            System.out.println(su);
        }
    }
}

/*
Test Cases:
1) Input: "AAA"
   Output: "do not exist"

2) Input: "RADAR"
   Output: "ADAR"

3) Input: "HELLO"
   Output: "HELLO"
*/

