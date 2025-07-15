public class GetMiddleElement {

    static class Node {
        int data;
        Node next;

        Node(int data) {
            this.data = data;
            this.next = null;
        }
    }

    public static Node convertToLinkedList(int[] arr) {
        if (arr.length == 0) return null;

        Node head = new Node(arr[0]);
        Node current = head;
        for (int i = 1; i < arr.length; i++) {
            current.next = new Node(arr[i]);
            current = current.next;
        }
        return head;
    }

    public static Node getMiddle(Node head) {
        if (head == null) {
            throw new RuntimeException("List is empty.");
        }

        Node slow = head;
        Node fast = head;

        while (fast != null && fast.next != null) {
            slow = slow.next;
            fast = fast.next.next;
        }

        return slow;
    }

    public static void main(String[] args) {
        int[] arr = {10, 20, 30, 40, 50, 60};
        Node head = convertToLinkedList(arr);

        Node middle = getMiddle(head);
        System.out.println("Middle node: " + middle.data);

        // Test Cases:
        // int[] arr = {1, 2, 3, 4, 5}; Expected middle: 3
        // int[] arr = {10, 20, 30, 40}; Expected middle: 30
        // int[] arr = {7}; Expected middle: 7
    }
}
