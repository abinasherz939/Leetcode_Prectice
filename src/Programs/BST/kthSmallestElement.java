package Programs.BST;

import java.util.ArrayList;
import java.util.List;

public class kthSmallestElement {
    public int kthSmallestNaiveSolution(TreeNode root, int k) {
        List<Integer> inOrder = new ArrayList<>();
        findInOrder1(root, inOrder);
        return inOrder.get(k-1);
    }

    void findInOrder1(TreeNode root, List<Integer> list){

        if (root == null) return;

        findInOrder1(root.left, list);
        list.add(root.val);
        findInOrder1(root.right, list);

    }






    int count = 0;
    int val = 0;
    public int kthSmallest(TreeNode root, int k) {
        findInOrder(root,count, k );
        return val ;
    }

    void   findInOrder(TreeNode root, int count , int k){

        if (root == null) return ;

        findInOrder(root.left, count, k);
        if (count == k) val = root.val;
        findInOrder(root.right, count , k);

    }
}
