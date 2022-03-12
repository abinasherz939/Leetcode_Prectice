package Programs.Trees;

import java.util.*;

public class TopViewOfBinaryTree {
    public static ArrayList<Integer> getTopView(BinaryTreeNode root) {
        Queue<Pair> q = new LinkedList<>();
        TreeMap<Integer, BinaryTreeNode> map = new TreeMap<>(); // here its sorted
        ArrayList<Integer> list = new ArrayList<>();
        q.offer(new Pair(root, 0));

        while (!q.isEmpty()){
            Pair  pair = q.poll();

            if (!map.containsKey(pair.vertical)){
                map.put(pair.vertical, pair.node);
            }
            if (pair.node.left != null) q.offer(new Pair(pair.node.left, pair.vertical-1));
            if (pair.node.right != null) q.offer(new Pair(pair.node.right, pair.vertical+1));
        }

        Set set = map.entrySet();
        Iterator itr = set.iterator();
        while (itr.hasNext()){
            Map.Entry me = (Map.Entry)itr.next();
            BinaryTreeNode temp = (BinaryTreeNode) me.getValue();
            list.add(temp.val);

        }
return list;
    }
}
