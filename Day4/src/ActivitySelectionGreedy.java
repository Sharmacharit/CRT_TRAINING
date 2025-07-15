// PROG 4: Activity Selection Problem (Greedy)
import java.util.*;

public class ActivitySelectionGreedy {

    static class Activity {
        int start, finish;
        Activity(int start, int finish) {
            this.start = start;
            this.finish = finish;
        }
    }

    public static void main(String[] args) {
        Integer[] start = {3, 3, 1, 5};
        Integer[] finish = {7, 4, 2, 9};
        int n = start.length;
        Activity[] activities = new Activity[n];
        for (int i = 0; i < n; i++) {
            activities[i] = new Activity(start[i], finish[i]);
        }

        Arrays.sort(activities, (a, b) -> a.finish - b.finish);

        List<Activity> selected = new ArrayList<>();
        selected.add(activities[0]);
        int lastFinish = activities[0].finish;

        for (int i = 1; i < n; i++) {
            if (activities[i].start >= lastFinish) {
                selected.add(activities[i]);
                lastFinish = activities[i].finish;
            }
        }

        int totalActivities = selected.size();
        System.out.println("Total activities that can be performed: " + totalActivities);
    }
}

/*
Test Cases:
Start: [3,3,1,5]
Finish: [7,4,2,9]

Sorted by finish: Activity(1,2), Activity(3,4), Activity(3,7), Activity(5,9)
→ Possible activities: (1,2), (3,4), (5,9)

Output:
Total activities that can be performed: 3
*/
