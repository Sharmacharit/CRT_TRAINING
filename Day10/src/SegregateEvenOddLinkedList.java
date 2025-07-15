class EO_Node {
    int data;
    EO_Node next;

    EO_Node(int data) {
        this.data = data;
        this.next = null;
    }
}

public class SegregateEvenOddLinkedList {

    public static EO_Node segregate(EO_Node head) {
        EO_Node evenHead = null, evenTail = null;
        EO_Node oddHead = null, oddTail = null;

        while (head != null) {
            if (head.data % 2 == 0) {
                if (evenHead == null) {
                    evenHead = evenTail = head;
                } else {
                    evenTail.next = head;
                    evenTail = evenTail.next;
                }
            } else {
                if (oddHead == null) {
                    oddHead = oddTail = head;
                } else {
                    oddTail.next = head;
                    oddTail = oddTail.next;
                }
            }
            head = head.next;
        }

        if (evenTail != null) evenTail.next = oddHead;
        if (oddTail != null) oddTail.next = null;

        return (evenHead != null) ? evenHead : oddHead;
    }

    public static void print(EO_Node head) {
        while (head != null) {
            System.out.print(head.data + " -> ");
            head = head.next;
        }
        System.out.println("null");
    }

    public static void main(String[] args) {
        int[] arr = {17, 15, 8, 12, 10, 5, 4};
        EO_Node head = new EO_Node(arr[0]);
        EO_Node current = head;
        for (int i = 1; i < arr.length; i++) {
            current.next = new EO_Node(arr[i]);
            current = current.next;
        }

        System.out.println("Original List:");
        print(head);

        head = segregate(head);

        System.out.println("Even-Odd Segregated List:");
        print(head);

        // Test Cases:
        // 1️⃣ arr = {1, 2, 3, 4, 5}, Expected: 2 -> 4 -> 1 -> 3 -> 5 -> null
        // 2️⃣ arr = {2, 4, 6}, Expected: 2 -> 4 -> 6 -> null
        // 3️⃣ arr = {1, 3, 5}, Expected: 1 -> 3 -> 5 -> null
    }
}
