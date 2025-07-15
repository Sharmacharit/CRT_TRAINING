// PROG 7: Print Fibonacci Series Using Recursion
public class RecursiveFibonacci {
    public static void main(String[] args) {
        int n = 10; // Adjust for practical output limit
        System.out.println("Fibonacci sequence up to " + n + " terms:");
        for (int i = 0; i < n; i++) {
            System.out.print(fibonacci(i) + " ");
        }
    }

    public static int fibonacci(int n) {
        if (n <= 1) {
            return n;
        }
        return fibonacci(n - 1) + fibonacci(n - 2);
    }
}

/*
Test Cases:
Input: n=10
Output: 0 1 1 2 3 5 8 13 21 34

Input: n=5
Output: 0 1 1 2 3
*/
