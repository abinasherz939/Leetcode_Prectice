package Programs.Leetcode;

import org.w3c.dom.ls.LSOutput;

import java.util.*;

public class SortColours {
}

class Solution {
    public void sortColors(int[] a) {
        int low = 0, mid = 0, high = a.length - 1;
        while (mid <= high) {
            if (a[mid] == 0){
                swap(mid, low, a);
                low++;
            }else if (a[mid] == 1){
                mid++;
            }else{
                swap(high, mid, a);
                high--;
            }
        }
    }
    public void swap(int index1, int index2, int[] array) {
        int temp = array[index1];
        array[index1] = array[index2];
        array[index2] = temp;
    }

    public int[] getConcatenation(int[] nums) {

        int x = nums.length;
        int[] array = new int[2*nums.length];

        for (int i = 0; i < nums.length; i++) {
            array[i] = nums[i];
            array[i+ x] = nums[i];
        }
        return array;
    }

    public int[] runningSum(int[] nums) {

        int[] array = new int[nums.length];
        int sum = 0;
        for (int i = 0; i < nums.length; i++) {
            sum += nums[i];
            array[i] = sum;
        }
        return array;
    }


    public int maximumWealth(int[][] accounts) {
        int richest= Integer.MIN_VALUE;

        for (int i = 0; i < accounts.length; i++) {
            int max = 0;
            for (int j = 0; j < accounts[0].length; j++) {
                max += accounts[i][j];
                richest = Math.max(max, richest);
            }
        }
        return richest;
    }

    public int finalValueAfterOperations(String[] operations) {

        int theValue = 0;
        for (int i = 0; i < operations.length; i++) {
            if (operations[i].charAt(1) == '+') theValue++;
            else theValue--;
        }
        return theValue;
    }
    public void rotate(int[][] matrix) {

        for (int i = 0; i < matrix.length; i++) {//transpose 2d matrix
            for (int j = 0; j < matrix[0].length; j++) {
                if (i<=j){
                    swap2D(i,j,j,i,matrix);
//                    matrix[i][j]=matrix[j][i];
                }
            }
            int pointerlow =0, pointerHigh= matrix[0].length-1;
            while(pointerlow<=pointerHigh){
                swap2D(i, pointerlow++, i,pointerHigh--,matrix);
            }

        }


    }
    public void swap2D(int index1i, int index1j,int index2i, int index2j, int[][] array) {
        int temp = array[index1i][index1j];
        array[index1i][index1j] = array[index2i][index2j];
        array[index2i][index2j] = temp;
    }
;

    public void merge(int[][] intervals) {

        Arrays.sort(intervals, new Comparator<int[]>() {
            @Override
            public int compare(int[] o1, int[] o2) {
                if (o1[0]<o2[0])return -1;
                if (o1[0]>o2[0]) return +1;
                return 0;
            }
        });

        List<List<Integer>> list = new ArrayList<>();
        for (int i = 0; i < intervals.length-2; i++) {
            List<Integer> tempList = null;

            while (intervals[i][1]>intervals[i+1][0]){
//                tempList.add(new int[intervals[]] )
            }

        }


//        return list.stream().toArray();
    }



    public void merge(int[] nums1, int m, int[] nums2, int n) {

        int tail1= m-1, tail2= n-1, finished = m+n-1;
        while(tail2>=0&&tail1>=0){
            if(nums1[tail1] >= nums2[tail2]){
                swap(nums1, finished--, nums1, tail1--);
            }
            else {
                swap(nums1,finished--, nums2, tail2--);
            }
        }
        while (tail2>=0){
            swap(nums1, finished--, nums2, tail2--);
        }
    }
    public void swap (int[] a, int index1, int[] b, int index2){
        int temp = a[index1];
        a[index1] = b[index2];
        b[index2] = temp;
    }


    public int[] shuffle(int[] nums, int n) {

        int[] res = new int[nums.length];

        for (int i = 0; i < n; i= i+2) {
//            res[i] =
        }


        return res;
    }



