// PROG 2: Find Digits with Exact Frequency Using Min Heap
import java.util.*;

public class MinHeapExactFrequency {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt(); // total digits (unused)
        String s = sc.next(); // digit string
        int k = sc.nextInt(); // frequency to filter

        Map<Integer, Integer> frequencyMap = new HashMap<>();
        for (char c : s.toCharArray()) {
            int digit = c - '0';
            frequencyMap.put(digit, frequencyMap.getOrDefault(digit, 0) + 1);
        }

        PriorityQueue<Map.Entry<Integer, Integer>> minHeap =
                new PriorityQueue<>(Comparator.comparingInt(Map.Entry::getValue));

        for (Map.Entry<Integer, Integer> entry : frequencyMap.entrySet()) {
            minHeap.offer(entry);
        }

        System.out.print("Digits with exact frequency " + k + ": ");
        while (!minHeap.isEmpty()) {
            Map.Entry<Integer, Integer> entry = minHeap.poll();
            if (entry.getValue() == k) {
                System.out.print(entry.getKey() + " ");
            }
        }
    }
}

/*
Test Cases:
Input: 7, "4445566", 2 → Output: 5 4
Input: 6, "111223", 2 → Output: 2
Input: 3, "333", 1 → Output:
*/
