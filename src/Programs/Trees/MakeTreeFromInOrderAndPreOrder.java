package Programs.Trees;

import java.util.HashMap;
import java.util.Map;
import java.util.TreeMap;

public class MakeTreeFromInOrderAndPreOrder {
    public TreeNode buildTree(int[] preorder, int[] inorder) {

        Map<Integer, Integer> inMap = new HashMap<>();

        for (int i = 0; i < inorder.length; i++) inMap.put(inorder[i], i);

        TreeNode root = buildTree(preorder, 0, preorder.length-1, inorder, 0, inorder.length-1, inMap);

        return root;
    }
    public TreeNode buildTree(int[] preorder, int preStart, int preEnd,
                              int[] inorder, int inStart, int inEnd,
                              Map<Integer,Integer> inMap) {
        if (preStart>preEnd|| inStart>inEnd) return null;
        TreeNode root = new TreeNode(preorder[preStart]);

        int noOfElementsInLeftOfRootInInOrder = inMap.get(preorder[preStart]) - inStart;
        root.left = buildTree(preorder, preStart+1,preStart+noOfElementsInLeftOfRootInInOrder,
                inorder, inStart, inMap.get(preorder[preStart])-1, inMap);
        root.right = buildTree(preorder, preStart+noOfElementsInLeftOfRootInInOrder+1,preEnd,
                inorder, inMap.get(preorder[preStart])+1, inEnd, inMap);


        return root;
    }

}
