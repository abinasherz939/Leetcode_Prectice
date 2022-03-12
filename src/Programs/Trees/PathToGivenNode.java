package Programs.Trees;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class PathToGivenNode {
    public int[] solve(TreeNode root, int value) {
        List<Integer> list = new ArrayList<>();

        recurciveHelper(root, value, list);


        int [] array = new int[list.size()];
        for (int i = 0; i < array.length; i++) {
            array[i] = list.get(i);
        }
        return array;

    }
    boolean recurciveHelper(TreeNode root, int value , List<Integer> list){
        if (root == null) return false;

        list.add(root.val);
        if (root.val == value) return true;
        if (recurciveHelper(root.left, value, list)||recurciveHelper(root.right, value, list)) return true;
        list.remove(list.size()-1);

        return false;
    }
}
