class Node {
    int data;
    Node next;

    Node(int data) {
        this.data = data;
        this.next = null;
    }
}

public class ConvertArrayToLinkedList {

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

    public static void printList(Node head) {
        Node temp = head;
        while (temp != null) {
            System.out.print(temp.data + " -> ");
            temp = temp.next;
        }
        System.out.println("null");
    }

    public static void main(String[] args) {
        int[] arr = {10, 20, 30, 40, 50};
        Node head = convertToLinkedList(arr);
        printList(head);

        // Test Cases:
        // int[] arr = {5, 15, 25}; Expected: 5 -> 15 -> 25 -> null
        // int[] arr = {}; Expected: null
        // int[] arr = {100}; Expected: 100 -> null
    }
}
