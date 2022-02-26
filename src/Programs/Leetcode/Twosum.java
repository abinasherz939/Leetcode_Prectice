package Programs.Leetcode;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;
import java.util.List;

public class Twosum {

    public static void main(String[] args) {
        Twosum obj = new Twosum();
        int[] nums = {0,2,1,5,3,4};


//        for (int i :
//                obj.buildArray(nums)) {
//
//            System.out.println(i);
//        }
    }


    public int[] intersection(int[] nums1, int[] nums2) {

        HashSet<Integer> set1 = new HashSet<>();
        ArrayList<Integer> array = new ArrayList<>();
        

        for (Integer i :
                nums1) {
            set1.add(i);
        }

        for (int i = 0; i < nums2.length; i++) {
            if (set1.contains(nums1[i])){
                array.add(nums2[i]);
            }


        }
        int[] res = new int[array.size()];
        for (int i = 0; i < nums2.length; i++) {
            
        }


        return res;
    }
}