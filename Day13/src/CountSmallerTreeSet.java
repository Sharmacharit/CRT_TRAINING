//code3: Count Smaller Elements on Right using TreeSet

import java.util.*;

public class CountSmallerTreeSet {

    public static void main(String[] args) {
        int[] arr = {5, 2, 6, 1};
        List<Integer> result = new ArrayList<>();
        TreeSet<Integer> set = new TreeSet<>();

        for (int i = arr.length - 1; i >= 0; i--) {
            set.add(arr[i]);
            result.add(0, set.headSet(arr[i]).size());
        }

        System.out.println("Smaller elements on the right: " + result);

        // Test Cases:
        // arr = {5, 2, 6, 1} => Expected: [2, 1, 1, 0]
        // arr = {3, 2, 1} => Expected: [2, 1, 0]
        // arr = {1, 2, 3} => Expected: [0, 0, 0]
    }
}
