class Node {
    int data;
    Node next;

    Node(int data) {
        this.data = data;
        this.next = null;
    }
}

public class CheckLoopInLinkedList {

    public static boolean hasLoop(Node head) {
        Node slow = head;
        Node fast = head;

        while (fast != null && fast.next != null) {
            slow = slow.next;
            fast = fast.next.next;

            if (slow == fast) {
                return true; // Loop detected
            }
        }
        return false; // No loop
    }

    public static void main(String[] args) {
        Node head = new Node(10);
        head.next = new Node(20);
        head.next.next = new Node(30);
        head.next.next.next = new Node(40);
        head.next.next.next.next = new Node(50);

        // Creating a loop for testing:
        head.next.next.next.next.next = head.next.next; // Node with value 30

        boolean result = hasLoop(head);
        System.out.println("Loop detected: " + result);

        // Test Cases:
        // 1️⃣ Loop exists (as above), expected output: true
        // 2️⃣ No loop (remove the above loop creation), expected output: false
        // 3️⃣ Single node pointing to itself: new Node(1).next = itself, expected: true
    }
}
