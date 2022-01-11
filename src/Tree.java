import java.util.LinkedList;
import java.util.Queue;

public class Tree {
    void inorder(Node root) {
        if (root != null) {
            inorder(root.left);
            System.out.print(root.key + " ");
            inorder(root.right);
        }
    }

    void preorder(Node root) {
        if (root != null) {
            System.out.print(root.key + " ");
            preorder(root.left);
            preorder(root.right);
        }
    }

    void postorder(Node root) {
        if (root != null) {
            postorder(root.left);
            postorder(root.right);
            System.out.print(root.key + " ");
        }
    }

    int size(Node root) {
        if (root == null) return 0;

        else return 1 + size(root.left) + size(root.right);
    }

    int maximum(Node root) {
        if (root == null) return Integer.MIN_VALUE;

        else return Math.max(root.key, Math.max(maximum(root.left), maximum(root.right)));
    }

    int height(Node root) {
        if (root == null) return 0;
        else return Math.max(height(root.left), height(root.right)) + 1;
    }

    void printLevelOrderLine(Node root) {
        if (root == null) return;
        Queue<Node> q = new LinkedList<Node>();
        q.add(root);
        q.add(null);
        while (q.size() > 1) {
            Node curr = q.poll();
            if (curr == null) {
                System.out.println();
                q.add(null);
                continue;
            }
            System.out.print(curr.key + " ");
            if (curr.left != null) q.add(curr.left);
            if (curr.right != null) q.add(curr.right);
        }
    }

    void printAtK(Node root, int k) {
        if (root == null) return;
        if (k == 0) System.out.print(root.key + " ");

        else {
            printAtK(root.left, k - 1);
            printAtK(root.right, k - 1);
        }
    }
}
