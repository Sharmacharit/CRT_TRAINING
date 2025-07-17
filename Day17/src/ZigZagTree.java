import java.util.*;

class TreeNode {
    int value;
    TreeNode left;
    TreeNode right;

    TreeNode(int value){
        this.value = value;
    }
}

public class ZigZagTree {
    public static void main(String[] args) {
        TreeNode root = new TreeNode(1);
        root.left = new TreeNode(2);
        root.right = new TreeNode(3);
        root.left.left = new TreeNode(4);
        root.left.right = new TreeNode(5);
        root.right.right = new TreeNode(6);
        root.left.left.left = new TreeNode(7);
        root.left.left.right = new TreeNode(8);
        root.left.right.left = new TreeNode(9);
        root.left.right.right = new TreeNode(10);
        root.right.right.left = new TreeNode(11);
        root.right.right.right = new TreeNode(12);

        int count = 0;
        int level = 0;

        if (root == null) {
            System.out.println();
            return;
        }

        Stack<TreeNode> stack1 = new Stack<>();
        Stack<TreeNode> stack2 = new Stack<>();
        stack1.push(root);

        while (!stack1.isEmpty() || !stack2.isEmpty()) {
            if (!stack1.isEmpty()) {
                System.out.println("Level: " + level);
                while (!stack1.isEmpty()) {
                    TreeNode current = stack1.pop();
                    System.out.print(current.value + " ");
                    if (current.left != null) {
                        stack2.push(current.left);
                    }
                    if (current.right != null) {
                        stack2.push(current.right);
                    }
                }
                System.out.println();
                count++;
                level++;
            }

            if (!stack2.isEmpty()) {
                System.out.println("Level: " + level);
                while (!stack2.isEmpty()) {
                    TreeNode current = stack2.pop();
                    System.out.print(current.value + " ");
                    if (current.right != null) {
                        stack1.push(current.right);
                    }
                    if (current.left != null) {
                        stack1.push(current.left);
                    }
                }
                System.out.println();
                count++;
                level++;
            }
        }

        System.out.println("Height is: " + (count - 1));
    }
}

