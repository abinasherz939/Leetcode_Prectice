package Programs.BST;

public class DeleteNodeInBST {
    public TreeNode deleteNode(TreeNode root, int key) {

        if (root == null) return null;
        if (root.val == key) return delete(root);

        TreeNode dummyRoot = root;
        while (root!= null){

            if (root.val> key){
                if (root.left !=null  &&root.left.val == key ){
                    root.left = delete(root.left);
                    break;
                }
                else root = root.left;
            }else {
                if (root.right !=null  &&root.right.val == key ){
                    root.right = delete(root.right);
                    break;
                }
                else root = root.right;

            }
        }
        return dummyRoot;
    }
    TreeNode delete (TreeNode root){//delete works fine;

        if (root == null) return null;

        TreeNode leftNode = root.left;
        TreeNode rightNode = root.right;

        if (leftNode == null) return rightNode;
        else if (rightNode == null) return leftNode;
        else {
            while (leftNode.right != null) leftNode = leftNode.right;
            leftNode.right = rightNode;
            return root.left;
        }
    }
}
