// PROG 3: First Non-Repeating Character
import java.util.*;

public class FirstNonRepeatingCharacter {
    public static void main(String[] args) {
        String str = "abaccdeff";
        Map<Character, Integer> chcount = new HashMap<>();

        for (char c : str.toCharArray()) {
            chcount.put(c, chcount.getOrDefault(c, 0) + 1);
        }

        for (char c : str.toCharArray()) {
            if (chcount.get(c) == 1) {
                System.out.println("First non-repeating character: " + c);
                return;
            }
        }
        System.out.println("No non-repeating character found.");
    }
}

/*
Test Cases:
Input: "abaccdeff" → Output: "b"
Input: "aabbcc" → Output: "No non-repeating character found."
Input: "aabc" → Output: "b"
*/
