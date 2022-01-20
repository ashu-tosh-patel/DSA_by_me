import java.util.LinkedList;
import java.util.Queue;

public class Tree {

    //To print inorder traversal
    void inorder(Node root) {
        if (root != null) {
            inorder(root.left);
            System.out.print(root.key + " ");
            inorder(root.right);
        }
    }

    //to print preorder traversal
    void preorder(Node root) {
        if (root != null) {
            System.out.print(root.key + " ");
            preorder(root.left);
            preorder(root.right);
        }
    }

    //to print postorder traversal
    void postorder(Node root) {
        if (root != null) {
            postorder(root.left);
            postorder(root.right);
            System.out.print(root.key + " ");
        }
    }

    //to return the size of tree
    int size(Node root) {
        if (root == null) return 0;

        else return 1 + size(root.left) + size(root.right);
    }

    //to tell the maximum in a tree
    int maximum(Node root) {
        if (root == null) return Integer.MIN_VALUE;

        else return Math.max(root.key, Math.max(maximum(root.left), maximum(root.right)));
    }

    //to give the height of the tree
    int height(Node root) {
        if (root == null) return 0;
        else return Math.max(height(root.left), height(root.right)) + 1;
    }

    //To print the different levels of a tree at different lines
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

    //To print all the nodes at k+1 level in the tree
    void printAtK(Node root, int k) {
        if (root == null) return;
        if (k == 0) System.out.print(root.key + " ");

        else {
            printAtK(root.left, k - 1);
            printAtK(root.right, k - 1);
        }
    }

    //Children sum property
    boolean isCSum(Node root) {
        if (root == null) return true;
        if (root.right == null && root.left == null) return true;

        int sum = 0;
        if (root.left != null) sum += root.left.key;
        if (root.right != null) sum += root.right.key;
        return (sum == root.key && isCSum(root.right) && isCSum(root.left));

    }

    //To check the balanced tree i.e. the difference between
    //height of left subtree and right subtree should not be more than 1
    //for every node
    int isBalanced(Node root) {
        if (root == null) return 0;
        int lh = isBalanced(root.left);
        if (lh == -1) return -1;
        int rh = isBalanced(root.right);
        if (rh == -1) return -1;
        if (Math.abs(lh - rh) > 1) return -1;
        else return Math.max(lh, rh) + 1;
    }

    //Maximum width of a binary tree
    int maxWidth(Node root) {
        if (root == null) return 0;
        Queue<Node> q = new LinkedList<>();
        q.add(root);
        int res = 0;
        while (q.isEmpty() == false) {
            int count = q.size();
            res = Math.max(res, count);
            for (int i = 0; i < count; i++) {
                Node curr = q.poll();
                if (curr.left != null) q.add(curr.left);
                if (curr.right != null) q.add(curr.right);
            }
        }
        return res;
    }

    //construct a binary tree from preorder and inorder
    int preIndex = 0;

    Node cTree(int in[], int pre[], int is, int ie) {
        if (is > ie) return null;
        Node root = new Node(pre[preIndex++]);

        int inIndex = 0;
        for (int i = is; i <= ie; i++) {
            if (root.key == in[i]) {
                inIndex = i;
                break;
            }
        }
        root.left = cTree(in, pre, is, inIndex - 1);
        root.right = cTree(in, pre, inIndex + 1, ie);
        return root;
    }
}
