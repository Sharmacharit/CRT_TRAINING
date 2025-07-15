//code2: Count Smaller Elements on Right using Stack + Binary Search

import java.util.*;

public class CountSmallerElementsRight {

    public static void main(String[] args) {
        int[] nums = {4, 2, 6, 9, 1};
        int[] result = countSmallerUsingStack(nums);
        System.out.println("Output: " + Arrays.toString(result));

        // Test Cases:
        // nums = {4, 2, 6, 9, 1} => Expected: [2, 1, 1, 1, 0]
        // nums = {5, 4, 3, 2, 1} => Expected: [4, 3, 2, 1, 0]
        // nums = {1, 2, 3, 4, 5} => Expected: [0, 0, 0, 0, 0]
    }

    public static int[] countSmallerUsingStack(int[] nums) {
        int n = nums.length;
        Integer[] result = new Integer[n];
        List<Integer> stackList = new ArrayList<>();

        for (int i = n - 1; i >= 0; i--) {
            int index = findInsertIndex(stackList, nums[i]);
            result[i] = index;
            stackList.add(index, nums[i]);
        }
        return Arrays.stream(result).mapToInt(Integer::intValue).toArray();
    }

    private static int findInsertIndex(List<Integer> list, int target) {
        int low = 0, high = list.size();
        while (low < high) {
            int mid = low + (high - low) / 2;
            if (list.get(mid) < target) {
                low = mid + 1;
            } else {
                high = mid;
            }
        }
        return low;
    }
}
