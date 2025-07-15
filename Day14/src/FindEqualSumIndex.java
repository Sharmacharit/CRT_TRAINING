//code3: Find Index with Equal Left and Right Sum

import java.util.*;

public class FindEqualSumIndex {

    public static void main(String[] args) {
        int[] arr = {3, 1, 5, 2, 5, 4};
        boolean found = false;

        for (int i = 0; i < arr.length; i++) {
            int[] left = Arrays.copyOfRange(arr, 0, i);
            int[] right = Arrays.copyOfRange(arr, i + 1, arr.length);
            int leftSum = Arrays.stream(left).sum();
            int rightSum = Arrays.stream(right).sum();

            if (leftSum == rightSum) {
                System.out.println("Index with equal left and right sum: " + i);
                found = true;
                break;
            }
        }

        if (!found) {
            System.out.println("-1 (No such index found)");
        }

        // Test Cases:
        // arr={3,1,5,2,5,4} => Expected: 2 (index with equal left and right sum)
        // arr={1,2,3} => Expected: -1
    }
}
