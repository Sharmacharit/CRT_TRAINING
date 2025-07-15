// PROG 4: Check Equal Number of 'A's and 'B's in a String
import java.util.*;

public class EqualABChecker {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        String str = input.nextLine().toUpperCase();
        int countA = 0, countB = 0;

        for (int i = 0; i < str.length(); i++) {
            char ch = str.charAt(i);
            if (ch == 'A') {
                countA++;
            } else if (ch == 'B') {
                countB++;
            }
        }

        if (countA == countB) {
            System.out.println("yes");
        } else {
            System.out.println("no");
        }
    }
}

/*
Test Cases:
1) Input: "aabb" → Output: "yes"
2) Input: "aaabbb" → Output: "yes"
3) Input: "aab" → Output: "no"
*/
