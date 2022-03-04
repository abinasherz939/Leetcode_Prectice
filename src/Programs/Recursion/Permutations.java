package Programs.Recursion;

import java.util.*;

public class Permutations {
    public List<List<Integer>> permute(int[] nums) {
        List<List<Integer>> output = new ArrayList<>();
        boolean[] freq = new boolean[nums.length];
        List<Integer> list = new ArrayList<>();
        recurcivePermutations(nums, output, freq,list);
        return output;
    }
    void recurcivePermutations(int[] nums, List<List<Integer>> output , boolean[] freq, List<Integer> list){
        if (list.size() == nums.length) {
            output.add(new ArrayList<>(list));
            return;
        }
        for (int i = 0; i < nums.length; i++) {
            if (!list.contains(nums[i])) {
                list.add(nums[i]);
                freq[i] = true;
                recurcivePermutations(nums, output, freq, list);
                freq[i] = false;
                list.remove(list.size() - 1);
            }
        }
    }
}
