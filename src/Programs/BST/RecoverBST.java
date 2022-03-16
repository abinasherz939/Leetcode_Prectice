package Programs.BST;

import com.sun.source.tree.Tree;

public class RecoverBST {
    TreeNode first;
    TreeNode middle;
    TreeNode last;
    TreeNode prev;
    public void recoverTree(TreeNode root) {

        first = middle = last = null;
        prev = new TreeNode(Integer.MIN_VALUE);
        inorder(root);
        if (last != null) swap(first, last);
        else swap(first, middle);

    }
    public void swap(TreeNode node1, TreeNode node2){

        int temp = node1.val;
        node1.val = node2.val;
        node2.val = temp;
    }
    public void inorder(TreeNode root){
        if (root == null) return;

        inorder(root.left);
        if (root.val < prev.val){
            if (first == null){
                first = prev;
                middle = root;
            }else {
                last = root;
            }
        }
        prev = root;

        inorder(root.right);

    }
}
