import java.util.Stack;

public class MeanStack {

    Stack<Integer> mainStack = new Stack<>();
    int sum = 0;
    int count = 0;

    public void push(int x) {
        mainStack.push(x);
        sum += x;
        count++;
    }

    public void pop() {
        if (mainStack.isEmpty()) {
            System.out.println("Stack is empty!");
            return;
        }
        int removed = mainStack.pop();
        sum -= removed;
        count--;
    }

    public double getMean() {
        if (mainStack.isEmpty()) {
            System.out.println("Stack is empty!");
            return 0.0;
        }
        return (double) sum / count;
    }

    public void displayStack() {
        System.out.println("Stack: " + mainStack);
        System.out.println("Current Mean: " + getMean());
    }

    public static void main(String[] args) {
        MeanStack ms = new MeanStack();

        ms.push(10);
        ms.displayStack();

        ms.push(20);
        ms.displayStack();

        ms.push(30);
        ms.displayStack();

        ms.pop();
        ms.displayStack();

        ms.pop();
        ms.displayStack();

        // Test Cases:
        // Push: 10, 20, 30 -> Mean: 20
        // After pop: 30 removed -> Mean: 15
        // After pop: 20 removed -> Mean: 10
        // Test empty stack mean handling
    }
}
