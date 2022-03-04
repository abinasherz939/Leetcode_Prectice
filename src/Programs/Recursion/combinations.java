package Programs.Recursion;

import com.sun.source.tree.IfTree;

import java.util.*;
public class combinations {
    public List<List<Integer>> combine(int n, int k) {

        List<List<Integer>> output = new ArrayList<>();
        List<Integer> list = new ArrayList<>();
        int[] array = new int[n];
        for (int i = 0; i < n; i++) array[i] = i + 1;
        combinationRecursion(array, output, k, 0, list);
        return output;
    }

    void combinationRecursion(int[] array, List<List<Integer>> output, int k, int index, List<Integer> list) {
        if (list.size() == k) {
            Collections.sort(list);
            output.add(new ArrayList<>(list));
            return;
        }
        if (index == array.length) return;
        list.add(array[index]);
        combinationRecursion(array, output, k, index + 1, list);
        list.remove(list.size() - 1);
        combinationRecursion(array, output, k, index + 1, list);
    }
}
