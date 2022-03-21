package Programs.Trees;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;
import java.util.Queue;

public class LargestInRow {
    public List<Integer> largestValues(TreeNode root) {
        List<Integer>  list = new ArrayList<>();
        Queue<TreeNode> q = new LinkedList<>();
        q.offer(root);
        while (!q.isEmpty()){
            int queueSize = q.size();
            int maxOfLevel = Integer.MIN_VALUE;
            for (int i = 0; i < queueSize; i++) {
                TreeNode temp = q.poll();
                maxOfLevel = Math.max(maxOfLevel, temp.val);
                if (temp.left != null) q.offer(temp.left);
                if (temp.right != null) q.offer(temp.right);
            }
            list.add(maxOfLevel);
        }
        return list;
    }

}
