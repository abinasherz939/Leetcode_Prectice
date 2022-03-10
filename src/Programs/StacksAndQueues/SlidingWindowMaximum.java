package Programs.StacksAndQueues;

import java.util.ArrayDeque;
import java.util.Deque;

public class SlidingWindowMaximum {


    public int[] maxSlidingWindow(int[] nums, int k) {

        Deque<Integer> doubllyLinkedList = new ArrayDeque<>();
        int[] max = new int[nums.length-k+1];
        int indexForMaxArray = 0;

        for (int index = 0; index <nums.length; index++) {

            if (!doubllyLinkedList.isEmpty() && doubllyLinkedList.peek() == index-k)
                doubllyLinkedList.pollFirst();

            while (!doubllyLinkedList.isEmpty()&& nums[index] > nums[doubllyLinkedList.peekLast()])
                doubllyLinkedList.pollLast();

            doubllyLinkedList.offerLast(index);

            if (index >= k-1) max[indexForMaxArray++] = nums[doubllyLinkedList.peek()];
        }
        return max;

    }
}
