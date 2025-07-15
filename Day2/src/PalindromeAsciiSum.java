// PROG 1: Palindrome Check with ASCII Sum
import java.util.Scanner;

public class PalindromeAsciiSum {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Enter a word: ");
        String s = input.nextLine();
        int left = 0;
        int right = s.length() - 1;
        int sum = 0;

        while (left < right) {
            if (s.charAt(left) != s.charAt(right)) {
                System.out.println(-1);
                return;
            }
            left++;
            right--;
        }

        for (int i = 0; i < s.length(); i++) {
            sum += s.charAt(i);
        }
        System.out.println(sum);
    }
}

/*
Test Cases:
1) Input: "aba" → Output: 291
2) Input: "abc" → Output: -1
3) Input: "madam" → Output: 543
*/
