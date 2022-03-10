package Programs.Trees;

import java.util.*;

public class LevelOrder {
    public List<List<Integer>> levelOrder(TreeNode root) {

        List<List<Integer>> list = new ArrayList<>();
        if (root == null ) return list;
        Queue<TreeNode> queue = new LinkedList<>();
        queue.offer(root);

        while (!queue.isEmpty()){
            List<Integer> templist = new ArrayList<>();
            int queueSize = queue.size();
            for (int i = 0; i < queueSize; i++) {

                TreeNode temp = queue.peek();
                if (temp.left != null) {
                    queue.offer(temp.left);

                }
                if (temp.right != null) {
                    queue.offer(temp.right);

                }
                templist.add(queue.poll().val);
            }
            list.add(templist);
        }
        return list;
    }





    public List<List<Integer>> levelOrderBottom(TreeNode root) {

        List<List<Integer>> list = new ArrayList<>();
        if (root == null ) return list;
        Queue<TreeNode> queue = new LinkedList<>();

        queue.offer(root);
        while (!queue.isEmpty()){
            List<Integer> list1 = new ArrayList<>();
            int queueSize = queue.size();
            for (int i = 0; i < queueSize; i++) {
                TreeNode temp = queue.poll();
                if (temp.left!=null) queue.add(temp.left);
                if (temp.right!= null) queue.add(temp.right);

                list1.add(temp.val);
            }
            list.add(list1);
        }
        Collections.reverse(list);
        return list;
    }






























}
