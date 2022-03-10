package Programs.StacksAndQueues;

import java.util.Stack;

public class LargestRectangleInHistogram {
    public int largestRectangleArea(int[] heights) {
        int[] nextSmallerElement = nextSmallerElement(heights);
        int[] prevSmallerElement = prevSmallerElement(heights);

        int max = Integer.MIN_VALUE;
        for (int i = 0; i < heights.length; i++) {
            max = Math.max((nextSmallerElement[i]-prevSmallerElement[i] +1) * heights[i], max);
        }
        return max;
    }

    public int[] nextSmallerElement(int [] heights){
        Stack<Integer> stack = new Stack<>();
        int[] ans = new int[heights.length];
        for (int i = heights.length-1; i >=0; i--) {

            while (!stack.isEmpty()&& heights[stack.peek()]>= heights[i]) stack.pop();

            if (stack.isEmpty()) ans[i] = heights.length-1;//
            else ans[i] = stack.peek()-1;//

            stack.push(i);
        }
        return ans;
    }
    public int[] prevSmallerElement(int [] heights){
        Stack<Integer> stack = new Stack<>();
        int[] ans = new int[heights.length];
        for (int i = 0; i <= heights.length-1; i++) {

            while (!stack.isEmpty() && heights[stack.peek()] >= heights[i]) stack.pop();

            if (stack.isEmpty()) ans[i] = 0;
            else ans[i] = stack.peek()+1;

            stack.push(i);
        }
        return ans;
    }
}
