// PROG 4: Folding Array by Summing Ends
import java.util.Scanner;

public class FoldArraySum {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int nums = input.nextInt();
        int arr[] = new int[nums];

        for (int i = 0; i < nums; i++) {
            arr[i] = input.nextInt();
        }

        int left = 0;
        int right = arr.length - 1;

        while (left < right) {
            arr[left] = arr[left] + arr[right];
            left++;
            right--;
        }

        for (int i = 0; i < (nums + 1) / 2; i++) {
            System.out.print(arr[i] + " ");
        }
    }
}

/*
Test Cases:
1) Input: 5, [1,2,3,4,5] → Output: 6 6 3
2) Input: 4, [10,20,30,40] → Output: 50 50
3) Input: 3, [5,6,7] → Output: 12 6
*/
