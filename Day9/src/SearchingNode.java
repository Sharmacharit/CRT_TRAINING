// Program 3: Searching for a Node Position in Linked List
class Node {
    int data;
    Node next;
    Node(int data) {
        this.data = data;
        this.next = null;
    }
}

public class SearchingNode {
    Node head;

    public void add(int data) {
        Node newNode = new Node(data);
        if (head == null) head = newNode;
        else {
            Node temp = head;
            while (temp.next != null) temp = temp.next;
            temp.next = newNode;
        }
    }

    public int search(int key) {
        Node temp = head;
        int pos = 1;
        while (temp != null) {
            if (temp.data == key) return pos;
            temp = temp.next;
            pos++;
        }
        return -1;
    }

    public static void main(String[] args) {
        SearchingNode list = new SearchingNode();
        list.add(10);
        list.add(20);
        list.add(30);
        list.add(40);

        int key = 30;
        int position = list.search(key);
        if (position != -1)
            System.out.println("Element " + key + " found at position: " + position);
        else
            System.out.println("Element " + key + " not found.");
    }
}
