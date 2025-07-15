// PROG 3: Check If Middle Vowel with Same Neighbors
import java.util.*;

public class MiddleVowelChecker {

    public static boolean isVowel(char ch) {
        ch = Character.toLowerCase(ch);
        return "aeiou".indexOf(ch) != -1;
    }

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        String str = input.next();

        for (int i = 1; i < str.length() - 1; i++) {
            char prev = str.charAt(i - 1);
            char curr = str.charAt(i);
            char next = str.charAt(i + 1);

            if (prev == next && isVowel(curr) && !isVowel(prev)) {
                System.out.println("yes");
            } else {
                System.out.println("no");
            }
            break;
        }
    }
}

/*
Test Cases:
1) Input: "bcb" → Output: "no"
2) Input: "bab" → Output: "yes" (middle 'a' is vowel, neighbors 'b' equal)
3) Input: "cac" → Output: "yes" (middle 'a' is vowel, neighbors 'c' equal)
*/
