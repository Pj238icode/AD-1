import java.util.Scanner;

public class Tree {
    class Node {
        int data;
        Node left;
        Node right;

        Node(int data) {
            this.data = data;

        }
    }

    Node insert(Node root, int val) {
        if (root == null) {
            root = new Node(val);

        }
        if (root.data > val) {
            root.left = insert(root.left, val);
        } else if (root.data < val) {
            root.right = insert(root.right, val);

        }
        return root;
    }

    void Inorder(Node root) {
        if (root == null) {
            return;
        }
        Inorder(root.left);
        System.out.print(root.data + " ");
        Inorder(root.right);
    }

    void Postorder(Node root) {
        if (root == null) {
            return;
        }
        Postorder(root.left);
        Inorder(root.right);
        System.out.print(root.data + " ");
    }

    void Preorder(Node root) {
        if (root == null) {
            return;
        }
        System.out.print(root.data + " ");
        Preorder(root.left);
        Preorder(root.right);
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the size of the tree: ");
        int size = sc.nextInt();
        int data[] = new int[size];
        for (int i = 0; i < data.length; i++) {
            data[i] = sc.nextInt();
        }
        Tree obj = new Tree();
        Node root = null;
        for (int i = 0; i < data.length; i++) {
            root = obj.insert(root, data[i]);

        }
        obj.Inorder(root);
        System.out.println();
        obj.Postorder(root);
        System.out.println();
        obj.Preorder(root);

    }
}
