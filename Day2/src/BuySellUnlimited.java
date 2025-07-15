// PROG 3: Best Time to Buy and Sell Stock (Unlimited Transactions)
public class BuySellUnlimited {
    public static void main(String[] args) {
        int prices[] = {7, 1, 5, 3, 6, 4};
        int profit = 0;

        for (int i = 1; i < prices.length; i++) {
            profit += Math.max(0, prices[i] - prices[i - 1]);
        }

        System.out.println(profit);
    }
}

/*
Test Cases:
1) Prices: [7,1,5,3,6,4] → Output: 7
2) Prices: [1,2,3,4,5] → Output: 4
3) Prices: [7,6,4,3,1] → Output: 0
*/
