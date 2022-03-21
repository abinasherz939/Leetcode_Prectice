package Programs.Trees;

public class MaxAncestorDiff {


    int maxDiffrence = Integer.MIN_VALUE;
    public int maxAncestorDiff(TreeNode root) {

        maxAncestorDiff(root, root.val, root.val);

        return maxDiffrence;

    }

    public void maxAncestorDiff(TreeNode root, int maximum, int minimum) {

        if (root == null) return;

        maxDiffrence = Math.max(Math.max(Math.abs(maximum-root.val), Math.abs(root.val-minimum)), maxDiffrence);

        maxAncestorDiff(root.left, Math.max(maximum, root.val),Math.min(minimum, root.val));
        maxAncestorDiff(root.right, Math.max(maximum, root.val),Math.min(minimum, root.val));
    }
}
