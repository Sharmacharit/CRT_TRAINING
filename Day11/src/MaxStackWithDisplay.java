import java.util.*;

public class MaxStackWithDisplay {

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
            System.out.println("The main stack is empty!");
            return;
        }
        int removed = mainStack.pop();
        if (removed == maxStack.peek()) {
            maxStack.pop();
        }
    }

    public int getMax() {
        if (maxStack.isEmpty()) {
            System.out.println("The max stack is empty!");
            return Integer.MIN_VALUE;
        }
        return maxStack.peek();
    }

    public void displayStack() {
        System.out.println("Main Stack: " + mainStack);
        System.out.println("Max Stack: " + maxStack);
    }

    public static void main(String[] args) {
        MaxStackWithDisplay ms = new MaxStackWithDisplay();

        ms.push(10);
        ms.displayStack();
        System.out.println("Current Max: " + ms.getMax());

        ms.push(20);
        ms.displayStack();
        System.out.println("Current Max: " + ms.getMax());

        ms.push(5);
        ms.displayStack();
        System.out.println("Current Max: " + ms.getMax());

        ms.push(25);
        ms.displayStack();
        System.out.println("Current Max: " + ms.getMax());

        ms.pop();
        ms.displayStack();
        System.out.println("Current Max: " + ms.getMax());

        ms.pop();
        ms.displayStack();
        System.out.println("Current Max: " + ms.getMax());

        ms.pop();
        ms.displayStack();
        System.out.println("Current Max: " + ms.getMax());

        // Test Cases:
        // Push sequence: 10, 20, 5, 25
        // Check max after each pop to ensure maxStack sync
