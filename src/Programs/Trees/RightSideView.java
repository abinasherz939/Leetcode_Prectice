package Programs.Trees;

import java.util.*;

public class RightSideView {

    public List<Integer> rightSideView(TreeNode root) {

        List<Integer> output =new ArrayList<>();
        Queue<TreeNode> q = new LinkedList<>();
        q.offer(root);

        while (!q.isEmpty()){
            int queueSize =  q.size();
            for (int i = 0; i < queueSize; i++) {
                TreeNode tempNode = q.peek();
                if ( i == 0) output.add(tempNode.val);
                if (tempNode.right != null) q.add(tempNode.right);
                if (tempNode.left != null) q.add(tempNode.left);
                q.poll();
            }
        }
        return output;
    }
}
