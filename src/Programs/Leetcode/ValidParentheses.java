package Programs.Leetcode;

import java.util.Stack;

public class ValidParentheses {

//    public boolean isValid(String s) {
//        Stack<Character> stack = new Stack<Character>();
//        for (char c : s.toCharArray()) {
//            if (c == '(')
//                stack.push(')');
//            else if (c == '{')
//                stack.push('}');
//            else if (c == '[')
//                stack.push(']');
//            else if (stack.isEmpty() || stack.pop() != c)
//                return false;
//        }
//        return stack.isEmpty();
//    }

    public int[] plusOne(int[] digits) {

        int intermediateNo = 0;
        int noOfDigits =0;

        for (int i = 0; i < digits.length; i++) {
            intermediateNo = intermediateNo*10 + digits[i];
        }
        intermediateNo++;

        for (int i = intermediateNo; i >0 ;i/=10)
            noOfDigits++;

        int[] result = new int[noOfDigits];
//        for (int i = 0; i < result.length; i++) {
//            result[i] = intermediateNo%10;
//            intermediateNo/=10;
//        }
        for (int i = result.length-1;i>=0; i--) {
            result[i] = intermediateNo%10;
            intermediateNo/=10;
        }

        return result;
    }

    public int countNoOfDigitsInANo(int number){
        int noOfDigits = 0;
        for (int i = number; i >0 ; i/=10) {
            noOfDigits++;
        }

        return noOfDigits;
    }







//    public boolean isValid(String s) {

//        boolean isTrue = false;
//        Stack<Character> stack = new Stack<>();
//        for (int i = 0; i < s.length(); i++) {
//            if (s.charAt(i) == '('){
//                stack.push('(');
//            }
//            if (s.charAt(i) == '{'){
//                stack.push('{');
//            }
//            if (s.charAt(i) == '['){
//                stack.push('[');
//            }
//            if (s.charAt(i) == ')'){
//                if (stack.peek() == ')'){
//                    stack.pop();
//                }
//            }
//            if (s.charAt(i) == '}'){
//                if (stack.peek() == '}'){
//                    stack.pop();
//                }
//            }
//            if (s.charAt(i) == ']'){
//                if (stack.peek() == ']'){
//                    stack.pop();
//                }
//            }
//        }
//        if (stack.isEmpty()){
//            isTrue=true;
//        }
//        return isTrue;
//    }

//    public int maxSubArray(int[] nums) {
//        int maxSum = 0;
//        int curentSum = 0;
//        for(int i=0;i<nums.length;i++){
//            curentSum += nums[i];
//            if (curentSum>maxSum){
//                maxSum=curentSum;
//            }
//            if (curentSum<0){
//               curentSum=0;
//            }
//        }
//        return maxSum;
//    }

    public int maxSubArray(int[] nums) {
        int maxSum = 0;
        int curentSum = 0;
        int maxElementForNegetiveArray = nums[0];
        for(int i=0;i<nums.length;i++){
            curentSum += nums[i];
            if (curentSum>maxSum){
                maxSum=curentSum;
            }
            if (curentSum<0){
                curentSum=0;
            }
        }
        boolean cheack =cheackIfAllElementsAreNegetive(nums);
        if (cheack==true){
            for (int i = 0; i < nums.length; i++) {
                if (nums[i]>maxElementForNegetiveArray) {
                    maxElementForNegetiveArray = nums[i];
                }
            }
        }
        if(nums.length== 1){
            maxSum= nums[0];
        }
        return maxSum;
    }
    public boolean cheackIfAllElementsAreNegetive(int[] array) {
        boolean allNegetive = true;
        for (int i = 0; i < array.length; i++) {
            if (array[i]>= 0){
                allNegetive =false;
            }
        }
        return allNegetive;
    }


    public void setZeroes(int[][] matrix) {

        int rows= matrix.length, colomns = matrix[0].length, col0 = 1, row0=1;

        for (int i = 0; i < rows; i++) {
            if (matrix[i][0]==0){
                col0= 0;
            }
        }
        for (int i = 0; i < colomns; i++) {
            if (matrix[0][i]==0){
                row0= 0;
            }
        }

        for (int i = 0; i < rows; i++) {
            for (int j = 0; j < colomns; j++) {

                if (matrix[i][j]==0){
                    matrix[0][j]=matrix[i][0]=0;
                }
            }
        }

        for (int i = rows-1; i > 0; i--) {
            for (int j = colomns-1; j >0 ; j--) {
                if (matrix[i][0]==0||matrix[0][j]==0){
                    matrix[i][j]=0;
                }
            }

        }
//        for (int i = rows-1; i >= 0; i--) {
//            for (int j = colomns-1; j >=0 ; j--) {
//                if (col0 ==0){
//                    matrix[i][0] =0;
//                }
//                if (row0 == 0){
//                    matrix[0][j] = 0;
//                }
//            }
//
//        }
        if (col0==0){
            for (int i = 0; i < colomns; i++) {
                matrix[i][0] =0;
            }
        }
        if (row0==0){
            for (int i = 0; i < rows; i++) {
                matrix[0][i] = 0;
            }
        }

    }
}
