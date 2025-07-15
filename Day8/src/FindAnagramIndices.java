// PROG 1: Find All Anagram Indices in String
import java.util.*;

public class FindAnagramIndices {

    public static boolean isAnagram(String s1, String s2) {
        int[] count = new int[26];
        for (char c : s1.toCharArray()) count[c - 'a']++;
        for (char c : s2.toCharArray()) count[c - 'a']--;
        for (int i : count) if (i != 0) return false;
        return true;
    }

    public static List<Integer> findAnagrams(String text, String pattern) {
        List<Integer> result = new ArrayList<>();
        int n = text.length(), m = pattern.length();
        for (int i = 0; i <= n - m; i++) {
            String sub = text.substring(i, i + m);
            if (isAnagram(sub, pattern)) {
                result.add(i);
            }
        }
        return result;
    }

    public static void main(String[] args) {
        String text = "cbaebabacd";
        String pattern = "abc";
        System.out.println(findAnagrams(text, pattern)); // Output: [0, 6]
    }
}

/*
Test Cases:
Input: "cbaebabacd", "abc" → Output: [0,6]
Input: "abab", "ab" → Output: [0,1,2]
Input: "abcd", "ef" → Output: []
*/
