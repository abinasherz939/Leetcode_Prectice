package Programs.Trees;

import java.util.*;
import java.util.stream.Stream;

class FindElements {
    TreeNode root;
    HashSet<Integer> set = new HashSet<>();
    public FindElements(TreeNode root) {
        this.root = root;
        Queue<TreeNode> q = new LinkedList<>();
        q.offer(root);
        root.val = 0;
        while (!q.isEmpty()){
            int queueSize = q.size();
            for (int i = 0; i < queueSize; i++) {
                TreeNode temp = q.peek();
                if (temp.left != null){
                    q.offer(temp.left);
                    temp.left.val = 2* temp.val +1;
                    set.add(temp.left.val);
                }
                if (temp.right!= null) {
                    q.offer(temp.right);
                    temp.right.val = 2* temp.val +2;
                    set.add(temp.right.val);
                }
                q.poll();
            }
        }
    }

    public boolean find(int target) {

        return set.contains(target);
    }
}
