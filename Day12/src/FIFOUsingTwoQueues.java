//code2: FIFO using 2 Queues

import java.util.LinkedList;
import java.util.Queue;

public class FIFOUsingTwoQueues {

    Queue<Integer> queue1 = new LinkedList<>();
    Queue<Integer> queue2 = new LinkedList<>();

    // Enqueue: simply add to queue1
    public void enqueue(int x) {
        queue1.add(x);
    }

    // Dequeue: transfer all except last to queue2, dequeue last, swap queues
    public int dequeue() {
        if (queue1.isEmpty()) {
            System.out.println("Queue is empty!");
            return -1;
        }
        while (queue1.size() > 1) {
            queue2.add(queue1.remove());
        }
        int dequeued = queue1.remove();
        // swap queues
        Queue<Integer> temp = queue1;
        queue1 = queue2;
        queue2 = temp;
        return dequeued;
    }

    public void display() {
        System.out.println("Current Queue: " + queue1);
    }

    public static void main(String[] args) {
        FIFOUsingTwoQueues fifo = new FIFOUsingTwoQueues();

        fifo.enqueue(100);
        fifo.enqueue(200);
        fifo.enqueue(300);
        fifo.display();

        System.out.println("Dequeued: " + fifo.dequeue());
        fifo.display();

        fifo.enqueue(400);
        fifo.display();

        System.out.println("Dequeued: " + fifo.dequeue());
        fifo.display();

        // Test Cases:
        // Enqueue 100, 200, 300 => Expected queue: [100, 200, 300]
        // Dequeue => Expected: 100, queue: [200, 300]
        // Enqueue 400 => queue: [200, 300, 400]
        // Dequeue => Expected: 200, queue: [300, 400]
    }
}
