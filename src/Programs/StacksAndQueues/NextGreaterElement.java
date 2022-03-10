package Programs.StacksAndQueues;

import java.util.HashMap;
import java.util.Stack;

public class NextGreaterElement {


    public int[] nextGreaterElement1(int[] nums1, int[] nums2) {

        int [] ans = new int[nums1.length];
        HashMap<Integer, Integer> hashMap = new HashMap<>();
        int[] nextGreaterElement = new int[nums2.length];
        Stack<Integer> stack = new Stack<>();

        for (int index = nums2.length-1; index >=0 ; index--) {
            while (!stack.isEmpty() &&stack.peek()<nums2[index]) {
                stack.pop();
            }
            if (stack.isEmpty()){
                nextGreaterElement[index] = -1;
                stack.add(nums2[index]);
            }
            else {
                nextGreaterElement[index] = stack.peek();
                stack.add(nums2[index]);
            }
        }
        for (int i = 0; i < nums2.length; i++) {
            hashMap.put(nums2[i], nextGreaterElement[i]);
        }
        for (int i = 0; i < nums1.length; i++) {
            ans[i] = hashMap.get(nums1[i]);
        }
        return ans;
    }

    public int[] nextGreaterElements(int[] nums) {

        int [] nextGreaterElements = new int[nums.length];
        Stack<Integer> stack = new Stack<>();
        int arraySize = nums.length;
        for (int i = 2*arraySize-1; i >=0; i--) {
            while (!stack.isEmpty()&& stack.peek()<=nums[i%arraySize]) stack.pop();
            if (i<arraySize){
                if (stack.isEmpty()) nextGreaterElements[i%arraySize] = -1;
                else nextGreaterElements[i%arraySize] = stack.peek();
            }
            stack.push(nums[i%arraySize]);
        }
        return nextGreaterElements;
    }


//    public int[] nextGreaterElements(int[] nums) {
//        int n = nums.length;
//        int nge[] = new int[n];
//        Stack<Integer> st = new Stack<>();
//        for(int i = 2*n-1;i>=0;i--) {
//            while(st.isEmpty() == false && st.peek() <= nums[i%n]) {
//                st.pop();
//            }
//
//            if(i<n) {
//                if(st.isEmpty() == false) nge[i] = st.peek();
//                else nge[i] = -1;
//            }
//
//            st.push(nums[i%n]);
//        }
//        return nge;
//    }



    public int[] dailyTemperatures(int[] temperatures) {
        int arraySize = temperatures.length;
        int[] ans = new int[arraySize];
        Stack<Integer> stack = new Stack<>();
        HashMap<Integer, Integer> map = new HashMap<>();

        for (int index = arraySize-1; index >=0; index--) {
            while (!stack.isEmpty()&& stack.peek() <temperatures[index]) stack.pop();

            if (!stack.isEmpty() && stack.peek() > temperatures[index]) ans[index] = stack.peek();
            else ans[index] = -1;
            stack.push(temperatures[index]);
        }
        for (int i = 0; i < temperatures.length; i++) map.put(temperatures[i],i);

        int [] result =  new int[temperatures.length];
        for (int i = 0; i < ans.length; i++) {

            if (ans[i] != -1)
            result[i] = map.get(ans[i]) - i ;
            else ans[i] = 0;
        }
        return result;
    }

}
