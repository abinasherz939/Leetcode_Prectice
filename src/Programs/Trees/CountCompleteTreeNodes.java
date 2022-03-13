package Programs.Trees;

public class CountCompleteTreeNodes {
    public int countNodes(TreeNode root) {
        if (root == null ) return 0;
        int leftHeight = leftHeight(root);
        int rightHeight = rightHeight(root);
        if (leftHeight == rightHeight) return (2<<leftHeight) -1;
        else return 1+countNodes(root.left)+ countNodes(root.right);
    }
    public int leftHeight(TreeNode root){
        if (root == null ) return 0;
        int count = 0;
        while (root != null){
            root = root.left;
            count++;
        }
        return count;
    }
    public int rightHeight(TreeNode root){
        if (root == null ) return 0;
        int count = 0;
        while (root != null){
            root = root.right;
            count++;
        }
        return count;
    }
}
