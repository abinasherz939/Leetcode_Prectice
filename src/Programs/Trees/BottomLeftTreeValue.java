package Programs.Trees;

import org.w3c.dom.Node;

import java.util.ArrayDeque;
import java.util.LinkedList;
import java.util.Queue;
import java.util.TreeMap;
class Couple{
    TreeNode node;
    int vertical;
    int horizontal;

    public Couple(TreeNode node, int vertical, int horizontal) {
        this.node = node;
        this.vertical = vertical;
        this.horizontal = horizontal;
    }
}
class Solution {
//    public int findBottomLeftValue(TreeNode root) {
//        Queue<Couple> q= new LinkedList<>();
//        TreeNode ansNode = root;
//        Couple couple = new Couple(ansNode,0 , 0);
//        q.offer(new Couple(root, 0, 0));
//        while (!q.isEmpty()){
//            Couple temp = q.poll();
//            if (couple.horizontal > temp.horizontal && couple.vertical > temp.vertical) ansNode = temp.node;
//            if (temp.node.left!= null) q.add(new Couple(temp.node.left, temp.vertical-1, temp.horizontal+1 ));
//            if (temp.node.right!= null) q.add(new Couple(temp.node.right, temp.vertical+1, temp.horizontal+1 ));
//        }
//        return ansNode.val;
//    }

    public int findBottomLeftValue(TreeNode root) {
        Queue<TreeNode> q=new ArrayDeque<>();
        q.add(root);
        int res=0;
        while(q.size()>0)
        {
            int s=q.size();
            for(int i=0;i<s;i++)
            {
                TreeNode node=q.remove();
                if(i==0)
                {
                    res=node.val ;
                }
                if(node.left!=null)
                {
                    q.add(node.left);
                }
                if(node.right!=null)
                {
                    q.add(node.right);
                }
            }
        }
        return res;

    }
}

