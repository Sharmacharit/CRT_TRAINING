// PROG 1: Find Difference Between Max and Min Digit in a Number
import java.util.*;

public class MaxMinDigitDifference {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int num = input.nextInt();
        String str = String.valueOf(num);
        int[] arr = new int[str.length()];
        for (int i = 0; i < str.length(); i++) {
            arr[i] = Character.getNumericValue(str.charAt(i));
        }

        int max = Integer.MIN_VALUE;
        int min = Integer.MAX_VALUE;

        for (int i = 0; i < arr.length; i++) {
            if (arr[i] > max) {
                max = arr[i];
            }
            if (arr[i] < min) {
                min = arr[i];
            }
        }
        System.out.println(max - min);
    }
}

/*
Test Cases:
1) Input: 53921 → Output: 9-1 = 8
2) Input: 111 → Output: 1-1 = 0
3) Input: 907 → Output: 9-0 = 9
*/
