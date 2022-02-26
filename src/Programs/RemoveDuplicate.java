package Programs;

import java.util.Iterator;
import java.util.LinkedHashSet;

public class RemoveDuplicate {
    public static void main(String[] args) {
//        LinkedHashSet<Integer> set = new LinkedHashSet<>();


    }
    public int removeDuplicates(int[] nums) {
        int i=0,k =0;

        while (i< nums.length) {
         if (nums[i]==nums[k]){
             i++;
         }
         else {
             nums[++k] = nums[i];
         }
        }
        return ++k;
    }
    public static boolean contains (int[] nums,int cheackIfPresent){
        boolean isPresent = false;
        for (int i = 0; i < nums.length; i++) {
            if (nums[i] == cheackIfPresent){
                isPresent = true;
            }
        }

        return isPresent;
    }

}
