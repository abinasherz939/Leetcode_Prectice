package Programs.Trees;

import java.util.HashMap;

public class TreeFromInorderAndPostOrder {

    public TreeNode buildTree(int[] inorder, int[] postorder) {
        if (inorder == null || postorder == null || inorder.length != postorder.length)
            return null;
        HashMap<Integer, Integer> hm = new HashMap<Integer,Integer>();
        for (int i=0;i<inorder.length;++i)
            hm.put(inorder[i], i);
        return buildTreePostIn(inorder, 0, inorder.length-1, postorder, 0,
                postorder.length-1,hm);
    }

    private TreeNode buildTreePostIn(int[] inorder, int inStart, int inEnd, int[] postorder, int postStart, int postEnd,
                                     HashMap<Integer,Integer> inMap){
        if (postStart>postEnd || inStart>inEnd) return null;
        TreeNode root = new TreeNode(postorder[postEnd]);
        int rootIndexInInOreder = inMap.get(postorder[postEnd]);
        TreeNode leftchild = buildTreePostIn(inorder, inStart, rootIndexInInOreder-1,
                postorder, postStart, postStart+rootIndexInInOreder-inStart-1, inMap);
        TreeNode rightchild = buildTreePostIn(inorder,rootIndexInInOreder+1, inEnd,
                postorder, postStart+rootIndexInInOreder-inStart, postEnd-1, inMap);
        root.left = leftchild;
        root.right = rightchild;
        return root;
    }


}
