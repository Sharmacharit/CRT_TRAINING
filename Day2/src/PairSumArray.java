// PROG 5: Pair Sum Array Construction
import java.util.*;

public class PairSumArray {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Enter the size of the array:");
        int n = input.nextInt();
        int[] arr = new int[n];
        System.out.println("Enter the elements of the array:");
        for (int i = 0; i < n; i++) {
            arr[i] = input.nextInt();
        }

        int[] result = new int[(n + 1) / 2];
        for (int i = 0; i < result.length; i++) {
            if (i == n - 1 - i) {
                result[i] = arr[i];
            } else {
                result[i] = arr[i] + arr[n - 1 - i];
            }
        }

        System.out.println(Arrays.toString(result));
    }
}

/*
Test Cases:
1) n=5, [1,2,3,4,5] → Output: [6,6,3]
2) n=4, [10,20,30,40] → Output: [50,50]
3) n=3, [5,6,7] → Output: [12,6]
*/
