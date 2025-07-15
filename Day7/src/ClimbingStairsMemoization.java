// PROG 1: Climbing Stairs using Memoization (Top-Down DP)
import java.util.*;

public class ClimbingStairsMemoization {

    private static Map<Integer, Integer> memo = new HashMap<>();

    public static int climbStairs(int n) {
        if (n <= 1) {
            return 1;
        }
        if (memo.containsKey(n)) {
            return memo.get(n);
        }
        int ways = climbStairs(n - 1) + climbStairs(n - 2);
        memo.put(n, ways);
        return ways;
    }

    public static void main(String[] args) {
        int n = 5;
        int ways = climbStairs(n);
        System.out.println("Number of ways to climb " + n + " stairs: " + ways);
    }
}

/*
Test Cases:
n=5 → Output: 8
n=3 → Output: 3
n=0 → Output: 1
*/
