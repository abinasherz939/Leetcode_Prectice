package Programs.Trees;

import java.util.ArrayList;
import java.util.List;
import java.util.Stack;

public class PostOrder {
    public List<Integer> postorderTraversalRecursive(TreeNode root) {
        List<Integer> list = new ArrayList<>();

        recurciveHelper(list, root);
        return list;
    }

    void recurciveHelper(List<Integer> list, TreeNode node){
        if (node == null) return;

        recurciveHelper(list, node.left);

        recurciveHelper(list, node.right);
        list.add(node.val);
    }

    public List<Integer> postorderTraversal(TreeNode root) {
        List<Integer> list = new ArrayList<>();
        if (root == null ) return list;
        Stack<TreeNode> stack1 = new Stack<>();
        Stack<TreeNode> stack2 = new Stack<>();
        stack1.push(root);
        while (!stack1.isEmpty()){
            TreeNode temp = stack1.pop();
            if (temp.left != null) stack1.push(temp.left);
            if (temp.right != null) stack1.push(temp.right);
            stack2.push(temp);
        }
        while (!stack2.isEmpty())list.add(stack2.pop().val);
        return list;
    }
}