    public boolean isIdealPermutation(int[] nums) {

        int beforeMax = Integer.MIN_VALUE;
        for (int i = 0; i < nums.length - 2; i++) {
            if (nums[i+1]<beforeMax&&nums[i]<nums[i+1]) return false;
            beforeMax = Math.max(nums[i], beforeMax);

        }
        return true;
    }


    public boolean searchMatrix1(int[][] matrix, int target) {
//here we are tring to take an imaginary index in a 2D array;
        int low = 0;
        int high = ((matrix.length)*(matrix[0].length))-1;

        while (low<=high){
            int mid = low + (high - low)/2;
            if (matrix[mid/matrix[0].length][mid%matrix[0].length]== target){
                return true;
            }
            else if (matrix[mid/matrix[0].length][mid%matrix[0].length]> target){
                high = mid -1;
            }
            else
            {
                low = mid+1;
            }
        }
        return false;
    }

    public double myPow(double x, int n) {
        double ans = 1.0;
        long positivePower = n;
        if (n< 0) positivePower = -1*n;

        while (positivePower>0){
            if (positivePower%2 == 0){
                x = x*x;
                positivePower=positivePower/2;
            } else {
                ans = x* ans;
                positivePower = positivePower-1;
            }
        }
        if(n == Integer.MIN_VALUE) return 0.0;

        if (n<0) return 1/ans;
        return  ans;
    }





    public int majorityElement1(int[] nums) {
        int currentMajority = 0;
        int count = 0;

        for (int i = 0; i < nums.length-1; i++) {
            if (count == 0){
                currentMajority = nums[i];
                count++;
            }else {
                if (nums[i] == currentMajority)count++;
                else count--;
            }
        }
        return currentMajority;
    }

//
//            [3,2,3]
//            [1]
//            [1,2]
//            [2,2]
//            [3,3,4]
//            [2,2,1,3]

    public List<Integer> majorityElement(int[] nums) {

        List<Integer> majorityElementlist = new ArrayList<>();
        int majorityElement1 = Integer.MIN_VALUE, majorityElement2 = Integer.MIN_VALUE;
        int countForElement1 =0, countForElement2 =0;
        for (int i = 0; i < nums.length; i++) {

            if(nums[i] == majorityElement1) countForElement1++;
            else if (nums[i] == majorityElement2) countForElement2++;
            else if (countForElement1 ==0) {majorityElement1 = nums[i];countForElement1++;}
            else if (countForElement2 ==0) {majorityElement2 = nums[i];countForElement2++;}
            else {countForElement1--;countForElement2--;}

        }
        int count1 = 0, count2 =0;
        for (int i :
                nums) {
            if (i == majorityElement1) count1++;
            if (i == majorityElement2) count2++;
        }


        if (count1>nums.length/3)majorityElementlist.add(majorityElement1);
        if (count2 > nums.length/3)majorityElementlist.add(majorityElement2);
        return majorityElementlist;
    }
//
// if (countForElement2!=0 && countForElement1 != 0){
//        if (majorityElement1 == nums[i]){
//            countForElement1++;
//        }
//        else if (majorityElement2 == nums[i]) countForElement2++;
//        else {
//            countForElement1--;countForElement2--;
//        }
//    }
//           else {
//        if (countForElement1==0){
//            majorityElement1 = nums[i];
//
//            countForElement1++;
//        }
//        else {
//            majorityElement2 = nums[i];
//            countForElement2++;
//        }
//    }
    public boolean searchMatrix(int[][] matrix, int target) {
        int rows= matrix.length-1, coloumns = matrix[0].length-1;
        int pointerForRows = 0, pointerForColoumns = coloumns;
        while (pointerForRows<= rows|| pointerForColoumns>=0){
            if (matrix[pointerForRows][pointerForColoumns] == target) return true;
            else if (matrix[pointerForRows][pointerForColoumns]>target) pointerForColoumns--;
            else pointerForRows++;
        }
        return false;
    }






