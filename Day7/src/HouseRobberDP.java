// PROG 3: House Robber - Maximize Loot using DP
import java.util.*;

public class HouseRobberDP {
    public static int maximizeLoot(int[] bankLineup) {
        int n = bankLineup.length;
        if (n == 0) return 0;
        if (n == 1) return bankLineup[0];

        int[] dp = new int[n];
        dp[0] = bankLineup[0];
        dp[1] = Math.max(bankLineup[0], bankLineup[1]);

        for (int i = 2; i < n; i++) {
            dp[i] = Math.max(bankLineup[i] + dp[i - 2], dp[i - 1]);
        }
        return dp[n - 1];
    }

    public static void main(String[] args) {
        int[] bankLineup = {2, 7, 9, 3, 1};
        int maxLoot = maximizeLoot(bankLineup);
        System.out.println("Maximize haul: " + maxLoot);
    }
}

/*
Test Cases:
Input: [2,7,9,3,1] → Output: 12
Input: [1,2,3,1] → Output: 4
Input: [2,1,1,2] → Output: 4
*/
