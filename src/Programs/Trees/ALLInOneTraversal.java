package Programs.Trees;

import java.util.ArrayList;
import java.util.Stack;


/***
 *
 * i didnot find this question so the code is not tasted.
 *
 *
 * ***/
//
//public class ALLInOneTraversal {
//    class BinaryTreeNode<T> {
//        T val;
//        BinaryTreeNode<T> left;
//        BinaryTreeNode<T> right;
//
//        public BinaryTreeNode(T val) {
//            this.val = val;
//            this.left = null;
//            this.right = null;
//        }
//    }
//    static class Pair{
//        BinaryTreeNode node;
//        int noOfTimesVisited;
//
//        public Pair(BinaryTreeNode node, int i) {
//            this.node = node;
//            noOfTimesVisited = i;
//        }
//    }
//
//    public static ArrayList<Integer> getLevelOrder(BinaryTreeNode root) {
//
//        ArrayList<Integer> preOrder = new ArrayList<>();
//        ArrayList<Integer> inOrder = new ArrayList<>();
//        ArrayList<Integer> postOrder = new ArrayList<>();
//        Stack<Pair> stack = new Stack<>();
//
//
//        stack.push(new Pair(root, 1));
//
// we will have to add the node in stack and use if now it is not ok.
//        while (!stack.isEmpty()){
//            Pair currentPair = stack.pop();
//            if (currentPair.noOfTimesVisited == 1){
//                preOrder.add((int)currentPair.node.val);
//                stack.push(new Pair(currentPair.node, currentPair.noOfTimesVisited+1));
//            }
//            else if (currentPair.noOfTimesVisited == 2){
//                inOrder.add((int)currentPair.node.val);
//                stack.push(new Pair(currentPair.node, currentPair.noOfTimesVisited+1));
//            }else if (currentPair.noOfTimesVisited == 3){
//                postOrder.add((int)currentPair.node.val);
//            }
//        }
//
//        return preOrder;
//
//
//    }
//}
