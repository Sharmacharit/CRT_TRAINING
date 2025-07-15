// PROG 6: Find All Anagram Substrings in a String
import java.util.*;

public class AnagramSubstringFinder {
    public static void main(String[] args) {
        String str = "bacdfcab";
        String pattern = "abc";
        Map<Character, Integer> map = new HashMap<>();

        for (char c : pattern.toCharArray()) {
            map.put(c, map.getOrDefault(c, 0) + 1);
        }

        int patternLength = pattern.length();
        for (int i = 0; i <= str.length() - patternLength; i++) {
            String substr = str.substring(i, i + patternLength);
            Map<Character, Integer> tempMap = new HashMap<>();

            for (char c : substr.toCharArray()) {
                tempMap.put(c, tempMap.getOrDefault(c, 0) + 1);
            }

            if (map.equals(tempMap)) {
                System.out.println("Anagram found at index: " + i);
            }
        }
    }
}

/*
Test Cases:
Input: str="bacdfcab", pattern="abc"
Output:
Anagram found at index: 0
Anagram found at index: 5
*/
