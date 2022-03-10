package Programs.Trees;

import java.util.ArrayList;
import java.util.List;
import java.util.Stack;

public class PreOrder {
    public List<Integer> preorderTraversalRecursive(TreeNode root) {
        List<Integer> list = new ArrayList<>();

        recurciveHelper(list, root);
        return list;
    }

    void recurciveHelper(List<Integer> list, TreeNode node){
        if (node == null) return;
        list.add(node.val);
        recurciveHelper(list, node.left);

        recurciveHelper(list, node.right);

    }
    public List<Integer> preorderTraversal(TreeNode root) {

        Stack<TreeNode> stack = new Stack<>();
        List<Integer> list = new ArrayList<>();
        if (root == null ) return list;
        stack.push(root);
        while (!stack.isEmpty()){
            TreeNode node = stack.pop();
            list.add(node.val);
            if (node.right != null)stack.push(node.right);
            if (node.left != null)stack.push(node.left);

        }
        return list;
    }



}
