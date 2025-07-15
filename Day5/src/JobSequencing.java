// PROG 1: Job Sequencing for Maximum Profit
import java.util.*;

class Job {
    int id, deadline, profit;
    Job(int id, int deadline, int profit) {
        this.id = id;
        this.deadline = deadline;
        this.profit = profit;
    }
}

public class JobSequencing {
    public static void main(String[] args) {
        Job[] jobs = {
                new Job(1, 4, 20),
                new Job(2, 1, 10),
                new Job(3, 1, 40),
                new Job(4, 1, 30)
        };

        Arrays.sort(jobs, (a, b) -> b.profit - a.profit); // sort by profit descending

        int n = jobs.length;
        boolean[] slot = new boolean[n];
        int[] result = new int[n];

        for (int i = 0; i < n; i++) {
            for (int j = Math.min(n, jobs[i].deadline) - 1; j >= 0; j--) {
                if (!slot[j]) {
                    slot[j] = true;
                    result[j] = jobs[i].id;
                    break;
                }
            }
        }

        System.out.print("Jobs selected for maximum profit: ");
        for (int i = 0; i < n; i++) {
            if (slot[i]) {
                System.out.print(result[i] + " ");
            }
        }
    }
}

/*
Test Cases:
1) Jobs: {id=1,deadline=4,profit=20}, {2,1,10}, {3,1,40}, {4,1,30}
   Output: Jobs selected for maximum profit: 3 1

2) Jobs: {1,2,100}, {2,1,19}, {3,2,27}, {4,1,25}, {5,3,15}
   Output: 1 3 5

3) Jobs: {1,1,35}, {2,1,30}, {3,1,25}, {4,1,20}
   Output: 1
*/
