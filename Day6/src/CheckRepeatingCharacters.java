// PROG 4: Check for Any Repeating Characters
import java.util.*;

public class CheckRepeatingCharacters {
    public static void main(String[] args) {
        String str = "abcde";
        Map<Character, Integer> chcount = new HashMap<>();

        for (char c : str.toCharArray()) {
            chcount.put(c, chcount.getOrDefault(c, 0) + 1);
        }

        for (char c : str.toCharArray()) {
            if (chcount.get(c) == 2) {
                System.out.println("Repeating character found: " + c);
                return;
            }
        }
        System.out.println("All characters are unique.");
    }
}

/*
Test Cases:
Input: "abcde" → Output: "All characters are unique."
Input: "aabc" → Output: "Repeating character found: a"
*/
