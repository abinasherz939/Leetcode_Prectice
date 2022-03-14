package Programs.Trees;

import java.util.LinkedList;
import java.util.Queue;

public class MaxLevelSum {
    class pair{
        TreeNode node;
        int level;

        public pair(TreeNode node, int level) {
            this.node = node;
            this.level = level;
        }
    }
    public int maxLevelSum(TreeNode root) {

        int maxSum = Integer.MIN_VALUE;
        int maxSumLevel = 1, level =1;
        Queue<pair> q =new LinkedList<>();
        q.offer(new pair(root, 1));
        while (!q.isEmpty()){
            int queueSize = q.size();

            int sum = 0;
            for (int i = 0; i < queueSize; i++) {
                pair temp = q.poll();
                if (temp.node.left != null) q.offer(new pair(temp.node.left, temp.level +1));
                if (temp.node.right != null) q.offer(new pair(temp.node.right, temp.level +1));
                sum+=temp.node.val;
            }
            if (sum>maxSum) maxSumLevel = level;
            maxSum =Math.max(sum, maxSum);

            level++;
        }
        return maxSumLevel;
    }
}
