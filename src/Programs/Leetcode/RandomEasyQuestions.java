package Programs.Leetcode;

public class RandomEasyQuestions {

    public boolean isUgly(int n) {

        while(n!= 1){
            if (n%2 == 0) n/=2;
            else if (n%3== 0) n/=3;
            else if (n%5 == 0) n/=5;
            else return false;
        }
        return true;
    }
    public ListNode oddEvenList(ListNode head) {
        if(head == null || head.next == null) return head;
        ListNode forwardPointer = head.next, backPointer = head;
        while(forwardPointer!= null){
            while(forwardPointer.val%2 == 0&&forwardPointer!= null) forwardPointer = forwardPointer.next;
            while((backPointer.val %2) != 0&& backPointer != null) backPointer = backPointer.next;
            ListNode temp = new ListNode(Integer.MIN_VALUE);
            temp.val = forwardPointer.val;
            forwardPointer.val = backPointer.val;
            backPointer.val = temp.val;
        }
        return head;
    }

    public int singleNumber1(int[] nums) {
        int result = 0;
        for (int i = 0 ; i < nums.length ; i++){
            result ^= nums[i];
        }

        return result;
    }

    public int singleNumber2(int[] nums) {

        int result = 0;

        for (int i = 0; i < 32; i++) {
            int sum = 0;
            for (int j = 0; j < nums.length; j++) {
                if ((nums[i] &(1<<i)) == 1){
                    sum++;
                    sum %= 3;
                }

            }

            if (sum != 0){
                result |= 1<<i;
            }
        }
        return result;


    }

//
//    public int[] singleNumber(int[] nums) {
//        // go through the array and XOR every element, for example, result = 6 (3^5)
//        int result = nums[0];
//        for(int i = 1; i < nums.length; i++){
//            result ^= nums[i];
//        }
//        // notice that 6^5 = 3, 6^3 = 5
//        // now how to find 3 and 5 from 6
//        int[] r = new int[2];
//        // find the lowest bit of the result
//        // let's say 6 (0110), -6 = 1010  0110 & 1010 = 0010
//        int lowbit = result & -result;
//        // since this bit from the result is 1, we can be sure that
//        // a & lowbit and b & lowbit have different result
//        for(int n : nums){
//            if((n & lowbit) == 0) r[0] ^= n;
//            else r[1] ^=n;
//        }
//        return r;
//    }









    public int[] singleNumber(int[] nums) {

        int [] result = new int[2];
        int exorOfAll = 0;
        for (int i : nums) exorOfAll ^= i;
        int lowBit = exorOfAll & -exorOfAll; // (~exorOfAll+1) == -exorofAll // 2's compliment;
        for (int i : nums) {
            if ((i & lowBit) == 0) result[0] ^= i;
            else result[1] ^= i;
        }
        return result;
    }








}
