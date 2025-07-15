// Program 4: Finding Intersection between Two Linked Lists
class Node {
    int data;
    Node next;
    Node(int data) {
        this.data = data;
        this.next = null;
    }
}

public class Intersection {
    public static void main(String[] args) {
        Node intersect = new Node(8);
        intersect.next = new Node(10);

        Node headA = new Node(3);
        headA.next = new Node(6);
        headA.next.next = intersect;

        Node headB = new Node(4);
        headB.next = intersect;

        System.out.println("Length of List A: " + getLength(headA));
        System.out.println("Length of List B: " + getLength(headB));

        System.out.print("List A: ");
        printList(headA);

        System.out.print("List B: ");
        printList(headB);
    }

    public static int getLength(Node head) {
        int length = 0;
        while (head != null) {
            length++;
            head = head.next;
        }
        return length;
    }

    public static void printList(Node head) {
        Node temp = head;
        while (temp != null) {
            System.out.print(temp.data + " -> ");
            temp = temp.next;
        }
        System.out.println("null");
    }
}