    public int reversePairs(int[] nums) {
        int count =0;
        for (int i = 0; i < nums.length - 1; i++) {
            for (int j = i; j < nums.length; j++) {
                if (nums[i]>2*nums[j]) count++;
            }
        }
        return count;
    }





    public double findMedianSortedArrays(int[] nums1, int[] nums2) {
        int[] mergedArray = new int[nums1.length+ nums2.length];
        int pointersFor1stArray =0, pointerFor2ndArray = 0, indexOfMergedArray = 0;
        while(pointersFor1stArray <nums1.length-1 && pointerFor2ndArray < nums2.length-1){
            if (nums1[pointersFor1stArray] < nums2[pointerFor2ndArray])
                mergedArray[indexOfMergedArray++] = nums1[pointersFor1stArray++];
            else mergedArray[indexOfMergedArray++] = nums2[pointerFor2ndArray++];
        }
        while (pointersFor1stArray <nums1.length-1)
            mergedArray[indexOfMergedArray++] = nums1[pointersFor1stArray++];
        while (pointerFor2ndArray < nums2.length-1)
            mergedArray[indexOfMergedArray++] = nums2[pointerFor2ndArray++];

        return findMedian(mergedArray);
    }
    public double findMedian(int[] array){
        if ((array.length)%2 == 0)//even
        return (double) (array[array.length/2]+ array[(array.length/2) -1])/2;
        else return (double)array[array.length/2];
    }

      public class ListNode {
          int val;
          ListNode next;
          ListNode() {}
         ListNode(int val) { this.val = val; }
          ListNode(int val, ListNode next) { this.val = val; this.next = next; }
      }

//      public ListNode reverseList(ListNode head) {
//        if ( head == null|| head.next == null){return head;}
//        ListNode prevNode= null, nextNode = head.next, currentNode = head;
//        while (currentNode != null){
//            currentNode.next = prevNode;
//            prevNode = currentNode;
//            currentNode = nextNode;
//            if (nextNode == null) continue;
//            nextNode = nextNode.next;
//        }
//        return prevNode;
//      }

    public ListNode middleNode(ListNode head) {

        ListNode fastPointer= head,slowPointer= head;
        while (fastPointer != null&& fastPointer.next!= null){
            fastPointer = fastPointer.next.next;
            slowPointer = slowPointer.next;
        }
        return slowPointer;
    }

    public void print(ListNode head){
        while (head!=null){
            System.out.print("["+ head.val+", ");
            System.out.println("]");
            head = head.next;
        }
    }

    public ListNode mergeTwoLists(ListNode list1, ListNode list2) {
        // taking Pointers for both the linked lists;//the code was compiled sucessfully;
        ListNode pointerOne = list1, pointerTwo = list2, result;
        if (list1 == null) return list2;
        if (list2 == null) return list1;
        if (pointerOne.val <=pointerTwo.val) result = list1;
        else result = list2;
        while (pointerOne != null && pointerTwo != null){
            ListNode temp = new ListNode();
            while (pointerOne != null && pointerOne.val <= pointerTwo.val){
                temp = pointerOne;
                pointerOne = pointerOne.next;
            }
            temp.next = pointerTwo;

            // swap
            ListNode forSwaping;
            forSwaping = pointerOne;
            pointerOne = pointerTwo;
            pointerTwo = forSwaping;
        }
        return result;
    }



    public ListNode deleteMiddle(ListNode head) {
        if (head.next == null)return null;
        ListNode midNode = middleNode(head);
        if (midNode.next == null){
            head.next = null;
        }
        else {
            int temp = midNode.val;
            midNode.val = midNode.next.val;
            midNode.next.val = temp;
            midNode.next = midNode.next.next;
        }
        return head;
    }

//    public ListNode removeElements(ListNode head, int val) {
//        ListNode itr = head;
//        if (itr.val == )
//
//
//    }

