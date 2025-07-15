// PROG 2: Word Frequency Counter
import java.util.*;

public class WordFrequencyCounter {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        String str = input.nextLine();
        String[] words = str.split(" ");
        Map<String, Integer> map = new HashMap<>();

        for (String word : words) {
            map.put(word, map.getOrDefault(word, 0) + 1);
        }

        for (String key : map.keySet()) {
            System.out.println(key + " : " + map.get(key));
        }
    }
}

/*
Test Cases:
Input: "apple banana apple grape banana"
Output:
apple : 2
banana : 2
grape : 1
*/
