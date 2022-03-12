package Programs.Trees;

import java.lang.invoke.SerializedLambda;
import java.util.*;

public class ZigZagTraversal {
    public List<List<Integer>> zigzagLevelOrder(TreeNode root) {
        List<List<Integer>> output = new ArrayList<>();
        if(root == null )  return output;
        int level = 0;
        Queue<TreeNode> queue = new LinkedList<>();
        queue.offer(root);

        while (!queue.isEmpty()){
            int queueSize = queue.size();
            List<Integer> templist = new ArrayList<>();

            for (int i = 0; i < queueSize; i++) {
                TreeNode tempNode = queue.peek();
                templist.add(tempNode.val);
                if (tempNode.left != null) queue.offer(tempNode.left);
                if (tempNode.right != null) queue.offer(tempNode.right);
                queue.poll();
            }
            if (level%2 != 0) Collections.reverse(templist);
            level++;
            output.add(templist);
        }
        return output;
    }
}