 //   public ListNode addTwoNumbers(ListNode l1, ListNode l2) {
//
//        ListNode result, addElement;
//        ListNode reversedLinkedListL1 = reverseList(l1);
//        ListNode reversedLinkedListL2 = reverseList(l2);
//        long no1 = 0, no2 = 0;
//        while (reversedLinkedListL1 != null){
//            no1 = (no1*10) +reversedLinkedListL1.val;
//            reversedLinkedListL1 =reversedLinkedListL1.next;
//        }
//        while (reversedLinkedListL2 != null){
//            no2 = no2*10 + reversedLinkedListL2.val;
//            reversedLinkedListL2 =reversedLinkedListL2.next;
//        }
//        long resultNo = no1 + no2;
//        while (resultNo != 0){
//
//
//            resultNo = resultNo/10;
//        }
//
//
////        no2 = (no2*10) + reversedLinkedListL2.val;resultNo
//
//
//        return result;
 //   }

    public ListNode reverseList(ListNode head) {
        if ( head == null|| head.next == null){return head;}
        ListNode prevNode= null, nextNode = head.next, currentNode = head;
        while (currentNode != null){
            currentNode.next = prevNode;
            prevNode = currentNode;
            currentNode = nextNode;
            if (nextNode == null) continue;
            nextNode = nextNode.next;
        }
        return prevNode;
    }



    public ListNode addTwoNumbers(ListNode l1, ListNode l2) {
        ListNode dummy = new ListNode(0);
        ListNode temp = dummy;
        int carry= 0;
        while (l1 != null|| l2!= null|| carry == 1){
            int sum  = 0;
            if (l1!= null){sum += l1.val;l1 = l1.next;}
            if (l2!= null){sum += l2.val;  l2 = l2.next;}

            sum += carry;
            carry = sum/10;
            ListNode node = new ListNode(sum%10);
            temp.next = node;
            temp = temp.next;
        }
        return dummy.next;
    }


    public ListNode removeNthFromEnd(ListNode head, int n) {
        ListNode dummyNode = new ListNode(0);
        dummyNode.next =head;
        ListNode forwardPointer = dummyNode, backPointer = dummyNode;
        for (int i = 0; i < n; i++) {
            forwardPointer = forwardPointer.next;
        }
        while (forwardPointer.next != null){
            forwardPointer = forwardPointer.next;
            backPointer = backPointer.next;
        }
        backPointer.next = backPointer.next.next;
        return head;// refer leetcode if probleam solved it there
    }


    public ListNode getIntersectionNode(ListNode headA, ListNode headB) {
        if (headA == null || headB == null) return null;
        ListNode pointerOne = headA, pointerTwo = headB;
        while (pointerOne!= pointerTwo){
            pointerOne = (pointerOne == null)?(headB):(pointerOne.next);
            pointerTwo = (pointerTwo == null)?(headA):(pointerTwo.next);
        }
        return pointerOne;
    }


    public ListNode swapNodes(ListNode head, int k) {
        ListNode start = new ListNode(0, head);
        ListNode forwardPointer = start, kFromLast = start, kFromBegining = start;
        for (int i = 0; i < k; i++) {
            forwardPointer = forwardPointer.next;
        }
        while (forwardPointer!=null){
            forwardPointer = forwardPointer.next;
            kFromLast = kFromLast.next;
        }
        for (int i = 0; i < k; i++) {
            kFromBegining = kFromBegining.next;
        }
        int temp = kFromBegining.val;
        kFromBegining.val = kFromLast.val;
        kFromLast.val = temp;
        return head;
    }


//    public ListNode swapPairs(ListNode head) {
//        if (head == null|| head.next == null) return head;
//        ListNode start = new ListNode(0, head);
//        ListNode forwardPointer = start.next.next, backPointer = start.next;
//        while (forwardPointer.next != null&& backPointer !=null){
//            int temp = forwardPointer.val;
//            forwardPointer.val = backPointer.val;
//            backPointer.val = temp;
////            forwardPointer = forwardPointer.next.next;
//            backPointer=  forwardPointer.next;
//            forwardPointer = backPointer.next;
//        }
//        return head;
//    }


