package Programs.Trees;

import java.util.LinkedList;
import java.util.Queue;

public class DeapestLeaveSum {
    class pair{
        TreeNode node;
        int level;

        pair(TreeNode node , int level){
            this.level = level;
            this.node = node;
        }

    }

    public int deepestLeavesSum(TreeNode root) {
        Queue<pair> q = new LinkedList<>();
        int sum = 0;
        q.offer(new pair(root, 0));
        int height = maxHeight(root)-1;
        while(!q.isEmpty()){
            int size = q.size();
            for(int i =0 ; i< size; i++){
                pair temp = q.poll();
                if(temp.node.left!= null) q.add(new pair(temp.node.left, temp.level+1));
                if(temp.node.right!= null) q.add(new pair(temp.node.right, temp.level+1));

                if (temp.level == height){
                    sum+= temp.node.val;
                }
            }
        }
        return sum;
    }
    int maxHeight(TreeNode root){
        if (root == null) return 0;
        return 1+Math.max(maxHeight(root.left),maxHeight(root.right));
    }
}
