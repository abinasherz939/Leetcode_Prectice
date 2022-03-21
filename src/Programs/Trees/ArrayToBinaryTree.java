package Programs.Trees;

public class ArrayToBinaryTree {
    public TreeNode sortedArrayToBST(int[] nums) {
        return makeAHeightBalancedBinaryTree(nums, 0, nums.length - 1);
    }

    public TreeNode makeAHeightBalancedBinaryTree(int [] nums, int fromIndex, int tillIndex){
        if (fromIndex>tillIndex) return null;
        if (fromIndex == tillIndex) return new TreeNode(nums[fromIndex]);
        int midIndex = (fromIndex + tillIndex)/2;
        TreeNode root =  new TreeNode(nums[midIndex]);
        root.left = makeAHeightBalancedBinaryTree(nums, fromIndex, midIndex-1);
        root.right = makeAHeightBalancedBinaryTree(nums, midIndex+1, tillIndex);
        return root;
    }
}
