package Programs.BST;

import javax.print.DocFlavor;

public class BSTFromPreorder {

    public TreeNode bstFromPreorder(int[] preorder) {

        return bstFromPreorder(preorder, Integer.MAX_VALUE, new int[]{0});
    }
    public TreeNode bstFromPreorder(int[] preorder, int upperBound, int[] index){
        if(index[0] == preorder.length) return null;
        if (preorder[index[0]] > upperBound ) return null;
        TreeNode root = new TreeNode(preorder[index[0]++]);

        root.left =  bstFromPreorder(preorder, root.val, index);
        root.right =  bstFromPreorder(preorder, upperBound, index);

        return root;
    }
}
