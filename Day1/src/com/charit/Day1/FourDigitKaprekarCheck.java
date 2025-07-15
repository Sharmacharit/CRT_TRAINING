package com.charit.Day1;
// Four-Digit Kaprekar-Type Check
import java.util.Scanner;

public class FourDigitKaprekarCheck {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Enter a four-digit number:");
        int number = input.nextInt();

        if (number >= 1000 && number <= 9999) {
            int firstPart = number / 100;
            int secondPart = number % 100;
            int sum = firstPart + secondPart;
            int square = sum * sum;

            if (square == number) {
                System.out.println(number + " satisfies the condition: (sum of parts)^2 == original number.");
            } else {
                System.out.println(number + " does not satisfy the condition.");
            }
        } else {
            System.out.println(number + " is not a four-digit number.");
        }
    }
}

/*
Test Cases:
1) Input: 2025
   Output: "2025 satisfies the condition: (sum of parts)^2 == original number."

2) Input: 3025
   Output: "3025 satisfies the condition: (sum of parts)^2 == original number."

3) Input: 1234
   Output: "1234 does not satisfy the condition."
*/

