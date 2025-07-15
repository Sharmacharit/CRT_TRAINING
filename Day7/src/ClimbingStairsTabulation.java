// PROG 2: Climbing Stairs using Tabulation (Bottom-Up DP)
import java.util.*;

public class ClimbingStairsTabulation {

    public static int climbStairs(int n) {
        int[] dp = new int[n + 1];
        dp[0] = 1;
        dp[1] = 1;
        for (int i = 2; i <= n; i++) {
            dp[i] = dp[i - 1] + dp[i - 2];
        }
        return dp[n];
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
