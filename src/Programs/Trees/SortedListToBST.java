package Programs.Trees;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;

public class SortedListToBST {
    public class ListNode {
      int val;
      ListNode next;
      ListNode() {}
      ListNode(int val) { this.val = val; }
      ListNode(int val, ListNode next) { this.val = val; this.next = next; }
    }

    public TreeNode sortedListToBST(ListNode head) {

        if (head == null) return null;
        List<Integer> list = new ArrayList<>();
        while (head != null){
            list.add(head.val);
            head = head.next;
        }
        int [] array = new int[list.size()];
        for (int i = 0; i < list.size(); i++) {
            array[i] = list.get(i);
        }
        return makeAHeightBalancedBinaryTree(array, 0, list.size()-1);

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
