package Programs.Trees;

import java.util.Stack;

public class CorrespondingNodeInAClonedTree {
    public final TreeNode getTargetCopy(final TreeNode original, final TreeNode cloned, final TreeNode target) {

        Stack<TreeNode> stack1 = new Stack<>();
        Stack<TreeNode> stack2 = new Stack<>();
        stack1.add(original);
        stack2.add(cloned);


        while (!stack1.isEmpty()){
            TreeNode originalNode = stack1.pop();
            TreeNode clonnedNode = stack2.pop();
            if (originalNode == target) return clonnedNode;

            if (originalNode.left != null) stack1.add(originalNode.left);
            if (clonnedNode.left != null) stack2.add(clonnedNode.left);
            if (originalNode.right != null) stack1.add(originalNode.right);
            if (clonnedNode.right != null) stack2.add(clonnedNode.right);


        }
        return null;
    }

}
