// PROG 2: Best Time to Buy and Sell Stock (Single Transaction)
import java.util.*;

public class BuySellSingle {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in); // fixed Scanner

        int prices[] = {7, 1, 5, 3, 6, 4};

        int minprice = Integer.MAX_VALUE;
        int maxprofit = 0;

        for (int price : prices) {
            if (price < minprice) {
                minprice = price;
            } else {
                int profit = price - minprice;
                maxprofit = Math.max(maxprofit, profit);
            }
        }
        System.out.println(maxprofit);
    }
}

/*
Test Cases:
1) Prices: [7,1,5,3,6,4] → Output: 5
2) Prices: [7,6,4,3,1] → Output: 0
3) Prices: [1,2,3,4,5] → Output: 4
*/
