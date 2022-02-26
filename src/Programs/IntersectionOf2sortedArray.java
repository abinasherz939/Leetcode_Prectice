package Programs;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.Set;

public class IntersectionOf2sortedArray {
    public static void main(String[] args) {

    }
    public int[] intersection(int[] nums1, int[] nums2) {

        HashSet<Integer> res = new HashSet<>();
        HashSet<Integer> set = new HashSet<>();


//        removeDuplicates(nums2);
        for (int i :
                nums1) {
            set.add(i);
        }

        for (int i :
                nums2) {
            if (set.contains(i)){
                res.add(i);
            }
        }
        int[] result= new int[res.size()];

        int index = 0;
        for (int i :
             res) {
            result[index++] =i;
        }


        return result;

    }
//    public int[] removeDuplicates(int[] nums) {
//      HashSet<Integer> set = new HashSet<>();
//        for (int i : nums) {
//            set.add(i);
//        }
//
//        int[] result= new int[set.size()];
//
//        int index = 0;
//        for (int i : set) {
//            result[index++] =i;
//        }
//       return result;
    }



//class Solution {
//    public int[] intersection(int[] nums1, int[] nums2) {
//        Set<Integer> set = new HashSet<>();
//        Set<Integer> intersect = new HashSet<>();
//        for (int i = 0; i < nums1.length; i++) {
//            set.add(nums1[i]);
//        }
//        for (int i = 0; i < nums2.length; i++) {
//            if (set.contains(nums2[i])) {
//                intersect.add(nums2[i]);
//            }
//        }
//        int[] result = new int[intersect.size()];
//        int i = 0;
//        for (Integer num : intersect) {
//            result[i++] = num;
//        }
//        return result;
//    }
//}
