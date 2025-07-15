package com.charit.Day1;
// Two Pointer Palindrome Check
public class TwoPointerPalindrome {
    public static void main(String[] args) {
        String word = "MALAYALAM";
        int left = 0;
        int right = word.length() - 1;
        boolean isPalindrome = true;

        while (left < right) {
            if (word.charAt(left) != word.charAt(right)) {
                isPalindrome = false;
                break;
            }
            left++;
            right--;
        }

        if (isPalindrome) {
            System.out.println(word + " is a palindrome.");
        } else {
            System.out.println(word + " is not a palindrome.");
        }
    }
}

/*
Test Cases:
1) Input: "MALAYALAM"
   Output: "MALAYALAM is a palindrome."

2) Input: "HELLO"
   Output: "HELLO is not a palindrome."

3) Input: "RADAR"
   Output: "RADAR is a palindrome."
*/

