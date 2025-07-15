// Program 1: Division with try-catch-finally
import java.util.*;

public class Division {
    public static void main(String[] args) {
        int x = 100;
        int y = 5;
        try {
            int result = x / y;
            System.out.println("Result: " + result);
        } catch (ArithmeticException e) {
            System.out.println("An error occurred: " + e.getMessage());
        } finally {
            System.out.println("Finally block executed.");
        }
    }
}
