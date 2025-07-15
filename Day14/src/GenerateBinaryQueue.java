//code2: Generate Binary Numbers from 1 to N Using Queue

import java.util.*;

public class GenerateBinaryQueue {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Enter a number: ");
        int num = input.nextInt();

        Queue<String> queue = new LinkedList<>();
        queue.add("1");

        for (int i = 0; i < num; i++) {
            String n = queue.poll();
            String temp = n;
            while (temp.length() < 4) { // for padding, adjust as needed
                temp = '0' + temp;
            }
            System.out.println(temp);
            queue.add(n + '0');
            queue.add(n + '1');
        }

        // Test Cases:
        // num=3 => Outputs: 0001, 0010, 0011
        // num=5 => Outputs: 0001, 0010, 0011, 0100, 0101
    }
}
