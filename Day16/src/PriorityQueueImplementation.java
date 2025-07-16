import java.util.*;
public class PriorityQueueImplementation {
    public static void main(String[] args) {
        PriorityQueue<Integer> pq = new PriorityQueue<>();
        pq.add(10);
        pq.add(5);
        pq.add(20);
        pq.offer(15);//Also adds an element
        int min = pq.poll(); // removes 5 if 5 is the smallest
        System.out.println(min);
        int next = pq.peek();//peek() – Returns (but does not remove) the head
        System.out.println(next);
        if (pq.isEmpty()) {
            System.out.println("Queue is empty");
        }
        System.out.println("Size: " + pq.size());//size() – Returns the number of elements
    }
}
