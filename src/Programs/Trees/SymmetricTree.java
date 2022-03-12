package Programs.Trees;

public class SymmetricTree {

    public boolean isSymmetric(TreeNode root) {

        if (root == null) return true;
        return helper(root.left, root.right);
    }

    public boolean helper(TreeNode leftRoot, TreeNode rightRoot){
        if (leftRoot ==null|| rightRoot==null) return leftRoot==rightRoot;
        if (leftRoot.val != rightRoot.val) return false;
        if (leftRoot.left.val != rightRoot.right.val) return false;
        if (leftRoot.right.val != rightRoot.left.val) return false;

        return helper(leftRoot.left, rightRoot.right) && helper(leftRoot.right, rightRoot.left);


    }
 }
