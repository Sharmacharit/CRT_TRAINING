// PROG 5: Check if Two Strings are Anagrams
import java.util.*;

public class AnagramChecker {
    public static void main(String[] args) {
        String word1 = "listen";
        String word2 = "silent";

        char[] charArray1 = word1.toCharArray();
        char[] charArray2 = word2.toCharArray();

        Map<Character, Integer> charCount1 = new HashMap<>();
        Map<Character, Integer> charCount2 = new HashMap<>();

        for (char c : charArray1) {
            charCount1.put(c, charCount1.getOrDefault(c, 0) + 1);
        }

        for (char c : charArray2) {
            charCount2.put(c, charCount2.getOrDefault(c, 0) + 1);
        }

        if (charCount1.equals(charCount2)) {
            System.out.println(word1 + " and " + word2 + " are anagrams.");
        } else {
            System.out.println(word1 + " and " + word2 + " are not anagrams.");
        }
    }
}

/*
Test Cases:
Input: "listen", "silent" → Output: "are anagrams"
Input: "hello", "world" → Output: "are not anagrams"
Input: "triangle", "integral" → Output: "are anagrams"
*/
