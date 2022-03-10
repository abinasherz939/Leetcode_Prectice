package Programs.Trees;

import java.util.ArrayList;
import java.util.List;
import java.util.Stack;

class justToAvoidSuggestionInOrder {

    public List<Integer> inorderTraversalIterative(TreeNode root) {
        Stack<TreeNode> stack = new Stack<>();
        List<Integer> inOrder = new ArrayList<>();
        if(root == null) return inOrder;
        TreeNode node = root;
        stack.push(node);
        while (!stack.isEmpty()){

            if(node != null){
                stack.push(node);
                node = node.left;
            }else{
                node = stack.pop();
                if(stack.isEmpty()) break;
                inOrder.add(node.val);
                node = node.right;
            }
        }
        return inOrder;
    }

    public List<Integer> inorderTraversal(TreeNode root) {

        List<Integer> list = new ArrayList<>();

        recurciveHelper(list, root);
        return list;
    }
    void recurciveHelper(List<Integer> list, TreeNode node){
        if (node == null) return;

        recurciveHelper(list, node.left);
        list.add(node.val);
        recurciveHelper(list, node.right);

    }

}
