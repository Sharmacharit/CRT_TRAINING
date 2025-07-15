// PROG 5: Check If Pythagorean Triplet
import java.util.*;

public class PythagoreanTripletChecker {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int a = input.nextInt();
        int b = input.nextInt();
        int c = input.nextInt();

        if ((a * a + b * b) == c * c || (c * c + b * b) == a * a || (a * a + c * c) == b * b) {
            System.out.println("yes triplet");
        } else {
            System.out.println("not a triplet");
        }
    }
}

/*
Test Cases:
1) Input: 3 4 5 → Output: "yes triplet"
2) Input: 5 12 13 → Output: "yes triplet"
3) Input: 2 3 4 → Output: "not a triplet"
*/
