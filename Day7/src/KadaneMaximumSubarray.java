// PROG 4: Kadane's Algorithm - Maximum Contiguous Subarray Sum
import java.util.*;

public class KadaneMaximumSubarray {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] arr = new int[n];
        for (int i = 0; i < n; i++) {
            arr[i] = sc.nextInt();
        }

        int maxSum = Integer.MIN_VALUE;
        int currentSum = 0;

        for (int i = 0; i < n; i++) {
            currentSum = currentSum + arr[i];
            if (currentSum > maxSum) {
                maxSum = currentSum;
            }
            if (currentSum < 0) {
                currentSum = 0;
            }
        }
        System.out.println("Maximum contiguous sum is " + maxSum);
    }
}

/*
Test Cases:
Input: 8 -1 3 4 -5 6 → Output: 15
Input: -2 -3 4 -1 -2 1 5 -3 → Output: 7
Input: -1 -2 -3 -4 → Output: -1
*/
