package Programs.Leetcode;

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
}