    public ListNode swapPairs(ListNode head) {
        if (head == null|| head.next == null) return head;
//        ListNode start = new ListNode(0, head);
        ListNode current  = head;
        while (current!=null&& current.next != null){
            int temp = current.val;
            current.val = current.next.val;
            current.next.val = temp;
            current = current.next.next;
        }
        return head;
    }


    public int pairSum(ListNode head) {
        if (head == null) return 0;
        ListNode itr = head;
        HashMap<Integer, Integer> hashMap = new HashMap<>();
        int maxTwinSum = Integer.MIN_VALUE, length = 0;
        while (itr!= null) {itr=  itr.next;length++;}
        itr = head;
        for (int i = 0; i < length; i++){
            hashMap.put(i,itr.val);
            itr = itr.next;
        }

        for (int i = 0; i < length/2; i++) {
            maxTwinSum = Math.max((hashMap.get(i)+hashMap.get(length-1-i)),maxTwinSum);
        }
        return maxTwinSum;
    }


    public boolean isPalindrome(ListNode head) {
        if (head == null|| head.next ==null) return true;
        ListNode itr = head;int length = 0;
        HashMap<Integer, Integer> hashMap = new HashMap<>();
        while (itr!= null) {itr=  itr.next;length++;}
        itr = head;
        for (int i = 0; i < length; i++){
            hashMap.put(i,itr.val);
            itr = itr.next;
        }
        for (int i = 0; i < length/2; i++) {
            if (hashMap.get(i) != hashMap.get(length-1-i)) return false;
        }
        return true;
    }

    public boolean hasCycle(ListNode head) {
        if (head == null|| head.next == null) return false;
        ListNode start = new ListNode(0,head);
        ListNode fastPointer = start.next.next, slowPointer = head;
        while (fastPointer!= null && slowPointer!= null&& fastPointer.next != null){
            if (fastPointer == slowPointer) return true;
            fastPointer = fastPointer.next.next;
            slowPointer = slowPointer.next;
        }
        return false;
    }

    public ListNode detectCycle(ListNode head) {

        if (head == null|| head.next == null) return null;
        if (head == head.next) return head;
//        ListNode start = new ListNode(0,head);
        ListNode fastPointer = head, slowPointer = head, entryPointer = head;
        while (fastPointer!= null && fastPointer.next != null){
            fastPointer = fastPointer.next.next;
            slowPointer = slowPointer.next;
            if (fastPointer == slowPointer) break;
        }
        if (fastPointer == null) return null;
        else {
            while (slowPointer != entryPointer){
                slowPointer = slowPointer.next;
                entryPointer = entryPointer.next;
            }
            return entryPointer;
        }
    }

//        if (slowPointer == fastPointer && slowPointer != null) return beforeSlowPointer;


//            ListNode itr = start;
//        int length = 0;
//        while (itr.next != fastPointer) {
//            itr =itr.next;
////            if (itr.next == fastPointer) return itr;
//        }
//        if (itr.next == fastPointer) return itr;


    public void moveZeroes(int[] nums) {
        int [] array = new int[nums.length];
        int ptr1 = 0, ptr2 = nums.length-1;
        for (int i = 0; i < nums.length; i++) {
            if (nums[i] == 0) array[ptr2--] = 0;
            else array[ptr1++] = nums[i];
        }
        for (int i = 0; i < nums.length; i++) {
            nums[i] = array[i];
        }
    }









