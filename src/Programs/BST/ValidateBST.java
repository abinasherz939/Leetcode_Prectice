package Programs.BST;

public class ValidateBST {



    public boolean isValidBST(TreeNode root) {

        return isValidBST(root, Long.MIN_VALUE, Long.MAX_VALUE);
    }
    public boolean isValidBST(TreeNode root, long minVal, long maxval) {

        if (root == null) return true;
        if (root.val >= maxval || root.val <= minVal) return false;
        return isValidBST(root.left, minVal, root.val)
                && isValidBST(root.right, root.val,maxval);
    }
}
