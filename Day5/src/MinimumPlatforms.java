// PROG 2: Minimum Platforms Required for Trains
import java.util.*;

public class MinimumPlatforms {
    public static void main(String[] args) {
        int[] arrival = {900, 940, 950, 1100, 1500, 1800};
        int[] departure = {910, 1200, 1120, 1130, 1900, 2000};

        Arrays.sort(arrival);
        Arrays.sort(departure);

        int platforms_needed = 1, result = 1;
        int i = 1, j = 0;

        while (i < arrival.length && j < departure.length) {
            if (arrival[i] <= departure[j]) {
                platforms_needed++;
                i++;
                if (platforms_needed > result)
                    result = platforms_needed;
            } else {
                platforms_needed--;
                j++;
            }
        }

        System.out.println("Minimum number of platforms required: " + result);
    }
}

/*
Test Cases:
1) arrival = [900, 940, 950, 1100, 1500, 1800]
   departure = [910, 1200, 1120, 1130, 1900, 2000]
   Output: 3

2) arrival = [900, 940]
   departure = [910, 950]
   Output: 1

3) arrival = [900, 905, 915]
   departure = [920, 915, 930]
   Output: 3
*/
