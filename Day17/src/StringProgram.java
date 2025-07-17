import java.util.*;

public class StringProgram {

    public static String rearrange(String s) {
        // Step 1: Frequency map using HashMap
        Map<Character, Integer> freqMap = new HashMap<>();
        for (char ch : s.toCharArray()) {
            freqMap.put(ch, freqMap.getOrDefault(ch, 0) + 1);
        }

        StringBuilder result = new StringBuilder();
        char prevChar = '\0';  // No previous char initially

        for (int i = 0; i < s.length(); i++) {
            char bestChar = '\0';
            int maxFreq = 0;

            // Step 2: Find the best next character
            for (Map.Entry<Character, Integer> entry : freqMap.entrySet()) {
                char ch = entry.getKey();
                int count = entry.getValue();

                if (ch != prevChar && count > maxFreq) {
                    bestChar = ch;
                    maxFreq = count;
                }
            }

            // Step 3: If no valid character found, return failure
            if (bestChar == '\0') {
                return "Not possible";
            }

            // Step 4: Append and update
            result.append(bestChar);
            freqMap.put(bestChar, freqMap.get(bestChar) - 1);
            prevChar = bestChar;
        }

        return result.toString();
    }

    public static void main(String[] args) {
        // Test with various strings
        String[] testCases = {
                "abbbacbaa",   // Should return valid like "abcababab"
                "aaabbc",      // Possible, e.g. "ababac"
                "aaab",        // Not possible
                "a",           // Just "a"
                "aabbccddeeff" // Should return valid
        };

        for (String test : testCases) {
            System.out.println("Input: " + test);
            System.out.println("Output: " + rearrange(test));
            System.out.println("-----");
        }
    }
}


