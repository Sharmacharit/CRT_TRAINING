//code2: Insertion and Deletion in BST with Traversals

public class BSTInsertionDeletion {

    public static class TreeNode {
        int val;
        TreeNode left, right;

        TreeNode(int value) {
            this.val = value;
            this.left = null;
            this.right = null;
        }
    }

    public static void inOrder(TreeNode root) {
        if (root == null) return;
        inOrder(root.left);
        System.out.print(root.val + " ");
        inOrder(root.right);
    }

    public static void preOrder(TreeNode root) {
        if (root == null) return;
        System.out.print(root.val + " ");
        preOrder(root.left);
        preOrder(root.right);
    }

    public static void postOrder(TreeNode root) {
        if (root == null) return;
        postOrder(root.left);
        postOrder(root.right);
        System.out.print(root.val + " ");
    }

    public static TreeNode insertBST(TreeNode root, int value) {
        if (root == null) {
            return new TreeNode(value);
        }
        if (value < root.val) {
            root.left = insertBST(root.left, value);
        } else {
            root.right = insertBST(root.right, value);
        }
        return root;
    }

    public static TreeNode findMin(TreeNode node) {
        while (node.left != null) {
            node = node.left;
        }
        return node;
    }

    public static TreeNode deleteBST(TreeNode root, int value) {
        if (root == null) return null;

        if (value < root.val) {
            root.left = deleteBST(root.left, value);
        } else if (value > root.val) {
            root.right = deleteBST(root.right, value);
        } else {
            if (root.left == null) return root.right;
            else if (root.right == null) return root.left;
            TreeNode successor = findMin(root.right);
            root.val = successor.val;
            root.right = deleteBST(root.right, successor.val);
        }
        return root;
    }

    public static void main(String[] args) {
        TreeNode root = null;
        int[] arr = {10, 20, 30, 40, 50, 60, 70};
        for (int value : arr) {
            root = insertBST(root, value);
        }

        System.out.println("Root value: " + root.val);

        System.out.print("Inorder traversal: ");
        inOrder(root);
        System.out.println();

        System.out.print("Preorder traversal: ");
        preOrder(root);
        System.out.println();

        System.out.print("Postorder traversal: ");
        postOrder(root);
        System.out.println();

        System.out.println("Inserting value 60 again:");
        root = insertBST(root, 60);
        System.out.print("After insertion: ");
        inOrder(root);
        System.out.println();

        System.out.println("Deleting value 30:");
        root = deleteBST(root, 30);
        System.out.print("After deletion: ");
        inOrder(root);
        System.out.println();

        // Test Cases:
        // Insert: 10,20,30,40,50,60,70 => Inorder: 10 20 30 40 50 60 70
        // Insert 60 again => Inorder remains valid
        // Delete 30 => Inorder: 10 20 40 50 60 70
    }
}
