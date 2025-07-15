// Program 1 (Variation): Division with manual throw
public class Division1 {
    public static void main(String[] args) {
        int x = 9;
        int y = 5;
        try {
            if (y == 0) {
                throw new ArithmeticException("Y = zero");
            }
            int result = x / y;
            System.out.println("Result: " + result);
        } catch (ArithmeticException e) {
            System.out.println("An error occurred: " + e.getMessage());
        } finally {
            System.out.println("Finally block executed.");
        }
    }
}