    public ListNode reverseKGroup(ListNode head, int k) {
        if (head == null || k== 1)return head;

        ListNode dummy = new ListNode(0, head);
        ListNode current = head, next= dummy, prev = dummy;
        int length = 0;

        while (current != null) {current = current.next;length++;}
        current = dummy;
        while (length>= k){
            current = prev.next;
            next = current.next;
            for (int i = 1; i < k; i++) {
                current.next = next.next;
                next.next = prev.next;
                prev.next = next;
                next = current.next;
            }
            prev = current;
            length = length-k;
        }
        return dummy.next;





    }  //not working
//    public ListNode rotateRight(ListNode head, int k) {
//        if (head == null|| k == 0) return head;
//
//        ListNode dummy = new ListNode(0, head);
//        ListNode itr = dummy;
//        int length = 0;
//        while (itr!= null){
//            length++;
//            itr = itr.next;
//        }
//
//        k = k % length;
//        k = length - k;
//
//        itr.next = head;
//
//        itr = dummy;
//        if (itr.next.next != null){
//
//            for (int i = 0; i < k; i++) {
//                itr = itr.next;
//            }
//            itr.next = null;
//
//        }
//
//
//        return dummy.next;
//    }
    public int findMaxConsecutiveOnes(int[] nums) {
        int maxNoOfConsecutiveOnes = Integer.MIN_VALUE, currentCount = 0;
        int index = 0;
        while (index < nums.length){
            if (nums[index] == 0) {
                index++;
                maxNoOfConsecutiveOnes = Math.max(currentCount, maxNoOfConsecutiveOnes);
                currentCount = 0;
            }
            else {
                currentCount++;
                index++;
            }
        }
        return maxNoOfConsecutiveOnes;
    }
//    public void rotate(int[] nums, int k) {
//        k = k % nums.length;
//        for (int i = 0; i < k; i++) {
//            int last = nums[nums.length -1];
//            for (int j = nums.length-2; j >=0; j--) {
//                nums[j+1] = nums[j];
//            }
//            nums[0] = last;
//        }
//    }

    public void rotate(int[] nums, int k) {
        k = k%nums.length;
        reverse(nums, 0, nums.length-1-k);
        reverse(nums, nums.length-k, nums.length-1);
        reverse(nums, 0, nums.length-1);
    }
    public void reverse (int[] array, int fromIndex, int tillIndex) {
        if (fromIndex < 0 || tillIndex >= array.length) return;
        int low =0, high = array.length-1;
        while (low<high){
            int temp = array[low];
            array[low] = array[high];
            array[high] = temp;
            high--;low++;
        }
    }

// Definition for a Node.
class Node {
    int val;
    Node next;
    Node random;

    public Node(int val) {
        this.val = val;
        this.next = null;
        this.random = null;
    }
}
class RandomListNode{
    int val;
    Node next;
    Node random;

    public RandomListNode(int val) {
        this.val = val;
        this.next = null;
        this.random = null;
    }
}



