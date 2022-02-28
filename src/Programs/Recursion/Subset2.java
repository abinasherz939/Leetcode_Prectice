package Programs.Recursion;

import org.w3c.dom.ls.LSInput;

import java.sql.ClientInfoStatus;
import java.util.ArrayList;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;

public class Subset2 {
    HashSet<List<Integer>> set = new HashSet<>();
    public List<List<Integer>> subsetsWithDup(int[] nums) {
        ArrayList<Integer> list = new ArrayList<>();
        recurciveFunction(nums, 0,list);
        return new ArrayList<>(set);
    }
    void recurciveFunction(int[] nums, int index, ArrayList<Integer> list){
        if (index == nums.length){
            set.add(new ArrayList<>(list));
            return;
        }
        recurciveFunction(nums, index+1, list);
        list.add(nums[index]);
        recurciveFunction(nums, index+1, list);
        list.remove(list.size()-1);
    }
}
