import java.util.*;

public class FixedSizeStack {

    static class Stack {
        private LinkedList<Integer> bag = new LinkedList<>();
        private static final int MAX_SIZE = 3;

        void push(int value) {
            if (bag.size() >= MAX_SIZE) {
                throw new IllegalStateException("You are too greedy!");
            }
            bag.addFirst(value);
        }

        int pop() { return bag.removeFirst(); }
        int peek() { return bag.getFirst(); }
        boolean isEmpty() { return bag.isEmpty(); }
        int size() { return bag.size(); }
    }

    public static void main(String[] args) {
        Stack stack = new Stack();
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter number of items to push (max 3): ");
        int n = sc.nextInt();

        for (int i = 0; i < n; i++) {
            System.out.print("Enter value to push: ");
            int val = sc.nextInt();
            try {
                stack.push(val);
                System.out.println("Pushed: " + val);
            } catch (IllegalStateException e) {
                System.out.println(e.getMessage());
                break;
            }
        }

        System.out.println("Current stack size: " + stack.size());
        System.out.println("Top element: " + (stack.isEmpty() ? "Stack is empty" : stack.peek()));

        // Test Cases:
        // Input: n=2, values: 5, 10 => should push both, size 2, top 10
        // Input: n=4, values: 1, 2, 3, 4 => should throw exception at 4th push
        // Input: n=0 => stack remains empty
    }
}
