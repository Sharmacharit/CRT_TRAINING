// PROG 3: Currency Breakdown Using Greedy Method
import java.util.*;

public class CurrencyGreedyBreakdown {
    public static void main(String[] args) {
        int number = 1241;
        Integer[] cash = {1, 2, 5, 10, 20, 100, 200, 500, 2000};

        Arrays.sort(cash, (a, b) -> b - a); // descending

        List<Integer> purse = new ArrayList<>();
        for (int coin : cash) {
            while (number >= coin) {
                number -= coin;
                purse.add(coin);
            }
        }

        System.out.println("Currency breakdown:");
        for (int note : purse) {
            System.out.print(note + " ");
        }
    }
}

/*
Test Cases:
1) Input: 1241
   Output: 500 500 200 20 20 1

2) Input: 430
   Output: 200 200 20 10

3) Input: 75
   Output: 50 20 5
*/
