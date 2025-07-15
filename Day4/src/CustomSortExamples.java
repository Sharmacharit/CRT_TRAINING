// PROG 1: Custom Sorting on Numbers, Strings, and Characters
import java.util.*;

public class CustomSortExamples {
    public static void main(String[] args) {
        Integer[] numbers = {5, 4, 6, 3, 2};
        Arrays.sort(numbers, (a, b) -> Integer.compare(a, b)); // ascending
        // System.out.println("Sorted numbers: " + Arrays.toString(numbers));

        String fruits[] = {"mango", "apple", "guava", "banana", "kiwi"};
        Arrays.sort(fruits, (a, b) -> b.length() - a.length()); // descending by length
        System.out.println("Sorted fruits by length: " + Arrays.toString(fruits));

        Character arr[] = {'a', 'c', 'k', 'l', 'g', 'e'};
        Arrays.sort(arr, (a, b) -> b - a); // descending
        System.out.println("Sorted characters descending: " + Arrays.toString(arr));
    }
}

/*
Test Cases:
- Numbers: [5,4,6,3,2] → Sorted: [2,3,4,5,6]
- Fruits: ["mango", "apple", "guava", "banana", "kiwi"] → ["banana", "mango", "apple", "guava", "kiwi"]
- Characters: ['a','c','k','l','g','e'] → ['l','k','g','e','c','a']
*/