    public Node copyRandomList(Node head) {
//        if (head == null) return head;

//        Node current = head;
//        Node dummy = new Node(0);
//        Node beforeHeadFor2ndList = dummy;
////        dummy.next = head;
//        while (current != null){
//            Node tempNode = new Node(current.val);
//            dummy.next = tempNode;
//            dummy = tempNode;
////            dummy.random = current.random;
//            current =current.next;
//        }
//        dummy = beforeHeadFor2ndList.next;
//        current = head;

 //       return beforeHeadFor2ndList.next;

        if (head == null) return head;
        Node current = head, dummyCurrent = head.next, deepCopyHead;

        while (current!= null){// Step 1 - insert deep copies.
            Node deepCopy = new Node(current.val);
            deepCopy.next = current.next;
            current.next =deepCopy;
            current = current.next.next;
        }
        current =head;
        deepCopyHead = head.next;
        // Step 2- assigning random pointers
        while (current != null){
            if (current.random == null) continue;
            dummyCurrent.random = current.random.next;
            dummyCurrent = dummyCurrent.next.next;
            current = current.next.next;
        }
        current =head;
        dummyCurrent = current.next;

        //step 3-
        while (current.next!= null){
            current.next = dummyCurrent.next;
            if (dummyCurrent.next == null) return deepCopyHead;
            dummyCurrent.next = current.next.next;
            dummyCurrent = dummyCurrent.next;
            current = current.next;
        }
        return deepCopyHead;
    }
    public int trap(int[] height) {

        int totalWater = 0, left = 0, right = height.length-1, maxLeft = 0, maxRight = 0;

        while (left<right){
            if (height[left] <= height[right]) {
                if (height[left] >= maxLeft) maxLeft = height[left];
                else totalWater = totalWater + maxLeft - height[left];
                left++;
            }else {
                if (height[right]>=maxRight) maxRight = height[right];
                else totalWater += maxRight - height[right];
                right--;
            }
        }
        return totalWater;
    }
    public int[] twoSum(int[] numbers, int target) {
        int [] result = new int[2];
        HashMap<Integer, Integer> hashMap = new HashMap<>();

        for (int i = 0; i < numbers.length - 1; i++) {
            hashMap.put(numbers[i], i);
        }
        for (int i = 0; i < numbers.length; i++) {
            int complement = target - numbers[i];
            if (hashMap.containsKey(complement)){
                result[0]= i;
                result[1]= hashMap.get(complement);
            }
        }
        System.out.println(hashMap);
        return result;
    }

//    public static void main(String[] args) {
//       Solution obj =new Solution();
//       int [] array = {1,5,5,6,7};
//       obj.twoSum(array,10);
//    }
//
//    public static void main(String[] args) {
//        int[] n = {-1,0,1,2,-1,-4,-2,-3,3,0,4};
//        Arrays.sort(n);
//        for (int i = 0; i < n.length-1; i++) {
//            System.out.print(n[i]+", ");
//        }
//    }

    public List<List<Integer>> threeSum(int[] nums) {//works
//        int lowPointer = 0, highPointer = nums.length-1;
        List<List<Integer>> list = new ArrayList<>();
        Arrays.sort(nums);

        for (int i = 0; i < nums.length-2; i++) {
           if (i == 0|| (nums[i] != nums[i-1])){
               int lowPointer = 0, highPointer = nums.length-1;
               int target = -nums[i];
               lowPointer = i+1;
               while (lowPointer<highPointer){
                   if(nums[lowPointer]+ nums[highPointer] == target){
                       list.add(Arrays.asList(nums[i], nums[lowPointer], nums[highPointer]));
                       while (lowPointer<highPointer&& nums[lowPointer+1] == nums[lowPointer]) lowPointer++;
                       while (lowPointer<highPointer&& nums[highPointer-1] == nums[highPointer]) highPointer--;
                       lowPointer++;highPointer--;
                   }
                   else if (nums[lowPointer]+ nums[highPointer]<target) lowPointer++;
                   else highPointer--;
               }
           }
        }
        return list;
    }

    public List<List<Integer>> fourSumown(int[] nums, int target) {
        Arrays.sort(nums);
        List<List<Integer>> list = new ArrayList<>();
        for (int i = 0; i < nums.length -1; i++) {
            for (int j = i+1; j < nums.length-1; j++) {
                int low = j+1, high = nums.length-1, sum = -(target - nums[i] - nums[j]);
                while (low<high){
                    if (nums[low]+nums[high] == sum) {
                        list.add(Arrays.asList(nums[i], nums[j], nums[low], nums[high]));
                        while (low<high && nums[low+1] == nums[low]) low++;
                        while (low<high && nums[high-1] == nums[high]) high--;low++;high--;
                    }
                    else if (nums[low]+ nums[high] >sum) high--;
                    else low++;
                }
               while (j<nums.length-2|| nums[j+1] ==  nums[j]) j++;
            }
            while (i<nums.length-2|| nums[i+1] ==  nums[i]) i++;
        }
        return list;
    }



