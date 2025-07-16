class Node {
    int data;
    Node next;

    Node(int data) {
        this.data = data;
        this.next = null;
    }
}

public class CircularLinkedList {
    public static void main(String[] args) {
        // Step 1: Create the circular linked list manually
        Node head = new Node(1);
        head.next = new Node(2);
        head.next.next = new Node(3);
        head.next.next.next = new Node(4);
        head.next.next.next.next = new Node(5);
        head.next.next.next.next.next = head; // Make it circular

        // Step 2: Use slow and fast pointers to find midpoint
        Node slow = head;
        Node fast = head;
        while (fast.next != head && fast.next.next != head) {
            slow = slow.next;
            fast = fast.next.next;
        }

        // Step 3: Split into two halves
        Node head1 = head;
        Node head2 = slow.next;
        slow.next = head1; // Make first half circular

        Node temp = head2;
        while (temp.next != head) {
            temp = temp.next;
        }
        temp.next = head2; // Make second half circular

        // Step 4: Print both halves
        System.out.println("First half:");
        printCircularList(head1);

        System.out.println("Second half:");
        printCircularList(head2);
    }

    // Helper method to print a circular linked list
    public static void printCircularList(Node head) {
        if (head == null) return;
        Node temp = head;
        do {
            System.out.print(temp.data + " ");
            temp = temp.next;
        } while (temp != head);
        System.out.println();
    }
}

