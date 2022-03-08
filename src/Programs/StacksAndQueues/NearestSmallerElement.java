package Programs.StacksAndQueues;

import java.util.Stack;

public class NearestSmallerElement {


    public int[] prevSmaller(int[] array) {
        int arraySize = array.length;
        int[] ans = new int[arraySize];
        Stack<Integer> stack = new Stack<>();

        for (int i = 0; i < arraySize; i++) {
            while (!stack.isEmpty()&& stack.peek() > array[i]) stack.pop();
            if (stack.isEmpty()) ans[i] = -1;
            else ans[i] = stack.peek();
            stack.add(array[i]);
        }

        return ans;


    }
}
