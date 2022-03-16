package Programs.Trees;

import java.util.LinkedList;
import java.util.Queue;

public class SerializeAndDeserialize {

    public class Codec {
//
//        // Encodes a tree to a single string.
//        public String serialize(TreeNode root) {
//            Queue<TreeNode> q = new LinkedList<>();
//            if (root == null) return "";
//            StringBuilder stringBuilder = new StringBuilder(Integer.toString(root.val));
//            stringBuilder.append(" ");
//            q.offer(root);
//            while (!q.isEmpty()){
//                int queSize = q.size();
//                for (int i = 0; i < queSize; i++) {
//                    TreeNode node  = q.poll();
//                    if (node == null) continue;
//                    if (node.left != null) {
//                        q.add(node.left);
//                        stringBuilder.append(root.left.val).append(" ");
//                    }
//                    else stringBuilder.append("n ");
//                    if (node.right != null) {
//                        q.add(node.right);
//                        stringBuilder.append(root.right.val).append(" ");
//                    }
//                    else stringBuilder.append("n ");
//                }
//            }
//            return stringBuilder.toString();
//        }



        public String serialize(TreeNode root) {
    if (root == null) return "";
    Queue<TreeNode> q = new LinkedList<>();
    StringBuilder res = new StringBuilder();
    q.add(root);
    while (!q.isEmpty()) {
        TreeNode node = q.poll();
        if (node == null) {
            res.append("n ");
            continue;
        }
        res.append(node.val + " ");
        q.add(node.left);
        q.add(node.right);
    }
    return res.toString();
}

        // Decodes your encoded data to tree.
        public TreeNode deserialize(String data) {

            if (data.equals("")) return null;
            String[] array = data.split(" ");
            TreeNode root = new TreeNode(Integer.parseInt(array[0]));
            Queue<TreeNode> q = new LinkedList<>();
            q.offer(root);

            for (int i = 1; i < array.length; i++) {
                    TreeNode parent = q.poll();
                    if (!array[i].equals("n")){
                        TreeNode left = new TreeNode(Integer.parseInt(array[i]));
                        parent.left = left;
                        q.offer(left);
                    }
                    if (!array[++i].equals("n")){
                        TreeNode right = new TreeNode(Integer.parseInt(array[i]));
                        parent.right = right;
                        q.offer(right);
                    }
                }
            return root;
        }
    }
}
