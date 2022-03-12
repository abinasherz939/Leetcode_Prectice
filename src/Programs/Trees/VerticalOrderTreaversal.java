package Programs.Trees;

import java.util.*;

class Tuple {
    TreeNode node;
    int vertical;
    int level;

    public Tuple(TreeNode node, int vertical, int level) {
        this.node = node;
        this.vertical = vertical;
        this.level = level;
    }
}

class SolutionWithLevelOrder {
    public List<List<Integer>> verticalTraversal(TreeNode root) {
        TreeMap<Integer, TreeMap<Integer, PriorityQueue<Integer>>> map = new TreeMap<>();
        Queue<Tuple> q = new LinkedList<Tuple>();
        q.offer(new Tuple(root, 0, 0));
        while(!q.isEmpty()) {
            Tuple tuple = q.poll();
            TreeNode node = tuple.node;
            int x = tuple.vertical;
            int y = tuple.level;


            if (!map.containsKey(x)) {
                map.put(x, new TreeMap<>());
            }
            if (!map.get(x).containsKey(y)) {
                map.get(x).put(y, new PriorityQueue<>());
            }
            map.get(x).get(y).offer(node.val);

            if(node.left != null) {
                q.offer(new Tuple(node.left, x - 1, y + 1));
            }
            if(node.right != null) {
                q.offer(new Tuple(node.right, x + 1, y + 1));
            }
        }
        List<List<Integer>> list = new ArrayList<>();
        for (TreeMap<Integer, PriorityQueue<Integer>> ys : map.values()) {
            list.add(new ArrayList<>());
            for (PriorityQueue<Integer> nodes : ys.values()) {
                while (!nodes.isEmpty()) {
                    list.get(list.size() - 1).add(nodes.poll());
                }
            }
        }
        return list;
    }
}

class SolutionUsingStack {
    public List<List<Integer>> verticalTraversal(TreeNode root) {
        TreeMap<Integer, TreeMap<Integer, PriorityQueue<Integer>>> map = new TreeMap<>();
        Stack<Tuple> stack = new Stack<>();
        stack.push(new Tuple(root, 0, 0));
        while(!stack.isEmpty()) {
            Tuple tuple = stack.pop();
            TreeNode node = tuple.node;
            int x = tuple.vertical;
            int y = tuple.level;


            if (!map.containsKey(x)) {
                map.put(x, new TreeMap<>());
            }
            if (!map.get(x).containsKey(y)) {
                map.get(x).put(y, new PriorityQueue<>());
            }
            map.get(x).get(y).offer(node.val);

            if(node.left != null) {
                stack.push(new Tuple(node.left, x - 1, y + 1));
            }
            if(node.right != null) {
                stack.push(new Tuple(node.right, x + 1, y + 1));
            }
        }
        List<List<Integer>> list = new ArrayList<>();
        for (TreeMap<Integer, PriorityQueue<Integer>> ys : map.values()) {
            list.add(new ArrayList<>());
            for (PriorityQueue<Integer> nodes : ys.values()) {
                while (!nodes.isEmpty()) {
                    list.get(list.size() - 1).add(nodes.poll());
                }
            }
        }
        return list;
    }
}
