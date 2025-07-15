//code1: Inorder, Preorder, Postorder Traversals in Binary Tree

public class BinaryTreeTraversals {

    int value;
    BinaryTreeTraversals left;
    BinaryTreeTraversals right;

    BinaryTreeTraversals(int v) {
        value = v;
        left = null;
        right = null;
    }

    public void inOrder(BinaryTreeTraversals root) {
        if (root == null) return;
        inOrder(root.left);
        System.out.print(root.value + " ");
        inOrder(root.right);
    }

    public void preOrder(BinaryTreeTraversals root) {
        if (root == null) return;
        System.out.print(root.value + " ");
        preOrder(root.left);
        preOrder(root.right);
    }

    public void postOrder(BinaryTreeTraversals root) {
        if (root == null) return;
        postOrder(root.left);
        postOrder(root.right);
        System.out.print(root.value + " ");
    }

    public static void main(String[] args) {
        BinaryTreeTraversals root = new BinaryTreeTraversals(20);
        root.left = new BinaryTreeTraversals(23);
        root.right = new BinaryTreeTraversals(31);
        root.left.left = new BinaryTreeTraversals(13);
        root.left.right = new BinaryTreeTraversals(5);

        BinaryTreeTraversals tree = new BinaryTreeTraversals(0);

        System.out.println("Inorder traversal: ");
        tree.inOrder(root);
        System.out.println();

        System.out.println("Preorder traversal: ");
        tree.preOrder(root);
        System.out.println();

        System.out.println("Postorder traversal: ");
        tree.postOrder(root);
        System.out.println();

        // Test Cases:
        // Tree: 20 -> 23(left), 31(right), 23 -> 13(left), 5(right)
        // Inorder: 13 23 5 20 31
        // Preorder: 20 23 13 5 31
        // Postorder: 13 5 23 31 20
    }
}
