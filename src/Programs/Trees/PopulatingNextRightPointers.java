package Programs.Trees;

import java.util.LinkedList;
import java.util.Queue;

public class PopulatingNextRightPointers {
    class Node {
        public int val;
        public Node left;
        public Node right;
        public Node next;

        public Node() {}

        public Node(int _val) {
            val = _val;
        }

        public Node(int _val, Node _left, Node _right, Node _next) {
            val = _val;
            left = _left;
            right = _right;
            next = _next;
        }
    };
    public Node connect(Node root) {// same solution worked also in its 2nd part.
        if (root == null) return null;
        Queue<Node> q = new LinkedList<>();
        q.offer(root);
        while (!q.isEmpty()) {
            int queueSize = q.size();
            for (int i = 0; i < queueSize; i++) {
                Node tempNode = q.poll();
                if (i == queueSize-1) tempNode.next = null;
                else tempNode.next = q.peek();
                if (tempNode.left != null) q.offer(tempNode.left);
                if (tempNode.right != null) q.offer(tempNode.right);

            }
        }
        return root;
    }
}
