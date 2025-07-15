import java.util.*;

public class RemoveMiddleStack {

    Stack<Integer> mainStack = new Stack<>();
    Stack<Integer> tempStack = new Stack<>();

    public void removeMiddle() {
        if (mainStack.isEmpty()) {
            System.out.println("Stack is empty!");
            return;
        }

        int middleIndex = mainStack.size() / 2;
        int size = mainStack.size();

        for (int i = 0; i < size; i++) {
            if (i == middleIndex) {
                mainStack.pop(); // remove middle
            } else {
                tempStack.push(mainStack.pop());
            }
        }

        while (!tempStack.isEmpty()) {
            mainStack.push(tempStack.pop());
        }
    }

    public void push(int x) {
        mainStack.push(x);
    }

    public void displayStack() {
        System.out.println("Stack: " + mainStack);
    }

    public static void main(String[] args) {
        RemoveMiddleStack ms = new RemoveMiddleStack();

        ms.push(1);
        ms.push(2);
        ms.push(3);
        ms.push(4);
        ms.push(5);

        System.out.println("Before removing middle:");
        ms.displayStack();

        ms.removeMiddle();

        System.out.println("After removing middle:");
        ms.displayStack();

        // Test Cases:
        // Stack: [1, 2, 3, 4, 5] -> remove middle (3) -> [1, 2, 4, 5]
        // Stack: [10, 20, 30, 40] -> remove middle (20) -> [10, 30, 40]
        // Test empty stack removal handling
    }
}