    public List<List<Integer>> fourSum(int[] num, int target) {
        ArrayList<List<Integer>> res = new ArrayList<List<Integer>>();
        if (num == null || num.length == 0)
            return res;
        Arrays.sort(num);int n = num.length;
        for (int i = 0; i < n; i++) {
            int target_3 = target - num[i];
            for (int j = i + 1; j < n; j++) {
                int target_2 = target_3 - num[j];int front = j + 1;int back = n - 1;
                while(front < back) {
                    int two_sum = num[front] + num[back];
                    if (two_sum < target_2) front++;
                    else if (two_sum > target_2) back--;
                    else {
                        List<Integer> quad = new ArrayList<>();quad.add(num[i]);quad.add(num[j]);
                        quad.add(num[front]);quad.add(num[back]);res.add(quad);
                        while (front < back && num[front] == quad.get(2)) ++front;// Processing the duplicates of number 3
                        while (front < back && num[back] == quad.get(3)) --back;// Processing the duplicates of number 4
                    }
                }
                while(j + 1 < n && num[j + 1] == num[j]) ++j;// Processing the duplicates of number 2
            }
            while (i + 1 < n && num[i + 1] == num[i]) ++i;// Processing the duplicates of number 1
        }
        return res;
    }




    public boolean isPalindrome(int x) {
        if (x<0) return false;
        int rev =  reverse(x);
        if (rev== x) return true;
        else return false;

    }
    public int reverse (int x){
        long r = 0;
        while(x != 0){
            r = r*10 + x%10;
            x /= 10;
        }
        if(r >= Integer.MIN_VALUE && r <= Integer.MAX_VALUE)
            return (int)r;
        else
            return 0;
    }

//    public int mySqrt(int x) {
//
//        float squreRoot = 0;
//    }

    public int maximum69Number (int num) {

        long res = num;
        List<Integer> list = new ArrayList<>() ;
        while (num !=  0){
            list.add(num%10);
            num /= 10;
        }
//        reverse(list.toArray(), 1, list.size())



        return (int) res;
    }

    public ListNode removeElements(ListNode head, int val) {
        if (head == null) return null;

        ListNode itr = new ListNode(-1, head);
        ListNode beforeHead = itr;

        while (itr.next!=null){
            if (itr.next.next == null&& itr.next.val == val) {
                itr.next = null;
                return head;
            }
            while (itr.next.val == val){
                itr.next = itr.next.next;
            }
            itr = itr.next;
        }
        return beforeHead.next;
    }




















































}
class Node
{
    int data;
    Node next;
    Node bottom;

    Node(int d)
    {
        data = d;
        next = null;
        bottom = null;
    }
}


class GfG
{
    Node flatten(Node root)
    {
        if (root == null || root.next == null) return root;
        root.next = flatten(root.next);// to go till the last list
        return mergeTwoLinkedLists(root, root.next);
    }

    Node mergeTwoLinkedLists (Node l1, Node l2){
        Node temp = new Node(0);
        Node res = temp;

        while (l1!= null&& l2!= null){

            if (l1.data <= l2.data){
                temp.bottom = l1;
                temp = temp.bottom;
                l1 = l1.bottom;
            }
            else {
                temp.bottom = l2;
                temp = temp.bottom;
                l2 = l2.bottom;
            }
        }
        if (l1.bottom != null)temp.bottom = l1;
        else temp.bottom = l2;
        return res.bottom;
    }

}
class GfG1
{
    Node mergeTwoLists(Node a, Node b) {

        Node temp = new Node(0);
        Node res = temp;

        while(a != null && b != null) {
            if(a.data < b.data) {
                temp.bottom = a;
                temp = temp.bottom;
                a = a.bottom;
            }
            else {
                temp.bottom = b;
                temp = temp.bottom;
                b = b.bottom;
            }
        }

        if(a != null) temp.bottom = a;
        else temp.bottom = b;
        return res.bottom;

    }
    Node flatten(Node root)
    {

        if (root == null || root.next == null)
            return root;

        // recur for list on right
        root.next = flatten(root.next);

        // now merge
        root = mergeTwoLists(root, root.next);

        // return the root
        // it will be in turn merged with its left
        return root;
    }
}