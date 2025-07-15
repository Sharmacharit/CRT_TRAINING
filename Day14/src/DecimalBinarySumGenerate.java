//code1: Decimal to Binary, Sum of Digits, Generate Binary from 1 to N

import java.util.*;

public class DecimalBinarySumGenerate {

    public static String decimalToBinary(int n) {
        int remainder, quotient = n;
        String binaryNum = "";
        while (quotient > 0) {
            remainder = quotient % 2;
            binaryNum = Integer.toString(remainder) + binaryNum;
            quotient = quotient / 2;
        }
        return binaryNum;
    }

    public static int adds(String binary) {
        int sum = 0;
        for (int i = 0; i < binary.length(); i++) {
            sum += Integer.parseInt(binary.charAt(i) + "");
        }
        return sum;
    }

    public static void generate(int n) {
        for (int i = 1; i <= n; i++) {
            System.out.println("Binary of " + i + " is " + decimalToBinary(i));
        }
    }

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Enter a decimal number: ");
        int decimal = input.nextInt();
        System.out.print("Enter n for generating binary from 1 to n: ");
        int n = input.nextInt();

        String binary = decimalToBinary(decimal);
        System.out.println("Decimal: " + decimal);
        System.out.println("Binary: " + binary);
        System.out.println("Sum of binary digits: " + adds(binary));
        generate(n);

        // Test Cases:
        // decimal=5, n=3 => Binary: 101, Sum: 2, Generates: 1->1, 2->10, 3->11
        // decimal=7, n=5 => Binary: 111, Sum: 3, Generates 1-5 binary
    }
}
