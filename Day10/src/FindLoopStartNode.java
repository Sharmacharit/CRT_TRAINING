class LoopNode {
    int value;
    LoopNode next;

    LoopNode(int value) {
        this.value = value;
        this.next = null;
    }
}

public class FindLoopStartNode {

    public static LoopNode findLoopStart(LoopNode head) {
        LoopNode slow = head;
        LoopNode fast = head;

        while (fast != null && fast.next != null) {
            slow = slow.next;
            fast = fast.next.next;

            if (slow == fast) { // Loop detected
                slow = head;
                while (slow != fast) {
                    slow = slow.next;
                    fast = fast.next;
                }
                return slow; // Start of loop
            }
        }
        return null; // No loop
    }

    public static void main(String[] args) {
        LoopNode head = new LoopNode(10);
        head.next = new LoopNode(20);
        head.next.next = new LoopNode(30);
        head.next.next.next = new LoopNode(40);
        head.next.next.next.next = new LoopNode(50);

        // Creating a loop:
        head.next.next.next.next.next = head.next.next; // Loop starts at 30

        LoopNode loopStart = findLoopStart(head);
        System.out.println("Loop starts at node with value: " + (loopStart != null ? loopStart.value : "null"));

        // Test Cases:
        // 1️⃣ Loop at node with value 30 (above), expected output: 30
        // 2️⃣ No loop, expected output: null
        // 3️⃣ Single node loop to itself, expected output: node value
    }
}
