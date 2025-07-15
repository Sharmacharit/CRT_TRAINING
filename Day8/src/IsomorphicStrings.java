// PROG 3: Check If Two Strings Are Isomorphic
import java.util.*;

public class IsomorphicStrings {
    public static boolean isIsomorphic(String s, String t) {
        if (s.length() != t.length()) return false;
        Map<Character, Character> mapST = new HashMap<>();
        Map<Character, Character> mapTS = new HashMap<>();
        for (int i = 0; i < s.length(); i++) {
            char charS = s.charAt(i);
            char charT = t.charAt(i);
            if (!mapST.containsKey(charS)) {
                mapST.put(charS, charT);
            }
            if (!mapTS.containsKey(charT)) {
                mapTS.put(charT, charS);
            }
            if (mapST.get(charS) != charT || mapTS.get(charT) != charS) {
                return false;
            }
        }
        return true;
    }

    public static void main(String[] args) {
        String s1 = "egg";
        String s2 = "add";
        System.out.println("Is Isomorphic: " + isIsomorphic(s1, s2)); // true

        String s3 = "foo";
        String s4 = "bar";
        System.out.println("Is Isomorphic: " + isIsomorphic(s3, s4)); // false

        String s5 = "paper";
        String s6 = "title";
        System.out.println("Is Isomorphic: " + isIsomorphic(s5, s6)); // true
    }
}

/*
Test Cases:
Input: "egg", "add" → Output: true
Input: "foo", "bar" → Output: false
Input: "paper", "title" → Output: true
*/
