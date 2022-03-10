package Programs.Trees;

public class DiameterBinaryTree {
    int maximum = 0;
    public int diameterOfBinaryTree(TreeNode root) {
        helper(root);
      return maximum;
    }

    int helper (TreeNode root){
        if(root == null ) return 0;
        int lh = helper(root.left);
        int rh = helper(root.right);
        maximum = Math.max(maximum, lh+rh);
        return 1+Math.max(lh, rh);
    }
}
