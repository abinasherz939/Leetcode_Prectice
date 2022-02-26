package Programs.Leetcode;

import java.util.ArrayList;
import java.util.List;

public class PascalsTriangle {
    public static void main(String[] args) {
//        new Solution().generate(5);
    }
}



//class Solution {
//    public List<List<Integer>> generate(int numRows) {
//
//        List<List<Integer>> result = new ArrayList<>();
//        List<Integer> prev = new ArrayList<>();
//        List<Integer> current = new ArrayList<>();
//
//        for (int i = 0; i < numRows; i++) {
//            for (int j = 0; j < numRows; j++) {
//                if (j==0 || j==numRows-1){
//                    current.add(1);
//                }
//                else {
//                    current.add(prev.get(j-1)+ prev.get(j));
//                }
//            }
//            prev =current;
//            result.add(current);
//        }
//        return result;
//    }
//
//    public List<List<Integer>> generate(int numRows)
//    {
//        List<List<Integer>> allrows = new ArrayList<List<Integer>>();
//        ArrayList<Integer> row = new ArrayList<Integer>();
//        for(int i=0;i<numRows;i++)
//        {
//            row.add(0, 1);
//            for(int j=1;j<row.size()-1;j++)
//                row.set(j, row.get(j)+row.get(j+1));
//            allrows.add(new ArrayList<Integer>(row));
//        }
//        return allrows;
//
//    }
////
//}


class Solution1 {
    public void nextPermutation(int[] nums) {

        boolean happened = false;
        if (nums.length==0||nums.length==1){
            return;
        }
        int index1=0, index2 =0;
        for (int i = nums.length-2; i>=0; i--) {

            if (nums[i]<nums[i+1]){
                index1 =i;
                happened = true;
                break;
            }
        }
        for (int i = nums.length-1 ;i>=0; i++) {
            if (nums[i]>nums[index1]){
                index2 =i;

                break;
            }
        }
        swap(index1,index2 , nums);
        reverse(index1+1, index2,nums);

        if (!happened){
            reverse(index1, nums.length-1,nums );
        }

    }

    void swap(int index1, int index2, int[] array){
        int temp;
        temp= array[index1];
        array[index1]= array[index2];
        array[index2]=temp;
    }
    void reverse(int from, int till, int[] array){
        for (int i = from; i < till; i++) {
            if (from==till) return;
            swap(from++,till--, array);
        }
    }


    public int maxProfit(int[] prices) {
        int maxProfit = 0, minimalElement = Integer.MAX_VALUE;
        for (int i = 0; i < prices.length; i++) {
          if (prices[i]< minimalElement){
              minimalElement = prices[i];
          }
          maxProfit = Math.max(prices[i] - minimalElement, maxProfit);

        }
        return maxProfit;
    }

}