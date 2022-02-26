package com.company;


import org.jetbrains.annotations.NotNull;

import java.util.HashMap;
import java.util.HashSet;

class Solution {
    public static void main(String[] args) {


    }
    public int[] twoSum(int[] nums, int target) {
        int[] result ={0,0};
        HashSet<Integer> set = new HashSet<>();
        for (int i :
                nums) {
            set.add(i);
        }
        for (int i = 0; i < nums.length; i++) {
            int complement = target - nums[i];
            if (set.contains(complement)){
                result[0]= i;
            }
        }
        int complement = target - nums[result[0]];
        for (int i = 0; i < nums.length; i++) {
            if (nums[i] == complement){
                result[1] = i;
            }
        }
        return result;
    }
}