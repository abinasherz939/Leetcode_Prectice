package Programs.Leetcode;

import java.util.Arrays;



public class RemoveAnElement {
//    public int removeElement(int[] nums, int val) {
//        int noOfTimesItsDone =0;
//        int lastIndex = nums.length-1;
//        for (int i = 0; i < nums.length; i++) {
//            if (nums[i] == val) {
//                if (nums[lastIndex] ==val && i<lastIndex){
//                    lastIndex--;
//                }
//                if (lastIndex ==i) break;
//                int temp = nums[i];
//                nums[i] =nums[lastIndex];
//                nums[lastIndex] = temp;
//                lastIndex--;
//
//                noOfTimesItsDone++;
//            }
//        }
//        return noOfTimesItsDone;
//    }



    public int removeElement(int[] A, int val) {
        int m = 0;
        for(int i = 0; i < A.length; i++){
            if(A[i] != val){
                A[m++] = A[i];
            }
        }
        return m;
    }

    public int minimumSum(int num) {

        int[] array = new int[4];
        for (int i = 3; i >=0; i--) {
            array[i] = num%10;
            num/= 10;
        }
        Arrays.sort(array);
        return ((array[0]*10) + array[2]) + ((array[1]*10)+ array[3]);
    }


    public static void main(String[] args) {
        for (int i = 1000; i < 9999; i++) {
            System.out.println(i);
        }
    }

}
