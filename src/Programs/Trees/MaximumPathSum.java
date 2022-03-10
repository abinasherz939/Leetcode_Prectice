package Programs.Trees;

public class MaximumPathSum {
    int maximum = Integer.MIN_VALUE;
    public int maxPathSum(TreeNode root) {

        helper(root);
      return maximum;
    }


    public int helper(TreeNode root){
        if (root == null) return 0;

        int leftMaxPath = helper(root.left);
        int rightMaxPath =  helper(root.right);

        maximum = Math.max(maximum, root.val+ leftMaxPath+ rightMaxPath);

        return Math.max(leftMaxPath, rightMaxPath)+ root.val;
    }


    public int maxPathSum1(TreeNode root) {
        int[] maxValue = new int[1];
        maxValue[0] = Integer.MIN_VALUE;
        maxPathDown(root, maxValue);
        return maxValue[0];
    }

    private int maxPathDown(TreeNode node, int[] maxValue) {
        if (node == null) return 0;
        int left = Math.max(0, maxPathDown(node.left, maxValue));
        int right = Math.max(0, maxPathDown(node.right, maxValue));
        maxValue[0] = Math.max(maxValue[0], left + right + node.val);
        return Math.max(left, right) + node.val;
    }
}
