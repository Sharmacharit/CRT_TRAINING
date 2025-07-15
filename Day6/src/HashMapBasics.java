// PROG 1: HashMap Operations and Frequency Update
import java.util.*;

public class HashMapBasics {

    public static void main(String[] args) {
        Scanner inputs = new Scanner(System.in);

        Map<String, Integer> map = new HashMap<>();
        map.put("apple", 4);
        map.put("banana", 5);

        // Using entrySet
        for (Map.Entry<String, Integer> entry : map.entrySet()) {
            System.out.println(entry.getKey() + " => " + entry.getValue());
        }

        // Using keySet
        for (String key : map.keySet()) {
            System.out.println(key + " => " + map.get(key));
        }

        // Example of incrementing frequency safely
        String fruit = "apple";
        map.put(fruit, map.getOrDefault(fruit, 0) + 1);
        System.out.println("Updated frequency of " + fruit + ": " + map.get(fruit));
    }
}

/*
Test Cases:
- Initially prints apple and banana with values.
- Shows usage of getOrDefault to increment frequency safely.
*/
