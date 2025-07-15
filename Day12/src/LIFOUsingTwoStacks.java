//code1: LIFO using 2 Stacks

import java.util.Stack;

public class LIFOUsingTwoStacks {

    Stack<Integer> stack1 = new Stack<>();
    Stack<Integer> stack2 = new Stack<>();

    // Push operation: simply push to stack1
    public void push(int x) {
        stack1.push(x);
    }

    // Pop operation: move all elements to stack2, pop, return to stack1
    public int pop() {
        if (stack1.isEmpty()) {
            System.out.println("Stack is empty!");
            return -1;
        }
        while (!stack1.isEmpty()) {
            stack2.push(stack1.pop());
        }
        int popped = stack2.pop();
        while (!stack2.isEmpty()) {
            stack1.push(stack2.pop());
        }
        return popped;
    }

    public void display() {
        System.out.println("Current Stack: " + stack1);
    }

    public static void main(String[] args) {
        LIFOUsingTwoStacks lifo = new LIFOUsingTwoStacks();

        lifo.push(10);
        lifo.push(20);
        lifo.push(30);
        lifo.display();

        System.out.println("Popped: " + lifo.pop());
        lifo.display();

        lifo.push(40);
        lifo.display();

        System.out.println("Popped: " + lifo.pop());
        lifo.display();

        // Test Cases:
        // Push 10, 20, 30 => Expected stack: [10, 20, 30]
        // Pop => Expected popped: 30, stack: [10, 20]
        // Push 40 => stack: [10, 20, 40]
        // Pop => Expected popped: 40, stack: [10, 20]
    }
}
