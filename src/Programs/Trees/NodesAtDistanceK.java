package Programs.Trees;


import java.util.*;

//public class NodesAtDistanceKByMe Some probleam {
//    public List<Integer> distanceK(TreeNode root, TreeNode target, int k) {
//
//        HashMap<TreeNode, TreeNode> paraentAddreses = new HashMap<>();
//        HashSet<TreeNode> isVisited = new HashSet<>();
//        List<Integer> output = new ArrayList<>();
//        Queue<TreeNode> q = new LinkedList<>();
//        q.offer(target); isVisited.add(target);
//        markParents(root, paraentAddreses);
//        int distance = 0;
//
//        while (!q.isEmpty()){
//            int queueSize = q.size();
//            if (distance == k) break;
//            distance++;
//            for (int i = 0; i < queueSize; i++) {
//                TreeNode temp = q.peek();
//
//                if (temp.left != null&&!isVisited.contains(temp.left)) {
//                    q.offer(temp.left);
//                    isVisited.add(temp.left);
//                }
//                if (temp.right != null&&!isVisited.contains(temp.right)) {
//                    q.offer(temp.right);
//                    isVisited.add(temp.right);
//                }
//                if (paraentAddreses.get(temp) != null && !isVisited.contains(paraentAddreses.get(temp))) {
//                    q.offer(temp.left);
//                    isVisited.add(paraentAddreses.get(temp));
//                }
//                q.poll();
//            }
//        }
//
//        while (!q.isEmpty()) output.add(q.poll().val);
//        return output;
//    }
//
//    void markParents(TreeNode root,HashMap<TreeNode, TreeNode> paraentAddreses) {
//        Queue<TreeNode> q = new LinkedList<>();
//        q.offer(root);
//        while (!q.isEmpty()) {
//            int queueSize = q.size();
//            for (int i = 0; i < queueSize; i++) {
//                TreeNode node = q.peek();
//                if (node.left != null) {
//                    q.offer(node.left);
//                    paraentAddreses.put(node.left, node);
//                }
//                if (node.right != null) {
//                    q.offer(node.right);
//                    paraentAddreses.put(node.right, node);
//                }
//                q.poll();
//            }
//        }
//    }
//}
class SolutionStriver {
    private void markParents(TreeNode root, Map<TreeNode, TreeNode> parent_track, TreeNode target) {
        Queue<TreeNode> queue = new LinkedList<TreeNode>();
        queue.offer(root);
        while(!queue.isEmpty()) {
            TreeNode current = queue.poll();
            if(current.left != null) {
                parent_track.put(current.left, current);
                queue.offer(current.left);
            }
            if(current.right != null) {
                parent_track.put(current.right, current);
                queue.offer(current.right);
            }
        }
    }
    public List<Integer> distanceK(TreeNode root, TreeNode target, int k) {
        Map<TreeNode, TreeNode> parent_track = new HashMap<>();
        markParents(root, parent_track, root);
        Map<TreeNode, Boolean> visited = new HashMap<>();
        Queue<TreeNode> queue = new LinkedList<TreeNode>();
        queue.offer(target);
        visited.put(target, true);
        int curr_level = 0;
        while(!queue.isEmpty()) { /*Second BFS to go upto K level from target node and using our hashtable info*/
            int size = queue.size();
            if(curr_level == k) break;
            curr_level++;
            for(int i=0; i<size; i++) {
                TreeNode current = queue.poll();
                if(current.left != null && visited.get(current.left) == null) {
                    queue.offer(current.left);
                    visited.put(current.left, true);
                }
                if(current.right != null && visited.get(current.right) == null ) {
                    queue.offer(current.right);
                    visited.put(current.right, true);
                }
                if(parent_track.get(current) != null && visited.get(parent_track.get(current)) == null) {
                    queue.offer(parent_track.get(current));
                    visited.put(parent_track.get(current), true);
                }
            }
        }
        List<Integer> result = new ArrayList<>();
        while(!queue.isEmpty()) {
            TreeNode current = queue.poll();
            result.add(current.val);
        }
        return result;
    }
}