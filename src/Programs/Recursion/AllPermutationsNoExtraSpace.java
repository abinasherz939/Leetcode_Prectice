package Programs.Recursion;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;
import java.util.List;

public class AllPermutationsNoExtraSpace {

    public List<List<Integer>> permuteUnique(int[] nums) {
        HashSet<List<Integer>>   set = new HashSet<>();
        helperPermutation(nums, set, 0);
        return new ArrayList<>(set);
    }
    void helperPermutation(int[] nums, HashSet<List<Integer>> set, int index){
        if (index == nums.length){
            List<Integer> list = new ArrayList<>();
            for (int i : nums) {list.add(i);}
            set.add(new ArrayList<>(list));
            return;
        }

        for (int i = index; i < nums.length; i++) {
            swap(nums, i, index);
            helperPermutation(nums, set, index+1);
            swap(nums, i, index);
        }
    }
    void swap (int[] array, int index1, int index2){
        int temp = array[index1];
        array[index1] = array[index2];
        array[index2] = temp;
    }


}
