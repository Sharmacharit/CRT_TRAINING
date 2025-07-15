//code1: Car Fleets Problem

import java.util.*;

public class CarFleetsProblem {

    public static void main(String[] args) {
        int[] position = {2, 6, 4};
        int[] speed = {3, 2, 1};
        int target = 20;

        int fleets = collides(target, position, speed);
        System.out.println("Number of car fleets: " + fleets);

        // Test Cases:
        // position = {2, 6, 4}, speed = {3, 2, 1}, target = 20 => Expected: 1
        // position = {10, 8, 0, 5, 3}, speed = {2, 4, 1, 1, 3}, target = 12 => Expected: 3
        // position = {}, speed = {}, target = 10 => Expected: 0
    }

    public static int collides(int target, int[] position, int[] speed) {
        int n = position.length;
        if (n == 0) return 0;

        double[][] cars = new double[n][2];
        for (int i = 0; i < n; i++) {
            cars[i][0] = position[i];
            cars[i][1] = (double)(target - position[i]) / speed[i];
        }

        Arrays.sort(cars, (a, b) -> Double.compare(b[0], a[0]));

        int fleets = 0;
        double currentTime = 0;

        for (int i = 0; i < n; i++) {
            double time = cars[i][1];
            if (time > currentTime) {
                fleets++;
                currentTime = time;
            }
        }

        return fleets;
    }
}
