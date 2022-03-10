package Programs.Trees;

public class BalancedBinaryTree {
    public boolean isBalancedN2sloution(TreeNode root) {
        if (root == null) return true;
        if (Math.abs(maxDepth(root.right)- maxDepth(root.left))>1) return false;
        if (!isBalanced(root.left) || !isBalanced(root.right)) return false;
        return true;
    }
    public int maxDepth(TreeNode root) {
        if (root == null) return 0;
        int leftHeight  =  maxDepth( root.left);
        int rightHeight = maxDepth(root.right);
        return Math.max(leftHeight+1, rightHeight+1);
    }
    public boolean isBalanced(TreeNode root) {
        if (root == null) return true;
        if (maxDepthmodified(root) == -1) return false;
        else return true;
    }
    public int maxDepthmodified(TreeNode root) {// this function returns max height if tree is balanced and returns -1 if the tree is not balanced;
        if (root == null) return 0;
        int leftHeight  =  maxDepthmodified( root.left);
        int rightHeight = maxDepthmodified(root.right);
        if (leftHeight == -1 || rightHeight == -1) return -1;
        if (Math.abs(leftHeight-rightHeight)> 1) return -1;
        return Math.max(leftHeight, rightHeight)+1;
    }
}
