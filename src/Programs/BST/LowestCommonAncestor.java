package Programs.BST;

public class LowestCommonAncestor {
    public TreeNode lowestCommonAncestor(TreeNode root, TreeNode p, TreeNode q) {

        if (root == p || root == q || root == null) return root;
        if (p.val < root.val && q.val> root.val) return root;
        if (Math.min(q.val, p.val) > root.val) return lowestCommonAncestor(root.right, p, q);
        if (Math.max(p.val, q.val) < root.val) return lowestCommonAncestor(root.left, p,q);
        return lowestCommonAncestor(root,q,p);
    }

}
