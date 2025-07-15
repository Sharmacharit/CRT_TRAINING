// PROG 3: Activity Selection Problem (Greedy)
import java.util.*;

public class ActivitySelection {

    static class Activity {
        int start, end;
        Activity(int start, int end) {
            this.start = start;
            this.end = end;
        }
    }

    public static void main(String[] args) {
        int[] start = {1, 3, 0, 5, 8, 5};
        int[] end = {2, 4, 6, 7, 9, 9};
        int n = start.length;

        Activity[] activities = new Activity[n];
        for (int i = 0; i < n; i++) {
            activities[i] = new Activity(start[i], end[i]);
        }

        Arrays.sort(activities, (a, b) -> a.end - b.end);

        int count = 1;
        int lastEnd = activities[0].end;

        for (int i = 1; i < n; i++) {
            if (activities[i].start >= lastEnd) {
                count++;
                lastEnd = activities[i].end;
            }
        }

        System.out.println("Maximum number of activities that can be performed: " + count);
    }
}

/*
Test Cases:
1) start = [1,3,0,5,8,5], end = [2,4,6,7,9,9]
   Output: 4

2) start = [10,12,20], end = [20,25,30]
   Output: 3

3) start = [1,2,3], end = [2,3,4]
   Output: 2
*/
