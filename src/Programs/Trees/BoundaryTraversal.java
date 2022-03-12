package Programs.Trees;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Stack;
//
//public class BoundaryTraversal {
//    static class TreeNode {
//        int data;
//        TreeNode left;
//        TreeNode right;
//
//        TreeNode(int data) {
//            this.data = data;
//            this.left = null;
//            this.right = null;
//        }
//
//    }
//
//    public static void leftBoundary(TreeNode root, Stack<TreeNode> stack, ArrayList<Integer> output){
//        while (!stack.isEmpty()){
//            if (root == null || (root.left == null && root.right == null)) {
//                return;
//            }
////            if (root.left== null && root.right == null) return;
//            output.add(root.data);
//            leftBoundary(root.left, stack, output);
//        }
//    }
//    public static void leafNodes (TreeNode root, Stack<TreeNode> stack, ArrayList<Integer> output){
//        while (!stack.isEmpty()){
//            if (root.left== null || root.right == null) return;
//            leafNodes(root.left, stack, output);
//            if (root.left== null && root.right == null) output.add(root.data);
//            leafNodes(root.right, stack, output);
//        }
//    }
//    public static void rightBoundary (TreeNode root, Stack<TreeNode> stack, ArrayList<Integer> output){
//        while (!stack.isEmpty()){
//            if (root == null || (root.left == null && root.right == null)) {
//                return;
//            }
//
////            if (root.left== null && root.right == null) return;
//            output.add(root.data);
//            rightBoundary(root.right, stack, output);
//        }
//    }
//
//
//    public static  ArrayList<Integer> traverseBoundary(TreeNode root){
//        Stack<TreeNode> stack = new Stack<>();
//        ArrayList<Integer> output= new ArrayList<>();
//        ArrayList<Integer> forRightBoundary = new ArrayList<>();
//        stack.push(root);
//
//        leftBoundary(root, stack, output);
//        stack.removeAllElements();stack.push(root);
//        leafNodes(root, stack, output);
//        stack.removeAllElements();stack.push(root);
//        rightBoundary(root, stack,forRightBoundary);
//        Collections.reverse(forRightBoundary);
//        forRightBoundary.remove(forRightBoundary.size()-1);
//
//        output.addAll(forRightBoundary);
//
//        return output;
//    }
//





//}
