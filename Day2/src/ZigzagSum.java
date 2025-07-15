// PROG 6: Zigzag Sum (Even +, Odd -)
public class ZigzagSum {
    public static void main(String[] args) {
        int arr[] = {1, 2, 3, 4, 5};
        int sum = 0;
        for (int i = 0; i < arr.length; i++) {
            if (i % 2 == 0) {
                sum = sum + arr[i];
            } else {
                sum = sum - arr[i];
            }
        }
        System.out.println(sum);
    }
}

/*
Test Cases:
1) [1,2,3,4,5] → Output: 3
2) [5,4,3,2,1] → Output: 3
3) [10,1,10,1] → Output: 18
*/
