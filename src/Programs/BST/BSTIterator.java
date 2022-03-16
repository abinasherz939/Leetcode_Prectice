package Programs.BST;

import java.util.List;
import java.util.Stack;
// O(n) Space;
//public class BSTIterator {
//    List<Integer> list;
//
//    int currentIndex = 0;
//
//    public BSTIterator(TreeNode root) {
//        getInorder(root, list);
//    }
//
//    public int next() {
//
//        return list.get(currentIndex++);
//
//    }
//
//    public boolean hasNext() {
//        return currentIndex<list.size();
//    }
//
//    public void getInorder(TreeNode root, List<Integer> list){
//        if (root == null) return;
//
//        getInorder(root.left, list);
//        list.add(root.val);
//        getInorder(root.right, list);
//    }
//}

//O(h) space
public class BSTIterator {
    Stack<TreeNode> stack = new Stack<>();
    public BSTIterator(TreeNode root) {
        pushALL(root);
    }
    public int next() {
        if (!stack.isEmpty()){
            TreeNode treeNode = stack.pop();

            if (treeNode.right != null ) pushALL(treeNode.right);
            return treeNode.val;
        }
        return -1;
    }

    public boolean hasNext() {
        return !stack.isEmpty();
    }

    public void pushALL(TreeNode root){
        while (root != null) {
            stack.push(root);
            root = root.left;
        }
    }
}
