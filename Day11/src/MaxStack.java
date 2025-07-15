import java.util.Stack;

public class MaxStack {

    Stack<Integer> mainStack = new Stack<>();
    Stack<Integer> maxStack = new Stack<>();

    public void push(int x) {
        mainStack.push(x);
        if (maxStack.isEmpty() || x >= maxStack.peek()) {
            maxStack.push(x);
        }
    }

    public void pop() {
        if (mainStack.isEmpty()) {
            System.out.println("Stack is empty!");
            return;
        }
        int removed = mainStack.pop();
        if (removed == maxStack.peek()) {
            maxStack.pop();
        }
    }

    public int getMax() {
        if (maxStack.isEmpty()) {
            System.out.println("Stack is empty!");
            return Integer.MIN_VALUE;
        }
        return maxStack.peek();
    }

    public static void main(String[] args) {
        MaxStack ms = new MaxStack();
        ms.push(10);
        ms.push(20);
        ms.push(5);
        ms.push(25);

        System.out.println("Max: " + ms.getMax()); // 25
        ms.pop();
        System.out.println("Max: " + ms.getMax()); // 20
        ms.pop();
        System.out.println("Max: " + ms.getMax()); // 20
        ms.pop();
        System.out.println("Max: " + ms.getMax()); // 10

        // Test Cases:
        // Sequence: push(10), push(15), push(5), push(20)
        // Expected max: 20
        // After pop(): 20 removed, max: 15
        // After pop(): 5 removed, max: 15
    }
}
