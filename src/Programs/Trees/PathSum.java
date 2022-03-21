//package Programs.Trees;
//
//import java.util.*;
//
//public class PathSum {
//    public boolean hasPathSumRecursive(TreeNode root, int sum) {
//        // recursion method
//        if (root == null) return false;
//        if (root.left == null && root.right == null && root.val == sum) return true;
//        return hasPathSumRecursive(root.left, sum - root.val) || hasPathSumRecursive(root.right, sum - root.val);
//    }
//
//
//    public boolean hasPathSumIterative(TreeNode root, int sum) {
////        // iteration method
////        if (root == null) {return false;}
////        Stack<TreeNode> path = new Stack<>();
////        Stack<Integer> sub = new Stack<>();
////        path.push(root);
////        sub.push(root.val);
////        while (!path.isEmpty()) {
////            TreeNode temp = path.pop();
////            int tempVal = sub.pop();
////            if (temp.left == null && temp.right == null) {if (tempVal == sum) return true;}
////            else {
////                if (temp.left != null) {
////                    path.push(temp.left);
////                    sub.push(temp.left.val + tempVal);
////                }
////                if (temp.right != null) {
////                    path.push(temp.right);
////                    sub.push(temp.right.val + tempVal);
////                }
////            }
////        }
////        return false;
//        Stack<TreeNode> mainStack = new Stack<>();
//        Stack<Integer> sumStack = new Stack<>();
//        mainStack.push(root);
//        sumStack.push(root.val);
//        while (!mainStack.isEmpty()){
//            TreeNode tempNode = mainStack.pop();
//            Integer valHere = sumStack.pop();
//
//            if (tempNode.left ==null &&  tempNode.right == null){ if (sum == sumStack.peek()) return true;}
//            else {
//                if (tempNode.left != null) {
//                    mainStack.push(tempNode.left);
//                    sumStack.push(tempNode.left.val+ valHere);
//                }
//                if (tempNode.right != null) {
//                    mainStack.push(tempNode.right);
//                    sumStack.push(tempNode.right.val+ valHere);
//                }
//            }
//        }
//        return false;
//    }
//
//
//
//    public List<List<Integer>> pathSum(TreeNode root, int targetSum) {
//        List<List<Integer>> list = new ArrayList<>();
//        Stack<TreeNode> mainStack = new Stack<>();
//        Stack<Integer> sumStack = new Stack<>();
//        Deque<Integer> list2 = new ArrayDeque<>();
//        list2.addLast(root.val);
//        mainStack.push(root);
//        sumStack.push(root.val);
//        while (!mainStack.isEmpty()){
//            TreeNode tempNode = mainStack.pop();
//            Integer valHere = sumStack.pop();
//            Integer element = list2.peekFirst();
//            if (tempNode.left ==null &&  tempNode.right == null)
//            {
//                if (targetSum == sumStack.peek()){
//                    List<Integer> list1 = new ArrayList<>(list2);
//                    list.add(list1);
//                }
//            }
//            else {
//                if (tempNode.left != null) {
//                    mainStack.push(tempNode.left);
//                    sumStack.push(tempNode.left.val+ valHere);
//                }
//                if (tempNode.right != null) {
//                    mainStack.push(tempNode.right);
//                    sumStack.push(tempNode.right.val+ valHere);
//                }
//            }
//        }
//        return false;
//    }
//
//
//
//}
